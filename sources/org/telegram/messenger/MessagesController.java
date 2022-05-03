package org.telegram.messenger;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.collection.LongSparseArray;
import androidx.core.util.Consumer;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChannelParticipant;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipant;
import org.telegram.tgnet.TLRPC$ChatParticipants;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$DialogPeer;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DraftMessage;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputChannel;
import org.telegram.tgnet.TLRPC$InputChatPhoto;
import org.telegram.tgnet.TLRPC$InputDialogPeer;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputPhoto;
import org.telegram.tgnet.TLRPC$InputUser;
import org.telegram.tgnet.TLRPC$JSONValue;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$MessageReplies;
import org.telegram.tgnet.TLRPC$NotificationSound;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$PeerNotifySettings;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$Poll;
import org.telegram.tgnet.TLRPC$RecentMeUrl;
import org.telegram.tgnet.TLRPC$ReportReason;
import org.telegram.tgnet.TLRPC$SendMessageAction;
import org.telegram.tgnet.TLRPC$TL_account_createTheme;
import org.telegram.tgnet.TLRPC$TL_account_getNotifySettings;
import org.telegram.tgnet.TLRPC$TL_account_installTheme;
import org.telegram.tgnet.TLRPC$TL_account_installWallPaper;
import org.telegram.tgnet.TLRPC$TL_account_registerDevice;
import org.telegram.tgnet.TLRPC$TL_account_reportPeer;
import org.telegram.tgnet.TLRPC$TL_account_saveTheme;
import org.telegram.tgnet.TLRPC$TL_account_unregisterDevice;
import org.telegram.tgnet.TLRPC$TL_account_updateStatus;
import org.telegram.tgnet.TLRPC$TL_account_updateTheme;
import org.telegram.tgnet.TLRPC$TL_account_uploadTheme;
import org.telegram.tgnet.TLRPC$TL_account_uploadWallPaper;
import org.telegram.tgnet.TLRPC$TL_auth_loggedOut;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_botInfo;
import org.telegram.tgnet.TLRPC$TL_channel;
import org.telegram.tgnet.TLRPC$TL_channelForbidden;
import org.telegram.tgnet.TLRPC$TL_channelFull;
import org.telegram.tgnet.TLRPC$TL_channelParticipantSelf;
import org.telegram.tgnet.TLRPC$TL_channelParticipantsAdmins;
import org.telegram.tgnet.TLRPC$TL_channelParticipantsRecent;
import org.telegram.tgnet.TLRPC$TL_channels_channelParticipant;
import org.telegram.tgnet.TLRPC$TL_channels_channelParticipants;
import org.telegram.tgnet.TLRPC$TL_channels_convertToGigagroup;
import org.telegram.tgnet.TLRPC$TL_channels_createChannel;
import org.telegram.tgnet.TLRPC$TL_channels_deleteChannel;
import org.telegram.tgnet.TLRPC$TL_channels_deleteMessages;
import org.telegram.tgnet.TLRPC$TL_channels_deleteParticipantHistory;
import org.telegram.tgnet.TLRPC$TL_channels_editAdmin;
import org.telegram.tgnet.TLRPC$TL_channels_editBanned;
import org.telegram.tgnet.TLRPC$TL_channels_editPhoto;
import org.telegram.tgnet.TLRPC$TL_channels_editTitle;
import org.telegram.tgnet.TLRPC$TL_channels_getChannels;
import org.telegram.tgnet.TLRPC$TL_channels_getMessages;
import org.telegram.tgnet.TLRPC$TL_channels_getParticipant;
import org.telegram.tgnet.TLRPC$TL_channels_getParticipants;
import org.telegram.tgnet.TLRPC$TL_channels_getSendAs;
import org.telegram.tgnet.TLRPC$TL_channels_getSponsoredMessages;
import org.telegram.tgnet.TLRPC$TL_channels_inviteToChannel;
import org.telegram.tgnet.TLRPC$TL_channels_joinChannel;
import org.telegram.tgnet.TLRPC$TL_channels_leaveChannel;
import org.telegram.tgnet.TLRPC$TL_channels_readHistory;
import org.telegram.tgnet.TLRPC$TL_channels_readMessageContents;
import org.telegram.tgnet.TLRPC$TL_channels_sendAsPeers;
import org.telegram.tgnet.TLRPC$TL_channels_togglePreHistoryHidden;
import org.telegram.tgnet.TLRPC$TL_channels_toggleSignatures;
import org.telegram.tgnet.TLRPC$TL_channels_toggleSlowMode;
import org.telegram.tgnet.TLRPC$TL_channels_updateUsername;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_chatFull;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_chatOnlines;
import org.telegram.tgnet.TLRPC$TL_config;
import org.telegram.tgnet.TLRPC$TL_contacts_block;
import org.telegram.tgnet.TLRPC$TL_contacts_getBlocked;
import org.telegram.tgnet.TLRPC$TL_contacts_resolvedPeer;
import org.telegram.tgnet.TLRPC$TL_contacts_unblock;
import org.telegram.tgnet.TLRPC$TL_dialog;
import org.telegram.tgnet.TLRPC$TL_dialogFilterSuggested;
import org.telegram.tgnet.TLRPC$TL_dialogFolder;
import org.telegram.tgnet.TLRPC$TL_dialogPeer;
import org.telegram.tgnet.TLRPC$TL_documentEmpty;
import org.telegram.tgnet.TLRPC$TL_draftMessage;
import org.telegram.tgnet.TLRPC$TL_encryptedChat;
import org.telegram.tgnet.TLRPC$TL_encryptedChatRequested;
import org.telegram.tgnet.TLRPC$TL_encryptedChatWaiting;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_folder;
import org.telegram.tgnet.TLRPC$TL_folderPeer;
import org.telegram.tgnet.TLRPC$TL_groupCallDiscarded;
import org.telegram.tgnet.TLRPC$TL_help_dismissSuggestion;
import org.telegram.tgnet.TLRPC$TL_help_getAppChangelog;
import org.telegram.tgnet.TLRPC$TL_help_getRecentMeUrls;
import org.telegram.tgnet.TLRPC$TL_help_hidePromoData;
import org.telegram.tgnet.TLRPC$TL_help_promoData;
import org.telegram.tgnet.TLRPC$TL_help_recentMeUrls;
import org.telegram.tgnet.TLRPC$TL_help_termsOfServiceUpdate;
import org.telegram.tgnet.TLRPC$TL_help_termsOfServiceUpdateEmpty;
import org.telegram.tgnet.TLRPC$TL_inputChannel;
import org.telegram.tgnet.TLRPC$TL_inputChannelEmpty;
import org.telegram.tgnet.TLRPC$TL_inputChatPhoto;
import org.telegram.tgnet.TLRPC$TL_inputChatUploadedPhoto;
import org.telegram.tgnet.TLRPC$TL_inputDialogPeer;
import org.telegram.tgnet.TLRPC$TL_inputDocument;
import org.telegram.tgnet.TLRPC$TL_inputEncryptedChat;
import org.telegram.tgnet.TLRPC$TL_inputGeoPoint;
import org.telegram.tgnet.TLRPC$TL_inputGroupCall;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterChatPhotos;
import org.telegram.tgnet.TLRPC$TL_inputNotifyBroadcasts;
import org.telegram.tgnet.TLRPC$TL_inputNotifyChats;
import org.telegram.tgnet.TLRPC$TL_inputNotifyUsers;
import org.telegram.tgnet.TLRPC$TL_inputPeerChannel;
import org.telegram.tgnet.TLRPC$TL_inputPeerChat;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_inputPeerSelf;
import org.telegram.tgnet.TLRPC$TL_inputPeerUser;
import org.telegram.tgnet.TLRPC$TL_inputPhotoEmpty;
import org.telegram.tgnet.TLRPC$TL_inputTheme;
import org.telegram.tgnet.TLRPC$TL_inputThemeSettings;
import org.telegram.tgnet.TLRPC$TL_inputUser;
import org.telegram.tgnet.TLRPC$TL_inputUserEmpty;
import org.telegram.tgnet.TLRPC$TL_inputUserSelf;
import org.telegram.tgnet.TLRPC$TL_inputWallPaperNoFile;
import org.telegram.tgnet.TLRPC$TL_inputWallPaperSlug;
import org.telegram.tgnet.TLRPC$TL_jsonArray;
import org.telegram.tgnet.TLRPC$TL_jsonBool;
import org.telegram.tgnet.TLRPC$TL_jsonNumber;
import org.telegram.tgnet.TLRPC$TL_jsonObject;
import org.telegram.tgnet.TLRPC$TL_jsonObjectValue;
import org.telegram.tgnet.TLRPC$TL_jsonString;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageActionChatAddUser;
import org.telegram.tgnet.TLRPC$TL_messageActionChatEditPhoto;
import org.telegram.tgnet.TLRPC$TL_messageActionChatJoinedByRequest;
import org.telegram.tgnet.TLRPC$TL_messageMediaPoll;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_messageService;
import org.telegram.tgnet.TLRPC$TL_messageViews;
import org.telegram.tgnet.TLRPC$TL_messages_addChatUser;
import org.telegram.tgnet.TLRPC$TL_messages_affectedHistory;
import org.telegram.tgnet.TLRPC$TL_messages_affectedMessages;
import org.telegram.tgnet.TLRPC$TL_messages_chatFull;
import org.telegram.tgnet.TLRPC$TL_messages_chats;
import org.telegram.tgnet.TLRPC$TL_messages_createChat;
import org.telegram.tgnet.TLRPC$TL_messages_deleteChat;
import org.telegram.tgnet.TLRPC$TL_messages_deleteChatUser;
import org.telegram.tgnet.TLRPC$TL_messages_deleteHistory;
import org.telegram.tgnet.TLRPC$TL_messages_deleteMessages;
import org.telegram.tgnet.TLRPC$TL_messages_deleteScheduledMessages;
import org.telegram.tgnet.TLRPC$TL_messages_dialogs;
import org.telegram.tgnet.TLRPC$TL_messages_editChatAbout;
import org.telegram.tgnet.TLRPC$TL_messages_editChatAdmin;
import org.telegram.tgnet.TLRPC$TL_messages_editChatDefaultBannedRights;
import org.telegram.tgnet.TLRPC$TL_messages_editChatPhoto;
import org.telegram.tgnet.TLRPC$TL_messages_editChatTitle;
import org.telegram.tgnet.TLRPC$TL_messages_getChats;
import org.telegram.tgnet.TLRPC$TL_messages_getDialogs;
import org.telegram.tgnet.TLRPC$TL_messages_getHistory;
import org.telegram.tgnet.TLRPC$TL_messages_getMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getMessagesReactions;
import org.telegram.tgnet.TLRPC$TL_messages_getMessagesViews;
import org.telegram.tgnet.TLRPC$TL_messages_getOnlines;
import org.telegram.tgnet.TLRPC$TL_messages_getPeerDialogs;
import org.telegram.tgnet.TLRPC$TL_messages_getPeerSettings;
import org.telegram.tgnet.TLRPC$TL_messages_getPinnedDialogs;
import org.telegram.tgnet.TLRPC$TL_messages_getReplies;
import org.telegram.tgnet.TLRPC$TL_messages_getScheduledHistory;
import org.telegram.tgnet.TLRPC$TL_messages_getUnreadMentions;
import org.telegram.tgnet.TLRPC$TL_messages_getWebPagePreview;
import org.telegram.tgnet.TLRPC$TL_messages_hidePeerSettingsBar;
import org.telegram.tgnet.TLRPC$TL_messages_markDialogUnread;
import org.telegram.tgnet.TLRPC$TL_messages_messageViews;
import org.telegram.tgnet.TLRPC$TL_messages_messages;
import org.telegram.tgnet.TLRPC$TL_messages_messagesNotModified;
import org.telegram.tgnet.TLRPC$TL_messages_migrateChat;
import org.telegram.tgnet.TLRPC$TL_messages_peerDialogs;
import org.telegram.tgnet.TLRPC$TL_messages_peerSettings;
import org.telegram.tgnet.TLRPC$TL_messages_readDiscussion;
import org.telegram.tgnet.TLRPC$TL_messages_readEncryptedHistory;
import org.telegram.tgnet.TLRPC$TL_messages_readHistory;
import org.telegram.tgnet.TLRPC$TL_messages_readMentions;
import org.telegram.tgnet.TLRPC$TL_messages_readMessageContents;
import org.telegram.tgnet.TLRPC$TL_messages_readReactions;
import org.telegram.tgnet.TLRPC$TL_messages_reorderPinnedDialogs;
import org.telegram.tgnet.TLRPC$TL_messages_reportEncryptedSpam;
import org.telegram.tgnet.TLRPC$TL_messages_reportSpam;
import org.telegram.tgnet.TLRPC$TL_messages_saveDefaultSendAs;
import org.telegram.tgnet.TLRPC$TL_messages_saveGif;
import org.telegram.tgnet.TLRPC$TL_messages_saveRecentSticker;
import org.telegram.tgnet.TLRPC$TL_messages_search;
import org.telegram.tgnet.TLRPC$TL_messages_setChatAvailableReactions;
import org.telegram.tgnet.TLRPC$TL_messages_setEncryptedTyping;
import org.telegram.tgnet.TLRPC$TL_messages_setHistoryTTL;
import org.telegram.tgnet.TLRPC$TL_messages_setTyping;
import org.telegram.tgnet.TLRPC$TL_messages_sponsoredMessages;
import org.telegram.tgnet.TLRPC$TL_messages_startBot;
import org.telegram.tgnet.TLRPC$TL_messages_toggleDialogPin;
import org.telegram.tgnet.TLRPC$TL_messages_toggleNoForwards;
import org.telegram.tgnet.TLRPC$TL_messages_unpinAllMessages;
import org.telegram.tgnet.TLRPC$TL_messages_updatePinnedMessage;
import org.telegram.tgnet.TLRPC$TL_notificationSoundDefault;
import org.telegram.tgnet.TLRPC$TL_notificationSoundLocal;
import org.telegram.tgnet.TLRPC$TL_notificationSoundNone;
import org.telegram.tgnet.TLRPC$TL_notificationSoundRingtone;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$TL_peerChat;
import org.telegram.tgnet.TLRPC$TL_peerNotifySettings;
import org.telegram.tgnet.TLRPC$TL_peerSettings;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_phone_getGroupCall;
import org.telegram.tgnet.TLRPC$TL_phone_groupCall;
import org.telegram.tgnet.TLRPC$TL_photo;
import org.telegram.tgnet.TLRPC$TL_photoEmpty;
import org.telegram.tgnet.TLRPC$TL_photos_deletePhotos;
import org.telegram.tgnet.TLRPC$TL_photos_getUserPhotos;
import org.telegram.tgnet.TLRPC$TL_photos_photo;
import org.telegram.tgnet.TLRPC$TL_photos_photos;
import org.telegram.tgnet.TLRPC$TL_photos_updateProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_photos_uploadProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_restrictionReason;
import org.telegram.tgnet.TLRPC$TL_sendMessageCancelAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageChooseContactAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageChooseStickerAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageEmojiInteraction;
import org.telegram.tgnet.TLRPC$TL_sendMessageEmojiInteractionSeen;
import org.telegram.tgnet.TLRPC$TL_sendMessageGamePlayAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageGeoLocationAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageRecordAudioAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageRecordRoundAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageRecordVideoAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageTypingAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageUploadAudioAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageUploadDocumentAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageUploadPhotoAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageUploadRoundAction;
import org.telegram.tgnet.TLRPC$TL_sendMessageUploadVideoAction;
import org.telegram.tgnet.TLRPC$TL_sponsoredMessage;
import org.telegram.tgnet.TLRPC$TL_theme;
import org.telegram.tgnet.TLRPC$TL_updateChannel;
import org.telegram.tgnet.TLRPC$TL_updateChannelAvailableMessages;
import org.telegram.tgnet.TLRPC$TL_updateChannelMessageForwards;
import org.telegram.tgnet.TLRPC$TL_updateChannelMessageViews;
import org.telegram.tgnet.TLRPC$TL_updateChannelReadMessagesContents;
import org.telegram.tgnet.TLRPC$TL_updateChannelTooLong;
import org.telegram.tgnet.TLRPC$TL_updateChannelUserTyping;
import org.telegram.tgnet.TLRPC$TL_updateChannelWebPage;
import org.telegram.tgnet.TLRPC$TL_updateChatUserTyping;
import org.telegram.tgnet.TLRPC$TL_updateDeleteChannelMessages;
import org.telegram.tgnet.TLRPC$TL_updateDeleteMessages;
import org.telegram.tgnet.TLRPC$TL_updateEditChannelMessage;
import org.telegram.tgnet.TLRPC$TL_updateEditMessage;
import org.telegram.tgnet.TLRPC$TL_updateFolderPeers;
import org.telegram.tgnet.TLRPC$TL_updateLangPack;
import org.telegram.tgnet.TLRPC$TL_updateMessageID;
import org.telegram.tgnet.TLRPC$TL_updateMessagePoll;
import org.telegram.tgnet.TLRPC$TL_updateMessageReactions;
import org.telegram.tgnet.TLRPC$TL_updateNewChannelMessage;
import org.telegram.tgnet.TLRPC$TL_updateNewEncryptedMessage;
import org.telegram.tgnet.TLRPC$TL_updateNewMessage;
import org.telegram.tgnet.TLRPC$TL_updatePeerBlocked;
import org.telegram.tgnet.TLRPC$TL_updatePinnedChannelMessages;
import org.telegram.tgnet.TLRPC$TL_updatePinnedMessages;
import org.telegram.tgnet.TLRPC$TL_updateReadChannelDiscussionInbox;
import org.telegram.tgnet.TLRPC$TL_updateReadChannelDiscussionOutbox;
import org.telegram.tgnet.TLRPC$TL_updateReadChannelInbox;
import org.telegram.tgnet.TLRPC$TL_updateReadChannelOutbox;
import org.telegram.tgnet.TLRPC$TL_updateReadHistoryInbox;
import org.telegram.tgnet.TLRPC$TL_updateReadHistoryOutbox;
import org.telegram.tgnet.TLRPC$TL_updateReadMessagesContents;
import org.telegram.tgnet.TLRPC$TL_updateServiceNotification;
import org.telegram.tgnet.TLRPC$TL_updateUserTyping;
import org.telegram.tgnet.TLRPC$TL_updateWebPage;
import org.telegram.tgnet.TLRPC$TL_updatesCombined;
import org.telegram.tgnet.TLRPC$TL_updates_differenceSlice;
import org.telegram.tgnet.TLRPC$TL_updates_differenceTooLong;
import org.telegram.tgnet.TLRPC$TL_updates_getDifference;
import org.telegram.tgnet.TLRPC$TL_updates_state;
import org.telegram.tgnet.TLRPC$TL_userForeign_old2;
import org.telegram.tgnet.TLRPC$TL_userProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_userProfilePhotoEmpty;
import org.telegram.tgnet.TLRPC$TL_users_getFullUser;
import org.telegram.tgnet.TLRPC$TL_users_getUsers;
import org.telegram.tgnet.TLRPC$TL_users_userFull;
import org.telegram.tgnet.TLRPC$TL_wallPaperSettings;
import org.telegram.tgnet.TLRPC$TL_webPage;
import org.telegram.tgnet.TLRPC$TL_webPageEmpty;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$UserStatus;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.tgnet.TLRPC$WallPaperSettings;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.TLRPC$contacts_Blocked;
import org.telegram.tgnet.TLRPC$messages_Dialogs;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.tgnet.TLRPC$photos_Photos;
import org.telegram.tgnet.TLRPC$updates_ChannelDifference;
import org.telegram.tgnet.TLRPC$updates_Difference;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatRightsEditActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public class MessagesController extends BaseController implements NotificationCenter.NotificationCenterDelegate {
    public static int DIALOG_FILTER_FLAG_BOTS = 16;
    public static int DIALOG_FILTER_FLAG_CHANNELS = 8;
    public static int DIALOG_FILTER_FLAG_CONTACTS = 1;
    public static int DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED = 128;
    public static int DIALOG_FILTER_FLAG_EXCLUDE_MUTED = 32;
    public static int DIALOG_FILTER_FLAG_EXCLUDE_READ = 64;
    public static int DIALOG_FILTER_FLAG_GROUPS = 4;
    public static int DIALOG_FILTER_FLAG_NON_CONTACTS = 2;
    public static int DIALOG_FILTER_FLAG_ONLY_ARCHIVED = 256;
    public static int PROMO_TYPE_OTHER = 2;
    public static int PROMO_TYPE_PROXY = 0;
    public static int PROMO_TYPE_PSA = 1;
    public static int UPDATE_MASK_AVATAR = 2;
    public static int UPDATE_MASK_CHAT = 8192;
    public static int UPDATE_MASK_CHAT_AVATAR = 8;
    public static int UPDATE_MASK_CHAT_MEMBERS = 32;
    public static int UPDATE_MASK_CHAT_NAME = 16;
    public static int UPDATE_MASK_CHECK = 65536;
    public static int UPDATE_MASK_EMOJI_INTERACTIONS = 262144;
    public static int UPDATE_MASK_MESSAGE_TEXT = 32768;
    public static int UPDATE_MASK_NAME = 1;
    public static int UPDATE_MASK_NEW_MESSAGE = 2048;
    public static int UPDATE_MASK_PHONE = 1024;
    public static int UPDATE_MASK_READ_DIALOG_MESSAGE = 256;
    public static int UPDATE_MASK_REORDER = 131072;
    public static int UPDATE_MASK_SELECT_DIALOG = 512;
    public static int UPDATE_MASK_SEND_STATE = 4096;
    public static int UPDATE_MASK_STATUS = 4;
    public static int UPDATE_MASK_USER_PHONE = 128;
    public static int UPDATE_MASK_USER_PRINT = 64;
    private static volatile long lastPasswordCheckTime;
    private static volatile long lastThemeCheckTime;
    public float animatedEmojisZoom;
    public Set<String> authDomains;
    public boolean autoarchiveAvailable;
    public Set<String> autologinDomains;
    public String autologinToken;
    public int availableMapProviders;
    public boolean backgroundConnection;
    public boolean blockedCountry;
    public boolean blockedEndReached;
    public int callConnectTimeout;
    public int callPacketTimeout;
    public int callReceiveTimeout;
    public int callRingTimeout;
    public boolean canRevokePmInbox;
    public int chatReadMarkExpirePeriod;
    public int chatReadMarkSizeThreshold;
    private boolean checkingPromoInfo;
    private int checkingPromoInfoRequestId;
    private boolean checkingTosUpdate;
    private Runnable currentDeleteTaskRunnable;
    private LongSparseArray<ArrayList<Integer>> currentDeletingTaskMediaMids;
    private LongSparseArray<ArrayList<Integer>> currentDeletingTaskMids;
    private int currentDeletingTaskTime;
    public String dcDomainName;
    public boolean dialogFiltersLoaded;
    private boolean dialogsInTransaction;
    public boolean dialogsLoaded;
    public HashSet<String> diceEmojies;
    private SharedPreferences emojiPreferences;
    public boolean enableJoined;
    public Set<String> exportGroupUri;
    public Set<String> exportPrivateUri;
    public Set<String> exportUri;
    public TLRPC$WebPage faqWebPage;
    public boolean filtersEnabled;
    public boolean firstGettingTask;
    private boolean gettingAppChangelog;
    public boolean gettingDifference;
    private boolean gettingNewDeleteTask;
    public String gifSearchBot;
    public int groupCallVideoMaxParticipants;
    public volatile boolean ignoreSetOnline;
    public String imageSearchBot;
    private String installReferer;
    private boolean isLeftPromoChannel;
    public boolean keepAliveService;
    private int lastCheckPromoId;
    private int lastPrintingStringCount;
    private long lastPushRegisterSendTime;
    private long lastStatusUpdateTime;
    private long lastViewsCheckTime;
    public String linkPrefix;
    private boolean loadingAppConfig;
    private int loadingNotificationSettings;
    private boolean loadingNotificationSignUpSettings;
    private boolean loadingRemoteFilters;
    private boolean loadingSuggestedFilters;
    private boolean loadingUnreadDialogs;
    private SharedPreferences mainPreferences;
    public String mapKey;
    public int mapProvider;
    public int maxCaptionLength;
    public int maxEditTime;
    public int maxFaveStickersCount;
    public int maxFolderPinnedDialogsCount;
    public int maxGroupCount;
    public int maxMegagroupCount;
    public int maxMessageLength;
    public int maxPinnedDialogsCount;
    public int maxRecentGifsCount;
    public int maxRecentStickersCount;
    private boolean migratingDialogs;
    private int nextPromoInfoCheckTime;
    private int nextTosCheckTime;
    private SharedPreferences notificationsPreferences;
    private boolean offlineSent;
    public Set<String> pendingSuggestions;
    private int pollsToCheckSize;
    public boolean preloadFeaturedStickers;
    private TLRPC$Dialog promoDialog;
    private long promoDialogId;
    public int promoDialogType;
    public String promoPsaMessage;
    public String promoPsaType;
    private String proxyDialogAddress;
    public boolean qrLoginCamera;
    public int ratingDecay;
    public boolean registeringForPush;
    public boolean remoteConfigLoaded;
    private TLRPC$messages_Dialogs resetDialogsAll;
    private TLRPC$TL_messages_peerDialogs resetDialogsPinned;
    private boolean resetingDialogs;
    public int revokeTimeLimit;
    public int revokeTimePmLimit;
    public int ringtoneDurationMax;
    public int ringtoneSizeMax;
    public int roundAudioBitrate;
    public int roundVideoBitrate;
    public int roundVideoSize;
    public boolean saveGifsWithStickers;
    public int secretWebpagePreview;
    public boolean showFiltersTooltip;
    private DialogFilter sortingDialogFilter;
    private int statusRequest;
    private int statusSettingState;
    public boolean suggestStickersApiOnly;
    public String suggestedLangCode;
    public int unreadUnmutedDialogs;
    public int updateCheckDelay;
    private long updatesStartWaitTimePts;
    private long updatesStartWaitTimeQts;
    private long updatesStartWaitTimeSeq;
    public boolean updatingState;
    private String uploadingAvatar;
    private String uploadingWallpaper;
    private Theme.OverrideWallpaperInfo uploadingWallpaperInfo;
    public String venueSearchBot;
    public int webFileDatacenterId;
    public String youtubePipType;
    public static int UPDATE_MASK_ALL = ((((((((2 | 4) | 1) | 8) | 16) | 32) | 64) | ConnectionsManager.RequestFlagNeedQuickAck) | 256) | 1024;
    public static int DIALOG_FILTER_FLAG_ALL_CHATS = (((1 | 2) | 4) | 8) | 16;
    private static volatile MessagesController[] Instance = new MessagesController[3];
    private ConcurrentHashMap<Long, TLRPC$Chat> chats = new ConcurrentHashMap<>(100, 1.0f, 2);
    private ConcurrentHashMap<Integer, TLRPC$EncryptedChat> encryptedChats = new ConcurrentHashMap<>(10, 1.0f, 2);
    private ConcurrentHashMap<Long, TLRPC$User> users = new ConcurrentHashMap<>(100, 1.0f, 2);
    private ConcurrentHashMap<String, TLObject> objectsByUsernames = new ConcurrentHashMap<>(100, 1.0f, 2);
    private HashMap<Long, TLRPC$Chat> activeVoiceChatsMap = new HashMap<>();
    private ArrayList<Long> joiningToChannels = new ArrayList<>();
    private LongSparseArray<TLRPC$TL_chatInviteExported> exportedChats = new LongSparseArray<>();
    public ArrayList<TLRPC$RecentMeUrl> hintDialogs = new ArrayList<>();
    public SparseArray<ArrayList<TLRPC$Dialog>> dialogsByFolder = new SparseArray<>();
    protected ArrayList<TLRPC$Dialog> allDialogs = new ArrayList<>();
    public ArrayList<TLRPC$Dialog> dialogsForward = new ArrayList<>();
    public ArrayList<TLRPC$Dialog> dialogsServerOnly = new ArrayList<>();
    public ArrayList<TLRPC$Dialog> dialogsCanAddUsers = new ArrayList<>();
    public ArrayList<TLRPC$Dialog> dialogsMyChannels = new ArrayList<>();
    public ArrayList<TLRPC$Dialog> dialogsMyGroups = new ArrayList<>();
    public ArrayList<TLRPC$Dialog> dialogsChannelsOnly = new ArrayList<>();
    public ArrayList<TLRPC$Dialog> dialogsUsersOnly = new ArrayList<>();
    public ArrayList<TLRPC$Dialog> dialogsForBlock = new ArrayList<>();
    public ArrayList<TLRPC$Dialog> dialogsGroupsOnly = new ArrayList<>();
    public DialogFilter[] selectedDialogFilter = new DialogFilter[2];
    private int dialogsLoadedTillDate = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public ConcurrentHashMap<Long, Integer> dialogs_read_inbox_max = new ConcurrentHashMap<>(100, 1.0f, 2);
    public ConcurrentHashMap<Long, Integer> dialogs_read_outbox_max = new ConcurrentHashMap<>(100, 1.0f, 2);
    public LongSparseArray<TLRPC$Dialog> dialogs_dict = new LongSparseArray<>();
    public LongSparseArray<MessageObject> dialogMessage = new LongSparseArray<>();
    public LongSparseArray<MessageObject> dialogMessagesByRandomIds = new LongSparseArray<>();
    public LongSparseIntArray deletedHistory = new LongSparseIntArray();
    public SparseArray<MessageObject> dialogMessagesByIds = new SparseArray<>();
    public ConcurrentHashMap<Long, ConcurrentHashMap<Integer, ArrayList<PrintingUser>>> printingUsers = new ConcurrentHashMap<>(20, 1.0f, 2);
    public LongSparseArray<SparseArray<CharSequence>> printingStrings = new LongSparseArray<>();
    public LongSparseArray<SparseArray<Integer>> printingStringsTypes = new LongSparseArray<>();
    public LongSparseArray<SparseArray<Boolean>>[] sendingTypings = new LongSparseArray[12];
    public ConcurrentHashMap<Long, Integer> onlinePrivacy = new ConcurrentHashMap<>(20, 1.0f, 2);
    private LongSparseArray<Boolean> loadingPeerSettings = new LongSparseArray<>();
    private ArrayList<Long> createdDialogIds = new ArrayList<>();
    private ArrayList<Long> createdScheduledDialogIds = new ArrayList<>();
    private ArrayList<Long> createdDialogMainThreadIds = new ArrayList<>();
    private ArrayList<Long> visibleDialogMainThreadIds = new ArrayList<>();
    private ArrayList<Long> visibleScheduledDialogMainThreadIds = new ArrayList<>();
    private LongSparseIntArray shortPollChannels = new LongSparseIntArray();
    private LongSparseArray<ArrayList<Integer>> needShortPollChannels = new LongSparseArray<>();
    private LongSparseIntArray shortPollOnlines = new LongSparseIntArray();
    private LongSparseArray<ArrayList<Integer>> needShortPollOnlines = new LongSparseArray<>();
    private LongSparseArray<TLRPC$Dialog> deletingDialogs = new LongSparseArray<>();
    private LongSparseArray<TLRPC$Dialog> clearingHistoryDialogs = new LongSparseArray<>();
    public boolean loadingBlockedPeers = false;
    public LongSparseIntArray blockePeers = new LongSparseIntArray();
    public int totalBlockedCount = -1;
    private LongSparseArray<ArrayList<Integer>> channelViewsToSend = new LongSparseArray<>();
    private LongSparseArray<SparseArray<MessageObject>> pollsToCheck = new LongSparseArray<>();
    public ArrayList<DialogFilter> dialogFilters = new ArrayList<>();
    public SparseArray<DialogFilter> dialogFiltersById = new SparseArray<>();
    public ArrayList<TLRPC$TL_dialogFilterSuggested> suggestedFilters = new ArrayList<>();
    private LongSparseArray<ArrayList<TLRPC$Updates>> updatesQueueChannels = new LongSparseArray<>();
    private LongSparseLongArray updatesStartWaitTimeChannels = new LongSparseLongArray();
    private LongSparseIntArray channelsPts = new LongSparseIntArray();
    private LongSparseArray<Boolean> gettingDifferenceChannels = new LongSparseArray<>();
    private LongSparseArray<Boolean> gettingChatInviters = new LongSparseArray<>();
    private LongSparseArray<Boolean> gettingUnknownChannels = new LongSparseArray<>();
    private LongSparseArray<Boolean> gettingUnknownDialogs = new LongSparseArray<>();
    private LongSparseArray<Boolean> checkingLastMessagesDialogs = new LongSparseArray<>();
    private ArrayList<TLRPC$Updates> updatesQueueSeq = new ArrayList<>();
    private ArrayList<TLRPC$Updates> updatesQueuePts = new ArrayList<>();
    private ArrayList<TLRPC$Updates> updatesQueueQts = new ArrayList<>();
    private LongSparseArray<TLRPC$UserFull> fullUsers = new LongSparseArray<>();
    private LongSparseArray<TLRPC$ChatFull> fullChats = new LongSparseArray<>();
    private LongSparseArray<ChatObject.Call> groupCalls = new LongSparseArray<>();
    private LongSparseArray<ChatObject.Call> groupCallsByChatId = new LongSparseArray<>();
    private ArrayList<Long> loadingFullUsers = new ArrayList<>();
    private ArrayList<Long> loadedFullUsers = new ArrayList<>();
    private ArrayList<Long> loadingFullChats = new ArrayList<>();
    private ArrayList<Long> loadingGroupCalls = new ArrayList<>();
    private ArrayList<Long> loadingFullParticipants = new ArrayList<>();
    private ArrayList<Long> loadedFullParticipants = new ArrayList<>();
    private ArrayList<Long> loadedFullChats = new ArrayList<>();
    private LongSparseArray<LongSparseArray<TLRPC$ChannelParticipant>> channelAdmins = new LongSparseArray<>();
    private LongSparseIntArray loadingChannelAdmins = new LongSparseIntArray();
    private SparseIntArray migratedChats = new SparseIntArray();
    private LongSparseArray<SponsoredMessagesInfo> sponsoredMessages = new LongSparseArray<>();
    private LongSparseArray<SendAsPeersInfo> sendAsPeers = new LongSparseArray<>();
    private HashMap<String, ArrayList<MessageObject>> reloadingWebpages = new HashMap<>();
    private LongSparseArray<ArrayList<MessageObject>> reloadingWebpagesPending = new LongSparseArray<>();
    private HashMap<String, ArrayList<MessageObject>> reloadingScheduledWebpages = new HashMap<>();
    private LongSparseArray<ArrayList<MessageObject>> reloadingScheduledWebpagesPending = new LongSparseArray<>();
    private LongSparseArray<Long> lastScheduledServerQueryTime = new LongSparseArray<>();
    private LongSparseArray<Long> lastServerQueryTime = new LongSparseArray<>();
    private LongSparseArray<ArrayList<Integer>> reloadingMessages = new LongSparseArray<>();
    private ArrayList<ReadTask> readTasks = new ArrayList<>();
    private LongSparseArray<ReadTask> readTasksMap = new LongSparseArray<>();
    private ArrayList<ReadTask> repliesReadTasks = new ArrayList<>();
    private HashMap<String, ReadTask> threadsReadTasksMap = new HashMap<>();
    private SparseIntArray nextDialogsCacheOffset = new SparseIntArray();
    private SparseBooleanArray loadingDialogs = new SparseBooleanArray();
    private SparseBooleanArray dialogsEndReached = new SparseBooleanArray();
    private SparseBooleanArray serverDialogsEndReached = new SparseBooleanArray();
    private boolean getDifferenceFirstSync = true;
    private SparseIntArray loadingPinnedDialogs = new SparseIntArray();
    public ArrayList<FaqSearchResult> faqSearchArray = new ArrayList<>();
    public boolean suggestContacts = true;
    private Runnable themeCheckRunnable = MessagesController$$ExternalSyntheticLambda213.INSTANCE;
    private Runnable passwordCheckRunnable = new Runnable() {
        @Override
        public final void run() {
            MessagesController.this.lambda$new$0();
        }
    };
    private HashMap<String, Object> uploadingThemes = new HashMap<>();
    public int maxBroadcastCount = 100;
    public int minGroupConvertSize = 200;
    public ArrayList<String> gifSearchEmojies = new ArrayList<>();
    public HashMap<String, DiceFrameSuccess> diceSuccess = new HashMap<>();
    public HashMap<String, EmojiSound> emojiSounds = new HashMap<>();
    public HashMap<Long, ArrayList<TLRPC$TL_sendMessageEmojiInteraction>> emojiInteractions = new HashMap<>();
    private Comparator<TLRPC$Dialog> dialogDateComparator = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            int lambda$new$6;
            lambda$new$6 = MessagesController.this.lambda$new$6((TLRPC$Dialog) obj, (TLRPC$Dialog) obj2);
            return lambda$new$6;
        }
    };
    private Comparator<TLRPC$Dialog> dialogComparator = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            int lambda$new$7;
            lambda$new$7 = MessagesController.this.lambda$new$7((TLRPC$Dialog) obj, (TLRPC$Dialog) obj2);
            return lambda$new$7;
        }
    };
    private Comparator<TLRPC$Update> updatesComparator = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            int lambda$new$8;
            lambda$new$8 = MessagesController.this.lambda$new$8((TLRPC$Update) obj, (TLRPC$Update) obj2);
            return lambda$new$8;
        }
    };
    private int DIALOGS_LOAD_TYPE_CACHE = 1;
    private int DIALOGS_LOAD_TYPE_CHANNEL = 2;
    private int DIALOGS_LOAD_TYPE_UNKNOWN = 3;

    public interface IsInChatCheckedCallback {
        void run(boolean z, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, String str);
    }

    public interface MessagesLoadedCallback {
        void onError();

        void onMessagesLoaded(boolean z);
    }

    public static class PrintingUser {
        public TLRPC$SendMessageAction action;
        public long lastTime;
        public long userId;
    }

    public static void lambda$blockPeer$68(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$completeReadTask$194(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$completeReadTask$196(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$deleteParticipantFromChat$238(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$deleteUserPhoto$90(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$hidePeerSettingsBar$53(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$hidePromoDialog$105(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$installTheme$93(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$installTheme$94(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$markMentionMessageAsRead$190(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$markMentionsAsRead$198(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$markMessageContentAsRead$188(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$markReactionsAsRead$328(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$processUpdates$298(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$removeSuggestion$21(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$reportSpam$54(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$reportSpam$55(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$reportSpam$56(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$saveTheme$92(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$unblockPeer$85(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$unregistedPush$244(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void markSponsoredAsRead(long j, MessageObject messageObject) {
    }

    public void lambda$new$0() {
        getUserConfig().checkSavedPassword();
    }

    public void getNextReactionMention(final long j, final int i, final Consumer<Integer> consumer) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getNextReactionMention$5(j, consumer, i);
            }
        });
    }

    public void lambda$getNextReactionMention$5(long r8, final androidx.core.util.Consumer r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getNextReactionMention$5(long, androidx.core.util.Consumer, int):void");
    }

    public static void lambda$getNextReactionMention$1(Consumer consumer, int i) {
        consumer.accept(Integer.valueOf(i));
    }

    public static void lambda$getNextReactionMention$4(final Consumer consumer, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$getNextReactionMention$3(TLObject.this, tLRPC$TL_error, consumer);
            }
        });
    }

    public static void lambda$getNextReactionMention$3(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error, final Consumer consumer) {
        ArrayList<TLRPC$Message> arrayList;
        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
        final int i = 0;
        if (!(tLRPC$TL_error == null || tLRPC$messages_Messages == null || (arrayList = tLRPC$messages_Messages.messages) == null || arrayList.isEmpty())) {
            i = tLRPC$messages_Messages.messages.get(0).id;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$getNextReactionMention$2(Consumer.this, i);
            }
        });
    }

    public static void lambda$getNextReactionMention$2(Consumer consumer, int i) {
        consumer.accept(Integer.valueOf(i));
    }

    public class SponsoredMessagesInfo {
        private long loadTime;
        private boolean loading;
        private ArrayList<MessageObject> messages;

        private SponsoredMessagesInfo() {
            MessagesController.this = r1;
        }
    }

    public class SendAsPeersInfo {
        private long loadTime;
        private boolean loading;
        private TLRPC$TL_channels_sendAsPeers sendAsPeers;

        private SendAsPeersInfo() {
            MessagesController.this = r1;
        }
    }

    public static class FaqSearchResult {
        public int num;
        public String[] path;
        public String title;
        public String url;

        public FaqSearchResult(String str, String[] strArr, String str2) {
            this.title = str;
            this.path = strArr;
            this.url = str2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof FaqSearchResult)) {
                return false;
            }
            return this.title.equals(((FaqSearchResult) obj).title);
        }

        public String toString() {
            SerializedData serializedData = new SerializedData();
            serializedData.writeInt32(this.num);
            int i = 0;
            serializedData.writeInt32(0);
            serializedData.writeString(this.title);
            String[] strArr = this.path;
            serializedData.writeInt32(strArr != null ? strArr.length : 0);
            if (this.path != null) {
                while (true) {
                    String[] strArr2 = this.path;
                    if (i >= strArr2.length) {
                        break;
                    }
                    serializedData.writeString(strArr2[i]);
                    i++;
                }
            }
            serializedData.writeString(this.url);
            return Utilities.bytesToHex(serializedData.toByteArray());
        }
    }

    public static class EmojiSound {
        public long accessHash;
        public byte[] fileReference;
        public long id;

        public EmojiSound(long j, long j2, String str) {
            this.id = j;
            this.accessHash = j2;
            this.fileReference = Base64.decode(str, 8);
        }

        public EmojiSound(long j, long j2, byte[] bArr) {
            this.id = j;
            this.accessHash = j2;
            this.fileReference = bArr;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof EmojiSound)) {
                return false;
            }
            EmojiSound emojiSound = (EmojiSound) obj;
            return this.id == emojiSound.id && this.accessHash == emojiSound.accessHash && Arrays.equals(this.fileReference, emojiSound.fileReference);
        }
    }

    public void clearQueryTime() {
        this.lastServerQueryTime.clear();
        this.lastScheduledServerQueryTime.clear();
    }

    public static class DiceFrameSuccess {
        public int frame;
        public int num;

        public DiceFrameSuccess(int i, int i2) {
            this.frame = i;
            this.num = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof DiceFrameSuccess)) {
                return false;
            }
            DiceFrameSuccess diceFrameSuccess = (DiceFrameSuccess) obj;
            return this.frame == diceFrameSuccess.frame && this.num == diceFrameSuccess.num;
        }
    }

    public static class UserActionUpdatesSeq extends TLRPC$Updates {
        private UserActionUpdatesSeq() {
        }
    }

    public static class UserActionUpdatesPts extends TLRPC$Updates {
        private UserActionUpdatesPts() {
        }
    }

    public static class ReadTask {
        public long dialogId;
        public int maxDate;
        public int maxId;
        public long replyId;
        public long sendRequestTime;

        private ReadTask() {
        }
    }

    public static class DialogFilter {
        private static int dialogFilterPointer = 10;
        public int flags;
        public int id;
        public int localId;
        public String name;
        public int order;
        public volatile int pendingUnreadCount;
        public int unreadCount;
        public ArrayList<Long> alwaysShow = new ArrayList<>();
        public ArrayList<Long> neverShow = new ArrayList<>();
        public LongSparseIntArray pinnedDialogs = new LongSparseIntArray();
        public ArrayList<TLRPC$Dialog> dialogs = new ArrayList<>();

        public DialogFilter() {
            int i = dialogFilterPointer;
            dialogFilterPointer = i + 1;
            this.localId = i;
        }

        public boolean includesDialog(AccountInstance accountInstance, long j) {
            TLRPC$Dialog tLRPC$Dialog = accountInstance.getMessagesController().dialogs_dict.get(j);
            if (tLRPC$Dialog == null) {
                return false;
            }
            return includesDialog(accountInstance, j, tLRPC$Dialog);
        }

        public boolean includesDialog(AccountInstance accountInstance, long j, TLRPC$Dialog tLRPC$Dialog) {
            TLRPC$Chat chat;
            if (this.neverShow.contains(Long.valueOf(j))) {
                return false;
            }
            if (this.alwaysShow.contains(Long.valueOf(j))) {
                return true;
            }
            if (tLRPC$Dialog.folder_id != 0 && (this.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                return false;
            }
            MessagesController messagesController = accountInstance.getMessagesController();
            ContactsController contactsController = accountInstance.getContactsController();
            if (((this.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0 && messagesController.isDialogMuted(tLRPC$Dialog.id) && tLRPC$Dialog.unread_mentions_count == 0) || ((this.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && tLRPC$Dialog.unread_count == 0 && !tLRPC$Dialog.unread_mark && tLRPC$Dialog.unread_mentions_count == 0)) {
                return false;
            }
            if (j > 0) {
                TLRPC$User user = messagesController.getUser(Long.valueOf(j));
                if (user != null) {
                    if (!user.bot) {
                        if (user.self || user.contact || contactsController.isContact(j)) {
                            if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
                                return true;
                            }
                        } else if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
                            return true;
                        }
                    } else if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
                        return true;
                    }
                }
            } else if (j < 0 && (chat = messagesController.getChat(Long.valueOf(-j))) != null) {
                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                    if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
                        return true;
                    }
                } else if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean alwaysShow(int i, TLRPC$Dialog tLRPC$Dialog) {
            TLRPC$EncryptedChat encryptedChat;
            if (tLRPC$Dialog == null) {
                return false;
            }
            long j = tLRPC$Dialog.id;
            if (DialogObject.isEncryptedDialog(j) && (encryptedChat = MessagesController.getInstance(i).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)))) != null) {
                j = encryptedChat.user_id;
            }
            return this.alwaysShow.contains(Long.valueOf(j));
        }
    }

    public int lambda$new$6(TLRPC$Dialog tLRPC$Dialog, TLRPC$Dialog tLRPC$Dialog2) {
        int i = this.sortingDialogFilter.pinnedDialogs.get(tLRPC$Dialog.id, Integer.MIN_VALUE);
        int i2 = this.sortingDialogFilter.pinnedDialogs.get(tLRPC$Dialog2.id, Integer.MIN_VALUE);
        boolean z = tLRPC$Dialog instanceof TLRPC$TL_dialogFolder;
        if (z && !(tLRPC$Dialog2 instanceof TLRPC$TL_dialogFolder)) {
            return -1;
        }
        if (!z && (tLRPC$Dialog2 instanceof TLRPC$TL_dialogFolder)) {
            return 1;
        }
        if (i == Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
            return 1;
        }
        if (i != Integer.MIN_VALUE && i2 == Integer.MIN_VALUE) {
            return -1;
        }
        if (i == Integer.MIN_VALUE) {
            MediaDataController mediaDataController = getMediaDataController();
            long lastMessageOrDraftDate = DialogObject.getLastMessageOrDraftDate(tLRPC$Dialog, mediaDataController.getDraft(tLRPC$Dialog.id, 0));
            long lastMessageOrDraftDate2 = DialogObject.getLastMessageOrDraftDate(tLRPC$Dialog2, mediaDataController.getDraft(tLRPC$Dialog2.id, 0));
            if (lastMessageOrDraftDate < lastMessageOrDraftDate2) {
                return 1;
            }
            return lastMessageOrDraftDate > lastMessageOrDraftDate2 ? -1 : 0;
        } else if (i > i2) {
            return 1;
        } else {
            return i < i2 ? -1 : 0;
        }
    }

    public int lambda$new$7(TLRPC$Dialog tLRPC$Dialog, TLRPC$Dialog tLRPC$Dialog2) {
        boolean z = tLRPC$Dialog instanceof TLRPC$TL_dialogFolder;
        if (z && !(tLRPC$Dialog2 instanceof TLRPC$TL_dialogFolder)) {
            return -1;
        }
        if (!z && (tLRPC$Dialog2 instanceof TLRPC$TL_dialogFolder)) {
            return 1;
        }
        boolean z2 = tLRPC$Dialog.pinned;
        if (!z2 && tLRPC$Dialog2.pinned) {
            return 1;
        }
        if (z2 && !tLRPC$Dialog2.pinned) {
            return -1;
        }
        if (z2) {
            int i = tLRPC$Dialog.pinnedNum;
            int i2 = tLRPC$Dialog2.pinnedNum;
            if (i < i2) {
                return 1;
            }
            return i > i2 ? -1 : 0;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long lastMessageOrDraftDate = DialogObject.getLastMessageOrDraftDate(tLRPC$Dialog, mediaDataController.getDraft(tLRPC$Dialog.id, 0));
        long lastMessageOrDraftDate2 = DialogObject.getLastMessageOrDraftDate(tLRPC$Dialog2, mediaDataController.getDraft(tLRPC$Dialog2.id, 0));
        if (lastMessageOrDraftDate < lastMessageOrDraftDate2) {
            return 1;
        }
        return lastMessageOrDraftDate > lastMessageOrDraftDate2 ? -1 : 0;
    }

    public int lambda$new$8(TLRPC$Update tLRPC$Update, TLRPC$Update tLRPC$Update2) {
        int updateType = getUpdateType(tLRPC$Update);
        int updateType2 = getUpdateType(tLRPC$Update2);
        if (updateType != updateType2) {
            return AndroidUtilities.compare(updateType, updateType2);
        }
        if (updateType == 0) {
            return AndroidUtilities.compare(getUpdatePts(tLRPC$Update), getUpdatePts(tLRPC$Update2));
        }
        if (updateType == 1) {
            return AndroidUtilities.compare(getUpdateQts(tLRPC$Update), getUpdateQts(tLRPC$Update2));
        }
        if (updateType != 2) {
            return 0;
        }
        long updateChannelId = getUpdateChannelId(tLRPC$Update);
        long updateChannelId2 = getUpdateChannelId(tLRPC$Update2);
        if (updateChannelId == updateChannelId2) {
            return AndroidUtilities.compare(getUpdatePts(tLRPC$Update), getUpdatePts(tLRPC$Update2));
        }
        return AndroidUtilities.compare(updateChannelId, updateChannelId2);
    }

    public static MessagesController getInstance(int i) {
        MessagesController messagesController = Instance[i];
        if (messagesController == null) {
            synchronized (MessagesController.class) {
                messagesController = Instance[i];
                if (messagesController == null) {
                    MessagesController[] messagesControllerArr = Instance;
                    MessagesController messagesController2 = new MessagesController(i);
                    messagesControllerArr[i] = messagesController2;
                    messagesController = messagesController2;
                }
            }
        }
        return messagesController;
    }

    public static SharedPreferences getNotificationsSettings(int i) {
        return getInstance(i).notificationsPreferences;
    }

    public static SharedPreferences getGlobalNotificationsSettings() {
        return getInstance(0).notificationsPreferences;
    }

    public static SharedPreferences getMainSettings(int i) {
        return getInstance(i).mainPreferences;
    }

    public static SharedPreferences getGlobalMainSettings() {
        return getInstance(0).mainPreferences;
    }

    public static SharedPreferences getEmojiSettings(int i) {
        return getInstance(i).emojiPreferences;
    }

    public static SharedPreferences getGlobalEmojiSettings() {
        return getInstance(0).emojiPreferences;
    }

    public MessagesController(int i) {
        super(i);
        int i2 = 2;
        this.currentAccount = i;
        ImageLoader.getInstance();
        getMessagesStorage();
        getLocationController();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$new$9();
            }
        });
        addSupportUser();
        if (this.currentAccount == 0) {
            this.notificationsPreferences = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0);
            this.mainPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            this.emojiPreferences = ApplicationLoader.applicationContext.getSharedPreferences("emoji", 0);
        } else {
            Context context = ApplicationLoader.applicationContext;
            this.notificationsPreferences = context.getSharedPreferences("Notifications" + this.currentAccount, 0);
            Context context2 = ApplicationLoader.applicationContext;
            this.mainPreferences = context2.getSharedPreferences("mainconfig" + this.currentAccount, 0);
            Context context3 = ApplicationLoader.applicationContext;
            this.emojiPreferences = context3.getSharedPreferences("emoji" + this.currentAccount, 0);
        }
        this.enableJoined = this.notificationsPreferences.getBoolean("EnableContactJoined", true);
        this.remoteConfigLoaded = this.mainPreferences.getBoolean("remoteConfigLoaded", false);
        this.secretWebpagePreview = this.mainPreferences.getInt("secretWebpage2", 2);
        this.maxGroupCount = this.mainPreferences.getInt("maxGroupCount", 200);
        this.maxMegagroupCount = this.mainPreferences.getInt("maxMegagroupCount", 10000);
        this.maxRecentGifsCount = this.mainPreferences.getInt("maxRecentGifsCount", 200);
        this.maxRecentStickersCount = this.mainPreferences.getInt("maxRecentStickersCount", 30);
        this.maxFaveStickersCount = this.mainPreferences.getInt("maxFaveStickersCount", 5);
        this.maxEditTime = this.mainPreferences.getInt("maxEditTime", 3600);
        this.ratingDecay = this.mainPreferences.getInt("ratingDecay", 2419200);
        this.linkPrefix = this.mainPreferences.getString("linkPrefix", "t.me");
        this.callReceiveTimeout = this.mainPreferences.getInt("callReceiveTimeout", 20000);
        this.callRingTimeout = this.mainPreferences.getInt("callRingTimeout", 90000);
        this.callConnectTimeout = this.mainPreferences.getInt("callConnectTimeout", 30000);
        this.callPacketTimeout = this.mainPreferences.getInt("callPacketTimeout", 10000);
        this.updateCheckDelay = this.mainPreferences.getInt("updateCheckDelay", 86400);
        this.maxPinnedDialogsCount = this.mainPreferences.getInt("maxPinnedDialogsCount", 5);
        this.maxFolderPinnedDialogsCount = this.mainPreferences.getInt("maxFolderPinnedDialogsCount", 100);
        this.maxMessageLength = this.mainPreferences.getInt("maxMessageLength", 4096);
        this.maxCaptionLength = this.mainPreferences.getInt("maxCaptionLength", 1024);
        this.mapProvider = this.mainPreferences.getInt("mapProvider", 0);
        this.availableMapProviders = this.mainPreferences.getInt("availableMapProviders", 3);
        this.mapKey = this.mainPreferences.getString("pk", null);
        this.installReferer = this.mainPreferences.getString("installReferer", null);
        this.revokeTimeLimit = this.mainPreferences.getInt("revokeTimeLimit", this.revokeTimeLimit);
        this.revokeTimePmLimit = this.mainPreferences.getInt("revokeTimePmLimit", this.revokeTimePmLimit);
        this.canRevokePmInbox = this.mainPreferences.getBoolean("canRevokePmInbox", this.canRevokePmInbox);
        this.preloadFeaturedStickers = this.mainPreferences.getBoolean("preloadFeaturedStickers", false);
        this.youtubePipType = this.mainPreferences.getString("youtubePipType", "disabled");
        this.keepAliveService = this.mainPreferences.getBoolean("keepAliveService", false);
        this.backgroundConnection = this.mainPreferences.getBoolean("keepAliveService", false);
        this.promoDialogId = this.mainPreferences.getLong("proxy_dialog", 0L);
        this.nextPromoInfoCheckTime = this.mainPreferences.getInt("nextPromoInfoCheckTime", 0);
        this.promoDialogType = this.mainPreferences.getInt("promo_dialog_type", 0);
        this.promoPsaMessage = this.mainPreferences.getString("promo_psa_message", null);
        this.promoPsaType = this.mainPreferences.getString("promo_psa_type", null);
        this.proxyDialogAddress = this.mainPreferences.getString("proxyDialogAddress", null);
        this.nextTosCheckTime = this.notificationsPreferences.getInt("nextTosCheckTime", 0);
        this.venueSearchBot = this.mainPreferences.getString("venueSearchBot", "foursquare");
        this.gifSearchBot = this.mainPreferences.getString("gifSearchBot", "gif");
        this.imageSearchBot = this.mainPreferences.getString("imageSearchBot", "pic");
        this.blockedCountry = this.mainPreferences.getBoolean("blockedCountry", false);
        this.dcDomainName = this.mainPreferences.getString("dcDomainName2", ConnectionsManager.native_isTestBackend(this.currentAccount) != 0 ? "tapv3.stel.com" : "apv3.stel.com");
        this.webFileDatacenterId = this.mainPreferences.getInt("webFileDatacenterId", ConnectionsManager.native_isTestBackend(this.currentAccount) == 0 ? 4 : i2);
        this.suggestedLangCode = this.mainPreferences.getString("suggestedLangCode", "en");
        this.animatedEmojisZoom = this.mainPreferences.getFloat("animatedEmojisZoom", 0.625f);
        this.qrLoginCamera = this.mainPreferences.getBoolean("qrLoginCamera", false);
        this.saveGifsWithStickers = this.mainPreferences.getBoolean("saveGifsWithStickers", false);
        this.filtersEnabled = this.mainPreferences.getBoolean("filtersEnabled", false);
        this.showFiltersTooltip = this.mainPreferences.getBoolean("showFiltersTooltip", false);
        this.autoarchiveAvailable = this.mainPreferences.getBoolean("autoarchiveAvailable", false);
        this.groupCallVideoMaxParticipants = this.mainPreferences.getInt("groipCallVideoMaxParticipants", 30);
        this.chatReadMarkSizeThreshold = this.mainPreferences.getInt("chatReadMarkSizeThreshold", 100);
        this.chatReadMarkExpirePeriod = this.mainPreferences.getInt("chatReadMarkExpirePeriod", 604800);
        this.ringtoneDurationMax = this.mainPreferences.getInt("ringtoneDurationMax", 5);
        this.ringtoneSizeMax = this.mainPreferences.getInt("ringtoneSizeMax", 102400);
        this.chatReadMarkExpirePeriod = this.mainPreferences.getInt("chatReadMarkExpirePeriod", 604800);
        this.suggestStickersApiOnly = this.mainPreferences.getBoolean("suggestStickersApiOnly", false);
        this.roundVideoSize = this.mainPreferences.getInt("roundVideoSize", 384);
        this.roundVideoBitrate = this.mainPreferences.getInt("roundVideoBitrate", 1000);
        this.roundAudioBitrate = this.mainPreferences.getInt("roundAudioBitrate", 64);
        Set<String> stringSet = this.mainPreferences.getStringSet("pendingSuggestions", null);
        this.pendingSuggestions = stringSet;
        if (stringSet != null) {
            this.pendingSuggestions = new HashSet(this.pendingSuggestions);
        } else {
            this.pendingSuggestions = new HashSet();
        }
        Set<String> stringSet2 = this.mainPreferences.getStringSet("exportUri2", null);
        this.exportUri = stringSet2;
        if (stringSet2 != null) {
            this.exportUri = new HashSet(this.exportUri);
        } else {
            HashSet hashSet = new HashSet();
            this.exportUri = hashSet;
            hashSet.add("content://(\\d+@)?com\\.whatsapp\\.provider\\.media/export_chat/");
            this.exportUri.add("content://(\\d+@)?com\\.whatsapp\\.w4b\\.provider\\.media/export_chat/");
            this.exportUri.add("content://jp\\.naver\\.line\\.android\\.line\\.common\\.FileProvider/export-chat/");
            this.exportUri.add(".*WhatsApp.*\\.txt$");
        }
        Set<String> stringSet3 = this.mainPreferences.getStringSet("exportGroupUri", null);
        this.exportGroupUri = stringSet3;
        if (stringSet3 != null) {
            this.exportGroupUri = new HashSet(this.exportGroupUri);
        } else {
            HashSet hashSet2 = new HashSet();
            this.exportGroupUri = hashSet2;
            hashSet2.add("@g.us/");
        }
        Set<String> stringSet4 = this.mainPreferences.getStringSet("exportPrivateUri", null);
        this.exportPrivateUri = stringSet4;
        if (stringSet4 != null) {
            this.exportPrivateUri = new HashSet(this.exportPrivateUri);
        } else {
            HashSet hashSet3 = new HashSet();
            this.exportPrivateUri = hashSet3;
            hashSet3.add("@s.whatsapp.net/");
        }
        Set<String> stringSet5 = this.mainPreferences.getStringSet("autologinDomains", null);
        this.autologinDomains = stringSet5;
        if (stringSet5 != null) {
            this.autologinDomains = new HashSet(this.autologinDomains);
        } else {
            this.autologinDomains = new HashSet();
        }
        Set<String> stringSet6 = this.mainPreferences.getStringSet("authDomains", null);
        this.authDomains = stringSet6;
        if (stringSet6 != null) {
            this.authDomains = new HashSet(this.authDomains);
        } else {
            this.authDomains = new HashSet();
        }
        this.autologinToken = this.mainPreferences.getString("autologinToken", null);
        Set<String> stringSet7 = this.mainPreferences.getStringSet("diceEmojies", null);
        if (stringSet7 == null) {
            HashSet<String> hashSet4 = new HashSet<>();
            this.diceEmojies = hashSet4;
            hashSet4.add("🎲");
            this.diceEmojies.add("🎯");
        } else {
            this.diceEmojies = new HashSet<>(stringSet7);
        }
        String string = this.mainPreferences.getString("diceSuccess", null);
        if (string == null) {
            this.diceSuccess.put("🎯", new DiceFrameSuccess(62, 6));
        } else {
            try {
                byte[] decode = Base64.decode(string, 0);
                if (decode != null) {
                    SerializedData serializedData = new SerializedData(decode);
                    int readInt32 = serializedData.readInt32(true);
                    for (int i3 = 0; i3 < readInt32; i3++) {
                        this.diceSuccess.put(serializedData.readString(true), new DiceFrameSuccess(serializedData.readInt32(true), serializedData.readInt32(true)));
                    }
                    serializedData.cleanup();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        String string2 = this.mainPreferences.getString("emojiSounds", null);
        if (string2 != null) {
            try {
                byte[] decode2 = Base64.decode(string2, 0);
                if (decode2 != null) {
                    SerializedData serializedData2 = new SerializedData(decode2);
                    int readInt322 = serializedData2.readInt32(true);
                    for (int i4 = 0; i4 < readInt322; i4++) {
                        this.emojiSounds.put(serializedData2.readString(true), new EmojiSound(serializedData2.readInt64(true), serializedData2.readInt64(true), serializedData2.readByteArray(true)));
                    }
                    serializedData2.cleanup();
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        String string3 = this.mainPreferences.getString("gifSearchEmojies", null);
        if (string3 == null) {
            this.gifSearchEmojies.add("👍");
            this.gifSearchEmojies.add("👎");
            this.gifSearchEmojies.add("😍");
            this.gifSearchEmojies.add("😂");
            this.gifSearchEmojies.add("😮");
            this.gifSearchEmojies.add("🙄");
            this.gifSearchEmojies.add("😥");
            this.gifSearchEmojies.add("😡");
            this.gifSearchEmojies.add("\u1f973");
            this.gifSearchEmojies.add("😎");
            return;
        }
        try {
            byte[] decode3 = Base64.decode(string3, 0);
            if (decode3 != null) {
                SerializedData serializedData3 = new SerializedData(decode3);
                int readInt323 = serializedData3.readInt32(true);
                for (int i5 = 0; i5 < readInt323; i5++) {
                    this.gifSearchEmojies.add(serializedData3.readString(true));
                }
                serializedData3.cleanup();
            }
        } catch (Exception e3) {
            FileLog.e(e3);
        }
    }

    public void lambda$new$9() {
        MessagesController messagesController = getMessagesController();
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileUploaded);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileUploadFailed);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileLoaded);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileLoadFailed);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.messageReceivedByServer);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.updateMessageMedia);
    }

    private void sendLoadPeersRequest(final TLObject tLObject, final ArrayList<TLObject> arrayList, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, final ArrayList<TLRPC$User> arrayList2, final ArrayList<TLRPC$Chat> arrayList3, final ArrayList<DialogFilter> arrayList4, final SparseArray<DialogFilter> sparseArray, final ArrayList<Integer> arrayList5, final HashMap<Integer, HashSet<Long>> hashMap, final HashMap<Integer, HashSet<Long>> hashMap2, final HashSet<Integer> hashSet) {
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$sendLoadPeersRequest$10(arrayList3, arrayList2, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, tLObject, arrayList4, sparseArray, arrayList5, hashMap, hashMap2, hashSet, tLObject2, tLRPC$TL_error);
            }
        });
    }

    public void lambda$sendLoadPeersRequest$10(ArrayList arrayList, ArrayList arrayList2, TLRPC$messages_Dialogs tLRPC$messages_Dialogs, TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, ArrayList arrayList3, TLObject tLObject, ArrayList arrayList4, SparseArray sparseArray, ArrayList arrayList5, HashMap hashMap, HashMap hashMap2, HashSet hashSet, TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject2 instanceof TLRPC$TL_messages_chats) {
            arrayList.addAll(((TLRPC$TL_messages_chats) tLObject2).chats);
        } else if (tLObject2 instanceof TLRPC$Vector) {
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject2;
            int size = tLRPC$Vector.objects.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add((TLRPC$User) tLRPC$Vector.objects.get(i));
            }
        } else if (tLObject2 instanceof TLRPC$TL_messages_peerDialogs) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject2;
            tLRPC$messages_Dialogs.dialogs.addAll(tLRPC$TL_messages_peerDialogs.dialogs);
            tLRPC$messages_Dialogs.messages.addAll(tLRPC$TL_messages_peerDialogs.messages);
            tLRPC$messages_Dialogs2.dialogs.addAll(tLRPC$TL_messages_peerDialogs.dialogs);
            tLRPC$messages_Dialogs2.messages.addAll(tLRPC$TL_messages_peerDialogs.messages);
            arrayList2.addAll(tLRPC$TL_messages_peerDialogs.users);
            arrayList.addAll(tLRPC$TL_messages_peerDialogs.chats);
        }
        arrayList3.remove(tLObject);
        if (arrayList3.isEmpty()) {
            getMessagesStorage().processLoadedFilterPeers(tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList2, arrayList, arrayList4, sparseArray, arrayList5, hashMap, hashMap2, hashSet);
        }
    }

    public void loadFilterPeers(final HashMap<Long, TLRPC$InputPeer> hashMap, final HashMap<Long, TLRPC$InputPeer> hashMap2, final HashMap<Long, TLRPC$InputPeer> hashMap3, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, final ArrayList<TLRPC$User> arrayList, final ArrayList<TLRPC$Chat> arrayList2, final ArrayList<DialogFilter> arrayList3, final SparseArray<DialogFilter> sparseArray, final ArrayList<Integer> arrayList4, final HashMap<Integer, HashSet<Long>> hashMap4, final HashMap<Integer, HashSet<Long>> hashMap5, final HashSet<Integer> hashSet) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadFilterPeers$11(hashMap2, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap4, hashMap5, hashSet, hashMap3, hashMap);
            }
        });
    }

    public void lambda$loadFilterPeers$11(HashMap hashMap, TLRPC$messages_Dialogs tLRPC$messages_Dialogs, TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SparseArray sparseArray, ArrayList arrayList4, HashMap hashMap2, HashMap hashMap3, HashSet hashSet, HashMap hashMap4, HashMap hashMap5) {
        TLRPC$TL_users_getUsers tLRPC$TL_users_getUsers;
        int i;
        TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs;
        TLRPC$TL_messages_getChats tLRPC$TL_messages_getChats;
        TLRPC$TL_channels_getChannels tLRPC$TL_channels_getChannels;
        ArrayList<TLObject> arrayList5 = new ArrayList<>();
        loop0: while (true) {
            tLRPC$TL_users_getUsers = null;
            for (Map.Entry entry : hashMap.entrySet()) {
                if (tLRPC$TL_users_getUsers == null) {
                    tLRPC$TL_users_getUsers = new TLRPC$TL_users_getUsers();
                    arrayList5.add(tLRPC$TL_users_getUsers);
                }
                tLRPC$TL_users_getUsers.id.add(getInputUser((TLRPC$InputPeer) entry.getValue()));
                if (tLRPC$TL_users_getUsers.id.size() == 100) {
                    break;
                }
            }
            sendLoadPeersRequest(tLRPC$TL_users_getUsers, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashMap3, hashSet);
        }
        if (tLRPC$TL_users_getUsers != null) {
            i = 100;
            sendLoadPeersRequest(tLRPC$TL_users_getUsers, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashMap3, hashSet);
        } else {
            i = 100;
        }
        TLObject tLObject = null;
        TLObject tLObject2 = null;
        for (Map.Entry entry2 : hashMap4.entrySet()) {
            TLRPC$InputPeer tLRPC$InputPeer = (TLRPC$InputPeer) entry2.getValue();
            if (tLRPC$InputPeer.chat_id != 0) {
                if (tLObject == null) {
                    tLRPC$TL_messages_getChats = new TLRPC$TL_messages_getChats();
                    arrayList5.add(tLRPC$TL_messages_getChats);
                } else {
                    tLRPC$TL_messages_getChats = tLObject;
                }
                tLRPC$TL_messages_getChats.id.add((Long) entry2.getKey());
                if (tLRPC$TL_messages_getChats.id.size() == i) {
                    sendLoadPeersRequest(tLRPC$TL_messages_getChats, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashMap3, hashSet);
                    tLObject = null;
                } else {
                    tLObject = tLRPC$TL_messages_getChats;
                }
            } else if (tLRPC$InputPeer.channel_id != 0) {
                if (tLObject2 == null) {
                    TLObject tLRPC$TL_channels_getChannels2 = new TLRPC$TL_channels_getChannels();
                    arrayList5.add(tLRPC$TL_channels_getChannels2);
                    tLRPC$TL_channels_getChannels = tLRPC$TL_channels_getChannels2;
                } else {
                    tLRPC$TL_channels_getChannels = tLObject2;
                }
                tLRPC$TL_channels_getChannels.id.add(getInputChannel(tLRPC$InputPeer));
                if (tLRPC$TL_channels_getChannels.id.size() == i) {
                    sendLoadPeersRequest(tLRPC$TL_channels_getChannels, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashMap3, hashSet);
                    tLObject2 = null;
                } else {
                    tLObject2 = tLRPC$TL_channels_getChannels;
                }
            }
        }
        if (tLObject != null) {
            sendLoadPeersRequest(tLObject, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashMap3, hashSet);
        }
        if (tLObject2 != null) {
            sendLoadPeersRequest(tLObject2, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashMap3, hashSet);
        }
        loop3: while (true) {
            tLRPC$TL_messages_getPeerDialogs = null;
            for (Map.Entry entry3 : hashMap5.entrySet()) {
                if (tLRPC$TL_messages_getPeerDialogs == null) {
                    tLRPC$TL_messages_getPeerDialogs = new TLRPC$TL_messages_getPeerDialogs();
                    arrayList5.add(tLRPC$TL_messages_getPeerDialogs);
                }
                TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
                tLRPC$TL_inputDialogPeer.peer = (TLRPC$InputPeer) entry3.getValue();
                tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer);
                if (tLRPC$TL_messages_getPeerDialogs.peers.size() == i) {
                    break;
                }
            }
            sendLoadPeersRequest(tLRPC$TL_messages_getPeerDialogs, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashMap3, hashSet);
        }
        if (tLRPC$TL_messages_getPeerDialogs != null) {
            sendLoadPeersRequest(tLRPC$TL_messages_getPeerDialogs, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashMap3, hashSet);
        }
    }

    public void processLoadedDialogFilters(final ArrayList<DialogFilter> arrayList, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, final ArrayList<TLRPC$User> arrayList2, final ArrayList<TLRPC$Chat> arrayList3, final ArrayList<TLRPC$EncryptedChat> arrayList4, final int i) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedDialogFilters$14(tLRPC$messages_Dialogs, arrayList4, tLRPC$messages_Dialogs2, i, arrayList, arrayList2, arrayList3);
            }
        });
    }

    public void lambda$processLoadedDialogFilters$14(org.telegram.tgnet.TLRPC$messages_Dialogs r20, final java.util.ArrayList r21, final org.telegram.tgnet.TLRPC$messages_Dialogs r22, final int r23, final java.util.ArrayList r24, final java.util.ArrayList r25, final java.util.ArrayList r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processLoadedDialogFilters$14(org.telegram.tgnet.TLRPC$messages_Dialogs, java.util.ArrayList, org.telegram.tgnet.TLRPC$messages_Dialogs, int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void lambda$processLoadedDialogFilters$13(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, TLRPC$messages_Dialogs tLRPC$messages_Dialogs, ArrayList arrayList4, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        if (i != 2) {
            this.dialogFilters = arrayList;
            this.dialogFiltersById.clear();
            int size = this.dialogFilters.size();
            for (int i2 = 0; i2 < size; i2++) {
                DialogFilter dialogFilter = this.dialogFilters.get(i2);
                this.dialogFiltersById.put(dialogFilter.id, dialogFilter);
            }
            Collections.sort(this.dialogFilters, MessagesController$$ExternalSyntheticLambda218.INSTANCE);
            putUsers(arrayList2, true);
            putChats(arrayList3, true);
            this.dialogFiltersLoaded = true;
            getNotificationCenter().postNotificationName(NotificationCenter.dialogFiltersUpdated, new Object[0]);
            if (i == 0) {
                loadRemoteFilters(false);
            }
            if (tLRPC$messages_Dialogs != null && !tLRPC$messages_Dialogs.dialogs.isEmpty()) {
                applyDialogsNotificationsSettings(tLRPC$messages_Dialogs.dialogs);
            }
            if (arrayList4 != null) {
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    TLRPC$EncryptedChat tLRPC$EncryptedChat = (TLRPC$EncryptedChat) arrayList4.get(i3);
                    if ((tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) && AndroidUtilities.getMyLayerVersion(tLRPC$EncryptedChat.layer) < SecretChatHelper.CURRENT_SECRET_CHAT_LAYER) {
                        getSecretChatHelper().sendNotifyLayerMessage(tLRPC$EncryptedChat, null);
                    }
                    putEncryptedChat(tLRPC$EncryptedChat, true);
                }
            }
            for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
                long keyAt = longSparseArray.keyAt(i4);
                TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) longSparseArray.valueAt(i4);
                TLRPC$Dialog tLRPC$Dialog2 = this.dialogs_dict.get(keyAt);
                if (tLRPC$messages_Dialogs != null && tLRPC$messages_Dialogs.dialogs.contains(tLRPC$Dialog)) {
                    if (tLRPC$Dialog.draft instanceof TLRPC$TL_draftMessage) {
                        getMediaDataController().saveDraft(tLRPC$Dialog.id, 0, tLRPC$Dialog.draft, null, false);
                    }
                    if (tLRPC$Dialog2 != null) {
                        tLRPC$Dialog2.notify_settings = tLRPC$Dialog.notify_settings;
                    }
                }
                MessageObject messageObject = (MessageObject) longSparseArray2.get(tLRPC$Dialog.id);
                if (tLRPC$Dialog2 == null) {
                    this.dialogs_dict.put(keyAt, tLRPC$Dialog);
                    this.dialogMessage.put(keyAt, messageObject);
                    if (messageObject != null && messageObject.messageOwner.peer_id.channel_id == 0) {
                        this.dialogMessagesByIds.put(messageObject.getId(), messageObject);
                        long j = messageObject.messageOwner.random_id;
                        if (j != 0) {
                            this.dialogMessagesByRandomIds.put(j, messageObject);
                        }
                    }
                } else {
                    tLRPC$Dialog2.pinned = tLRPC$Dialog.pinned;
                    tLRPC$Dialog2.pinnedNum = tLRPC$Dialog.pinnedNum;
                    MessageObject messageObject2 = this.dialogMessage.get(keyAt);
                    if ((messageObject2 == null || !messageObject2.deleted) && messageObject2 != null && tLRPC$Dialog2.top_message <= 0) {
                        if (messageObject == null || messageObject.messageOwner.date > messageObject2.messageOwner.date) {
                            this.dialogs_dict.put(keyAt, tLRPC$Dialog);
                            this.dialogMessage.put(keyAt, messageObject);
                            if (messageObject2.messageOwner.peer_id.channel_id == 0) {
                                this.dialogMessagesByIds.remove(messageObject2.getId());
                            }
                            if (messageObject != null) {
                                if (messageObject2.getId() == messageObject.getId()) {
                                    messageObject.deleted = messageObject2.deleted;
                                }
                                if (messageObject.messageOwner.peer_id.channel_id == 0) {
                                    this.dialogMessagesByIds.put(messageObject.getId(), messageObject);
                                    long j2 = messageObject.messageOwner.random_id;
                                    if (j2 != 0) {
                                        this.dialogMessagesByRandomIds.put(j2, messageObject);
                                    }
                                }
                            }
                            long j3 = messageObject2.messageOwner.random_id;
                            if (j3 != 0) {
                                this.dialogMessagesByRandomIds.remove(j3);
                            }
                        }
                    } else if (tLRPC$Dialog.top_message >= tLRPC$Dialog2.top_message) {
                        this.dialogs_dict.put(keyAt, tLRPC$Dialog);
                        this.dialogMessage.put(keyAt, messageObject);
                        if (messageObject2 != null) {
                            if (messageObject2.messageOwner.peer_id.channel_id == 0) {
                                this.dialogMessagesByIds.remove(messageObject2.getId());
                            }
                            long j4 = messageObject2.messageOwner.random_id;
                            if (j4 != 0) {
                                this.dialogMessagesByRandomIds.remove(j4);
                            }
                        }
                        if (messageObject != null && messageObject.messageOwner.peer_id.channel_id == 0) {
                            if (messageObject2 != null && messageObject2.getId() == messageObject.getId()) {
                                messageObject.deleted = messageObject2.deleted;
                            }
                            this.dialogMessagesByIds.put(messageObject.getId(), messageObject);
                            long j5 = messageObject.messageOwner.random_id;
                            if (j5 != 0) {
                                this.dialogMessagesByRandomIds.put(j5, messageObject);
                            }
                        }
                    }
                }
            }
            this.allDialogs.clear();
            int size2 = this.dialogs_dict.size();
            for (int i5 = 0; i5 < size2; i5++) {
                TLRPC$Dialog valueAt = this.dialogs_dict.valueAt(i5);
                if (this.deletingDialogs.indexOfKey(valueAt.id) < 0) {
                    this.allDialogs.add(valueAt);
                }
            }
            sortDialogs(null);
            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
        if (i != 0) {
            getUserConfig().filtersLoaded = true;
            getUserConfig().saveConfig(false);
            this.loadingRemoteFilters = false;
            getNotificationCenter().postNotificationName(NotificationCenter.filterSettingsUpdated, new Object[0]);
        }
    }

    public static int lambda$processLoadedDialogFilters$12(DialogFilter dialogFilter, DialogFilter dialogFilter2) {
        int i = dialogFilter.order;
        int i2 = dialogFilter2.order;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void loadSuggestedFilters() {
        if (!this.loadingSuggestedFilters) {
            this.loadingSuggestedFilters = true;
            getConnectionsManager().sendRequest(new TLObject() {
                public static int constructor = -1566780372;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                    TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
                    int readInt32 = abstractSerializedData.readInt32(z);
                    for (int i2 = 0; i2 < readInt32; i2++) {
                        TLRPC$TL_dialogFilterSuggested TLdeserialize = TLRPC$TL_dialogFilterSuggested.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                        if (TLdeserialize == null) {
                            return tLRPC$Vector;
                        }
                        tLRPC$Vector.objects.add(TLdeserialize);
                    }
                    return tLRPC$Vector;
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadSuggestedFilters$16(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadSuggestedFilters$16(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadSuggestedFilters$15(tLObject);
            }
        });
    }

    public void lambda$loadSuggestedFilters$15(TLObject tLObject) {
        this.loadingSuggestedFilters = false;
        this.suggestedFilters.clear();
        if (tLObject instanceof TLRPC$Vector) {
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            int size = tLRPC$Vector.objects.size();
            for (int i = 0; i < size; i++) {
                this.suggestedFilters.add((TLRPC$TL_dialogFilterSuggested) tLRPC$Vector.objects.get(i));
            }
        }
        getNotificationCenter().postNotificationName(NotificationCenter.suggestedFiltersLoaded, new Object[0]);
    }

    public void loadRemoteFilters(boolean z) {
        if (!this.loadingRemoteFilters && getUserConfig().isClientActivated()) {
            if (z || !getUserConfig().filtersLoaded) {
                if (z) {
                    getUserConfig().filtersLoaded = false;
                    getUserConfig().saveConfig(false);
                }
                getConnectionsManager().sendRequest(new TLObject() {
                    public static int constructor = -241247891;

                    @Override
                    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z2) {
                        TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
                        int readInt32 = abstractSerializedData.readInt32(z2);
                        for (int i2 = 0; i2 < readInt32; i2++) {
                            TLRPC$TL_dialogFilter TLdeserialize = TLRPC$TL_dialogFilter.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return tLRPC$Vector;
                            }
                            tLRPC$Vector.objects.add(TLdeserialize);
                        }
                        return tLRPC$Vector;
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                        abstractSerializedData.writeInt32(constructor);
                    }
                }, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadRemoteFilters$18(tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
    }

    public void lambda$loadRemoteFilters$18(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$Vector) {
            getMessagesStorage().checkLoadedRemoteFilters((TLRPC$Vector) tLObject);
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadRemoteFilters$17();
                }
            });
        }
    }

    public void lambda$loadRemoteFilters$17() {
        this.loadingRemoteFilters = false;
    }

    public void selectDialogFilter(DialogFilter dialogFilter, int i) {
        DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
        if (dialogFilterArr[i] != dialogFilter) {
            DialogFilter dialogFilter2 = dialogFilterArr[i];
            dialogFilterArr[i] = dialogFilter;
            char c = 1;
            if (dialogFilterArr[i == 0 ? (char) 1 : (char) 0] == dialogFilter) {
                if (i != 0) {
                    c = 0;
                }
                dialogFilterArr[c] = null;
            }
            if (dialogFilterArr[i] != null) {
                sortDialogs(null);
            } else if (dialogFilter2 != null) {
                dialogFilter2.dialogs.clear();
            }
        }
    }

    public void onFilterUpdate(DialogFilter dialogFilter) {
        for (int i = 0; i < 2; i++) {
            if (this.selectedDialogFilter[i] == dialogFilter) {
                sortDialogs(null);
                getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
                return;
            }
        }
    }

    public void addFilter(DialogFilter dialogFilter, boolean z) {
        if (z) {
            int i = 254;
            int size = this.dialogFilters.size();
            for (int i2 = 0; i2 < size; i2++) {
                i = Math.min(i, this.dialogFilters.get(i2).order);
            }
            dialogFilter.order = i - 1;
            this.dialogFilters.add(0, dialogFilter);
        } else {
            int size2 = this.dialogFilters.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                i3 = Math.max(i3, this.dialogFilters.get(i4).order);
            }
            dialogFilter.order = i3 + 1;
            this.dialogFilters.add(dialogFilter);
        }
        this.dialogFiltersById.put(dialogFilter.id, dialogFilter);
        if (this.dialogFilters.size() == 1 && SharedConfig.getChatSwipeAction(this.currentAccount) != 5) {
            SharedConfig.updateChatListSwipeSetting(5);
        }
    }

    public void removeFilter(DialogFilter dialogFilter) {
        this.dialogFilters.remove(dialogFilter);
        this.dialogFiltersById.remove(dialogFilter.id);
        getNotificationCenter().postNotificationName(NotificationCenter.dialogFiltersUpdated, new Object[0]);
    }

    private void loadAppConfig() {
        if (!this.loadingAppConfig) {
            this.loadingAppConfig = true;
            getConnectionsManager().sendRequest(new TLObject() {
                public static int constructor = -1735311088;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                    return TLRPC$JSONValue.TLdeserialize(abstractSerializedData, i, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadAppConfig$20(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadAppConfig$20(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadAppConfig$19(tLObject);
            }
        });
    }

    public void lambda$loadAppConfig$19(TLObject tLObject) {
        char c;
        int i;
        TLRPC$TL_jsonObject tLRPC$TL_jsonObject;
        Exception e;
        int i2;
        TLRPC$TL_jsonObject tLRPC$TL_jsonObject2;
        TLRPC$TL_jsonObject tLRPC$TL_jsonObject3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        TLRPC$TL_jsonObject tLRPC$TL_jsonObject4;
        int i4;
        boolean z5;
        boolean z6;
        boolean z7;
        int intValue;
        char c2;
        boolean z8;
        if (tLObject instanceof TLRPC$TL_jsonObject) {
            SharedPreferences.Editor edit = this.mainPreferences.edit();
            TLRPC$TL_jsonObject tLRPC$TL_jsonObject5 = (TLRPC$TL_jsonObject) tLObject;
            int size = tLRPC$TL_jsonObject5.value.size();
            int i5 = 0;
            boolean z9 = false;
            boolean z10 = false;
            while (i5 < size) {
                TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue = tLRPC$TL_jsonObject5.value.get(i5);
                String str = tLRPC$TL_jsonObjectValue.key;
                str.hashCode();
                switch (str.hashCode()) {
                    case -1688620344:
                        if (str.equals("dialog_filters_tooltip")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1683918311:
                        if (str.equals("qr_login_camera")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1391086521:
                        if (str.equals("pending_suggestions")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1056002991:
                        if (str.equals("chat_read_mark_expire_period")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1032177933:
                        if (str.equals("emojies_send_dice")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -980397720:
                        if (str.equals("url_auth_domains")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -515715076:
                        if (str.equals("export_regex")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -404170231:
                        if (str.equals("keep_alive_service")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -377047005:
                        if (str.equals("ringtone_size_max")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -253815153:
                        if (str.equals("background_connection")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -232883529:
                        if (str.equals("emojies_send_dice_success")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -111779186:
                        if (str.equals("autoarchive_setting_available")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -76561797:
                        if (str.equals("youtube_pip")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -24016028:
                        if (str.equals("emojies_animated_zoom")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 169095108:
                        if (str.equals("stickers_emoji_suggest_only_api")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 222975416:
                        if (str.equals("gif_search_emojies")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 227342346:
                        if (str.equals("autologin_domains")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 246778895:
                        if (str.equals("export_group_urls")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 314452116:
                        if (str.equals("autologin_token")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 676199595:
                        if (str.equals("groupcall_video_participants_max")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 684764449:
                        if (str.equals("save_gifs_with_stickers")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 917364150:
                        if (str.equals("ringtone_duration_max")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 992898905:
                        if (str.equals("inapp_update_check_delay")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1322701672:
                        if (str.equals("round_video_encoding")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1508636733:
                        if (str.equals("chat_read_mark_size_threshold")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1850325103:
                        if (str.equals("emojies_sounds")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2074702027:
                        if (str.equals("export_private_urls")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2136829446:
                        if (str.equals("dialog_filters_enabled")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue = tLRPC$TL_jsonObjectValue.value;
                        if ((tLRPC$JSONValue instanceof TLRPC$TL_jsonBool) && (z = ((TLRPC$TL_jsonBool) tLRPC$JSONValue).value) != this.showFiltersTooltip) {
                            this.showFiltersTooltip = z;
                            edit.putBoolean("showFiltersTooltip", z);
                            getNotificationCenter().postNotificationName(NotificationCenter.filterSettingsUpdated, new Object[0]);
                            z9 = true;
                            break;
                        }
                        break;
                    case 1:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue2 = tLRPC$TL_jsonObjectValue.value;
                        if ((tLRPC$JSONValue2 instanceof TLRPC$TL_jsonBool) && (z2 = ((TLRPC$TL_jsonBool) tLRPC$JSONValue2).value) != this.qrLoginCamera) {
                            this.qrLoginCamera = z2;
                            edit.putBoolean("qrLoginCamera", z2);
                            z9 = true;
                            break;
                        }
                        break;
                    case 2:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        HashSet hashSet = new HashSet();
                        TLRPC$JSONValue tLRPC$JSONValue3 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue3 instanceof TLRPC$TL_jsonArray) {
                            TLRPC$TL_jsonArray tLRPC$TL_jsonArray = (TLRPC$TL_jsonArray) tLRPC$JSONValue3;
                            int size2 = tLRPC$TL_jsonArray.value.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                TLRPC$JSONValue tLRPC$JSONValue4 = tLRPC$TL_jsonArray.value.get(i6);
                                if (tLRPC$JSONValue4 instanceof TLRPC$TL_jsonString) {
                                    hashSet.add(((TLRPC$TL_jsonString) tLRPC$JSONValue4).value);
                                }
                            }
                        }
                        if (!this.pendingSuggestions.equals(hashSet)) {
                            this.pendingSuggestions = hashSet;
                            edit.putStringSet("pendingSuggestions", hashSet);
                            getNotificationCenter().postNotificationName(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                            z9 = true;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue5 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue5 instanceof TLRPC$TL_jsonNumber) {
                            double d = ((TLRPC$TL_jsonNumber) tLRPC$JSONValue5).value;
                            if (d != this.chatReadMarkExpirePeriod) {
                                int i7 = (int) d;
                                this.chatReadMarkExpirePeriod = i7;
                                edit.putInt("chatReadMarkExpirePeriod", i7);
                                z9 = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    case 4:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        HashSet<String> hashSet2 = new HashSet<>();
                        TLRPC$JSONValue tLRPC$JSONValue6 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue6 instanceof TLRPC$TL_jsonArray) {
                            TLRPC$TL_jsonArray tLRPC$TL_jsonArray2 = (TLRPC$TL_jsonArray) tLRPC$JSONValue6;
                            int size3 = tLRPC$TL_jsonArray2.value.size();
                            for (int i8 = 0; i8 < size3; i8++) {
                                TLRPC$JSONValue tLRPC$JSONValue7 = tLRPC$TL_jsonArray2.value.get(i8);
                                if (tLRPC$JSONValue7 instanceof TLRPC$TL_jsonString) {
                                    hashSet2.add(((TLRPC$TL_jsonString) tLRPC$JSONValue7).value.replace("️", ""));
                                }
                            }
                        }
                        if (!this.diceEmojies.equals(hashSet2)) {
                            this.diceEmojies = hashSet2;
                            edit.putStringSet("diceEmojies", hashSet2);
                            z9 = true;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        HashSet hashSet3 = new HashSet();
                        TLRPC$JSONValue tLRPC$JSONValue8 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue8 instanceof TLRPC$TL_jsonArray) {
                            TLRPC$TL_jsonArray tLRPC$TL_jsonArray3 = (TLRPC$TL_jsonArray) tLRPC$JSONValue8;
                            int size4 = tLRPC$TL_jsonArray3.value.size();
                            for (int i9 = 0; i9 < size4; i9++) {
                                TLRPC$JSONValue tLRPC$JSONValue9 = tLRPC$TL_jsonArray3.value.get(i9);
                                if (tLRPC$JSONValue9 instanceof TLRPC$TL_jsonString) {
                                    hashSet3.add(((TLRPC$TL_jsonString) tLRPC$JSONValue9).value);
                                }
                            }
                        }
                        if (!this.authDomains.equals(hashSet3)) {
                            this.authDomains = hashSet3;
                            edit.putStringSet("authDomains", hashSet3);
                            z9 = true;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        HashSet hashSet4 = new HashSet();
                        TLRPC$JSONValue tLRPC$JSONValue10 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue10 instanceof TLRPC$TL_jsonArray) {
                            TLRPC$TL_jsonArray tLRPC$TL_jsonArray4 = (TLRPC$TL_jsonArray) tLRPC$JSONValue10;
                            int size5 = tLRPC$TL_jsonArray4.value.size();
                            for (int i10 = 0; i10 < size5; i10++) {
                                TLRPC$JSONValue tLRPC$JSONValue11 = tLRPC$TL_jsonArray4.value.get(i10);
                                if (tLRPC$JSONValue11 instanceof TLRPC$TL_jsonString) {
                                    hashSet4.add(((TLRPC$TL_jsonString) tLRPC$JSONValue11).value);
                                }
                            }
                        }
                        if (!this.exportUri.equals(hashSet4)) {
                            this.exportUri = hashSet4;
                            edit.putStringSet("exportUri2", hashSet4);
                            z9 = true;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue12 = tLRPC$TL_jsonObjectValue.value;
                        if ((tLRPC$JSONValue12 instanceof TLRPC$TL_jsonBool) && (z3 = ((TLRPC$TL_jsonBool) tLRPC$JSONValue12).value) != this.keepAliveService) {
                            this.keepAliveService = z3;
                            edit.putBoolean("keepAliveService", z3);
                            z9 = true;
                            z10 = true;
                            break;
                        }
                        break;
                    case '\b':
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue13 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue13 instanceof TLRPC$TL_jsonNumber) {
                            double d2 = ((TLRPC$TL_jsonNumber) tLRPC$JSONValue13).value;
                            if (d2 != this.ringtoneSizeMax) {
                                int i11 = (int) d2;
                                this.ringtoneSizeMax = i11;
                                edit.putInt("ringtoneSizeMax", i11);
                                z9 = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    case '\t':
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue14 = tLRPC$TL_jsonObjectValue.value;
                        if ((tLRPC$JSONValue14 instanceof TLRPC$TL_jsonBool) && (z4 = ((TLRPC$TL_jsonBool) tLRPC$JSONValue14).value) != this.backgroundConnection) {
                            this.backgroundConnection = z4;
                            edit.putBoolean("backgroundConnection", z4);
                            z9 = true;
                            z10 = true;
                            break;
                        }
                        break;
                    case '\n':
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        try {
                            HashMap<String, DiceFrameSuccess> hashMap = new HashMap<>();
                            TLRPC$JSONValue tLRPC$JSONValue15 = tLRPC$TL_jsonObjectValue.value;
                            if (tLRPC$JSONValue15 instanceof TLRPC$TL_jsonObject) {
                                TLRPC$TL_jsonObject tLRPC$TL_jsonObject6 = (TLRPC$TL_jsonObject) tLRPC$JSONValue15;
                                int size6 = tLRPC$TL_jsonObject6.value.size();
                                int i12 = 0;
                                while (i12 < size6) {
                                    TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue2 = tLRPC$TL_jsonObject6.value.get(i12);
                                    TLRPC$JSONValue tLRPC$JSONValue16 = tLRPC$TL_jsonObjectValue2.value;
                                    if (tLRPC$JSONValue16 instanceof TLRPC$TL_jsonObject) {
                                        TLRPC$TL_jsonObject tLRPC$TL_jsonObject7 = (TLRPC$TL_jsonObject) tLRPC$JSONValue16;
                                        int size7 = tLRPC$TL_jsonObject7.value.size();
                                        tLRPC$TL_jsonObject4 = tLRPC$TL_jsonObject6;
                                        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        int i15 = 0;
                                        while (i15 < size7) {
                                            size6 = size6;
                                            TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue3 = tLRPC$TL_jsonObject7.value.get(i15);
                                            tLRPC$TL_jsonObject7 = tLRPC$TL_jsonObject7;
                                            if (tLRPC$TL_jsonObjectValue3.value instanceof TLRPC$TL_jsonNumber) {
                                                i4 = size7;
                                                if ("value".equals(tLRPC$TL_jsonObjectValue3.key)) {
                                                    i13 = (int) ((TLRPC$TL_jsonNumber) tLRPC$TL_jsonObjectValue3.value).value;
                                                } else if ("frame_start".equals(tLRPC$TL_jsonObjectValue3.key)) {
                                                    i14 = (int) ((TLRPC$TL_jsonNumber) tLRPC$TL_jsonObjectValue3.value).value;
                                                }
                                            } else {
                                                i4 = size7;
                                            }
                                            i15++;
                                            size7 = i4;
                                        }
                                        i3 = size6;
                                        if (!(i14 == Integer.MAX_VALUE || i13 == Integer.MAX_VALUE)) {
                                            hashMap.put(tLRPC$TL_jsonObjectValue2.key.replace("️", ""), new DiceFrameSuccess(i14, i13));
                                        }
                                    } else {
                                        tLRPC$TL_jsonObject4 = tLRPC$TL_jsonObject6;
                                        i3 = size6;
                                    }
                                    i12++;
                                    tLRPC$TL_jsonObject6 = tLRPC$TL_jsonObject4;
                                    size6 = i3;
                                }
                            }
                            if (!this.diceSuccess.equals(hashMap)) {
                                this.diceSuccess = hashMap;
                                SerializedData serializedData = new SerializedData();
                                serializedData.writeInt32(this.diceSuccess.size());
                                for (Map.Entry<String, DiceFrameSuccess> entry : this.diceSuccess.entrySet()) {
                                    serializedData.writeString(entry.getKey());
                                    DiceFrameSuccess value = entry.getValue();
                                    serializedData.writeInt32(value.frame);
                                    serializedData.writeInt32(value.num);
                                }
                                edit.putString("diceSuccess", Base64.encodeToString(serializedData.toByteArray(), 0));
                                serializedData.cleanup();
                                z9 = true;
                                break;
                            } else {
                                break;
                            }
                        } catch (Exception e2) {
                            FileLog.e(e2);
                            break;
                        }
                        break;
                    case 11:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue17 = tLRPC$TL_jsonObjectValue.value;
                        if ((tLRPC$JSONValue17 instanceof TLRPC$TL_jsonBool) && (z5 = ((TLRPC$TL_jsonBool) tLRPC$JSONValue17).value) != this.autoarchiveAvailable) {
                            this.autoarchiveAvailable = z5;
                            edit.putBoolean("autoarchiveAvailable", z5);
                            z9 = true;
                            break;
                        }
                        break;
                    case '\f':
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue18 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue18 instanceof TLRPC$TL_jsonString) {
                            TLRPC$TL_jsonString tLRPC$TL_jsonString = (TLRPC$TL_jsonString) tLRPC$JSONValue18;
                            if (!tLRPC$TL_jsonString.value.equals(this.youtubePipType)) {
                                String str2 = tLRPC$TL_jsonString.value;
                                this.youtubePipType = str2;
                                edit.putString("youtubePipType", str2);
                                z9 = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    case '\r':
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue19 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue19 instanceof TLRPC$TL_jsonNumber) {
                            double d3 = ((TLRPC$TL_jsonNumber) tLRPC$JSONValue19).value;
                            if (this.animatedEmojisZoom != d3) {
                                float f = (float) d3;
                                this.animatedEmojisZoom = f;
                                edit.putFloat("animatedEmojisZoom", f);
                                z9 = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    case 14:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue20 = tLRPC$TL_jsonObjectValue.value;
                        if ((tLRPC$JSONValue20 instanceof TLRPC$TL_jsonBool) && (z6 = ((TLRPC$TL_jsonBool) tLRPC$JSONValue20).value) != this.suggestStickersApiOnly) {
                            this.suggestStickersApiOnly = z6;
                            edit.putBoolean("suggestStickersApiOnly", z6);
                            z9 = true;
                            break;
                        }
                        break;
                    case 15:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        ArrayList<String> arrayList = new ArrayList<>();
                        TLRPC$JSONValue tLRPC$JSONValue21 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue21 instanceof TLRPC$TL_jsonArray) {
                            TLRPC$TL_jsonArray tLRPC$TL_jsonArray5 = (TLRPC$TL_jsonArray) tLRPC$JSONValue21;
                            int size8 = tLRPC$TL_jsonArray5.value.size();
                            for (int i16 = 0; i16 < size8; i16++) {
                                TLRPC$JSONValue tLRPC$JSONValue22 = tLRPC$TL_jsonArray5.value.get(i16);
                                if (tLRPC$JSONValue22 instanceof TLRPC$TL_jsonString) {
                                    arrayList.add(((TLRPC$TL_jsonString) tLRPC$JSONValue22).value.replace("️", ""));
                                }
                            }
                        }
                        if (!this.gifSearchEmojies.equals(arrayList)) {
                            this.gifSearchEmojies = arrayList;
                            SerializedData serializedData2 = new SerializedData();
                            serializedData2.writeInt32(this.gifSearchEmojies.size());
                            int size9 = this.gifSearchEmojies.size();
                            for (int i17 = 0; i17 < size9; i17++) {
                                serializedData2.writeString(this.gifSearchEmojies.get(i17));
                            }
                            edit.putString("gifSearchEmojies", Base64.encodeToString(serializedData2.toByteArray(), 0));
                            serializedData2.cleanup();
                            z9 = true;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        HashSet hashSet5 = new HashSet();
                        TLRPC$JSONValue tLRPC$JSONValue23 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue23 instanceof TLRPC$TL_jsonArray) {
                            TLRPC$TL_jsonArray tLRPC$TL_jsonArray6 = (TLRPC$TL_jsonArray) tLRPC$JSONValue23;
                            int size10 = tLRPC$TL_jsonArray6.value.size();
                            for (int i18 = 0; i18 < size10; i18++) {
                                TLRPC$JSONValue tLRPC$JSONValue24 = tLRPC$TL_jsonArray6.value.get(i18);
                                if (tLRPC$JSONValue24 instanceof TLRPC$TL_jsonString) {
                                    hashSet5.add(((TLRPC$TL_jsonString) tLRPC$JSONValue24).value);
                                }
                            }
                        }
                        if (!this.autologinDomains.equals(hashSet5)) {
                            this.autologinDomains = hashSet5;
                            edit.putStringSet("autologinDomains", hashSet5);
                            z9 = true;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        HashSet hashSet6 = new HashSet();
                        TLRPC$JSONValue tLRPC$JSONValue25 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue25 instanceof TLRPC$TL_jsonArray) {
                            TLRPC$TL_jsonArray tLRPC$TL_jsonArray7 = (TLRPC$TL_jsonArray) tLRPC$JSONValue25;
                            int size11 = tLRPC$TL_jsonArray7.value.size();
                            for (int i19 = 0; i19 < size11; i19++) {
                                TLRPC$JSONValue tLRPC$JSONValue26 = tLRPC$TL_jsonArray7.value.get(i19);
                                if (tLRPC$JSONValue26 instanceof TLRPC$TL_jsonString) {
                                    hashSet6.add(((TLRPC$TL_jsonString) tLRPC$JSONValue26).value);
                                }
                            }
                        }
                        if (!this.exportGroupUri.equals(hashSet6)) {
                            this.exportGroupUri = hashSet6;
                            edit.putStringSet("exportGroupUri", hashSet6);
                            z9 = true;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue27 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue27 instanceof TLRPC$TL_jsonString) {
                            TLRPC$TL_jsonString tLRPC$TL_jsonString2 = (TLRPC$TL_jsonString) tLRPC$JSONValue27;
                            if (!tLRPC$TL_jsonString2.value.equals(this.autologinToken)) {
                                String str3 = tLRPC$TL_jsonString2.value;
                                this.autologinToken = str3;
                                edit.putString("autologinToken", str3);
                                z9 = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    case R.styleable.MapAttrs_uiTiltGestures:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue28 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue28 instanceof TLRPC$TL_jsonNumber) {
                            double d4 = ((TLRPC$TL_jsonNumber) tLRPC$JSONValue28).value;
                            if (d4 != this.groupCallVideoMaxParticipants) {
                                int i20 = (int) d4;
                                this.groupCallVideoMaxParticipants = i20;
                                edit.putInt("groipCallVideoMaxParticipants", i20);
                                z9 = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    case R.styleable.MapAttrs_uiZoomControls:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue29 = tLRPC$TL_jsonObjectValue.value;
                        if ((tLRPC$JSONValue29 instanceof TLRPC$TL_jsonBool) && (z7 = ((TLRPC$TL_jsonBool) tLRPC$JSONValue29).value) != this.saveGifsWithStickers) {
                            this.saveGifsWithStickers = z7;
                            edit.putBoolean("saveGifsWithStickers", z7);
                            z9 = true;
                            break;
                        }
                        break;
                    case R.styleable.MapAttrs_uiZoomGestures:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue30 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue30 instanceof TLRPC$TL_jsonNumber) {
                            double d5 = ((TLRPC$TL_jsonNumber) tLRPC$JSONValue30).value;
                            if (d5 != this.ringtoneDurationMax) {
                                int i21 = (int) d5;
                                this.ringtoneDurationMax = i21;
                                edit.putInt("ringtoneDurationMax", i21);
                                z9 = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    case R.styleable.MapAttrs_useViewLifecycle:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue31 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue31 instanceof TLRPC$TL_jsonNumber) {
                            double d6 = ((TLRPC$TL_jsonNumber) tLRPC$JSONValue31).value;
                            if (d6 == this.updateCheckDelay) {
                                break;
                            } else {
                                int i22 = (int) d6;
                                this.updateCheckDelay = i22;
                                edit.putInt("updateCheckDelay", i22);
                            }
                        } else if ((tLRPC$JSONValue31 instanceof TLRPC$TL_jsonString) && (intValue = Utilities.parseInt(((TLRPC$TL_jsonString) tLRPC$JSONValue31).value).intValue()) != this.updateCheckDelay) {
                            this.updateCheckDelay = intValue;
                            edit.putInt("updateCheckDelay", intValue);
                        }
                        z9 = true;
                        break;
                    case R.styleable.MapAttrs_zOrderOnTop:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue32 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue32 instanceof TLRPC$TL_jsonObject) {
                            TLRPC$TL_jsonObject tLRPC$TL_jsonObject8 = (TLRPC$TL_jsonObject) tLRPC$JSONValue32;
                            int size12 = tLRPC$TL_jsonObject8.value.size();
                            for (int i23 = 0; i23 < size12; i23++) {
                                TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue4 = tLRPC$TL_jsonObject8.value.get(i23);
                                String str4 = tLRPC$TL_jsonObjectValue4.key;
                                str4.hashCode();
                                switch (str4.hashCode()) {
                                    case -233204595:
                                        if (str4.equals("diameter")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 258902020:
                                        if (str4.equals("audio_bitrate")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1924434857:
                                        if (str4.equals("video_bitrate")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                switch (c2) {
                                    case 0:
                                        TLRPC$JSONValue tLRPC$JSONValue33 = tLRPC$TL_jsonObjectValue4.value;
                                        if (tLRPC$JSONValue33 instanceof TLRPC$TL_jsonNumber) {
                                            double d7 = ((TLRPC$TL_jsonNumber) tLRPC$JSONValue33).value;
                                            if (d7 != this.roundVideoSize) {
                                                int i24 = (int) d7;
                                                this.roundVideoSize = i24;
                                                edit.putInt("roundVideoSize", i24);
                                                z9 = true;
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        TLRPC$JSONValue tLRPC$JSONValue34 = tLRPC$TL_jsonObjectValue4.value;
                                        if (tLRPC$JSONValue34 instanceof TLRPC$TL_jsonNumber) {
                                            double d8 = ((TLRPC$TL_jsonNumber) tLRPC$JSONValue34).value;
                                            if (d8 != this.roundAudioBitrate) {
                                                int i25 = (int) d8;
                                                this.roundAudioBitrate = i25;
                                                edit.putInt("roundAudioBitrate", i25);
                                                z9 = true;
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        TLRPC$JSONValue tLRPC$JSONValue35 = tLRPC$TL_jsonObjectValue4.value;
                                        if (tLRPC$JSONValue35 instanceof TLRPC$TL_jsonNumber) {
                                            double d9 = ((TLRPC$TL_jsonNumber) tLRPC$JSONValue35).value;
                                            if (d9 != this.roundVideoBitrate) {
                                                int i26 = (int) d9;
                                                this.roundVideoBitrate = i26;
                                                edit.putInt("roundVideoBitrate", i26);
                                                z9 = true;
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                }
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                    case 24:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        TLRPC$JSONValue tLRPC$JSONValue36 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue36 instanceof TLRPC$TL_jsonNumber) {
                            double d10 = ((TLRPC$TL_jsonNumber) tLRPC$JSONValue36).value;
                            if (d10 != this.chatReadMarkSizeThreshold) {
                                int i27 = (int) d10;
                                this.chatReadMarkSizeThreshold = i27;
                                edit.putInt("chatReadMarkSizeThreshold", i27);
                                z9 = true;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    case 25:
                        try {
                            HashMap<String, EmojiSound> hashMap2 = new HashMap<>();
                            TLRPC$JSONValue tLRPC$JSONValue37 = tLRPC$TL_jsonObjectValue.value;
                            if (tLRPC$JSONValue37 instanceof TLRPC$TL_jsonObject) {
                                TLRPC$TL_jsonObject tLRPC$TL_jsonObject9 = (TLRPC$TL_jsonObject) tLRPC$JSONValue37;
                                int size13 = tLRPC$TL_jsonObject9.value.size();
                                int i28 = 0;
                                while (i28 < size13) {
                                    TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue5 = tLRPC$TL_jsonObject9.value.get(i28);
                                    TLRPC$JSONValue tLRPC$JSONValue38 = tLRPC$TL_jsonObjectValue5.value;
                                    if (tLRPC$JSONValue38 instanceof TLRPC$TL_jsonObject) {
                                        TLRPC$TL_jsonObject tLRPC$TL_jsonObject10 = (TLRPC$TL_jsonObject) tLRPC$JSONValue38;
                                        int size14 = tLRPC$TL_jsonObject10.value.size();
                                        tLRPC$TL_jsonObject3 = tLRPC$TL_jsonObject9;
                                        long j = 0;
                                        long j2 = 0;
                                        int i29 = 0;
                                        String str5 = null;
                                        while (i29 < size14) {
                                            size14 = size14;
                                            TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue6 = tLRPC$TL_jsonObject10.value.get(i29);
                                            tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                                            try {
                                                if (tLRPC$TL_jsonObjectValue6.value instanceof TLRPC$TL_jsonString) {
                                                    i = size;
                                                    try {
                                                        if ("id".equals(tLRPC$TL_jsonObjectValue6.key)) {
                                                            j = Utilities.parseLong(((TLRPC$TL_jsonString) tLRPC$TL_jsonObjectValue6.value).value).longValue();
                                                        } else if ("access_hash".equals(tLRPC$TL_jsonObjectValue6.key)) {
                                                            j2 = Utilities.parseLong(((TLRPC$TL_jsonString) tLRPC$TL_jsonObjectValue6.value).value).longValue();
                                                        } else if ("file_reference_base64".equals(tLRPC$TL_jsonObjectValue6.key)) {
                                                            str5 = ((TLRPC$TL_jsonString) tLRPC$TL_jsonObjectValue6.value).value;
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        FileLog.e(e);
                                                        i5++;
                                                        tLRPC$TL_jsonObject5 = tLRPC$TL_jsonObject;
                                                        size = i;
                                                    }
                                                } else {
                                                    i = size;
                                                }
                                                i29++;
                                                tLRPC$TL_jsonObject5 = tLRPC$TL_jsonObject;
                                                size = i;
                                            } catch (Exception e4) {
                                                e = e4;
                                                i = size;
                                                FileLog.e(e);
                                                i5++;
                                                tLRPC$TL_jsonObject5 = tLRPC$TL_jsonObject;
                                                size = i;
                                            }
                                        }
                                        tLRPC$TL_jsonObject2 = tLRPC$TL_jsonObject5;
                                        i2 = size;
                                        if (!(j == 0 || j2 == 0 || str5 == null)) {
                                            hashMap2.put(tLRPC$TL_jsonObjectValue5.key.replace("️", ""), new EmojiSound(j, j2, str5));
                                        }
                                    } else {
                                        tLRPC$TL_jsonObject3 = tLRPC$TL_jsonObject9;
                                        tLRPC$TL_jsonObject2 = tLRPC$TL_jsonObject5;
                                        i2 = size;
                                    }
                                    i28++;
                                    tLRPC$TL_jsonObject9 = tLRPC$TL_jsonObject3;
                                    tLRPC$TL_jsonObject5 = tLRPC$TL_jsonObject2;
                                    size = i2;
                                }
                            }
                            tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                            i = size;
                            if (!this.emojiSounds.equals(hashMap2)) {
                                this.emojiSounds = hashMap2;
                                SerializedData serializedData3 = new SerializedData();
                                serializedData3.writeInt32(this.emojiSounds.size());
                                for (Map.Entry<String, EmojiSound> entry2 : this.emojiSounds.entrySet()) {
                                    serializedData3.writeString(entry2.getKey());
                                    EmojiSound value2 = entry2.getValue();
                                    serializedData3.writeInt64(value2.id);
                                    serializedData3.writeInt64(value2.accessHash);
                                    serializedData3.writeByteArray(value2.fileReference);
                                }
                                edit.putString("emojiSounds", Base64.encodeToString(serializedData3.toByteArray(), 0));
                                serializedData3.cleanup();
                                z9 = true;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        }
                        break;
                    case 26:
                        HashSet hashSet7 = new HashSet();
                        TLRPC$JSONValue tLRPC$JSONValue39 = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue39 instanceof TLRPC$TL_jsonArray) {
                            TLRPC$TL_jsonArray tLRPC$TL_jsonArray8 = (TLRPC$TL_jsonArray) tLRPC$JSONValue39;
                            int size15 = tLRPC$TL_jsonArray8.value.size();
                            for (int i30 = 0; i30 < size15; i30++) {
                                TLRPC$JSONValue tLRPC$JSONValue40 = tLRPC$TL_jsonArray8.value.get(i30);
                                if (tLRPC$JSONValue40 instanceof TLRPC$TL_jsonString) {
                                    hashSet7.add(((TLRPC$TL_jsonString) tLRPC$JSONValue40).value);
                                }
                            }
                        }
                        if (!this.exportPrivateUri.equals(hashSet7)) {
                            this.exportPrivateUri = hashSet7;
                            edit.putStringSet("exportPrivateUri", hashSet7);
                            tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                            i = size;
                            z9 = true;
                            break;
                        }
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        break;
                    case 27:
                        TLRPC$JSONValue tLRPC$JSONValue41 = tLRPC$TL_jsonObjectValue.value;
                        if ((tLRPC$JSONValue41 instanceof TLRPC$TL_jsonBool) && (z8 = ((TLRPC$TL_jsonBool) tLRPC$JSONValue41).value) != this.filtersEnabled) {
                            this.filtersEnabled = z8;
                            edit.putBoolean("filtersEnabled", z8);
                            z9 = true;
                        }
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        break;
                    default:
                        tLRPC$TL_jsonObject = tLRPC$TL_jsonObject5;
                        i = size;
                        break;
                }
                i5++;
                tLRPC$TL_jsonObject5 = tLRPC$TL_jsonObject;
                size = i;
            }
            if (z9) {
                edit.commit();
            }
            if (z10) {
                ApplicationLoader.startPushService();
                ConnectionsManager connectionsManager = getConnectionsManager();
                connectionsManager.setPushConnectionEnabled(connectionsManager.isPushConnectionEnabled());
            }
        }
        this.loadingAppConfig = false;
    }

    public void removeSuggestion(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (j == 0) {
                if (this.pendingSuggestions.remove(str)) {
                    SharedPreferences.Editor edit = this.mainPreferences.edit();
                    edit.putStringSet("pendingSuggestions", this.pendingSuggestions);
                    edit.commit();
                    getNotificationCenter().postNotificationName(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                } else {
                    return;
                }
            }
            TLRPC$TL_help_dismissSuggestion tLRPC$TL_help_dismissSuggestion = new TLRPC$TL_help_dismissSuggestion();
            tLRPC$TL_help_dismissSuggestion.suggestion = str;
            if (j == 0) {
                tLRPC$TL_help_dismissSuggestion.peer = new TLRPC$TL_inputPeerEmpty();
            } else {
                tLRPC$TL_help_dismissSuggestion.peer = getInputPeer(j);
            }
            getConnectionsManager().sendRequest(tLRPC$TL_help_dismissSuggestion, MessagesController$$ExternalSyntheticLambda344.INSTANCE);
        }
    }

    public void updateConfig(final TLRPC$TL_config tLRPC$TL_config) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$updateConfig$22(tLRPC$TL_config);
            }
        });
    }

    public void lambda$updateConfig$22(TLRPC$TL_config tLRPC$TL_config) {
        getDownloadController().loadAutoDownloadConfig(false);
        loadAppConfig();
        this.remoteConfigLoaded = true;
        this.maxMegagroupCount = tLRPC$TL_config.megagroup_size_max;
        this.maxGroupCount = tLRPC$TL_config.chat_size_max;
        this.maxEditTime = tLRPC$TL_config.edit_time_limit;
        this.ratingDecay = tLRPC$TL_config.rating_e_decay;
        this.maxRecentGifsCount = tLRPC$TL_config.saved_gifs_limit;
        this.maxRecentStickersCount = tLRPC$TL_config.stickers_recent_limit;
        this.maxFaveStickersCount = tLRPC$TL_config.stickers_faved_limit;
        this.revokeTimeLimit = tLRPC$TL_config.revoke_time_limit;
        this.revokeTimePmLimit = tLRPC$TL_config.revoke_pm_time_limit;
        this.canRevokePmInbox = tLRPC$TL_config.revoke_pm_inbox;
        String str = tLRPC$TL_config.me_url_prefix;
        this.linkPrefix = str;
        if (str.endsWith("/")) {
            String str2 = this.linkPrefix;
            this.linkPrefix = str2.substring(0, str2.length() - 1);
        }
        if (this.linkPrefix.startsWith("https://")) {
            this.linkPrefix = this.linkPrefix.substring(8);
        } else if (this.linkPrefix.startsWith("http://")) {
            this.linkPrefix = this.linkPrefix.substring(7);
        }
        this.callReceiveTimeout = tLRPC$TL_config.call_receive_timeout_ms;
        this.callRingTimeout = tLRPC$TL_config.call_ring_timeout_ms;
        this.callConnectTimeout = tLRPC$TL_config.call_connect_timeout_ms;
        this.callPacketTimeout = tLRPC$TL_config.call_packet_timeout_ms;
        this.maxPinnedDialogsCount = tLRPC$TL_config.pinned_dialogs_count_max;
        this.maxFolderPinnedDialogsCount = tLRPC$TL_config.pinned_infolder_count_max;
        this.maxMessageLength = tLRPC$TL_config.message_length_max;
        this.maxCaptionLength = tLRPC$TL_config.caption_length_max;
        this.preloadFeaturedStickers = tLRPC$TL_config.preload_featured_stickers;
        String str3 = tLRPC$TL_config.venue_search_username;
        if (str3 != null) {
            this.venueSearchBot = str3;
        }
        String str4 = tLRPC$TL_config.gif_search_username;
        if (str4 != null) {
            this.gifSearchBot = str4;
        }
        if (this.imageSearchBot != null) {
            this.imageSearchBot = tLRPC$TL_config.img_search_username;
        }
        this.blockedCountry = tLRPC$TL_config.blocked_mode;
        this.dcDomainName = tLRPC$TL_config.dc_txt_domain_name;
        this.webFileDatacenterId = tLRPC$TL_config.webfile_dc_id;
        String str5 = tLRPC$TL_config.suggested_lang_code;
        if (str5 != null) {
            String str6 = this.suggestedLangCode;
            boolean z = str6 == null || !str6.equals(str5);
            this.suggestedLangCode = tLRPC$TL_config.suggested_lang_code;
            if (z) {
                LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
            }
        }
        Theme.loadRemoteThemes(this.currentAccount, false);
        Theme.checkCurrentRemoteTheme(false);
        if (tLRPC$TL_config.static_maps_provider == null) {
            tLRPC$TL_config.static_maps_provider = "telegram";
        }
        this.mapKey = null;
        this.mapProvider = 2;
        this.availableMapProviders = 0;
        FileLog.d("map providers = " + tLRPC$TL_config.static_maps_provider);
        String[] split = tLRPC$TL_config.static_maps_provider.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("\\+");
            if (split2.length > 0) {
                String[] split3 = split2[0].split(":");
                if (split3.length > 0) {
                    if ("yandex".equals(split3[0])) {
                        if (i == 0) {
                            if (split2.length > 1) {
                                this.mapProvider = 3;
                            } else {
                                this.mapProvider = 1;
                            }
                        }
                        this.availableMapProviders |= 4;
                    } else if ("google".equals(split3[0])) {
                        if (i == 0 && split2.length > 1) {
                            this.mapProvider = 4;
                        }
                        this.availableMapProviders |= 1;
                    } else if ("telegram".equals(split3[0])) {
                        if (i == 0) {
                            this.mapProvider = 2;
                        }
                        this.availableMapProviders |= 2;
                    }
                    if (split3.length > 1) {
                        this.mapKey = split3[1];
                    }
                }
            }
        }
        SharedPreferences.Editor edit = this.mainPreferences.edit();
        edit.putBoolean("remoteConfigLoaded", this.remoteConfigLoaded);
        edit.putInt("maxGroupCount", this.maxGroupCount);
        edit.putInt("maxMegagroupCount", this.maxMegagroupCount);
        edit.putInt("maxEditTime", this.maxEditTime);
        edit.putInt("ratingDecay", this.ratingDecay);
        edit.putInt("maxRecentGifsCount", this.maxRecentGifsCount);
        edit.putInt("maxRecentStickersCount", this.maxRecentStickersCount);
        edit.putInt("maxFaveStickersCount", this.maxFaveStickersCount);
        edit.putInt("callReceiveTimeout", this.callReceiveTimeout);
        edit.putInt("callRingTimeout", this.callRingTimeout);
        edit.putInt("callConnectTimeout", this.callConnectTimeout);
        edit.putInt("callPacketTimeout", this.callPacketTimeout);
        edit.putString("linkPrefix", this.linkPrefix);
        edit.putInt("maxPinnedDialogsCount", this.maxPinnedDialogsCount);
        edit.putInt("maxFolderPinnedDialogsCount", this.maxFolderPinnedDialogsCount);
        edit.putInt("maxMessageLength", this.maxMessageLength);
        edit.putInt("maxCaptionLength", this.maxCaptionLength);
        edit.putBoolean("preloadFeaturedStickers", this.preloadFeaturedStickers);
        edit.putInt("revokeTimeLimit", this.revokeTimeLimit);
        edit.putInt("revokeTimePmLimit", this.revokeTimePmLimit);
        edit.putInt("mapProvider", this.mapProvider);
        String str7 = this.mapKey;
        if (str7 != null) {
            edit.putString("pk", str7);
        } else {
            edit.remove("pk");
        }
        edit.putBoolean("canRevokePmInbox", this.canRevokePmInbox);
        edit.putBoolean("blockedCountry", this.blockedCountry);
        edit.putString("venueSearchBot", this.venueSearchBot);
        edit.putString("gifSearchBot", this.gifSearchBot);
        edit.putString("imageSearchBot", this.imageSearchBot);
        edit.putString("dcDomainName2", this.dcDomainName);
        edit.putInt("webFileDatacenterId", this.webFileDatacenterId);
        edit.putString("suggestedLangCode", this.suggestedLangCode);
        edit.commit();
        LocaleController.getInstance().checkUpdateForCurrentRemoteLocale(this.currentAccount, tLRPC$TL_config.lang_pack_version, tLRPC$TL_config.base_lang_pack_version);
        getNotificationCenter().postNotificationName(NotificationCenter.configLoaded, new Object[0]);
    }

    public void addSupportUser() {
        TLRPC$TL_userForeign_old2 tLRPC$TL_userForeign_old2 = new TLRPC$TL_userForeign_old2();
        tLRPC$TL_userForeign_old2.phone = "333";
        tLRPC$TL_userForeign_old2.id = 333000L;
        tLRPC$TL_userForeign_old2.first_name = "Telegram";
        tLRPC$TL_userForeign_old2.last_name = "";
        tLRPC$TL_userForeign_old2.status = null;
        tLRPC$TL_userForeign_old2.photo = new TLRPC$TL_userProfilePhotoEmpty();
        putUser(tLRPC$TL_userForeign_old2, true);
        TLRPC$TL_userForeign_old2 tLRPC$TL_userForeign_old22 = new TLRPC$TL_userForeign_old2();
        tLRPC$TL_userForeign_old22.phone = "42777";
        tLRPC$TL_userForeign_old22.id = 777000L;
        tLRPC$TL_userForeign_old22.verified = true;
        tLRPC$TL_userForeign_old22.first_name = "Telegram";
        tLRPC$TL_userForeign_old22.last_name = "Notifications";
        tLRPC$TL_userForeign_old22.status = null;
        tLRPC$TL_userForeign_old22.photo = new TLRPC$TL_userProfilePhotoEmpty();
        putUser(tLRPC$TL_userForeign_old22, true);
    }

    public TLRPC$InputUser getInputUser(TLRPC$User tLRPC$User) {
        if (tLRPC$User == null) {
            return new TLRPC$TL_inputUserEmpty();
        }
        if (tLRPC$User.id == getUserConfig().getClientUserId()) {
            return new TLRPC$TL_inputUserSelf();
        }
        TLRPC$TL_inputUser tLRPC$TL_inputUser = new TLRPC$TL_inputUser();
        tLRPC$TL_inputUser.user_id = tLRPC$User.id;
        tLRPC$TL_inputUser.access_hash = tLRPC$User.access_hash;
        return tLRPC$TL_inputUser;
    }

    public TLRPC$InputUser getInputUser(TLRPC$InputPeer tLRPC$InputPeer) {
        if (tLRPC$InputPeer == null) {
            return new TLRPC$TL_inputUserEmpty();
        }
        if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerSelf) {
            return new TLRPC$TL_inputUserSelf();
        }
        TLRPC$TL_inputUser tLRPC$TL_inputUser = new TLRPC$TL_inputUser();
        tLRPC$TL_inputUser.user_id = tLRPC$InputPeer.user_id;
        tLRPC$TL_inputUser.access_hash = tLRPC$InputPeer.access_hash;
        return tLRPC$TL_inputUser;
    }

    public TLRPC$InputUser getInputUser(long j) {
        return getInputUser(getUser(Long.valueOf(j)));
    }

    public static TLRPC$InputChannel getInputChannel(TLRPC$Chat tLRPC$Chat) {
        if (!(tLRPC$Chat instanceof TLRPC$TL_channel) && !(tLRPC$Chat instanceof TLRPC$TL_channelForbidden)) {
            return new TLRPC$TL_inputChannelEmpty();
        }
        TLRPC$TL_inputChannel tLRPC$TL_inputChannel = new TLRPC$TL_inputChannel();
        tLRPC$TL_inputChannel.channel_id = tLRPC$Chat.id;
        tLRPC$TL_inputChannel.access_hash = tLRPC$Chat.access_hash;
        return tLRPC$TL_inputChannel;
    }

    public static TLRPC$InputChannel getInputChannel(TLRPC$InputPeer tLRPC$InputPeer) {
        TLRPC$TL_inputChannel tLRPC$TL_inputChannel = new TLRPC$TL_inputChannel();
        tLRPC$TL_inputChannel.channel_id = tLRPC$InputPeer.channel_id;
        tLRPC$TL_inputChannel.access_hash = tLRPC$InputPeer.access_hash;
        return tLRPC$TL_inputChannel;
    }

    public TLRPC$InputChannel getInputChannel(long j) {
        return getInputChannel(getChat(Long.valueOf(j)));
    }

    public TLRPC$InputPeer getInputPeer(TLRPC$Peer tLRPC$Peer) {
        if (tLRPC$Peer instanceof TLRPC$TL_peerChat) {
            TLRPC$TL_inputPeerChat tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChat();
            tLRPC$TL_inputPeerChat.chat_id = tLRPC$Peer.chat_id;
            return tLRPC$TL_inputPeerChat;
        } else if (tLRPC$Peer instanceof TLRPC$TL_peerChannel) {
            TLRPC$TL_inputPeerChannel tLRPC$TL_inputPeerChannel = new TLRPC$TL_inputPeerChannel();
            long j = tLRPC$Peer.channel_id;
            tLRPC$TL_inputPeerChannel.channel_id = j;
            TLRPC$Chat chat = getChat(Long.valueOf(j));
            if (chat == null) {
                return tLRPC$TL_inputPeerChannel;
            }
            tLRPC$TL_inputPeerChannel.access_hash = chat.access_hash;
            return tLRPC$TL_inputPeerChannel;
        } else {
            TLRPC$TL_inputPeerUser tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
            long j2 = tLRPC$Peer.user_id;
            tLRPC$TL_inputPeerUser.user_id = j2;
            TLRPC$User user = getUser(Long.valueOf(j2));
            if (user == null) {
                return tLRPC$TL_inputPeerUser;
            }
            tLRPC$TL_inputPeerUser.access_hash = user.access_hash;
            return tLRPC$TL_inputPeerUser;
        }
    }

    public TLRPC$InputPeer getInputPeer(long j) {
        if (j < 0) {
            long j2 = -j;
            TLRPC$Chat chat = getChat(Long.valueOf(j2));
            if (ChatObject.isChannel(chat)) {
                TLRPC$TL_inputPeerChannel tLRPC$TL_inputPeerChannel = new TLRPC$TL_inputPeerChannel();
                tLRPC$TL_inputPeerChannel.channel_id = j2;
                tLRPC$TL_inputPeerChannel.access_hash = chat.access_hash;
                return tLRPC$TL_inputPeerChannel;
            }
            TLRPC$TL_inputPeerChat tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChat();
            tLRPC$TL_inputPeerChat.chat_id = j2;
            return tLRPC$TL_inputPeerChat;
        }
        TLRPC$User user = getUser(Long.valueOf(j));
        TLRPC$TL_inputPeerUser tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
        tLRPC$TL_inputPeerUser.user_id = j;
        if (user == null) {
            return tLRPC$TL_inputPeerUser;
        }
        tLRPC$TL_inputPeerUser.access_hash = user.access_hash;
        return tLRPC$TL_inputPeerUser;
    }

    public static TLRPC$InputPeer getInputPeer(TLRPC$Chat tLRPC$Chat) {
        if (ChatObject.isChannel(tLRPC$Chat)) {
            TLRPC$TL_inputPeerChannel tLRPC$TL_inputPeerChannel = new TLRPC$TL_inputPeerChannel();
            tLRPC$TL_inputPeerChannel.channel_id = tLRPC$Chat.id;
            tLRPC$TL_inputPeerChannel.access_hash = tLRPC$Chat.access_hash;
            return tLRPC$TL_inputPeerChannel;
        }
        TLRPC$TL_inputPeerChat tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChat();
        tLRPC$TL_inputPeerChat.chat_id = tLRPC$Chat.id;
        return tLRPC$TL_inputPeerChat;
    }

    public static TLRPC$InputPeer getInputPeer(TLRPC$User tLRPC$User) {
        TLRPC$TL_inputPeerUser tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
        tLRPC$TL_inputPeerUser.user_id = tLRPC$User.id;
        tLRPC$TL_inputPeerUser.access_hash = tLRPC$User.access_hash;
        return tLRPC$TL_inputPeerUser;
    }

    public TLRPC$Peer getPeer(long j) {
        if (j < 0) {
            long j2 = -j;
            TLRPC$Chat chat = getChat(Long.valueOf(j2));
            if ((chat instanceof TLRPC$TL_channel) || (chat instanceof TLRPC$TL_channelForbidden)) {
                TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
                tLRPC$TL_peerChannel.channel_id = j2;
                return tLRPC$TL_peerChannel;
            }
            TLRPC$TL_peerChat tLRPC$TL_peerChat = new TLRPC$TL_peerChat();
            tLRPC$TL_peerChat.chat_id = j2;
            return tLRPC$TL_peerChat;
        }
        getUser(Long.valueOf(j));
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        tLRPC$TL_peerUser.user_id = j;
        return tLRPC$TL_peerUser;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageObject messageObject;
        TLRPC$InputFile tLRPC$InputFile;
        final Theme.ThemeAccent themeAccent;
        final Theme.ThemeInfo themeInfo;
        TLRPC$InputFile tLRPC$InputFile2;
        TLRPC$TL_theme tLRPC$TL_theme;
        TLRPC$TL_inputThemeSettings tLRPC$TL_inputThemeSettings = null;
        if (i == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC$InputFile tLRPC$InputFile3 = (TLRPC$InputFile) objArr[1];
            String str2 = this.uploadingAvatar;
            if (str2 == null || !str2.equals(str)) {
                String str3 = this.uploadingWallpaper;
                if (str3 == null || !str3.equals(str)) {
                    Object obj = this.uploadingThemes.get(str);
                    if (obj instanceof Theme.ThemeInfo) {
                        Theme.ThemeInfo themeInfo2 = (Theme.ThemeInfo) obj;
                        if (str.equals(themeInfo2.uploadingThumb)) {
                            themeInfo2.uploadedThumb = tLRPC$InputFile3;
                            themeInfo2.uploadingThumb = null;
                        } else if (str.equals(themeInfo2.uploadingFile)) {
                            themeInfo2.uploadedFile = tLRPC$InputFile3;
                            themeInfo2.uploadingFile = null;
                        }
                        tLRPC$InputFile = themeInfo2.uploadedThumb;
                        tLRPC$InputFile2 = themeInfo2.uploadedFile;
                        themeInfo = themeInfo2;
                        themeAccent = null;
                    } else if (obj instanceof Theme.ThemeAccent) {
                        Theme.ThemeAccent themeAccent2 = (Theme.ThemeAccent) obj;
                        if (str.equals(themeAccent2.uploadingThumb)) {
                            themeAccent2.uploadedThumb = tLRPC$InputFile3;
                            themeAccent2.uploadingThumb = null;
                        } else if (str.equals(themeAccent2.uploadingFile)) {
                            themeAccent2.uploadedFile = tLRPC$InputFile3;
                            themeAccent2.uploadingFile = null;
                        }
                        themeInfo = themeAccent2.parentTheme;
                        themeAccent = themeAccent2;
                        tLRPC$InputFile = themeAccent2.uploadedThumb;
                        tLRPC$InputFile2 = themeAccent2.uploadedFile;
                    } else {
                        tLRPC$InputFile = null;
                        tLRPC$InputFile2 = null;
                        themeInfo = null;
                        themeAccent = null;
                    }
                    this.uploadingThemes.remove(str);
                    if (tLRPC$InputFile2 != null && tLRPC$InputFile != null) {
                        new File(str);
                        TLRPC$TL_account_uploadTheme tLRPC$TL_account_uploadTheme = new TLRPC$TL_account_uploadTheme();
                        tLRPC$TL_account_uploadTheme.mime_type = "application/x-tgtheme-android";
                        tLRPC$TL_account_uploadTheme.file_name = "theme.attheme";
                        tLRPC$TL_account_uploadTheme.file = tLRPC$InputFile2;
                        tLRPC$InputFile2.name = "theme.attheme";
                        tLRPC$TL_account_uploadTheme.thumb = tLRPC$InputFile;
                        tLRPC$InputFile.name = "theme-preview.jpg";
                        tLRPC$TL_account_uploadTheme.flags |= 1;
                        if (themeAccent != null) {
                            themeAccent.uploadedFile = null;
                            themeAccent.uploadedThumb = null;
                            tLRPC$TL_theme = themeAccent.info;
                            tLRPC$TL_inputThemeSettings = new TLRPC$TL_inputThemeSettings();
                            tLRPC$TL_inputThemeSettings.base_theme = Theme.getBaseThemeByKey(themeInfo.name);
                            tLRPC$TL_inputThemeSettings.accent_color = themeAccent.accentColor;
                            int i3 = themeAccent.accentColor2;
                            if (i3 != 0) {
                                tLRPC$TL_inputThemeSettings.flags |= 8;
                                tLRPC$TL_inputThemeSettings.outbox_accent_color = i3;
                            }
                            int i4 = themeAccent.myMessagesAccentColor;
                            if (i4 != 0) {
                                tLRPC$TL_inputThemeSettings.message_colors.add(Integer.valueOf(i4));
                                tLRPC$TL_inputThemeSettings.flags |= 1;
                                int i5 = themeAccent.myMessagesGradientAccentColor1;
                                if (i5 != 0) {
                                    tLRPC$TL_inputThemeSettings.message_colors.add(Integer.valueOf(i5));
                                    int i6 = themeAccent.myMessagesGradientAccentColor2;
                                    if (i6 != 0) {
                                        tLRPC$TL_inputThemeSettings.message_colors.add(Integer.valueOf(i6));
                                        int i7 = themeAccent.myMessagesGradientAccentColor3;
                                        if (i7 != 0) {
                                            tLRPC$TL_inputThemeSettings.message_colors.add(Integer.valueOf(i7));
                                        }
                                    }
                                }
                                tLRPC$TL_inputThemeSettings.message_colors_animated = themeAccent.myMessagesAnimated;
                            }
                            tLRPC$TL_inputThemeSettings.flags |= 2;
                            tLRPC$TL_inputThemeSettings.wallpaper_settings = new TLRPC$TL_wallPaperSettings();
                            if (!TextUtils.isEmpty(themeAccent.patternSlug)) {
                                TLRPC$TL_inputWallPaperSlug tLRPC$TL_inputWallPaperSlug = new TLRPC$TL_inputWallPaperSlug();
                                tLRPC$TL_inputWallPaperSlug.slug = themeAccent.patternSlug;
                                tLRPC$TL_inputThemeSettings.wallpaper = tLRPC$TL_inputWallPaperSlug;
                                TLRPC$WallPaperSettings tLRPC$WallPaperSettings = tLRPC$TL_inputThemeSettings.wallpaper_settings;
                                tLRPC$WallPaperSettings.intensity = (int) (themeAccent.patternIntensity * 100.0f);
                                tLRPC$WallPaperSettings.flags |= 8;
                            } else {
                                TLRPC$TL_inputWallPaperNoFile tLRPC$TL_inputWallPaperNoFile = new TLRPC$TL_inputWallPaperNoFile();
                                tLRPC$TL_inputWallPaperNoFile.id = 0L;
                                tLRPC$TL_inputThemeSettings.wallpaper = tLRPC$TL_inputWallPaperNoFile;
                            }
                            TLRPC$WallPaperSettings tLRPC$WallPaperSettings2 = tLRPC$TL_inputThemeSettings.wallpaper_settings;
                            tLRPC$WallPaperSettings2.motion = themeAccent.patternMotion;
                            long j = themeAccent.backgroundOverrideColor;
                            if (j != 0) {
                                tLRPC$WallPaperSettings2.background_color = (int) j;
                                tLRPC$WallPaperSettings2.flags |= 1;
                            }
                            long j2 = themeAccent.backgroundGradientOverrideColor1;
                            if (j2 != 0) {
                                tLRPC$WallPaperSettings2.second_background_color = (int) j2;
                                tLRPC$WallPaperSettings2.flags |= 16;
                                tLRPC$WallPaperSettings2.rotation = AndroidUtilities.getWallpaperRotation(themeAccent.backgroundRotation, true);
                            }
                            long j3 = themeAccent.backgroundGradientOverrideColor2;
                            if (j3 != 0) {
                                TLRPC$WallPaperSettings tLRPC$WallPaperSettings3 = tLRPC$TL_inputThemeSettings.wallpaper_settings;
                                tLRPC$WallPaperSettings3.third_background_color = (int) j3;
                                tLRPC$WallPaperSettings3.flags |= 32;
                            }
                            long j4 = themeAccent.backgroundGradientOverrideColor3;
                            if (j4 != 0) {
                                TLRPC$WallPaperSettings tLRPC$WallPaperSettings4 = tLRPC$TL_inputThemeSettings.wallpaper_settings;
                                tLRPC$WallPaperSettings4.fourth_background_color = (int) j4;
                                tLRPC$WallPaperSettings4.flags |= 64;
                            }
                        } else {
                            themeInfo.uploadedFile = null;
                            themeInfo.uploadedThumb = null;
                            tLRPC$TL_theme = themeInfo.info;
                        }
                        final TLRPC$TL_theme tLRPC$TL_theme2 = tLRPC$TL_theme;
                        final TLRPC$TL_inputThemeSettings tLRPC$TL_inputThemeSettings2 = tLRPC$TL_inputThemeSettings;
                        getConnectionsManager().sendRequest(tLRPC$TL_account_uploadTheme, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                MessagesController.this.lambda$didReceivedNotification$32(tLRPC$TL_theme2, themeInfo, tLRPC$TL_inputThemeSettings2, themeAccent, tLObject, tLRPC$TL_error);
                            }
                        });
                        return;
                    }
                    return;
                }
                TLRPC$TL_account_uploadWallPaper tLRPC$TL_account_uploadWallPaper = new TLRPC$TL_account_uploadWallPaper();
                tLRPC$TL_account_uploadWallPaper.file = tLRPC$InputFile3;
                tLRPC$TL_account_uploadWallPaper.mime_type = "image/jpeg";
                final Theme.OverrideWallpaperInfo overrideWallpaperInfo = this.uploadingWallpaperInfo;
                final TLRPC$TL_wallPaperSettings tLRPC$TL_wallPaperSettings = new TLRPC$TL_wallPaperSettings();
                tLRPC$TL_wallPaperSettings.blur = overrideWallpaperInfo.isBlurred;
                tLRPC$TL_wallPaperSettings.motion = overrideWallpaperInfo.isMotion;
                tLRPC$TL_account_uploadWallPaper.settings = tLRPC$TL_wallPaperSettings;
                getConnectionsManager().sendRequest(tLRPC$TL_account_uploadWallPaper, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$didReceivedNotification$26(overrideWallpaperInfo, tLRPC$TL_wallPaperSettings, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            TLRPC$TL_photos_uploadProfilePhoto tLRPC$TL_photos_uploadProfilePhoto = new TLRPC$TL_photos_uploadProfilePhoto();
            tLRPC$TL_photos_uploadProfilePhoto.file = tLRPC$InputFile3;
            tLRPC$TL_photos_uploadProfilePhoto.flags |= 1;
            getConnectionsManager().sendRequest(tLRPC$TL_photos_uploadProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$didReceivedNotification$24(tLObject, tLRPC$TL_error);
                }
            });
        } else if (i == NotificationCenter.fileUploadFailed) {
            String str4 = (String) objArr[0];
            String str5 = this.uploadingAvatar;
            if (str5 == null || !str5.equals(str4)) {
                String str6 = this.uploadingWallpaper;
                if (str6 == null || !str6.equals(str4)) {
                    Object remove = this.uploadingThemes.remove(str4);
                    if (remove instanceof Theme.ThemeInfo) {
                        Theme.ThemeInfo themeInfo3 = (Theme.ThemeInfo) remove;
                        themeInfo3.uploadedFile = null;
                        themeInfo3.uploadedThumb = null;
                        getNotificationCenter().postNotificationName(NotificationCenter.themeUploadError, themeInfo3, 0);
                    } else if (remove instanceof Theme.ThemeAccent) {
                        Theme.ThemeAccent themeAccent3 = (Theme.ThemeAccent) remove;
                        themeAccent3.uploadingThumb = null;
                        getNotificationCenter().postNotificationName(NotificationCenter.themeUploadError, themeAccent3.parentTheme, themeAccent3);
                    }
                } else {
                    this.uploadingWallpaper = null;
                    this.uploadingWallpaperInfo = null;
                }
            } else {
                this.uploadingAvatar = null;
            }
        } else if (i == NotificationCenter.messageReceivedByServer) {
            if (!((Boolean) objArr[6]).booleanValue()) {
                Integer num = (Integer) objArr[0];
                Integer num2 = (Integer) objArr[1];
                Long l = (Long) objArr[3];
                MessageObject messageObject2 = this.dialogMessage.get(l.longValue());
                if (messageObject2 != null && (messageObject2.getId() == num.intValue() || messageObject2.messageOwner.local_id == num.intValue())) {
                    messageObject2.messageOwner.id = num2.intValue();
                    messageObject2.messageOwner.send_state = 0;
                }
                TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(l.longValue());
                if (tLRPC$Dialog != null && tLRPC$Dialog.top_message == num.intValue()) {
                    tLRPC$Dialog.top_message = num2.intValue();
                    getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
                }
                MessageObject messageObject3 = this.dialogMessagesByIds.get(num.intValue());
                if (messageObject3 != null) {
                    this.dialogMessagesByIds.remove(num.intValue());
                    this.dialogMessagesByIds.put(num2.intValue(), messageObject3);
                }
                if (DialogObject.isChatDialog(l.longValue())) {
                    TLRPC$ChatFull tLRPC$ChatFull = this.fullChats.get(-l.longValue());
                    TLRPC$Chat chat = getChat(Long.valueOf(-l.longValue()));
                    if (chat != null && !ChatObject.hasAdminRights(chat) && tLRPC$ChatFull != null && tLRPC$ChatFull.slowmode_seconds != 0) {
                        tLRPC$ChatFull.slowmode_next_send_date = getConnectionsManager().getCurrentTime() + tLRPC$ChatFull.slowmode_seconds;
                        tLRPC$ChatFull.flags |= 262144;
                        getMessagesStorage().updateChatInfo(tLRPC$ChatFull, false);
                    }
                }
            }
        } else if (i == NotificationCenter.updateMessageMedia) {
            TLRPC$Message tLRPC$Message = (TLRPC$Message) objArr[0];
            if (tLRPC$Message.peer_id.channel_id == 0 && (messageObject = this.dialogMessagesByIds.get(tLRPC$Message.id)) != null) {
                messageObject.messageOwner.media = tLRPC$Message.media;
                TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
                if (tLRPC$MessageMedia.ttl_seconds == 0) {
                    return;
                }
                if ((tLRPC$MessageMedia.photo instanceof TLRPC$TL_photoEmpty) || (tLRPC$MessageMedia.document instanceof TLRPC$TL_documentEmpty)) {
                    messageObject.setType();
                    getNotificationCenter().postNotificationName(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
                }
            }
        }
    }

    public void lambda$didReceivedNotification$24(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$User user = getUser(Long.valueOf(getUserConfig().getClientUserId()));
            if (user == null) {
                user = getUserConfig().getCurrentUser();
                putUser(user, true);
            } else {
                getUserConfig().setCurrentUser(user);
            }
            if (user != null) {
                TLRPC$TL_photos_photo tLRPC$TL_photos_photo = (TLRPC$TL_photos_photo) tLObject;
                ArrayList<TLRPC$PhotoSize> arrayList = tLRPC$TL_photos_photo.photo.sizes;
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
                TLRPC$TL_userProfilePhoto tLRPC$TL_userProfilePhoto = new TLRPC$TL_userProfilePhoto();
                user.photo = tLRPC$TL_userProfilePhoto;
                tLRPC$TL_userProfilePhoto.photo_id = tLRPC$TL_photos_photo.photo.id;
                if (closestPhotoSizeWithSize != null) {
                    tLRPC$TL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                }
                if (closestPhotoSizeWithSize2 != null) {
                    tLRPC$TL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                }
                getMessagesStorage().clearUserPhotos(user.id);
                ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$didReceivedNotification$23();
                    }
                });
            }
        }
    }

    public void lambda$didReceivedNotification$23() {
        getNotificationCenter().postNotificationName(NotificationCenter.mainUserInfoChanged, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_AVATAR));
        getUserConfig().saveConfig(true);
    }

    public void lambda$didReceivedNotification$26(final Theme.OverrideWallpaperInfo overrideWallpaperInfo, final TLRPC$TL_wallPaperSettings tLRPC$TL_wallPaperSettings, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        final TLRPC$WallPaper tLRPC$WallPaper = (TLRPC$WallPaper) tLObject;
        final File file = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.originalFileName);
        if (tLRPC$WallPaper != null) {
            try {
                AndroidUtilities.copyFile(file, FileLoader.getPathToAttach(tLRPC$WallPaper.document, true));
            } catch (Exception unused) {
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didReceivedNotification$25(tLRPC$WallPaper, tLRPC$TL_wallPaperSettings, overrideWallpaperInfo, file);
            }
        });
    }

    public void lambda$didReceivedNotification$25(TLRPC$WallPaper tLRPC$WallPaper, TLRPC$TL_wallPaperSettings tLRPC$TL_wallPaperSettings, Theme.OverrideWallpaperInfo overrideWallpaperInfo, File file) {
        if (this.uploadingWallpaper != null && tLRPC$WallPaper != null) {
            tLRPC$WallPaper.settings = tLRPC$TL_wallPaperSettings;
            tLRPC$WallPaper.flags |= 4;
            overrideWallpaperInfo.slug = tLRPC$WallPaper.slug;
            overrideWallpaperInfo.saveOverrideWallpaper();
            ArrayList<TLRPC$WallPaper> arrayList = new ArrayList<>();
            arrayList.add(tLRPC$WallPaper);
            getMessagesStorage().putWallpapers(arrayList, 2);
            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$WallPaper.document.thumbs, 320);
            if (closestPhotoSizeWithSize != null) {
                ImageLoader.getInstance().replaceImageInCache(Utilities.MD5(file.getAbsolutePath()) + "@100_100", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$WallPaper.document), false);
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.wallpapersNeedReload, tLRPC$WallPaper.slug);
        }
    }

    public void lambda$didReceivedNotification$32(TLRPC$TL_theme tLRPC$TL_theme, final Theme.ThemeInfo themeInfo, TLRPC$TL_inputThemeSettings tLRPC$TL_inputThemeSettings, final Theme.ThemeAccent themeAccent, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        String name = tLRPC$TL_theme != null ? tLRPC$TL_theme.title : themeInfo.getName();
        int lastIndexOf = name.lastIndexOf(".attheme");
        if (lastIndexOf > 0) {
            name = name.substring(0, lastIndexOf);
        }
        if (tLObject != null) {
            TLRPC$Document tLRPC$Document = (TLRPC$Document) tLObject;
            TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
            tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
            tLRPC$TL_inputDocument.id = tLRPC$Document.id;
            tLRPC$TL_inputDocument.file_reference = tLRPC$Document.file_reference;
            if (tLRPC$TL_theme == null || !tLRPC$TL_theme.creator) {
                TLRPC$TL_account_createTheme tLRPC$TL_account_createTheme = new TLRPC$TL_account_createTheme();
                tLRPC$TL_account_createTheme.document = tLRPC$TL_inputDocument;
                tLRPC$TL_account_createTheme.flags |= 4;
                tLRPC$TL_account_createTheme.slug = (tLRPC$TL_theme == null || TextUtils.isEmpty(tLRPC$TL_theme.slug)) ? "" : tLRPC$TL_theme.slug;
                tLRPC$TL_account_createTheme.title = name;
                if (tLRPC$TL_inputThemeSettings != null) {
                    tLRPC$TL_account_createTheme.settings = tLRPC$TL_inputThemeSettings;
                    tLRPC$TL_account_createTheme.flags |= 8;
                }
                getConnectionsManager().sendRequest(tLRPC$TL_account_createTheme, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                        MessagesController.this.lambda$didReceivedNotification$28(themeInfo, themeAccent, tLObject2, tLRPC$TL_error2);
                    }
                });
                return;
            }
            TLRPC$TL_account_updateTheme tLRPC$TL_account_updateTheme = new TLRPC$TL_account_updateTheme();
            TLRPC$TL_inputTheme tLRPC$TL_inputTheme = new TLRPC$TL_inputTheme();
            tLRPC$TL_inputTheme.id = tLRPC$TL_theme.id;
            tLRPC$TL_inputTheme.access_hash = tLRPC$TL_theme.access_hash;
            tLRPC$TL_account_updateTheme.theme = tLRPC$TL_inputTheme;
            tLRPC$TL_account_updateTheme.slug = tLRPC$TL_theme.slug;
            int i = tLRPC$TL_account_updateTheme.flags | 1;
            tLRPC$TL_account_updateTheme.flags = i;
            tLRPC$TL_account_updateTheme.title = name;
            int i2 = i | 2;
            tLRPC$TL_account_updateTheme.flags = i2;
            tLRPC$TL_account_updateTheme.document = tLRPC$TL_inputDocument;
            int i3 = i2 | 4;
            tLRPC$TL_account_updateTheme.flags = i3;
            if (tLRPC$TL_inputThemeSettings != null) {
                tLRPC$TL_account_updateTheme.settings = tLRPC$TL_inputThemeSettings;
                tLRPC$TL_account_updateTheme.flags = i3 | 8;
            }
            tLRPC$TL_account_updateTheme.format = "android";
            getConnectionsManager().sendRequest(tLRPC$TL_account_updateTheme, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    MessagesController.this.lambda$didReceivedNotification$30(themeInfo, themeAccent, tLObject2, tLRPC$TL_error2);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didReceivedNotification$31(themeInfo, themeAccent);
            }
        });
    }

    public void lambda$didReceivedNotification$28(final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didReceivedNotification$27(tLObject, themeInfo, themeAccent);
            }
        });
    }

    public void lambda$didReceivedNotification$27(TLObject tLObject, Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        if (tLObject instanceof TLRPC$TL_theme) {
            Theme.setThemeUploadInfo(themeInfo, themeAccent, (TLRPC$TL_theme) tLObject, this.currentAccount, false);
            installTheme(themeInfo, themeAccent, themeInfo == Theme.getCurrentNightTheme());
            getNotificationCenter().postNotificationName(NotificationCenter.themeUploadedToServer, themeInfo, themeAccent);
            return;
        }
        getNotificationCenter().postNotificationName(NotificationCenter.themeUploadError, themeInfo, themeAccent);
    }

    public void lambda$didReceivedNotification$30(final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didReceivedNotification$29(tLObject, themeInfo, themeAccent);
            }
        });
    }

    public void lambda$didReceivedNotification$29(TLObject tLObject, Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        if (tLObject instanceof TLRPC$TL_theme) {
            Theme.setThemeUploadInfo(themeInfo, themeAccent, (TLRPC$TL_theme) tLObject, this.currentAccount, false);
            getNotificationCenter().postNotificationName(NotificationCenter.themeUploadedToServer, themeInfo, themeAccent);
            return;
        }
        getNotificationCenter().postNotificationName(NotificationCenter.themeUploadError, themeInfo, themeAccent);
    }

    public void lambda$didReceivedNotification$31(Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        getNotificationCenter().postNotificationName(NotificationCenter.themeUploadError, themeInfo, themeAccent);
    }

    public void cleanup() {
        getContactsController().cleanup();
        MediaController.getInstance().cleanup();
        getNotificationsController().cleanup();
        getSendMessagesHelper().cleanup();
        getSecretChatHelper().cleanup();
        getLocationController().cleanup();
        getMediaDataController().cleanup();
        this.showFiltersTooltip = false;
        DialogsActivity.dialogsLoaded[this.currentAccount] = false;
        this.notificationsPreferences.edit().clear().commit();
        this.emojiPreferences.edit().putLong("lastGifLoadTime", 0L).putLong("lastStickersLoadTime", 0L).putLong("lastStickersLoadTimeMask", 0L).putLong("lastStickersLoadTimeFavs", 0L).commit();
        this.mainPreferences.edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("gifhint").remove("reminderhint").remove("soundHint").remove("dcDomainName2").remove("webFileDatacenterId").remove("themehint").remove("showFiltersTooltip").commit();
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor editor = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        AppWidgetManager appWidgetManager = null;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("account") && ((Integer) entry.getValue()).intValue() == this.currentAccount) {
                int intValue = Utilities.parseInt(key).intValue();
                if (editor == null) {
                    editor = sharedPreferences.edit();
                    appWidgetManager = AppWidgetManager.getInstance(ApplicationLoader.applicationContext);
                }
                editor.putBoolean("deleted" + intValue, true);
                if (sharedPreferences.getInt("type" + intValue, 0) == 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(intValue));
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(intValue));
                }
            }
        }
        if (editor != null) {
            editor.commit();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ChatsWidgetProvider.updateWidget(ApplicationLoader.applicationContext, appWidgetManager, ((Integer) arrayList.get(i)).intValue());
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ContactsWidgetProvider.updateWidget(ApplicationLoader.applicationContext, appWidgetManager, ((Integer) arrayList2.get(i2)).intValue());
            }
        }
        this.lastScheduledServerQueryTime.clear();
        this.lastServerQueryTime.clear();
        this.reloadingWebpages.clear();
        this.reloadingWebpagesPending.clear();
        this.reloadingScheduledWebpages.clear();
        this.reloadingScheduledWebpagesPending.clear();
        this.sponsoredMessages.clear();
        this.sendAsPeers.clear();
        this.dialogs_dict.clear();
        this.dialogs_read_inbox_max.clear();
        this.loadingPinnedDialogs.clear();
        this.dialogs_read_outbox_max.clear();
        this.exportedChats.clear();
        this.fullUsers.clear();
        this.fullChats.clear();
        this.activeVoiceChatsMap.clear();
        this.loadingGroupCalls.clear();
        this.groupCallsByChatId.clear();
        this.dialogsByFolder.clear();
        this.unreadUnmutedDialogs = 0;
        this.joiningToChannels.clear();
        this.migratedChats.clear();
        this.channelViewsToSend.clear();
        this.pollsToCheck.clear();
        this.pollsToCheckSize = 0;
        this.dialogsServerOnly.clear();
        this.dialogsForward.clear();
        this.allDialogs.clear();
        this.dialogsLoadedTillDate = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.dialogsCanAddUsers.clear();
        this.dialogsMyChannels.clear();
        this.dialogsMyGroups.clear();
        this.dialogsChannelsOnly.clear();
        this.dialogsGroupsOnly.clear();
        this.dialogsUsersOnly.clear();
        this.dialogsForBlock.clear();
        this.dialogMessagesByIds.clear();
        this.dialogMessagesByRandomIds.clear();
        this.channelAdmins.clear();
        this.loadingChannelAdmins.clear();
        this.users.clear();
        this.objectsByUsernames.clear();
        this.chats.clear();
        this.dialogMessage.clear();
        this.deletedHistory.clear();
        this.printingUsers.clear();
        this.printingStrings.clear();
        this.printingStringsTypes.clear();
        this.onlinePrivacy.clear();
        this.loadingPeerSettings.clear();
        this.deletingDialogs.clear();
        this.clearingHistoryDialogs.clear();
        this.lastPrintingStringCount = 0;
        DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
        dialogFilterArr[1] = null;
        dialogFilterArr[0] = null;
        this.dialogFilters.clear();
        this.dialogFiltersById.clear();
        this.loadingSuggestedFilters = false;
        this.loadingRemoteFilters = false;
        this.suggestedFilters.clear();
        this.gettingAppChangelog = false;
        this.dialogFiltersLoaded = false;
        this.ignoreSetOnline = false;
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$cleanup$33();
            }
        });
        this.createdDialogMainThreadIds.clear();
        this.visibleDialogMainThreadIds.clear();
        this.visibleScheduledDialogMainThreadIds.clear();
        this.blockePeers.clear();
        int i3 = 0;
        while (true) {
            LongSparseArray<SparseArray<Boolean>>[] longSparseArrayArr = this.sendingTypings;
            if (i3 >= longSparseArrayArr.length) {
                break;
            }
            if (longSparseArrayArr[i3] != null) {
                longSparseArrayArr[i3].clear();
            }
            i3++;
        }
        this.loadingFullUsers.clear();
        this.loadedFullUsers.clear();
        this.reloadingMessages.clear();
        this.loadingFullChats.clear();
        this.loadingFullParticipants.clear();
        this.loadedFullParticipants.clear();
        this.loadedFullChats.clear();
        this.dialogsLoaded = false;
        this.nextDialogsCacheOffset.clear();
        this.loadingDialogs.clear();
        this.dialogsEndReached.clear();
        this.serverDialogsEndReached.clear();
        this.loadingAppConfig = false;
        this.checkingTosUpdate = false;
        this.nextTosCheckTime = 0;
        this.nextPromoInfoCheckTime = 0;
        this.checkingPromoInfo = false;
        this.loadingUnreadDialogs = false;
        this.currentDeletingTaskTime = 0;
        this.currentDeletingTaskMids = null;
        this.currentDeletingTaskMediaMids = null;
        this.gettingNewDeleteTask = false;
        this.loadingBlockedPeers = false;
        this.totalBlockedCount = -1;
        this.blockedEndReached = false;
        this.firstGettingTask = false;
        this.updatingState = false;
        this.resetingDialogs = false;
        this.lastStatusUpdateTime = 0L;
        this.offlineSent = false;
        this.registeringForPush = false;
        this.getDifferenceFirstSync = true;
        this.uploadingAvatar = null;
        this.uploadingWallpaper = null;
        this.uploadingWallpaperInfo = null;
        this.uploadingThemes.clear();
        this.gettingChatInviters.clear();
        this.statusRequest = 0;
        this.statusSettingState = 0;
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$cleanup$34();
            }
        });
        if (this.currentDeleteTaskRunnable != null) {
            Utilities.stageQueue.cancelRunnable(this.currentDeleteTaskRunnable);
            this.currentDeleteTaskRunnable = null;
        }
        addSupportUser();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$cleanup$35();
            }
        });
    }

    public void lambda$cleanup$33() {
        this.readTasks.clear();
        this.readTasksMap.clear();
        this.repliesReadTasks.clear();
        this.threadsReadTasksMap.clear();
        this.updatesQueueSeq.clear();
        this.updatesQueuePts.clear();
        this.updatesQueueQts.clear();
        this.gettingUnknownChannels.clear();
        this.gettingUnknownDialogs.clear();
        this.updatesStartWaitTimeSeq = 0L;
        this.updatesStartWaitTimePts = 0L;
        this.updatesStartWaitTimeQts = 0L;
        this.createdDialogIds.clear();
        this.createdScheduledDialogIds.clear();
        this.gettingDifference = false;
        this.resetDialogsPinned = null;
        this.resetDialogsAll = null;
    }

    public void lambda$cleanup$34() {
        getConnectionsManager().setIsUpdating(false);
        this.updatesQueueChannels.clear();
        this.updatesStartWaitTimeChannels.clear();
        this.gettingDifferenceChannels.clear();
        this.channelsPts.clear();
        this.shortPollChannels.clear();
        this.needShortPollChannels.clear();
        this.shortPollOnlines.clear();
        this.needShortPollOnlines.clear();
    }

    public void lambda$cleanup$35() {
        getNotificationCenter().postNotificationName(NotificationCenter.suggestedFiltersLoaded, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public boolean isChatNoForwards(TLRPC$Chat tLRPC$Chat) {
        TLRPC$Chat chat;
        if (tLRPC$Chat == null) {
            return false;
        }
        TLRPC$InputChannel tLRPC$InputChannel = tLRPC$Chat.migrated_to;
        if (tLRPC$InputChannel == null || (chat = getChat(Long.valueOf(tLRPC$InputChannel.channel_id))) == null) {
            return tLRPC$Chat.noforwards;
        }
        return chat.noforwards;
    }

    public boolean isChatNoForwards(long j) {
        return isChatNoForwards(getChat(Long.valueOf(j)));
    }

    public TLRPC$User getUser(Long l) {
        if (l.longValue() == 0) {
            return UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        return this.users.get(l);
    }

    public TLObject getUserOrChat(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.objectsByUsernames.get(str.toLowerCase());
    }

    public ConcurrentHashMap<Long, TLRPC$User> getUsers() {
        return this.users;
    }

    public ConcurrentHashMap<Long, TLRPC$Chat> getChats() {
        return this.chats;
    }

    public TLRPC$Chat getChat(Long l) {
        return this.chats.get(l);
    }

    public TLRPC$EncryptedChat getEncryptedChat(Integer num) {
        return this.encryptedChats.get(num);
    }

    public TLRPC$EncryptedChat getEncryptedChatDB(int i, boolean z) {
        TLRPC$EncryptedChat tLRPC$EncryptedChat = this.encryptedChats.get(Integer.valueOf(i));
        if (tLRPC$EncryptedChat != null) {
            if (!z) {
                return tLRPC$EncryptedChat;
            }
            if (!(tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChatWaiting) && !(tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChatRequested)) {
                return tLRPC$EncryptedChat;
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList<TLObject> arrayList = new ArrayList<>();
        getMessagesStorage().getEncryptedChat(i, countDownLatch, arrayList);
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (arrayList.size() != 2) {
            return tLRPC$EncryptedChat;
        }
        TLRPC$EncryptedChat tLRPC$EncryptedChat2 = (TLRPC$EncryptedChat) arrayList.get(0);
        putEncryptedChat(tLRPC$EncryptedChat2, false);
        putUser((TLRPC$User) arrayList.get(1), true);
        return tLRPC$EncryptedChat2;
    }

    public boolean isDialogVisible(long j, boolean z) {
        return (z ? this.visibleScheduledDialogMainThreadIds : this.visibleDialogMainThreadIds).contains(Long.valueOf(j));
    }

    public void setLastVisibleDialogId(long j, boolean z, boolean z2) {
        ArrayList<Long> arrayList = z ? this.visibleScheduledDialogMainThreadIds : this.visibleDialogMainThreadIds;
        if (!z2) {
            arrayList.remove(Long.valueOf(j));
        } else if (!arrayList.contains(Long.valueOf(j))) {
            arrayList.add(Long.valueOf(j));
        }
    }

    public void setLastCreatedDialogId(final long j, final boolean z, final boolean z2) {
        if (!z) {
            ArrayList<Long> arrayList = this.createdDialogMainThreadIds;
            if (!z2) {
                arrayList.remove(Long.valueOf(j));
                SparseArray<MessageObject> sparseArray = this.pollsToCheck.get(j);
                if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        sparseArray.valueAt(i).pollVisibleOnScreen = false;
                    }
                }
            } else if (!arrayList.contains(Long.valueOf(j))) {
                arrayList.add(Long.valueOf(j));
            } else {
                return;
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$setLastCreatedDialogId$36(z, z2, j);
            }
        });
    }

    public void lambda$setLastCreatedDialogId$36(boolean z, boolean z2, long j) {
        ArrayList<Long> arrayList = z ? this.createdScheduledDialogIds : this.createdDialogIds;
        if (!z2) {
            arrayList.remove(Long.valueOf(j));
        } else if (!arrayList.contains(Long.valueOf(j))) {
            arrayList.add(Long.valueOf(j));
        }
    }

    public TLRPC$TL_chatInviteExported getExportedInvite(long j) {
        return this.exportedChats.get(j);
    }

    public boolean putUser(org.telegram.tgnet.TLRPC$User r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.putUser(org.telegram.tgnet.TLRPC$User, boolean):boolean");
    }

    public void putUsers(ArrayList<TLRPC$User> arrayList, boolean z) {
        if (!(arrayList == null || arrayList.isEmpty())) {
            int size = arrayList.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                if (putUser(arrayList.get(i), z)) {
                    z2 = true;
                }
            }
            if (z2) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$putUsers$37();
                    }
                });
            }
        }
    }

    public void lambda$putUsers$37() {
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_STATUS));
    }

    public void putChat(final TLRPC$Chat tLRPC$Chat, boolean z) {
        TLRPC$Chat tLRPC$Chat2;
        if (tLRPC$Chat != null && (tLRPC$Chat2 = this.chats.get(Long.valueOf(tLRPC$Chat.id))) != tLRPC$Chat) {
            if (tLRPC$Chat2 != null && !TextUtils.isEmpty(tLRPC$Chat2.username)) {
                this.objectsByUsernames.remove(tLRPC$Chat2.username.toLowerCase());
            }
            if (!TextUtils.isEmpty(tLRPC$Chat.username)) {
                this.objectsByUsernames.put(tLRPC$Chat.username.toLowerCase(), tLRPC$Chat);
            }
            if (!tLRPC$Chat.min) {
                if (!z) {
                    if (tLRPC$Chat2 != null) {
                        if (tLRPC$Chat.version != tLRPC$Chat2.version) {
                            this.loadedFullChats.remove(Long.valueOf(tLRPC$Chat.id));
                        }
                        int i = tLRPC$Chat2.participants_count;
                        if (i != 0 && tLRPC$Chat.participants_count == 0) {
                            tLRPC$Chat.participants_count = i;
                            tLRPC$Chat.flags |= 131072;
                        }
                        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights = tLRPC$Chat2.banned_rights;
                        int i2 = 0;
                        int i3 = tLRPC$TL_chatBannedRights != null ? tLRPC$TL_chatBannedRights.flags : 0;
                        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2 = tLRPC$Chat.banned_rights;
                        int i4 = tLRPC$TL_chatBannedRights2 != null ? tLRPC$TL_chatBannedRights2.flags : 0;
                        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights3 = tLRPC$Chat2.default_banned_rights;
                        int i5 = tLRPC$TL_chatBannedRights3 != null ? tLRPC$TL_chatBannedRights3.flags : 0;
                        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights4 = tLRPC$Chat.default_banned_rights;
                        if (tLRPC$TL_chatBannedRights4 != null) {
                            i2 = tLRPC$TL_chatBannedRights4.flags;
                        }
                        tLRPC$Chat2.default_banned_rights = tLRPC$TL_chatBannedRights4;
                        if (tLRPC$TL_chatBannedRights4 == null) {
                            tLRPC$Chat2.flags &= -262145;
                        } else {
                            tLRPC$Chat2.flags = 262144 | tLRPC$Chat2.flags;
                        }
                        tLRPC$Chat2.banned_rights = tLRPC$TL_chatBannedRights2;
                        if (tLRPC$TL_chatBannedRights2 == null) {
                            tLRPC$Chat2.flags &= -32769;
                        } else {
                            tLRPC$Chat2.flags |= 32768;
                        }
                        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = tLRPC$Chat.admin_rights;
                        tLRPC$Chat2.admin_rights = tLRPC$TL_chatAdminRights;
                        if (tLRPC$TL_chatAdminRights == null) {
                            tLRPC$Chat2.flags &= -16385;
                        } else {
                            tLRPC$Chat2.flags |= 16384;
                        }
                        if (!(i3 == i4 && i5 == i2)) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    MessagesController.this.lambda$putChat$38(tLRPC$Chat);
                                }
                            });
                        }
                    }
                    this.chats.put(Long.valueOf(tLRPC$Chat.id), tLRPC$Chat);
                } else if (tLRPC$Chat2 == null) {
                    this.chats.put(Long.valueOf(tLRPC$Chat.id), tLRPC$Chat);
                } else if (tLRPC$Chat2.min) {
                    tLRPC$Chat.title = tLRPC$Chat2.title;
                    tLRPC$Chat.photo = tLRPC$Chat2.photo;
                    tLRPC$Chat.broadcast = tLRPC$Chat2.broadcast;
                    tLRPC$Chat.verified = tLRPC$Chat2.verified;
                    tLRPC$Chat.megagroup = tLRPC$Chat2.megagroup;
                    TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights5 = tLRPC$Chat2.default_banned_rights;
                    if (tLRPC$TL_chatBannedRights5 != null) {
                        tLRPC$Chat.default_banned_rights = tLRPC$TL_chatBannedRights5;
                        tLRPC$Chat.flags |= 262144;
                    }
                    TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2 = tLRPC$Chat2.admin_rights;
                    if (tLRPC$TL_chatAdminRights2 != null) {
                        tLRPC$Chat.admin_rights = tLRPC$TL_chatAdminRights2;
                        tLRPC$Chat.flags |= 16384;
                    }
                    TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights6 = tLRPC$Chat2.banned_rights;
                    if (tLRPC$TL_chatBannedRights6 != null) {
                        tLRPC$Chat.banned_rights = tLRPC$TL_chatBannedRights6;
                        tLRPC$Chat.flags |= 32768;
                    }
                    String str = tLRPC$Chat2.username;
                    if (str != null) {
                        tLRPC$Chat.username = str;
                        tLRPC$Chat.flags |= 64;
                    } else {
                        tLRPC$Chat.flags &= -65;
                        tLRPC$Chat.username = null;
                    }
                    int i6 = tLRPC$Chat2.participants_count;
                    if (i6 != 0 && tLRPC$Chat.participants_count == 0) {
                        tLRPC$Chat.participants_count = i6;
                        tLRPC$Chat.flags |= 131072;
                    }
                    this.chats.put(Long.valueOf(tLRPC$Chat.id), tLRPC$Chat);
                }
                addOrRemoveActiveVoiceChat(tLRPC$Chat);
            } else if (tLRPC$Chat2 == null) {
                this.chats.put(Long.valueOf(tLRPC$Chat.id), tLRPC$Chat);
                addOrRemoveActiveVoiceChat(tLRPC$Chat);
            } else if (!z) {
                tLRPC$Chat2.title = tLRPC$Chat.title;
                tLRPC$Chat2.photo = tLRPC$Chat.photo;
                tLRPC$Chat2.broadcast = tLRPC$Chat.broadcast;
                tLRPC$Chat2.verified = tLRPC$Chat.verified;
                tLRPC$Chat2.megagroup = tLRPC$Chat.megagroup;
                tLRPC$Chat2.call_not_empty = tLRPC$Chat.call_not_empty;
                tLRPC$Chat2.call_active = tLRPC$Chat.call_active;
                TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights7 = tLRPC$Chat.default_banned_rights;
                if (tLRPC$TL_chatBannedRights7 != null) {
                    tLRPC$Chat2.default_banned_rights = tLRPC$TL_chatBannedRights7;
                    tLRPC$Chat2.flags |= 262144;
                }
                TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights3 = tLRPC$Chat.admin_rights;
                if (tLRPC$TL_chatAdminRights3 != null) {
                    tLRPC$Chat2.admin_rights = tLRPC$TL_chatAdminRights3;
                    tLRPC$Chat2.flags |= 16384;
                }
                TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights8 = tLRPC$Chat.banned_rights;
                if (tLRPC$TL_chatBannedRights8 != null) {
                    tLRPC$Chat2.banned_rights = tLRPC$TL_chatBannedRights8;
                    tLRPC$Chat2.flags |= 32768;
                }
                String str2 = tLRPC$Chat.username;
                if (str2 != null) {
                    tLRPC$Chat2.username = str2;
                    tLRPC$Chat2.flags |= 64;
                } else {
                    tLRPC$Chat2.flags &= -65;
                    tLRPC$Chat2.username = null;
                }
                int i7 = tLRPC$Chat.participants_count;
                if (i7 != 0) {
                    tLRPC$Chat2.participants_count = i7;
                }
                addOrRemoveActiveVoiceChat(tLRPC$Chat2);
            }
        }
    }

    public void lambda$putChat$38(TLRPC$Chat tLRPC$Chat) {
        getNotificationCenter().postNotificationName(NotificationCenter.channelRightsUpdated, tLRPC$Chat);
    }

    public void putChats(ArrayList<TLRPC$Chat> arrayList, boolean z) {
        if (!(arrayList == null || arrayList.isEmpty())) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                putChat(arrayList.get(i), z);
            }
        }
    }

    private void addOrRemoveActiveVoiceChat(final TLRPC$Chat tLRPC$Chat) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addOrRemoveActiveVoiceChat$39(tLRPC$Chat);
                }
            });
        } else {
            lambda$addOrRemoveActiveVoiceChat$39(tLRPC$Chat);
        }
    }

    public void lambda$addOrRemoveActiveVoiceChat$39(TLRPC$Chat tLRPC$Chat) {
        TLRPC$Chat tLRPC$Chat2 = this.activeVoiceChatsMap.get(Long.valueOf(tLRPC$Chat.id));
        if (!tLRPC$Chat.call_active || !tLRPC$Chat.call_not_empty || tLRPC$Chat.migrated_to != null || ChatObject.isNotInChat(tLRPC$Chat)) {
            if (tLRPC$Chat2 != null) {
                this.activeVoiceChatsMap.remove(Long.valueOf(tLRPC$Chat.id));
                getNotificationCenter().postNotificationName(NotificationCenter.activeGroupCallsUpdated, new Object[0]);
            }
        } else if (tLRPC$Chat2 == null) {
            this.activeVoiceChatsMap.put(Long.valueOf(tLRPC$Chat.id), tLRPC$Chat);
            getNotificationCenter().postNotificationName(NotificationCenter.activeGroupCallsUpdated, new Object[0]);
        }
    }

    public ArrayList<Long> getActiveGroupCalls() {
        return new ArrayList<>(this.activeVoiceChatsMap.keySet());
    }

    public void setReferer(String str) {
        if (str != null) {
            this.installReferer = str;
            this.mainPreferences.edit().putString("installReferer", str).commit();
        }
    }

    public void putEncryptedChat(TLRPC$EncryptedChat tLRPC$EncryptedChat, boolean z) {
        if (tLRPC$EncryptedChat != null) {
            if (z) {
                this.encryptedChats.putIfAbsent(Integer.valueOf(tLRPC$EncryptedChat.id), tLRPC$EncryptedChat);
            } else {
                this.encryptedChats.put(Integer.valueOf(tLRPC$EncryptedChat.id), tLRPC$EncryptedChat);
            }
        }
    }

    public void putEncryptedChats(ArrayList<TLRPC$EncryptedChat> arrayList, boolean z) {
        if (!(arrayList == null || arrayList.isEmpty())) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                putEncryptedChat(arrayList.get(i), z);
            }
        }
    }

    public TLRPC$UserFull getUserFull(long j) {
        return this.fullUsers.get(j);
    }

    public TLRPC$ChatFull getChatFull(long j) {
        return this.fullChats.get(j);
    }

    public void putGroupCall(long j, ChatObject.Call call) {
        this.groupCalls.put(call.call.id, call);
        this.groupCallsByChatId.put(j, call);
        TLRPC$ChatFull chatFull = getChatFull(j);
        if (chatFull != null) {
            chatFull.call = call.getInputGroupCall();
        }
        getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(j), Long.valueOf(call.call.id), Boolean.FALSE);
        loadFullChat(j, 0, true);
    }

    public ChatObject.Call getGroupCall(long j, boolean z) {
        return getGroupCall(j, z, null);
    }

    public ChatObject.Call getGroupCall(final long j, boolean z, final Runnable runnable) {
        TLRPC$TL_inputGroupCall tLRPC$TL_inputGroupCall;
        TLRPC$ChatFull chatFull = getChatFull(j);
        if (chatFull == null || (tLRPC$TL_inputGroupCall = chatFull.call) == null) {
            return null;
        }
        ChatObject.Call call = this.groupCalls.get(tLRPC$TL_inputGroupCall.id);
        if (call == null && z && !this.loadingGroupCalls.contains(Long.valueOf(j))) {
            this.loadingGroupCalls.add(Long.valueOf(j));
            if (chatFull.call != null) {
                TLRPC$TL_phone_getGroupCall tLRPC$TL_phone_getGroupCall = new TLRPC$TL_phone_getGroupCall();
                tLRPC$TL_phone_getGroupCall.call = chatFull.call;
                tLRPC$TL_phone_getGroupCall.limit = 20;
                getConnectionsManager().sendRequest(tLRPC$TL_phone_getGroupCall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$getGroupCall$41(j, runnable, tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
        if (call == null || !(call.call instanceof TLRPC$TL_groupCallDiscarded)) {
            return call;
        }
        return null;
    }

    public void lambda$getGroupCall$41(final long j, final Runnable runnable, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getGroupCall$40(tLObject, j, runnable);
            }
        });
    }

    public void lambda$getGroupCall$40(TLObject tLObject, long j, Runnable runnable) {
        if (tLObject != null) {
            TLRPC$TL_phone_groupCall tLRPC$TL_phone_groupCall = (TLRPC$TL_phone_groupCall) tLObject;
            putUsers(tLRPC$TL_phone_groupCall.users, false);
            putChats(tLRPC$TL_phone_groupCall.chats, false);
            ChatObject.Call call = new ChatObject.Call();
            call.setCall(getAccountInstance(), j, tLRPC$TL_phone_groupCall);
            this.groupCalls.put(tLRPC$TL_phone_groupCall.call.id, call);
            this.groupCallsByChatId.put(j, call);
            getNotificationCenter().postNotificationName(NotificationCenter.groupCallUpdated, Long.valueOf(j), Long.valueOf(tLRPC$TL_phone_groupCall.call.id), Boolean.FALSE);
            if (runnable != null) {
                runnable.run();
            }
        }
        this.loadingGroupCalls.remove(Long.valueOf(j));
    }

    public void cancelLoadFullUser(long j) {
        this.loadingFullUsers.remove(Long.valueOf(j));
    }

    public void cancelLoadFullChat(long j) {
        this.loadingFullChats.remove(Long.valueOf(j));
    }

    public void clearFullUsers() {
        this.loadedFullUsers.clear();
        this.loadedFullChats.clear();
    }

    private void reloadDialogsReadValue(ArrayList<TLRPC$Dialog> arrayList, long j) {
        if (j != 0 || (arrayList != null && !arrayList.isEmpty())) {
            TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs = new TLRPC$TL_messages_getPeerDialogs();
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC$InputPeer inputPeer = getInputPeer(arrayList.get(i).id);
                    if (!(inputPeer instanceof TLRPC$TL_inputPeerChannel) || inputPeer.access_hash != 0) {
                        TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
                        tLRPC$TL_inputDialogPeer.peer = inputPeer;
                        tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer);
                    }
                }
            } else {
                TLRPC$InputPeer inputPeer2 = getInputPeer(j);
                if (!(inputPeer2 instanceof TLRPC$TL_inputPeerChannel) || inputPeer2.access_hash != 0) {
                    TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer2 = new TLRPC$TL_inputDialogPeer();
                    tLRPC$TL_inputDialogPeer2.peer = inputPeer2;
                    tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer2);
                } else {
                    return;
                }
            }
            if (!tLRPC$TL_messages_getPeerDialogs.peers.isEmpty()) {
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$reloadDialogsReadValue$42(tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
    }

    public void lambda$reloadDialogsReadValue$42(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            ArrayList<TLRPC$Update> arrayList = new ArrayList<>();
            for (int i = 0; i < tLRPC$TL_messages_peerDialogs.dialogs.size(); i++) {
                TLRPC$Dialog tLRPC$Dialog = tLRPC$TL_messages_peerDialogs.dialogs.get(i);
                DialogObject.initDialog(tLRPC$Dialog);
                Integer num = this.dialogs_read_inbox_max.get(Long.valueOf(tLRPC$Dialog.id));
                if (num == null) {
                    num = 0;
                }
                this.dialogs_read_inbox_max.put(Long.valueOf(tLRPC$Dialog.id), Integer.valueOf(Math.max(tLRPC$Dialog.read_inbox_max_id, num.intValue())));
                if (num.intValue() == 0) {
                    if (tLRPC$Dialog.peer.channel_id != 0) {
                        TLRPC$TL_updateReadChannelInbox tLRPC$TL_updateReadChannelInbox = new TLRPC$TL_updateReadChannelInbox();
                        tLRPC$TL_updateReadChannelInbox.channel_id = tLRPC$Dialog.peer.channel_id;
                        tLRPC$TL_updateReadChannelInbox.max_id = tLRPC$Dialog.read_inbox_max_id;
                        arrayList.add(tLRPC$TL_updateReadChannelInbox);
                    } else {
                        TLRPC$TL_updateReadHistoryInbox tLRPC$TL_updateReadHistoryInbox = new TLRPC$TL_updateReadHistoryInbox();
                        tLRPC$TL_updateReadHistoryInbox.peer = tLRPC$Dialog.peer;
                        tLRPC$TL_updateReadHistoryInbox.max_id = tLRPC$Dialog.read_inbox_max_id;
                        arrayList.add(tLRPC$TL_updateReadHistoryInbox);
                    }
                }
                Integer num2 = this.dialogs_read_outbox_max.get(Long.valueOf(tLRPC$Dialog.id));
                if (num2 == null) {
                    num2 = 0;
                }
                this.dialogs_read_outbox_max.put(Long.valueOf(tLRPC$Dialog.id), Integer.valueOf(Math.max(tLRPC$Dialog.read_outbox_max_id, num2.intValue())));
                if (tLRPC$Dialog.read_outbox_max_id > num2.intValue()) {
                    if (tLRPC$Dialog.peer.channel_id != 0) {
                        TLRPC$TL_updateReadChannelOutbox tLRPC$TL_updateReadChannelOutbox = new TLRPC$TL_updateReadChannelOutbox();
                        tLRPC$TL_updateReadChannelOutbox.channel_id = tLRPC$Dialog.peer.channel_id;
                        tLRPC$TL_updateReadChannelOutbox.max_id = tLRPC$Dialog.read_outbox_max_id;
                        arrayList.add(tLRPC$TL_updateReadChannelOutbox);
                    } else {
                        TLRPC$TL_updateReadHistoryOutbox tLRPC$TL_updateReadHistoryOutbox = new TLRPC$TL_updateReadHistoryOutbox();
                        tLRPC$TL_updateReadHistoryOutbox.peer = tLRPC$Dialog.peer;
                        tLRPC$TL_updateReadHistoryOutbox.max_id = tLRPC$Dialog.read_outbox_max_id;
                        arrayList.add(tLRPC$TL_updateReadHistoryOutbox);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                processUpdateArray(arrayList, null, null, false, 0);
            }
        }
    }

    public TLRPC$ChannelParticipant getAdminInChannel(long j, long j2) {
        LongSparseArray<TLRPC$ChannelParticipant> longSparseArray = this.channelAdmins.get(j2);
        if (longSparseArray == null) {
            return null;
        }
        return longSparseArray.get(j);
    }

    public String getAdminRank(long j, long j2) {
        TLRPC$ChannelParticipant tLRPC$ChannelParticipant;
        LongSparseArray<TLRPC$ChannelParticipant> longSparseArray = this.channelAdmins.get(j);
        if (longSparseArray == null || (tLRPC$ChannelParticipant = longSparseArray.get(j2)) == null) {
            return null;
        }
        String str = tLRPC$ChannelParticipant.rank;
        return str != null ? str : "";
    }

    public boolean isChannelAdminsLoaded(long j) {
        return this.channelAdmins.get(j) != null;
    }

    public void loadChannelAdmins(final long j, boolean z) {
        if (SystemClock.elapsedRealtime() - this.loadingChannelAdmins.get(j) >= 60) {
            this.loadingChannelAdmins.put(j, (int) (SystemClock.elapsedRealtime() / 1000));
            if (z) {
                getMessagesStorage().loadChannelAdmins(j);
                return;
            }
            TLRPC$TL_channels_getParticipants tLRPC$TL_channels_getParticipants = new TLRPC$TL_channels_getParticipants();
            tLRPC$TL_channels_getParticipants.channel = getInputChannel(j);
            tLRPC$TL_channels_getParticipants.limit = 100;
            tLRPC$TL_channels_getParticipants.filter = new TLRPC$TL_channelParticipantsAdmins();
            getConnectionsManager().sendRequest(tLRPC$TL_channels_getParticipants, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadChannelAdmins$43(j, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadChannelAdmins$43(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_channels_channelParticipants) {
            processLoadedAdminsResponse(j, (TLRPC$TL_channels_channelParticipants) tLObject);
        }
    }

    public void processLoadedAdminsResponse(long j, TLRPC$TL_channels_channelParticipants tLRPC$TL_channels_channelParticipants) {
        LongSparseArray<TLRPC$ChannelParticipant> longSparseArray = new LongSparseArray<>(tLRPC$TL_channels_channelParticipants.participants.size());
        for (int i = 0; i < tLRPC$TL_channels_channelParticipants.participants.size(); i++) {
            TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLRPC$TL_channels_channelParticipants.participants.get(i);
            longSparseArray.put(MessageObject.getPeerId(tLRPC$ChannelParticipant.peer), tLRPC$ChannelParticipant);
        }
        processLoadedChannelAdmins(longSparseArray, j, false);
    }

    public void processLoadedChannelAdmins(final LongSparseArray<TLRPC$ChannelParticipant> longSparseArray, final long j, final boolean z) {
        if (!z) {
            getMessagesStorage().putChannelAdmins(j, longSparseArray);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedChannelAdmins$44(j, longSparseArray, z);
            }
        });
    }

    public void lambda$processLoadedChannelAdmins$44(long j, LongSparseArray longSparseArray, boolean z) {
        this.channelAdmins.put(j, longSparseArray);
        if (z) {
            this.loadingChannelAdmins.delete(j);
            loadChannelAdmins(j, false);
            getNotificationCenter().postNotificationName(NotificationCenter.didLoadChatAdmins, Long.valueOf(j));
        }
    }

    public void loadFullChat(final long r11, final int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.loadFullChat(long, int, boolean):void");
    }

    public void lambda$loadFullChat$47(TLRPC$Chat tLRPC$Chat, long j, final long j2, final int i, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            final TLRPC$TL_messages_chatFull tLRPC$TL_messages_chatFull = (TLRPC$TL_messages_chatFull) tLObject;
            getMessagesStorage().putUsersAndChats(tLRPC$TL_messages_chatFull.users, tLRPC$TL_messages_chatFull.chats, true, true);
            getMessagesStorage().updateChatInfo(tLRPC$TL_messages_chatFull.full_chat, false);
            if (ChatObject.isChannel(tLRPC$Chat)) {
                Integer num = this.dialogs_read_inbox_max.get(Long.valueOf(j));
                if (num == null) {
                    num = Integer.valueOf(getMessagesStorage().getDialogReadMax(false, j));
                }
                this.dialogs_read_inbox_max.put(Long.valueOf(j), Integer.valueOf(Math.max(tLRPC$TL_messages_chatFull.full_chat.read_inbox_max_id, num.intValue())));
                if (tLRPC$TL_messages_chatFull.full_chat.read_inbox_max_id > num.intValue()) {
                    ArrayList<TLRPC$Update> arrayList = new ArrayList<>();
                    TLRPC$TL_updateReadChannelInbox tLRPC$TL_updateReadChannelInbox = new TLRPC$TL_updateReadChannelInbox();
                    tLRPC$TL_updateReadChannelInbox.channel_id = j2;
                    tLRPC$TL_updateReadChannelInbox.max_id = tLRPC$TL_messages_chatFull.full_chat.read_inbox_max_id;
                    arrayList.add(tLRPC$TL_updateReadChannelInbox);
                    processUpdateArray(arrayList, null, null, false, 0);
                }
                Integer num2 = this.dialogs_read_outbox_max.get(Long.valueOf(j));
                if (num2 == null) {
                    num2 = Integer.valueOf(getMessagesStorage().getDialogReadMax(true, j));
                }
                this.dialogs_read_outbox_max.put(Long.valueOf(j), Integer.valueOf(Math.max(tLRPC$TL_messages_chatFull.full_chat.read_outbox_max_id, num2.intValue())));
                if (tLRPC$TL_messages_chatFull.full_chat.read_outbox_max_id > num2.intValue()) {
                    ArrayList<TLRPC$Update> arrayList2 = new ArrayList<>();
                    TLRPC$TL_updateReadChannelOutbox tLRPC$TL_updateReadChannelOutbox = new TLRPC$TL_updateReadChannelOutbox();
                    tLRPC$TL_updateReadChannelOutbox.channel_id = j2;
                    tLRPC$TL_updateReadChannelOutbox.max_id = tLRPC$TL_messages_chatFull.full_chat.read_outbox_max_id;
                    arrayList2.add(tLRPC$TL_updateReadChannelOutbox);
                    processUpdateArray(arrayList2, null, null, false, 0);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadFullChat$45(j2, tLRPC$TL_messages_chatFull, i);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadFullChat$46(tLRPC$TL_error, j2);
            }
        });
    }

    public void lambda$loadFullChat$45(long j, TLRPC$TL_messages_chatFull tLRPC$TL_messages_chatFull, int i) {
        TLRPC$Dialog tLRPC$Dialog;
        TLRPC$ChatFull tLRPC$ChatFull = this.fullChats.get(j);
        if (tLRPC$ChatFull != null) {
            tLRPC$TL_messages_chatFull.full_chat.inviterId = tLRPC$ChatFull.inviterId;
        }
        this.fullChats.put(j, tLRPC$TL_messages_chatFull.full_chat);
        long j2 = -j;
        applyDialogNotificationsSettings(j2, tLRPC$TL_messages_chatFull.full_chat.notify_settings);
        for (int i2 = 0; i2 < tLRPC$TL_messages_chatFull.full_chat.bot_info.size(); i2++) {
            getMediaDataController().putBotInfo(j2, tLRPC$TL_messages_chatFull.full_chat.bot_info.get(i2));
        }
        int indexOfKey = this.blockePeers.indexOfKey(j2);
        if (tLRPC$TL_messages_chatFull.full_chat.blocked) {
            if (indexOfKey < 0) {
                this.blockePeers.put(j2, 1);
                getNotificationCenter().postNotificationName(NotificationCenter.blockedUsersDidLoad, new Object[0]);
            }
        } else if (indexOfKey >= 0) {
            this.blockePeers.removeAt(indexOfKey);
            getNotificationCenter().postNotificationName(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        }
        this.exportedChats.put(j, tLRPC$TL_messages_chatFull.full_chat.exported_invite);
        this.loadingFullChats.remove(Long.valueOf(j));
        this.loadedFullChats.add(Long.valueOf(j));
        putUsers(tLRPC$TL_messages_chatFull.users, false);
        putChats(tLRPC$TL_messages_chatFull.chats, false);
        if (tLRPC$TL_messages_chatFull.full_chat.stickerset != null) {
            getMediaDataController().getGroupStickerSetById(tLRPC$TL_messages_chatFull.full_chat.stickerset);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.chatInfoDidLoad, tLRPC$TL_messages_chatFull.full_chat, Integer.valueOf(i), Boolean.FALSE, Boolean.TRUE);
        if (!((tLRPC$TL_messages_chatFull.full_chat.flags & 2048) == 0 || (tLRPC$Dialog = this.dialogs_dict.get(j2)) == null)) {
            int i3 = tLRPC$Dialog.folder_id;
            int i4 = tLRPC$TL_messages_chatFull.full_chat.folder_id;
            if (i3 != i4) {
                tLRPC$Dialog.folder_id = i4;
                sortDialogs(null);
                getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
        }
    }

    public void lambda$loadFullChat$46(TLRPC$TL_error tLRPC$TL_error, long j) {
        checkChannelError(tLRPC$TL_error.text, j);
        this.loadingFullChats.remove(Long.valueOf(j));
    }

    public void loadFullUser(final TLRPC$User tLRPC$User, final int i, boolean z) {
        if (tLRPC$User != null && !this.loadingFullUsers.contains(Long.valueOf(tLRPC$User.id))) {
            if (z || !this.loadedFullUsers.contains(Long.valueOf(tLRPC$User.id))) {
                this.loadingFullUsers.add(Long.valueOf(tLRPC$User.id));
                TLRPC$TL_users_getFullUser tLRPC$TL_users_getFullUser = new TLRPC$TL_users_getFullUser();
                tLRPC$TL_users_getFullUser.id = getInputUser(tLRPC$User);
                long j = tLRPC$User.id;
                if (this.dialogs_read_inbox_max.get(Long.valueOf(j)) == null || this.dialogs_read_outbox_max.get(Long.valueOf(j)) == null) {
                    reloadDialogsReadValue(null, j);
                }
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_users_getFullUser, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadFullUser$50(tLRPC$User, i, tLObject, tLRPC$TL_error);
                    }
                }), i);
            }
        }
    }

    public void lambda$loadFullUser$50(final TLRPC$User tLRPC$User, final int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_users_userFull tLRPC$TL_users_userFull = (TLRPC$TL_users_userFull) tLObject;
            final TLRPC$UserFull tLRPC$UserFull = tLRPC$TL_users_userFull.full_user;
            putUsers(tLRPC$TL_users_userFull.users, false);
            putChats(tLRPC$TL_users_userFull.chats, false);
            TLRPC$UserFull tLRPC$UserFull2 = tLRPC$TL_users_userFull.full_user;
            tLRPC$UserFull2.user = getUser(Long.valueOf(tLRPC$UserFull2.id));
            getMessagesStorage().updateUserInfo(tLRPC$UserFull, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadFullUser$48(tLRPC$UserFull, tLRPC$User, i);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadFullUser$49(tLRPC$User);
            }
        });
    }

    public void lambda$loadFullUser$48(TLRPC$UserFull tLRPC$UserFull, TLRPC$User tLRPC$User, int i) {
        TLRPC$Dialog tLRPC$Dialog;
        savePeerSettings(tLRPC$UserFull.user.id, tLRPC$UserFull.settings, false);
        applyDialogNotificationsSettings(tLRPC$User.id, tLRPC$UserFull.notify_settings);
        if (tLRPC$UserFull.bot_info instanceof TLRPC$TL_botInfo) {
            getMediaDataController().putBotInfo(tLRPC$User.id, tLRPC$UserFull.bot_info);
        }
        int indexOfKey = this.blockePeers.indexOfKey(tLRPC$User.id);
        if (tLRPC$UserFull.blocked) {
            if (indexOfKey < 0) {
                this.blockePeers.put(tLRPC$User.id, 1);
                getNotificationCenter().postNotificationName(NotificationCenter.blockedUsersDidLoad, new Object[0]);
            }
        } else if (indexOfKey >= 0) {
            this.blockePeers.removeAt(indexOfKey);
            getNotificationCenter().postNotificationName(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        }
        this.fullUsers.put(tLRPC$User.id, tLRPC$UserFull);
        this.loadingFullUsers.remove(Long.valueOf(tLRPC$User.id));
        this.loadedFullUsers.add(Long.valueOf(tLRPC$User.id));
        String str = tLRPC$User.first_name + tLRPC$User.last_name + tLRPC$User.username;
        ArrayList<TLRPC$User> arrayList = new ArrayList<>();
        arrayList.add(tLRPC$UserFull.user);
        putUsers(arrayList, false);
        getMessagesStorage().putUsersAndChats(arrayList, null, false, true);
        if (!str.equals(tLRPC$UserFull.user.first_name + tLRPC$UserFull.user.last_name + tLRPC$UserFull.user.username)) {
            getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_NAME));
        }
        if (tLRPC$UserFull.bot_info instanceof TLRPC$TL_botInfo) {
            getNotificationCenter().postNotificationName(NotificationCenter.botInfoDidLoad, tLRPC$UserFull.bot_info, Integer.valueOf(i));
        }
        getNotificationCenter().postNotificationName(NotificationCenter.userInfoDidLoad, Long.valueOf(tLRPC$User.id), tLRPC$UserFull);
        if ((tLRPC$UserFull.flags & 2048) != 0 && (tLRPC$Dialog = this.dialogs_dict.get(tLRPC$User.id)) != null) {
            int i2 = tLRPC$Dialog.folder_id;
            int i3 = tLRPC$UserFull.folder_id;
            if (i2 != i3) {
                tLRPC$Dialog.folder_id = i3;
                sortDialogs(null);
                getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
        }
    }

    public void lambda$loadFullUser$49(TLRPC$User tLRPC$User) {
        this.loadingFullUsers.remove(Long.valueOf(tLRPC$User.id));
    }

    private void reloadMessages(ArrayList<Integer> arrayList, final long j, final boolean z) {
        TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages;
        if (!arrayList.isEmpty()) {
            final ArrayList<Integer> arrayList2 = new ArrayList<>();
            TLRPC$Chat chat = DialogObject.isChatDialog(j) ? getChat(Long.valueOf(-j)) : null;
            if (ChatObject.isChannel(chat)) {
                TLRPC$TL_channels_getMessages tLRPC$TL_channels_getMessages = new TLRPC$TL_channels_getMessages();
                tLRPC$TL_channels_getMessages.channel = getInputChannel(chat);
                tLRPC$TL_channels_getMessages.id = arrayList2;
                tLRPC$TL_messages_getMessages = tLRPC$TL_channels_getMessages;
            } else {
                TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages2 = new TLRPC$TL_messages_getMessages();
                tLRPC$TL_messages_getMessages2.id = arrayList2;
                tLRPC$TL_messages_getMessages = tLRPC$TL_messages_getMessages2;
            }
            TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages3 = tLRPC$TL_messages_getMessages;
            ArrayList<Integer> arrayList3 = this.reloadingMessages.get(j);
            for (int i = 0; i < arrayList.size(); i++) {
                Integer num = arrayList.get(i);
                if (arrayList3 == null || !arrayList3.contains(num)) {
                    arrayList2.add(num);
                }
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                    this.reloadingMessages.put(j, arrayList3);
                }
                arrayList3.addAll(arrayList2);
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages3, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$reloadMessages$52(j, z, arrayList2, tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
    }

    public void lambda$reloadMessages$52(final long j, boolean z, final ArrayList arrayList, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i = 0; i < tLRPC$messages_Messages.users.size(); i++) {
                TLRPC$User tLRPC$User = tLRPC$messages_Messages.users.get(i);
                longSparseArray.put(tLRPC$User.id, tLRPC$User);
            }
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i2 = 0; i2 < tLRPC$messages_Messages.chats.size(); i2++) {
                TLRPC$Chat tLRPC$Chat = tLRPC$messages_Messages.chats.get(i2);
                longSparseArray2.put(tLRPC$Chat.id, tLRPC$Chat);
            }
            Integer num = this.dialogs_read_inbox_max.get(Long.valueOf(j));
            if (num == null) {
                num = Integer.valueOf(getMessagesStorage().getDialogReadMax(false, j));
                this.dialogs_read_inbox_max.put(Long.valueOf(j), num);
            }
            Integer num2 = this.dialogs_read_outbox_max.get(Long.valueOf(j));
            if (num2 == null) {
                num2 = Integer.valueOf(getMessagesStorage().getDialogReadMax(true, j));
                this.dialogs_read_outbox_max.put(Long.valueOf(j), num2);
            }
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            while (i3 < tLRPC$messages_Messages.messages.size()) {
                TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i3);
                tLRPC$Message.dialog_id = j;
                if (!z) {
                    tLRPC$Message.unread = (tLRPC$Message.out ? num2 : num).intValue() < tLRPC$Message.id;
                }
                num = num;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new MessageObject(this.currentAccount, tLRPC$Message, (LongSparseArray<TLRPC$User>) longSparseArray, (LongSparseArray<TLRPC$Chat>) longSparseArray2, true, true));
                i3++;
                arrayList2 = arrayList3;
            }
            final ArrayList arrayList4 = arrayList2;
            ImageLoader.saveMessagesThumbs(tLRPC$messages_Messages.messages);
            getMessagesStorage().putMessages(tLRPC$messages_Messages, j, -1, 0, false, z);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$reloadMessages$51(j, arrayList, arrayList4);
                }
            });
        }
    }

    public void lambda$reloadMessages$51(long j, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList<Integer> arrayList3 = this.reloadingMessages.get(j);
        if (arrayList3 != null) {
            arrayList3.removeAll(arrayList);
            if (arrayList3.isEmpty()) {
                this.reloadingMessages.remove(j);
            }
        }
        MessageObject messageObject = this.dialogMessage.get(j);
        if (messageObject != null) {
            int i = 0;
            while (true) {
                if (i >= arrayList2.size()) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i);
                if (messageObject.getId() == messageObject2.getId()) {
                    this.dialogMessage.put(j, messageObject2);
                    if (messageObject2.messageOwner.peer_id.channel_id == 0) {
                        MessageObject messageObject3 = this.dialogMessagesByIds.get(messageObject2.getId());
                        this.dialogMessagesByIds.remove(messageObject2.getId());
                        if (messageObject3 != null) {
                            this.dialogMessagesByIds.put(messageObject3.getId(), messageObject3);
                        }
                    }
                    getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
                } else {
                    i++;
                }
            }
        }
        getNotificationCenter().postNotificationName(NotificationCenter.replaceMessagesObjects, Long.valueOf(j), arrayList2);
    }

    public void hidePeerSettingsBar(long j, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat) {
        if (tLRPC$User != null || tLRPC$Chat != null) {
            SharedPreferences.Editor edit = this.notificationsPreferences.edit();
            edit.putInt("dialog_bar_vis3" + j, 3);
            edit.remove("dialog_bar_invite" + j);
            edit.commit();
            if (!DialogObject.isEncryptedDialog(j)) {
                TLRPC$TL_messages_hidePeerSettingsBar tLRPC$TL_messages_hidePeerSettingsBar = new TLRPC$TL_messages_hidePeerSettingsBar();
                if (tLRPC$User != null) {
                    tLRPC$TL_messages_hidePeerSettingsBar.peer = getInputPeer(tLRPC$User.id);
                } else {
                    tLRPC$TL_messages_hidePeerSettingsBar.peer = getInputPeer(-tLRPC$Chat.id);
                }
                getConnectionsManager().sendRequest(tLRPC$TL_messages_hidePeerSettingsBar, MessagesController$$ExternalSyntheticLambda339.INSTANCE);
            }
        }
    }

    public void reportSpam(long j, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, TLRPC$EncryptedChat tLRPC$EncryptedChat, boolean z) {
        if (tLRPC$User != null || tLRPC$Chat != null || tLRPC$EncryptedChat != null) {
            SharedPreferences.Editor edit = this.notificationsPreferences.edit();
            edit.putInt("dialog_bar_vis3" + j, 3);
            edit.commit();
            if (DialogObject.isEncryptedDialog(j)) {
                if (tLRPC$EncryptedChat != null && tLRPC$EncryptedChat.access_hash != 0) {
                    TLRPC$TL_messages_reportEncryptedSpam tLRPC$TL_messages_reportEncryptedSpam = new TLRPC$TL_messages_reportEncryptedSpam();
                    TLRPC$TL_inputEncryptedChat tLRPC$TL_inputEncryptedChat = new TLRPC$TL_inputEncryptedChat();
                    tLRPC$TL_messages_reportEncryptedSpam.peer = tLRPC$TL_inputEncryptedChat;
                    tLRPC$TL_inputEncryptedChat.chat_id = tLRPC$EncryptedChat.id;
                    tLRPC$TL_inputEncryptedChat.access_hash = tLRPC$EncryptedChat.access_hash;
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_reportEncryptedSpam, MessagesController$$ExternalSyntheticLambda343.INSTANCE, 2);
                }
            } else if (z) {
                TLRPC$TL_account_reportPeer tLRPC$TL_account_reportPeer = new TLRPC$TL_account_reportPeer();
                if (tLRPC$Chat != null) {
                    tLRPC$TL_account_reportPeer.peer = getInputPeer(-tLRPC$Chat.id);
                } else if (tLRPC$User != null) {
                    tLRPC$TL_account_reportPeer.peer = getInputPeer(tLRPC$User.id);
                }
                tLRPC$TL_account_reportPeer.message = "";
                tLRPC$TL_account_reportPeer.reason = new TLRPC$ReportReason() {
                    public static int constructor = -606798099;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                        abstractSerializedData.writeInt32(constructor);
                    }
                };
                getConnectionsManager().sendRequest(tLRPC$TL_account_reportPeer, MessagesController$$ExternalSyntheticLambda350.INSTANCE, 2);
            } else {
                TLRPC$TL_messages_reportSpam tLRPC$TL_messages_reportSpam = new TLRPC$TL_messages_reportSpam();
                if (tLRPC$Chat != null) {
                    tLRPC$TL_messages_reportSpam.peer = getInputPeer(-tLRPC$Chat.id);
                } else if (tLRPC$User != null) {
                    tLRPC$TL_messages_reportSpam.peer = getInputPeer(tLRPC$User.id);
                }
                getConnectionsManager().sendRequest(tLRPC$TL_messages_reportSpam, MessagesController$$ExternalSyntheticLambda336.INSTANCE, 2);
            }
        }
    }

    private void savePeerSettings(long j, TLRPC$TL_peerSettings tLRPC$TL_peerSettings, boolean z) {
        if (tLRPC$TL_peerSettings != null) {
            SharedPreferences sharedPreferences = this.notificationsPreferences;
            if (sharedPreferences.getInt("dialog_bar_vis3" + j, 0) != 3) {
                SharedPreferences.Editor edit = this.notificationsPreferences.edit();
                boolean z2 = !tLRPC$TL_peerSettings.report_spam && !tLRPC$TL_peerSettings.add_contact && !tLRPC$TL_peerSettings.block_contact && !tLRPC$TL_peerSettings.share_contact && !tLRPC$TL_peerSettings.report_geo && !tLRPC$TL_peerSettings.invite_members;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("peer settings loaded for " + j + " add = " + tLRPC$TL_peerSettings.add_contact + " block = " + tLRPC$TL_peerSettings.block_contact + " spam = " + tLRPC$TL_peerSettings.report_spam + " share = " + tLRPC$TL_peerSettings.share_contact + " geo = " + tLRPC$TL_peerSettings.report_geo + " hide = " + z2 + " distance = " + tLRPC$TL_peerSettings.geo_distance + " invite = " + tLRPC$TL_peerSettings.invite_members);
                }
                edit.putInt("dialog_bar_vis3" + j, z2 ? 1 : 2);
                edit.putBoolean("dialog_bar_share" + j, tLRPC$TL_peerSettings.share_contact);
                edit.putBoolean("dialog_bar_report" + j, tLRPC$TL_peerSettings.report_spam);
                edit.putBoolean("dialog_bar_add" + j, tLRPC$TL_peerSettings.add_contact);
                edit.putBoolean("dialog_bar_block" + j, tLRPC$TL_peerSettings.block_contact);
                edit.putBoolean("dialog_bar_exception" + j, tLRPC$TL_peerSettings.need_contacts_exception);
                edit.putBoolean("dialog_bar_location" + j, tLRPC$TL_peerSettings.report_geo);
                edit.putBoolean("dialog_bar_archived" + j, tLRPC$TL_peerSettings.autoarchived);
                edit.putBoolean("dialog_bar_invite" + j, tLRPC$TL_peerSettings.invite_members);
                edit.putString("dialog_bar_chat_with_admin_title" + j, tLRPC$TL_peerSettings.request_chat_title);
                edit.putBoolean("dialog_bar_chat_with_channel" + j, tLRPC$TL_peerSettings.request_chat_broadcast);
                edit.putInt("dialog_bar_chat_with_date" + j, tLRPC$TL_peerSettings.request_chat_date);
                SharedPreferences sharedPreferences2 = this.notificationsPreferences;
                if (sharedPreferences2.getInt("dialog_bar_distance" + j, -1) != -2) {
                    if ((tLRPC$TL_peerSettings.flags & 64) != 0) {
                        edit.putInt("dialog_bar_distance" + j, tLRPC$TL_peerSettings.geo_distance);
                    } else {
                        edit.remove("dialog_bar_distance" + j);
                    }
                }
                edit.apply();
                getNotificationCenter().postNotificationName(NotificationCenter.peerSettingsDidLoad, Long.valueOf(j));
            }
        }
    }

    public void loadPeerSettings(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat) {
        final long j;
        if (tLRPC$User != null || tLRPC$Chat != null) {
            if (tLRPC$User != null) {
                j = tLRPC$User.id;
            } else {
                j = -tLRPC$Chat.id;
            }
            if (this.loadingPeerSettings.indexOfKey(j) < 0) {
                this.loadingPeerSettings.put(j, Boolean.TRUE);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("request spam button for " + j);
                }
                SharedPreferences sharedPreferences = this.notificationsPreferences;
                int i = sharedPreferences.getInt("dialog_bar_vis3" + j, 0);
                if (i != 1 && i != 3) {
                    TLRPC$TL_messages_getPeerSettings tLRPC$TL_messages_getPeerSettings = new TLRPC$TL_messages_getPeerSettings();
                    if (tLRPC$User != null) {
                        tLRPC$TL_messages_getPeerSettings.peer = getInputPeer(tLRPC$User.id);
                    } else {
                        tLRPC$TL_messages_getPeerSettings.peer = getInputPeer(-tLRPC$Chat.id);
                    }
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerSettings, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$loadPeerSettings$58(j, tLObject, tLRPC$TL_error);
                        }
                    });
                } else if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("dialog bar already hidden for " + j);
                }
            }
        }
    }

    public void lambda$loadPeerSettings$58(final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadPeerSettings$57(j, tLObject);
            }
        });
    }

    public void lambda$loadPeerSettings$57(long j, TLObject tLObject) {
        this.loadingPeerSettings.remove(j);
        if (tLObject != null) {
            TLRPC$TL_messages_peerSettings tLRPC$TL_messages_peerSettings = (TLRPC$TL_messages_peerSettings) tLObject;
            TLRPC$TL_peerSettings tLRPC$TL_peerSettings = tLRPC$TL_messages_peerSettings.settings;
            putUsers(tLRPC$TL_messages_peerSettings.users, false);
            putChats(tLRPC$TL_messages_peerSettings.chats, false);
            savePeerSettings(j, tLRPC$TL_peerSettings, false);
        }
    }

    public void processNewChannelDifferenceParams(int i, int i2, long j) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("processNewChannelDifferenceParams pts = " + i + " pts_count = " + i2 + " channeldId = " + j);
        }
        int i3 = this.channelsPts.get(j);
        if (i3 == 0) {
            i3 = getMessagesStorage().getChannelPtsSync(j);
            if (i3 == 0) {
                i3 = 1;
            }
            this.channelsPts.put(j, i3);
        }
        if (i3 + i2 == i) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("APPLY CHANNEL PTS");
            }
            this.channelsPts.put(j, i);
            getMessagesStorage().saveChannelPts(j, i);
        } else if (i3 != i) {
            long j2 = this.updatesStartWaitTimeChannels.get(j);
            if (this.gettingDifferenceChannels.get(j, Boolean.FALSE).booleanValue() || j2 == 0 || Math.abs(System.currentTimeMillis() - j2) <= 1500) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("ADD CHANNEL UPDATE TO QUEUE pts = " + i + " pts_count = " + i2);
                }
                if (j2 == 0) {
                    this.updatesStartWaitTimeChannels.put(j, System.currentTimeMillis());
                }
                UserActionUpdatesPts userActionUpdatesPts = new UserActionUpdatesPts();
                userActionUpdatesPts.pts = i;
                userActionUpdatesPts.pts_count = i2;
                userActionUpdatesPts.chat_id = j;
                ArrayList<TLRPC$Updates> arrayList = this.updatesQueueChannels.get(j);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.updatesQueueChannels.put(j, arrayList);
                }
                arrayList.add(userActionUpdatesPts);
                return;
            }
            getChannelDifference(j);
        }
    }

    public void processNewDifferenceParams(int i, int i2, int i3, int i4) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("processNewDifferenceParams seq = " + i + " pts = " + i2 + " date = " + i3 + " pts_count = " + i4);
        }
        if (i2 != -1) {
            if (getMessagesStorage().getLastPtsValue() + i4 == i2) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("APPLY PTS");
                }
                getMessagesStorage().setLastPtsValue(i2);
                getMessagesStorage().saveDiffParams(getMessagesStorage().getLastSeqValue(), getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue());
            } else if (getMessagesStorage().getLastPtsValue() != i2) {
                if (this.gettingDifference || this.updatesStartWaitTimePts == 0 || Math.abs(System.currentTimeMillis() - this.updatesStartWaitTimePts) <= 1500) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("ADD UPDATE TO QUEUE pts = " + i2 + " pts_count = " + i4);
                    }
                    if (this.updatesStartWaitTimePts == 0) {
                        this.updatesStartWaitTimePts = System.currentTimeMillis();
                    }
                    UserActionUpdatesPts userActionUpdatesPts = new UserActionUpdatesPts();
                    userActionUpdatesPts.pts = i2;
                    userActionUpdatesPts.pts_count = i4;
                    this.updatesQueuePts.add(userActionUpdatesPts);
                } else {
                    getDifference();
                }
            }
        }
        if (i == -1) {
            return;
        }
        if (getMessagesStorage().getLastSeqValue() + 1 == i) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("APPLY SEQ");
            }
            getMessagesStorage().setLastSeqValue(i);
            if (i3 != -1) {
                getMessagesStorage().setLastDateValue(i3);
            }
            getMessagesStorage().saveDiffParams(getMessagesStorage().getLastSeqValue(), getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue());
        } else if (getMessagesStorage().getLastSeqValue() == i) {
        } else {
            if (this.gettingDifference || this.updatesStartWaitTimeSeq == 0 || Math.abs(System.currentTimeMillis() - this.updatesStartWaitTimeSeq) <= 1500) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("ADD UPDATE TO QUEUE seq = " + i);
                }
                if (this.updatesStartWaitTimeSeq == 0) {
                    this.updatesStartWaitTimeSeq = System.currentTimeMillis();
                }
                UserActionUpdatesSeq userActionUpdatesSeq = new UserActionUpdatesSeq();
                userActionUpdatesSeq.seq = i;
                this.updatesQueueSeq.add(userActionUpdatesSeq);
                return;
            }
            getDifference();
        }
    }

    public void didAddedNewTask(final int i, final long j, final SparseArray<ArrayList<Integer>> sparseArray) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didAddedNewTask$59(i);
            }
        });
        if (sparseArray != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$didAddedNewTask$60(j, sparseArray);
                }
            });
        }
    }

    public void lambda$didAddedNewTask$59(int i) {
        int i2;
        if ((this.currentDeletingTaskMids == null && this.currentDeletingTaskMediaMids == null && !this.gettingNewDeleteTask) || ((i2 = this.currentDeletingTaskTime) != 0 && i < i2)) {
            getNewDeleteTask(null, null);
        }
    }

    public void lambda$didAddedNewTask$60(long j, SparseArray sparseArray) {
        getNotificationCenter().postNotificationName(NotificationCenter.didCreatedNewDeleteTask, Long.valueOf(j), sparseArray);
    }

    public void getNewDeleteTask(final LongSparseArray<ArrayList<Integer>> longSparseArray, final LongSparseArray<ArrayList<Integer>> longSparseArray2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getNewDeleteTask$61(longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$getNewDeleteTask$61(LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        this.gettingNewDeleteTask = true;
        getMessagesStorage().getNewTask(longSparseArray, longSparseArray2);
    }

    private boolean checkDeletingTask(boolean z) {
        int i;
        int currentTime = getConnectionsManager().getCurrentTime();
        if ((this.currentDeletingTaskMids == null && this.currentDeletingTaskMediaMids == null) || (!z && ((i = this.currentDeletingTaskTime) == 0 || i > currentTime))) {
            return false;
        }
        this.currentDeletingTaskTime = 0;
        if (this.currentDeleteTaskRunnable != null && !z) {
            Utilities.stageQueue.cancelRunnable(this.currentDeleteTaskRunnable);
        }
        final LongSparseArray<ArrayList<Integer>> longSparseArray = null;
        this.currentDeleteTaskRunnable = null;
        LongSparseArray<ArrayList<Integer>> longSparseArray2 = this.currentDeletingTaskMids;
        final LongSparseArray<ArrayList<Integer>> clone = longSparseArray2 != null ? longSparseArray2.clone() : null;
        LongSparseArray<ArrayList<Integer>> longSparseArray3 = this.currentDeletingTaskMediaMids;
        if (longSparseArray3 != null) {
            longSparseArray = longSparseArray3.clone();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkDeletingTask$63(clone, longSparseArray);
            }
        });
        return true;
    }

    public void lambda$checkDeletingTask$63(final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        if (longSparseArray != null) {
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> arrayList = (ArrayList) longSparseArray.valueAt(i);
                deleteMessages(arrayList, null, null, longSparseArray.keyAt(i), true, false, !arrayList.isEmpty() && arrayList.get(0).intValue() > 0);
            }
        }
        if (longSparseArray2 != null) {
            int size2 = longSparseArray2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                getMessagesStorage().emptyMessagesMedia(longSparseArray2.keyAt(i2), (ArrayList) longSparseArray2.valueAt(i2));
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkDeletingTask$62(longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$checkDeletingTask$62(LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        getNewDeleteTask(longSparseArray, longSparseArray2);
        this.currentDeletingTaskTime = 0;
        this.currentDeletingTaskMids = null;
        this.currentDeletingTaskMediaMids = null;
    }

    public void processLoadedDeleteTask(final int i, final LongSparseArray<ArrayList<Integer>> longSparseArray, final LongSparseArray<ArrayList<Integer>> longSparseArray2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedDeleteTask$65(longSparseArray, longSparseArray2, i);
            }
        });
    }

    public void lambda$processLoadedDeleteTask$65(LongSparseArray longSparseArray, LongSparseArray longSparseArray2, int i) {
        this.gettingNewDeleteTask = false;
        if (longSparseArray == null && longSparseArray2 == null) {
            this.currentDeletingTaskTime = 0;
            this.currentDeletingTaskMids = null;
            this.currentDeletingTaskMediaMids = null;
            return;
        }
        this.currentDeletingTaskTime = i;
        this.currentDeletingTaskMids = longSparseArray;
        this.currentDeletingTaskMediaMids = longSparseArray2;
        if (this.currentDeleteTaskRunnable != null) {
            Utilities.stageQueue.cancelRunnable(this.currentDeleteTaskRunnable);
            this.currentDeleteTaskRunnable = null;
        }
        if (!checkDeletingTask(false)) {
            this.currentDeleteTaskRunnable = new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$processLoadedDeleteTask$64();
                }
            };
            Utilities.stageQueue.postRunnable(this.currentDeleteTaskRunnable, Math.abs(getConnectionsManager().getCurrentTime() - this.currentDeletingTaskTime) * 1000);
        }
    }

    public void lambda$processLoadedDeleteTask$64() {
        checkDeletingTask(true);
    }

    public void loadDialogPhotos(final long j, final int i, final int i2, boolean z, final int i3) {
        if (z) {
            getMessagesStorage().getDialogPhotos(j, i, i2, i3);
        } else if (j > 0) {
            TLRPC$User user = getUser(Long.valueOf(j));
            if (user != null) {
                TLRPC$TL_photos_getUserPhotos tLRPC$TL_photos_getUserPhotos = new TLRPC$TL_photos_getUserPhotos();
                tLRPC$TL_photos_getUserPhotos.limit = i;
                tLRPC$TL_photos_getUserPhotos.offset = 0;
                tLRPC$TL_photos_getUserPhotos.max_id = i2;
                tLRPC$TL_photos_getUserPhotos.user_id = getInputUser(user);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_photos_getUserPhotos, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadDialogPhotos$66(j, i, i2, i3, tLObject, tLRPC$TL_error);
                    }
                }), i3);
            }
        } else if (j < 0) {
            TLRPC$TL_messages_search tLRPC$TL_messages_search = new TLRPC$TL_messages_search();
            tLRPC$TL_messages_search.filter = new TLRPC$TL_inputMessagesFilterChatPhotos();
            tLRPC$TL_messages_search.limit = i;
            tLRPC$TL_messages_search.offset_id = i2;
            tLRPC$TL_messages_search.q = "";
            tLRPC$TL_messages_search.peer = getInputPeer(j);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadDialogPhotos$67(j, i, i2, i3, tLObject, tLRPC$TL_error);
                }
            }), i3);
        }
    }

    public void lambda$loadDialogPhotos$66(long j, int i, int i2, int i3, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processLoadedUserPhotos((TLRPC$photos_Photos) tLObject, null, j, i, i2, false, i3);
        }
    }

    public void lambda$loadDialogPhotos$67(long j, int i, int i2, int i3, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$Photo tLRPC$Photo;
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            TLRPC$TL_photos_photos tLRPC$TL_photos_photos = new TLRPC$TL_photos_photos();
            ArrayList<TLRPC$Message> arrayList = new ArrayList<>();
            tLRPC$TL_photos_photos.count = tLRPC$messages_Messages.count;
            tLRPC$TL_photos_photos.users.addAll(tLRPC$messages_Messages.users);
            for (int i4 = 0; i4 < tLRPC$messages_Messages.messages.size(); i4++) {
                TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i4);
                TLRPC$MessageAction tLRPC$MessageAction = tLRPC$Message.action;
                if (!(tLRPC$MessageAction == null || (tLRPC$Photo = tLRPC$MessageAction.photo) == null)) {
                    tLRPC$TL_photos_photos.photos.add(tLRPC$Photo);
                    arrayList.add(tLRPC$Message);
                }
            }
            processLoadedUserPhotos(tLRPC$TL_photos_photos, arrayList, j, i, i2, false, i3);
        }
    }

    public void blockPeer(long j) {
        TLRPC$Chat tLRPC$Chat;
        TLRPC$User tLRPC$User = null;
        if (j > 0) {
            TLRPC$User user = getUser(Long.valueOf(j));
            if (user != null) {
                tLRPC$Chat = null;
                tLRPC$User = user;
            } else {
                return;
            }
        } else {
            tLRPC$Chat = getChat(Long.valueOf(-j));
            if (tLRPC$Chat == null) {
                return;
            }
        }
        if (this.blockePeers.indexOfKey(j) < 0) {
            this.blockePeers.put(j, 1);
            if (tLRPC$User != null) {
                if (tLRPC$User.bot) {
                    getMediaDataController().removeInline(j);
                } else {
                    getMediaDataController().removePeer(j);
                }
            }
            int i = this.totalBlockedCount;
            if (i >= 0) {
                this.totalBlockedCount = i + 1;
            }
            getNotificationCenter().postNotificationName(NotificationCenter.blockedUsersDidLoad, new Object[0]);
            TLRPC$TL_contacts_block tLRPC$TL_contacts_block = new TLRPC$TL_contacts_block();
            if (tLRPC$User != null) {
                tLRPC$TL_contacts_block.id = getInputPeer(tLRPC$User);
            } else {
                tLRPC$TL_contacts_block.id = getInputPeer(tLRPC$Chat);
            }
            getConnectionsManager().sendRequest(tLRPC$TL_contacts_block, MessagesController$$ExternalSyntheticLambda349.INSTANCE);
        }
    }

    public void setParticipantBannedRole(final long j, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, final boolean z, final BaseFragment baseFragment) {
        if ((tLRPC$User != null || tLRPC$Chat != null) && tLRPC$TL_chatBannedRights != null) {
            final TLRPC$TL_channels_editBanned tLRPC$TL_channels_editBanned = new TLRPC$TL_channels_editBanned();
            tLRPC$TL_channels_editBanned.channel = getInputChannel(j);
            if (tLRPC$User != null) {
                tLRPC$TL_channels_editBanned.participant = getInputPeer(tLRPC$User);
            } else {
                tLRPC$TL_channels_editBanned.participant = getInputPeer(tLRPC$Chat);
            }
            tLRPC$TL_channels_editBanned.banned_rights = tLRPC$TL_chatBannedRights;
            getConnectionsManager().sendRequest(tLRPC$TL_channels_editBanned, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$setParticipantBannedRole$71(j, baseFragment, tLRPC$TL_channels_editBanned, z, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$setParticipantBannedRole$71(final long j, final BaseFragment baseFragment, final TLRPC$TL_channels_editBanned tLRPC$TL_channels_editBanned, final boolean z, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setParticipantBannedRole$69(j);
                }
            }, 1000L);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$setParticipantBannedRole$70(tLRPC$TL_error, baseFragment, tLRPC$TL_channels_editBanned, z);
            }
        });
    }

    public void lambda$setParticipantBannedRole$69(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$setParticipantBannedRole$70(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_editBanned tLRPC$TL_channels_editBanned, boolean z) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_editBanned, Boolean.valueOf(z));
    }

    public void setChannelSlowMode(final long j, int i) {
        TLRPC$TL_channels_toggleSlowMode tLRPC$TL_channels_toggleSlowMode = new TLRPC$TL_channels_toggleSlowMode();
        tLRPC$TL_channels_toggleSlowMode.seconds = i;
        tLRPC$TL_channels_toggleSlowMode.channel = getInputChannel(j);
        getConnectionsManager().sendRequest(tLRPC$TL_channels_toggleSlowMode, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setChannelSlowMode$73(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$setChannelSlowMode$73(final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setChannelSlowMode$72(j);
                }
            }, 1000L);
        }
    }

    public void lambda$setChannelSlowMode$72(long j) {
        loadFullChat(j, 0, true);
    }

    public void setDefaultBannedRole(final long j, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, final boolean z, final BaseFragment baseFragment) {
        if (tLRPC$TL_chatBannedRights != null) {
            final TLRPC$TL_messages_editChatDefaultBannedRights tLRPC$TL_messages_editChatDefaultBannedRights = new TLRPC$TL_messages_editChatDefaultBannedRights();
            tLRPC$TL_messages_editChatDefaultBannedRights.peer = getInputPeer(-j);
            tLRPC$TL_messages_editChatDefaultBannedRights.banned_rights = tLRPC$TL_chatBannedRights;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatDefaultBannedRights, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$setDefaultBannedRole$76(j, baseFragment, tLRPC$TL_messages_editChatDefaultBannedRights, z, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$setDefaultBannedRole$76(final long j, final BaseFragment baseFragment, final TLRPC$TL_messages_editChatDefaultBannedRights tLRPC$TL_messages_editChatDefaultBannedRights, final boolean z, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setDefaultBannedRole$74(j);
                }
            }, 1000L);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$setDefaultBannedRole$75(tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editChatDefaultBannedRights, z);
            }
        });
    }

    public void lambda$setDefaultBannedRole$74(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$setDefaultBannedRole$75(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_editChatDefaultBannedRights tLRPC$TL_messages_editChatDefaultBannedRights, boolean z) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editChatDefaultBannedRights, Boolean.valueOf(z));
    }

    public void setUserAdminRole(long j, TLRPC$User tLRPC$User, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, String str, boolean z, BaseFragment baseFragment, boolean z2, boolean z3, String str2, Runnable runnable) {
        setUserAdminRole(j, tLRPC$User, tLRPC$TL_chatAdminRights, str, z, baseFragment, z2, z3, str2, runnable, null);
    }

    public void setUserAdminRole(final long j, TLRPC$User tLRPC$User, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, String str, final boolean z, final BaseFragment baseFragment, boolean z2, boolean z3, String str2, final Runnable runnable, final Runnable runnable2) {
        if (tLRPC$User != null && tLRPC$TL_chatAdminRights != null) {
            TLRPC$Chat chat = getChat(Long.valueOf(j));
            if (ChatObject.isChannel(chat)) {
                final TLRPC$TL_channels_editAdmin tLRPC$TL_channels_editAdmin = new TLRPC$TL_channels_editAdmin();
                tLRPC$TL_channels_editAdmin.channel = getInputChannel(chat);
                tLRPC$TL_channels_editAdmin.user_id = getInputUser(tLRPC$User);
                tLRPC$TL_channels_editAdmin.admin_rights = tLRPC$TL_chatAdminRights;
                tLRPC$TL_channels_editAdmin.rank = str;
                final RequestDelegate messagesController$$ExternalSyntheticLambda291 = new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$setUserAdminRole$79(j, runnable, baseFragment, tLRPC$TL_channels_editAdmin, z, runnable2, tLObject, tLRPC$TL_error);
                    }
                };
                if (!chat.megagroup || !z2) {
                    getConnectionsManager().sendRequest(tLRPC$TL_channels_editAdmin, messagesController$$ExternalSyntheticLambda291);
                } else {
                    addUserToChat(j, tLRPC$User, 0, str2, baseFragment, true, new Runnable() {
                        @Override
                        public final void run() {
                            MessagesController.this.lambda$setUserAdminRole$80(tLRPC$TL_channels_editAdmin, messagesController$$ExternalSyntheticLambda291);
                        }
                    }, runnable2);
                }
            } else {
                final TLRPC$TL_messages_editChatAdmin tLRPC$TL_messages_editChatAdmin = new TLRPC$TL_messages_editChatAdmin();
                tLRPC$TL_messages_editChatAdmin.chat_id = j;
                tLRPC$TL_messages_editChatAdmin.user_id = getInputUser(tLRPC$User);
                tLRPC$TL_messages_editChatAdmin.is_admin = z3 || tLRPC$TL_chatAdminRights.change_info || tLRPC$TL_chatAdminRights.delete_messages || tLRPC$TL_chatAdminRights.ban_users || tLRPC$TL_chatAdminRights.invite_users || tLRPC$TL_chatAdminRights.pin_messages || tLRPC$TL_chatAdminRights.add_admins || tLRPC$TL_chatAdminRights.manage_call;
                final RequestDelegate messagesController$$ExternalSyntheticLambda292 = new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$setUserAdminRole$83(j, runnable, baseFragment, tLRPC$TL_messages_editChatAdmin, runnable2, tLObject, tLRPC$TL_error);
                    }
                };
                if (tLRPC$TL_messages_editChatAdmin.is_admin || z2) {
                    addUserToChat(j, tLRPC$User, 0, str2, baseFragment, true, new Runnable() {
                        @Override
                        public final void run() {
                            MessagesController.this.lambda$setUserAdminRole$84(tLRPC$TL_messages_editChatAdmin, messagesController$$ExternalSyntheticLambda292);
                        }
                    }, runnable2);
                } else {
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatAdmin, messagesController$$ExternalSyntheticLambda292);
                }
            }
        }
    }

    public void lambda$setUserAdminRole$79(final long j, final Runnable runnable, final BaseFragment baseFragment, final TLRPC$TL_channels_editAdmin tLRPC$TL_channels_editAdmin, final boolean z, Runnable runnable2, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setUserAdminRole$77(j, runnable);
                }
            }, 1000L);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$setUserAdminRole$78(tLRPC$TL_error, baseFragment, tLRPC$TL_channels_editAdmin, z);
            }
        });
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2);
        }
    }

    public void lambda$setUserAdminRole$77(long j, Runnable runnable) {
        loadFullChat(j, 0, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$setUserAdminRole$78(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_editAdmin tLRPC$TL_channels_editAdmin, boolean z) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_editAdmin, Boolean.valueOf(z));
    }

    public void lambda$setUserAdminRole$80(TLRPC$TL_channels_editAdmin tLRPC$TL_channels_editAdmin, RequestDelegate requestDelegate) {
        getConnectionsManager().sendRequest(tLRPC$TL_channels_editAdmin, requestDelegate);
    }

    public void lambda$setUserAdminRole$83(final long j, final Runnable runnable, final BaseFragment baseFragment, final TLRPC$TL_messages_editChatAdmin tLRPC$TL_messages_editChatAdmin, Runnable runnable2, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setUserAdminRole$81(j, runnable);
                }
            }, 1000L);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$setUserAdminRole$82(tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editChatAdmin);
            }
        });
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2);
        }
    }

    public void lambda$setUserAdminRole$81(long j, Runnable runnable) {
        loadFullChat(j, 0, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$setUserAdminRole$82(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_editChatAdmin tLRPC$TL_messages_editChatAdmin) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editChatAdmin, Boolean.FALSE);
    }

    public void lambda$setUserAdminRole$84(TLRPC$TL_messages_editChatAdmin tLRPC$TL_messages_editChatAdmin, RequestDelegate requestDelegate) {
        getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatAdmin, requestDelegate);
    }

    public void unblockPeer(long j) {
        TLRPC$Chat tLRPC$Chat;
        TLRPC$TL_contacts_unblock tLRPC$TL_contacts_unblock = new TLRPC$TL_contacts_unblock();
        TLRPC$User tLRPC$User = null;
        if (j > 0) {
            TLRPC$User user = getUser(Long.valueOf(j));
            if (user != null) {
                tLRPC$Chat = null;
                tLRPC$User = user;
            } else {
                return;
            }
        } else {
            tLRPC$Chat = getChat(Long.valueOf(-j));
            if (tLRPC$Chat == null) {
                return;
            }
        }
        this.totalBlockedCount--;
        this.blockePeers.delete(j);
        if (tLRPC$User != null) {
            tLRPC$TL_contacts_unblock.id = getInputPeer(tLRPC$User);
        } else {
            tLRPC$TL_contacts_unblock.id = getInputPeer(tLRPC$Chat);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_unblock, MessagesController$$ExternalSyntheticLambda345.INSTANCE);
    }

    public void getBlockedPeers(final boolean z) {
        if (getUserConfig().isClientActivated() && !this.loadingBlockedPeers) {
            this.loadingBlockedPeers = true;
            final TLRPC$TL_contacts_getBlocked tLRPC$TL_contacts_getBlocked = new TLRPC$TL_contacts_getBlocked();
            tLRPC$TL_contacts_getBlocked.offset = z ? 0 : this.blockePeers.size();
            tLRPC$TL_contacts_getBlocked.limit = z ? 20 : 100;
            getConnectionsManager().sendRequest(tLRPC$TL_contacts_getBlocked, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$getBlockedPeers$87(z, tLRPC$TL_contacts_getBlocked, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$getBlockedPeers$87(final boolean z, final TLRPC$TL_contacts_getBlocked tLRPC$TL_contacts_getBlocked, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getBlockedPeers$86(tLObject, z, tLRPC$TL_contacts_getBlocked);
            }
        });
    }

    public void lambda$getBlockedPeers$86(TLObject tLObject, boolean z, TLRPC$TL_contacts_getBlocked tLRPC$TL_contacts_getBlocked) {
        if (tLObject != null) {
            TLRPC$contacts_Blocked tLRPC$contacts_Blocked = (TLRPC$contacts_Blocked) tLObject;
            putUsers(tLRPC$contacts_Blocked.users, false);
            putChats(tLRPC$contacts_Blocked.chats, false);
            getMessagesStorage().putUsersAndChats(tLRPC$contacts_Blocked.users, tLRPC$contacts_Blocked.chats, true, true);
            if (z) {
                this.blockePeers.clear();
            }
            this.totalBlockedCount = Math.max(tLRPC$contacts_Blocked.count, tLRPC$contacts_Blocked.blocked.size());
            this.blockedEndReached = tLRPC$contacts_Blocked.blocked.size() < tLRPC$TL_contacts_getBlocked.limit;
            int size = tLRPC$contacts_Blocked.blocked.size();
            for (int i = 0; i < size; i++) {
                this.blockePeers.put(MessageObject.getPeerId(tLRPC$contacts_Blocked.blocked.get(i).peer_id), 1);
            }
            this.loadingBlockedPeers = false;
            getNotificationCenter().postNotificationName(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        }
    }

    public void deleteUserPhoto(TLRPC$InputPhoto tLRPC$InputPhoto) {
        if (tLRPC$InputPhoto == null) {
            TLRPC$TL_photos_updateProfilePhoto tLRPC$TL_photos_updateProfilePhoto = new TLRPC$TL_photos_updateProfilePhoto();
            tLRPC$TL_photos_updateProfilePhoto.id = new TLRPC$TL_inputPhotoEmpty();
            getUserConfig().getCurrentUser().photo = new TLRPC$TL_userProfilePhotoEmpty();
            TLRPC$User user = getUser(Long.valueOf(getUserConfig().getClientUserId()));
            if (user == null) {
                user = getUserConfig().getCurrentUser();
            }
            if (user != null) {
                user.photo = getUserConfig().getCurrentUser().photo;
                getNotificationCenter().postNotificationName(NotificationCenter.mainUserInfoChanged, new Object[0]);
                getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_ALL));
                getConnectionsManager().sendRequest(tLRPC$TL_photos_updateProfilePhoto, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$deleteUserPhoto$89(tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            return;
        }
        TLRPC$TL_photos_deletePhotos tLRPC$TL_photos_deletePhotos = new TLRPC$TL_photos_deletePhotos();
        tLRPC$TL_photos_deletePhotos.id.add(tLRPC$InputPhoto);
        getConnectionsManager().sendRequest(tLRPC$TL_photos_deletePhotos, MessagesController$$ExternalSyntheticLambda347.INSTANCE);
    }

    public void lambda$deleteUserPhoto$89(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_photos_photo tLRPC$TL_photos_photo = (TLRPC$TL_photos_photo) tLObject;
            TLRPC$User user = getUser(Long.valueOf(getUserConfig().getClientUserId()));
            if (user == null) {
                user = getUserConfig().getCurrentUser();
                putUser(user, false);
            } else {
                getUserConfig().setCurrentUser(user);
            }
            if (user != null) {
                getMessagesStorage().clearUserPhotos(user.id);
                ArrayList<TLRPC$User> arrayList = new ArrayList<>();
                arrayList.add(user);
                getMessagesStorage().putUsersAndChats(arrayList, null, false, true);
                if (tLRPC$TL_photos_photo.photo instanceof TLRPC$TL_photo) {
                    TLRPC$TL_userProfilePhoto tLRPC$TL_userProfilePhoto = new TLRPC$TL_userProfilePhoto();
                    user.photo = tLRPC$TL_userProfilePhoto;
                    tLRPC$TL_userProfilePhoto.has_video = !tLRPC$TL_photos_photo.photo.video_sizes.isEmpty();
                    TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = user.photo;
                    TLRPC$Photo tLRPC$Photo = tLRPC$TL_photos_photo.photo;
                    tLRPC$UserProfilePhoto.photo_id = tLRPC$Photo.id;
                    tLRPC$UserProfilePhoto.photo_small = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, ImageReceiver.DEFAULT_CROSSFADE_DURATION).location;
                    user.photo.photo_big = FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_photos_photo.photo.sizes, 800).location;
                    user.photo.dc_id = tLRPC$TL_photos_photo.photo.dc_id;
                } else {
                    user.photo = new TLRPC$TL_userProfilePhotoEmpty();
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$deleteUserPhoto$88();
                    }
                });
            }
        }
    }

    public void lambda$deleteUserPhoto$88() {
        getNotificationCenter().postNotificationName(NotificationCenter.mainUserInfoChanged, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_ALL));
        getUserConfig().saveConfig(true);
    }

    public void processLoadedUserPhotos(final TLRPC$photos_Photos tLRPC$photos_Photos, final ArrayList<TLRPC$Message> arrayList, final long j, final int i, int i2, final boolean z, final int i3) {
        if (!z) {
            getMessagesStorage().putUsersAndChats(tLRPC$photos_Photos.users, null, true, true);
            getMessagesStorage().putDialogPhotos(j, tLRPC$photos_Photos, arrayList);
        } else if (tLRPC$photos_Photos == null || tLRPC$photos_Photos.photos.isEmpty()) {
            loadDialogPhotos(j, i, i2, false, i3);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedUserPhotos$91(tLRPC$photos_Photos, z, j, i, i3, arrayList);
            }
        });
    }

    public void lambda$processLoadedUserPhotos$91(TLRPC$photos_Photos tLRPC$photos_Photos, boolean z, long j, int i, int i2, ArrayList arrayList) {
        putUsers(tLRPC$photos_Photos.users, z);
        getNotificationCenter().postNotificationName(NotificationCenter.dialogPhotosLoaded, Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), tLRPC$photos_Photos.photos, arrayList);
    }

    public void uploadAndApplyUserAvatar(TLRPC$FileLocation tLRPC$FileLocation) {
        if (tLRPC$FileLocation != null) {
            this.uploadingAvatar = FileLoader.getDirectory(4) + "/" + tLRPC$FileLocation.volume_id + "_" + tLRPC$FileLocation.local_id + ".jpg";
            getFileLoader().uploadFile(this.uploadingAvatar, false, true, ConnectionsManager.FileTypePhoto);
        }
    }

    public void saveTheme(Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent, boolean z, boolean z2) {
        TLRPC$TL_theme tLRPC$TL_theme = themeAccent != null ? themeAccent.info : themeInfo.info;
        if (tLRPC$TL_theme != null) {
            TLRPC$TL_account_saveTheme tLRPC$TL_account_saveTheme = new TLRPC$TL_account_saveTheme();
            TLRPC$TL_inputTheme tLRPC$TL_inputTheme = new TLRPC$TL_inputTheme();
            tLRPC$TL_inputTheme.id = tLRPC$TL_theme.id;
            tLRPC$TL_inputTheme.access_hash = tLRPC$TL_theme.access_hash;
            tLRPC$TL_account_saveTheme.theme = tLRPC$TL_inputTheme;
            tLRPC$TL_account_saveTheme.unsave = z2;
            getConnectionsManager().sendRequest(tLRPC$TL_account_saveTheme, MessagesController$$ExternalSyntheticLambda333.INSTANCE);
            getConnectionsManager().resumeNetworkMaybe();
        }
        if (!z2) {
            installTheme(themeInfo, themeAccent, z);
        }
    }

    public void installTheme(Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent, boolean z) {
        TLRPC$TL_theme tLRPC$TL_theme = themeAccent != null ? themeAccent.info : themeInfo.info;
        String str = themeAccent != null ? themeAccent.patternSlug : themeInfo.slug;
        boolean z2 = themeAccent == null && themeInfo.isBlured;
        boolean z3 = themeAccent != null ? themeAccent.patternMotion : themeInfo.isMotion;
        TLRPC$TL_account_installTheme tLRPC$TL_account_installTheme = new TLRPC$TL_account_installTheme();
        tLRPC$TL_account_installTheme.dark = z;
        if (tLRPC$TL_theme != null) {
            tLRPC$TL_account_installTheme.format = "android";
            TLRPC$TL_inputTheme tLRPC$TL_inputTheme = new TLRPC$TL_inputTheme();
            tLRPC$TL_inputTheme.id = tLRPC$TL_theme.id;
            tLRPC$TL_inputTheme.access_hash = tLRPC$TL_theme.access_hash;
            tLRPC$TL_account_installTheme.theme = tLRPC$TL_inputTheme;
            tLRPC$TL_account_installTheme.flags |= 2;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_account_installTheme, MessagesController$$ExternalSyntheticLambda340.INSTANCE);
        if (!TextUtils.isEmpty(str)) {
            TLRPC$TL_account_installWallPaper tLRPC$TL_account_installWallPaper = new TLRPC$TL_account_installWallPaper();
            TLRPC$TL_inputWallPaperSlug tLRPC$TL_inputWallPaperSlug = new TLRPC$TL_inputWallPaperSlug();
            tLRPC$TL_inputWallPaperSlug.slug = str;
            tLRPC$TL_account_installWallPaper.wallpaper = tLRPC$TL_inputWallPaperSlug;
            TLRPC$TL_wallPaperSettings tLRPC$TL_wallPaperSettings = new TLRPC$TL_wallPaperSettings();
            tLRPC$TL_account_installWallPaper.settings = tLRPC$TL_wallPaperSettings;
            tLRPC$TL_wallPaperSettings.blur = z2;
            tLRPC$TL_wallPaperSettings.motion = z3;
            getConnectionsManager().sendRequest(tLRPC$TL_account_installWallPaper, MessagesController$$ExternalSyntheticLambda334.INSTANCE);
        }
    }

    public void saveThemeToServer(final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent) {
        File file;
        String str;
        if (themeInfo != null) {
            if (themeAccent != 0) {
                str = themeAccent.saveToFile().getAbsolutePath();
                file = themeAccent.getPathToWallpaper();
            } else {
                str = themeInfo.pathToFile;
                file = null;
            }
            final String str2 = str;
            final File file2 = file;
            if (str2 != null && !this.uploadingThemes.containsKey(str2)) {
                this.uploadingThemes.put(str2, themeAccent != 0 ? themeAccent : themeInfo);
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$saveThemeToServer$96(str2, file2, themeAccent, themeInfo);
                    }
                });
            }
        }
    }

    public void lambda$saveThemeToServer$96(final String str, File file, final Theme.ThemeAccent themeAccent, final Theme.ThemeInfo themeInfo) {
        final String createThemePreviewImage = Theme.createThemePreviewImage(str, file != null ? file.getAbsolutePath() : null, themeAccent);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$saveThemeToServer$95(createThemePreviewImage, str, themeAccent, themeInfo);
            }
        });
    }

    public void lambda$saveThemeToServer$95(String str, String str2, Theme.ThemeAccent themeAccent, Theme.ThemeInfo themeInfo) {
        if (str == null) {
            this.uploadingThemes.remove(str2);
            return;
        }
        this.uploadingThemes.put(str, themeAccent != null ? themeAccent : themeInfo);
        if (themeAccent == null) {
            themeInfo.uploadingFile = str2;
            themeInfo.uploadingThumb = str;
        } else {
            themeAccent.uploadingFile = str2;
            themeAccent.uploadingThumb = str;
        }
        getFileLoader().uploadFile(str2, false, true, ConnectionsManager.FileTypeFile);
        getFileLoader().uploadFile(str, false, true, ConnectionsManager.FileTypePhoto);
    }

    public void saveWallpaperToServer(java.io.File r10, org.telegram.ui.ActionBar.Theme.OverrideWallpaperInfo r11, boolean r12, final long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.saveWallpaperToServer(java.io.File, org.telegram.ui.ActionBar.Theme$OverrideWallpaperInfo, boolean, long):void");
    }

    public void lambda$saveWallpaperToServer$97(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        getMessagesStorage().removePendingTask(j);
    }

    public void markDialogMessageAsDeleted(long j, ArrayList<Integer> arrayList) {
        MessageObject messageObject = this.dialogMessage.get(j);
        if (messageObject != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (messageObject.getId() == arrayList.get(i).intValue()) {
                    messageObject.deleted = true;
                    return;
                }
            }
        }
    }

    public void deleteMessages(ArrayList<Integer> arrayList, ArrayList<Long> arrayList2, TLRPC$EncryptedChat tLRPC$EncryptedChat, long j, boolean z, boolean z2) {
        deleteMessages(arrayList, arrayList2, tLRPC$EncryptedChat, j, z, z2, false, 0L, null);
    }

    public void deleteMessages(ArrayList<Integer> arrayList, ArrayList<Long> arrayList2, TLRPC$EncryptedChat tLRPC$EncryptedChat, long j, boolean z, boolean z2, boolean z3) {
        deleteMessages(arrayList, arrayList2, tLRPC$EncryptedChat, j, z, z2, z3, 0L, null);
    }

    public void deleteMessages(ArrayList<Integer> arrayList, ArrayList<Long> arrayList2, TLRPC$EncryptedChat tLRPC$EncryptedChat, long j, boolean z, boolean z2, boolean z3, long j2, TLObject tLObject) {
        ArrayList<Integer> arrayList3;
        long j3;
        NativeByteBuffer nativeByteBuffer;
        final long j4;
        TLRPC$TL_messages_deleteMessages tLRPC$TL_messages_deleteMessages;
        NativeByteBuffer nativeByteBuffer2;
        Exception e;
        long j5;
        TLRPC$TL_channels_deleteMessages tLRPC$TL_channels_deleteMessages;
        NativeByteBuffer nativeByteBuffer3;
        Exception e2;
        final long j6;
        TLRPC$TL_messages_deleteScheduledMessages tLRPC$TL_messages_deleteScheduledMessages;
        NativeByteBuffer nativeByteBuffer4;
        Exception e3;
        long j7;
        ArrayList<Integer> arrayList4;
        char c;
        if ((arrayList != null && !arrayList.isEmpty()) || j2 != 0) {
            if (j2 == 0) {
                if (j == 0 || !DialogObject.isChatDialog(j)) {
                    j7 = 0;
                } else {
                    TLRPC$Chat chat = getChat(Long.valueOf(-j));
                    j7 = ChatObject.isChannel(chat) ? chat.id : 0L;
                }
                if (!z3) {
                    ArrayList<Integer> arrayList5 = new ArrayList<>();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        Integer num = arrayList.get(i);
                        if (num.intValue() > 0) {
                            arrayList5.add(num);
                        }
                    }
                    arrayList4 = arrayList5;
                } else {
                    arrayList4 = null;
                }
                if (z2) {
                    getMessagesStorage().markMessagesAsDeleted(j, arrayList, true, false, true);
                    c = 1;
                } else {
                    if (j7 == 0) {
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            MessageObject messageObject = this.dialogMessagesByIds.get(arrayList.get(i2).intValue());
                            if (messageObject != null) {
                                messageObject.deleted = true;
                            }
                        }
                    } else {
                        markDialogMessageAsDeleted(j, arrayList);
                    }
                    getMessagesStorage().markMessagesAsDeleted(j, arrayList, true, z, false);
                    c = 1;
                    getMessagesStorage().updateDialogsWithDeletedMessages(j, j7, arrayList, null, true);
                }
                NotificationCenter notificationCenter = getNotificationCenter();
                int i3 = NotificationCenter.messagesDeleted;
                Object[] objArr = new Object[3];
                objArr[0] = arrayList;
                objArr[c] = Long.valueOf(j7);
                objArr[2] = Boolean.valueOf(z2);
                notificationCenter.postNotificationName(i3, objArr);
                j3 = j7;
                arrayList3 = arrayList4;
            } else {
                j3 = tLObject instanceof TLRPC$TL_channels_deleteMessages ? ((TLRPC$TL_channels_deleteMessages) tLObject).channel.channel_id : 0L;
                arrayList3 = null;
            }
            if (!z3) {
                if (z2) {
                    if (tLObject instanceof TLRPC$TL_messages_deleteScheduledMessages) {
                        tLRPC$TL_messages_deleteScheduledMessages = (TLRPC$TL_messages_deleteScheduledMessages) tLObject;
                        j6 = j2;
                    } else {
                        TLRPC$TL_messages_deleteScheduledMessages tLRPC$TL_messages_deleteScheduledMessages2 = new TLRPC$TL_messages_deleteScheduledMessages();
                        tLRPC$TL_messages_deleteScheduledMessages2.id = arrayList3;
                        tLRPC$TL_messages_deleteScheduledMessages2.peer = getInputPeer(j);
                        try {
                            nativeByteBuffer4 = new NativeByteBuffer(tLRPC$TL_messages_deleteScheduledMessages2.getObjectSize() + 12);
                        } catch (Exception e4) {
                            e3 = e4;
                            nativeByteBuffer4 = null;
                        }
                        try {
                            nativeByteBuffer4.writeInt32(24);
                            nativeByteBuffer4.writeInt64(j);
                            tLRPC$TL_messages_deleteScheduledMessages2.serializeToStream(nativeByteBuffer4);
                        } catch (Exception e5) {
                            e3 = e5;
                            FileLog.e(e3);
                            j6 = getMessagesStorage().createPendingTask(nativeByteBuffer4);
                            tLRPC$TL_messages_deleteScheduledMessages = tLRPC$TL_messages_deleteScheduledMessages2;
                            getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteScheduledMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                                    MessagesController.this.lambda$deleteMessages$98(j6, tLObject2, tLRPC$TL_error);
                                }
                            });
                        }
                        j6 = getMessagesStorage().createPendingTask(nativeByteBuffer4);
                        tLRPC$TL_messages_deleteScheduledMessages = tLRPC$TL_messages_deleteScheduledMessages2;
                    }
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteScheduledMessages, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$deleteMessages$98(j6, tLObject2, tLRPC$TL_error);
                        }
                    });
                } else if (j3 != 0) {
                    if (tLObject != null) {
                        tLRPC$TL_channels_deleteMessages = (TLRPC$TL_channels_deleteMessages) tLObject;
                        j5 = j2;
                    } else {
                        TLRPC$TL_channels_deleteMessages tLRPC$TL_channels_deleteMessages2 = new TLRPC$TL_channels_deleteMessages();
                        tLRPC$TL_channels_deleteMessages2.id = arrayList3;
                        tLRPC$TL_channels_deleteMessages2.channel = getInputChannel(j3);
                        try {
                            nativeByteBuffer3 = new NativeByteBuffer(tLRPC$TL_channels_deleteMessages2.getObjectSize() + 12);
                        } catch (Exception e6) {
                            e2 = e6;
                            nativeByteBuffer3 = null;
                        }
                        try {
                            nativeByteBuffer3.writeInt32(24);
                            nativeByteBuffer3.writeInt64(j);
                            tLRPC$TL_channels_deleteMessages2.serializeToStream(nativeByteBuffer3);
                        } catch (Exception e7) {
                            e2 = e7;
                            FileLog.e(e2);
                            j5 = getMessagesStorage().createPendingTask(nativeByteBuffer3);
                            tLRPC$TL_channels_deleteMessages = tLRPC$TL_channels_deleteMessages2;
                            final long j8 = j3;
                            final long j9 = j5;
                            getConnectionsManager().sendRequest(tLRPC$TL_channels_deleteMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                                    MessagesController.this.lambda$deleteMessages$99(j8, j9, tLObject2, tLRPC$TL_error);
                                }
                            });
                        }
                        j5 = getMessagesStorage().createPendingTask(nativeByteBuffer3);
                        tLRPC$TL_channels_deleteMessages = tLRPC$TL_channels_deleteMessages2;
                    }
                    final long j82 = j3;
                    final long j92 = j5;
                    getConnectionsManager().sendRequest(tLRPC$TL_channels_deleteMessages, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$deleteMessages$99(j82, j92, tLObject2, tLRPC$TL_error);
                        }
                    });
                } else {
                    if (arrayList2 == null || tLRPC$EncryptedChat == null || arrayList2.isEmpty()) {
                        nativeByteBuffer = null;
                    } else {
                        nativeByteBuffer = null;
                        getSecretChatHelper().sendMessagesDeleteMessage(tLRPC$EncryptedChat, arrayList2, null);
                    }
                    if (tLObject instanceof TLRPC$TL_messages_deleteMessages) {
                        tLRPC$TL_messages_deleteMessages = (TLRPC$TL_messages_deleteMessages) tLObject;
                        j4 = j2;
                    } else {
                        TLRPC$TL_messages_deleteMessages tLRPC$TL_messages_deleteMessages2 = new TLRPC$TL_messages_deleteMessages();
                        tLRPC$TL_messages_deleteMessages2.id = arrayList3;
                        tLRPC$TL_messages_deleteMessages2.revoke = z;
                        try {
                            nativeByteBuffer2 = new NativeByteBuffer(tLRPC$TL_messages_deleteMessages2.getObjectSize() + 12);
                        } catch (Exception e8) {
                            e = e8;
                            nativeByteBuffer2 = nativeByteBuffer;
                        }
                        try {
                            nativeByteBuffer2.writeInt32(24);
                            nativeByteBuffer2.writeInt64(j);
                            tLRPC$TL_messages_deleteMessages2.serializeToStream(nativeByteBuffer2);
                        } catch (Exception e9) {
                            e = e9;
                            FileLog.e(e);
                            j4 = getMessagesStorage().createPendingTask(nativeByteBuffer2);
                            tLRPC$TL_messages_deleteMessages = tLRPC$TL_messages_deleteMessages2;
                            getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                                    MessagesController.this.lambda$deleteMessages$100(j4, tLObject2, tLRPC$TL_error);
                                }
                            });
                        }
                        j4 = getMessagesStorage().createPendingTask(nativeByteBuffer2);
                        tLRPC$TL_messages_deleteMessages = tLRPC$TL_messages_deleteMessages2;
                    }
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteMessages, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$deleteMessages$100(j4, tLObject2, tLRPC$TL_error);
                        }
                    });
                }
            }
        }
    }

    public void lambda$deleteMessages$98(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$deleteMessages$99(long j, long j2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewChannelDifferenceParams(tLRPC$TL_messages_affectedMessages.pts, tLRPC$TL_messages_affectedMessages.pts_count, j);
        }
        if (j2 != 0) {
            getMessagesStorage().removePendingTask(j2);
        }
    }

    public void lambda$deleteMessages$100(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void unpinAllMessages(final TLRPC$Chat tLRPC$Chat, final TLRPC$User tLRPC$User) {
        if (tLRPC$Chat != null || tLRPC$User != null) {
            TLRPC$TL_messages_unpinAllMessages tLRPC$TL_messages_unpinAllMessages = new TLRPC$TL_messages_unpinAllMessages();
            tLRPC$TL_messages_unpinAllMessages.peer = getInputPeer(tLRPC$Chat != null ? -tLRPC$Chat.id : tLRPC$User.id);
            getConnectionsManager().sendRequest(tLRPC$TL_messages_unpinAllMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$unpinAllMessages$101(tLRPC$Chat, tLRPC$User, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$unpinAllMessages$101(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_affectedHistory tLRPC$TL_messages_affectedHistory = (TLRPC$TL_messages_affectedHistory) tLObject;
            if (ChatObject.isChannel(tLRPC$Chat)) {
                processNewChannelDifferenceParams(tLRPC$TL_messages_affectedHistory.pts, tLRPC$TL_messages_affectedHistory.pts_count, tLRPC$Chat.id);
            } else {
                processNewDifferenceParams(-1, tLRPC$TL_messages_affectedHistory.pts, -1, tLRPC$TL_messages_affectedHistory.pts_count);
            }
            new ArrayList();
            getMessagesStorage().updatePinnedMessages(tLRPC$Chat != null ? -tLRPC$Chat.id : tLRPC$User.id, null, false, 0, 0, false, null);
        }
    }

    public void pinMessage(final TLRPC$Chat tLRPC$Chat, final TLRPC$User tLRPC$User, final int i, final boolean z, boolean z2, boolean z3) {
        if (tLRPC$Chat != null || tLRPC$User != null) {
            TLRPC$TL_messages_updatePinnedMessage tLRPC$TL_messages_updatePinnedMessage = new TLRPC$TL_messages_updatePinnedMessage();
            tLRPC$TL_messages_updatePinnedMessage.peer = getInputPeer(tLRPC$Chat != null ? -tLRPC$Chat.id : tLRPC$User.id);
            tLRPC$TL_messages_updatePinnedMessage.id = i;
            tLRPC$TL_messages_updatePinnedMessage.unpin = z;
            tLRPC$TL_messages_updatePinnedMessage.silent = !z3;
            tLRPC$TL_messages_updatePinnedMessage.pm_oneside = z2;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_updatePinnedMessage, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$pinMessage$102(i, tLRPC$Chat, tLRPC$User, z, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$pinMessage$102(int i, TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, boolean z, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(Integer.valueOf(i));
            getMessagesStorage().updatePinnedMessages(tLRPC$Chat != null ? -tLRPC$Chat.id : tLRPC$User.id, arrayList, !z, -1, 0, false, null);
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void deleteUserChannelHistory(final TLRPC$Chat tLRPC$Chat, final TLRPC$User tLRPC$User, final TLRPC$Chat tLRPC$Chat2, int i) {
        long j;
        if (tLRPC$User != null) {
            j = tLRPC$User.id;
        } else {
            j = tLRPC$Chat2 != null ? tLRPC$Chat2.id : 0L;
        }
        if (i == 0) {
            getMessagesStorage().deleteUserChatHistory(-tLRPC$Chat.id, j);
        }
        TLRPC$TL_channels_deleteParticipantHistory tLRPC$TL_channels_deleteParticipantHistory = new TLRPC$TL_channels_deleteParticipantHistory();
        tLRPC$TL_channels_deleteParticipantHistory.channel = getInputChannel(tLRPC$Chat);
        tLRPC$TL_channels_deleteParticipantHistory.participant = tLRPC$User != null ? getInputPeer(tLRPC$User) : getInputPeer(tLRPC$Chat2);
        getConnectionsManager().sendRequest(tLRPC$TL_channels_deleteParticipantHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$deleteUserChannelHistory$103(tLRPC$Chat, tLRPC$User, tLRPC$Chat2, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$deleteUserChannelHistory$103(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedHistory tLRPC$TL_messages_affectedHistory = (TLRPC$TL_messages_affectedHistory) tLObject;
            int i = tLRPC$TL_messages_affectedHistory.offset;
            if (i > 0) {
                deleteUserChannelHistory(tLRPC$Chat, tLRPC$User, tLRPC$Chat2, i);
            }
            processNewChannelDifferenceParams(tLRPC$TL_messages_affectedHistory.pts, tLRPC$TL_messages_affectedHistory.pts_count, tLRPC$Chat.id);
        }
    }

    public ArrayList<TLRPC$Dialog> getAllDialogs() {
        return this.allDialogs;
    }

    public void putDialogsEndReachedAfterRegistration() {
        this.dialogsEndReached.put(0, true);
        this.serverDialogsEndReached.put(0, true);
    }

    public boolean isDialogsEndReached(int i) {
        return this.dialogsEndReached.get(i);
    }

    public boolean isLoadingDialogs(int i) {
        return this.loadingDialogs.get(i);
    }

    public boolean isServerDialogsEndReached(int i) {
        return this.serverDialogsEndReached.get(i);
    }

    public boolean hasHiddenArchive() {
        return SharedConfig.archiveHidden && this.dialogs_dict.get(DialogObject.makeFolderDialogId(1)) != null;
    }

    public ArrayList<TLRPC$Dialog> getDialogs(int i) {
        ArrayList<TLRPC$Dialog> arrayList = this.dialogsByFolder.get(i);
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public int getAllFoldersDialogsCount() {
        int i = 0;
        for (int i2 = 0; i2 < this.dialogsByFolder.size(); i2++) {
            SparseArray<ArrayList<TLRPC$Dialog>> sparseArray = this.dialogsByFolder;
            ArrayList<TLRPC$Dialog> arrayList = sparseArray.get(sparseArray.keyAt(i2));
            if (arrayList != null) {
                i += arrayList.size();
            }
        }
        return i;
    }

    public int getTotalDialogsCount() {
        ArrayList<TLRPC$Dialog> arrayList = this.dialogsByFolder.get(0);
        if (arrayList != null) {
            return 0 + arrayList.size();
        }
        return 0;
    }

    public void putAllNeededDraftDialogs() {
        LongSparseArray<SparseArray<TLRPC$DraftMessage>> drafts = getMediaDataController().getDrafts();
        int size = drafts.size();
        for (int i = 0; i < size; i++) {
            TLRPC$DraftMessage tLRPC$DraftMessage = drafts.valueAt(i).get(0);
            if (tLRPC$DraftMessage != null) {
                putDraftDialogIfNeed(drafts.keyAt(i), tLRPC$DraftMessage);
            }
        }
    }

    public void putDraftDialogIfNeed(long j, TLRPC$DraftMessage tLRPC$DraftMessage) {
        if (this.dialogs_dict.indexOfKey(j) < 0) {
            MediaDataController mediaDataController = getMediaDataController();
            int size = this.allDialogs.size();
            int i = 0;
            if (size > 0) {
                TLRPC$Dialog tLRPC$Dialog = this.allDialogs.get(size - 1);
                if (tLRPC$DraftMessage.date < DialogObject.getLastMessageOrDraftDate(tLRPC$Dialog, mediaDataController.getDraft(tLRPC$Dialog.id, 0))) {
                    return;
                }
            }
            TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
            tLRPC$TL_dialog.id = j;
            tLRPC$TL_dialog.draft = tLRPC$DraftMessage;
            tLRPC$TL_dialog.folder_id = mediaDataController.getDraftFolderId(j);
            if (j < 0 && ChatObject.isChannel(getChat(Long.valueOf(-j)))) {
                i = 1;
            }
            tLRPC$TL_dialog.flags = i;
            this.dialogs_dict.put(j, tLRPC$TL_dialog);
            this.allDialogs.add(tLRPC$TL_dialog);
            sortDialogs(null);
        }
    }

    public void removeDraftDialogIfNeed(long j) {
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog != null && tLRPC$Dialog.top_message == 0) {
            this.dialogs_dict.remove(tLRPC$Dialog.id);
            this.allDialogs.remove(tLRPC$Dialog);
        }
    }

    private void removeDialog(TLRPC$Dialog tLRPC$Dialog) {
        if (tLRPC$Dialog != null) {
            final long j = tLRPC$Dialog.id;
            if (this.dialogsServerOnly.remove(tLRPC$Dialog) && DialogObject.isChannel(tLRPC$Dialog)) {
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$removeDialog$104(j);
                    }
                });
            }
            this.allDialogs.remove(tLRPC$Dialog);
            this.dialogsMyChannels.remove(tLRPC$Dialog);
            this.dialogsMyGroups.remove(tLRPC$Dialog);
            this.dialogsCanAddUsers.remove(tLRPC$Dialog);
            this.dialogsChannelsOnly.remove(tLRPC$Dialog);
            this.dialogsGroupsOnly.remove(tLRPC$Dialog);
            this.dialogsUsersOnly.remove(tLRPC$Dialog);
            this.dialogsForBlock.remove(tLRPC$Dialog);
            this.dialogsForward.remove(tLRPC$Dialog);
            int i = 0;
            while (true) {
                DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                if (i >= dialogFilterArr.length) {
                    break;
                }
                if (dialogFilterArr[i] != null) {
                    dialogFilterArr[i].dialogs.remove(tLRPC$Dialog);
                }
                i++;
            }
            this.dialogs_dict.remove(j);
            ArrayList<TLRPC$Dialog> arrayList = this.dialogsByFolder.get(tLRPC$Dialog.folder_id);
            if (arrayList != null) {
                arrayList.remove(tLRPC$Dialog);
            }
        }
    }

    public void lambda$removeDialog$104(long j) {
        long j2 = -j;
        this.channelsPts.delete(j2);
        this.shortPollChannels.delete(j2);
        this.needShortPollChannels.delete(j2);
        this.shortPollOnlines.delete(j2);
        this.needShortPollOnlines.delete(j2);
    }

    public void hidePromoDialog() {
        if (this.promoDialog != null) {
            TLRPC$TL_help_hidePromoData tLRPC$TL_help_hidePromoData = new TLRPC$TL_help_hidePromoData();
            tLRPC$TL_help_hidePromoData.peer = getInputPeer(this.promoDialog.id);
            getConnectionsManager().sendRequest(tLRPC$TL_help_hidePromoData, MessagesController$$ExternalSyntheticLambda351.INSTANCE);
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$hidePromoDialog$106();
                }
            });
            removePromoDialog();
        }
    }

    public void lambda$hidePromoDialog$106() {
        this.promoDialogId = 0L;
        this.proxyDialogAddress = null;
        this.nextPromoInfoCheckTime = getConnectionsManager().getCurrentTime() + 3600;
        getGlobalMainSettings().edit().putLong("proxy_dialog", this.promoDialogId).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.nextPromoInfoCheckTime).commit();
    }

    public void deleteDialog(long j, int i) {
        deleteDialog(j, i, false);
    }

    public void deleteDialog(long j, int i, boolean z) {
        deleteDialog(j, 1, i, 0, z, null, 0L);
    }

    public void setDialogHistoryTTL(long j, int i) {
        TLRPC$UserFull tLRPC$UserFull;
        TLRPC$TL_messages_setHistoryTTL tLRPC$TL_messages_setHistoryTTL = new TLRPC$TL_messages_setHistoryTTL();
        tLRPC$TL_messages_setHistoryTTL.peer = getInputPeer(j);
        tLRPC$TL_messages_setHistoryTTL.period = i;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_setHistoryTTL, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setDialogHistoryTTL$107(tLObject, tLRPC$TL_error);
            }
        });
        Object obj = null;
        if (j > 0) {
            tLRPC$UserFull = getUserFull(j);
            if (tLRPC$UserFull != null) {
                tLRPC$UserFull.ttl_period = i;
                tLRPC$UserFull.flags |= 16384;
            } else {
                return;
            }
        } else {
            TLRPC$ChatFull chatFull = getChatFull(-j);
            if (chatFull != null) {
                chatFull.ttl_period = i;
                if (chatFull instanceof TLRPC$TL_channelFull) {
                    chatFull.flags |= ConnectionsManager.FileTypePhoto;
                } else {
                    chatFull.flags |= 16384;
                }
                tLRPC$UserFull = null;
                obj = chatFull;
            } else {
                return;
            }
        }
        if (obj != null) {
            NotificationCenter notificationCenter = getNotificationCenter();
            int i2 = NotificationCenter.chatInfoDidLoad;
            Boolean bool = Boolean.FALSE;
            notificationCenter.postNotificationName(i2, obj, 0, bool, bool);
            return;
        }
        getNotificationCenter().postNotificationName(NotificationCenter.userInfoDidLoad, Long.valueOf(j), tLRPC$UserFull);
    }

    public void lambda$setDialogHistoryTTL$107(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void setDialogsInTransaction(boolean z) {
        this.dialogsInTransaction = z;
        if (!z) {
            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
        }
    }

    public void deleteDialog(final long r26, int r28, final int r29, int r30, final boolean r31, final org.telegram.tgnet.TLRPC$InputPeer r32, final long r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.deleteDialog(long, int, int, int, boolean, org.telegram.tgnet.TLRPC$InputPeer, long):void");
    }

    public void lambda$deleteDialog$108(long j, int i, boolean z, TLRPC$InputPeer tLRPC$InputPeer, long j2, int i2) {
        deleteDialog(j, 2, i, Math.max(0, i2), z, tLRPC$InputPeer, j2);
        checkIfFolderEmpty(1);
    }

    public void lambda$deleteDialog$109(long j) {
        getNotificationsController().removeNotificationsForDialog(j);
    }

    public void lambda$deleteDialog$110(final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteDialog$109(j);
            }
        });
    }

    public void lambda$deleteDialog$111(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void lambda$deleteDialog$112(long j, long j2, int i, int i2, boolean z, TLRPC$InputPeer tLRPC$InputPeer, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedHistory tLRPC$TL_messages_affectedHistory = (TLRPC$TL_messages_affectedHistory) tLObject;
            if (tLRPC$TL_messages_affectedHistory.offset > 0) {
                deleteDialog(j2, 0, i, i2, z, tLRPC$InputPeer, 0L);
            }
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedHistory.pts, -1, tLRPC$TL_messages_affectedHistory.pts_count);
            getMessagesStorage().onDeleteQueryComplete(j2);
        }
    }

    public void saveGif(final Object obj, TLRPC$Document tLRPC$Document) {
        if (obj != null && MessageObject.isGifDocument(tLRPC$Document)) {
            final TLRPC$TL_messages_saveGif tLRPC$TL_messages_saveGif = new TLRPC$TL_messages_saveGif();
            TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
            tLRPC$TL_messages_saveGif.id = tLRPC$TL_inputDocument;
            tLRPC$TL_inputDocument.id = tLRPC$Document.id;
            tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
            byte[] bArr = tLRPC$Document.file_reference;
            tLRPC$TL_inputDocument.file_reference = bArr;
            if (bArr == null) {
                tLRPC$TL_inputDocument.file_reference = new byte[0];
            }
            tLRPC$TL_messages_saveGif.unsave = false;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_saveGif, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$saveGif$113(obj, tLRPC$TL_messages_saveGif, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$saveGif$113(Object obj, TLRPC$TL_messages_saveGif tLRPC$TL_messages_saveGif, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null && FileRefController.isFileRefError(tLRPC$TL_error.text)) {
            getFileRefController().requestReference(obj, tLRPC$TL_messages_saveGif);
        }
    }

    public void saveRecentSticker(final Object obj, TLRPC$Document tLRPC$Document, boolean z) {
        if (obj != null && tLRPC$Document != null) {
            final TLRPC$TL_messages_saveRecentSticker tLRPC$TL_messages_saveRecentSticker = new TLRPC$TL_messages_saveRecentSticker();
            TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
            tLRPC$TL_messages_saveRecentSticker.id = tLRPC$TL_inputDocument;
            tLRPC$TL_inputDocument.id = tLRPC$Document.id;
            tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
            byte[] bArr = tLRPC$Document.file_reference;
            tLRPC$TL_inputDocument.file_reference = bArr;
            if (bArr == null) {
                tLRPC$TL_inputDocument.file_reference = new byte[0];
            }
            tLRPC$TL_messages_saveRecentSticker.unsave = false;
            tLRPC$TL_messages_saveRecentSticker.attached = z;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_saveRecentSticker, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$saveRecentSticker$114(obj, tLRPC$TL_messages_saveRecentSticker, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$saveRecentSticker$114(Object obj, TLRPC$TL_messages_saveRecentSticker tLRPC$TL_messages_saveRecentSticker, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null && FileRefController.isFileRefError(tLRPC$TL_error.text)) {
            getFileRefController().requestReference(obj, tLRPC$TL_messages_saveRecentSticker);
        }
    }

    public void loadChannelParticipants(final Long l) {
        if (!this.loadingFullParticipants.contains(l) && !this.loadedFullParticipants.contains(l)) {
            this.loadingFullParticipants.add(l);
            TLRPC$TL_channels_getParticipants tLRPC$TL_channels_getParticipants = new TLRPC$TL_channels_getParticipants();
            tLRPC$TL_channels_getParticipants.channel = getInputChannel(l.longValue());
            tLRPC$TL_channels_getParticipants.filter = new TLRPC$TL_channelParticipantsRecent();
            tLRPC$TL_channels_getParticipants.offset = 0;
            tLRPC$TL_channels_getParticipants.limit = 32;
            getConnectionsManager().sendRequest(tLRPC$TL_channels_getParticipants, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadChannelParticipants$116(l, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadChannelParticipants$116(final Long l, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadChannelParticipants$115(tLRPC$TL_error, tLObject, l);
            }
        });
    }

    public void lambda$loadChannelParticipants$115(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, Long l) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_channels_channelParticipants tLRPC$TL_channels_channelParticipants = (TLRPC$TL_channels_channelParticipants) tLObject;
            putUsers(tLRPC$TL_channels_channelParticipants.users, false);
            putChats(tLRPC$TL_channels_channelParticipants.chats, false);
            getMessagesStorage().putUsersAndChats(tLRPC$TL_channels_channelParticipants.users, tLRPC$TL_channels_channelParticipants.chats, true, true);
            getMessagesStorage().updateChannelUsers(l.longValue(), tLRPC$TL_channels_channelParticipants.participants);
            this.loadedFullParticipants.add(l);
        }
        this.loadingFullParticipants.remove(l);
    }

    public void putChatFull(TLRPC$ChatFull tLRPC$ChatFull) {
        this.fullChats.put(tLRPC$ChatFull.id, tLRPC$ChatFull);
    }

    public void processChatInfo(final long j, final TLRPC$ChatFull tLRPC$ChatFull, final ArrayList<TLRPC$User> arrayList, final boolean z, final boolean z2, final boolean z3, final ArrayList<Integer> arrayList2, final HashMap<Integer, MessageObject> hashMap, final int i, final boolean z4) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processChatInfo$117(z, j, z3, z2, tLRPC$ChatFull, arrayList, arrayList2, hashMap, i, z4);
            }
        });
    }

    public void lambda$processChatInfo$117(boolean z, long j, boolean z2, boolean z3, TLRPC$ChatFull tLRPC$ChatFull, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap, int i, boolean z4) {
        if (z && j > 0 && !z2) {
            loadFullChat(j, 0, z3);
        }
        if (tLRPC$ChatFull != null) {
            if (this.fullChats.get(j) == null) {
                this.fullChats.put(j, tLRPC$ChatFull);
            }
            putUsers(arrayList, z);
            if (tLRPC$ChatFull.stickerset != null) {
                getMediaDataController().getGroupStickerSetById(tLRPC$ChatFull.stickerset);
            }
            getNotificationCenter().postNotificationName(NotificationCenter.chatInfoDidLoad, tLRPC$ChatFull, 0, Boolean.valueOf(z2), Boolean.FALSE);
        }
        if (arrayList2 != null) {
            getNotificationCenter().postNotificationName(NotificationCenter.pinnedInfoDidLoad, Long.valueOf(-j), arrayList2, hashMap, Integer.valueOf(i), Boolean.valueOf(z4));
        }
    }

    public void loadUserInfo(TLRPC$User tLRPC$User, boolean z, int i) {
        loadUserInfo(tLRPC$User, z, i, 0);
    }

    public void loadUserInfo(TLRPC$User tLRPC$User, boolean z, int i, int i2) {
        getMessagesStorage().loadUserInfo(tLRPC$User, z, i, i2);
    }

    public void processUserInfo(final TLRPC$User tLRPC$User, final TLRPC$UserFull tLRPC$UserFull, final boolean z, final boolean z2, final int i, final ArrayList<Integer> arrayList, final HashMap<Integer, MessageObject> hashMap, final int i2, final boolean z3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUserInfo$118(z, tLRPC$User, i, z2, tLRPC$UserFull, arrayList, hashMap, i2, z3);
            }
        });
    }

    public void lambda$processUserInfo$118(boolean z, TLRPC$User tLRPC$User, int i, boolean z2, TLRPC$UserFull tLRPC$UserFull, ArrayList arrayList, HashMap hashMap, int i2, boolean z3) {
        if (z) {
            loadFullUser(tLRPC$User, i, z2);
        }
        if (tLRPC$UserFull != null) {
            if (this.fullUsers.get(tLRPC$User.id) == null) {
                this.fullUsers.put(tLRPC$User.id, tLRPC$UserFull);
                int indexOfKey = this.blockePeers.indexOfKey(tLRPC$User.id);
                if (tLRPC$UserFull.blocked) {
                    if (indexOfKey < 0) {
                        this.blockePeers.put(tLRPC$User.id, 1);
                        getNotificationCenter().postNotificationName(NotificationCenter.blockedUsersDidLoad, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    this.blockePeers.removeAt(indexOfKey);
                    getNotificationCenter().postNotificationName(NotificationCenter.blockedUsersDidLoad, new Object[0]);
                }
            }
            getNotificationCenter().postNotificationName(NotificationCenter.userInfoDidLoad, Long.valueOf(tLRPC$User.id), tLRPC$UserFull);
        }
        if (arrayList != null) {
            getNotificationCenter().postNotificationName(NotificationCenter.pinnedInfoDidLoad, Long.valueOf(tLRPC$User.id), arrayList, hashMap, Integer.valueOf(i2), Boolean.valueOf(z3));
        }
    }

    public void updateTimerProc() {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = 0;
        checkDeletingTask(false);
        checkReadTasks();
        if (getUserConfig().isClientActivated()) {
            if (this.ignoreSetOnline || getConnectionsManager().getPauseTime() != 0 || !ApplicationLoader.isScreenOn || ApplicationLoader.mainInterfacePausedStageQueue) {
                if (this.statusSettingState != 2 && !this.offlineSent && Math.abs(System.currentTimeMillis() - getConnectionsManager().getPauseTime()) >= 2000) {
                    this.statusSettingState = 2;
                    if (this.statusRequest != 0) {
                        getConnectionsManager().cancelRequest(this.statusRequest, true);
                    }
                    TLRPC$TL_account_updateStatus tLRPC$TL_account_updateStatus = new TLRPC$TL_account_updateStatus();
                    tLRPC$TL_account_updateStatus.offline = true;
                    this.statusRequest = getConnectionsManager().sendRequest(tLRPC$TL_account_updateStatus, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$updateTimerProc$120(tLObject, tLRPC$TL_error);
                        }
                    });
                }
            } else if (ApplicationLoader.mainInterfacePausedStageQueueTime != 0 && Math.abs(ApplicationLoader.mainInterfacePausedStageQueueTime - System.currentTimeMillis()) > 1000 && this.statusSettingState != 1 && (this.lastStatusUpdateTime == 0 || Math.abs(System.currentTimeMillis() - this.lastStatusUpdateTime) >= 55000 || this.offlineSent)) {
                this.statusSettingState = 1;
                if (this.statusRequest != 0) {
                    getConnectionsManager().cancelRequest(this.statusRequest, true);
                }
                TLRPC$TL_account_updateStatus tLRPC$TL_account_updateStatus2 = new TLRPC$TL_account_updateStatus();
                tLRPC$TL_account_updateStatus2.offline = false;
                this.statusRequest = getConnectionsManager().sendRequest(tLRPC$TL_account_updateStatus2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$updateTimerProc$119(tLObject, tLRPC$TL_error);
                    }
                });
            }
            if (this.updatesQueueChannels.size() != 0) {
                for (int i5 = 0; i5 < this.updatesQueueChannels.size(); i5++) {
                    long keyAt = this.updatesQueueChannels.keyAt(i5);
                    if (Math.abs(currentTimeMillis - this.updatesStartWaitTimeChannels.valueAt(i5)) >= 1500) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("QUEUE CHANNEL " + keyAt + " UPDATES WAIT TIMEOUT - CHECK QUEUE");
                        }
                        processChannelsUpdatesQueue(keyAt, 0);
                    }
                }
            }
            for (int i6 = 0; i6 < 3; i6++) {
                if (getUpdatesStartTime(i6) != 0 && Math.abs(currentTimeMillis - getUpdatesStartTime(i6)) >= 1500) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(i6 + " QUEUE UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    processUpdatesQueue(i6, 0);
                }
            }
        }
        final int currentTime = getConnectionsManager().getCurrentTime();
        if (Math.abs(System.currentTimeMillis() - this.lastViewsCheckTime) >= 5000) {
            this.lastViewsCheckTime = System.currentTimeMillis();
            if (this.channelViewsToSend.size() != 0) {
                int i7 = 0;
                while (i7 < this.channelViewsToSend.size()) {
                    final long keyAt2 = this.channelViewsToSend.keyAt(i7);
                    final TLRPC$TL_messages_getMessagesViews tLRPC$TL_messages_getMessagesViews = new TLRPC$TL_messages_getMessagesViews();
                    tLRPC$TL_messages_getMessagesViews.peer = getInputPeer(keyAt2);
                    tLRPC$TL_messages_getMessagesViews.id = this.channelViewsToSend.valueAt(i7);
                    tLRPC$TL_messages_getMessagesViews.increment = i7 == 0;
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessagesViews, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$updateTimerProc$122(keyAt2, tLRPC$TL_messages_getMessagesViews, tLObject, tLRPC$TL_error);
                        }
                    });
                    i7++;
                }
                this.channelViewsToSend.clear();
            }
            if (this.pollsToCheckSize > 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$updateTimerProc$124(currentTime);
                    }
                });
            }
        }
        if (!this.onlinePrivacy.isEmpty()) {
            ArrayList arrayList2 = null;
            for (Map.Entry<Long, Integer> entry : this.onlinePrivacy.entrySet()) {
                if (entry.getValue().intValue() < currentTime - 30) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(entry.getKey());
                }
            }
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    this.onlinePrivacy.remove((Long) it.next());
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$updateTimerProc$125();
                    }
                });
            }
        }
        if (this.shortPollChannels.size() != 0) {
            int i8 = 0;
            while (i8 < this.shortPollChannels.size()) {
                long keyAt3 = this.shortPollChannels.keyAt(i8);
                if (this.shortPollChannels.valueAt(i8) < System.currentTimeMillis() / 1000) {
                    this.shortPollChannels.delete(keyAt3);
                    i8--;
                    if (this.needShortPollChannels.indexOfKey(keyAt3) >= 0) {
                        getChannelDifference(keyAt3);
                    }
                }
                i8++;
            }
        }
        if (this.shortPollOnlines.size() != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            int i9 = 0;
            while (i9 < this.shortPollOnlines.size()) {
                final long keyAt4 = this.shortPollOnlines.keyAt(i9);
                if (this.shortPollOnlines.valueAt(i9) < elapsedRealtime) {
                    if (this.needShortPollChannels.indexOfKey(keyAt4) >= 0) {
                        this.shortPollOnlines.put(keyAt4, (int) (300 + elapsedRealtime));
                    } else {
                        this.shortPollOnlines.delete(keyAt4);
                        i9--;
                    }
                    TLRPC$TL_messages_getOnlines tLRPC$TL_messages_getOnlines = new TLRPC$TL_messages_getOnlines();
                    tLRPC$TL_messages_getOnlines.peer = getInputPeer(-keyAt4);
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_getOnlines, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$updateTimerProc$127(keyAt4, tLObject, tLRPC$TL_error);
                        }
                    });
                }
                i9++;
            }
        }
        if (!this.printingUsers.isEmpty() || this.lastPrintingStringCount != this.printingUsers.size()) {
            ArrayList arrayList3 = new ArrayList(this.printingUsers.keySet());
            int i10 = 0;
            boolean z = false;
            while (i10 < arrayList3.size()) {
                Long l = (Long) arrayList3.get(i10);
                ConcurrentHashMap<Integer, ArrayList<PrintingUser>> concurrentHashMap = this.printingUsers.get(l);
                if (concurrentHashMap != null) {
                    ArrayList arrayList4 = new ArrayList(concurrentHashMap.keySet());
                    int i11 = 0;
                    while (i11 < arrayList4.size()) {
                        Integer num = (Integer) arrayList4.get(i11);
                        ArrayList<PrintingUser> arrayList5 = concurrentHashMap.get(num);
                        if (arrayList5 != null) {
                            while (i4 < arrayList5.size()) {
                                PrintingUser printingUser = arrayList5.get(i4);
                                l = l;
                                arrayList3 = arrayList3;
                                i10 = i10;
                                if (printingUser.lastTime + (printingUser.action instanceof TLRPC$TL_sendMessageGamePlayAction ? 30000 : 5900) < currentTimeMillis) {
                                    arrayList5.remove(printingUser);
                                    i4--;
                                    i3 = 1;
                                    z = true;
                                } else {
                                    i3 = 1;
                                }
                                i4 += i3;
                            }
                        }
                        arrayList3 = arrayList3;
                        i10 = i10;
                        l = l;
                        if (arrayList5 == null || arrayList5.isEmpty()) {
                            concurrentHashMap.remove(num);
                            arrayList4.remove(i11);
                            i11--;
                        }
                        i11++;
                        i4 = 0;
                    }
                }
                ArrayList arrayList6 = arrayList3;
                int i12 = i10;
                Long l2 = l;
                if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                    this.printingUsers.remove(l2);
                    arrayList = arrayList6;
                    arrayList.remove(i12);
                    i2 = i12 - 1;
                } else {
                    arrayList = arrayList6;
                    i2 = i12;
                }
                i10 = i2 + 1;
                arrayList3 = arrayList;
                i4 = 0;
            }
            i = 1;
            updatePrintingStrings();
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$updateTimerProc$128();
                    }
                });
            }
        } else {
            i = 1;
        }
        if (Theme.selectedAutoNightType == i && Math.abs(currentTimeMillis - lastThemeCheckTime) >= 60) {
            AndroidUtilities.runOnUIThread(this.themeCheckRunnable);
            lastThemeCheckTime = currentTimeMillis;
        }
        if (getUserConfig().savedPasswordHash != null && Math.abs(currentTimeMillis - lastPasswordCheckTime) >= 60) {
            AndroidUtilities.runOnUIThread(this.passwordCheckRunnable);
            lastPasswordCheckTime = currentTimeMillis;
        }
        if (this.lastPushRegisterSendTime != 0 && Math.abs(SystemClock.elapsedRealtime() - this.lastPushRegisterSendTime) >= 10800000) {
            GcmPushListenerService.sendRegistrationToServer(SharedConfig.pushString);
        }
        getLocationController().update();
        lambda$checkPromoInfo$131(false);
        checkTosUpdate();
    }

    public void lambda$updateTimerProc$119(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            this.lastStatusUpdateTime = System.currentTimeMillis();
            this.offlineSent = false;
            this.statusSettingState = 0;
        } else {
            long j = this.lastStatusUpdateTime;
            if (j != 0) {
                this.lastStatusUpdateTime = j + 5000;
            }
        }
        this.statusRequest = 0;
    }

    public void lambda$updateTimerProc$120(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            this.offlineSent = true;
        } else {
            long j = this.lastStatusUpdateTime;
            if (j != 0) {
                this.lastStatusUpdateTime = j + 5000;
            }
        }
        this.statusRequest = 0;
    }

    public void lambda$updateTimerProc$122(long j, TLRPC$TL_messages_getMessagesViews tLRPC$TL_messages_getMessagesViews, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$TL_messages_messageViews tLRPC$TL_messages_messageViews = (TLRPC$TL_messages_messageViews) tLObject;
            final LongSparseArray<SparseIntArray> longSparseArray = new LongSparseArray<>();
            final LongSparseArray<SparseIntArray> longSparseArray2 = new LongSparseArray<>();
            final LongSparseArray<SparseArray<TLRPC$MessageReplies>> longSparseArray3 = new LongSparseArray<>();
            SparseIntArray sparseIntArray = longSparseArray.get(j);
            SparseIntArray sparseIntArray2 = longSparseArray2.get(j);
            SparseArray<TLRPC$MessageReplies> sparseArray = longSparseArray3.get(j);
            for (int i = 0; i < tLRPC$TL_messages_getMessagesViews.id.size() && i < tLRPC$TL_messages_messageViews.views.size(); i++) {
                TLRPC$TL_messageViews tLRPC$TL_messageViews = tLRPC$TL_messages_messageViews.views.get(i);
                if ((1 & tLRPC$TL_messageViews.flags) != 0) {
                    if (sparseIntArray == null) {
                        sparseIntArray = new SparseIntArray();
                        longSparseArray.put(j, sparseIntArray);
                    }
                    sparseIntArray.put(tLRPC$TL_messages_getMessagesViews.id.get(i).intValue(), tLRPC$TL_messageViews.views);
                }
                if ((tLRPC$TL_messageViews.flags & 2) != 0) {
                    if (sparseIntArray2 == null) {
                        sparseIntArray2 = new SparseIntArray();
                        longSparseArray2.put(j, sparseIntArray2);
                    }
                    sparseIntArray2.put(tLRPC$TL_messages_getMessagesViews.id.get(i).intValue(), tLRPC$TL_messageViews.forwards);
                }
                if ((tLRPC$TL_messageViews.flags & 4) != 0) {
                    if (sparseArray == null) {
                        sparseArray = new SparseArray<>();
                        longSparseArray3.put(j, sparseArray);
                    }
                    sparseArray.put(tLRPC$TL_messages_getMessagesViews.id.get(i).intValue(), tLRPC$TL_messageViews.replies);
                }
            }
            getMessagesStorage().putUsersAndChats(tLRPC$TL_messages_messageViews.users, tLRPC$TL_messages_messageViews.chats, true, true);
            getMessagesStorage().putChannelViews(longSparseArray, longSparseArray2, longSparseArray3, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$updateTimerProc$121(tLRPC$TL_messages_messageViews, longSparseArray, longSparseArray2, longSparseArray3);
                }
            });
        }
    }

    public void lambda$updateTimerProc$121(TLRPC$TL_messages_messageViews tLRPC$TL_messages_messageViews, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, LongSparseArray longSparseArray3) {
        putUsers(tLRPC$TL_messages_messageViews.users, false);
        putChats(tLRPC$TL_messages_messageViews.chats, false);
        getNotificationCenter().postNotificationName(NotificationCenter.didUpdateMessagesViews, longSparseArray, longSparseArray2, longSparseArray3, Boolean.FALSE);
    }

    public void lambda$updateTimerProc$124(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$updateTimerProc$124(int):void");
    }

    public void lambda$updateTimerProc$123(boolean z, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$Poll tLRPC$Poll;
        if (tLRPC$TL_error == null) {
            TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
            if (z) {
                for (int i = 0; i < tLRPC$Updates.updates.size(); i++) {
                    TLRPC$Update tLRPC$Update = tLRPC$Updates.updates.get(i);
                    if ((tLRPC$Update instanceof TLRPC$TL_updateMessagePoll) && (tLRPC$Poll = ((TLRPC$TL_updateMessagePoll) tLRPC$Update).poll) != null && !tLRPC$Poll.closed) {
                        this.lastViewsCheckTime = System.currentTimeMillis() - 4000;
                    }
                }
            }
            processUpdates(tLRPC$Updates, false);
        }
    }

    public void lambda$updateTimerProc$125() {
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_STATUS));
    }

    public void lambda$updateTimerProc$127(final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$TL_chatOnlines tLRPC$TL_chatOnlines = (TLRPC$TL_chatOnlines) tLObject;
            getMessagesStorage().updateChatOnlineCount(j, tLRPC$TL_chatOnlines.onlines);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$updateTimerProc$126(j, tLRPC$TL_chatOnlines);
                }
            });
        }
    }

    public void lambda$updateTimerProc$126(long j, TLRPC$TL_chatOnlines tLRPC$TL_chatOnlines) {
        getNotificationCenter().postNotificationName(NotificationCenter.chatOnlineCountDidLoad, Long.valueOf(j), Integer.valueOf(tLRPC$TL_chatOnlines.onlines));
    }

    public void lambda$updateTimerProc$128() {
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_USER_PRINT));
    }

    private void checkTosUpdate() {
        if (this.nextTosCheckTime <= getConnectionsManager().getCurrentTime() && !this.checkingTosUpdate && getUserConfig().isClientActivated()) {
            this.checkingTosUpdate = true;
            getConnectionsManager().sendRequest(new TLObject() {
                public static int constructor = 749019089;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                    return TLRPC$help_TermsOfServiceUpdate.TLdeserialize(abstractSerializedData, i, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkTosUpdate$130(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$checkTosUpdate$130(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.checkingTosUpdate = false;
        if (tLObject instanceof TLRPC$TL_help_termsOfServiceUpdateEmpty) {
            this.nextTosCheckTime = ((TLRPC$TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
        } else if (tLObject instanceof TLRPC$TL_help_termsOfServiceUpdate) {
            final TLRPC$TL_help_termsOfServiceUpdate tLRPC$TL_help_termsOfServiceUpdate = (TLRPC$TL_help_termsOfServiceUpdate) tLObject;
            this.nextTosCheckTime = tLRPC$TL_help_termsOfServiceUpdate.expires;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkTosUpdate$129(tLRPC$TL_help_termsOfServiceUpdate);
                }
            });
        } else {
            this.nextTosCheckTime = getConnectionsManager().getCurrentTime() + 3600;
        }
        this.notificationsPreferences.edit().putInt("nextTosCheckTime", this.nextTosCheckTime).commit();
    }

    public void lambda$checkTosUpdate$129(TLRPC$TL_help_termsOfServiceUpdate tLRPC$TL_help_termsOfServiceUpdate) {
        getNotificationCenter().postNotificationName(NotificationCenter.needShowAlert, 4, tLRPC$TL_help_termsOfServiceUpdate.terms_of_service);
    }

    public void checkPromoInfo(final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkPromoInfo$131(z);
            }
        });
    }

    public void lambda$checkPromoInfo$131(boolean z) {
        String str;
        boolean z2 = false;
        if (z && this.checkingPromoInfo) {
            this.checkingPromoInfo = false;
        }
        if ((z || this.nextPromoInfoCheckTime <= getConnectionsManager().getCurrentTime()) && !this.checkingPromoInfo) {
            if (this.checkingPromoInfoRequestId != 0) {
                getConnectionsManager().cancelRequest(this.checkingPromoInfoRequestId, true);
                this.checkingPromoInfoRequestId = 0;
            }
            SharedPreferences globalMainSettings = getGlobalMainSettings();
            globalMainSettings.getBoolean("proxy_enabled", false);
            final String string = globalMainSettings.getString("proxy_ip", "");
            final String string2 = globalMainSettings.getString("proxy_secret", "");
            if (!(this.promoDialogId == 0 || this.promoDialogType != PROMO_TYPE_PROXY || (str = this.proxyDialogAddress) == null)) {
                if (!str.equals(string + string2)) {
                    z2 = true;
                }
            }
            final int i = this.lastCheckPromoId + 1;
            this.lastCheckPromoId = i;
            this.checkingPromoInfo = true;
            this.checkingPromoInfoRequestId = getConnectionsManager().sendRequest(new TLObject() {
                public static int constructor = -1063816159;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i2, boolean z3) {
                    return TLRPC$help_PromoData.TLdeserialize(abstractSerializedData, i2, z3);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkPromoInfoInternal$136(i, string, string2, tLObject, tLRPC$TL_error);
                }
            });
            if (z2) {
                this.promoDialogId = 0L;
                this.proxyDialogAddress = null;
                this.nextPromoInfoCheckTime = getConnectionsManager().getCurrentTime() + 3600;
                getGlobalMainSettings().edit().putLong("proxy_dialog", this.promoDialogId).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.nextPromoInfoCheckTime).commit();
                AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda11(this));
            }
        }
    }

    public void lambda$checkPromoInfoInternal$136(final int r17, java.lang.String r18, java.lang.String r19, org.telegram.tgnet.TLObject r20, org.telegram.tgnet.TLRPC$TL_error r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$checkPromoInfoInternal$136(int, java.lang.String, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$checkPromoInfoInternal$135(final long j, final TLRPC$TL_help_promoData tLRPC$TL_help_promoData, final int i) {
        TLRPC$Dialog tLRPC$Dialog = this.promoDialog;
        if (!(tLRPC$Dialog == null || j == tLRPC$Dialog.id)) {
            removePromoDialog();
        }
        TLRPC$Dialog tLRPC$Dialog2 = this.dialogs_dict.get(j);
        this.promoDialog = tLRPC$Dialog2;
        if (tLRPC$Dialog2 != null) {
            this.checkingPromoInfo = false;
            sortDialogs(null);
            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
            return;
        }
        LongSparseArray longSparseArray = new LongSparseArray();
        LongSparseArray longSparseArray2 = new LongSparseArray();
        for (int i2 = 0; i2 < tLRPC$TL_help_promoData.users.size(); i2++) {
            TLRPC$User tLRPC$User = tLRPC$TL_help_promoData.users.get(i2);
            longSparseArray.put(tLRPC$User.id, tLRPC$User);
        }
        for (int i3 = 0; i3 < tLRPC$TL_help_promoData.chats.size(); i3++) {
            TLRPC$Chat tLRPC$Chat = tLRPC$TL_help_promoData.chats.get(i3);
            longSparseArray2.put(tLRPC$Chat.id, tLRPC$Chat);
        }
        TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs = new TLRPC$TL_messages_getPeerDialogs();
        TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
        TLRPC$Peer tLRPC$Peer = tLRPC$TL_help_promoData.peer;
        if (tLRPC$Peer.user_id != 0) {
            TLRPC$TL_inputPeerUser tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
            tLRPC$TL_inputDialogPeer.peer = tLRPC$TL_inputPeerUser;
            long j2 = tLRPC$TL_help_promoData.peer.user_id;
            tLRPC$TL_inputPeerUser.user_id = j2;
            TLRPC$User tLRPC$User2 = (TLRPC$User) longSparseArray.get(j2);
            if (tLRPC$User2 != null) {
                tLRPC$TL_inputDialogPeer.peer.access_hash = tLRPC$User2.access_hash;
            }
        } else if (tLRPC$Peer.chat_id != 0) {
            TLRPC$TL_inputPeerChat tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChat();
            tLRPC$TL_inputDialogPeer.peer = tLRPC$TL_inputPeerChat;
            long j3 = tLRPC$TL_help_promoData.peer.chat_id;
            tLRPC$TL_inputPeerChat.chat_id = j3;
            TLRPC$Chat tLRPC$Chat2 = (TLRPC$Chat) longSparseArray2.get(j3);
            if (tLRPC$Chat2 != null) {
                tLRPC$TL_inputDialogPeer.peer.access_hash = tLRPC$Chat2.access_hash;
            }
        } else {
            TLRPC$TL_inputPeerChannel tLRPC$TL_inputPeerChannel = new TLRPC$TL_inputPeerChannel();
            tLRPC$TL_inputDialogPeer.peer = tLRPC$TL_inputPeerChannel;
            long j4 = tLRPC$TL_help_promoData.peer.channel_id;
            tLRPC$TL_inputPeerChannel.channel_id = j4;
            TLRPC$Chat tLRPC$Chat3 = (TLRPC$Chat) longSparseArray2.get(j4);
            if (tLRPC$Chat3 != null) {
                tLRPC$TL_inputDialogPeer.peer.access_hash = tLRPC$Chat3.access_hash;
            }
        }
        tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer);
        this.checkingPromoInfoRequestId = getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$checkPromoInfoInternal$134(i, tLRPC$TL_help_promoData, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$checkPromoInfoInternal$134(int i, final TLRPC$TL_help_promoData tLRPC$TL_help_promoData, final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (i == this.lastCheckPromoId) {
            this.checkingPromoInfoRequestId = 0;
            final TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            if (tLRPC$TL_messages_peerDialogs == null || tLRPC$TL_messages_peerDialogs.dialogs.isEmpty()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkPromoInfoInternal$133();
                    }
                });
            } else {
                getMessagesStorage().putUsersAndChats(tLRPC$TL_help_promoData.users, tLRPC$TL_help_promoData.chats, true, true);
                TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
                tLRPC$TL_messages_dialogs.chats = tLRPC$TL_messages_peerDialogs.chats;
                tLRPC$TL_messages_dialogs.users = tLRPC$TL_messages_peerDialogs.users;
                tLRPC$TL_messages_dialogs.dialogs = tLRPC$TL_messages_peerDialogs.dialogs;
                tLRPC$TL_messages_dialogs.messages = tLRPC$TL_messages_peerDialogs.messages;
                getMessagesStorage().putDialogs(tLRPC$TL_messages_dialogs, 2);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkPromoInfoInternal$132(tLRPC$TL_help_promoData, tLRPC$TL_messages_peerDialogs, j);
                    }
                });
            }
            this.checkingPromoInfo = false;
        }
    }

    public void lambda$checkPromoInfoInternal$132(TLRPC$TL_help_promoData tLRPC$TL_help_promoData, TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs, long j) {
        Integer num = 0;
        putUsers(tLRPC$TL_help_promoData.users, false);
        putChats(tLRPC$TL_help_promoData.chats, false);
        putUsers(tLRPC$TL_messages_peerDialogs.users, false);
        putChats(tLRPC$TL_messages_peerDialogs.chats, false);
        TLRPC$Dialog tLRPC$Dialog = this.promoDialog;
        if (tLRPC$Dialog != null) {
            long j2 = tLRPC$Dialog.id;
            if (j2 < 0) {
                TLRPC$Chat chat = getChat(Long.valueOf(-j2));
                if (ChatObject.isNotInChat(chat) || chat.restricted) {
                    removeDialog(this.promoDialog);
                }
            } else {
                removeDialog(tLRPC$Dialog);
            }
        }
        TLRPC$Dialog tLRPC$Dialog2 = tLRPC$TL_messages_peerDialogs.dialogs.get(0);
        this.promoDialog = tLRPC$Dialog2;
        tLRPC$Dialog2.id = j;
        tLRPC$Dialog2.folder_id = 0;
        if (DialogObject.isChannel(tLRPC$Dialog2)) {
            LongSparseIntArray longSparseIntArray = this.channelsPts;
            TLRPC$Dialog tLRPC$Dialog3 = this.promoDialog;
            longSparseIntArray.put(-tLRPC$Dialog3.id, tLRPC$Dialog3.pts);
        }
        Integer num2 = this.dialogs_read_inbox_max.get(Long.valueOf(this.promoDialog.id));
        if (num2 == null) {
            num2 = num;
        }
        this.dialogs_read_inbox_max.put(Long.valueOf(this.promoDialog.id), Integer.valueOf(Math.max(num2.intValue(), this.promoDialog.read_inbox_max_id)));
        Integer num3 = this.dialogs_read_outbox_max.get(Long.valueOf(this.promoDialog.id));
        if (num3 != null) {
            num = num3;
        }
        this.dialogs_read_outbox_max.put(Long.valueOf(this.promoDialog.id), Integer.valueOf(Math.max(num.intValue(), this.promoDialog.read_outbox_max_id)));
        this.dialogs_dict.put(j, this.promoDialog);
        if (!tLRPC$TL_messages_peerDialogs.messages.isEmpty()) {
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i = 0; i < tLRPC$TL_messages_peerDialogs.users.size(); i++) {
                TLRPC$User tLRPC$User = tLRPC$TL_messages_peerDialogs.users.get(i);
                longSparseArray.put(tLRPC$User.id, tLRPC$User);
            }
            for (int i2 = 0; i2 < tLRPC$TL_messages_peerDialogs.chats.size(); i2++) {
                TLRPC$Chat tLRPC$Chat = tLRPC$TL_messages_peerDialogs.chats.get(i2);
                longSparseArray2.put(tLRPC$Chat.id, tLRPC$Chat);
            }
            MessageObject messageObject = new MessageObject(this.currentAccount, tLRPC$TL_messages_peerDialogs.messages.get(0), (LongSparseArray<TLRPC$User>) longSparseArray, (LongSparseArray<TLRPC$Chat>) longSparseArray2, false, true);
            this.dialogMessage.put(j, messageObject);
            TLRPC$Dialog tLRPC$Dialog4 = this.promoDialog;
            if (tLRPC$Dialog4.last_message_date == 0) {
                tLRPC$Dialog4.last_message_date = messageObject.messageOwner.date;
            }
        }
        sortDialogs(null);
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public void lambda$checkPromoInfoInternal$133() {
        TLRPC$Dialog tLRPC$Dialog = this.promoDialog;
        if (tLRPC$Dialog != null) {
            long j = tLRPC$Dialog.id;
            if (j < 0) {
                TLRPC$Chat chat = getChat(Long.valueOf(-j));
                if (ChatObject.isNotInChat(chat) || chat.restricted) {
                    removeDialog(this.promoDialog);
                }
            } else {
                removeDialog(tLRPC$Dialog);
            }
            this.promoDialog = null;
            sortDialogs(null);
            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void removePromoDialog() {
        TLRPC$Dialog tLRPC$Dialog = this.promoDialog;
        if (tLRPC$Dialog != null) {
            long j = tLRPC$Dialog.id;
            if (j < 0) {
                TLRPC$Chat chat = getChat(Long.valueOf(-j));
                if (ChatObject.isNotInChat(chat) || chat.restricted) {
                    removeDialog(this.promoDialog);
                }
            } else {
                removeDialog(tLRPC$Dialog);
            }
            this.promoDialog = null;
            sortDialogs(null);
            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public boolean isPromoDialog(long j, boolean z) {
        TLRPC$Dialog tLRPC$Dialog = this.promoDialog;
        return tLRPC$Dialog != null && tLRPC$Dialog.id == j && (!z || this.isLeftPromoChannel);
    }

    private String getUserNameForTyping(TLRPC$User tLRPC$User) {
        if (tLRPC$User == null) {
            return "";
        }
        String str = tLRPC$User.first_name;
        if (str != null && str.length() > 0) {
            return tLRPC$User.first_name;
        }
        String str2 = tLRPC$User.last_name;
        if (str2 == null || str2.length() <= 0) {
            return "";
        }
        return tLRPC$User.last_name;
    }

    private void updatePrintingStrings() {
        String str;
        int i;
        int i2;
        final LongSparseArray longSparseArray = new LongSparseArray();
        final LongSparseArray longSparseArray2 = new LongSparseArray();
        for (Map.Entry<Long, ConcurrentHashMap<Integer, ArrayList<PrintingUser>>> entry : this.printingUsers.entrySet()) {
            Long key = entry.getKey();
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(key.longValue());
            for (Map.Entry<Integer, ArrayList<PrintingUser>> entry2 : entry.getValue().entrySet()) {
                Integer key2 = entry2.getKey();
                ArrayList<PrintingUser> value = entry2.getValue();
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                longSparseArray.put(key.longValue(), sparseArray);
                longSparseArray2.put(key.longValue(), sparseArray2);
                String str2 = "IsTypingGroup";
                if (key.longValue() > 0 || isEncryptedDialog || value.size() == 1) {
                    PrintingUser printingUser = value.get(0);
                    TLRPC$User user = getUser(Long.valueOf(printingUser.userId));
                    if (user != null) {
                        TLRPC$SendMessageAction tLRPC$SendMessageAction = printingUser.action;
                        if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageRecordAudioAction) {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("RecordingAudio", R.string.RecordingAudio));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString("IsRecordingAudio", R.string.IsRecordingAudio, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 1);
                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageRecordRoundAction) {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("RecordingRound", R.string.RecordingRound));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString("IsRecordingRound", R.string.IsRecordingRound, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 4);
                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageUploadRoundAction) {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("SendingVideoStatus", R.string.SendingVideoStatus));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString("IsSendingVideo", R.string.IsSendingVideo, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 4);
                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageUploadAudioAction) {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("SendingAudio", R.string.SendingAudio));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString("IsSendingAudio", R.string.IsSendingAudio, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 2);
                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageUploadVideoAction) {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("SendingVideoStatus", R.string.SendingVideoStatus));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString("IsSendingVideo", R.string.IsSendingVideo, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 2);
                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageRecordVideoAction) {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("RecordingVideoStatus", R.string.RecordingVideoStatus));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString("IsRecordingVideo", R.string.IsRecordingVideo, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 2);
                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageUploadDocumentAction) {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("SendingFile", R.string.SendingFile));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString("IsSendingFile", R.string.IsSendingFile, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 2);
                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageUploadPhotoAction) {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("SendingPhoto", R.string.SendingPhoto));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString("IsSendingPhoto", R.string.IsSendingPhoto, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 2);
                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageGamePlayAction) {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("SendingGame", R.string.SendingGame));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString("IsSendingGame", R.string.IsSendingGame, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 3);
                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageGeoLocationAction) {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("SelectingLocation", R.string.SelectingLocation));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString("IsSelectingLocation", R.string.IsSelectingLocation, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 0);
                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageChooseContactAction) {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("SelectingContact", R.string.SelectingContact));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString("IsSelectingContact", R.string.IsSelectingContact, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 0);
                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageEmojiInteractionSeen) {
                            String str3 = ((TLRPC$TL_sendMessageEmojiInteractionSeen) tLRPC$SendMessageAction).emoticon;
                            sparseArray.put(key2.intValue(), (key.longValue() >= 0 || isEncryptedDialog) ? LocaleController.formatString("EnjoyngAnimations", R.string.EnjoyngAnimations, str3) : LocaleController.formatString("IsEnjoyngAnimations", R.string.IsEnjoyngAnimations, getUserNameForTyping(user), str3));
                            sparseArray2.put(key2.intValue(), 5);
                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageChooseStickerAction) {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("ChoosingSticker", R.string.ChoosingSticker));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString("IsChoosingSticker", R.string.IsChoosingSticker, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 5);
                        } else {
                            if (key.longValue() >= 0 || isEncryptedDialog) {
                                sparseArray.put(key2.intValue(), LocaleController.getString("Typing", R.string.Typing));
                            } else {
                                sparseArray.put(key2.intValue(), LocaleController.formatString(str2, R.string.IsTypingGroup, getUserNameForTyping(user)));
                            }
                            sparseArray2.put(key2.intValue(), 0);
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    Iterator<PrintingUser> it = value.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            str = str2;
                            i = i3;
                            break;
                        }
                        str = str2;
                        TLRPC$User user2 = getUser(Long.valueOf(it.next().userId));
                        if (user2 != null) {
                            if (sb.length() != 0) {
                                sb.append(", ");
                            }
                            sb.append(getUserNameForTyping(user2));
                            i3++;
                        }
                        i = i3;
                        if (i == 2) {
                            break;
                        }
                        i3 = i;
                        str2 = str;
                    }
                    if (sb.length() != 0) {
                        if (i == 1) {
                            sparseArray.put(key2.intValue(), LocaleController.formatString(str, R.string.IsTypingGroup, sb.toString()));
                        } else if (value.size() > 2) {
                            try {
                                sparseArray.put(key2.intValue(), String.format(LocaleController.getPluralString("AndMoreTypingGroup", value.size() - 2), sb.toString(), Integer.valueOf(value.size() - 2)));
                            } catch (Exception unused) {
                                sparseArray.put(key2.intValue(), "LOC_ERR: AndMoreTypingGroup");
                            }
                        } else {
                            i2 = 0;
                            sparseArray.put(key2.intValue(), LocaleController.formatString("AreTypingGroup", R.string.AreTypingGroup, sb.toString()));
                            sparseArray2.put(key2.intValue(), Integer.valueOf(i2));
                        }
                        i2 = 0;
                        sparseArray2.put(key2.intValue(), Integer.valueOf(i2));
                    }
                }
            }
        }
        this.lastPrintingStringCount = longSparseArray.size();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$updatePrintingStrings$137(longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$updatePrintingStrings$137(LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        this.printingStrings = longSparseArray;
        this.printingStringsTypes = longSparseArray2;
    }

    public void lambda$sendTyping$140(int i, long j, int i2) {
        LongSparseArray<SparseArray<Boolean>> longSparseArray;
        SparseArray<Boolean> sparseArray;
        if (i >= 0) {
            LongSparseArray<SparseArray<Boolean>>[] longSparseArrayArr = this.sendingTypings;
            if (i < longSparseArrayArr.length && longSparseArrayArr[i] != null && (sparseArray = (longSparseArray = longSparseArrayArr[i]).get(j)) != null) {
                sparseArray.remove(i2);
                if (sparseArray.size() == 0) {
                    longSparseArray.remove(j);
                }
            }
        }
    }

    public boolean sendTyping(long j, int i, int i2, int i3) {
        return sendTyping(j, i, i2, null, i3);
    }

    public boolean sendTyping(final long j, final int i, final int i2, String str, int i3) {
        TLRPC$Chat chat;
        if (i2 < 0 || i2 >= this.sendingTypings.length || j == 0) {
            return false;
        }
        if (j < 0) {
            long j2 = -j;
            if (ChatObject.getSendAsPeerId(getChat(Long.valueOf(j2)), getChatFull(j2)) != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                return false;
            }
        } else {
            TLRPC$User user = getUser(Long.valueOf(j));
            if (user != null) {
                if (user.id == getUserConfig().getClientUserId()) {
                    return false;
                }
                TLRPC$UserStatus tLRPC$UserStatus = user.status;
                if (!(tLRPC$UserStatus == null || tLRPC$UserStatus.expires == -100 || this.onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                    if (user.status.expires <= getConnectionsManager().getCurrentTime() - 30) {
                        return false;
                    }
                }
            }
        }
        LongSparseArray<SparseArray<Boolean>>[] longSparseArrayArr = this.sendingTypings;
        LongSparseArray<SparseArray<Boolean>> longSparseArray = longSparseArrayArr[i2];
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
            longSparseArrayArr[i2] = longSparseArray;
        }
        SparseArray<Boolean> sparseArray = longSparseArray.get(j);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            longSparseArray.put(j, sparseArray);
        }
        if (sparseArray.get(i) != null) {
            return false;
        }
        if (!DialogObject.isEncryptedDialog(j)) {
            TLRPC$TL_messages_setTyping tLRPC$TL_messages_setTyping = new TLRPC$TL_messages_setTyping();
            if (i != 0) {
                tLRPC$TL_messages_setTyping.top_msg_id = i;
                tLRPC$TL_messages_setTyping.flags |= 1;
            }
            TLRPC$InputPeer inputPeer = getInputPeer(j);
            tLRPC$TL_messages_setTyping.peer = inputPeer;
            if (((inputPeer instanceof TLRPC$TL_inputPeerChannel) && ((chat = getChat(Long.valueOf(inputPeer.channel_id))) == null || !chat.megagroup)) || tLRPC$TL_messages_setTyping.peer == null) {
                return false;
            }
            if (i2 == 0) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageTypingAction();
            } else if (i2 == 1) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageRecordAudioAction();
            } else if (i2 == 2) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageCancelAction();
            } else if (i2 == 3) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageUploadDocumentAction();
            } else if (i2 == 4) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageUploadPhotoAction();
            } else if (i2 == 5) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageUploadVideoAction();
            } else if (i2 == 6) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageGamePlayAction();
            } else if (i2 == 7) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageRecordRoundAction();
            } else if (i2 == 8) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageUploadRoundAction();
            } else if (i2 == 9) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageUploadAudioAction();
            } else if (i2 == 10) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageChooseStickerAction();
            } else if (i2 == 11) {
                TLRPC$TL_sendMessageEmojiInteractionSeen tLRPC$TL_sendMessageEmojiInteractionSeen = new TLRPC$TL_sendMessageEmojiInteractionSeen();
                tLRPC$TL_sendMessageEmojiInteractionSeen.emoticon = str;
                tLRPC$TL_messages_setTyping.action = tLRPC$TL_sendMessageEmojiInteractionSeen;
            }
            sparseArray.put(i, Boolean.TRUE);
            int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_setTyping, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$sendTyping$139(i2, j, i, tLObject, tLRPC$TL_error);
                }
            }, 2);
            if (i3 != 0) {
                getConnectionsManager().bindRequestToGuid(sendRequest, i3);
            }
        } else if (i2 != 0) {
            return false;
        } else {
            TLRPC$EncryptedChat encryptedChat = getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)));
            byte[] bArr = encryptedChat.auth_key;
            if (bArr != null && bArr.length > 1 && (encryptedChat instanceof TLRPC$TL_encryptedChat)) {
                TLRPC$TL_messages_setEncryptedTyping tLRPC$TL_messages_setEncryptedTyping = new TLRPC$TL_messages_setEncryptedTyping();
                TLRPC$TL_inputEncryptedChat tLRPC$TL_inputEncryptedChat = new TLRPC$TL_inputEncryptedChat();
                tLRPC$TL_messages_setEncryptedTyping.peer = tLRPC$TL_inputEncryptedChat;
                tLRPC$TL_inputEncryptedChat.chat_id = encryptedChat.id;
                tLRPC$TL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                tLRPC$TL_messages_setEncryptedTyping.typing = true;
                sparseArray.put(i, Boolean.TRUE);
                int sendRequest2 = getConnectionsManager().sendRequest(tLRPC$TL_messages_setEncryptedTyping, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$sendTyping$141(i2, j, i, tLObject, tLRPC$TL_error);
                    }
                }, 2);
                if (i3 != 0) {
                    getConnectionsManager().bindRequestToGuid(sendRequest2, i3);
                }
            }
        }
        return true;
    }

    public void lambda$sendTyping$139(final int i, final long j, final int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$sendTyping$138(i, j, i2);
            }
        });
    }

    public void lambda$sendTyping$141(final int i, final long j, final int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$sendTyping$140(i, j, i2);
            }
        });
    }

    public void removeDeletedMessagesFromArray(long j, ArrayList<TLRPC$Message> arrayList) {
        int i = 0;
        int i2 = this.deletedHistory.get(j, 0);
        if (i2 != 0) {
            int size = arrayList.size();
            while (i < size) {
                if (arrayList.get(i).id <= i2) {
                    arrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public void loadMessages(long j, long j2, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        loadMessages(j, j2, z, i, i2, i3, z2, i4, i5, i6, i7, i8, i9, i11, i9 != 0 ? i10 : 0, 0, 0, false, 0);
    }

    public void loadMessages(long j, long j2, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z3, int i14) {
        loadMessagesInternal(j, j2, z, i, i2, i3, z2, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, z3, i14, true, true);
    }

    public void loadMessagesInternal(final long j, final long j2, final boolean z, final int i, final int i2, final int i3, boolean z2, final int i4, final int i5, final int i6, final int i7, final int i8, final int i9, final int i10, final int i11, final int i12, final int i13, final boolean z3, final int i14, boolean z4, final boolean z5) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("load messages in chat " + j + " count " + i + " max_id " + i2 + " cache " + z2 + " mindate = " + i4 + " guid " + i5 + " load_type " + i6 + " last_message_id " + i7 + " mode " + i8 + " index " + i10 + " firstUnread " + i11 + " unread_count " + i12 + " last_date " + i13 + " queryFromServer " + z3);
        }
        if (i9 == 0 && i8 != 2 && (z2 || DialogObject.isEncryptedDialog(j))) {
            getMessagesStorage().getMessages(j, j2, z, i, i2, i3, i4, i5, i6, i8 == 1, i9, i10, z5);
        } else if (i9 != 0) {
            if (i8 == 0) {
                final TLRPC$TL_messages_getReplies tLRPC$TL_messages_getReplies = new TLRPC$TL_messages_getReplies();
                tLRPC$TL_messages_getReplies.peer = getInputPeer(j);
                tLRPC$TL_messages_getReplies.msg_id = i9;
                tLRPC$TL_messages_getReplies.offset_date = i3;
                if (i6 == 4) {
                    tLRPC$TL_messages_getReplies.add_offset = (-i) + 5;
                } else if (i6 == 3) {
                    tLRPC$TL_messages_getReplies.add_offset = (-i) / 2;
                } else if (i6 == 1) {
                    tLRPC$TL_messages_getReplies.add_offset = (-i) - 1;
                } else if (i6 == 2 && i2 != 0) {
                    tLRPC$TL_messages_getReplies.add_offset = (-i) + 10;
                } else if (j < 0 && i2 != 0 && ChatObject.isChannel(getChat(Long.valueOf(-j)))) {
                    tLRPC$TL_messages_getReplies.add_offset = -1;
                    tLRPC$TL_messages_getReplies.limit++;
                }
                tLRPC$TL_messages_getReplies.limit = i;
                tLRPC$TL_messages_getReplies.offset_id = i2;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getReplies, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadMessagesInternal$143(i, i2, i3, i11, i6, j, j2, i5, i7, i12, i13, i9, i10, z3, i14, z5, tLRPC$TL_messages_getReplies, tLObject, tLRPC$TL_error);
                    }
                }), i5);
            }
        } else if (i8 != 2) {
            if (i8 == 1) {
                TLRPC$TL_messages_getScheduledHistory tLRPC$TL_messages_getScheduledHistory = new TLRPC$TL_messages_getScheduledHistory();
                tLRPC$TL_messages_getScheduledHistory.peer = getInputPeer(j);
                tLRPC$TL_messages_getScheduledHistory.hash = i4;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getScheduledHistory, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadMessagesInternal$144(i2, i3, j, j2, i, i5, i11, i7, i12, i13, i6, i8, i9, i10, z3, i14, z5, tLObject, tLRPC$TL_error);
                    }
                }), i5);
            } else if (!z4 || !((i6 == 3 || i6 == 2) && i7 == 0)) {
                final TLRPC$TL_messages_getHistory tLRPC$TL_messages_getHistory = new TLRPC$TL_messages_getHistory();
                tLRPC$TL_messages_getHistory.peer = getInputPeer(j);
                if (i6 == 4) {
                    tLRPC$TL_messages_getHistory.add_offset = (-i) + 5;
                } else if (i6 == 3) {
                    tLRPC$TL_messages_getHistory.add_offset = (-i) / 2;
                } else if (i6 == 1) {
                    tLRPC$TL_messages_getHistory.add_offset = (-i) - 1;
                } else if (i6 == 2 && i2 != 0) {
                    tLRPC$TL_messages_getHistory.add_offset = (-i) + 6;
                } else if (j < 0 && i2 != 0) {
                    if (ChatObject.isChannel(getChat(Long.valueOf(-j)))) {
                        tLRPC$TL_messages_getHistory.add_offset = -1;
                        tLRPC$TL_messages_getHistory.limit++;
                    }
                    tLRPC$TL_messages_getHistory.limit = i;
                    tLRPC$TL_messages_getHistory.offset_id = i2;
                    tLRPC$TL_messages_getHistory.offset_date = i3;
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getHistory, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$loadMessagesInternal$148(j, i, i2, i3, j2, i5, i11, i7, i12, i13, i6, i9, i10, z3, i14, z5, tLRPC$TL_messages_getHistory, tLObject, tLRPC$TL_error);
                        }
                    }), i5);
                }
                tLRPC$TL_messages_getHistory.limit = i;
                tLRPC$TL_messages_getHistory.offset_id = i2;
                tLRPC$TL_messages_getHistory.offset_date = i3;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getHistory, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadMessagesInternal$148(j, i, i2, i3, j2, i5, i11, i7, i12, i13, i6, i9, i10, z3, i14, z5, tLRPC$TL_messages_getHistory, tLObject, tLRPC$TL_error);
                    }
                }), i5);
            } else {
                final TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs = new TLRPC$TL_messages_getPeerDialogs();
                TLRPC$InputPeer inputPeer = getInputPeer(j);
                TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
                tLRPC$TL_inputDialogPeer.peer = inputPeer;
                tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer);
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadMessagesInternal$146(j, j2, z, i, i2, i3, i4, i5, i6, i9, i10, i11, i13, z3, z5, tLRPC$TL_messages_getPeerDialogs, tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
    }

    public void lambda$loadMessagesInternal$143(int i, int i2, int i3, int i4, int i5, long j, long j2, final int i6, int i7, int i8, int i9, int i10, int i11, boolean z, int i12, boolean z2, final TLRPC$TL_messages_getReplies tLRPC$TL_messages_getReplies, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        int i13;
        int i14;
        ArrayList<TLRPC$Message> arrayList;
        if (tLObject != null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            if (tLRPC$messages_Messages.messages.size() > i) {
                tLRPC$messages_Messages.messages.remove(0);
            }
            if (!tLRPC$messages_Messages.messages.isEmpty()) {
                if (i3 != 0) {
                    int i15 = tLRPC$messages_Messages.messages.get(arrayList.size() - 1).id;
                    int size = tLRPC$messages_Messages.messages.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(size);
                        if (tLRPC$Message.date > i3) {
                            i15 = tLRPC$Message.id;
                            break;
                        }
                        size--;
                    }
                    i14 = i15;
                    i13 = 0;
                    processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i14, i3, false, i6, i13, i7, i8, i9, i5, false, 0, i10, i11, z, i12, z2);
                    return;
                } else if (i4 != 0) {
                    if (i5 == 2 && i2 > 0) {
                        for (int size2 = tLRPC$messages_Messages.messages.size() - 1; size2 >= 0; size2--) {
                            TLRPC$Message tLRPC$Message2 = tLRPC$messages_Messages.messages.get(size2);
                            int i16 = tLRPC$Message2.id;
                            if (i16 > i4 && !tLRPC$Message2.out) {
                                i14 = i2;
                                i13 = i16;
                                break;
                            }
                        }
                    }
                    i14 = i2;
                    i13 = 0;
                    processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i14, i3, false, i6, i13, i7, i8, i9, i5, false, 0, i10, i11, z, i12, z2);
                    return;
                }
            }
            i14 = i2;
            i13 = 0;
            processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i14, i3, false, i6, i13, i7, i8, i9, i5, false, 0, i10, i11, z, i12, z2);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadMessagesInternal$142(i6, tLRPC$TL_messages_getReplies, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadMessagesInternal$142(int i, TLRPC$TL_messages_getReplies tLRPC$TL_messages_getReplies, TLRPC$TL_error tLRPC$TL_error) {
        getNotificationCenter().postNotificationName(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tLRPC$TL_messages_getReplies, tLRPC$TL_error);
    }

    public void lambda$loadMessagesInternal$144(int i, int i2, long j, long j2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, int i13, boolean z2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int i14;
        ArrayList<TLRPC$Message> arrayList;
        if (tLObject != null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            if (!(tLRPC$messages_Messages instanceof TLRPC$TL_messages_messagesNotModified)) {
                if (i2 == 0 || tLRPC$messages_Messages.messages.isEmpty()) {
                    i14 = i;
                } else {
                    int i15 = tLRPC$messages_Messages.messages.get(arrayList.size() - 1).id;
                    int size = tLRPC$messages_Messages.messages.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(size);
                        if (tLRPC$Message.date > i2) {
                            i15 = tLRPC$Message.id;
                            break;
                        }
                        size--;
                    }
                    i14 = i15;
                }
                processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i3, i14, i2, false, i4, i5, i6, i7, i8, i9, false, i10, i11, i12, z, i13, z2);
            }
        }
    }

    public void lambda$loadMessagesInternal$146(long j, long j2, boolean z, int i, int i2, int i3, int i4, final int i5, int i6, int i7, int i8, int i9, int i10, boolean z2, boolean z3, final TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            if (!tLRPC$TL_messages_peerDialogs.dialogs.isEmpty()) {
                TLRPC$Dialog tLRPC$Dialog = tLRPC$TL_messages_peerDialogs.dialogs.get(0);
                if (tLRPC$Dialog.top_message != 0) {
                    TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
                    tLRPC$TL_messages_dialogs.chats = tLRPC$TL_messages_peerDialogs.chats;
                    tLRPC$TL_messages_dialogs.users = tLRPC$TL_messages_peerDialogs.users;
                    tLRPC$TL_messages_dialogs.dialogs = tLRPC$TL_messages_peerDialogs.dialogs;
                    tLRPC$TL_messages_dialogs.messages = tLRPC$TL_messages_peerDialogs.messages;
                    getMessagesStorage().putDialogs(tLRPC$TL_messages_dialogs, 2);
                }
                loadMessagesInternal(j, j2, z, i, i2, i3, false, i4, i5, i6, tLRPC$Dialog.top_message, 0, i7, i8, i9, tLRPC$Dialog.unread_count, i10, z2, tLRPC$Dialog.unread_mentions_count, false, z3);
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadMessagesInternal$145(i5, tLRPC$TL_messages_getPeerDialogs, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadMessagesInternal$145(int i, TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs, TLRPC$TL_error tLRPC$TL_error) {
        getNotificationCenter().postNotificationName(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tLRPC$TL_messages_getPeerDialogs, tLRPC$TL_error);
    }

    public void lambda$loadMessagesInternal$148(long j, int i, int i2, int i3, long j2, final int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, int i12, boolean z2, final TLRPC$TL_messages_getHistory tLRPC$TL_messages_getHistory, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        int i13;
        ArrayList<TLRPC$Message> arrayList;
        if (tLObject != null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            removeDeletedMessagesFromArray(j, tLRPC$messages_Messages.messages);
            if (tLRPC$messages_Messages.messages.size() > i) {
                tLRPC$messages_Messages.messages.remove(0);
            }
            if (i3 == 0 || tLRPC$messages_Messages.messages.isEmpty()) {
                i13 = i2;
            } else {
                int i14 = tLRPC$messages_Messages.messages.get(arrayList.size() - 1).id;
                int size = tLRPC$messages_Messages.messages.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(size);
                    if (tLRPC$Message.date > i3) {
                        i14 = tLRPC$Message.id;
                        break;
                    }
                    size--;
                }
                i13 = i14;
            }
            processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i13, i3, false, i4, i5, i6, i7, i8, i9, false, 0, i10, i11, z, i12, z2);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadMessagesInternal$147(i4, tLRPC$TL_messages_getHistory, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadMessagesInternal$147(int i, TLRPC$TL_messages_getHistory tLRPC$TL_messages_getHistory, TLRPC$TL_error tLRPC$TL_error) {
        getNotificationCenter().postNotificationName(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tLRPC$TL_messages_getHistory, tLRPC$TL_error);
    }

    public void reloadWebPages(final long j, HashMap<String, ArrayList<MessageObject>> hashMap, final boolean z) {
        LongSparseArray<ArrayList<MessageObject>> longSparseArray;
        final HashMap<String, ArrayList<MessageObject>> hashMap2 = z ? this.reloadingScheduledWebpages : this.reloadingWebpages;
        if (z) {
            longSparseArray = this.reloadingScheduledWebpagesPending;
        } else {
            longSparseArray = this.reloadingWebpagesPending;
        }
        final LongSparseArray<ArrayList<MessageObject>> longSparseArray2 = longSparseArray;
        for (Map.Entry<String, ArrayList<MessageObject>> entry : hashMap.entrySet()) {
            final String key = entry.getKey();
            ArrayList<MessageObject> value = entry.getValue();
            ArrayList<MessageObject> arrayList = hashMap2.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                hashMap2.put(key, arrayList);
            }
            arrayList.addAll(value);
            TLRPC$TL_messages_getWebPagePreview tLRPC$TL_messages_getWebPagePreview = new TLRPC$TL_messages_getWebPagePreview();
            tLRPC$TL_messages_getWebPagePreview.message = key;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getWebPagePreview, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$reloadWebPages$150(hashMap2, key, longSparseArray2, j, z, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$reloadWebPages$150(final HashMap hashMap, final String str, final LongSparseArray longSparseArray, final long j, final boolean z, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$reloadWebPages$149(hashMap, str, tLObject, longSparseArray, j, z);
            }
        });
    }

    public void lambda$reloadWebPages$149(HashMap hashMap, String str, TLObject tLObject, LongSparseArray longSparseArray, long j, boolean z) {
        ArrayList arrayList = (ArrayList) hashMap.remove(str);
        if (arrayList != null) {
            TLRPC$TL_messages_messages tLRPC$TL_messages_messages = new TLRPC$TL_messages_messages();
            if (!(tLObject instanceof TLRPC$TL_messageMediaWebPage)) {
                for (int i = 0; i < arrayList.size(); i++) {
                    ((MessageObject) arrayList.get(i)).messageOwner.media.webpage = new TLRPC$TL_webPageEmpty();
                    tLRPC$TL_messages_messages.messages.add(((MessageObject) arrayList.get(i)).messageOwner);
                }
            } else {
                TLRPC$TL_messageMediaWebPage tLRPC$TL_messageMediaWebPage = (TLRPC$TL_messageMediaWebPage) tLObject;
                TLRPC$WebPage tLRPC$WebPage = tLRPC$TL_messageMediaWebPage.webpage;
                if ((tLRPC$WebPage instanceof TLRPC$TL_webPage) || (tLRPC$WebPage instanceof TLRPC$TL_webPageEmpty)) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ((MessageObject) arrayList.get(i2)).messageOwner.media.webpage = tLRPC$TL_messageMediaWebPage.webpage;
                        if (i2 == 0) {
                            ImageLoader.saveMessageThumbs(((MessageObject) arrayList.get(i2)).messageOwner);
                        }
                        tLRPC$TL_messages_messages.messages.add(((MessageObject) arrayList.get(i2)).messageOwner);
                    }
                } else {
                    longSparseArray.put(tLRPC$WebPage.id, arrayList);
                }
            }
            if (!tLRPC$TL_messages_messages.messages.isEmpty()) {
                getMessagesStorage().putMessages((TLRPC$messages_Messages) tLRPC$TL_messages_messages, j, -2, 0, false, z);
                getNotificationCenter().postNotificationName(NotificationCenter.replaceMessagesObjects, Long.valueOf(j), arrayList);
            }
        }
    }

    public void processLoadedMessages(final org.telegram.tgnet.TLRPC$messages_Messages r31, final int r32, final long r33, final long r35, final int r37, final int r38, final int r39, final boolean r40, final int r41, final int r42, final int r43, final int r44, final int r45, final int r46, final boolean r47, final int r48, final int r49, final int r50, final boolean r51, final int r52, final boolean r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processLoadedMessages(org.telegram.tgnet.TLRPC$messages_Messages, int, long, long, int, int, int, boolean, int, int, int, int, int, int, boolean, int, int, int, boolean, int, boolean):void");
    }

    public void lambda$processLoadedMessages$151(long j, long j2, int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z2) {
        loadMessagesInternal(j, j2, false, i, (i2 != 2 || !z) ? i4 : i3, i5, false, i6, i7, i2, i8, i9, i10, i11, i3, i12, i13, z, i14, true, z2);
    }

    public void lambda$processLoadedMessages$152(int i, TLRPC$messages_Messages tLRPC$messages_Messages, boolean z, boolean z2, int i2) {
        getNotificationCenter().postNotificationName(NotificationCenter.messagesDidLoadWithoutProcess, Integer.valueOf(i), Integer.valueOf(tLRPC$messages_Messages.messages.size()), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2));
    }

    public void lambda$processLoadedMessages$154(TLRPC$messages_Messages tLRPC$messages_Messages, final boolean z, final int i, boolean z2, final int i2, int i3, final int i4, final long j, final ArrayList arrayList, final boolean z3, final int i5, final int i6, final boolean z4, final int i7, final int i8, final int i9, final int i10, final int i11, final int i12, ArrayList arrayList2, HashMap hashMap) {
        int i13;
        boolean z5;
        long j2;
        MessagesController messagesController;
        int i14;
        HashMap hashMap2;
        int i15;
        int i16;
        int i17;
        putUsers(tLRPC$messages_Messages.users, z);
        putChats(tLRPC$messages_Messages.chats, z);
        if (i == 1) {
            i13 = 0;
        } else {
            if (!z2 || i2 != 2) {
                i15 = i3;
                i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            } else {
                i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i18 = 0; i18 < tLRPC$messages_Messages.messages.size(); i18++) {
                    TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i18);
                    if ((!tLRPC$Message.out || tLRPC$Message.from_scheduled) && (i17 = tLRPC$Message.id) > i3 && i17 < i16) {
                        i16 = i17;
                    }
                }
                i15 = i3;
            }
            i13 = i16 == Integer.MAX_VALUE ? i15 : i16;
        }
        if (i == 1 && i4 == 1) {
            getNotificationCenter().postNotificationName(NotificationCenter.scheduledMessagesUpdated, Long.valueOf(j), Integer.valueOf(arrayList.size()));
        }
        if (!DialogObject.isEncryptedDialog(j)) {
            final int i19 = i13;
            getMediaDataController().loadReplyMessagesForMessages(arrayList, j, i == 1, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$processLoadedMessages$153(z3, i5, i6, z, z4, i7, j, i4, arrayList, i19, i8, i9, i2, i10, i11, i12, i);
                }
            });
            z5 = true;
        } else {
            z5 = true;
            getNotificationCenter().postNotificationName(NotificationCenter.messagesDidLoad, Long.valueOf(j), Integer.valueOf(i4), arrayList, Boolean.valueOf(z), Integer.valueOf(i13), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i2), Boolean.valueOf(z4), Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i));
        }
        if (!arrayList2.isEmpty()) {
            i14 = i;
            messagesController = this;
            j2 = j;
            messagesController.reloadMessages(arrayList2, j2, i14 == z5);
        } else {
            messagesController = this;
            i14 = i;
            j2 = j;
        }
        if (!hashMap.isEmpty()) {
            if (i14 == z5) {
                hashMap2 = hashMap;
            } else {
                hashMap2 = hashMap;
                z5 = false;
            }
            messagesController.reloadWebPages(j2, hashMap2, z5);
        }
    }

    public void lambda$processLoadedMessages$153(boolean z, int i, int i2, boolean z2, boolean z3, int i3, long j, int i4, ArrayList arrayList, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        if (!z) {
            getNotificationCenter().postNotificationName(NotificationCenter.messagesDidLoadWithoutProcess, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i3));
        } else {
            getNotificationCenter().postNotificationName(NotificationCenter.messagesDidLoad, Long.valueOf(j), Integer.valueOf(i4), arrayList, Boolean.valueOf(z2), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Boolean.valueOf(z3), Integer.valueOf(i), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    public void loadHintDialogs() {
        if (this.hintDialogs.isEmpty() && !TextUtils.isEmpty(this.installReferer)) {
            TLRPC$TL_help_getRecentMeUrls tLRPC$TL_help_getRecentMeUrls = new TLRPC$TL_help_getRecentMeUrls();
            tLRPC$TL_help_getRecentMeUrls.referer = this.installReferer;
            getConnectionsManager().sendRequest(tLRPC$TL_help_getRecentMeUrls, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadHintDialogs$156(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadHintDialogs$156(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadHintDialogs$155(tLObject);
                }
            });
        }
    }

    public void lambda$loadHintDialogs$155(TLObject tLObject) {
        TLRPC$TL_help_recentMeUrls tLRPC$TL_help_recentMeUrls = (TLRPC$TL_help_recentMeUrls) tLObject;
        putUsers(tLRPC$TL_help_recentMeUrls.users, false);
        putChats(tLRPC$TL_help_recentMeUrls.chats, false);
        this.hintDialogs.clear();
        this.hintDialogs.addAll(tLRPC$TL_help_recentMeUrls.urls);
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    private TLRPC$TL_dialogFolder ensureFolderDialogExists(int i, boolean[] zArr) {
        if (i == 0) {
            return null;
        }
        long makeFolderDialogId = DialogObject.makeFolderDialogId(i);
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(makeFolderDialogId);
        if (tLRPC$Dialog instanceof TLRPC$TL_dialogFolder) {
            if (zArr != null) {
                zArr[0] = false;
            }
            return (TLRPC$TL_dialogFolder) tLRPC$Dialog;
        }
        if (zArr != null) {
            zArr[0] = true;
        }
        TLRPC$TL_dialogFolder tLRPC$TL_dialogFolder = new TLRPC$TL_dialogFolder();
        tLRPC$TL_dialogFolder.id = makeFolderDialogId;
        tLRPC$TL_dialogFolder.peer = new TLRPC$TL_peerUser();
        TLRPC$TL_folder tLRPC$TL_folder = new TLRPC$TL_folder();
        tLRPC$TL_dialogFolder.folder = tLRPC$TL_folder;
        tLRPC$TL_folder.id = i;
        tLRPC$TL_folder.title = LocaleController.getString("ArchivedChats", R.string.ArchivedChats);
        tLRPC$TL_dialogFolder.pinned = true;
        int i2 = 0;
        for (int i3 = 0; i3 < this.allDialogs.size(); i3++) {
            TLRPC$Dialog tLRPC$Dialog2 = this.allDialogs.get(i3);
            if (tLRPC$Dialog2.pinned) {
                i2 = Math.max(tLRPC$Dialog2.pinnedNum, i2);
            } else if (tLRPC$Dialog2.id != this.promoDialogId) {
                break;
            }
        }
        tLRPC$TL_dialogFolder.pinnedNum = i2 + 1;
        TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
        tLRPC$TL_messages_dialogs.dialogs.add(tLRPC$TL_dialogFolder);
        getMessagesStorage().putDialogs(tLRPC$TL_messages_dialogs, 1);
        this.dialogs_dict.put(makeFolderDialogId, tLRPC$TL_dialogFolder);
        this.allDialogs.add(0, tLRPC$TL_dialogFolder);
        return tLRPC$TL_dialogFolder;
    }

    public void lambda$onFolderEmpty$157(int i) {
        long makeFolderDialogId = DialogObject.makeFolderDialogId(i);
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(makeFolderDialogId);
        if (tLRPC$Dialog != null) {
            this.dialogs_dict.remove(makeFolderDialogId);
            this.allDialogs.remove(tLRPC$Dialog);
            sortDialogs(null);
            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
            getNotificationCenter().postNotificationName(NotificationCenter.folderBecomeEmpty, Integer.valueOf(i));
        }
    }

    public void onFolderEmpty(final int i) {
        if (getUserConfig().getDialogLoadOffsets(i)[0] == 2147483647L) {
            lambda$onFolderEmpty$157(i);
        } else {
            loadDialogs(i, 0, 10, false, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$onFolderEmpty$157(i);
                }
            });
        }
    }

    public void checkIfFolderEmpty(int i) {
        if (i != 0) {
            getMessagesStorage().checkIfFolderEmpty(i);
        }
    }

    public int addDialogToFolder(long j, int i, int i2, long j2) {
        ArrayList<Long> arrayList = new ArrayList<>(1);
        arrayList.add(Long.valueOf(j));
        return addDialogToFolder(arrayList, i, i2, null, j2);
    }

    public int addDialogToFolder(java.util.ArrayList<java.lang.Long> r24, int r25, int r26, java.util.ArrayList<org.telegram.tgnet.TLRPC$TL_inputFolderPeer> r27, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.addDialogToFolder(java.util.ArrayList, int, int, java.util.ArrayList, long):int");
    }

    public void lambda$addDialogToFolder$158(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void loadDialogs(int i, int i2, int i3, boolean z) {
        loadDialogs(i, i2, i3, z, null);
    }

    public void loadDialogs(final int i, int i2, final int i3, boolean z, final Runnable runnable) {
        MessageObject messageObject;
        long j;
        if (!this.loadingDialogs.get(i) && !this.resetingDialogs) {
            boolean z2 = true;
            this.loadingDialogs.put(i, true);
            NotificationCenter notificationCenter = getNotificationCenter();
            int i4 = NotificationCenter.dialogsNeedReload;
            notificationCenter.postNotificationName(i4, new Object[0]);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("folderId = " + i + " load cacheOffset = " + i2 + " count = " + i3 + " cache = " + z);
            }
            if (z) {
                MessagesStorage messagesStorage = getMessagesStorage();
                int i5 = i2 == 0 ? 0 : this.nextDialogsCacheOffset.get(i, 0);
                if (!(i == 0 && i2 == 0)) {
                    z2 = false;
                }
                messagesStorage.getDialogs(i, i5, i3, z2);
                return;
            }
            TLRPC$TL_messages_getDialogs tLRPC$TL_messages_getDialogs = new TLRPC$TL_messages_getDialogs();
            tLRPC$TL_messages_getDialogs.limit = i3;
            tLRPC$TL_messages_getDialogs.exclude_pinned = true;
            if (i != 0) {
                tLRPC$TL_messages_getDialogs.flags |= 2;
                tLRPC$TL_messages_getDialogs.folder_id = i;
            }
            long[] dialogLoadOffsets = getUserConfig().getDialogLoadOffsets(i);
            if (dialogLoadOffsets[0] == -1) {
                ArrayList<TLRPC$Dialog> dialogs = getDialogs(i);
                int size = dialogs.size() - 1;
                while (true) {
                    if (size < 0) {
                        z2 = false;
                        break;
                    }
                    TLRPC$Dialog tLRPC$Dialog = dialogs.get(size);
                    if (!tLRPC$Dialog.pinned && !DialogObject.isEncryptedDialog(tLRPC$Dialog.id) && tLRPC$Dialog.top_message > 0 && (messageObject = this.dialogMessage.get(tLRPC$Dialog.id)) != null && messageObject.getId() > 0) {
                        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
                        tLRPC$TL_messages_getDialogs.offset_date = tLRPC$Message.date;
                        tLRPC$TL_messages_getDialogs.offset_id = tLRPC$Message.id;
                        TLRPC$Peer tLRPC$Peer = tLRPC$Message.peer_id;
                        long j2 = tLRPC$Peer.channel_id;
                        if (j2 == 0) {
                            j2 = tLRPC$Peer.chat_id;
                            if (j2 == 0) {
                                j = tLRPC$Peer.user_id;
                                tLRPC$TL_messages_getDialogs.offset_peer = getInputPeer(j);
                            }
                        }
                        j = -j2;
                        tLRPC$TL_messages_getDialogs.offset_peer = getInputPeer(j);
                    } else {
                        size--;
                    }
                }
                if (!z2) {
                    tLRPC$TL_messages_getDialogs.offset_peer = new TLRPC$TL_inputPeerEmpty();
                }
            } else if (dialogLoadOffsets[0] == 2147483647L) {
                this.dialogsEndReached.put(i, true);
                this.serverDialogsEndReached.put(i, true);
                this.loadingDialogs.put(i, false);
                getNotificationCenter().postNotificationName(i4, new Object[0]);
                return;
            } else {
                int i6 = (int) dialogLoadOffsets[0];
                tLRPC$TL_messages_getDialogs.offset_id = i6;
                tLRPC$TL_messages_getDialogs.offset_date = (int) dialogLoadOffsets[1];
                if (i6 == 0) {
                    tLRPC$TL_messages_getDialogs.offset_peer = new TLRPC$TL_inputPeerEmpty();
                } else {
                    if (dialogLoadOffsets[4] != 0) {
                        TLRPC$TL_inputPeerChannel tLRPC$TL_inputPeerChannel = new TLRPC$TL_inputPeerChannel();
                        tLRPC$TL_messages_getDialogs.offset_peer = tLRPC$TL_inputPeerChannel;
                        tLRPC$TL_inputPeerChannel.channel_id = dialogLoadOffsets[4];
                    } else if (dialogLoadOffsets[2] != 0) {
                        TLRPC$TL_inputPeerUser tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
                        tLRPC$TL_messages_getDialogs.offset_peer = tLRPC$TL_inputPeerUser;
                        tLRPC$TL_inputPeerUser.user_id = dialogLoadOffsets[2];
                    } else {
                        TLRPC$TL_inputPeerChat tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChat();
                        tLRPC$TL_messages_getDialogs.offset_peer = tLRPC$TL_inputPeerChat;
                        tLRPC$TL_inputPeerChat.chat_id = dialogLoadOffsets[3];
                    }
                    tLRPC$TL_messages_getDialogs.offset_peer.access_hash = dialogLoadOffsets[5];
                }
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getDialogs, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadDialogs$159(i, i3, runnable, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadDialogs$159(int i, int i2, Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Dialogs tLRPC$messages_Dialogs = (TLRPC$messages_Dialogs) tLObject;
            processLoadedDialogs(tLRPC$messages_Dialogs, null, i, 0, i2, 0, false, false, false);
            if (runnable != null && tLRPC$messages_Dialogs.dialogs.isEmpty()) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        }
    }

    public void loadGlobalNotificationsSettings() {
        if (this.loadingNotificationSettings == 0 && !getUserConfig().notificationsSettingsLoaded) {
            SharedPreferences notificationsSettings = getNotificationsSettings(this.currentAccount);
            SharedPreferences.Editor editor = null;
            if (notificationsSettings.contains("EnableGroup")) {
                boolean z = notificationsSettings.getBoolean("EnableGroup", true);
                SharedPreferences.Editor edit = notificationsSettings.edit();
                if (!z) {
                    edit.putInt("EnableGroup2", ConnectionsManager.DEFAULT_DATACENTER_ID);
                    edit.putInt("EnableChannel2", ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                edit.remove("EnableGroup").commit();
                editor = edit;
            }
            if (notificationsSettings.contains("EnableAll")) {
                boolean z2 = notificationsSettings.getBoolean("EnableAll", true);
                if (editor == null) {
                    editor = notificationsSettings.edit();
                }
                if (!z2) {
                    editor.putInt("EnableAll2", ConnectionsManager.DEFAULT_DATACENTER_ID);
                }
                editor.remove("EnableAll").commit();
            }
            if (editor != null) {
                editor.commit();
            }
            this.loadingNotificationSettings = 3;
            for (final int i = 0; i < 3; i++) {
                TLRPC$TL_account_getNotifySettings tLRPC$TL_account_getNotifySettings = new TLRPC$TL_account_getNotifySettings();
                if (i == 0) {
                    tLRPC$TL_account_getNotifySettings.peer = new TLRPC$TL_inputNotifyChats();
                } else if (i == 1) {
                    tLRPC$TL_account_getNotifySettings.peer = new TLRPC$TL_inputNotifyUsers();
                } else {
                    tLRPC$TL_account_getNotifySettings.peer = new TLRPC$TL_inputNotifyBroadcasts();
                }
                getConnectionsManager().sendRequest(tLRPC$TL_account_getNotifySettings, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadGlobalNotificationsSettings$161(i, tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
        if (!getUserConfig().notificationsSignUpSettingsLoaded) {
            loadSignUpNotificationsSettings();
        }
    }

    public void lambda$loadGlobalNotificationsSettings$161(final int i, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadGlobalNotificationsSettings$160(tLObject, i);
            }
        });
    }

    public void lambda$loadGlobalNotificationsSettings$160(TLObject tLObject, int i) {
        if (tLObject != null) {
            this.loadingNotificationSettings--;
            TLRPC$TL_peerNotifySettings tLRPC$TL_peerNotifySettings = (TLRPC$TL_peerNotifySettings) tLObject;
            SharedPreferences.Editor edit = this.notificationsPreferences.edit();
            if (i == 0) {
                if ((tLRPC$TL_peerNotifySettings.flags & 1) != 0) {
                    edit.putBoolean("EnablePreviewGroup", tLRPC$TL_peerNotifySettings.show_previews);
                }
                if ((tLRPC$TL_peerNotifySettings.flags & 4) != 0) {
                    edit.putInt("EnableGroup2", tLRPC$TL_peerNotifySettings.mute_until);
                }
            } else if (i == 1) {
                if ((tLRPC$TL_peerNotifySettings.flags & 1) != 0) {
                    edit.putBoolean("EnablePreviewAll", tLRPC$TL_peerNotifySettings.show_previews);
                }
                if ((tLRPC$TL_peerNotifySettings.flags & 4) != 0) {
                    edit.putInt("EnableAll2", tLRPC$TL_peerNotifySettings.mute_until);
                }
            } else {
                if ((tLRPC$TL_peerNotifySettings.flags & 1) != 0) {
                    edit.putBoolean("EnablePreviewChannel", tLRPC$TL_peerNotifySettings.show_previews);
                }
                if ((tLRPC$TL_peerNotifySettings.flags & 4) != 0) {
                    edit.putInt("EnableChannel2", tLRPC$TL_peerNotifySettings.mute_until);
                }
            }
            applySoundSettings(tLRPC$TL_peerNotifySettings.android_sound, edit, 0L, i, false);
            edit.commit();
            if (this.loadingNotificationSettings == 0) {
                getUserConfig().notificationsSettingsLoaded = true;
                getUserConfig().saveConfig(false);
            }
        }
    }

    public void loadSignUpNotificationsSettings() {
        if (!this.loadingNotificationSignUpSettings) {
            this.loadingNotificationSignUpSettings = true;
            getConnectionsManager().sendRequest(new TLObject() {
                public static int constructor = -1626880216;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                    return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadSignUpNotificationsSettings$163(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadSignUpNotificationsSettings$163(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadSignUpNotificationsSettings$162(tLObject);
            }
        });
    }

    public void lambda$loadSignUpNotificationsSettings$162(TLObject tLObject) {
        this.loadingNotificationSignUpSettings = false;
        SharedPreferences.Editor edit = this.notificationsPreferences.edit();
        boolean z = tLObject instanceof TLRPC$TL_boolFalse;
        this.enableJoined = z;
        edit.putBoolean("EnableContactJoined", z);
        edit.commit();
        getUserConfig().notificationsSignUpSettingsLoaded = true;
        getUserConfig().saveConfig(false);
    }

    public void forceResetDialogs() {
        resetDialogs(true, getMessagesStorage().getLastSeqValue(), getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue());
        getNotificationsController().deleteAllNotificationChannels();
    }

    public void loadUnknownDialog(TLRPC$InputPeer tLRPC$InputPeer, long j) {
        NativeByteBuffer nativeByteBuffer;
        Exception e;
        if (tLRPC$InputPeer != null) {
            final long peerDialogId = DialogObject.getPeerDialogId(tLRPC$InputPeer);
            if (this.gettingUnknownDialogs.indexOfKey(peerDialogId) < 0) {
                this.gettingUnknownDialogs.put(peerDialogId, Boolean.TRUE);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("load unknown dialog " + peerDialogId);
                }
                TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs = new TLRPC$TL_messages_getPeerDialogs();
                TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
                tLRPC$TL_inputDialogPeer.peer = tLRPC$InputPeer;
                tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer);
                if (j == 0) {
                    NativeByteBuffer nativeByteBuffer2 = null;
                    try {
                        nativeByteBuffer = new NativeByteBuffer(tLRPC$InputPeer.getObjectSize() + 4);
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        nativeByteBuffer.writeInt32(15);
                        tLRPC$InputPeer.serializeToStream(nativeByteBuffer);
                    } catch (Exception e3) {
                        e = e3;
                        nativeByteBuffer2 = nativeByteBuffer;
                        FileLog.e(e);
                        nativeByteBuffer = nativeByteBuffer2;
                        j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                        final long j2 = j;
                        getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                MessagesController.this.lambda$loadUnknownDialog$164(j2, peerDialogId, tLObject, tLRPC$TL_error);
                            }
                        });
                    }
                    j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                }
                final long j22 = j;
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadUnknownDialog$164(j22, peerDialogId, tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
    }

    public void lambda$loadUnknownDialog$164(long j, long j2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            if (!tLRPC$TL_messages_peerDialogs.dialogs.isEmpty()) {
                TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
                tLRPC$TL_messages_dialogs.dialogs.addAll(tLRPC$TL_messages_peerDialogs.dialogs);
                tLRPC$TL_messages_dialogs.messages.addAll(tLRPC$TL_messages_peerDialogs.messages);
                tLRPC$TL_messages_dialogs.users.addAll(tLRPC$TL_messages_peerDialogs.users);
                tLRPC$TL_messages_dialogs.chats.addAll(tLRPC$TL_messages_peerDialogs.chats);
                processLoadedDialogs(tLRPC$TL_messages_dialogs, null, ((TLRPC$TL_dialog) tLRPC$TL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, this.DIALOGS_LOAD_TYPE_UNKNOWN, false, false, false);
            }
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        this.gettingUnknownDialogs.delete(j2);
    }

    private void fetchFolderInLoadedPinnedDialogs(TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs) {
        TLRPC$InputPeer tLRPC$InputPeer;
        int size = tLRPC$TL_messages_peerDialogs.dialogs.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC$Dialog tLRPC$Dialog = tLRPC$TL_messages_peerDialogs.dialogs.get(i2);
            if (tLRPC$Dialog instanceof TLRPC$TL_dialogFolder) {
                TLRPC$TL_dialogFolder tLRPC$TL_dialogFolder = (TLRPC$TL_dialogFolder) tLRPC$Dialog;
                long peerDialogId = DialogObject.getPeerDialogId(tLRPC$Dialog.peer);
                if (tLRPC$TL_dialogFolder.top_message == 0 || peerDialogId == 0) {
                    tLRPC$TL_messages_peerDialogs.dialogs.remove(tLRPC$TL_dialogFolder);
                } else {
                    int size2 = tLRPC$TL_messages_peerDialogs.messages.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        TLRPC$Message tLRPC$Message = tLRPC$TL_messages_peerDialogs.messages.get(i3);
                        if (peerDialogId == MessageObject.getDialogId(tLRPC$Message) && tLRPC$Dialog.top_message == tLRPC$Message.id) {
                            TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
                            tLRPC$TL_dialog.peer = tLRPC$Dialog.peer;
                            tLRPC$TL_dialog.top_message = tLRPC$Dialog.top_message;
                            tLRPC$TL_dialog.folder_id = tLRPC$TL_dialogFolder.folder.id;
                            tLRPC$TL_dialog.flags |= 16;
                            tLRPC$TL_messages_peerDialogs.dialogs.add(tLRPC$TL_dialog);
                            TLRPC$Peer tLRPC$Peer = tLRPC$Dialog.peer;
                            if (tLRPC$Peer instanceof TLRPC$TL_peerChannel) {
                                tLRPC$InputPeer = new TLRPC$TL_inputPeerChannel();
                                tLRPC$InputPeer.channel_id = tLRPC$Dialog.peer.channel_id;
                                int size3 = tLRPC$TL_messages_peerDialogs.chats.size();
                                while (true) {
                                    if (i >= size3) {
                                        break;
                                    }
                                    TLRPC$Chat tLRPC$Chat = tLRPC$TL_messages_peerDialogs.chats.get(i);
                                    if (tLRPC$Chat.id == tLRPC$InputPeer.channel_id) {
                                        tLRPC$InputPeer.access_hash = tLRPC$Chat.access_hash;
                                        break;
                                    }
                                    i++;
                                }
                            } else if (!(tLRPC$Peer instanceof TLRPC$TL_peerChat)) {
                                tLRPC$InputPeer = new TLRPC$TL_inputPeerUser();
                                tLRPC$InputPeer.user_id = tLRPC$Dialog.peer.user_id;
                                int size4 = tLRPC$TL_messages_peerDialogs.users.size();
                                while (true) {
                                    if (i >= size4) {
                                        break;
                                    }
                                    TLRPC$User tLRPC$User = tLRPC$TL_messages_peerDialogs.users.get(i);
                                    if (tLRPC$User.id == tLRPC$InputPeer.user_id) {
                                        tLRPC$InputPeer.access_hash = tLRPC$User.access_hash;
                                        break;
                                    }
                                    i++;
                                }
                            } else {
                                tLRPC$InputPeer = new TLRPC$TL_inputPeerChat();
                                tLRPC$InputPeer.chat_id = tLRPC$Dialog.peer.chat_id;
                            }
                            loadUnknownDialog(tLRPC$InputPeer, 0L);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    public void lambda$resetDialogs$165(int i, int i2, int i3, int i4, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            this.resetDialogsPinned = (TLRPC$TL_messages_peerDialogs) tLObject;
            for (int i5 = 0; i5 < this.resetDialogsPinned.dialogs.size(); i5++) {
                this.resetDialogsPinned.dialogs.get(i5).pinned = true;
            }
            resetDialogs(false, i, i2, i3, i4);
        }
    }

    public void lambda$resetDialogs$166(int i, int i2, int i3, int i4, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            this.resetDialogsAll = (TLRPC$messages_Dialogs) tLObject;
            resetDialogs(false, i, i2, i3, i4);
        }
    }

    private void resetDialogs(boolean r27, final int r28, final int r29, final int r30, final int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.resetDialogs(boolean, int, int, int, int):void");
    }

    public void completeDialogsReset(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, int i, int i2, final int i3, final int i4, final int i5, final LongSparseArray<TLRPC$Dialog> longSparseArray, final LongSparseArray<MessageObject> longSparseArray2, TLRPC$Message tLRPC$Message) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$completeDialogsReset$168(i3, i4, i5, tLRPC$messages_Dialogs, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$completeDialogsReset$168(int i, int i2, int i3, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        this.gettingDifference = false;
        getMessagesStorage().setLastPtsValue(i);
        getMessagesStorage().setLastDateValue(i2);
        getMessagesStorage().setLastQtsValue(i3);
        getDifference();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$completeDialogsReset$167(tLRPC$messages_Dialogs, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$completeDialogsReset$167(TLRPC$messages_Dialogs tLRPC$messages_Dialogs, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        TLRPC$Dialog tLRPC$Dialog;
        this.resetingDialogs = false;
        applyDialogsNotificationsSettings(tLRPC$messages_Dialogs.dialogs);
        MediaDataController mediaDataController = getMediaDataController();
        mediaDataController.clearAllDrafts(false);
        mediaDataController.loadDraftsIfNeed();
        putUsers(tLRPC$messages_Dialogs.users, false);
        putChats(tLRPC$messages_Dialogs.chats, false);
        for (int i = 0; i < this.allDialogs.size(); i++) {
            TLRPC$Dialog tLRPC$Dialog2 = this.allDialogs.get(i);
            if (!DialogObject.isEncryptedDialog(tLRPC$Dialog2.id)) {
                this.dialogs_dict.remove(tLRPC$Dialog2.id);
                MessageObject messageObject = this.dialogMessage.get(tLRPC$Dialog2.id);
                this.dialogMessage.remove(tLRPC$Dialog2.id);
                if (messageObject != null) {
                    if (messageObject.messageOwner.peer_id.channel_id == 0) {
                        this.dialogMessagesByIds.remove(messageObject.getId());
                    }
                    long j = messageObject.messageOwner.random_id;
                    if (j != 0) {
                        this.dialogMessagesByRandomIds.remove(j);
                    }
                }
            }
        }
        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
            long keyAt = longSparseArray.keyAt(i2);
            TLRPC$Dialog tLRPC$Dialog3 = (TLRPC$Dialog) longSparseArray.valueAt(i2);
            TLRPC$DraftMessage tLRPC$DraftMessage = tLRPC$Dialog3.draft;
            if (tLRPC$DraftMessage instanceof TLRPC$TL_draftMessage) {
                tLRPC$Dialog = tLRPC$Dialog3;
                mediaDataController.saveDraft(tLRPC$Dialog3.id, 0, tLRPC$DraftMessage, null, false);
            } else {
                tLRPC$Dialog = tLRPC$Dialog3;
            }
            this.dialogs_dict.put(keyAt, tLRPC$Dialog);
            MessageObject messageObject2 = (MessageObject) longSparseArray2.get(tLRPC$Dialog.id);
            this.dialogMessage.put(keyAt, messageObject2);
            if (messageObject2 != null && messageObject2.messageOwner.peer_id.channel_id == 0) {
                this.dialogMessagesByIds.put(messageObject2.getId(), messageObject2);
                this.dialogsLoadedTillDate = Math.min(this.dialogsLoadedTillDate, messageObject2.messageOwner.date);
                long j2 = messageObject2.messageOwner.random_id;
                if (j2 != 0) {
                    this.dialogMessagesByRandomIds.put(j2, messageObject2);
                }
            }
        }
        this.allDialogs.clear();
        int size = this.dialogs_dict.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC$Dialog valueAt = this.dialogs_dict.valueAt(i3);
            if (this.deletingDialogs.indexOfKey(valueAt.id) < 0) {
                this.allDialogs.add(valueAt);
            }
        }
        sortDialogs(null);
        this.dialogsEndReached.put(0, true);
        this.serverDialogsEndReached.put(0, false);
        this.dialogsEndReached.put(1, true);
        this.serverDialogsEndReached.put(1, false);
        int totalDialogsCount = getUserConfig().getTotalDialogsCount(0);
        long[] dialogLoadOffsets = getUserConfig().getDialogLoadOffsets(0);
        if (!(totalDialogsCount >= 400 || dialogLoadOffsets[0] == -1 || dialogLoadOffsets[0] == 2147483647L)) {
            loadDialogs(0, 0, 100, false);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    private void migrateDialogs(final int i, int i2, long j, long j2, long j3, long j4) {
        if (!this.migratingDialogs && i != -1) {
            this.migratingDialogs = true;
            TLRPC$TL_messages_getDialogs tLRPC$TL_messages_getDialogs = new TLRPC$TL_messages_getDialogs();
            tLRPC$TL_messages_getDialogs.exclude_pinned = true;
            tLRPC$TL_messages_getDialogs.limit = 100;
            tLRPC$TL_messages_getDialogs.offset_id = i;
            tLRPC$TL_messages_getDialogs.offset_date = i2;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("start migrate with id " + i + " date " + LocaleController.getInstance().formatterStats.format(i2 * 1000));
            }
            if (i == 0) {
                tLRPC$TL_messages_getDialogs.offset_peer = new TLRPC$TL_inputPeerEmpty();
            } else {
                if (j3 != 0) {
                    TLRPC$TL_inputPeerChannel tLRPC$TL_inputPeerChannel = new TLRPC$TL_inputPeerChannel();
                    tLRPC$TL_messages_getDialogs.offset_peer = tLRPC$TL_inputPeerChannel;
                    tLRPC$TL_inputPeerChannel.channel_id = j3;
                } else if (j != 0) {
                    TLRPC$TL_inputPeerUser tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
                    tLRPC$TL_messages_getDialogs.offset_peer = tLRPC$TL_inputPeerUser;
                    tLRPC$TL_inputPeerUser.user_id = j;
                } else {
                    TLRPC$TL_inputPeerChat tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChat();
                    tLRPC$TL_messages_getDialogs.offset_peer = tLRPC$TL_inputPeerChat;
                    tLRPC$TL_inputPeerChat.chat_id = j2;
                }
                tLRPC$TL_messages_getDialogs.offset_peer.access_hash = j4;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getDialogs, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$migrateDialogs$172(i, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$migrateDialogs$172(final int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            final TLRPC$messages_Dialogs tLRPC$messages_Dialogs = (TLRPC$messages_Dialogs) tLObject;
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$migrateDialogs$170(tLRPC$messages_Dialogs, i);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$migrateDialogs$171();
            }
        });
    }

    public void lambda$migrateDialogs$170(org.telegram.tgnet.TLRPC$messages_Dialogs r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$migrateDialogs$170(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    public void lambda$migrateDialogs$169() {
        this.migratingDialogs = false;
    }

    public void lambda$migrateDialogs$171() {
        this.migratingDialogs = false;
    }

    public void processLoadedDialogs(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final ArrayList<TLRPC$EncryptedChat> arrayList, final int i, final int i2, final int i3, final int i4, final boolean z, final boolean z2, final boolean z3) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedDialogs$176(i, i4, tLRPC$messages_Dialogs, z, i3, arrayList, i2, z3, z2);
            }
        });
    }

    public void lambda$processLoadedDialogs$176(final int r34, final int r35, final org.telegram.tgnet.TLRPC$messages_Dialogs r36, final boolean r37, final int r38, final java.util.ArrayList r39, final int r40, final boolean r41, final boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processLoadedDialogs$176(int, int, org.telegram.tgnet.TLRPC$messages_Dialogs, boolean, int, java.util.ArrayList, int, boolean, boolean):void");
    }

    public void lambda$processLoadedDialogs$173(TLRPC$messages_Dialogs tLRPC$messages_Dialogs, int i, boolean z, long[] jArr, int i2) {
        putUsers(tLRPC$messages_Dialogs.users, true);
        this.loadingDialogs.put(i, false);
        if (z) {
            this.dialogsEndReached.put(i, false);
            this.serverDialogsEndReached.put(i, false);
        } else if (jArr[0] == 2147483647L) {
            this.dialogsEndReached.put(i, true);
            this.serverDialogsEndReached.put(i, true);
        } else {
            loadDialogs(i, 0, i2, false);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processLoadedDialogs$174(TLRPC$Chat tLRPC$Chat) {
        checkChatInviter(tLRPC$Chat.id, true);
    }

    public void lambda$processLoadedDialogs$175(TLRPC$Message tLRPC$Message, int i, TLRPC$messages_Dialogs tLRPC$messages_Dialogs, ArrayList arrayList, boolean z, int i2, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, LongSparseArray longSparseArray3, int i3, boolean z2, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        boolean z3;
        int i7;
        if (tLRPC$Message != null) {
            this.dialogsLoadedTillDate = Math.min(this.dialogsLoadedTillDate, tLRPC$Message.date);
        } else {
            this.dialogsLoadedTillDate = Integer.MIN_VALUE;
        }
        if (i != this.DIALOGS_LOAD_TYPE_CACHE) {
            applyDialogsNotificationsSettings(tLRPC$messages_Dialogs.dialogs);
            getMediaDataController().loadDraftsIfNeed();
        }
        putUsers(tLRPC$messages_Dialogs.users, i == this.DIALOGS_LOAD_TYPE_CACHE);
        putChats(tLRPC$messages_Dialogs.chats, i == this.DIALOGS_LOAD_TYPE_CACHE);
        if (arrayList != null) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                TLRPC$EncryptedChat tLRPC$EncryptedChat = (TLRPC$EncryptedChat) arrayList.get(i8);
                if ((tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) && AndroidUtilities.getMyLayerVersion(tLRPC$EncryptedChat.layer) < SecretChatHelper.CURRENT_SECRET_CHAT_LAYER) {
                    getSecretChatHelper().sendNotifyLayerMessage(tLRPC$EncryptedChat, null);
                }
                putEncryptedChat(tLRPC$EncryptedChat, true);
            }
        }
        if (!(z || i == this.DIALOGS_LOAD_TYPE_UNKNOWN || i == this.DIALOGS_LOAD_TYPE_CHANNEL)) {
            this.loadingDialogs.put(i2, false);
        }
        this.dialogsLoaded = true;
        if (!z || this.allDialogs.isEmpty()) {
            i5 = 0;
        } else {
            ArrayList<TLRPC$Dialog> arrayList3 = this.allDialogs;
            i5 = arrayList3.get(arrayList3.size() - 1).last_message_date;
        }
        int i9 = 0;
        int i10 = 0;
        boolean z4 = false;
        while (i9 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i9);
            TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) longSparseArray.valueAt(i9);
            TLRPC$Dialog tLRPC$Dialog2 = this.dialogs_dict.get(keyAt);
            if (z && tLRPC$Dialog2 != null) {
                tLRPC$Dialog2.folder_id = tLRPC$Dialog.folder_id;
            }
            if (!z || i5 == 0 || tLRPC$Dialog.last_message_date >= i5) {
                if (i == this.DIALOGS_LOAD_TYPE_CACHE || !(tLRPC$Dialog.draft instanceof TLRPC$TL_draftMessage)) {
                    i7 = i5;
                } else {
                    i7 = i5;
                    getMediaDataController().saveDraft(tLRPC$Dialog.id, 0, tLRPC$Dialog.draft, null, false);
                }
                if (tLRPC$Dialog.folder_id != i2) {
                    i10++;
                }
                MessageObject messageObject = (MessageObject) longSparseArray2.get(tLRPC$Dialog.id);
                if (tLRPC$Dialog2 == null) {
                    this.dialogs_dict.put(keyAt, tLRPC$Dialog);
                    this.dialogMessage.put(keyAt, messageObject);
                    if (messageObject != null && messageObject.messageOwner.peer_id.channel_id == 0) {
                        this.dialogMessagesByIds.put(messageObject.getId(), messageObject);
                        long j = messageObject.messageOwner.random_id;
                        if (j != 0) {
                            this.dialogMessagesByRandomIds.put(j, messageObject);
                        }
                    }
                    z4 = true;
                } else {
                    if (i != this.DIALOGS_LOAD_TYPE_CACHE) {
                        tLRPC$Dialog2.notify_settings = tLRPC$Dialog.notify_settings;
                    }
                    tLRPC$Dialog2.pinned = tLRPC$Dialog.pinned;
                    tLRPC$Dialog2.pinnedNum = tLRPC$Dialog.pinnedNum;
                    MessageObject messageObject2 = this.dialogMessage.get(keyAt);
                    if ((messageObject2 == null || !messageObject2.deleted) && messageObject2 != null && tLRPC$Dialog2.top_message <= 0) {
                        if ((messageObject == null && messageObject2.getId() > 0) || (messageObject != null && messageObject.messageOwner.date > messageObject2.messageOwner.date)) {
                            this.dialogs_dict.put(keyAt, tLRPC$Dialog);
                            this.dialogMessage.put(keyAt, messageObject);
                            if (messageObject2.messageOwner.peer_id.channel_id == 0) {
                                this.dialogMessagesByIds.remove(messageObject2.getId());
                            }
                            if (messageObject != null && messageObject.messageOwner.peer_id.channel_id == 0) {
                                this.dialogMessagesByIds.put(messageObject.getId(), messageObject);
                                long j2 = messageObject.messageOwner.random_id;
                                if (j2 != 0) {
                                    this.dialogMessagesByRandomIds.put(j2, messageObject);
                                }
                            }
                            long j3 = messageObject2.messageOwner.random_id;
                            if (j3 != 0) {
                                this.dialogMessagesByRandomIds.remove(j3);
                            }
                        }
                    } else if (tLRPC$Dialog.top_message >= tLRPC$Dialog2.top_message) {
                        this.dialogs_dict.put(keyAt, tLRPC$Dialog);
                        this.dialogMessage.put(keyAt, messageObject);
                        if (messageObject2 != null) {
                            if (messageObject2.messageOwner.peer_id.channel_id == 0) {
                                this.dialogMessagesByIds.remove(messageObject2.getId());
                            }
                            long j4 = messageObject2.messageOwner.random_id;
                            if (j4 != 0) {
                                this.dialogMessagesByRandomIds.remove(j4);
                            }
                        }
                        if (messageObject != null) {
                            if (messageObject2 != null && messageObject2.getId() == messageObject.getId()) {
                                messageObject.deleted = messageObject2.deleted;
                            }
                            if (messageObject.messageOwner.peer_id.channel_id == 0) {
                                this.dialogMessagesByIds.put(messageObject.getId(), messageObject);
                                long j5 = messageObject.messageOwner.random_id;
                                if (j5 != 0) {
                                    this.dialogMessagesByRandomIds.put(j5, messageObject);
                                }
                            }
                        }
                    }
                }
            } else {
                i7 = i5;
            }
            i9++;
            i5 = i7;
        }
        this.allDialogs.clear();
        int size = this.dialogs_dict.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC$Dialog valueAt = this.dialogs_dict.valueAt(i11);
            if (this.deletingDialogs.indexOfKey(valueAt.id) < 0) {
                this.allDialogs.add(valueAt);
            }
        }
        sortDialogs(z ? longSparseArray3 : null);
        putAllNeededDraftDialogs();
        if (!(i == this.DIALOGS_LOAD_TYPE_CHANNEL || i == this.DIALOGS_LOAD_TYPE_UNKNOWN || z)) {
            this.dialogsEndReached.put(i2, (tLRPC$messages_Dialogs.dialogs.size() == 0 || tLRPC$messages_Dialogs.dialogs.size() != i3) && i == 0);
            if (i10 <= 0 || i10 >= 20 || i2 != 0) {
                z3 = true;
            } else {
                z3 = true;
                this.dialogsEndReached.put(1, true);
                if (getUserConfig().getDialogLoadOffsets(i2)[0] == 2147483647L) {
                    this.serverDialogsEndReached.put(1, true);
                }
            }
            if (!z2) {
                SparseBooleanArray sparseBooleanArray = this.serverDialogsEndReached;
                if ((tLRPC$messages_Dialogs.dialogs.size() != 0 && tLRPC$messages_Dialogs.dialogs.size() == i3) || i != 0) {
                    z3 = false;
                }
                sparseBooleanArray.put(i2, z3);
            }
        }
        int totalDialogsCount = getUserConfig().getTotalDialogsCount(i2);
        long[] dialogLoadOffsets = getUserConfig().getDialogLoadOffsets(i2);
        if (z2 || z || totalDialogsCount >= 400) {
            i6 = 0;
        } else {
            i6 = 0;
            i6 = 0;
            i6 = 0;
            if (!(dialogLoadOffsets[0] == -1 || dialogLoadOffsets[0] == 2147483647L)) {
                loadDialogs(i2, 0, 100, false);
            }
        }
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[i6]);
        if (z) {
            getUserConfig().migrateOffsetId = i4;
            getUserConfig().saveConfig(i6);
            this.migratingDialogs = i6;
            getNotificationCenter().postNotificationName(NotificationCenter.needReloadRecentDialogsSearch, new Object[i6]);
        } else {
            generateUpdateMessage();
            if (!z4 && i == this.DIALOGS_LOAD_TYPE_CACHE && this.dialogsEndReached.get(i2)) {
                loadDialogs(i2, i6, i3, i6);
            }
        }
        migrateDialogs(getUserConfig().migrateOffsetId, getUserConfig().migrateOffsetDate, getUserConfig().migrateOffsetUserId, getUserConfig().migrateOffsetChatId, getUserConfig().migrateOffsetChannelId, getUserConfig().migrateOffsetAccess);
        if (!arrayList2.isEmpty()) {
            reloadDialogsReadValue(arrayList2, 0L);
        }
        loadUnreadDialogs();
    }

    private void applyDialogNotificationsSettings(long j, TLRPC$PeerNotifySettings tLRPC$PeerNotifySettings) {
        int i;
        if (tLRPC$PeerNotifySettings != null) {
            SharedPreferences sharedPreferences = this.notificationsPreferences;
            int i2 = sharedPreferences.getInt("notify2_" + j, -1);
            SharedPreferences sharedPreferences2 = this.notificationsPreferences;
            int i3 = sharedPreferences2.getInt("notifyuntil_" + j, 0);
            SharedPreferences.Editor edit = this.notificationsPreferences.edit();
            TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
            if (tLRPC$Dialog != null) {
                tLRPC$Dialog.notify_settings = tLRPC$PeerNotifySettings;
            }
            if ((tLRPC$PeerNotifySettings.flags & 2) != 0) {
                edit.putBoolean("silent_" + j, tLRPC$PeerNotifySettings.silent);
            } else {
                edit.remove("silent_" + j);
            }
            boolean z = true;
            if ((tLRPC$PeerNotifySettings.flags & 4) == 0) {
                if (i2 != -1) {
                    if (tLRPC$Dialog != null) {
                        tLRPC$Dialog.notify_settings.mute_until = 0;
                    }
                    edit.remove("notify2_" + j);
                } else {
                    z = false;
                }
                getMessagesStorage().setDialogFlags(j, 0L);
            } else if (tLRPC$PeerNotifySettings.mute_until > getConnectionsManager().getCurrentTime()) {
                if (tLRPC$PeerNotifySettings.mute_until <= getConnectionsManager().getCurrentTime() + 31536000) {
                    if (i2 == 3 && i3 == tLRPC$PeerNotifySettings.mute_until) {
                        z = false;
                    } else {
                        edit.putInt("notify2_" + j, 3);
                        edit.putInt("notifyuntil_" + j, tLRPC$PeerNotifySettings.mute_until);
                        if (tLRPC$Dialog != null) {
                            tLRPC$Dialog.notify_settings.mute_until = 0;
                        }
                    }
                    i = tLRPC$PeerNotifySettings.mute_until;
                } else if (i2 != 2) {
                    edit.putInt("notify2_" + j, 2);
                    if (tLRPC$Dialog != null) {
                        tLRPC$Dialog.notify_settings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                    i = 0;
                } else {
                    i = 0;
                    z = false;
                }
                getMessagesStorage().setDialogFlags(j, (i << 32) | 1);
                getNotificationsController().removeNotificationsForDialog(j);
            } else {
                if (i2 == 0 || i2 == 1) {
                    z = false;
                } else {
                    if (tLRPC$Dialog != null) {
                        tLRPC$Dialog.notify_settings.mute_until = 0;
                    }
                    edit.putInt("notify2_" + j, 0);
                }
                getMessagesStorage().setDialogFlags(j, 0L);
            }
            boolean z2 = z;
            applySoundSettings(tLRPC$PeerNotifySettings.android_sound, edit, j, 0, false);
            edit.commit();
            if (z2) {
                getNotificationCenter().postNotificationName(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
            }
        }
    }

    private void applyDialogsNotificationsSettings(ArrayList<TLRPC$Dialog> arrayList) {
        SharedPreferences.Editor editor = null;
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$Dialog tLRPC$Dialog = arrayList.get(i);
            if (tLRPC$Dialog.peer != null && (tLRPC$Dialog.notify_settings instanceof TLRPC$TL_peerNotifySettings)) {
                if (editor == null) {
                    editor = this.notificationsPreferences.edit();
                }
                long peerId = MessageObject.getPeerId(tLRPC$Dialog.peer);
                if ((tLRPC$Dialog.notify_settings.flags & 2) != 0) {
                    editor.putBoolean("silent_" + peerId, tLRPC$Dialog.notify_settings.silent);
                } else {
                    editor.remove("silent_" + peerId);
                }
                TLRPC$PeerNotifySettings tLRPC$PeerNotifySettings = tLRPC$Dialog.notify_settings;
                if ((tLRPC$PeerNotifySettings.flags & 4) == 0) {
                    editor.remove("notify2_" + peerId);
                } else if (tLRPC$PeerNotifySettings.mute_until <= getConnectionsManager().getCurrentTime()) {
                    editor.putInt("notify2_" + peerId, 0);
                } else if (tLRPC$Dialog.notify_settings.mute_until > getConnectionsManager().getCurrentTime() + 31536000) {
                    editor.putInt("notify2_" + peerId, 2);
                    tLRPC$Dialog.notify_settings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                } else {
                    editor.putInt("notify2_" + peerId, 3);
                    editor.putInt("notifyuntil_" + peerId, tLRPC$Dialog.notify_settings.mute_until);
                }
            }
        }
        if (editor != null) {
            editor.commit();
        }
    }

    public void reloadMentionsCountForChannel(final TLRPC$InputPeer tLRPC$InputPeer, final long j) {
        Exception e;
        if (j == 0) {
            NativeByteBuffer nativeByteBuffer = null;
            try {
                nativeByteBuffer = new NativeByteBuffer(tLRPC$InputPeer.getObjectSize() + 4);
            } catch (Exception e2) {
                e = e2;
            }
            try {
                nativeByteBuffer.writeInt32(22);
                tLRPC$InputPeer.serializeToStream(nativeByteBuffer);
            } catch (Exception e3) {
                e = e3;
                FileLog.e(e);
                j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                TLRPC$TL_messages_getUnreadMentions tLRPC$TL_messages_getUnreadMentions = new TLRPC$TL_messages_getUnreadMentions();
                tLRPC$TL_messages_getUnreadMentions.peer = tLRPC$InputPeer;
                tLRPC$TL_messages_getUnreadMentions.limit = 1;
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getUnreadMentions, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$reloadMentionsCountForChannel$177(tLRPC$InputPeer, j, tLObject, tLRPC$TL_error);
                    }
                });
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        TLRPC$TL_messages_getUnreadMentions tLRPC$TL_messages_getUnreadMentions2 = new TLRPC$TL_messages_getUnreadMentions();
        tLRPC$TL_messages_getUnreadMentions2.peer = tLRPC$InputPeer;
        tLRPC$TL_messages_getUnreadMentions2.limit = 1;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getUnreadMentions2, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$reloadMentionsCountForChannel$177(tLRPC$InputPeer, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$reloadMentionsCountForChannel$177(TLRPC$InputPeer tLRPC$InputPeer, long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
        if (tLRPC$messages_Messages != null) {
            int i = tLRPC$messages_Messages.count;
            if (i == 0) {
                i = tLRPC$messages_Messages.messages.size();
            }
            getMessagesStorage().resetMentionsCount(-tLRPC$InputPeer.channel_id, i);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void reloadMentionsCountForChannels(final ArrayList<Long> arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$reloadMentionsCountForChannels$178(arrayList);
            }
        });
    }

    public void lambda$reloadMentionsCountForChannels$178(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            reloadMentionsCountForChannel(getInputPeer(-((Long) arrayList.get(i)).longValue()), 0L);
        }
    }

    public void processDialogsUpdateRead(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processDialogsUpdateRead$179(longSparseIntArray, longSparseIntArray2);
            }
        });
    }

    public void lambda$processDialogsUpdateRead$179(org.telegram.messenger.support.LongSparseIntArray r11, org.telegram.messenger.support.LongSparseIntArray r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processDialogsUpdateRead$179(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    public void checkLastDialogMessage(final TLRPC$Dialog tLRPC$Dialog, TLRPC$InputPeer tLRPC$InputPeer, final long j) {
        Exception e;
        if (!DialogObject.isEncryptedDialog(tLRPC$Dialog.id) && this.checkingLastMessagesDialogs.indexOfKey(tLRPC$Dialog.id) < 0) {
            TLRPC$TL_messages_getHistory tLRPC$TL_messages_getHistory = new TLRPC$TL_messages_getHistory();
            if (tLRPC$InputPeer == null) {
                tLRPC$InputPeer = getInputPeer(tLRPC$Dialog.id);
            }
            tLRPC$TL_messages_getHistory.peer = tLRPC$InputPeer;
            if (tLRPC$InputPeer != null) {
                tLRPC$TL_messages_getHistory.limit = 1;
                this.checkingLastMessagesDialogs.put(tLRPC$Dialog.id, Boolean.TRUE);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("checkLastDialogMessage for " + tLRPC$Dialog.id);
                }
                if (j == 0) {
                    NativeByteBuffer nativeByteBuffer = null;
                    try {
                        nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_messages_getHistory.peer.getObjectSize() + 60);
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        nativeByteBuffer.writeInt32(14);
                        nativeByteBuffer.writeInt64(tLRPC$Dialog.id);
                        nativeByteBuffer.writeInt32(tLRPC$Dialog.top_message);
                        nativeByteBuffer.writeInt32(tLRPC$Dialog.read_inbox_max_id);
                        nativeByteBuffer.writeInt32(tLRPC$Dialog.read_outbox_max_id);
                        nativeByteBuffer.writeInt32(tLRPC$Dialog.unread_count);
                        nativeByteBuffer.writeInt32(tLRPC$Dialog.last_message_date);
                        nativeByteBuffer.writeInt32(tLRPC$Dialog.pts);
                        nativeByteBuffer.writeInt32(tLRPC$Dialog.flags);
                        nativeByteBuffer.writeBool(tLRPC$Dialog.pinned);
                        nativeByteBuffer.writeInt32(tLRPC$Dialog.pinnedNum);
                        nativeByteBuffer.writeInt32(tLRPC$Dialog.unread_mentions_count);
                        nativeByteBuffer.writeBool(tLRPC$Dialog.unread_mark);
                        nativeByteBuffer.writeInt32(tLRPC$Dialog.folder_id);
                        tLRPC$TL_messages_getHistory.peer.serializeToStream(nativeByteBuffer);
                    } catch (Exception e3) {
                        e = e3;
                        FileLog.e(e);
                        j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tLRPC$TL_messages_getHistory, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                MessagesController.this.lambda$checkLastDialogMessage$183(tLRPC$Dialog, j, tLObject, tLRPC$TL_error);
                            }
                        });
                    }
                    j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getHistory, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$checkLastDialogMessage$183(tLRPC$Dialog, j, tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
    }

    public void lambda$checkLastDialogMessage$183(final TLRPC$Dialog tLRPC$Dialog, long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            removeDeletedMessagesFromArray(tLRPC$Dialog.id, tLRPC$messages_Messages.messages);
            if (!tLRPC$messages_Messages.messages.isEmpty()) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("checkLastDialogMessage for " + tLRPC$Dialog.id + " has message");
                }
                TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
                TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(0);
                TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
                tLRPC$TL_dialog.flags = tLRPC$Dialog.flags;
                tLRPC$TL_dialog.top_message = tLRPC$Message.id;
                tLRPC$TL_dialog.last_message_date = tLRPC$Message.date;
                tLRPC$TL_dialog.notify_settings = tLRPC$Dialog.notify_settings;
                tLRPC$TL_dialog.pts = tLRPC$Dialog.pts;
                tLRPC$TL_dialog.unread_count = tLRPC$Dialog.unread_count;
                tLRPC$TL_dialog.unread_mark = tLRPC$Dialog.unread_mark;
                tLRPC$TL_dialog.unread_mentions_count = tLRPC$Dialog.unread_mentions_count;
                tLRPC$TL_dialog.unread_reactions_count = tLRPC$Dialog.unread_reactions_count;
                tLRPC$TL_dialog.read_inbox_max_id = tLRPC$Dialog.read_inbox_max_id;
                tLRPC$TL_dialog.read_outbox_max_id = tLRPC$Dialog.read_outbox_max_id;
                tLRPC$TL_dialog.pinned = tLRPC$Dialog.pinned;
                tLRPC$TL_dialog.pinnedNum = tLRPC$Dialog.pinnedNum;
                tLRPC$TL_dialog.folder_id = tLRPC$Dialog.folder_id;
                long j2 = tLRPC$Dialog.id;
                tLRPC$TL_dialog.id = j2;
                tLRPC$Message.dialog_id = j2;
                tLRPC$TL_messages_dialogs.users.addAll(tLRPC$messages_Messages.users);
                tLRPC$TL_messages_dialogs.chats.addAll(tLRPC$messages_Messages.chats);
                tLRPC$TL_messages_dialogs.dialogs.add(tLRPC$TL_dialog);
                tLRPC$TL_messages_dialogs.messages.addAll(tLRPC$messages_Messages.messages);
                tLRPC$TL_messages_dialogs.count = 1;
                processDialogsUpdate(tLRPC$TL_messages_dialogs, null, false);
                getMessagesStorage().putMessages(tLRPC$messages_Messages.messages, true, true, false, getDownloadController().getAutodownloadMask(), true, false);
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkLastDialogMessage$181(tLRPC$Dialog);
                    }
                });
            }
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkLastDialogMessage$182(tLRPC$Dialog);
            }
        });
    }

    public void lambda$checkLastDialogMessage$181(final TLRPC$Dialog tLRPC$Dialog) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkLastDialogMessage for " + tLRPC$Dialog.id + " has not message");
        }
        if (getMediaDataController().getDraft(tLRPC$Dialog.id, 0) == null) {
            TLRPC$Dialog tLRPC$Dialog2 = this.dialogs_dict.get(tLRPC$Dialog.id);
            if (tLRPC$Dialog2 == null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("checkLastDialogMessage for " + tLRPC$Dialog.id + " current dialog not found");
                }
                getMessagesStorage().isDialogHasTopMessage(tLRPC$Dialog.id, new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkLastDialogMessage$180(tLRPC$Dialog);
                    }
                });
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("checkLastDialogMessage for " + tLRPC$Dialog.id + " current dialog top message " + tLRPC$Dialog2.top_message);
            }
            if (tLRPC$Dialog2.top_message == 0) {
                deleteDialog(tLRPC$Dialog.id, 3);
            }
        }
    }

    public void lambda$checkLastDialogMessage$180(TLRPC$Dialog tLRPC$Dialog) {
        deleteDialog(tLRPC$Dialog.id, 3);
    }

    public void lambda$checkLastDialogMessage$182(TLRPC$Dialog tLRPC$Dialog) {
        this.checkingLastMessagesDialogs.delete(tLRPC$Dialog.id);
    }

    public void processDialogsUpdate(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, ArrayList<TLRPC$EncryptedChat> arrayList, final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processDialogsUpdate$185(tLRPC$messages_Dialogs, z);
            }
        });
    }

    public void lambda$processDialogsUpdate$185(final org.telegram.tgnet.TLRPC$messages_Dialogs r19, final boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processDialogsUpdate$185(org.telegram.tgnet.TLRPC$messages_Dialogs, boolean):void");
    }

    public void lambda$processDialogsUpdate$184(org.telegram.tgnet.TLRPC$messages_Dialogs r19, androidx.collection.LongSparseArray r20, androidx.collection.LongSparseArray r21, boolean r22, org.telegram.messenger.support.LongSparseIntArray r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processDialogsUpdate$184(org.telegram.tgnet.TLRPC$messages_Dialogs, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    public void addToViewsQueue(final MessageObject messageObject) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$addToViewsQueue$186(messageObject);
            }
        });
    }

    public void lambda$addToViewsQueue$186(MessageObject messageObject) {
        long dialogId = messageObject.getDialogId();
        int id = messageObject.getId();
        ArrayList<Integer> arrayList = this.channelViewsToSend.get(dialogId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.channelViewsToSend.put(dialogId, arrayList);
        }
        if (!arrayList.contains(Integer.valueOf(id))) {
            arrayList.add(Integer.valueOf(id));
        }
    }

    public void loadReactionsForMessages(long j, ArrayList<MessageObject> arrayList) {
        if (!arrayList.isEmpty()) {
            TLRPC$TL_messages_getMessagesReactions tLRPC$TL_messages_getMessagesReactions = new TLRPC$TL_messages_getMessagesReactions();
            tLRPC$TL_messages_getMessagesReactions.peer = getInputPeer(j);
            for (int i = 0; i < arrayList.size(); i++) {
                tLRPC$TL_messages_getMessagesReactions.id.add(Integer.valueOf(arrayList.get(i).getId()));
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessagesReactions, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadReactionsForMessages$187(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadReactionsForMessages$187(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
            for (int i = 0; i < tLRPC$Updates.updates.size(); i++) {
                if (tLRPC$Updates.updates.get(i) instanceof TLRPC$TL_updateMessageReactions) {
                    ((TLRPC$TL_updateMessageReactions) tLRPC$Updates.updates.get(i)).updateUnreadState = false;
                }
            }
            processUpdates(tLRPC$Updates, false);
        }
    }

    public void addToPollsQueue(long j, ArrayList<MessageObject> arrayList) {
        int i;
        SparseArray<MessageObject> sparseArray = this.pollsToCheck.get(j);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            this.pollsToCheck.put(j, sparseArray);
            this.pollsToCheckSize++;
        }
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.valueAt(i2).pollVisibleOnScreen = false;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int size2 = arrayList.size();
        boolean z = false;
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i4 = 0; i4 < size2; i4++) {
            MessageObject messageObject = arrayList.get(i4);
            if (messageObject.type == 17) {
                TLRPC$Poll tLRPC$Poll = ((TLRPC$TL_messageMediaPoll) messageObject.messageOwner.media).poll;
                if (!tLRPC$Poll.closed && (i = tLRPC$Poll.close_date) != 0) {
                    if (i <= currentTime) {
                        z = true;
                    } else {
                        i3 = Math.min(i3, i - currentTime);
                    }
                }
                int id = messageObject.getId();
                MessageObject messageObject2 = sparseArray.get(id);
                if (messageObject2 != null) {
                    messageObject2.pollVisibleOnScreen = true;
                } else {
                    sparseArray.put(id, messageObject);
                }
            }
        }
        if (z) {
            this.lastViewsCheckTime = 0L;
        } else if (i3 < 5) {
            this.lastViewsCheckTime = Math.min(this.lastViewsCheckTime, System.currentTimeMillis() - ((5 - i3) * 1000));
        }
    }

    public void markMessageContentAsRead(MessageObject messageObject) {
        if (!messageObject.scheduled) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            if (messageObject.messageOwner.mentioned) {
                getMessagesStorage().markMentionMessageAsRead(-messageObject.messageOwner.peer_id.channel_id, messageObject.getId(), messageObject.getDialogId());
            }
            arrayList.add(Integer.valueOf(messageObject.getId()));
            long dialogId = messageObject.getDialogId();
            getMessagesStorage().markMessagesContentAsRead(dialogId, arrayList, 0);
            getNotificationCenter().postNotificationName(NotificationCenter.messagesReadContent, Long.valueOf(dialogId), arrayList);
            if (messageObject.getId() < 0) {
                markMessageAsRead(messageObject.getDialogId(), messageObject.messageOwner.random_id, Integer.MIN_VALUE);
            } else if (messageObject.messageOwner.peer_id.channel_id != 0) {
                TLRPC$TL_channels_readMessageContents tLRPC$TL_channels_readMessageContents = new TLRPC$TL_channels_readMessageContents();
                TLRPC$InputChannel inputChannel = getInputChannel(messageObject.messageOwner.peer_id.channel_id);
                tLRPC$TL_channels_readMessageContents.channel = inputChannel;
                if (inputChannel != null) {
                    tLRPC$TL_channels_readMessageContents.id.add(Integer.valueOf(messageObject.getId()));
                    getConnectionsManager().sendRequest(tLRPC$TL_channels_readMessageContents, MessagesController$$ExternalSyntheticLambda338.INSTANCE);
                }
            } else {
                TLRPC$TL_messages_readMessageContents tLRPC$TL_messages_readMessageContents = new TLRPC$TL_messages_readMessageContents();
                tLRPC$TL_messages_readMessageContents.id.add(Integer.valueOf(messageObject.getId()));
                getConnectionsManager().sendRequest(tLRPC$TL_messages_readMessageContents, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$markMessageContentAsRead$189(tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
    }

    public void lambda$markMessageContentAsRead$189(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
    }

    public void markMentionMessageAsRead(int i, long j, long j2) {
        getMessagesStorage().markMentionMessageAsRead(-j, i, j2);
        if (j != 0) {
            TLRPC$TL_channels_readMessageContents tLRPC$TL_channels_readMessageContents = new TLRPC$TL_channels_readMessageContents();
            TLRPC$InputChannel inputChannel = getInputChannel(j);
            tLRPC$TL_channels_readMessageContents.channel = inputChannel;
            if (inputChannel != null) {
                tLRPC$TL_channels_readMessageContents.id.add(Integer.valueOf(i));
                getConnectionsManager().sendRequest(tLRPC$TL_channels_readMessageContents, MessagesController$$ExternalSyntheticLambda346.INSTANCE);
                return;
            }
            return;
        }
        TLRPC$TL_messages_readMessageContents tLRPC$TL_messages_readMessageContents = new TLRPC$TL_messages_readMessageContents();
        tLRPC$TL_messages_readMessageContents.id.add(Integer.valueOf(i));
        getConnectionsManager().sendRequest(tLRPC$TL_messages_readMessageContents, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$markMentionMessageAsRead$191(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$markMentionMessageAsRead$191(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
    }

    public void markMessageAsRead2(long r15, int r17, org.telegram.tgnet.TLRPC$InputChannel r18, int r19, long r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.markMessageAsRead2(long, int, org.telegram.tgnet.TLRPC$InputChannel, int, long):void");
    }

    public void lambda$markMessageAsRead2$192(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$markMessageAsRead2$193(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void markMessageAsRead(long j, long j2, int i) {
        TLRPC$EncryptedChat encryptedChat;
        if (j2 != 0 && j != 0) {
            if ((i > 0 || i == Integer.MIN_VALUE) && DialogObject.isEncryptedDialog(j) && (encryptedChat = getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)))) != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                arrayList.add(Long.valueOf(j2));
                getSecretChatHelper().sendMessagesReadMessage(encryptedChat, arrayList, null);
                if (i > 0) {
                    int currentTime = getConnectionsManager().getCurrentTime();
                    getMessagesStorage().createTaskForSecretChat(encryptedChat.id, currentTime, currentTime, 0, arrayList);
                }
            }
        }
    }

    private void completeReadTask(ReadTask readTask) {
        TLRPC$TL_messages_readHistory tLRPC$TL_messages_readHistory;
        if (readTask.replyId != 0) {
            TLRPC$TL_messages_readDiscussion tLRPC$TL_messages_readDiscussion = new TLRPC$TL_messages_readDiscussion();
            tLRPC$TL_messages_readDiscussion.msg_id = (int) readTask.replyId;
            tLRPC$TL_messages_readDiscussion.peer = getInputPeer(readTask.dialogId);
            tLRPC$TL_messages_readDiscussion.read_max_id = readTask.maxId;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_readDiscussion, MessagesController$$ExternalSyntheticLambda335.INSTANCE);
        } else if (!DialogObject.isEncryptedDialog(readTask.dialogId)) {
            TLRPC$InputPeer inputPeer = getInputPeer(readTask.dialogId);
            if (inputPeer instanceof TLRPC$TL_inputPeerChannel) {
                TLRPC$TL_channels_readHistory tLRPC$TL_channels_readHistory = new TLRPC$TL_channels_readHistory();
                tLRPC$TL_channels_readHistory.channel = getInputChannel(-readTask.dialogId);
                tLRPC$TL_channels_readHistory.max_id = readTask.maxId;
                tLRPC$TL_messages_readHistory = tLRPC$TL_channels_readHistory;
            } else {
                TLRPC$TL_messages_readHistory tLRPC$TL_messages_readHistory2 = new TLRPC$TL_messages_readHistory();
                tLRPC$TL_messages_readHistory2.peer = inputPeer;
                tLRPC$TL_messages_readHistory2.max_id = readTask.maxId;
                tLRPC$TL_messages_readHistory = tLRPC$TL_messages_readHistory2;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_readHistory, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$completeReadTask$195(tLObject, tLRPC$TL_error);
                }
            });
        } else {
            TLRPC$EncryptedChat encryptedChat = getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(readTask.dialogId)));
            byte[] bArr = encryptedChat.auth_key;
            if (bArr != null && bArr.length > 1 && (encryptedChat instanceof TLRPC$TL_encryptedChat)) {
                TLRPC$TL_messages_readEncryptedHistory tLRPC$TL_messages_readEncryptedHistory = new TLRPC$TL_messages_readEncryptedHistory();
                TLRPC$TL_inputEncryptedChat tLRPC$TL_inputEncryptedChat = new TLRPC$TL_inputEncryptedChat();
                tLRPC$TL_messages_readEncryptedHistory.peer = tLRPC$TL_inputEncryptedChat;
                tLRPC$TL_inputEncryptedChat.chat_id = encryptedChat.id;
                tLRPC$TL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                tLRPC$TL_messages_readEncryptedHistory.max_date = readTask.maxDate;
                getConnectionsManager().sendRequest(tLRPC$TL_messages_readEncryptedHistory, MessagesController$$ExternalSyntheticLambda348.INSTANCE);
            }
        }
    }

    public void lambda$completeReadTask$195(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null && (tLObject instanceof TLRPC$TL_messages_affectedMessages)) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
    }

    private void checkReadTasks() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int size = this.readTasks.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            ReadTask readTask = this.readTasks.get(i2);
            if (readTask.sendRequestTime <= elapsedRealtime) {
                completeReadTask(readTask);
                this.readTasks.remove(i2);
                this.readTasksMap.remove(readTask.dialogId);
                i2--;
                size--;
            }
            i2++;
        }
        int size2 = this.repliesReadTasks.size();
        while (i < size2) {
            ReadTask readTask2 = this.repliesReadTasks.get(i);
            if (readTask2.sendRequestTime <= elapsedRealtime) {
                completeReadTask(readTask2);
                this.repliesReadTasks.remove(i);
                this.threadsReadTasksMap.remove(readTask2.dialogId + "_" + readTask2.replyId);
                i += -1;
                size2 += -1;
            }
            i++;
        }
    }

    public void markDialogAsReadNow(final long j, final int i) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markDialogAsReadNow$197(i, j);
            }
        });
    }

    public void lambda$markDialogAsReadNow$197(int i, long j) {
        if (i != 0) {
            String str = j + "_" + i;
            ReadTask readTask = this.threadsReadTasksMap.get(str);
            if (readTask != null) {
                completeReadTask(readTask);
                this.repliesReadTasks.remove(readTask);
                this.threadsReadTasksMap.remove(str);
                return;
            }
            return;
        }
        ReadTask readTask2 = this.readTasksMap.get(j);
        if (readTask2 != null) {
            completeReadTask(readTask2);
            this.readTasks.remove(readTask2);
            this.readTasksMap.remove(j);
        }
    }

    public void markMentionsAsRead(long j) {
        if (!DialogObject.isEncryptedDialog(j)) {
            getMessagesStorage().resetMentionsCount(j, 0);
            TLRPC$TL_messages_readMentions tLRPC$TL_messages_readMentions = new TLRPC$TL_messages_readMentions();
            tLRPC$TL_messages_readMentions.peer = getInputPeer(j);
            getConnectionsManager().sendRequest(tLRPC$TL_messages_readMentions, MessagesController$$ExternalSyntheticLambda352.INSTANCE);
        }
    }

    public void markDialogAsRead(final long r16, final int r18, final int r19, final int r20, final boolean r21, final int r22, final int r23, final boolean r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.markDialogAsRead(long, int, int, int, boolean, int, int, boolean, int):void");
    }

    public void lambda$markDialogAsRead$200(final long j, final int i, final int i2, final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markDialogAsRead$199(j, i, i2, z);
            }
        });
    }

    public void lambda$markDialogAsRead$199(long j, int i, int i2, boolean z) {
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog != null) {
            int i3 = tLRPC$Dialog.unread_count;
            if (i == 0 || i2 >= tLRPC$Dialog.top_message) {
                tLRPC$Dialog.unread_count = 0;
            } else {
                int max = Math.max(i3 - i, 0);
                tLRPC$Dialog.unread_count = max;
                if (i2 != Integer.MIN_VALUE) {
                    int i4 = tLRPC$Dialog.top_message;
                    if (max > i4 - i2) {
                        tLRPC$Dialog.unread_count = i4 - i2;
                    }
                }
            }
            boolean z2 = tLRPC$Dialog.unread_mark;
            if (z2) {
                tLRPC$Dialog.unread_mark = false;
                getMessagesStorage().setDialogUnread(tLRPC$Dialog.id, false);
            }
            if ((i3 != 0 || z2) && tLRPC$Dialog.unread_count == 0) {
                if (!isDialogMuted(j)) {
                    this.unreadUnmutedDialogs--;
                }
                int i5 = 0;
                while (true) {
                    DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                    if (i5 < dialogFilterArr.length) {
                        if (dialogFilterArr[i5] != null && (dialogFilterArr[i5].flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                            sortDialogs(null);
                            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
                            break;
                        }
                        i5++;
                    } else {
                        break;
                    }
                }
            }
            getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
        }
        if (!z) {
            getNotificationsController().processReadMessages(null, j, 0, i2, false);
            LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
            longSparseIntArray.put(j, 0);
            getNotificationsController().processDialogsUpdateRead(longSparseIntArray);
            return;
        }
        getNotificationsController().processReadMessages(null, j, 0, i2, true);
        LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
        longSparseIntArray2.put(j, -1);
        getNotificationsController().processDialogsUpdateRead(longSparseIntArray2);
    }

    public void lambda$markDialogAsRead$202(final long j, final int i, final boolean z, final int i2, final int i3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markDialogAsRead$201(j, i, z, i2, i3);
            }
        });
    }

    public void lambda$markDialogAsRead$201(long j, int i, boolean z, int i2, int i3) {
        getNotificationsController().processReadMessages(null, j, i, 0, z);
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog != null) {
            int i4 = tLRPC$Dialog.unread_count;
            if (i2 == 0 || i3 <= tLRPC$Dialog.top_message) {
                tLRPC$Dialog.unread_count = 0;
            } else {
                int max = Math.max(i4 - i2, 0);
                tLRPC$Dialog.unread_count = max;
                if (i3 != Integer.MAX_VALUE) {
                    int i5 = tLRPC$Dialog.top_message;
                    if (max > i3 - i5) {
                        tLRPC$Dialog.unread_count = i3 - i5;
                    }
                }
            }
            boolean z2 = tLRPC$Dialog.unread_mark;
            if (z2) {
                tLRPC$Dialog.unread_mark = false;
                getMessagesStorage().setDialogUnread(tLRPC$Dialog.id, false);
            }
            if ((i4 != 0 || z2) && tLRPC$Dialog.unread_count == 0) {
                if (!isDialogMuted(j)) {
                    this.unreadUnmutedDialogs--;
                }
                int i6 = 0;
                while (true) {
                    DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                    if (i6 < dialogFilterArr.length) {
                        if (dialogFilterArr[i6] != null && (dialogFilterArr[i6].flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                            sortDialogs(null);
                            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
                            break;
                        }
                        i6++;
                    } else {
                        break;
                    }
                }
            }
            getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
        }
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
        longSparseIntArray.put(j, 0);
        getNotificationsController().processDialogsUpdateRead(longSparseIntArray);
    }

    public void lambda$markDialogAsRead$203(int i, long j, boolean z, int i2, int i3) {
        ReadTask readTask;
        if (i != 0) {
            HashMap<String, ReadTask> hashMap = this.threadsReadTasksMap;
            readTask = hashMap.get(j + "_" + i);
        } else {
            readTask = this.readTasksMap.get(j);
        }
        if (readTask == null) {
            readTask = new ReadTask();
            readTask.dialogId = j;
            readTask.replyId = i;
            readTask.sendRequestTime = SystemClock.elapsedRealtime() + 5000;
            if (!z) {
                if (i != 0) {
                    HashMap<String, ReadTask> hashMap2 = this.threadsReadTasksMap;
                    hashMap2.put(j + "_" + i, readTask);
                    this.repliesReadTasks.add(readTask);
                } else {
                    this.readTasksMap.put(j, readTask);
                    this.readTasks.add(readTask);
                }
            }
        }
        readTask.maxDate = i2;
        readTask.maxId = i3;
        if (z) {
            completeReadTask(readTask);
        }
    }

    public int createChat(String str, ArrayList<Long> arrayList, String str2, int i, boolean z, Location location, String str3, final BaseFragment baseFragment) {
        if (i == 0 && !z) {
            final TLRPC$TL_messages_createChat tLRPC$TL_messages_createChat = new TLRPC$TL_messages_createChat();
            tLRPC$TL_messages_createChat.title = str;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC$User user = getUser(arrayList.get(i2));
                if (user != null) {
                    tLRPC$TL_messages_createChat.users.add(getInputUser(user));
                }
            }
            return getConnectionsManager().sendRequest(tLRPC$TL_messages_createChat, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$createChat$206(baseFragment, tLRPC$TL_messages_createChat, tLObject, tLRPC$TL_error);
                }
            }, 2);
        } else if (!z && i != 2 && i != 4) {
            return 0;
        } else {
            final TLRPC$TL_channels_createChannel tLRPC$TL_channels_createChannel = new TLRPC$TL_channels_createChannel();
            tLRPC$TL_channels_createChannel.title = str;
            if (str2 == null) {
                str2 = "";
            }
            tLRPC$TL_channels_createChannel.about = str2;
            tLRPC$TL_channels_createChannel.for_import = z;
            if (z || i == 4) {
                tLRPC$TL_channels_createChannel.megagroup = true;
            } else {
                tLRPC$TL_channels_createChannel.broadcast = true;
            }
            if (location != null) {
                TLRPC$TL_inputGeoPoint tLRPC$TL_inputGeoPoint = new TLRPC$TL_inputGeoPoint();
                tLRPC$TL_channels_createChannel.geo_point = tLRPC$TL_inputGeoPoint;
                tLRPC$TL_inputGeoPoint.lat = location.getLatitude();
                tLRPC$TL_channels_createChannel.geo_point._long = location.getLongitude();
                tLRPC$TL_channels_createChannel.address = str3;
                tLRPC$TL_channels_createChannel.flags |= 4;
            }
            return getConnectionsManager().sendRequest(tLRPC$TL_channels_createChannel, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$createChat$209(baseFragment, tLRPC$TL_channels_createChannel, tLObject, tLRPC$TL_error);
                }
            }, 2);
        }
    }

    public void lambda$createChat$206(final BaseFragment baseFragment, final TLRPC$TL_messages_createChat tLRPC$TL_messages_createChat, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$createChat$204(tLRPC$TL_error, baseFragment, tLRPC$TL_messages_createChat);
                }
            });
            return;
        }
        final TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        processUpdates(tLRPC$Updates, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$createChat$205(tLRPC$Updates);
            }
        });
    }

    public void lambda$createChat$204(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_createChat tLRPC$TL_messages_createChat) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_createChat, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.chatDidFailCreate, new Object[0]);
    }

    public void lambda$createChat$205(TLRPC$Updates tLRPC$Updates) {
        putUsers(tLRPC$Updates.users, false);
        putChats(tLRPC$Updates.chats, false);
        ArrayList<TLRPC$Chat> arrayList = tLRPC$Updates.chats;
        if (arrayList == null || arrayList.isEmpty()) {
            getNotificationCenter().postNotificationName(NotificationCenter.chatDidFailCreate, new Object[0]);
        } else {
            getNotificationCenter().postNotificationName(NotificationCenter.chatDidCreated, Long.valueOf(tLRPC$Updates.chats.get(0).id));
        }
    }

    public void lambda$createChat$209(final BaseFragment baseFragment, final TLRPC$TL_channels_createChannel tLRPC$TL_channels_createChannel, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$createChat$207(tLRPC$TL_error, baseFragment, tLRPC$TL_channels_createChannel);
                }
            });
            return;
        }
        final TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        processUpdates(tLRPC$Updates, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$createChat$208(tLRPC$Updates);
            }
        });
    }

    public void lambda$createChat$207(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_createChannel tLRPC$TL_channels_createChannel) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_createChannel, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.chatDidFailCreate, new Object[0]);
    }

    public void lambda$createChat$208(TLRPC$Updates tLRPC$Updates) {
        putUsers(tLRPC$Updates.users, false);
        putChats(tLRPC$Updates.chats, false);
        ArrayList<TLRPC$Chat> arrayList = tLRPC$Updates.chats;
        if (arrayList == null || arrayList.isEmpty()) {
            getNotificationCenter().postNotificationName(NotificationCenter.chatDidFailCreate, new Object[0]);
        } else {
            getNotificationCenter().postNotificationName(NotificationCenter.chatDidCreated, Long.valueOf(tLRPC$Updates.chats.get(0).id));
        }
    }

    public void convertToMegaGroup(final Context context, long j, final BaseFragment baseFragment, final MessagesStorage.LongCallback longCallback) {
        final TLRPC$TL_messages_migrateChat tLRPC$TL_messages_migrateChat = new TLRPC$TL_messages_migrateChat();
        tLRPC$TL_messages_migrateChat.chat_id = j;
        AlertDialog alertDialog = context != null ? new AlertDialog(context, 3) : null;
        final AlertDialog alertDialog2 = alertDialog;
        final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_migrateChat, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$convertToMegaGroup$213(context, alertDialog2, longCallback, baseFragment, tLRPC$TL_messages_migrateChat, tLObject, tLRPC$TL_error);
            }
        });
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    MessagesController.this.lambda$convertToMegaGroup$214(sendRequest, dialogInterface);
                }
            });
            try {
                alertDialog.show();
            } catch (Exception unused) {
            }
        }
    }

    public void lambda$convertToMegaGroup$213(final Context context, final AlertDialog alertDialog, final MessagesStorage.LongCallback longCallback, final BaseFragment baseFragment, final TLRPC$TL_messages_migrateChat tLRPC$TL_messages_migrateChat, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            if (context != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.lambda$convertToMegaGroup$210(context, alertDialog);
                    }
                });
            }
            final TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
            processUpdates(tLRPC$Updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$convertToMegaGroup$211(MessagesStorage.LongCallback.this, tLRPC$Updates);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$convertToMegaGroup$212(longCallback, context, alertDialog, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_migrateChat);
            }
        });
    }

    public static void lambda$convertToMegaGroup$210(Context context, AlertDialog alertDialog) {
        if (!((Activity) context).isFinishing()) {
            try {
                alertDialog.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void lambda$convertToMegaGroup$211(MessagesStorage.LongCallback longCallback, TLRPC$Updates tLRPC$Updates) {
        if (longCallback != null) {
            for (int i = 0; i < tLRPC$Updates.chats.size(); i++) {
                TLRPC$Chat tLRPC$Chat = tLRPC$Updates.chats.get(i);
                if (ChatObject.isChannel(tLRPC$Chat)) {
                    longCallback.run(tLRPC$Chat.id);
                    return;
                }
            }
        }
    }

    public void lambda$convertToMegaGroup$212(MessagesStorage.LongCallback longCallback, Context context, AlertDialog alertDialog, TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_migrateChat tLRPC$TL_messages_migrateChat) {
        if (longCallback != null) {
            longCallback.run(0L);
        }
        if (context != null && !((Activity) context).isFinishing()) {
            try {
                alertDialog.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
            AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_migrateChat, Boolean.FALSE);
        }
    }

    public void lambda$convertToMegaGroup$214(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public void convertToGigaGroup(final Context context, TLRPC$Chat tLRPC$Chat, final BaseFragment baseFragment, final MessagesStorage.BooleanCallback booleanCallback) {
        final TLRPC$TL_channels_convertToGigagroup tLRPC$TL_channels_convertToGigagroup = new TLRPC$TL_channels_convertToGigagroup();
        tLRPC$TL_channels_convertToGigagroup.channel = getInputChannel(tLRPC$Chat);
        AlertDialog alertDialog = context != null ? new AlertDialog(context, 3) : null;
        final AlertDialog alertDialog2 = alertDialog;
        final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_channels_convertToGigagroup, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$convertToGigaGroup$218(context, alertDialog2, booleanCallback, baseFragment, tLRPC$TL_channels_convertToGigagroup, tLObject, tLRPC$TL_error);
            }
        });
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    MessagesController.this.lambda$convertToGigaGroup$219(sendRequest, dialogInterface);
                }
            });
            try {
                alertDialog.showDelayed(400L);
            } catch (Exception unused) {
            }
        }
    }

    public void lambda$convertToGigaGroup$218(final Context context, final AlertDialog alertDialog, final MessagesStorage.BooleanCallback booleanCallback, final BaseFragment baseFragment, final TLRPC$TL_channels_convertToGigagroup tLRPC$TL_channels_convertToGigagroup, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            if (context != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.lambda$convertToGigaGroup$215(context, alertDialog);
                    }
                });
            }
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$convertToGigaGroup$216(MessagesStorage.BooleanCallback.this);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$convertToGigaGroup$217(booleanCallback, context, alertDialog, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_convertToGigagroup);
            }
        });
    }

    public static void lambda$convertToGigaGroup$215(Context context, AlertDialog alertDialog) {
        if (!((Activity) context).isFinishing()) {
            try {
                alertDialog.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void lambda$convertToGigaGroup$216(MessagesStorage.BooleanCallback booleanCallback) {
        if (booleanCallback != null) {
            booleanCallback.run(true);
        }
    }

    public void lambda$convertToGigaGroup$217(MessagesStorage.BooleanCallback booleanCallback, Context context, AlertDialog alertDialog, TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_convertToGigagroup tLRPC$TL_channels_convertToGigagroup) {
        if (booleanCallback != null) {
            booleanCallback.run(false);
        }
        if (context != null && !((Activity) context).isFinishing()) {
            try {
                alertDialog.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
            AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_convertToGigagroup, Boolean.FALSE);
        }
    }

    public void lambda$convertToGigaGroup$219(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public void addUsersToChannel(long j, ArrayList<TLRPC$InputUser> arrayList, final BaseFragment baseFragment) {
        if (arrayList != null && !arrayList.isEmpty()) {
            final TLRPC$TL_channels_inviteToChannel tLRPC$TL_channels_inviteToChannel = new TLRPC$TL_channels_inviteToChannel();
            tLRPC$TL_channels_inviteToChannel.channel = getInputChannel(j);
            tLRPC$TL_channels_inviteToChannel.users = arrayList;
            getConnectionsManager().sendRequest(tLRPC$TL_channels_inviteToChannel, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$addUsersToChannel$221(baseFragment, tLRPC$TL_channels_inviteToChannel, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$addUsersToChannel$220(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_inviteToChannel tLRPC$TL_channels_inviteToChannel) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_inviteToChannel, Boolean.TRUE);
    }

    public void lambda$addUsersToChannel$221(final BaseFragment baseFragment, final TLRPC$TL_channels_inviteToChannel tLRPC$TL_channels_inviteToChannel, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addUsersToChannel$220(tLRPC$TL_error, baseFragment, tLRPC$TL_channels_inviteToChannel);
                }
            });
        } else {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void setDefaultSendAs(final long j, long j2) {
        TLRPC$ChatFull chatFull = getChatFull(-j);
        if (chatFull != null) {
            chatFull.default_send_as = getPeer(j2);
            getMessagesStorage().updateChatInfo(chatFull, false);
            getNotificationCenter().postNotificationName(NotificationCenter.updateDefaultSendAsPeer, Long.valueOf(j), chatFull.default_send_as);
        }
        TLRPC$TL_messages_saveDefaultSendAs tLRPC$TL_messages_saveDefaultSendAs = new TLRPC$TL_messages_saveDefaultSendAs();
        tLRPC$TL_messages_saveDefaultSendAs.peer = getInputPeer(j);
        tLRPC$TL_messages_saveDefaultSendAs.send_as = getInputPeer(j2);
        getConnectionsManager().sendRequest(tLRPC$TL_messages_saveDefaultSendAs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setDefaultSendAs$222(j, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$setDefaultSendAs$222(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            long j2 = -j;
            if (getChatFull(j2) == null) {
                loadFullChat(j2, 0, true);
            }
        } else if (tLRPC$TL_error != null && tLRPC$TL_error.code == 400) {
            loadFullChat(-j, 0, true);
        }
    }

    public void toggleChatNoForwards(long j, boolean z) {
        TLRPC$TL_messages_toggleNoForwards tLRPC$TL_messages_toggleNoForwards = new TLRPC$TL_messages_toggleNoForwards();
        tLRPC$TL_messages_toggleNoForwards.peer = getInputPeer(-j);
        tLRPC$TL_messages_toggleNoForwards.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_toggleNoForwards, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toggleChatNoForwards$224(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$toggleChatNoForwards$224(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChatNoForwards$223();
                }
            });
        }
    }

    public void lambda$toggleChatNoForwards$223() {
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void toogleChannelSignatures(long j, boolean z) {
        TLRPC$TL_channels_toggleSignatures tLRPC$TL_channels_toggleSignatures = new TLRPC$TL_channels_toggleSignatures();
        tLRPC$TL_channels_toggleSignatures.channel = getInputChannel(j);
        tLRPC$TL_channels_toggleSignatures.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_toggleSignatures, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toogleChannelSignatures$226(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$toogleChannelSignatures$226(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toogleChannelSignatures$225();
                }
            });
        }
    }

    public void lambda$toogleChannelSignatures$225() {
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void toogleChannelInvitesHistory(long j, boolean z) {
        TLRPC$TL_channels_togglePreHistoryHidden tLRPC$TL_channels_togglePreHistoryHidden = new TLRPC$TL_channels_togglePreHistoryHidden();
        tLRPC$TL_channels_togglePreHistoryHidden.channel = getInputChannel(j);
        tLRPC$TL_channels_togglePreHistoryHidden.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_togglePreHistoryHidden, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toogleChannelInvitesHistory$228(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$toogleChannelInvitesHistory$228(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toogleChannelInvitesHistory$227();
                }
            });
        }
    }

    public void lambda$toogleChannelInvitesHistory$227() {
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void updateChatAbout(long j, final String str, final TLRPC$ChatFull tLRPC$ChatFull) {
        TLRPC$TL_messages_editChatAbout tLRPC$TL_messages_editChatAbout = new TLRPC$TL_messages_editChatAbout();
        tLRPC$TL_messages_editChatAbout.peer = getInputPeer(-j);
        tLRPC$TL_messages_editChatAbout.about = str;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatAbout, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$updateChatAbout$230(tLRPC$ChatFull, str, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$updateChatAbout$230(final TLRPC$ChatFull tLRPC$ChatFull, final String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if ((tLObject instanceof TLRPC$TL_boolTrue) && tLRPC$ChatFull != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$updateChatAbout$229(tLRPC$ChatFull, str);
                }
            });
        }
    }

    public void lambda$updateChatAbout$229(TLRPC$ChatFull tLRPC$ChatFull, String str) {
        tLRPC$ChatFull.about = str;
        getMessagesStorage().updateChatInfo(tLRPC$ChatFull, false);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.postNotificationName(i, tLRPC$ChatFull, 0, bool, bool);
    }

    public void updateChannelUserName(final long j, final String str) {
        TLRPC$TL_channels_updateUsername tLRPC$TL_channels_updateUsername = new TLRPC$TL_channels_updateUsername();
        tLRPC$TL_channels_updateUsername.channel = getInputChannel(j);
        tLRPC$TL_channels_updateUsername.username = str;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_updateUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$updateChannelUserName$232(j, str, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$updateChannelUserName$232(final long j, final String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$updateChannelUserName$231(j, str);
                }
            });
        }
    }

    public void lambda$updateChannelUserName$231(long j, String str) {
        TLRPC$Chat chat = getChat(Long.valueOf(j));
        if (str.length() != 0) {
            chat.flags |= 64;
        } else {
            chat.flags &= -65;
        }
        chat.username = str;
        ArrayList<TLRPC$Chat> arrayList = new ArrayList<>();
        arrayList.add(chat);
        getMessagesStorage().putUsersAndChats(null, arrayList, true, true);
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void sendBotStart(TLRPC$User tLRPC$User, String str) {
        if (tLRPC$User != null) {
            TLRPC$TL_messages_startBot tLRPC$TL_messages_startBot = new TLRPC$TL_messages_startBot();
            tLRPC$TL_messages_startBot.bot = getInputUser(tLRPC$User);
            tLRPC$TL_messages_startBot.peer = getInputPeer(tLRPC$User.id);
            tLRPC$TL_messages_startBot.start_param = str;
            tLRPC$TL_messages_startBot.random_id = Utilities.random.nextLong();
            getConnectionsManager().sendRequest(tLRPC$TL_messages_startBot, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$sendBotStart$233(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$sendBotStart$233(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public boolean isJoiningChannel(long j) {
        return this.joiningToChannels.contains(Long.valueOf(j));
    }

    public void addUserToChat(long j, TLRPC$User tLRPC$User, int i, String str, BaseFragment baseFragment, Runnable runnable) {
        addUserToChat(j, tLRPC$User, i, str, baseFragment, false, runnable, null);
    }

    public void addUserToChat(final long j, TLRPC$User tLRPC$User, int i, String str, final BaseFragment baseFragment, final boolean z, final Runnable runnable, final Runnable runnable2) {
        TLRPC$TL_messages_addChatUser tLRPC$TL_messages_addChatUser;
        if (tLRPC$User != null) {
            final boolean isChannel = ChatObject.isChannel(j, this.currentAccount);
            final boolean z2 = isChannel && getChat(Long.valueOf(j)).megagroup;
            final TLRPC$InputUser inputUser = getInputUser(tLRPC$User);
            if (str != null && (!isChannel || z2)) {
                TLRPC$TL_messages_startBot tLRPC$TL_messages_startBot = new TLRPC$TL_messages_startBot();
                tLRPC$TL_messages_startBot.bot = inputUser;
                if (isChannel) {
                    tLRPC$TL_messages_startBot.peer = getInputPeer(-j);
                } else {
                    TLRPC$TL_inputPeerChat tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChat();
                    tLRPC$TL_messages_startBot.peer = tLRPC$TL_inputPeerChat;
                    tLRPC$TL_inputPeerChat.chat_id = j;
                }
                tLRPC$TL_messages_startBot.start_param = str;
                tLRPC$TL_messages_startBot.random_id = Utilities.random.nextLong();
                tLRPC$TL_messages_addChatUser = tLRPC$TL_messages_startBot;
            } else if (!isChannel) {
                TLRPC$TL_messages_addChatUser tLRPC$TL_messages_addChatUser2 = new TLRPC$TL_messages_addChatUser();
                tLRPC$TL_messages_addChatUser2.chat_id = j;
                tLRPC$TL_messages_addChatUser2.fwd_limit = i;
                tLRPC$TL_messages_addChatUser2.user_id = inputUser;
                tLRPC$TL_messages_addChatUser = tLRPC$TL_messages_addChatUser2;
            } else if (!(inputUser instanceof TLRPC$TL_inputUserSelf)) {
                TLRPC$TL_channels_inviteToChannel tLRPC$TL_channels_inviteToChannel = new TLRPC$TL_channels_inviteToChannel();
                tLRPC$TL_channels_inviteToChannel.channel = getInputChannel(j);
                tLRPC$TL_channels_inviteToChannel.users.add(inputUser);
                tLRPC$TL_messages_addChatUser = tLRPC$TL_channels_inviteToChannel;
            } else if (!this.joiningToChannels.contains(Long.valueOf(j))) {
                TLRPC$TL_channels_joinChannel tLRPC$TL_channels_joinChannel = new TLRPC$TL_channels_joinChannel();
                tLRPC$TL_channels_joinChannel.channel = getInputChannel(j);
                this.joiningToChannels.add(Long.valueOf(j));
                tLRPC$TL_messages_addChatUser = tLRPC$TL_channels_joinChannel;
            } else {
                return;
            }
            final TLRPC$TL_messages_addChatUser tLRPC$TL_messages_addChatUser3 = tLRPC$TL_messages_addChatUser;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_addChatUser3, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$addUserToChat$237(isChannel, inputUser, j, z, runnable, runnable2, baseFragment, tLRPC$TL_messages_addChatUser3, z2, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$addUserToChat$237(final boolean z, final TLRPC$InputUser tLRPC$InputUser, final long j, boolean z2, Runnable runnable, Runnable runnable2, final BaseFragment baseFragment, final TLObject tLObject, final boolean z3, TLObject tLObject2, final TLRPC$TL_error tLRPC$TL_error) {
        boolean z4;
        if (z && (tLRPC$InputUser instanceof TLRPC$TL_inputUserSelf)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addUserToChat$234(j);
                }
            });
        }
        if (tLRPC$TL_error == null) {
            TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject2;
            int i = 0;
            while (true) {
                if (i >= tLRPC$Updates.updates.size()) {
                    z4 = false;
                    break;
                }
                TLRPC$Update tLRPC$Update = tLRPC$Updates.updates.get(i);
                if ((tLRPC$Update instanceof TLRPC$TL_updateNewChannelMessage) && (((TLRPC$TL_updateNewChannelMessage) tLRPC$Update).message.action instanceof TLRPC$TL_messageActionChatAddUser)) {
                    z4 = true;
                    break;
                }
                i++;
            }
            processUpdates(tLRPC$Updates, false);
            if (z) {
                if (!z4 && (tLRPC$InputUser instanceof TLRPC$TL_inputUserSelf)) {
                    generateJoinMessage(j, true);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$addUserToChat$236(j);
                    }
                }, 1000L);
            }
            if (z && (tLRPC$InputUser instanceof TLRPC$TL_inputUserSelf)) {
                getMessagesStorage().updateDialogsWithDeletedMessages(-j, j, new ArrayList<>(), null, true);
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        } else if (!"USER_ALREADY_PARTICIPANT".equals(tLRPC$TL_error.text) || !z2) {
            if (runnable2 != null) {
                AndroidUtilities.runOnUIThread(runnable2);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addUserToChat$235(tLRPC$TL_error, baseFragment, tLObject, z, z3, tLRPC$InputUser);
                }
            });
        } else if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$addUserToChat$234(long j) {
        this.joiningToChannels.remove(Long.valueOf(j));
    }

    public void lambda$addUserToChat$235(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLObject tLObject, boolean z, boolean z2, TLRPC$InputUser tLRPC$InputUser) {
        int i = this.currentAccount;
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(z && !z2);
        AlertsCreator.processError(i, tLRPC$TL_error, baseFragment, tLObject, objArr);
        if (z && (tLRPC$InputUser instanceof TLRPC$TL_inputUserSelf)) {
            getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
        }
    }

    public void lambda$addUserToChat$236(long j) {
        loadFullChat(j, 0, true);
    }

    public void deleteParticipantFromChat(long j, TLRPC$User tLRPC$User, TLRPC$ChatFull tLRPC$ChatFull) {
        deleteParticipantFromChat(j, tLRPC$User, null, tLRPC$ChatFull, false, false);
    }

    public void deleteParticipantFromChat(final long j, final TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, TLRPC$ChatFull tLRPC$ChatFull, boolean z, boolean z2) {
        TLRPC$InputPeer tLRPC$InputPeer;
        TLRPC$TL_messages_deleteChatUser tLRPC$TL_messages_deleteChatUser;
        if (tLRPC$User != null || tLRPC$Chat != null) {
            if (tLRPC$User != null) {
                tLRPC$InputPeer = getInputPeer(tLRPC$User);
            } else {
                tLRPC$InputPeer = getInputPeer(tLRPC$Chat);
            }
            TLRPC$Chat chat = getChat(Long.valueOf(j));
            final boolean isChannel = ChatObject.isChannel(chat);
            if (isChannel) {
                if (!UserObject.isUserSelf(tLRPC$User)) {
                    TLRPC$TL_channels_editBanned tLRPC$TL_channels_editBanned = new TLRPC$TL_channels_editBanned();
                    tLRPC$TL_channels_editBanned.channel = getInputChannel(chat);
                    tLRPC$TL_channels_editBanned.participant = tLRPC$InputPeer;
                    TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights = new TLRPC$TL_chatBannedRights();
                    tLRPC$TL_channels_editBanned.banned_rights = tLRPC$TL_chatBannedRights;
                    tLRPC$TL_chatBannedRights.view_messages = true;
                    tLRPC$TL_chatBannedRights.send_media = true;
                    tLRPC$TL_chatBannedRights.send_messages = true;
                    tLRPC$TL_chatBannedRights.send_stickers = true;
                    tLRPC$TL_chatBannedRights.send_gifs = true;
                    tLRPC$TL_chatBannedRights.send_games = true;
                    tLRPC$TL_chatBannedRights.send_inline = true;
                    tLRPC$TL_chatBannedRights.embed_links = true;
                    tLRPC$TL_chatBannedRights.pin_messages = true;
                    tLRPC$TL_chatBannedRights.send_polls = true;
                    tLRPC$TL_chatBannedRights.invite_users = true;
                    tLRPC$TL_chatBannedRights.change_info = true;
                    tLRPC$TL_messages_deleteChatUser = tLRPC$TL_channels_editBanned;
                } else if (!chat.creator || !z) {
                    TLRPC$TL_channels_leaveChannel tLRPC$TL_channels_leaveChannel = new TLRPC$TL_channels_leaveChannel();
                    tLRPC$TL_channels_leaveChannel.channel = getInputChannel(chat);
                    tLRPC$TL_messages_deleteChatUser = tLRPC$TL_channels_leaveChannel;
                } else {
                    TLRPC$TL_channels_deleteChannel tLRPC$TL_channels_deleteChannel = new TLRPC$TL_channels_deleteChannel();
                    tLRPC$TL_channels_deleteChannel.channel = getInputChannel(chat);
                    tLRPC$TL_messages_deleteChatUser = tLRPC$TL_channels_deleteChannel;
                }
            } else if (z) {
                TLRPC$TL_messages_deleteChat tLRPC$TL_messages_deleteChat = new TLRPC$TL_messages_deleteChat();
                tLRPC$TL_messages_deleteChat.chat_id = j;
                getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteChat, MessagesController$$ExternalSyntheticLambda353.INSTANCE);
                return;
            } else {
                TLRPC$TL_messages_deleteChatUser tLRPC$TL_messages_deleteChatUser2 = new TLRPC$TL_messages_deleteChatUser();
                tLRPC$TL_messages_deleteChatUser2.chat_id = j;
                tLRPC$TL_messages_deleteChatUser2.user_id = getInputUser(tLRPC$User);
                tLRPC$TL_messages_deleteChatUser2.revoke_history = true;
                tLRPC$TL_messages_deleteChatUser = tLRPC$TL_messages_deleteChatUser2;
            }
            if (UserObject.isUserSelf(tLRPC$User)) {
                deleteDialog(-j, 0, z2);
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteChatUser, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$deleteParticipantFromChat$240(isChannel, tLRPC$User, j, tLObject, tLRPC$TL_error);
                }
            }, 64);
        }
    }

    public void lambda$deleteParticipantFromChat$240(boolean z, TLRPC$User tLRPC$User, final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            if (z && !UserObject.isUserSelf(tLRPC$User)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$deleteParticipantFromChat$239(j);
                    }
                }, 1000L);
            }
        }
    }

    public void lambda$deleteParticipantFromChat$239(long j) {
        loadFullChat(j, 0, true);
    }

    public void changeChatTitle(long j, String str) {
        TLRPC$TL_messages_editChatTitle tLRPC$TL_messages_editChatTitle;
        if (ChatObject.isChannel(j, this.currentAccount)) {
            TLRPC$TL_channels_editTitle tLRPC$TL_channels_editTitle = new TLRPC$TL_channels_editTitle();
            tLRPC$TL_channels_editTitle.channel = getInputChannel(j);
            tLRPC$TL_channels_editTitle.title = str;
            tLRPC$TL_messages_editChatTitle = tLRPC$TL_channels_editTitle;
        } else {
            TLRPC$TL_messages_editChatTitle tLRPC$TL_messages_editChatTitle2 = new TLRPC$TL_messages_editChatTitle();
            tLRPC$TL_messages_editChatTitle2.chat_id = j;
            tLRPC$TL_messages_editChatTitle2.title = str;
            tLRPC$TL_messages_editChatTitle = tLRPC$TL_messages_editChatTitle2;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatTitle, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$changeChatTitle$241(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$changeChatTitle$241(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void changeChatAvatar(long j, final TLRPC$TL_inputChatPhoto tLRPC$TL_inputChatPhoto, TLRPC$InputFile tLRPC$InputFile, TLRPC$InputFile tLRPC$InputFile2, double d, final String str, final TLRPC$FileLocation tLRPC$FileLocation, final TLRPC$FileLocation tLRPC$FileLocation2, final Runnable runnable) {
        MessagesController messagesController;
        TLRPC$InputChatPhoto tLRPC$InputChatPhoto;
        TLRPC$TL_messages_editChatPhoto tLRPC$TL_messages_editChatPhoto;
        if (tLRPC$TL_inputChatPhoto != null) {
            messagesController = this;
            tLRPC$InputChatPhoto = tLRPC$TL_inputChatPhoto;
        } else if (tLRPC$InputFile == null && tLRPC$InputFile2 == null) {
            tLRPC$InputChatPhoto = new TLRPC$InputChatPhoto() {
                public static int constructor = 480546647;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            };
            messagesController = this;
        } else {
            TLRPC$TL_inputChatUploadedPhoto tLRPC$TL_inputChatUploadedPhoto = new TLRPC$TL_inputChatUploadedPhoto();
            if (tLRPC$InputFile != null) {
                tLRPC$TL_inputChatUploadedPhoto.file = tLRPC$InputFile;
                tLRPC$TL_inputChatUploadedPhoto.flags |= 1;
            }
            if (tLRPC$InputFile2 != null) {
                tLRPC$TL_inputChatUploadedPhoto.video = tLRPC$InputFile2;
                int i = tLRPC$TL_inputChatUploadedPhoto.flags | 2;
                tLRPC$TL_inputChatUploadedPhoto.flags = i;
                tLRPC$TL_inputChatUploadedPhoto.video_start_ts = d;
                tLRPC$TL_inputChatUploadedPhoto.flags = i | 4;
            }
            messagesController = this;
            tLRPC$InputChatPhoto = tLRPC$TL_inputChatUploadedPhoto;
        }
        if (ChatObject.isChannel(j, messagesController.currentAccount)) {
            TLRPC$TL_channels_editPhoto tLRPC$TL_channels_editPhoto = new TLRPC$TL_channels_editPhoto();
            tLRPC$TL_channels_editPhoto.channel = getInputChannel(j);
            tLRPC$TL_channels_editPhoto.photo = tLRPC$InputChatPhoto;
            tLRPC$TL_messages_editChatPhoto = tLRPC$TL_channels_editPhoto;
        } else {
            TLRPC$TL_messages_editChatPhoto tLRPC$TL_messages_editChatPhoto2 = new TLRPC$TL_messages_editChatPhoto();
            tLRPC$TL_messages_editChatPhoto2.chat_id = j;
            tLRPC$TL_messages_editChatPhoto2.photo = tLRPC$InputChatPhoto;
            tLRPC$TL_messages_editChatPhoto = tLRPC$TL_messages_editChatPhoto2;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatPhoto, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$changeChatAvatar$243(tLRPC$TL_inputChatPhoto, tLRPC$FileLocation, tLRPC$FileLocation2, str, runnable, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$changeChatAvatar$243(TLRPC$TL_inputChatPhoto tLRPC$TL_inputChatPhoto, TLRPC$FileLocation tLRPC$FileLocation, TLRPC$FileLocation tLRPC$FileLocation2, String str, final Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$VideoSize tLRPC$VideoSize;
        TLRPC$Photo tLRPC$Photo;
        if (tLRPC$TL_error == null) {
            TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
            if (tLRPC$TL_inputChatPhoto == null) {
                int size = tLRPC$Updates.updates.size();
                int i = 0;
                while (true) {
                    tLRPC$VideoSize = null;
                    if (i >= size) {
                        tLRPC$Photo = null;
                        break;
                    }
                    TLRPC$Update tLRPC$Update = tLRPC$Updates.updates.get(i);
                    if (tLRPC$Update instanceof TLRPC$TL_updateNewChannelMessage) {
                        TLRPC$MessageAction tLRPC$MessageAction = ((TLRPC$TL_updateNewChannelMessage) tLRPC$Update).message.action;
                        if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionChatEditPhoto) {
                            tLRPC$Photo = tLRPC$MessageAction.photo;
                            if (tLRPC$Photo instanceof TLRPC$TL_photo) {
                                break;
                            }
                        } else {
                            continue;
                        }
                        i++;
                    } else {
                        if (tLRPC$Update instanceof TLRPC$TL_updateNewMessage) {
                            TLRPC$MessageAction tLRPC$MessageAction2 = ((TLRPC$TL_updateNewMessage) tLRPC$Update).message.action;
                            if (tLRPC$MessageAction2 instanceof TLRPC$TL_messageActionChatEditPhoto) {
                                tLRPC$Photo = tLRPC$MessageAction2.photo;
                                if (tLRPC$Photo instanceof TLRPC$TL_photo) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                        i++;
                    }
                }
                if (tLRPC$Photo != null) {
                    TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    if (!tLRPC$Photo.video_sizes.isEmpty()) {
                        tLRPC$VideoSize = tLRPC$Photo.video_sizes.get(0);
                    }
                    if (!(closestPhotoSizeWithSize == null || tLRPC$FileLocation == null)) {
                        FileLoader.getPathToAttach(tLRPC$FileLocation, true).renameTo(FileLoader.getPathToAttach(closestPhotoSizeWithSize, true));
                        ImageLoader.getInstance().replaceImageInCache(tLRPC$FileLocation.volume_id + "_" + tLRPC$FileLocation.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForPhoto(closestPhotoSizeWithSize, tLRPC$Photo), true);
                    }
                    TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, 800);
                    if (!(closestPhotoSizeWithSize2 == null || tLRPC$FileLocation2 == null)) {
                        FileLoader.getPathToAttach(tLRPC$FileLocation2, true).renameTo(FileLoader.getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    if (!(tLRPC$VideoSize == null || str == null)) {
                        new File(str).renameTo(FileLoader.getPathToAttach(tLRPC$VideoSize, "mp4", true));
                    }
                }
            }
            processUpdates(tLRPC$Updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$changeChatAvatar$242(runnable);
                }
            });
        }
    }

    public void lambda$changeChatAvatar$242(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_AVATAR));
    }

    public void unregistedPush() {
        if (getUserConfig().registeredForPush && SharedConfig.pushString.length() == 0) {
            TLRPC$TL_account_unregisterDevice tLRPC$TL_account_unregisterDevice = new TLRPC$TL_account_unregisterDevice();
            tLRPC$TL_account_unregisterDevice.token = SharedConfig.pushString;
            tLRPC$TL_account_unregisterDevice.token_type = 2;
            for (int i = 0; i < 3; i++) {
                UserConfig userConfig = UserConfig.getInstance(i);
                if (i != this.currentAccount && userConfig.isClientActivated()) {
                    tLRPC$TL_account_unregisterDevice.other_uids.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            getConnectionsManager().sendRequest(tLRPC$TL_account_unregisterDevice, MessagesController$$ExternalSyntheticLambda342.INSTANCE);
        }
    }

    public void performLogout(int i) {
        boolean z = true;
        if (i == 1) {
            unregistedPush();
            getConnectionsManager().sendRequest(new TLObject() {
                public static int constructor = 1047706137;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i2, boolean z2) {
                    return TLRPC$TL_auth_loggedOut.TLdeserialize(abstractSerializedData, i2, z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$performLogout$246(tLObject, tLRPC$TL_error);
                }
            });
        } else {
            getConnectionsManager().cleanup(i == 2);
        }
        getUserConfig().clearConfig();
        SharedPrefsHelper.cleanupAccount(this.currentAccount);
        ArrayList<NotificationCenter.NotificationCenterDelegate> observers = getNotificationCenter().getObservers(NotificationCenter.appDidLogout);
        if (observers != null) {
            int size = observers.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (observers.get(i2) instanceof LaunchActivity) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (z && UserConfig.selectedAccount == this.currentAccount) {
            int i3 = 0;
            while (true) {
                if (i3 >= 3) {
                    i3 = -1;
                    break;
                } else if (UserConfig.getInstance(i3).isClientActivated()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 != -1) {
                UserConfig.selectedAccount = i3;
                UserConfig.getInstance(0).saveConfig(false);
                LaunchActivity.clearFragments();
            }
        }
        getNotificationCenter().postNotificationName(NotificationCenter.appDidLogout, new Object[0]);
        getMessagesStorage().cleanup(false);
        cleanup();
        getContactsController().deleteUnknownAppAccounts();
    }

    public void lambda$performLogout$246(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        getConnectionsManager().cleanup(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$performLogout$245(TLObject.this);
            }
        });
    }

    public static void lambda$performLogout$245(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_auth_loggedOut) {
            TLRPC$TL_auth_loggedOut tLRPC$TL_auth_loggedOut = (TLRPC$TL_auth_loggedOut) tLObject;
            if (tLRPC$TL_auth_loggedOut.future_auth_token != null) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0);
                int i = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
                SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
                tLRPC$TL_auth_loggedOut.serializeToStream(serializedData);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("log_out_token_" + i, Utilities.bytesToHex(serializedData.toByteArray())).putInt(NotificationBadge.NewHtcHomeBadger.COUNT, i + 1).apply();
            }
        }
    }

    public static ArrayList<TLRPC$TL_auth_loggedOut> getSavedLogOutTokens() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0);
        int i = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
        if (i == 0) {
            return null;
        }
        ArrayList<TLRPC$TL_auth_loggedOut> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("log_out_token_" + i2, "")));
            TLRPC$TL_auth_loggedOut TLdeserialize = TLRPC$TL_auth_loggedOut.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            if (TLdeserialize != null) {
                arrayList.add(TLdeserialize);
            }
        }
        return arrayList;
    }

    public static void saveLogOutTokens(ArrayList<TLRPC$TL_auth_loggedOut> arrayList) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("saved_tokens", 0);
        ArrayList arrayList2 = new ArrayList();
        sharedPreferences.edit().clear().apply();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        for (int i = 0; i < Math.min(20, arrayList.size()); i++) {
            arrayList2.add(arrayList.get(i));
        }
        if (arrayList2.size() > 0) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, arrayList2.size());
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                SerializedData serializedData = new SerializedData(((TLRPC$TL_auth_loggedOut) arrayList2.get(i2)).getObjectSize());
                ((TLRPC$TL_auth_loggedOut) arrayList2.get(i2)).serializeToStream(serializedData);
                edit.putString("log_out_token_" + i2, Utilities.bytesToHex(serializedData.toByteArray()));
            }
            edit.apply();
        }
    }

    public void generateUpdateMessage() {
        String str;
        if (!this.gettingAppChangelog && !BuildVars.DEBUG_VERSION && (str = SharedConfig.lastUpdateVersion) != null && !str.equals(BuildVars.BUILD_VERSION_STRING)) {
            this.gettingAppChangelog = true;
            TLRPC$TL_help_getAppChangelog tLRPC$TL_help_getAppChangelog = new TLRPC$TL_help_getAppChangelog();
            tLRPC$TL_help_getAppChangelog.prev_app_version = SharedConfig.lastUpdateVersion;
            getConnectionsManager().sendRequest(tLRPC$TL_help_getAppChangelog, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$generateUpdateMessage$247(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$generateUpdateMessage$247(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            SharedConfig.lastUpdateVersion = BuildVars.BUILD_VERSION_STRING;
            SharedConfig.saveConfig();
        }
        if (tLObject instanceof TLRPC$Updates) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void registerForPush(final String str) {
        if (!(TextUtils.isEmpty(str) || this.registeringForPush || getUserConfig().getClientUserId() == 0)) {
            if (!getUserConfig().registeredForPush || !str.equals(SharedConfig.pushString)) {
                this.registeringForPush = true;
                this.lastPushRegisterSendTime = SystemClock.elapsedRealtime();
                if (SharedConfig.pushAuthKey == null) {
                    SharedConfig.pushAuthKey = new byte[256];
                    Utilities.random.nextBytes(SharedConfig.pushAuthKey);
                    SharedConfig.saveConfig();
                }
                TLRPC$TL_account_registerDevice tLRPC$TL_account_registerDevice = new TLRPC$TL_account_registerDevice();
                tLRPC$TL_account_registerDevice.token_type = 2;
                tLRPC$TL_account_registerDevice.token = str;
                tLRPC$TL_account_registerDevice.no_muted = false;
                tLRPC$TL_account_registerDevice.secret = SharedConfig.pushAuthKey;
                for (int i = 0; i < 3; i++) {
                    UserConfig userConfig = UserConfig.getInstance(i);
                    if (i != this.currentAccount && userConfig.isClientActivated()) {
                        long clientUserId = userConfig.getClientUserId();
                        tLRPC$TL_account_registerDevice.other_uids.add(Long.valueOf(clientUserId));
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("add other uid = " + clientUserId + " for account " + this.currentAccount);
                        }
                    }
                }
                getConnectionsManager().sendRequest(tLRPC$TL_account_registerDevice, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$registerForPush$249(str, tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
    }

    public void lambda$registerForPush$249(String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("account " + this.currentAccount + " registered for push");
            }
            getUserConfig().registeredForPush = true;
            SharedConfig.pushString = str;
            getUserConfig().saveConfig(false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$registerForPush$248();
            }
        });
    }

    public void lambda$registerForPush$248() {
        this.registeringForPush = false;
    }

    public void loadCurrentState() {
        if (!this.updatingState) {
            this.updatingState = true;
            getConnectionsManager().sendRequest(new TLObject() {
                public static int constructor = -304838614;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                    return TLRPC$TL_updates_state.TLdeserialize(abstractSerializedData, i, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadCurrentState$250(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadCurrentState$250(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.updatingState = false;
        if (tLRPC$TL_error == null) {
            TLRPC$TL_updates_state tLRPC$TL_updates_state = (TLRPC$TL_updates_state) tLObject;
            getMessagesStorage().setLastDateValue(tLRPC$TL_updates_state.date);
            getMessagesStorage().setLastPtsValue(tLRPC$TL_updates_state.pts);
            getMessagesStorage().setLastSeqValue(tLRPC$TL_updates_state.seq);
            getMessagesStorage().setLastQtsValue(tLRPC$TL_updates_state.qts);
            for (int i = 0; i < 3; i++) {
                processUpdatesQueue(i, 2);
            }
            getMessagesStorage().saveDiffParams(getMessagesStorage().getLastSeqValue(), getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue());
        } else if (tLRPC$TL_error.code != 401) {
            loadCurrentState();
        }
    }

    private int getUpdateSeq(TLRPC$Updates tLRPC$Updates) {
        if (tLRPC$Updates instanceof TLRPC$TL_updatesCombined) {
            return tLRPC$Updates.seq_start;
        }
        return tLRPC$Updates.seq;
    }

    private void setUpdatesStartTime(int i, long j) {
        if (i == 0) {
            this.updatesStartWaitTimeSeq = j;
        } else if (i == 1) {
            this.updatesStartWaitTimePts = j;
        } else if (i == 2) {
            this.updatesStartWaitTimeQts = j;
        }
    }

    public long getUpdatesStartTime(int i) {
        if (i == 0) {
            return this.updatesStartWaitTimeSeq;
        }
        if (i == 1) {
            return this.updatesStartWaitTimePts;
        }
        if (i == 2) {
            return this.updatesStartWaitTimeQts;
        }
        return 0L;
    }

    private int isValidUpdate(TLRPC$Updates tLRPC$Updates, int i) {
        if (i == 0) {
            int updateSeq = getUpdateSeq(tLRPC$Updates);
            if (getMessagesStorage().getLastSeqValue() + 1 == updateSeq || getMessagesStorage().getLastSeqValue() == updateSeq) {
                return 0;
            }
            return getMessagesStorage().getLastSeqValue() < updateSeq ? 1 : 2;
        } else if (i == 1) {
            if (tLRPC$Updates.pts <= getMessagesStorage().getLastPtsValue()) {
                return 2;
            }
            return getMessagesStorage().getLastPtsValue() + tLRPC$Updates.pts_count == tLRPC$Updates.pts ? 0 : 1;
        } else if (i != 2) {
            return 0;
        } else {
            if (tLRPC$Updates.pts <= getMessagesStorage().getLastQtsValue()) {
                return 2;
            }
            return getMessagesStorage().getLastQtsValue() + tLRPC$Updates.updates.size() == tLRPC$Updates.pts ? 0 : 1;
        }
    }

    private void processChannelsUpdatesQueue(long j, int i) {
        char c;
        ArrayList<TLRPC$Updates> arrayList = this.updatesQueueChannels.get(j);
        if (arrayList != null) {
            int i2 = this.channelsPts.get(j);
            if (arrayList.isEmpty() || i2 == 0) {
                this.updatesQueueChannels.remove(j);
                return;
            }
            Collections.sort(arrayList, MessagesController$$ExternalSyntheticLambda221.INSTANCE);
            if (i == 2) {
                this.channelsPts.put(j, arrayList.get(0).pts);
            }
            boolean z = false;
            while (arrayList.size() > 0) {
                TLRPC$Updates tLRPC$Updates = arrayList.get(0);
                int i3 = tLRPC$Updates.pts;
                if (i3 <= i2) {
                    c = 2;
                } else {
                    c = tLRPC$Updates.pts_count + i2 == i3 ? (char) 0 : (char) 1;
                }
                if (c == 0) {
                    processUpdates(tLRPC$Updates, true);
                    arrayList.remove(0);
                    z = true;
                } else if (c == 1) {
                    long j2 = this.updatesStartWaitTimeChannels.get(j);
                    if (j2 == 0 || (!z && Math.abs(System.currentTimeMillis() - j2) > 1500)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("HOLE IN CHANNEL " + j + " UPDATES QUEUE - getChannelDifference ");
                        }
                        this.updatesStartWaitTimeChannels.delete(j);
                        this.updatesQueueChannels.remove(j);
                        getChannelDifference(j);
                        return;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("HOLE IN CHANNEL " + j + " UPDATES QUEUE - will wait more time");
                    }
                    if (z) {
                        this.updatesStartWaitTimeChannels.put(j, System.currentTimeMillis());
                        return;
                    }
                    return;
                } else {
                    arrayList.remove(0);
                }
            }
            this.updatesQueueChannels.remove(j);
            this.updatesStartWaitTimeChannels.delete(j);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("UPDATES CHANNEL " + j + " QUEUE PROCEED - OK");
            }
        }
    }

    public static int lambda$processChannelsUpdatesQueue$251(TLRPC$Updates tLRPC$Updates, TLRPC$Updates tLRPC$Updates2) {
        return AndroidUtilities.compare(tLRPC$Updates.pts, tLRPC$Updates2.pts);
    }

    private void processUpdatesQueue(int i, int i2) {
        ArrayList<TLRPC$Updates> arrayList;
        if (i == 0) {
            arrayList = this.updatesQueueSeq;
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$processUpdatesQueue$252;
                    lambda$processUpdatesQueue$252 = MessagesController.this.lambda$processUpdatesQueue$252((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
                    return lambda$processUpdatesQueue$252;
                }
            });
        } else if (i == 1) {
            arrayList = this.updatesQueuePts;
            Collections.sort(arrayList, MessagesController$$ExternalSyntheticLambda219.INSTANCE);
        } else if (i == 2) {
            arrayList = this.updatesQueueQts;
            Collections.sort(arrayList, MessagesController$$ExternalSyntheticLambda220.INSTANCE);
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            if (i2 == 2) {
                TLRPC$Updates tLRPC$Updates = arrayList.get(0);
                if (i == 0) {
                    getMessagesStorage().setLastSeqValue(getUpdateSeq(tLRPC$Updates));
                } else if (i == 1) {
                    getMessagesStorage().setLastPtsValue(tLRPC$Updates.pts);
                } else {
                    getMessagesStorage().setLastQtsValue(tLRPC$Updates.pts);
                }
            }
            boolean z = false;
            while (arrayList.size() > 0) {
                TLRPC$Updates tLRPC$Updates2 = arrayList.get(0);
                int isValidUpdate = isValidUpdate(tLRPC$Updates2, i);
                if (isValidUpdate == 0) {
                    processUpdates(tLRPC$Updates2, true);
                    arrayList.remove(0);
                    z = true;
                } else if (isValidUpdate != 1) {
                    arrayList.remove(0);
                } else if (getUpdatesStartTime(i) == 0 || (!z && Math.abs(System.currentTimeMillis() - getUpdatesStartTime(i)) > 1500)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("HOLE IN UPDATES QUEUE - getDifference");
                    }
                    setUpdatesStartTime(i, 0L);
                    arrayList.clear();
                    getDifference();
                    return;
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("HOLE IN UPDATES QUEUE - will wait more time");
                    }
                    if (z) {
                        setUpdatesStartTime(i, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
            }
            arrayList.clear();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("UPDATES QUEUE PROCEED - OK");
            }
        }
        setUpdatesStartTime(i, 0L);
    }

    public int lambda$processUpdatesQueue$252(TLRPC$Updates tLRPC$Updates, TLRPC$Updates tLRPC$Updates2) {
        return AndroidUtilities.compare(getUpdateSeq(tLRPC$Updates), getUpdateSeq(tLRPC$Updates2));
    }

    public static int lambda$processUpdatesQueue$253(TLRPC$Updates tLRPC$Updates, TLRPC$Updates tLRPC$Updates2) {
        return AndroidUtilities.compare(tLRPC$Updates.pts, tLRPC$Updates2.pts);
    }

    public static int lambda$processUpdatesQueue$254(TLRPC$Updates tLRPC$Updates, TLRPC$Updates tLRPC$Updates2) {
        return AndroidUtilities.compare(tLRPC$Updates.pts, tLRPC$Updates2.pts);
    }

    public void loadUnknownChannel(final TLRPC$Chat tLRPC$Chat, final long j) {
        Exception e;
        if ((tLRPC$Chat instanceof TLRPC$TL_channel) && this.gettingUnknownChannels.indexOfKey(tLRPC$Chat.id) < 0) {
            if (tLRPC$Chat.access_hash != 0) {
                TLRPC$TL_inputPeerChannel tLRPC$TL_inputPeerChannel = new TLRPC$TL_inputPeerChannel();
                long j2 = tLRPC$Chat.id;
                tLRPC$TL_inputPeerChannel.channel_id = j2;
                tLRPC$TL_inputPeerChannel.access_hash = tLRPC$Chat.access_hash;
                this.gettingUnknownChannels.put(j2, Boolean.TRUE);
                TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs = new TLRPC$TL_messages_getPeerDialogs();
                TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
                tLRPC$TL_inputDialogPeer.peer = tLRPC$TL_inputPeerChannel;
                tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer);
                if (j == 0) {
                    NativeByteBuffer nativeByteBuffer = null;
                    try {
                        nativeByteBuffer = new NativeByteBuffer(tLRPC$Chat.getObjectSize() + 4);
                        try {
                            nativeByteBuffer.writeInt32(0);
                            tLRPC$Chat.serializeToStream(nativeByteBuffer);
                        } catch (Exception e2) {
                            e = e2;
                            FileLog.e(e);
                            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                            getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    MessagesController.this.lambda$loadUnknownChannel$255(j, tLRPC$Chat, tLObject, tLRPC$TL_error);
                                }
                            });
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                    j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadUnknownChannel$255(j, tLRPC$Chat, tLObject, tLRPC$TL_error);
                    }
                });
            } else if (j != 0) {
                getMessagesStorage().removePendingTask(j);
            }
        }
    }

    public void lambda$loadUnknownChannel$255(long j, TLRPC$Chat tLRPC$Chat, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            if (!tLRPC$TL_messages_peerDialogs.dialogs.isEmpty() && !tLRPC$TL_messages_peerDialogs.chats.isEmpty()) {
                TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
                tLRPC$TL_messages_dialogs.dialogs.addAll(tLRPC$TL_messages_peerDialogs.dialogs);
                tLRPC$TL_messages_dialogs.messages.addAll(tLRPC$TL_messages_peerDialogs.messages);
                tLRPC$TL_messages_dialogs.users.addAll(tLRPC$TL_messages_peerDialogs.users);
                tLRPC$TL_messages_dialogs.chats.addAll(tLRPC$TL_messages_peerDialogs.chats);
                processLoadedDialogs(tLRPC$TL_messages_dialogs, null, ((TLRPC$TL_dialog) tLRPC$TL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, this.DIALOGS_LOAD_TYPE_CHANNEL, false, false, false);
            }
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        this.gettingUnknownChannels.delete(tLRPC$Chat.id);
    }

    public void startShortPoll(final TLRPC$Chat tLRPC$Chat, final int i, final boolean z) {
        if (tLRPC$Chat != null) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$startShortPoll$256(tLRPC$Chat, z, i);
                }
            });
        }
    }

    public void lambda$startShortPoll$256(TLRPC$Chat tLRPC$Chat, boolean z, int i) {
        ArrayList<Integer> arrayList = this.needShortPollChannels.get(tLRPC$Chat.id);
        ArrayList<Integer> arrayList2 = this.needShortPollOnlines.get(tLRPC$Chat.id);
        if (z) {
            if (arrayList != null) {
                arrayList.remove(Integer.valueOf(i));
            }
            if (arrayList == null || arrayList.isEmpty()) {
                this.needShortPollChannels.delete(tLRPC$Chat.id);
            }
            if (tLRPC$Chat.megagroup) {
                if (arrayList2 != null) {
                    arrayList2.remove(Integer.valueOf(i));
                }
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    this.needShortPollOnlines.delete(tLRPC$Chat.id);
                    return;
                }
                return;
            }
            return;
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.needShortPollChannels.put(tLRPC$Chat.id, arrayList);
        }
        if (!arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
        if (this.shortPollChannels.indexOfKey(tLRPC$Chat.id) < 0) {
            getChannelDifference(tLRPC$Chat.id, 3, 0L, null);
        }
        if (tLRPC$Chat.megagroup) {
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
                this.needShortPollOnlines.put(tLRPC$Chat.id, arrayList2);
            }
            if (!arrayList2.contains(Integer.valueOf(i))) {
                arrayList2.add(Integer.valueOf(i));
            }
            if (this.shortPollOnlines.indexOfKey(tLRPC$Chat.id) < 0) {
                this.shortPollOnlines.put(tLRPC$Chat.id, 0);
            }
        }
    }

    private void getChannelDifference(long j) {
        getChannelDifference(j, 0, 0L, null);
    }

    public static boolean isSupportUser(TLRPC$User tLRPC$User) {
        if (tLRPC$User != null) {
            if (!tLRPC$User.support) {
                long j = tLRPC$User.id;
                if (j == 777000 || j == 333000 || j == 4240000 || j == 4244000 || j == 4245000 || j == 4246000 || j == 410000 || j == 420000 || j == 431000 || j == 431415000 || j == 434000 || j == 4243000 || j == 439000 || j == 449000 || j == 450000 || j == 452000 || j == 454000 || j == 4254000 || j == 455000 || j == 460000 || j == 470000 || j == 479000 || j == 796000 || j == 482000 || j == 490000 || j == 496000 || j == 497000 || j == 498000 || j == 4298000) {
                }
            }
            return true;
        }
        return false;
    }

    public void getChannelDifference(final long r17, final int r19, long r20, org.telegram.tgnet.TLRPC$InputChannel r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.getChannelDifference(long, int, long, org.telegram.tgnet.TLRPC$InputChannel):void");
    }

    public void lambda$getChannelDifference$265(final long j, final int i, final long j2, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$updates_ChannelDifference tLRPC$updates_ChannelDifference = (TLRPC$updates_ChannelDifference) tLObject;
            final LongSparseArray longSparseArray = new LongSparseArray();
            int i2 = 0;
            for (int i3 = 0; i3 < tLRPC$updates_ChannelDifference.users.size(); i3++) {
                TLRPC$User tLRPC$User = tLRPC$updates_ChannelDifference.users.get(i3);
                longSparseArray.put(tLRPC$User.id, tLRPC$User);
            }
            final TLRPC$Chat tLRPC$Chat = null;
            for (int i4 = 0; i4 < tLRPC$updates_ChannelDifference.chats.size(); i4++) {
                tLRPC$Chat = tLRPC$updates_ChannelDifference.chats.get(i4);
                if (tLRPC$Chat.id == j) {
                    break;
                }
            }
            final ArrayList arrayList = new ArrayList();
            if (!tLRPC$updates_ChannelDifference.other_updates.isEmpty()) {
                while (i2 < tLRPC$updates_ChannelDifference.other_updates.size()) {
                    TLRPC$Update tLRPC$Update = tLRPC$updates_ChannelDifference.other_updates.get(i2);
                    if (tLRPC$Update instanceof TLRPC$TL_updateMessageID) {
                        arrayList.add((TLRPC$TL_updateMessageID) tLRPC$Update);
                        tLRPC$updates_ChannelDifference.other_updates.remove(i2);
                        i2--;
                    }
                    i2++;
                }
            }
            getMessagesStorage().putUsersAndChats(tLRPC$updates_ChannelDifference.users, tLRPC$updates_ChannelDifference.chats, true, true);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getChannelDifference$257(tLRPC$updates_ChannelDifference);
                }
            });
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getChannelDifference$263(arrayList, j, tLRPC$updates_ChannelDifference, tLRPC$Chat, longSparseArray, i, j2);
                }
            });
        } else if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getChannelDifference$264(tLRPC$TL_error, j);
                }
            });
            this.gettingDifferenceChannels.delete(j);
            if (j2 != 0) {
                getMessagesStorage().removePendingTask(j2);
            }
        }
    }

    public void lambda$getChannelDifference$257(TLRPC$updates_ChannelDifference tLRPC$updates_ChannelDifference) {
        putUsers(tLRPC$updates_ChannelDifference.users, false);
        putChats(tLRPC$updates_ChannelDifference.chats, false);
    }

    public void lambda$getChannelDifference$263(ArrayList arrayList, final long j, final TLRPC$updates_ChannelDifference tLRPC$updates_ChannelDifference, final TLRPC$Chat tLRPC$Chat, final LongSparseArray longSparseArray, final int i, final long j2) {
        if (!arrayList.isEmpty()) {
            final SparseArray sparseArray = new SparseArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLRPC$TL_updateMessageID tLRPC$TL_updateMessageID = (TLRPC$TL_updateMessageID) it.next();
                long[] updateMessageStateAndId = getMessagesStorage().updateMessageStateAndId(tLRPC$TL_updateMessageID.random_id, -j, null, tLRPC$TL_updateMessageID.id, 0, false, -1);
                if (updateMessageStateAndId != null) {
                    sparseArray.put(tLRPC$TL_updateMessageID.id, updateMessageStateAndId);
                }
            }
            if (sparseArray.size() != 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getChannelDifference$258(sparseArray);
                    }
                });
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getChannelDifference$262(tLRPC$updates_ChannelDifference, j, tLRPC$Chat, longSparseArray, i, j2);
            }
        });
    }

    public void lambda$getChannelDifference$258(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            long[] jArr = (long[]) sparseArray.valueAt(i);
            getSendMessagesHelper().processSentMessage((int) jArr[1]);
            getNotificationCenter().postNotificationName(NotificationCenter.messageReceivedByServer, Integer.valueOf((int) jArr[1]), Integer.valueOf(keyAt), null, Long.valueOf(jArr[0]), 0L, -1, Boolean.FALSE);
        }
    }

    public void lambda$getChannelDifference$262(final org.telegram.tgnet.TLRPC$updates_ChannelDifference r23, long r24, org.telegram.tgnet.TLRPC$Chat r26, androidx.collection.LongSparseArray r27, int r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getChannelDifference$262(org.telegram.tgnet.TLRPC$updates_ChannelDifference, long, org.telegram.tgnet.TLRPC$Chat, androidx.collection.LongSparseArray, int, long):void");
    }

    public void lambda$getChannelDifference$259(LongSparseArray longSparseArray) {
        for (int i = 0; i < longSparseArray.size(); i++) {
            updateInterfaceWithMessages(longSparseArray.keyAt(i), (ArrayList) longSparseArray.valueAt(i), false);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$getChannelDifference$261(final ArrayList arrayList, TLRPC$updates_ChannelDifference tLRPC$updates_ChannelDifference) {
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getChannelDifference$260(arrayList);
                }
            });
        }
        getMessagesStorage().putMessages(tLRPC$updates_ChannelDifference.new_messages, true, false, false, getDownloadController().getAutodownloadMask(), false);
    }

    public void lambda$getChannelDifference$260(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$getChannelDifference$264(TLRPC$TL_error tLRPC$TL_error, long j) {
        checkChannelError(tLRPC$TL_error.text, j);
    }

    private void checkChannelError(String str, long j) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1809401834:
                if (str.equals("USER_BANNED_IN_CHANNEL")) {
                    c = 0;
                    break;
                }
                break;
            case -795226617:
                if (str.equals("CHANNEL_PRIVATE")) {
                    c = 1;
                    break;
                }
                break;
            case -471086771:
                if (str.equals("CHANNEL_PUBLIC_GROUP_NA")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                getNotificationCenter().postNotificationName(NotificationCenter.chatInfoCantLoad, Long.valueOf(j), 2);
                return;
            case 1:
                getNotificationCenter().postNotificationName(NotificationCenter.chatInfoCantLoad, Long.valueOf(j), 0);
                return;
            case 2:
                getNotificationCenter().postNotificationName(NotificationCenter.chatInfoCantLoad, Long.valueOf(j), 1);
                return;
            default:
                return;
        }
    }

    public void getDifference() {
        getDifference(getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue(), false);
    }

    public void getDifference(int i, final int i2, final int i3, boolean z) {
        registerForPush(SharedConfig.pushString);
        if (getMessagesStorage().getLastPtsValue() == 0) {
            loadCurrentState();
        } else if (z || !this.gettingDifference) {
            this.gettingDifference = true;
            TLRPC$TL_updates_getDifference tLRPC$TL_updates_getDifference = new TLRPC$TL_updates_getDifference();
            tLRPC$TL_updates_getDifference.pts = i;
            tLRPC$TL_updates_getDifference.date = i2;
            tLRPC$TL_updates_getDifference.qts = i3;
            if (this.getDifferenceFirstSync) {
                tLRPC$TL_updates_getDifference.flags |= 1;
                if (ApplicationLoader.isConnectedOrConnectingToWiFi()) {
                    tLRPC$TL_updates_getDifference.pts_total_limit = 5000;
                } else {
                    tLRPC$TL_updates_getDifference.pts_total_limit = 1000;
                }
                this.getDifferenceFirstSync = false;
            }
            if (tLRPC$TL_updates_getDifference.date == 0) {
                tLRPC$TL_updates_getDifference.date = getConnectionsManager().getCurrentTime();
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("start getDifference with date = " + i2 + " pts = " + i + " qts = " + i3);
            }
            getConnectionsManager().setIsUpdating(true);
            getConnectionsManager().sendRequest(tLRPC$TL_updates_getDifference, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$getDifference$275(i2, i3, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$getDifference$275(final int i, final int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int i3 = 0;
        if (tLRPC$TL_error == null) {
            final TLRPC$updates_Difference tLRPC$updates_Difference = (TLRPC$updates_Difference) tLObject;
            if (tLRPC$updates_Difference instanceof TLRPC$TL_updates_differenceTooLong) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getDifference$266(tLRPC$updates_Difference, i, i2);
                    }
                });
                return;
            }
            if (tLRPC$updates_Difference instanceof TLRPC$TL_updates_differenceSlice) {
                TLRPC$TL_updates_state tLRPC$TL_updates_state = tLRPC$updates_Difference.intermediate_state;
                getDifference(tLRPC$TL_updates_state.pts, tLRPC$TL_updates_state.date, tLRPC$TL_updates_state.qts, true);
            }
            final LongSparseArray longSparseArray = new LongSparseArray();
            final LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i4 = 0; i4 < tLRPC$updates_Difference.users.size(); i4++) {
                TLRPC$User tLRPC$User = tLRPC$updates_Difference.users.get(i4);
                longSparseArray.put(tLRPC$User.id, tLRPC$User);
            }
            for (int i5 = 0; i5 < tLRPC$updates_Difference.chats.size(); i5++) {
                TLRPC$Chat tLRPC$Chat = tLRPC$updates_Difference.chats.get(i5);
                longSparseArray2.put(tLRPC$Chat.id, tLRPC$Chat);
            }
            final ArrayList arrayList = new ArrayList();
            if (!tLRPC$updates_Difference.other_updates.isEmpty()) {
                while (i3 < tLRPC$updates_Difference.other_updates.size()) {
                    TLRPC$Update tLRPC$Update = tLRPC$updates_Difference.other_updates.get(i3);
                    if (tLRPC$Update instanceof TLRPC$TL_updateMessageID) {
                        arrayList.add((TLRPC$TL_updateMessageID) tLRPC$Update);
                        tLRPC$updates_Difference.other_updates.remove(i3);
                    } else {
                        if (getUpdateType(tLRPC$Update) == 2) {
                            long updateChannelId = getUpdateChannelId(tLRPC$Update);
                            int i6 = this.channelsPts.get(updateChannelId);
                            if (i6 == 0 && (i6 = getMessagesStorage().getChannelPtsSync(updateChannelId)) != 0) {
                                this.channelsPts.put(updateChannelId, i6);
                            }
                            if (i6 != 0 && getUpdatePts(tLRPC$Update) <= i6) {
                                tLRPC$updates_Difference.other_updates.remove(i3);
                            }
                        }
                        i3++;
                    }
                    i3--;
                    i3++;
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getDifference$267(tLRPC$updates_Difference);
                }
            });
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getDifference$274(tLRPC$updates_Difference, arrayList, longSparseArray, longSparseArray2);
                }
            });
            return;
        }
        this.gettingDifference = false;
        getConnectionsManager().setIsUpdating(false);
    }

    public void lambda$getDifference$266(TLRPC$updates_Difference tLRPC$updates_Difference, int i, int i2) {
        this.loadedFullUsers.clear();
        this.loadedFullChats.clear();
        resetDialogs(true, getMessagesStorage().getLastSeqValue(), tLRPC$updates_Difference.pts, i, i2);
    }

    public void lambda$getDifference$267(TLRPC$updates_Difference tLRPC$updates_Difference) {
        this.loadedFullUsers.clear();
        this.loadedFullChats.clear();
        putUsers(tLRPC$updates_Difference.users, false);
        putChats(tLRPC$updates_Difference.chats, false);
    }

    public void lambda$getDifference$274(final TLRPC$updates_Difference tLRPC$updates_Difference, ArrayList arrayList, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        getMessagesStorage().putUsersAndChats(tLRPC$updates_Difference.users, tLRPC$updates_Difference.chats, true, false);
        if (!arrayList.isEmpty()) {
            final SparseArray sparseArray = new SparseArray();
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$TL_updateMessageID tLRPC$TL_updateMessageID = (TLRPC$TL_updateMessageID) arrayList.get(i);
                long[] updateMessageStateAndId = getMessagesStorage().updateMessageStateAndId(tLRPC$TL_updateMessageID.random_id, 0L, null, tLRPC$TL_updateMessageID.id, 0, false, -1);
                if (updateMessageStateAndId != null) {
                    sparseArray.put(tLRPC$TL_updateMessageID.id, updateMessageStateAndId);
                }
            }
            if (sparseArray.size() != 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getDifference$268(sparseArray);
                    }
                });
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getDifference$273(tLRPC$updates_Difference, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$getDifference$268(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            long[] jArr = (long[]) sparseArray.valueAt(i);
            getSendMessagesHelper().processSentMessage((int) jArr[1]);
            getNotificationCenter().postNotificationName(NotificationCenter.messageReceivedByServer, Integer.valueOf((int) jArr[1]), Integer.valueOf(keyAt), null, Long.valueOf(jArr[0]), 0L, -1, Boolean.FALSE);
        }
    }

    public void lambda$getDifference$273(final org.telegram.tgnet.TLRPC$updates_Difference r19, androidx.collection.LongSparseArray r20, androidx.collection.LongSparseArray r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getDifference$273(org.telegram.tgnet.TLRPC$updates_Difference, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray):void");
    }

    public void lambda$getDifference$272(final ArrayList arrayList, final TLRPC$updates_Difference tLRPC$updates_Difference, LongSparseArray longSparseArray) {
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getDifference$269(arrayList, tLRPC$updates_Difference);
                }
            });
        }
        getMessagesStorage().putMessages(tLRPC$updates_Difference.new_messages, true, false, false, getDownloadController().getAutodownloadMask(), false);
        for (int i = 0; i < longSparseArray.size(); i++) {
            final long keyAt = longSparseArray.keyAt(i);
            final ArrayList<MessageObject> arrayList2 = (ArrayList) longSparseArray.valueAt(i);
            getMediaDataController().loadReplyMessagesForMessages(arrayList2, keyAt, false, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getDifference$271(keyAt, arrayList2);
                }
            });
        }
    }

    public void lambda$getDifference$269(ArrayList arrayList, TLRPC$updates_Difference tLRPC$updates_Difference) {
        getNotificationsController().processNewMessages(arrayList, !(tLRPC$updates_Difference instanceof TLRPC$TL_updates_differenceSlice), false, null);
    }

    public void lambda$getDifference$271(final long j, final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getDifference$270(j, arrayList);
            }
        });
    }

    public void lambda$getDifference$270(long j, ArrayList arrayList) {
        updateInterfaceWithMessages(j, arrayList, false);
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void markDialogAsUnread(long j, TLRPC$InputPeer tLRPC$InputPeer, final long j2) {
        NativeByteBuffer nativeByteBuffer;
        Exception e;
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        NativeByteBuffer nativeByteBuffer2 = null;
        if (tLRPC$Dialog != null) {
            tLRPC$Dialog.unread_mark = true;
            if (tLRPC$Dialog.unread_count == 0 && !isDialogMuted(j)) {
                this.unreadUnmutedDialogs++;
            }
            getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
            getMessagesStorage().setDialogUnread(j, true);
            int i = 0;
            while (true) {
                DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                if (i < dialogFilterArr.length) {
                    if (dialogFilterArr[i] != null && (dialogFilterArr[i].flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                        sortDialogs(null);
                        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        if (!DialogObject.isEncryptedDialog(j)) {
            TLRPC$TL_messages_markDialogUnread tLRPC$TL_messages_markDialogUnread = new TLRPC$TL_messages_markDialogUnread();
            tLRPC$TL_messages_markDialogUnread.unread = true;
            if (tLRPC$InputPeer == null) {
                tLRPC$InputPeer = getInputPeer(j);
            }
            if (!(tLRPC$InputPeer instanceof TLRPC$TL_inputPeerEmpty)) {
                TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
                tLRPC$TL_inputDialogPeer.peer = tLRPC$InputPeer;
                tLRPC$TL_messages_markDialogUnread.peer = tLRPC$TL_inputDialogPeer;
                if (j2 == 0) {
                    try {
                        nativeByteBuffer = new NativeByteBuffer(tLRPC$InputPeer.getObjectSize() + 12);
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        nativeByteBuffer.writeInt32(9);
                        nativeByteBuffer.writeInt64(j);
                        tLRPC$InputPeer.serializeToStream(nativeByteBuffer);
                    } catch (Exception e3) {
                        e = e3;
                        nativeByteBuffer2 = nativeByteBuffer;
                        FileLog.e(e);
                        nativeByteBuffer = nativeByteBuffer2;
                        j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tLRPC$TL_messages_markDialogUnread, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                MessagesController.this.lambda$markDialogAsUnread$276(j2, tLObject, tLRPC$TL_error);
                            }
                        });
                    }
                    j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
                }
                getConnectionsManager().sendRequest(tLRPC$TL_messages_markDialogUnread, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$markDialogAsUnread$276(j2, tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
    }

    public void lambda$markDialogAsUnread$276(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void loadUnreadDialogs() {
        if (!this.loadingUnreadDialogs && !getUserConfig().unreadDialogsLoaded) {
            this.loadingUnreadDialogs = true;
            getConnectionsManager().sendRequest(new TLObject() {
                public static int constructor = 585256482;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                    TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
                    int readInt32 = abstractSerializedData.readInt32(z);
                    for (int i2 = 0; i2 < readInt32; i2++) {
                        TLRPC$DialogPeer TLdeserialize = TLRPC$DialogPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                        if (TLdeserialize == null) {
                            return tLRPC$Vector;
                        }
                        tLRPC$Vector.objects.add(TLdeserialize);
                    }
                    return tLRPC$Vector;
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadUnreadDialogs$278(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadUnreadDialogs$278(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadUnreadDialogs$277(tLObject);
            }
        });
    }

    public void lambda$loadUnreadDialogs$277(TLObject tLObject) {
        if (tLObject != null) {
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            int size = tLRPC$Vector.objects.size();
            for (int i = 0; i < size; i++) {
                TLRPC$DialogPeer tLRPC$DialogPeer = (TLRPC$DialogPeer) tLRPC$Vector.objects.get(i);
                if (tLRPC$DialogPeer instanceof TLRPC$TL_dialogPeer) {
                    TLRPC$Peer tLRPC$Peer = ((TLRPC$TL_dialogPeer) tLRPC$DialogPeer).peer;
                    long j = tLRPC$Peer.user_id;
                    if (j == 0) {
                        long j2 = tLRPC$Peer.chat_id;
                        j = j2 != 0 ? -j2 : -tLRPC$Peer.channel_id;
                    }
                    getMessagesStorage().setDialogUnread(j, true);
                    TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
                    if (tLRPC$Dialog != null && !tLRPC$Dialog.unread_mark) {
                        tLRPC$Dialog.unread_mark = true;
                        if (tLRPC$Dialog.unread_count == 0 && !isDialogMuted(j)) {
                            this.unreadUnmutedDialogs++;
                        }
                    }
                }
            }
            getUserConfig().unreadDialogsLoaded = true;
            getUserConfig().saveConfig(false);
            getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
            this.loadingUnreadDialogs = false;
        }
    }

    public void reorderPinnedDialogs(int i, ArrayList<TLRPC$InputDialogPeer> arrayList, final long j) {
        NativeByteBuffer nativeByteBuffer;
        Exception e;
        TLRPC$TL_messages_reorderPinnedDialogs tLRPC$TL_messages_reorderPinnedDialogs = new TLRPC$TL_messages_reorderPinnedDialogs();
        tLRPC$TL_messages_reorderPinnedDialogs.folder_id = i;
        tLRPC$TL_messages_reorderPinnedDialogs.force = true;
        if (j == 0) {
            ArrayList<TLRPC$Dialog> dialogs = getDialogs(i);
            if (!dialogs.isEmpty()) {
                ArrayList<Long> arrayList2 = new ArrayList<>();
                ArrayList<Integer> arrayList3 = new ArrayList<>();
                int size = dialogs.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    TLRPC$Dialog tLRPC$Dialog = dialogs.get(i3);
                    if (!(tLRPC$Dialog instanceof TLRPC$TL_dialogFolder)) {
                        if (tLRPC$Dialog.pinned) {
                            arrayList2.add(Long.valueOf(tLRPC$Dialog.id));
                            arrayList3.add(Integer.valueOf(tLRPC$Dialog.pinnedNum));
                            if (!DialogObject.isEncryptedDialog(tLRPC$Dialog.id)) {
                                TLRPC$InputPeer inputPeer = getInputPeer(tLRPC$Dialog.id);
                                TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
                                tLRPC$TL_inputDialogPeer.peer = inputPeer;
                                tLRPC$TL_messages_reorderPinnedDialogs.order.add(tLRPC$TL_inputDialogPeer);
                                i2 += tLRPC$TL_inputDialogPeer.getObjectSize();
                            }
                        } else if (tLRPC$Dialog.id != this.promoDialogId) {
                            break;
                        }
                    }
                }
                getMessagesStorage().setDialogsPinned(arrayList2, arrayList3);
                NativeByteBuffer nativeByteBuffer2 = null;
                try {
                    nativeByteBuffer = new NativeByteBuffer(i2 + 12);
                    try {
                        nativeByteBuffer.writeInt32(16);
                        nativeByteBuffer.writeInt32(i);
                        nativeByteBuffer.writeInt32(tLRPC$TL_messages_reorderPinnedDialogs.order.size());
                        int size2 = tLRPC$TL_messages_reorderPinnedDialogs.order.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            tLRPC$TL_messages_reorderPinnedDialogs.order.get(i4).serializeToStream(nativeByteBuffer);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        nativeByteBuffer2 = nativeByteBuffer;
                        FileLog.e(e);
                        nativeByteBuffer = nativeByteBuffer2;
                        j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                        getConnectionsManager().sendRequest(tLRPC$TL_messages_reorderPinnedDialogs, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                MessagesController.this.lambda$reorderPinnedDialogs$279(j, tLObject, tLRPC$TL_error);
                            }
                        });
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                j = getMessagesStorage().createPendingTask(nativeByteBuffer);
            } else {
                return;
            }
        } else {
            tLRPC$TL_messages_reorderPinnedDialogs.order = arrayList;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_reorderPinnedDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$reorderPinnedDialogs$279(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$reorderPinnedDialogs$279(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public boolean pinDialog(long j, boolean z, TLRPC$InputPeer tLRPC$InputPeer, long j2) {
        NativeByteBuffer nativeByteBuffer;
        final long createPendingTask;
        Exception e;
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog == null || tLRPC$Dialog.pinned == z) {
            return tLRPC$Dialog != null;
        }
        int i = tLRPC$Dialog.folder_id;
        ArrayList<TLRPC$Dialog> dialogs = getDialogs(i);
        tLRPC$Dialog.pinned = z;
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < dialogs.size(); i3++) {
                TLRPC$Dialog tLRPC$Dialog2 = dialogs.get(i3);
                if (!(tLRPC$Dialog2 instanceof TLRPC$TL_dialogFolder)) {
                    if (tLRPC$Dialog2.pinned) {
                        i2 = Math.max(tLRPC$Dialog2.pinnedNum, i2);
                    } else if (tLRPC$Dialog2.id != this.promoDialogId) {
                        break;
                    }
                }
            }
            tLRPC$Dialog.pinnedNum = i2 + 1;
        } else {
            tLRPC$Dialog.pinnedNum = 0;
        }
        NativeByteBuffer nativeByteBuffer2 = null;
        sortDialogs(null);
        if (!z && !dialogs.isEmpty() && dialogs.get(dialogs.size() - 1) == tLRPC$Dialog && !this.dialogsEndReached.get(i)) {
            dialogs.remove(dialogs.size() - 1);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
        if (!DialogObject.isEncryptedDialog(j) && j2 != -1) {
            TLRPC$TL_messages_toggleDialogPin tLRPC$TL_messages_toggleDialogPin = new TLRPC$TL_messages_toggleDialogPin();
            tLRPC$TL_messages_toggleDialogPin.pinned = z;
            TLRPC$InputPeer inputPeer = tLRPC$InputPeer == null ? getInputPeer(j) : tLRPC$InputPeer;
            if (inputPeer instanceof TLRPC$TL_inputPeerEmpty) {
                return false;
            }
            TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
            tLRPC$TL_inputDialogPeer.peer = inputPeer;
            tLRPC$TL_messages_toggleDialogPin.peer = tLRPC$TL_inputDialogPeer;
            if (j2 == 0) {
                try {
                    nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + 16);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    nativeByteBuffer.writeInt32(4);
                    nativeByteBuffer.writeInt64(j);
                    nativeByteBuffer.writeBool(z);
                    inputPeer.serializeToStream(nativeByteBuffer);
                } catch (Exception e3) {
                    e = e3;
                    nativeByteBuffer2 = nativeByteBuffer;
                    FileLog.e(e);
                    nativeByteBuffer = nativeByteBuffer2;
                    createPendingTask = getMessagesStorage().createPendingTask(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_toggleDialogPin, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$pinDialog$280(createPendingTask, tLObject, tLRPC$TL_error);
                        }
                    });
                    getMessagesStorage().setDialogPinned(j, tLRPC$Dialog.pinnedNum);
                    return true;
                }
                createPendingTask = getMessagesStorage().createPendingTask(nativeByteBuffer);
            } else {
                createPendingTask = j2;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_toggleDialogPin, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$pinDialog$280(createPendingTask, tLObject, tLRPC$TL_error);
                }
            });
        }
        getMessagesStorage().setDialogPinned(j, tLRPC$Dialog.pinnedNum);
        return true;
    }

    public void lambda$pinDialog$280(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void loadPinnedDialogs(final int i, long j, ArrayList<Long> arrayList) {
        if (this.loadingPinnedDialogs.indexOfKey(i) < 0 && !getUserConfig().isPinnedDialogsLoaded(i)) {
            this.loadingPinnedDialogs.put(i, 1);
            TLRPC$TL_messages_getPinnedDialogs tLRPC$TL_messages_getPinnedDialogs = new TLRPC$TL_messages_getPinnedDialogs();
            tLRPC$TL_messages_getPinnedDialogs.folder_id = i;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getPinnedDialogs, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadPinnedDialogs$283(i, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadPinnedDialogs$283(final int r18, org.telegram.tgnet.TLObject r19, org.telegram.tgnet.TLRPC$TL_error r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$loadPinnedDialogs$283(int, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$loadPinnedDialogs$282(final int i, final ArrayList arrayList, final boolean z, final TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs, final LongSparseArray longSparseArray, final TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadPinnedDialogs$281(i, arrayList, z, tLRPC$TL_messages_peerDialogs, longSparseArray, tLRPC$TL_messages_dialogs);
            }
        });
    }

    public void lambda$loadPinnedDialogs$281(int i, ArrayList arrayList, boolean z, TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs, LongSparseArray longSparseArray, TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs) {
        boolean z2;
        boolean z3;
        ArrayList<Integer> arrayList2;
        this.loadingPinnedDialogs.delete(i);
        applyDialogsNotificationsSettings(arrayList);
        ArrayList<TLRPC$Dialog> dialogs = getDialogs(i);
        int i2 = z ? 1 : 0;
        int i3 = 0;
        boolean z4 = false;
        for (int i4 = 0; i4 < dialogs.size(); i4++) {
            TLRPC$Dialog tLRPC$Dialog = dialogs.get(i4);
            if (!(tLRPC$Dialog instanceof TLRPC$TL_dialogFolder)) {
                if (DialogObject.isEncryptedDialog(tLRPC$Dialog.id)) {
                    if (i2 < arrayList.size()) {
                        arrayList.add(i2, tLRPC$Dialog);
                    } else {
                        arrayList.add(tLRPC$Dialog);
                    }
                    i2++;
                } else if (tLRPC$Dialog.pinned) {
                    i3 = Math.max(tLRPC$Dialog.pinnedNum, i3);
                    tLRPC$Dialog.pinned = false;
                    tLRPC$Dialog.pinnedNum = 0;
                    i2++;
                    z4 = true;
                } else if (tLRPC$Dialog.id != this.promoDialogId) {
                    break;
                }
            }
        }
        ArrayList<Long> arrayList3 = new ArrayList<>();
        if (!arrayList.isEmpty()) {
            putUsers(tLRPC$TL_messages_peerDialogs.users, false);
            putChats(tLRPC$TL_messages_peerDialogs.chats, false);
            ArrayList<Long> arrayList4 = new ArrayList<>();
            ArrayList<Integer> arrayList5 = new ArrayList<>();
            int size = arrayList.size();
            int i5 = 0;
            z2 = false;
            while (i5 < size) {
                TLRPC$Dialog tLRPC$Dialog2 = (TLRPC$Dialog) arrayList.get(i5);
                tLRPC$Dialog2.pinnedNum = (size - i5) + i3;
                arrayList3.add(Long.valueOf(tLRPC$Dialog2.id));
                TLRPC$Dialog tLRPC$Dialog3 = this.dialogs_dict.get(tLRPC$Dialog2.id);
                if (tLRPC$Dialog3 != null) {
                    tLRPC$Dialog3.pinned = true;
                    tLRPC$Dialog3.pinnedNum = tLRPC$Dialog2.pinnedNum;
                    arrayList4.add(Long.valueOf(tLRPC$Dialog2.id));
                    arrayList5.add(Integer.valueOf(tLRPC$Dialog2.pinnedNum));
                    arrayList2 = arrayList5;
                } else {
                    this.dialogs_dict.put(tLRPC$Dialog2.id, tLRPC$Dialog2);
                    MessageObject messageObject = (MessageObject) longSparseArray.get(tLRPC$Dialog2.id);
                    arrayList2 = arrayList5;
                    this.dialogMessage.put(tLRPC$Dialog2.id, messageObject);
                    if (messageObject != null && messageObject.messageOwner.peer_id.channel_id == 0) {
                        this.dialogMessagesByIds.put(messageObject.getId(), messageObject);
                        this.dialogsLoadedTillDate = Math.min(this.dialogsLoadedTillDate, messageObject.messageOwner.date);
                        long j = messageObject.messageOwner.random_id;
                        if (j != 0) {
                            this.dialogMessagesByRandomIds.put(j, messageObject);
                        }
                    }
                    z2 = true;
                }
                i5++;
                arrayList5 = arrayList2;
                z4 = true;
            }
            getMessagesStorage().setDialogsPinned(arrayList4, arrayList5);
        } else {
            z2 = false;
        }
        if (z4) {
            if (z2) {
                this.allDialogs.clear();
                int size2 = this.dialogs_dict.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    TLRPC$Dialog valueAt = this.dialogs_dict.valueAt(i6);
                    if (this.deletingDialogs.indexOfKey(valueAt.id) < 0) {
                        this.allDialogs.add(valueAt);
                    }
                }
            }
            sortDialogs(null);
            z3 = false;
            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
        } else {
            z3 = false;
        }
        getMessagesStorage().unpinAllDialogsExceptNew(arrayList3, i);
        getMessagesStorage().putDialogs(tLRPC$TL_messages_dialogs, 1);
        getUserConfig().setPinnedDialogsLoaded(i, true);
        getUserConfig().saveConfig(z3);
    }

    public void generateJoinMessage(final long j, boolean z) {
        TLRPC$Chat chat = getChat(Long.valueOf(j));
        if (chat != null && ChatObject.isChannel(j, this.currentAccount)) {
            if ((!chat.left && !chat.kicked) || z) {
                TLRPC$TL_messageService tLRPC$TL_messageService = new TLRPC$TL_messageService();
                tLRPC$TL_messageService.flags = 256;
                int newMessageId = getUserConfig().getNewMessageId();
                tLRPC$TL_messageService.id = newMessageId;
                tLRPC$TL_messageService.local_id = newMessageId;
                tLRPC$TL_messageService.date = getConnectionsManager().getCurrentTime();
                TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                tLRPC$TL_messageService.from_id = tLRPC$TL_peerUser;
                tLRPC$TL_peerUser.user_id = getUserConfig().getClientUserId();
                TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
                tLRPC$TL_messageService.peer_id = tLRPC$TL_peerChannel;
                tLRPC$TL_peerChannel.channel_id = j;
                tLRPC$TL_messageService.dialog_id = -j;
                tLRPC$TL_messageService.post = true;
                TLRPC$TL_messageActionChatAddUser tLRPC$TL_messageActionChatAddUser = new TLRPC$TL_messageActionChatAddUser();
                tLRPC$TL_messageService.action = tLRPC$TL_messageActionChatAddUser;
                tLRPC$TL_messageActionChatAddUser.users.add(Long.valueOf(getUserConfig().getClientUserId()));
                getUserConfig().saveConfig(false);
                final ArrayList arrayList = new ArrayList();
                ArrayList<TLRPC$Message> arrayList2 = new ArrayList<>();
                arrayList2.add(tLRPC$TL_messageService);
                arrayList.add(new MessageObject(this.currentAccount, tLRPC$TL_messageService, true, false));
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$generateJoinMessage$285(arrayList);
                    }
                });
                getMessagesStorage().putMessages(arrayList2, true, true, false, 0, false);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$generateJoinMessage$286(j, arrayList);
                    }
                });
            }
        }
    }

    public void lambda$generateJoinMessage$284(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$generateJoinMessage$285(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$generateJoinMessage$284(arrayList);
            }
        });
    }

    public void lambda$generateJoinMessage$286(long j, ArrayList arrayList) {
        updateInterfaceWithMessages(-j, arrayList, false);
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void deleteMessagesByPush(final long j, final ArrayList<Integer> arrayList, final long j2) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteMessagesByPush$288(arrayList, j2, j);
            }
        });
    }

    public void lambda$deleteMessagesByPush$288(final ArrayList arrayList, final long j, long j2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteMessagesByPush$287(arrayList, j);
            }
        });
        getMessagesStorage().deletePushMessages(j2, arrayList);
        getMessagesStorage().updateDialogsWithDeletedMessages(j2, j, arrayList, getMessagesStorage().markMessagesAsDeleted(j2, arrayList, false, true, false), false);
    }

    public void lambda$deleteMessagesByPush$287(ArrayList arrayList, long j) {
        int i = 0;
        getNotificationCenter().postNotificationName(NotificationCenter.messagesDeleted, arrayList, Long.valueOf(j), Boolean.FALSE);
        if (j == 0) {
            int size = arrayList.size();
            while (i < size) {
                MessageObject messageObject = this.dialogMessagesByIds.get(((Integer) arrayList.get(i)).intValue());
                if (messageObject != null) {
                    messageObject.deleted = true;
                }
                i++;
            }
            return;
        }
        MessageObject messageObject2 = this.dialogMessage.get(-j);
        if (messageObject2 != null) {
            int size2 = arrayList.size();
            while (i < size2) {
                if (messageObject2.getId() == ((Integer) arrayList.get(i)).intValue()) {
                    messageObject2.deleted = true;
                    return;
                }
                i++;
            }
        }
    }

    public void checkChatInviter(final long j, final boolean z) {
        final TLRPC$Chat chat = getChat(Long.valueOf(j));
        if (ChatObject.isChannel(chat) && !chat.creator && this.gettingChatInviters.indexOfKey(j) < 0) {
            this.gettingChatInviters.put(j, Boolean.TRUE);
            TLRPC$TL_channels_getParticipant tLRPC$TL_channels_getParticipant = new TLRPC$TL_channels_getParticipant();
            tLRPC$TL_channels_getParticipant.channel = getInputChannel(j);
            tLRPC$TL_channels_getParticipant.participant = getInputPeer(getUserConfig().getClientUserId());
            getConnectionsManager().sendRequest(tLRPC$TL_channels_getParticipant, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkChatInviter$293(chat, z, j, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$checkChatInviter$293(TLRPC$Chat tLRPC$Chat, boolean z, final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        final ArrayList arrayList;
        final TLRPC$TL_channels_channelParticipant tLRPC$TL_channels_channelParticipant = (TLRPC$TL_channels_channelParticipant) tLObject;
        if (tLRPC$TL_channels_channelParticipant != null) {
            TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLRPC$TL_channels_channelParticipant.participant;
            if (tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantSelf) {
                TLRPC$TL_channelParticipantSelf tLRPC$TL_channelParticipantSelf = (TLRPC$TL_channelParticipantSelf) tLRPC$ChannelParticipant;
                if (tLRPC$TL_channelParticipantSelf.inviter_id == getUserConfig().getClientUserId() && !tLRPC$TL_channelParticipantSelf.via_invite) {
                    return;
                }
                if (!tLRPC$Chat.megagroup || !getMessagesStorage().isMigratedChat(tLRPC$Chat.id)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MessagesController.this.lambda$checkChatInviter$289(tLRPC$TL_channels_channelParticipant);
                        }
                    });
                    getMessagesStorage().putUsersAndChats(tLRPC$TL_channels_channelParticipant.users, tLRPC$TL_channels_channelParticipant.chats, true, true);
                    if (!z || Math.abs(getConnectionsManager().getCurrentTime() - tLRPC$TL_channels_channelParticipant.participant.date) >= 86400 || getMessagesStorage().hasInviteMeMessage(j)) {
                        arrayList = null;
                    } else {
                        TLRPC$TL_messageService tLRPC$TL_messageService = new TLRPC$TL_messageService();
                        tLRPC$TL_messageService.media_unread = true;
                        tLRPC$TL_messageService.unread = true;
                        tLRPC$TL_messageService.flags = 256;
                        tLRPC$TL_messageService.post = true;
                        int newMessageId = getUserConfig().getNewMessageId();
                        tLRPC$TL_messageService.id = newMessageId;
                        tLRPC$TL_messageService.local_id = newMessageId;
                        tLRPC$TL_messageService.date = tLRPC$TL_channels_channelParticipant.participant.date;
                        if (tLRPC$TL_channelParticipantSelf.inviter_id != getUserConfig().getClientUserId()) {
                            tLRPC$TL_messageService.action = new TLRPC$TL_messageActionChatAddUser();
                        } else if (tLRPC$TL_channelParticipantSelf.via_invite) {
                            tLRPC$TL_messageService.action = new TLRPC$TL_messageActionChatJoinedByRequest();
                        }
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        tLRPC$TL_messageService.from_id = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = tLRPC$TL_channels_channelParticipant.participant.inviter_id;
                        tLRPC$TL_messageService.action.users.add(Long.valueOf(getUserConfig().getClientUserId()));
                        TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
                        tLRPC$TL_messageService.peer_id = tLRPC$TL_peerChannel;
                        tLRPC$TL_peerChannel.channel_id = j;
                        tLRPC$TL_messageService.dialog_id = -j;
                        getUserConfig().saveConfig(false);
                        arrayList = new ArrayList();
                        ArrayList<TLRPC$Message> arrayList2 = new ArrayList<>();
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        for (int i = 0; i < tLRPC$TL_channels_channelParticipant.users.size(); i++) {
                            TLRPC$User tLRPC$User = tLRPC$TL_channels_channelParticipant.users.get(i);
                            concurrentHashMap.put(Long.valueOf(tLRPC$User.id), tLRPC$User);
                        }
                        arrayList2.add(tLRPC$TL_messageService);
                        arrayList.add(new MessageObject(this.currentAccount, (TLRPC$Message) tLRPC$TL_messageService, (AbstractMap<Long, TLRPC$User>) concurrentHashMap, true, false));
                        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                MessagesController.this.lambda$checkChatInviter$291(arrayList);
                            }
                        });
                        getMessagesStorage().putMessages(arrayList2, true, true, false, 0, false);
                    }
                    final ArrayList arrayList3 = arrayList;
                    getMessagesStorage().saveChatInviter(j, tLRPC$TL_channels_channelParticipant.participant.inviter_id);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MessagesController.this.lambda$checkChatInviter$292(j, arrayList3, tLRPC$TL_channels_channelParticipant);
                        }
                    });
                }
            }
        }
    }

    public void lambda$checkChatInviter$289(TLRPC$TL_channels_channelParticipant tLRPC$TL_channels_channelParticipant) {
        putUsers(tLRPC$TL_channels_channelParticipant.users, false);
        putChats(tLRPC$TL_channels_channelParticipant.chats, false);
    }

    public void lambda$checkChatInviter$290(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$checkChatInviter$291(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkChatInviter$290(arrayList);
            }
        });
    }

    public void lambda$checkChatInviter$292(long j, ArrayList arrayList, TLRPC$TL_channels_channelParticipant tLRPC$TL_channels_channelParticipant) {
        this.gettingChatInviters.delete(j);
        if (arrayList != null) {
            updateInterfaceWithMessages(-j, arrayList, false);
            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.didLoadChatInviter, Long.valueOf(j), Long.valueOf(tLRPC$TL_channels_channelParticipant.participant.inviter_id));
    }

    private int getUpdateType(TLRPC$Update tLRPC$Update) {
        if ((tLRPC$Update instanceof TLRPC$TL_updateNewMessage) || (tLRPC$Update instanceof TLRPC$TL_updateReadMessagesContents) || (tLRPC$Update instanceof TLRPC$TL_updateReadHistoryInbox) || (tLRPC$Update instanceof TLRPC$TL_updateReadHistoryOutbox) || (tLRPC$Update instanceof TLRPC$TL_updateDeleteMessages) || (tLRPC$Update instanceof TLRPC$TL_updateWebPage) || (tLRPC$Update instanceof TLRPC$TL_updateEditMessage) || (tLRPC$Update instanceof TLRPC$TL_updateFolderPeers) || (tLRPC$Update instanceof TLRPC$TL_updatePinnedMessages)) {
            return 0;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateNewEncryptedMessage) {
            return 1;
        }
        return ((tLRPC$Update instanceof TLRPC$TL_updateNewChannelMessage) || (tLRPC$Update instanceof TLRPC$TL_updateDeleteChannelMessages) || (tLRPC$Update instanceof TLRPC$TL_updateEditChannelMessage) || (tLRPC$Update instanceof TLRPC$TL_updateChannelWebPage) || (tLRPC$Update instanceof TLRPC$TL_updatePinnedChannelMessages)) ? 2 : 3;
    }

    private static int getUpdatePts(TLRPC$Update tLRPC$Update) {
        if (tLRPC$Update instanceof TLRPC$TL_updateDeleteMessages) {
            return ((TLRPC$TL_updateDeleteMessages) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateNewChannelMessage) {
            return ((TLRPC$TL_updateNewChannelMessage) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateReadHistoryOutbox) {
            return ((TLRPC$TL_updateReadHistoryOutbox) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateNewMessage) {
            return ((TLRPC$TL_updateNewMessage) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateEditMessage) {
            return ((TLRPC$TL_updateEditMessage) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateWebPage) {
            return ((TLRPC$TL_updateWebPage) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateReadHistoryInbox) {
            return ((TLRPC$TL_updateReadHistoryInbox) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelWebPage) {
            return ((TLRPC$TL_updateChannelWebPage) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateDeleteChannelMessages) {
            return ((TLRPC$TL_updateDeleteChannelMessages) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateEditChannelMessage) {
            return ((TLRPC$TL_updateEditChannelMessage) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateReadMessagesContents) {
            return ((TLRPC$TL_updateReadMessagesContents) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelTooLong) {
            return ((TLRPC$TL_updateChannelTooLong) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateFolderPeers) {
            return ((TLRPC$TL_updateFolderPeers) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updatePinnedChannelMessages) {
            return ((TLRPC$TL_updatePinnedChannelMessages) tLRPC$Update).pts;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updatePinnedMessages) {
            return ((TLRPC$TL_updatePinnedMessages) tLRPC$Update).pts;
        }
        return 0;
    }

    private static int getUpdatePtsCount(TLRPC$Update tLRPC$Update) {
        if (tLRPC$Update instanceof TLRPC$TL_updateDeleteMessages) {
            return ((TLRPC$TL_updateDeleteMessages) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateNewChannelMessage) {
            return ((TLRPC$TL_updateNewChannelMessage) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateReadHistoryOutbox) {
            return ((TLRPC$TL_updateReadHistoryOutbox) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateNewMessage) {
            return ((TLRPC$TL_updateNewMessage) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateEditMessage) {
            return ((TLRPC$TL_updateEditMessage) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateWebPage) {
            return ((TLRPC$TL_updateWebPage) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateReadHistoryInbox) {
            return ((TLRPC$TL_updateReadHistoryInbox) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelWebPage) {
            return ((TLRPC$TL_updateChannelWebPage) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateDeleteChannelMessages) {
            return ((TLRPC$TL_updateDeleteChannelMessages) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateEditChannelMessage) {
            return ((TLRPC$TL_updateEditChannelMessage) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateReadMessagesContents) {
            return ((TLRPC$TL_updateReadMessagesContents) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateFolderPeers) {
            return ((TLRPC$TL_updateFolderPeers) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updatePinnedChannelMessages) {
            return ((TLRPC$TL_updatePinnedChannelMessages) tLRPC$Update).pts_count;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updatePinnedMessages) {
            return ((TLRPC$TL_updatePinnedMessages) tLRPC$Update).pts_count;
        }
        return 0;
    }

    private static int getUpdateQts(TLRPC$Update tLRPC$Update) {
        if (tLRPC$Update instanceof TLRPC$TL_updateNewEncryptedMessage) {
            return ((TLRPC$TL_updateNewEncryptedMessage) tLRPC$Update).qts;
        }
        return 0;
    }

    public static long getUpdateChannelId(TLRPC$Update tLRPC$Update) {
        if (tLRPC$Update instanceof TLRPC$TL_updateNewChannelMessage) {
            return ((TLRPC$TL_updateNewChannelMessage) tLRPC$Update).message.peer_id.channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateEditChannelMessage) {
            return ((TLRPC$TL_updateEditChannelMessage) tLRPC$Update).message.peer_id.channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateReadChannelOutbox) {
            return ((TLRPC$TL_updateReadChannelOutbox) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelMessageViews) {
            return ((TLRPC$TL_updateChannelMessageViews) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelMessageForwards) {
            return ((TLRPC$TL_updateChannelMessageForwards) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelTooLong) {
            return ((TLRPC$TL_updateChannelTooLong) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelReadMessagesContents) {
            return ((TLRPC$TL_updateChannelReadMessagesContents) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelAvailableMessages) {
            return ((TLRPC$TL_updateChannelAvailableMessages) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateChannel) {
            return ((TLRPC$TL_updateChannel) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelWebPage) {
            return ((TLRPC$TL_updateChannelWebPage) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateDeleteChannelMessages) {
            return ((TLRPC$TL_updateDeleteChannelMessages) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateReadChannelInbox) {
            return ((TLRPC$TL_updateReadChannelInbox) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateReadChannelDiscussionInbox) {
            return ((TLRPC$TL_updateReadChannelDiscussionInbox) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateReadChannelDiscussionOutbox) {
            return ((TLRPC$TL_updateReadChannelDiscussionOutbox) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelUserTyping) {
            return ((TLRPC$TL_updateChannelUserTyping) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updatePinnedChannelMessages) {
            return ((TLRPC$TL_updatePinnedChannelMessages) tLRPC$Update).channel_id;
        }
        if (!BuildVars.LOGS_ENABLED) {
            return 0L;
        }
        FileLog.e("trying to get unknown update channel_id for " + tLRPC$Update);
        return 0L;
    }

    public void processUpdates(final org.telegram.tgnet.TLRPC$Updates r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processUpdates(org.telegram.tgnet.TLRPC$Updates, boolean):void");
    }

    public void lambda$processUpdates$294(boolean z, long j, ArrayList arrayList) {
        if (z) {
            getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_USER_PRINT));
        }
        updateInterfaceWithMessages(j, arrayList, false);
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processUpdates$295(boolean z, TLRPC$Updates tLRPC$Updates, ArrayList arrayList) {
        if (z) {
            getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_USER_PRINT));
        }
        updateInterfaceWithMessages(-tLRPC$Updates.chat_id, arrayList, false);
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processUpdates$296(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$processUpdates$297(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdates$296(arrayList);
            }
        });
    }

    public void lambda$processUpdates$299() {
        getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_STATUS));
    }

    private boolean applyFoldersUpdates(ArrayList<TLRPC$TL_updateFolderPeers> arrayList) {
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            TLRPC$TL_updateFolderPeers tLRPC$TL_updateFolderPeers = arrayList.get(i);
            int size2 = tLRPC$TL_updateFolderPeers.folder_peers.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC$TL_folderPeer tLRPC$TL_folderPeer = tLRPC$TL_updateFolderPeers.folder_peers.get(i2);
                TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(DialogObject.getPeerDialogId(tLRPC$TL_folderPeer.peer));
                if (tLRPC$Dialog != null) {
                    int i3 = tLRPC$Dialog.folder_id;
                    int i4 = tLRPC$TL_folderPeer.folder_id;
                    if (i3 != i4) {
                        tLRPC$Dialog.pinned = false;
                        tLRPC$Dialog.pinnedNum = 0;
                        tLRPC$Dialog.folder_id = i4;
                        ensureFolderDialogExists(i4, null);
                    }
                }
            }
            getMessagesStorage().setDialogsFolderId(arrayList.get(i).folder_peers, null, 0L, 0);
            i++;
            z = true;
        }
        return z;
    }

    public boolean processUpdateArray(java.util.ArrayList<org.telegram.tgnet.TLRPC$Update> r69, final java.util.ArrayList<org.telegram.tgnet.TLRPC$User> r70, final java.util.ArrayList<org.telegram.tgnet.TLRPC$Chat> r71, boolean r72, final int r73) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processUpdateArray(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean, int):boolean");
    }

    public void lambda$processUpdateArray$300(ArrayList arrayList, ArrayList arrayList2) {
        putUsers(arrayList, false);
        putChats(arrayList2, false);
    }

    public void lambda$processUpdateArray$301(ArrayList arrayList, ArrayList arrayList2) {
        putUsers(arrayList, false);
        putChats(arrayList2, false);
    }

    public void lambda$processUpdateArray$302(TLRPC$TL_updateUserTyping tLRPC$TL_updateUserTyping) {
        getNotificationCenter().postNotificationName(NotificationCenter.onEmojiInteractionsReceived, Long.valueOf(tLRPC$TL_updateUserTyping.user_id), tLRPC$TL_updateUserTyping.action);
    }

    public void lambda$processUpdateArray$303(TLRPC$TL_updateChatUserTyping tLRPC$TL_updateChatUserTyping) {
        getNotificationCenter().postNotificationName(NotificationCenter.onEmojiInteractionsReceived, Long.valueOf(-tLRPC$TL_updateChatUserTyping.chat_id), tLRPC$TL_updateChatUserTyping.action);
    }

    public void lambda$processUpdateArray$305(final TLRPC$TL_updatePeerBlocked tLRPC$TL_updatePeerBlocked) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdateArray$304(tLRPC$TL_updatePeerBlocked);
            }
        });
    }

    public void lambda$processUpdateArray$304(TLRPC$TL_updatePeerBlocked tLRPC$TL_updatePeerBlocked) {
        long peerId = MessageObject.getPeerId(tLRPC$TL_updatePeerBlocked.peer_id);
        if (!tLRPC$TL_updatePeerBlocked.blocked) {
            this.blockePeers.delete(peerId);
        } else if (this.blockePeers.indexOfKey(peerId) < 0) {
            this.blockePeers.put(peerId, 1);
        }
        getNotificationCenter().postNotificationName(NotificationCenter.blockedUsersDidLoad, new Object[0]);
    }

    public void lambda$processUpdateArray$306(TLRPC$TL_updateServiceNotification tLRPC$TL_updateServiceNotification) {
        getNotificationCenter().postNotificationName(NotificationCenter.needShowAlert, 2, tLRPC$TL_updateServiceNotification.message, tLRPC$TL_updateServiceNotification.type);
    }

    public void lambda$processUpdateArray$307(TLRPC$TL_updateLangPack tLRPC$TL_updateLangPack) {
        LocaleController.getInstance().saveRemoteLocaleStringsForCurrentLocale(tLRPC$TL_updateLangPack.difference, this.currentAccount);
    }

    public void lambda$processUpdateArray$308(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$processUpdateArray$309(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdateArray$308(arrayList);
            }
        });
    }

    public void lambda$processUpdateArray$310(LongSparseArray longSparseArray) {
        getNotificationsController().processEditedMessages(longSparseArray);
    }

    public void lambda$processUpdateArray$311(final LongSparseArray longSparseArray) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdateArray$310(longSparseArray);
            }
        });
    }

    public void lambda$processUpdateArray$312(TLRPC$User tLRPC$User) {
        getContactsController().addContactToPhoneBook(tLRPC$User, true);
    }

    public void lambda$processUpdateArray$313() {
        getNotificationsController().deleteNotificationChannelGlobal(0);
    }

    public void lambda$processUpdateArray$314() {
        getNotificationsController().deleteNotificationChannelGlobal(1);
    }

    public void lambda$processUpdateArray$315() {
        getNotificationsController().deleteNotificationChannelGlobal(2);
    }

    public void lambda$processUpdateArray$316(TLRPC$TL_updateChannel tLRPC$TL_updateChannel) {
        getChannelDifference(tLRPC$TL_updateChannel.channel_id, 1, 0L, null);
    }

    public void lambda$processUpdateArray$317(TLRPC$Chat tLRPC$Chat) {
        getNotificationCenter().postNotificationName(NotificationCenter.channelRightsUpdated, tLRPC$Chat);
    }

    public void lambda$processUpdateArray$318(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void lambda$processUpdateArray$319(int r44, java.util.ArrayList r45, androidx.collection.LongSparseArray r46, int r47, org.telegram.messenger.support.LongSparseIntArray r48, androidx.collection.LongSparseArray r49, androidx.collection.LongSparseArray r50, java.util.ArrayList r51, androidx.collection.LongSparseArray r52, androidx.collection.LongSparseArray r53, boolean r54, java.util.ArrayList r55, java.util.ArrayList r56, androidx.collection.LongSparseArray r57, androidx.collection.LongSparseArray r58, androidx.collection.LongSparseArray r59, java.util.ArrayList r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processUpdateArray$319(int, java.util.ArrayList, androidx.collection.LongSparseArray, int, org.telegram.messenger.support.LongSparseIntArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, java.util.ArrayList, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean, java.util.ArrayList, java.util.ArrayList, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, java.util.ArrayList):void");
    }

    public void lambda$processUpdateArray$321(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2, final SparseIntArray sparseIntArray, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2, final LongSparseArray longSparseArray3, final LongSparseIntArray longSparseIntArray3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdateArray$320(longSparseIntArray, longSparseIntArray2, sparseIntArray, longSparseArray, longSparseArray2, longSparseArray3, longSparseIntArray3);
            }
        });
    }

    public void lambda$processUpdateArray$320(org.telegram.messenger.support.LongSparseIntArray r20, org.telegram.messenger.support.LongSparseIntArray r21, android.util.SparseIntArray r22, androidx.collection.LongSparseArray r23, androidx.collection.LongSparseArray r24, androidx.collection.LongSparseArray r25, org.telegram.messenger.support.LongSparseIntArray r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processUpdateArray$320(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, android.util.SparseIntArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    public void lambda$processUpdateArray$322(long j, ArrayList arrayList) {
        getMessagesStorage().updateDialogsWithDeletedMessages(j, -j, arrayList, getMessagesStorage().markMessagesAsDeleted(j, arrayList, false, true, false), false);
    }

    public void lambda$processUpdateArray$323(long j, int i) {
        getMessagesStorage().updateDialogsWithDeletedMessages(j, -j, new ArrayList<>(), getMessagesStorage().markMessagesAsDeleted(j, i, false, true), false);
    }

    public void checkUnreadReactions(final long j, final SparseBooleanArray sparseBooleanArray) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkUnreadReactions$327(sparseBooleanArray, j);
            }
        });
    }

    public void lambda$checkUnreadReactions$327(SparseBooleanArray sparseBooleanArray, final long j) {
        boolean z;
        boolean z2;
        int i;
        final ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            int keyAt = sparseBooleanArray.keyAt(i2);
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(keyAt);
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        try {
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT message_id, state FROM reaction_mentions WHERE message_id IN (%s) AND dialog_id = %d", sb.toString(), Long.valueOf(j)), new Object[0]);
            while (queryFinalized.next()) {
                sparseBooleanArray2.put(queryFinalized.intValue(0), queryFinalized.intValue(1) == 1);
            }
            queryFinalized.dispose();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i4 < sparseBooleanArray.size()) {
            int keyAt2 = sparseBooleanArray.keyAt(i4);
            boolean valueAt = sparseBooleanArray.valueAt(i4);
            if (sparseBooleanArray2.indexOfKey(keyAt2) >= 0) {
                if (sparseBooleanArray2.get(keyAt2) != valueAt) {
                    i3 += valueAt ? 1 : -1;
                    z2 = z3;
                    z = true;
                } else {
                    z = z4;
                    z2 = z3;
                }
                i = i3;
            } else {
                i = i3;
                z = z4;
                z2 = true;
            }
            if (valueAt) {
                arrayList.add(Integer.valueOf(keyAt2));
            }
            try {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reaction_mentions VALUES(?, ?, ?)");
                executeFast.requery();
                executeFast.bindInteger(1, keyAt2);
                executeFast.bindInteger(2, valueAt ? 1 : 0);
                executeFast.bindLong(3, j);
                executeFast.step();
                executeFast.dispose();
            } catch (SQLiteException e2) {
                e2.printStackTrace();
            }
            i4++;
            i3 = i;
            z3 = z2;
            z4 = z;
        }
        if (z3) {
            TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs = new TLRPC$TL_messages_getPeerDialogs();
            TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
            tLRPC$TL_inputDialogPeer.peer = getInputPeer(j);
            tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkUnreadReactions$325(j, arrayList, tLObject, tLRPC$TL_error);
                }
            });
        } else if (z4) {
            final int i5 = i3;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkUnreadReactions$326(j, i5, arrayList);
                }
            });
        }
    }

    public void lambda$checkUnreadReactions$325(final long j, final ArrayList arrayList, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            final int i = tLRPC$TL_messages_peerDialogs.dialogs.size() == 0 ? 0 : tLRPC$TL_messages_peerDialogs.dialogs.get(0).unread_reactions_count;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkUnreadReactions$324(j, i, arrayList);
                }
            });
        }
    }

    public void lambda$checkUnreadReactions$324(long j, int i, ArrayList arrayList) {
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog == null) {
            getMessagesStorage().updateDialogUnreadReactions(j, i, false);
            return;
        }
        tLRPC$Dialog.unread_reactions_count = i;
        getMessagesStorage().updateUnreadReactionsCount(j, i);
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsUnreadReactionsCounterChanged, Long.valueOf(j), Integer.valueOf(i), arrayList);
    }

    public void lambda$checkUnreadReactions$326(long j, int i, ArrayList arrayList) {
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog == null) {
            getMessagesStorage().updateDialogUnreadReactions(j, i, true);
            return;
        }
        int i2 = tLRPC$Dialog.unread_reactions_count + i;
        tLRPC$Dialog.unread_reactions_count = i2;
        if (i2 < 0) {
            tLRPC$Dialog.unread_reactions_count = 0;
        }
        getMessagesStorage().updateUnreadReactionsCount(j, tLRPC$Dialog.unread_reactions_count);
        getNotificationCenter().postNotificationName(NotificationCenter.dialogsUnreadReactionsCounterChanged, Long.valueOf(j), Integer.valueOf(tLRPC$Dialog.unread_reactions_count), arrayList);
    }

    public boolean isDialogMuted(long j) {
        return isDialogMuted(j, null);
    }

    public boolean isDialogNotificationsSoundEnabled(long j) {
        SharedPreferences sharedPreferences = this.notificationsPreferences;
        return sharedPreferences.getBoolean("sound_enabled_" + j, true);
    }

    public boolean isDialogMuted(long j, TLRPC$Chat tLRPC$Chat) {
        Boolean bool;
        SharedPreferences sharedPreferences = this.notificationsPreferences;
        int i = sharedPreferences.getInt("notify2_" + j, -1);
        boolean z = false;
        if (i == -1) {
            if (tLRPC$Chat != null) {
                if (ChatObject.isChannel(tLRPC$Chat) && !tLRPC$Chat.megagroup) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            return !getNotificationsController().isGlobalNotificationsEnabled(j, bool);
        } else if (i == 2) {
            return true;
        } else {
            if (i == 3) {
                SharedPreferences sharedPreferences2 = this.notificationsPreferences;
                if (sharedPreferences2.getInt("notifyuntil_" + j, 0) >= getConnectionsManager().getCurrentTime()) {
                    return true;
                }
            }
            return false;
        }
    }

    public void markReactionsAsRead(long j) {
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog != null) {
            tLRPC$Dialog.unread_reactions_count = 0;
        }
        getMessagesStorage().updateUnreadReactionsCount(j, 0);
        TLRPC$TL_messages_readReactions tLRPC$TL_messages_readReactions = new TLRPC$TL_messages_readReactions();
        tLRPC$TL_messages_readReactions.peer = getInputPeer(j);
        getConnectionsManager().sendRequest(tLRPC$TL_messages_readReactions, MessagesController$$ExternalSyntheticLambda337.INSTANCE);
    }

    public ArrayList<MessageObject> getSponsoredMessages(final long j) {
        SponsoredMessagesInfo sponsoredMessagesInfo = this.sponsoredMessages.get(j);
        if (sponsoredMessagesInfo != null && (sponsoredMessagesInfo.loading || Math.abs(SystemClock.elapsedRealtime() - sponsoredMessagesInfo.loadTime) <= 300000)) {
            return sponsoredMessagesInfo.messages;
        }
        TLRPC$Chat chat = getChat(Long.valueOf(-j));
        if (!ChatObject.isChannel(chat)) {
            return null;
        }
        final SponsoredMessagesInfo sponsoredMessagesInfo2 = new SponsoredMessagesInfo();
        sponsoredMessagesInfo2.loading = true;
        this.sponsoredMessages.put(j, sponsoredMessagesInfo2);
        TLRPC$TL_channels_getSponsoredMessages tLRPC$TL_channels_getSponsoredMessages = new TLRPC$TL_channels_getSponsoredMessages();
        tLRPC$TL_channels_getSponsoredMessages.channel = getInputChannel(chat);
        getConnectionsManager().sendRequest(tLRPC$TL_channels_getSponsoredMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$getSponsoredMessages$331(j, sponsoredMessagesInfo2, tLObject, tLRPC$TL_error);
            }
        });
        return null;
    }

    public void lambda$getSponsoredMessages$331(final long j, final SponsoredMessagesInfo sponsoredMessagesInfo, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ArrayList arrayList = null;
        if (tLObject != null) {
            final TLRPC$TL_messages_sponsoredMessages tLRPC$TL_messages_sponsoredMessages = (TLRPC$TL_messages_sponsoredMessages) tLObject;
            if (!tLRPC$TL_messages_sponsoredMessages.messages.isEmpty()) {
                arrayList = new ArrayList();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getSponsoredMessages$329(tLRPC$TL_messages_sponsoredMessages);
                    }
                });
                LongSparseArray longSparseArray = new LongSparseArray();
                LongSparseArray longSparseArray2 = new LongSparseArray();
                for (int i = 0; i < tLRPC$TL_messages_sponsoredMessages.users.size(); i++) {
                    TLRPC$User tLRPC$User = tLRPC$TL_messages_sponsoredMessages.users.get(i);
                    longSparseArray.put(tLRPC$User.id, tLRPC$User);
                }
                for (int i2 = 0; i2 < tLRPC$TL_messages_sponsoredMessages.chats.size(); i2++) {
                    TLRPC$Chat tLRPC$Chat = tLRPC$TL_messages_sponsoredMessages.chats.get(i2);
                    longSparseArray2.put(tLRPC$Chat.id, tLRPC$Chat);
                }
                int i3 = -10000000;
                int size = tLRPC$TL_messages_sponsoredMessages.messages.size();
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC$TL_sponsoredMessage tLRPC$TL_sponsoredMessage = tLRPC$TL_messages_sponsoredMessages.messages.get(i4);
                    TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
                    tLRPC$TL_message.message = tLRPC$TL_sponsoredMessage.message;
                    if (!tLRPC$TL_sponsoredMessage.entities.isEmpty()) {
                        tLRPC$TL_message.entities = tLRPC$TL_sponsoredMessage.entities;
                        tLRPC$TL_message.flags |= ConnectionsManager.RequestFlagNeedQuickAck;
                    }
                    tLRPC$TL_message.peer_id = getPeer(j);
                    tLRPC$TL_message.from_id = tLRPC$TL_sponsoredMessage.from_id;
                    tLRPC$TL_message.flags |= 256;
                    tLRPC$TL_message.date = getConnectionsManager().getCurrentTime();
                    i3--;
                    tLRPC$TL_message.id = i3;
                    MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC$Message) tLRPC$TL_message, (LongSparseArray<TLRPC$User>) longSparseArray, (LongSparseArray<TLRPC$Chat>) longSparseArray2, true, true);
                    messageObject.sponsoredId = tLRPC$TL_sponsoredMessage.random_id;
                    messageObject.botStartParam = tLRPC$TL_sponsoredMessage.start_param;
                    messageObject.sponsoredChannelPost = tLRPC$TL_sponsoredMessage.channel_post;
                    messageObject.sponsoredChatInvite = tLRPC$TL_sponsoredMessage.chat_invite;
                    messageObject.sponsoredChatInviteHash = tLRPC$TL_sponsoredMessage.chat_invite_hash;
                    arrayList.add(messageObject);
                }
            }
        }
        final ArrayList arrayList2 = arrayList;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getSponsoredMessages$330(arrayList2, j, sponsoredMessagesInfo);
            }
        });
    }

    public void lambda$getSponsoredMessages$329(TLRPC$TL_messages_sponsoredMessages tLRPC$TL_messages_sponsoredMessages) {
        putUsers(tLRPC$TL_messages_sponsoredMessages.users, false);
        putChats(tLRPC$TL_messages_sponsoredMessages.chats, false);
    }

    public void lambda$getSponsoredMessages$330(ArrayList arrayList, long j, SponsoredMessagesInfo sponsoredMessagesInfo) {
        if (arrayList == null) {
            this.sponsoredMessages.remove(j);
            return;
        }
        sponsoredMessagesInfo.loadTime = SystemClock.elapsedRealtime();
        sponsoredMessagesInfo.messages = arrayList;
        getNotificationCenter().postNotificationName(NotificationCenter.didLoadSponsoredMessages, Long.valueOf(j), arrayList);
    }

    public TLRPC$TL_channels_sendAsPeers getSendAsPeers(final long j) {
        SendAsPeersInfo sendAsPeersInfo = this.sendAsPeers.get(j);
        if (sendAsPeersInfo != null && (sendAsPeersInfo.loading || Math.abs(SystemClock.elapsedRealtime() - sendAsPeersInfo.loadTime) <= 300000)) {
            return sendAsPeersInfo.sendAsPeers;
        }
        TLRPC$Chat chat = getChat(Long.valueOf(-j));
        if (chat != null && ChatObject.canSendAsPeers(chat)) {
            final SendAsPeersInfo sendAsPeersInfo2 = new SendAsPeersInfo();
            sendAsPeersInfo2.loading = true;
            this.sendAsPeers.put(j, sendAsPeersInfo2);
            TLRPC$TL_channels_getSendAs tLRPC$TL_channels_getSendAs = new TLRPC$TL_channels_getSendAs();
            tLRPC$TL_channels_getSendAs.peer = getInputPeer(j);
            getConnectionsManager().sendRequest(tLRPC$TL_channels_getSendAs, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$getSendAsPeers$334(j, sendAsPeersInfo2, tLObject, tLRPC$TL_error);
                }
            });
        }
        return null;
    }

    public void lambda$getSendAsPeers$334(final long j, final SendAsPeersInfo sendAsPeersInfo, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers = null;
        if (tLObject != null) {
            final TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers2 = (TLRPC$TL_channels_sendAsPeers) tLObject;
            if (!tLRPC$TL_channels_sendAsPeers2.peers.isEmpty()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getSendAsPeers$332(tLRPC$TL_channels_sendAsPeers2);
                    }
                });
                LongSparseArray longSparseArray = new LongSparseArray();
                LongSparseArray longSparseArray2 = new LongSparseArray();
                for (int i = 0; i < tLRPC$TL_channels_sendAsPeers2.users.size(); i++) {
                    TLRPC$User tLRPC$User = tLRPC$TL_channels_sendAsPeers2.users.get(i);
                    longSparseArray.put(tLRPC$User.id, tLRPC$User);
                }
                for (int i2 = 0; i2 < tLRPC$TL_channels_sendAsPeers2.chats.size(); i2++) {
                    TLRPC$Chat tLRPC$Chat = tLRPC$TL_channels_sendAsPeers2.chats.get(i2);
                    longSparseArray2.put(tLRPC$Chat.id, tLRPC$Chat);
                }
                tLRPC$TL_channels_sendAsPeers = tLRPC$TL_channels_sendAsPeers2;
            }
        }
        final TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers3 = tLRPC$TL_channels_sendAsPeers;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getSendAsPeers$333(tLRPC$TL_channels_sendAsPeers3, j, sendAsPeersInfo);
            }
        });
    }

    public void lambda$getSendAsPeers$332(TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers) {
        putUsers(tLRPC$TL_channels_sendAsPeers.users, false);
        putChats(tLRPC$TL_channels_sendAsPeers.chats, false);
    }

    public void lambda$getSendAsPeers$333(TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers, long j, SendAsPeersInfo sendAsPeersInfo) {
        if (tLRPC$TL_channels_sendAsPeers == null) {
            this.sendAsPeers.remove(j);
            return;
        }
        sendAsPeersInfo.loadTime = SystemClock.elapsedRealtime();
        sendAsPeersInfo.sendAsPeers = tLRPC$TL_channels_sendAsPeers;
        getNotificationCenter().postNotificationName(NotificationCenter.didLoadSendAsPeers, Long.valueOf(j), tLRPC$TL_channels_sendAsPeers);
    }

    public CharSequence getPrintingString(long j, int i, boolean z) {
        SparseArray<CharSequence> sparseArray;
        TLRPC$User user;
        TLRPC$UserStatus tLRPC$UserStatus;
        if ((!z || !DialogObject.isUserDialog(j) || (user = getUser(Long.valueOf(j))) == null || (tLRPC$UserStatus = user.status) == null || tLRPC$UserStatus.expires >= 0) && (sparseArray = this.printingStrings.get(j)) != null) {
            return sparseArray.get(i);
        }
        return null;
    }

    public Integer getPrintingStringType(long j, int i) {
        SparseArray<Integer> sparseArray = this.printingStringsTypes.get(j);
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    private boolean updatePrintingUsersWithNewMessages(long j, ArrayList<MessageObject> arrayList) {
        boolean z;
        if (j > 0) {
            if (this.printingUsers.get(Long.valueOf(j)) != null) {
                this.printingUsers.remove(Long.valueOf(j));
                return true;
            }
        } else if (j < 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<MessageObject> it = arrayList.iterator();
            while (it.hasNext()) {
                MessageObject next = it.next();
                if (next.isFromUser() && !arrayList2.contains(Long.valueOf(next.messageOwner.from_id.user_id))) {
                    arrayList2.add(Long.valueOf(next.messageOwner.from_id.user_id));
                }
            }
            ConcurrentHashMap<Integer, ArrayList<PrintingUser>> concurrentHashMap = this.printingUsers.get(Long.valueOf(j));
            if (concurrentHashMap != null) {
                ArrayList arrayList3 = null;
                z = false;
                for (Map.Entry<Integer, ArrayList<PrintingUser>> entry : concurrentHashMap.entrySet()) {
                    Integer key = entry.getKey();
                    ArrayList<PrintingUser> value = entry.getValue();
                    int i = 0;
                    while (i < value.size()) {
                        if (arrayList2.contains(Long.valueOf(value.get(i).userId))) {
                            value.remove(i);
                            i--;
                            if (value.isEmpty()) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(key);
                            }
                            z = true;
                        }
                        i++;
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        concurrentHashMap.remove(arrayList3.get(i2));
                    }
                    if (concurrentHashMap.isEmpty()) {
                        this.printingUsers.remove(Long.valueOf(j));
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean updateInterfaceWithMessages(final long r25, java.util.ArrayList<org.telegram.messenger.MessageObject> r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.updateInterfaceWithMessages(long, java.util.ArrayList, boolean):boolean");
    }

    public void lambda$updateInterfaceWithMessages$335(TLRPC$Dialog tLRPC$Dialog, int i, long j, int i2) {
        if (i2 != -1) {
            if (i2 != 0) {
                tLRPC$Dialog.folder_id = i2;
                sortDialogs(null);
                getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
            }
        } else if (i > 0 && !DialogObject.isEncryptedDialog(j)) {
            loadUnknownDialog(getInputPeer(j), 0L);
        }
    }

    public void addDialogAction(long j, boolean z) {
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog != null) {
            if (z) {
                this.clearingHistoryDialogs.put(j, tLRPC$Dialog);
            } else {
                this.deletingDialogs.put(j, tLRPC$Dialog);
                this.allDialogs.remove(tLRPC$Dialog);
                sortDialogs(null);
            }
            getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
        }
    }

    public void removeDialogAction(long j, boolean z, boolean z2) {
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog != null) {
            if (z) {
                this.clearingHistoryDialogs.remove(j);
            } else {
                this.deletingDialogs.remove(j);
                if (!z2) {
                    this.allDialogs.add(tLRPC$Dialog);
                    sortDialogs(null);
                }
            }
            if (!z2) {
                getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
            }
        }
    }

    public boolean isClearingDialog(long j) {
        return this.clearingHistoryDialogs.get(j) != null;
    }

    public void sortDialogs(androidx.collection.LongSparseArray<org.telegram.tgnet.TLRPC$Chat> r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.sortDialogs(androidx.collection.LongSparseArray):void");
    }

    private void addDialogToItsFolder(int i, TLRPC$Dialog tLRPC$Dialog) {
        int i2 = tLRPC$Dialog instanceof TLRPC$TL_dialogFolder ? 0 : tLRPC$Dialog.folder_id;
        ArrayList<TLRPC$Dialog> arrayList = this.dialogsByFolder.get(i2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.dialogsByFolder.put(i2, arrayList);
        }
        if (i == -1) {
            arrayList.add(tLRPC$Dialog);
        } else if (i != -2) {
            arrayList.add(i, tLRPC$Dialog);
        } else if (arrayList.isEmpty() || !(arrayList.get(0) instanceof TLRPC$TL_dialogFolder)) {
            arrayList.add(0, tLRPC$Dialog);
        } else {
            arrayList.add(1, tLRPC$Dialog);
        }
    }

    public static String getRestrictionReason(ArrayList<TLRPC$TL_restrictionReason> arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$TL_restrictionReason tLRPC$TL_restrictionReason = arrayList.get(i);
            if ("all".equals(tLRPC$TL_restrictionReason.platform) || (!BuildVars.isStandaloneApp() && !BuildVars.isBetaApp() && "android".equals(tLRPC$TL_restrictionReason.platform))) {
                return tLRPC$TL_restrictionReason.text;
            }
        }
        return null;
    }

    private static void showCantOpenAlert(BaseFragment baseFragment, String str) {
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity());
            builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
            builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
            builder.setMessage(str);
            baseFragment.showDialog(builder.create());
        }
    }

    public boolean checkCanOpenChat(Bundle bundle, BaseFragment baseFragment) {
        return checkCanOpenChat(bundle, baseFragment, null);
    }

    public boolean checkCanOpenChat(final Bundle bundle, final BaseFragment baseFragment, MessageObject messageObject) {
        TLRPC$Chat tLRPC$Chat;
        String str;
        TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages;
        if (!(bundle == null || baseFragment == null)) {
            long j = bundle.getLong("user_id", 0L);
            long j2 = bundle.getLong("chat_id", 0L);
            int i = bundle.getInt("message_id", 0);
            TLRPC$User tLRPC$User = null;
            if (j != 0) {
                tLRPC$User = getUser(Long.valueOf(j));
                tLRPC$Chat = null;
            } else {
                tLRPC$Chat = j2 != 0 ? getChat(Long.valueOf(j2)) : null;
            }
            if (tLRPC$User == null && tLRPC$Chat == null) {
                return true;
            }
            if (tLRPC$Chat != null) {
                str = getRestrictionReason(tLRPC$Chat.restriction_reason);
            } else {
                str = getRestrictionReason(tLRPC$User.restriction_reason);
            }
            if (str != null) {
                showCantOpenAlert(baseFragment, str);
                return false;
            } else if (!(i == 0 || messageObject == null || tLRPC$Chat == null || tLRPC$Chat.access_hash != 0)) {
                long dialogId = messageObject.getDialogId();
                if (!DialogObject.isEncryptedDialog(dialogId)) {
                    final AlertDialog alertDialog = new AlertDialog(baseFragment.getParentActivity(), 3);
                    if (dialogId < 0) {
                        tLRPC$Chat = getChat(Long.valueOf(-dialogId));
                    }
                    if (dialogId > 0 || !ChatObject.isChannel(tLRPC$Chat)) {
                        TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages2 = new TLRPC$TL_messages_getMessages();
                        tLRPC$TL_messages_getMessages2.id.add(Integer.valueOf(messageObject.getId()));
                        tLRPC$TL_messages_getMessages = tLRPC$TL_messages_getMessages2;
                    } else {
                        TLRPC$Chat chat = getChat(Long.valueOf(-dialogId));
                        TLRPC$TL_channels_getMessages tLRPC$TL_channels_getMessages = new TLRPC$TL_channels_getMessages();
                        tLRPC$TL_channels_getMessages.channel = getInputChannel(chat);
                        tLRPC$TL_channels_getMessages.id.add(Integer.valueOf(messageObject.getId()));
                        tLRPC$TL_messages_getMessages = tLRPC$TL_channels_getMessages;
                    }
                    final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$checkCanOpenChat$337(alertDialog, baseFragment, bundle, tLObject, tLRPC$TL_error);
                        }
                    });
                    alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            MessagesController.this.lambda$checkCanOpenChat$338(sendRequest, baseFragment, dialogInterface);
                        }
                    });
                    baseFragment.setVisibleDialog(alertDialog);
                    alertDialog.show();
                    return false;
                }
            }
        }
        return true;
    }

    public void lambda$checkCanOpenChat$337(final AlertDialog alertDialog, final BaseFragment baseFragment, final Bundle bundle, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkCanOpenChat$336(alertDialog, tLObject, baseFragment, bundle);
                }
            });
        }
    }

    public void lambda$checkCanOpenChat$336(AlertDialog alertDialog, TLObject tLObject, BaseFragment baseFragment, Bundle bundle) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
        putUsers(tLRPC$messages_Messages.users, false);
        putChats(tLRPC$messages_Messages.chats, false);
        getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
        baseFragment.presentFragment(new ChatActivity(bundle), true);
    }

    public void lambda$checkCanOpenChat$338(int i, BaseFragment baseFragment, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
        baseFragment.setVisibleDialog(null);
    }

    public static void openChatOrProfileWith(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, BaseFragment baseFragment, int i, boolean z) {
        String str;
        if ((tLRPC$User != null || tLRPC$Chat != null) && baseFragment != null) {
            if (tLRPC$Chat != null) {
                str = getRestrictionReason(tLRPC$Chat.restriction_reason);
            } else {
                str = getRestrictionReason(tLRPC$User.restriction_reason);
                if (i != 3 && tLRPC$User.bot) {
                    i = 1;
                    z = true;
                }
            }
            if (str != null) {
                showCantOpenAlert(baseFragment, str);
                return;
            }
            Bundle bundle = new Bundle();
            if (tLRPC$Chat != null) {
                bundle.putLong("chat_id", tLRPC$Chat.id);
            } else {
                bundle.putLong("user_id", tLRPC$User.id);
            }
            if (i == 0) {
                baseFragment.presentFragment(new ProfileActivity(bundle));
            } else if (i == 2) {
                baseFragment.presentFragment(new ChatActivity(bundle), true, true);
            } else {
                baseFragment.presentFragment(new ChatActivity(bundle), z);
            }
        }
    }

    public void openByUserName(java.lang.String r6, final org.telegram.ui.ActionBar.BaseFragment r7, final int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.openByUserName(java.lang.String, org.telegram.ui.ActionBar.BaseFragment, int):void");
    }

    public void lambda$openByUserName$340(final AlertDialog[] alertDialogArr, final BaseFragment baseFragment, final int i, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$openByUserName$339(alertDialogArr, baseFragment, tLRPC$TL_error, tLObject, i);
            }
        });
    }

    public void lambda$openByUserName$339(AlertDialog[] alertDialogArr, BaseFragment baseFragment, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, int i) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Exception unused) {
        }
        alertDialogArr[0] = null;
        baseFragment.setVisibleDialog(null);
        if (tLRPC$TL_error == null) {
            TLRPC$TL_contacts_resolvedPeer tLRPC$TL_contacts_resolvedPeer = (TLRPC$TL_contacts_resolvedPeer) tLObject;
            putUsers(tLRPC$TL_contacts_resolvedPeer.users, false);
            putChats(tLRPC$TL_contacts_resolvedPeer.chats, false);
            getMessagesStorage().putUsersAndChats(tLRPC$TL_contacts_resolvedPeer.users, tLRPC$TL_contacts_resolvedPeer.chats, false, true);
            if (!tLRPC$TL_contacts_resolvedPeer.chats.isEmpty()) {
                openChatOrProfileWith(null, tLRPC$TL_contacts_resolvedPeer.chats.get(0), baseFragment, 1, false);
            } else if (!tLRPC$TL_contacts_resolvedPeer.users.isEmpty()) {
                openChatOrProfileWith(tLRPC$TL_contacts_resolvedPeer.users.get(0), null, baseFragment, i, false);
            }
        } else if (baseFragment.getParentActivity() != null) {
            try {
                BulletinFactory.of(baseFragment).createErrorBulletin(LocaleController.getString("NoUsernameFound", R.string.NoUsernameFound)).show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void lambda$openByUserName$342(AlertDialog[] alertDialogArr, final int i, BaseFragment baseFragment) {
        if (alertDialogArr[0] != null) {
            alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    MessagesController.this.lambda$openByUserName$341(i, dialogInterface);
                }
            });
            baseFragment.showDialog(alertDialogArr[0]);
        }
    }

    public void lambda$openByUserName$341(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public void ensureMessagesLoaded(final long j, int i, final MessagesLoadedCallback messagesLoadedCallback) {
        int i2;
        SharedPreferences notificationsSettings = getNotificationsSettings(this.currentAccount);
        if (i == 0) {
            i2 = notificationsSettings.getInt("diditem" + j, 0);
        } else {
            i2 = i;
        }
        final int generateClassGuid = ConnectionsManager.generateClassGuid();
        final long j2 = DialogObject.isChatDialog(j) ? -j : 0L;
        if (j2 == 0 || getMessagesController().getChat(Long.valueOf(j2)) != null) {
            int i3 = AndroidUtilities.isTablet() ? 30 : 20;
            final int i4 = i3;
            final int i5 = i2;
            NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = new NotificationCenter.NotificationCenterDelegate() {
                {
                    MessagesController.this = this;
                }

                @Override
                public void didReceivedNotification(int i6, int i7, Object... objArr) {
                    int i8 = NotificationCenter.messagesDidLoadWithoutProcess;
                    if (i6 == i8 && ((Integer) objArr[0]).intValue() == generateClassGuid) {
                        int intValue = ((Integer) objArr[1]).intValue();
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
                        int intValue2 = ((Integer) objArr[4]).intValue();
                        int i9 = i4;
                        if (intValue >= i9 / 2 || booleanValue2 || !booleanValue) {
                            MessagesController.this.getNotificationCenter().removeObserver(this, i8);
                            MessagesController.this.getNotificationCenter().removeObserver(this, NotificationCenter.loadingMessagesFailed);
                            MessagesLoadedCallback messagesLoadedCallback2 = messagesLoadedCallback;
                            if (messagesLoadedCallback2 != null) {
                                messagesLoadedCallback2.onMessagesLoaded(booleanValue);
                                return;
                            }
                            return;
                        }
                        int i10 = i5;
                        if (i10 != 0) {
                            MessagesController.this.loadMessagesInternal(j, 0L, false, i9, i10, 0, false, 0, generateClassGuid, 3, intValue2, 0, 0, -1, 0, 0, 0, false, 0, true, false);
                        } else {
                            MessagesController.this.loadMessagesInternal(j, 0L, false, i9, i10, 0, false, 0, generateClassGuid, 2, intValue2, 0, 0, -1, 0, 0, 0, false, 0, true, false);
                        }
                    } else {
                        int i11 = NotificationCenter.loadingMessagesFailed;
                        if (i6 == i11 && ((Integer) objArr[0]).intValue() == generateClassGuid) {
                            MessagesController.this.getNotificationCenter().removeObserver(this, i8);
                            MessagesController.this.getNotificationCenter().removeObserver(this, i11);
                            MessagesLoadedCallback messagesLoadedCallback3 = messagesLoadedCallback;
                            if (messagesLoadedCallback3 != null) {
                                messagesLoadedCallback3.onError();
                            }
                        }
                    }
                }
            };
            getNotificationCenter().addObserver(notificationCenterDelegate, NotificationCenter.messagesDidLoadWithoutProcess);
            getNotificationCenter().addObserver(notificationCenterDelegate, NotificationCenter.loadingMessagesFailed);
            if (i2 != 0) {
                loadMessagesInternal(j, 0L, true, i3, i2, 0, true, 0, generateClassGuid, 3, 0, 0, 0, -1, 0, 0, 0, false, 0, true, false);
            } else {
                loadMessagesInternal(j, 0L, true, i3, i2, 0, true, 0, generateClassGuid, 2, 0, 0, 0, -1, 0, 0, 0, false, 0, true, false);
            }
        } else {
            final MessagesStorage messagesStorage = getMessagesStorage();
            final int i6 = i2;
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$ensureMessagesLoaded$344(messagesStorage, j2, j, i6, messagesLoadedCallback);
                }
            });
        }
    }

    public void lambda$ensureMessagesLoaded$344(MessagesStorage messagesStorage, long j, final long j2, final int i, final MessagesLoadedCallback messagesLoadedCallback) {
        final TLRPC$Chat chat = messagesStorage.getChat(j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$ensureMessagesLoaded$343(chat, j2, i, messagesLoadedCallback);
            }
        });
    }

    public void lambda$ensureMessagesLoaded$343(TLRPC$Chat tLRPC$Chat, long j, int i, MessagesLoadedCallback messagesLoadedCallback) {
        if (tLRPC$Chat != null) {
            getMessagesController().putChat(tLRPC$Chat, true);
            ensureMessagesLoaded(j, i, messagesLoadedCallback);
        } else if (messagesLoadedCallback != null) {
            messagesLoadedCallback.onError();
        }
    }

    public int getChatPendingRequestsOnClosed(long j) {
        SharedPreferences sharedPreferences = this.mainPreferences;
        return sharedPreferences.getInt("chatPendingRequests" + j, 0);
    }

    public void setChatPendingRequestsOnClose(long j, int i) {
        SharedPreferences.Editor edit = this.mainPreferences.edit();
        edit.putInt("chatPendingRequests" + j, i).apply();
    }

    public void deleteMessagesRange(final long j, final long j2, final int i, final int i2, boolean z, final Runnable runnable) {
        TLRPC$TL_messages_deleteHistory tLRPC$TL_messages_deleteHistory = new TLRPC$TL_messages_deleteHistory();
        tLRPC$TL_messages_deleteHistory.peer = getInputPeer(j);
        tLRPC$TL_messages_deleteHistory.flags = 12;
        tLRPC$TL_messages_deleteHistory.min_date = i;
        tLRPC$TL_messages_deleteHistory.max_date = i2;
        tLRPC$TL_messages_deleteHistory.revoke = z;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$deleteMessagesRange$348(j, i, i2, j2, runnable, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$deleteMessagesRange$348(final long j, final int i, final int i2, final long j2, final Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedHistory tLRPC$TL_messages_affectedHistory = (TLRPC$TL_messages_affectedHistory) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedHistory.pts, -1, tLRPC$TL_messages_affectedHistory.pts_count);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$deleteMessagesRange$346(j, i, i2, j2, runnable);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                runnable.run();
            }
        });
    }

    public void lambda$deleteMessagesRange$346(long j, int i, int i2, final long j2, final Runnable runnable) {
        final ArrayList<Integer> cachedMessagesInRange = getMessagesStorage().getCachedMessagesInRange(j, i, i2);
        getMessagesStorage().markMessagesAsDeleted(j, cachedMessagesInRange, false, true, false);
        getMessagesStorage().updateDialogsWithDeletedMessages(j, 0L, cachedMessagesInRange, null, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteMessagesRange$345(cachedMessagesInRange, j2, runnable);
            }
        });
    }

    public void lambda$deleteMessagesRange$345(ArrayList arrayList, long j, Runnable runnable) {
        getNotificationCenter().postNotificationName(NotificationCenter.messagesDeleted, arrayList, Long.valueOf(j), Boolean.FALSE);
        runnable.run();
    }

    public void setChatReactions(final long j, final List<String> list) {
        TLRPC$TL_messages_setChatAvailableReactions tLRPC$TL_messages_setChatAvailableReactions = new TLRPC$TL_messages_setChatAvailableReactions();
        tLRPC$TL_messages_setChatAvailableReactions.peer = getInputPeer(-j);
        tLRPC$TL_messages_setChatAvailableReactions.available_reactions.addAll(list);
        getConnectionsManager().sendRequest(tLRPC$TL_messages_setChatAvailableReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setChatReactions$350(j, list, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$setChatReactions$350(final long j, List list, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            TLRPC$ChatFull chatFull = getChatFull(j);
            if (chatFull != null) {
                if (chatFull instanceof TLRPC$TL_chatFull) {
                    chatFull.flags |= 262144;
                }
                if (chatFull instanceof TLRPC$TL_channelFull) {
                    chatFull.flags |= 1073741824;
                }
                chatFull.available_reactions = new ArrayList<>(list);
                getMessagesStorage().updateChatInfo(chatFull, false);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setChatReactions$349(j);
                }
            });
        }
    }

    public void lambda$setChatReactions$349(long j) {
        getNotificationCenter().postNotificationName(NotificationCenter.chatAvailableReactionsUpdated, Long.valueOf(j));
    }

    public void checkIsInChat(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, final IsInChatCheckedCallback isInChatCheckedCallback) {
        TLRPC$ChatParticipant tLRPC$ChatParticipant;
        ArrayList<TLRPC$ChatParticipant> arrayList;
        boolean z = false;
        if (tLRPC$Chat == null || tLRPC$User == null) {
            if (isInChatCheckedCallback != null) {
                isInChatCheckedCallback.run(false, null, null);
            }
        } else if (tLRPC$Chat.megagroup || ChatObject.isChannel(tLRPC$Chat)) {
            TLRPC$TL_channels_getParticipant tLRPC$TL_channels_getParticipant = new TLRPC$TL_channels_getParticipant();
            tLRPC$TL_channels_getParticipant.channel = getInputChannel(tLRPC$Chat.id);
            tLRPC$TL_channels_getParticipant.participant = getInputPeer(tLRPC$User);
            getConnectionsManager().sendRequest(tLRPC$TL_channels_getParticipant, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$checkIsInChat$351(MessagesController.IsInChatCheckedCallback.this, tLObject, tLRPC$TL_error);
                }
            });
        } else {
            TLRPC$ChatFull chatFull = getChatFull(tLRPC$Chat.id);
            if (chatFull != null) {
                TLRPC$ChatParticipants tLRPC$ChatParticipants = chatFull.participants;
                if (!(tLRPC$ChatParticipants == null || (arrayList = tLRPC$ChatParticipants.participants) == null)) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        tLRPC$ChatParticipant = chatFull.participants.participants.get(i);
                        if (tLRPC$ChatParticipant != null && tLRPC$ChatParticipant.user_id == tLRPC$User.id) {
                            break;
                        }
                    }
                }
                tLRPC$ChatParticipant = null;
                if (isInChatCheckedCallback != null) {
                    if (tLRPC$ChatParticipant != null) {
                        z = true;
                    }
                    TLRPC$ChatParticipants tLRPC$ChatParticipants2 = chatFull.participants;
                    isInChatCheckedCallback.run(z, (tLRPC$ChatParticipants2 == null || tLRPC$ChatParticipants2.admin_id != tLRPC$User.id) ? null : ChatRightsEditActivity.emptyAdminRights(true), null);
                }
            } else if (isInChatCheckedCallback != null) {
                isInChatCheckedCallback.run(false, null, null);
            }
        }
    }

    public static void lambda$checkIsInChat$351(IsInChatCheckedCallback isInChatCheckedCallback, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (isInChatCheckedCallback != null) {
            String str = null;
            TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLObject instanceof TLRPC$TL_channels_channelParticipant ? ((TLRPC$TL_channels_channelParticipant) tLObject).participant : null;
            boolean z = tLRPC$TL_error == null && tLRPC$ChannelParticipant != null && !tLRPC$ChannelParticipant.left;
            TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = tLRPC$ChannelParticipant != null ? tLRPC$ChannelParticipant.admin_rights : null;
            if (tLRPC$ChannelParticipant != null) {
                str = tLRPC$ChannelParticipant.rank;
            }
            isInChatCheckedCallback.run(z, tLRPC$TL_chatAdminRights, str);
        }
    }

    private void applySoundSettings(TLRPC$NotificationSound tLRPC$NotificationSound, SharedPreferences.Editor editor, long j, int i, boolean z) {
        String str;
        String str2;
        String str3;
        if (tLRPC$NotificationSound != null) {
            if (j != 0) {
                str = "sound_" + j;
                str3 = "sound_path_" + j;
                str2 = "sound_document_id_" + j;
            } else if (i == 0) {
                str = "GroupSound";
                str2 = "GroupSoundDocId";
                str3 = "GroupSoundPath";
            } else if (i == 1) {
                str = "GlobalSound";
                str2 = "GlobalSoundDocId";
                str3 = "GlobalSoundPath";
            } else {
                str = "ChannelSound";
                str2 = "ChannelSoundDocId";
                str3 = "ChannelSoundPath";
            }
            if (tLRPC$NotificationSound instanceof TLRPC$TL_notificationSoundDefault) {
                editor.putString(str, "Default");
                editor.putString(str3, "Default");
                editor.remove(str2);
            } else if (tLRPC$NotificationSound instanceof TLRPC$TL_notificationSoundNone) {
                editor.putString(str, "NoSound");
                editor.putString(str3, "NoSound");
                editor.remove(str2);
            } else if (tLRPC$NotificationSound instanceof TLRPC$TL_notificationSoundLocal) {
                TLRPC$TL_notificationSoundLocal tLRPC$TL_notificationSoundLocal = (TLRPC$TL_notificationSoundLocal) tLRPC$NotificationSound;
                editor.putString(str, tLRPC$TL_notificationSoundLocal.title);
                editor.putString(str3, tLRPC$TL_notificationSoundLocal.data);
                editor.remove(str2);
            } else if (tLRPC$NotificationSound instanceof TLRPC$TL_notificationSoundRingtone) {
                TLRPC$TL_notificationSoundRingtone tLRPC$TL_notificationSoundRingtone = (TLRPC$TL_notificationSoundRingtone) tLRPC$NotificationSound;
                editor.putLong(str2, tLRPC$TL_notificationSoundRingtone.id);
                getMediaDataController().checkRingtones();
                if (z && j != 0) {
                    editor.putBoolean("custom_" + j, true);
                }
                getMediaDataController().ringtoneDataStore.getDocument(tLRPC$TL_notificationSoundRingtone.id);
            }
        }
    }
}
