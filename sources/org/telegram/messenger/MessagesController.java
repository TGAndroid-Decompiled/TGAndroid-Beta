package org.telegram.messenger;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
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
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotInfo;
import org.telegram.tgnet.TLRPC$ChannelParticipant;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipant;
import org.telegram.tgnet.TLRPC$ChatParticipants;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$DialogPeer;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DraftMessage;
import org.telegram.tgnet.TLRPC$EmojiStatus;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputChannel;
import org.telegram.tgnet.TLRPC$InputChatPhoto;
import org.telegram.tgnet.TLRPC$InputDialogPeer;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputPhoto;
import org.telegram.tgnet.TLRPC$InputUser;
import org.telegram.tgnet.TLRPC$InputWallPaper;
import org.telegram.tgnet.TLRPC$JSONValue;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageReplies;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$PeerNotifySettings;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$Poll;
import org.telegram.tgnet.TLRPC$Reaction;
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
import org.telegram.tgnet.TLRPC$TL_account_updateEmojiStatus;
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
import org.telegram.tgnet.TLRPC$TL_channels_getChannelRecommendations;
import org.telegram.tgnet.TLRPC$TL_channels_getChannels;
import org.telegram.tgnet.TLRPC$TL_channels_getForumTopicsByID;
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
import org.telegram.tgnet.TLRPC$TL_channels_toggleForum;
import org.telegram.tgnet.TLRPC$TL_channels_toggleJoinRequest;
import org.telegram.tgnet.TLRPC$TL_channels_toggleJoinToSend;
import org.telegram.tgnet.TLRPC$TL_channels_togglePreHistoryHidden;
import org.telegram.tgnet.TLRPC$TL_channels_toggleSignatures;
import org.telegram.tgnet.TLRPC$TL_channels_toggleSlowMode;
import org.telegram.tgnet.TLRPC$TL_channels_updateUsername;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_chatChannelParticipant;
import org.telegram.tgnet.TLRPC$TL_chatFull;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_chatOnlines;
import org.telegram.tgnet.TLRPC$TL_chatReactionsAll;
import org.telegram.tgnet.TLRPC$TL_chatReactionsNone;
import org.telegram.tgnet.TLRPC$TL_chatReactionsSome;
import org.telegram.tgnet.TLRPC$TL_config;
import org.telegram.tgnet.TLRPC$TL_contacts_block;
import org.telegram.tgnet.TLRPC$TL_contacts_getBlocked;
import org.telegram.tgnet.TLRPC$TL_contacts_unblock;
import org.telegram.tgnet.TLRPC$TL_dialog;
import org.telegram.tgnet.TLRPC$TL_dialogFilterSuggested;
import org.telegram.tgnet.TLRPC$TL_dialogFolder;
import org.telegram.tgnet.TLRPC$TL_dialogPeer;
import org.telegram.tgnet.TLRPC$TL_documentEmpty;
import org.telegram.tgnet.TLRPC$TL_draftMessage;
import org.telegram.tgnet.TLRPC$TL_emojiStatusUntil;
import org.telegram.tgnet.TLRPC$TL_encryptedChat;
import org.telegram.tgnet.TLRPC$TL_encryptedChatRequested;
import org.telegram.tgnet.TLRPC$TL_encryptedChatWaiting;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_exportedContactToken;
import org.telegram.tgnet.TLRPC$TL_folder;
import org.telegram.tgnet.TLRPC$TL_folderPeer;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_groupCallDiscarded;
import org.telegram.tgnet.TLRPC$TL_help_appConfig;
import org.telegram.tgnet.TLRPC$TL_help_appConfigNotModified;
import org.telegram.tgnet.TLRPC$TL_help_dismissSuggestion;
import org.telegram.tgnet.TLRPC$TL_help_getAppConfig;
import org.telegram.tgnet.TLRPC$TL_help_getPeerColors;
import org.telegram.tgnet.TLRPC$TL_help_getPeerProfileColors;
import org.telegram.tgnet.TLRPC$TL_help_getRecentMeUrls;
import org.telegram.tgnet.TLRPC$TL_help_hidePromoData;
import org.telegram.tgnet.TLRPC$TL_help_peerColorOption;
import org.telegram.tgnet.TLRPC$TL_help_peerColorProfileSet;
import org.telegram.tgnet.TLRPC$TL_help_peerColorSet;
import org.telegram.tgnet.TLRPC$TL_help_peerColors;
import org.telegram.tgnet.TLRPC$TL_help_promoData;
import org.telegram.tgnet.TLRPC$TL_help_recentMeUrls;
import org.telegram.tgnet.TLRPC$TL_help_saveAppLog;
import org.telegram.tgnet.TLRPC$TL_help_termsOfServiceUpdate;
import org.telegram.tgnet.TLRPC$TL_help_termsOfServiceUpdateEmpty;
import org.telegram.tgnet.TLRPC$TL_inputAppEvent;
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
import org.telegram.tgnet.TLRPC$TL_inputWallPaper;
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
import org.telegram.tgnet.TLRPC$TL_messages_chatsSlice;
import org.telegram.tgnet.TLRPC$TL_messages_createChat;
import org.telegram.tgnet.TLRPC$TL_messages_deleteChat;
import org.telegram.tgnet.TLRPC$TL_messages_deleteChatUser;
import org.telegram.tgnet.TLRPC$TL_messages_deleteHistory;
import org.telegram.tgnet.TLRPC$TL_messages_deleteMessages;
import org.telegram.tgnet.TLRPC$TL_messages_deleteSavedHistory;
import org.telegram.tgnet.TLRPC$TL_messages_deleteScheduledMessages;
import org.telegram.tgnet.TLRPC$TL_messages_dialogs;
import org.telegram.tgnet.TLRPC$TL_messages_editChatAbout;
import org.telegram.tgnet.TLRPC$TL_messages_editChatAdmin;
import org.telegram.tgnet.TLRPC$TL_messages_editChatDefaultBannedRights;
import org.telegram.tgnet.TLRPC$TL_messages_editChatPhoto;
import org.telegram.tgnet.TLRPC$TL_messages_editChatTitle;
import org.telegram.tgnet.TLRPC$TL_messages_forumTopics;
import org.telegram.tgnet.TLRPC$TL_messages_getChats;
import org.telegram.tgnet.TLRPC$TL_messages_getDialogs;
import org.telegram.tgnet.TLRPC$TL_messages_getHistory;
import org.telegram.tgnet.TLRPC$TL_messages_getMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getMessagesViews;
import org.telegram.tgnet.TLRPC$TL_messages_getOnlines;
import org.telegram.tgnet.TLRPC$TL_messages_getPeerDialogs;
import org.telegram.tgnet.TLRPC$TL_messages_getPeerSettings;
import org.telegram.tgnet.TLRPC$TL_messages_getPinnedDialogs;
import org.telegram.tgnet.TLRPC$TL_messages_getReplies;
import org.telegram.tgnet.TLRPC$TL_messages_getSavedHistory;
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
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_toggleDialogPin;
import org.telegram.tgnet.TLRPC$TL_messages_toggleNoForwards;
import org.telegram.tgnet.TLRPC$TL_messages_unpinAllMessages;
import org.telegram.tgnet.TLRPC$TL_messages_updatePinnedMessage;
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
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
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
import org.telegram.tgnet.TLRPC$TL_updateChannelPinnedTopic;
import org.telegram.tgnet.TLRPC$TL_updateChannelPinnedTopics;
import org.telegram.tgnet.TLRPC$TL_updateChannelReadMessagesContents;
import org.telegram.tgnet.TLRPC$TL_updateChannelTooLong;
import org.telegram.tgnet.TLRPC$TL_updateChannelUserTyping;
import org.telegram.tgnet.TLRPC$TL_updateChannelViewForumAsMessages;
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
import org.telegram.tgnet.TLRPC$TL_username;
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
import org.telegram.tgnet.TLRPC$help_PeerColorSet;
import org.telegram.tgnet.TLRPC$messages_Chats;
import org.telegram.tgnet.TLRPC$messages_Dialogs;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.tgnet.TLRPC$messages_SponsoredMessages;
import org.telegram.tgnet.TLRPC$photos_Photos;
import org.telegram.tgnet.TLRPC$updates_ChannelDifference;
import org.telegram.tgnet.TLRPC$updates_Difference;
import org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_chatlistUpdates;
import org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_getChatlistUpdates;
import org.telegram.tgnet.tl.TL_chatlists$TL_exportedChatlistInvite;
import org.telegram.tgnet.tl.TL_chatlists$TL_inputChatlistDialogFilter;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatRightsEditActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.TopicsFragment;
public class MessagesController extends BaseController implements NotificationCenter.NotificationCenterDelegate {
    public static int DIALOG_FILTER_FLAG_BOTS = 16;
    public static int DIALOG_FILTER_FLAG_CHANNELS = 8;
    public static int DIALOG_FILTER_FLAG_CHATLIST = 512;
    public static int DIALOG_FILTER_FLAG_CHATLIST_ADMIN = 1024;
    public static int DIALOG_FILTER_FLAG_CONTACTS = 1;
    public static int DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED = 128;
    public static int DIALOG_FILTER_FLAG_EXCLUDE_MUTED = 32;
    public static int DIALOG_FILTER_FLAG_EXCLUDE_READ = 64;
    public static int DIALOG_FILTER_FLAG_GROUPS = 4;
    public static int DIALOG_FILTER_FLAG_NON_CONTACTS = 2;
    public static int DIALOG_FILTER_FLAG_ONLY_ARCHIVED = 256;
    public static final int LOAD_AROUND_DATE = 4;
    public static final int LOAD_AROUND_MESSAGE = 3;
    public static final int LOAD_BACKWARD = 0;
    public static final int LOAD_FORWARD = 1;
    public static final int LOAD_FROM_UNREAD = 2;
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
    public static int UPDATE_MASK_EMOJI_STATUS = 524288;
    public static int UPDATE_MASK_MESSAGE_TEXT = 32768;
    public static int UPDATE_MASK_NAME = 1;
    public static int UPDATE_MASK_NEW_MESSAGE = 2048;
    public static int UPDATE_MASK_PHONE = 1024;
    public static int UPDATE_MASK_REACTIONS_READ = 1048576;
    public static int UPDATE_MASK_READ_DIALOG_MESSAGE = 256;
    public static int UPDATE_MASK_REORDER = 131072;
    public static int UPDATE_MASK_SELECT_DIALOG = 512;
    public static int UPDATE_MASK_SEND_STATE = 4096;
    public static int UPDATE_MASK_STATUS = 4;
    public static int UPDATE_MASK_USER_PHONE = 128;
    public static int UPDATE_MASK_USER_PRINT = 64;
    private static volatile long lastPasswordCheckTime = 0;
    private static volatile long lastThemeCheckTime = 0;
    public static int stableIdPointer = 100;
    private int DIALOGS_LOAD_TYPE_CACHE;
    private int DIALOGS_LOAD_TYPE_CHANNEL;
    private int DIALOGS_LOAD_TYPE_UNKNOWN;
    public int aboutLengthLimitDefault;
    public int aboutLengthLimitPremium;
    private HashMap<Long, TLRPC$Chat> activeVoiceChatsMap;
    protected ArrayList<TLRPC$Dialog> allDialogs;
    public float animatedEmojisZoom;
    private final CacheFetcher<Integer, TLRPC$TL_help_appConfig> appConfigFetcher;
    public Set<String> authDomains;
    public int authorizationAutoconfirmPeriod;
    public boolean autoarchiveAvailable;
    public Set<String> autologinDomains;
    public String autologinToken;
    public int availableMapProviders;
    public boolean backgroundConnection;
    public LongSparseIntArray blockePeers;
    public boolean blockedCountry;
    public boolean blockedEndReached;
    public int boostsChannelLevelMax;
    public long boostsPerSentGift;
    private CacheByChatsController cacheByChatsController;
    private HashMap<Long, ChannelRecommendations> cachedChannelRecommendations;
    private TLRPC$TL_exportedContactToken cachedContactToken;
    public int callConnectTimeout;
    public int callPacketTimeout;
    public int callReceiveTimeout;
    public int callRingTimeout;
    public boolean canRevokePmInbox;
    public int captionLengthLimitDefault;
    public int captionLengthLimitPremium;
    private LongSparseArray<LongSparseArray<TLRPC$ChannelParticipant>> channelAdmins;
    public int channelBgIconLevelMin;
    private ChannelBoostsController channelBoostsControler;
    public int channelCustomWallpaperLevelMin;
    public int channelEmojiStatusLevelMin;
    public int channelProfileIconLevelMin;
    private LongSparseArray<ArrayList<Integer>> channelViewsToSend;
    public int channelWallpaperLevelMin;
    public int channelsLimitDefault;
    public int channelsLimitPremium;
    private LongSparseIntArray channelsPts;
    public int chatReadMarkExpirePeriod;
    public int chatReadMarkSizeThreshold;
    private SparseArray<ChatlistUpdatesStat> chatlistFoldersUpdates;
    public int chatlistInvitesLimitDefault;
    public int chatlistInvitesLimitPremium;
    public int chatlistJoinedLimitDefault;
    public int chatlistJoinedLimitPremium;
    private int chatlistUpdatePeriod;
    private ConcurrentHashMap<Long, TLRPC$Chat> chats;
    public int checkResetLangpack;
    private LongSparseArray<Boolean> checkingLastMessagesDialogs;
    private boolean checkingPromoInfo;
    private int checkingPromoInfoRequestId;
    private boolean checkingTosUpdate;
    private LongSparseArray<TLRPC$Dialog> clearingHistoryDialogs;
    public boolean collectDeviceStats;
    private ArrayList<Long> createdDialogIds;
    private ArrayList<Long> createdDialogMainThreadIds;
    private ArrayList<Long> createdScheduledDialogIds;
    private Runnable currentDeleteTaskRunnable;
    private LongSparseArray<ArrayList<Integer>> currentDeletingTaskMediaMids;
    private LongSparseArray<ArrayList<Integer>> currentDeletingTaskMids;
    private int currentDeletingTaskTime;
    public String dcDomainName;
    public LongSparseIntArray deletedHistory;
    private LongSparseArray<TLRPC$Dialog> deletingDialogs;
    private Comparator<TLRPC$Dialog> dialogComparator;
    private final Comparator<TLRPC$Dialog> dialogDateComparator;
    public ArrayList<DialogFilter> dialogFilters;
    public SparseArray<DialogFilter> dialogFiltersById;
    public int dialogFiltersChatsLimitDefault;
    public int dialogFiltersChatsLimitPremium;
    public int dialogFiltersLimitDefault;
    public int dialogFiltersLimitPremium;
    public boolean dialogFiltersLoaded;
    public int dialogFiltersPinnedLimitDefault;
    public int dialogFiltersPinnedLimitPremium;
    public LongSparseArray<ArrayList<MessageObject>> dialogMessage;
    public SparseArray<MessageObject> dialogMessagesByIds;
    public LongSparseArray<MessageObject> dialogMessagesByRandomIds;
    private LongSparseArray<DialogPhotos> dialogPhotos;
    public SparseArray<ArrayList<TLRPC$Dialog>> dialogsByFolder;
    public ArrayList<TLRPC$Dialog> dialogsCanAddUsers;
    public ArrayList<TLRPC$Dialog> dialogsChannelsOnly;
    private SparseBooleanArray dialogsEndReached;
    public ArrayList<TLRPC$Dialog> dialogsForBlock;
    public ArrayList<TLRPC$Dialog> dialogsForward;
    public ArrayList<TLRPC$Dialog> dialogsGroupsOnly;
    private boolean dialogsInTransaction;
    public boolean dialogsLoaded;
    private int dialogsLoadedTillDate;
    public ArrayList<TLRPC$Dialog> dialogsMyChannels;
    public ArrayList<TLRPC$Dialog> dialogsMyGroups;
    public ArrayList<TLRPC$Dialog> dialogsServerOnly;
    public ArrayList<TLRPC$Dialog> dialogsUsersOnly;
    public LongSparseArray<TLRPC$Dialog> dialogs_dict;
    public ConcurrentHashMap<Long, Integer> dialogs_read_inbox_max;
    public ConcurrentHashMap<Long, Integer> dialogs_read_outbox_max;
    public HashSet<String> diceEmojies;
    public HashMap<String, DiceFrameSuccess> diceSuccess;
    public List<String> directPaymentsCurrency;
    public HashMap<Long, ArrayList<TLRPC$TL_sendMessageEmojiInteraction>> emojiInteractions;
    private SharedPreferences emojiPreferences;
    public HashMap<String, EmojiSound> emojiSounds;
    private LongSparseArray<Integer> emojiStatusUntilValues;
    public boolean enableJoined;
    private ConcurrentHashMap<Integer, TLRPC$EncryptedChat> encryptedChats;
    public Set<String> exportGroupUri;
    public Set<String> exportPrivateUri;
    public Set<String> exportUri;
    private LongSparseArray<TLRPC$TL_chatInviteExported> exportedChats;
    public ArrayList<FaqSearchResult> faqSearchArray;
    public TLRPC$WebPage faqWebPage;
    public boolean filtersEnabled;
    public boolean firstGettingTask;
    public int forumUpgradeParticipantsMin;
    public ArrayList<DialogFilter> frozenDialogFilters;
    private LongSparseArray<TLRPC$ChatFull> fullChats;
    private LongSparseArray<TLRPC$UserFull> fullUsers;
    private boolean getDifferenceFirstSync;
    public boolean getfileExperimentalParams;
    private LongSparseArray<Boolean> gettingChatInviters;
    public boolean gettingDifference;
    private LongSparseArray<Boolean> gettingDifferenceChannels;
    private boolean gettingNewDeleteTask;
    private LongSparseArray<Boolean> gettingUnknownChannels;
    private LongSparseArray<Boolean> gettingUnknownDialogs;
    public String gifSearchBot;
    public ArrayList<String> gifSearchEmojies;
    public boolean giftAttachMenuIcon;
    public boolean giftTextFieldIcon;
    public long giveawayAddPeersMax;
    public long giveawayBoostsPerPremium;
    public long giveawayCountriesMax;
    public boolean giveawayGiftsPurchaseAvailable;
    public long giveawayPeriodMax;
    public int groupCallVideoMaxParticipants;
    private LongSparseArray<ChatObject.Call> groupCalls;
    private LongSparseArray<ChatObject.Call> groupCallsByChatId;
    private boolean hasArchivedChats;
    private boolean hasStories;
    public int hiddenMembersGroupSizeMin;
    public ArrayList<Long> hiddenUndoChats;
    public ArrayList<TLRPC$RecentMeUrl> hintDialogs;
    public volatile boolean ignoreSetOnline;
    public String imageSearchBot;
    private String installReferer;
    private boolean isLeftPromoChannel;
    private ArrayList<Long> joiningToChannels;
    public boolean keepAliveService;
    public int largeQueueMaxActiveOperations;
    private int lastCheckPromoId;
    public int lastKnownSessionsCount;
    private int lastPrintingStringCount;
    private long lastPushRegisterSendTime;
    private LongSparseArray<Long> lastSavedServerQueryTime;
    private LongSparseArray<Long> lastScheduledServerQueryTime;
    private LongSparseArray<Long> lastServerQueryTime;
    private long lastStatusUpdateTime;
    private long lastViewsCheckTime;
    public String linkPrefix;
    public LongSparseLongArray loadedFullChats;
    private HashSet<Long> loadedFullParticipants;
    private LongSparseLongArray loadedFullUsers;
    public boolean loadingBlockedPeers;
    private LongSparseIntArray loadingChannelAdmins;
    private SparseBooleanArray loadingDialogs;
    private HashSet<Long> loadingFullChats;
    private HashSet<Long> loadingFullParticipants;
    private HashSet<Long> loadingFullUsers;
    private HashSet<Long> loadingGroupCalls;
    private int loadingNotificationSettings;
    private boolean loadingNotificationSignUpSettings;
    private LongSparseArray<Boolean> loadingPeerSettings;
    private SparseIntArray loadingPinnedDialogs;
    private boolean loadingRemoteFilters;
    private boolean loadingSuggestedFilters;
    private boolean loadingUnreadDialogs;
    private boolean loggedDeviceStats;
    private SharedPreferences mainPreferences;
    public String mapKey;
    public int mapProvider;
    public int maxBroadcastCount;
    public int maxCaptionLength;
    public int maxEditTime;
    public int maxFaveStickersCount;
    public int maxFolderPinnedDialogsCountDefault;
    public int maxFolderPinnedDialogsCountPremium;
    public int maxGroupCount;
    public int maxMegagroupCount;
    public int maxMessageLength;
    public int maxPinnedDialogsCountDefault;
    public int maxPinnedDialogsCountPremium;
    public int maxRecentGifsCount;
    public int maxRecentStickersCount;
    private SparseIntArray migratedChats;
    private boolean migratingDialogs;
    public int minGroupConvertSize;
    private LongSparseArray<ArrayList<Integer>> needShortPollChannels;
    private LongSparseArray<ArrayList<Integer>> needShortPollOnlines;
    public NewMessageCallback newMessageCallback;
    private SparseIntArray nextDialogsCacheOffset;
    private int nextPromoInfoCheckTime;
    private int nextTosCheckTime;
    private SharedPreferences notificationsPreferences;
    private final Runnable notifyTranscriptionAudioCooldownUpdate;
    private ConcurrentHashMap<String, TLObject> objectsByUsernames;
    private boolean offlineSent;
    private Utilities.Callback<Boolean> onLoadedRemoteFilters;
    public ConcurrentHashMap<Long, Integer> onlinePrivacy;
    private Runnable passwordCheckRunnable;
    public PeerColors peerColors;
    private final long peerDialogRequestTimeout;
    private final LongSparseArray<Long> peerDialogsRequested;
    public Set<String> pendingSuggestions;
    private LongSparseIntArray pendingUnreadCounter;
    public SparseArray<ImageUpdater> photoSuggestion;
    private LongSparseArray<SparseArray<MessageObject>> pollsToCheck;
    private int pollsToCheckSize;
    public boolean preloadFeaturedStickers;
    public String premiumBotUsername;
    public SparseIntArray premiumFeaturesTypesToPosition;
    public String premiumInvoiceSlug;
    public boolean premiumLocked;
    public LongSparseArray<LongSparseArray<CharSequence>> printingStrings;
    public LongSparseArray<LongSparseArray<Integer>> printingStringsTypes;
    public ConcurrentHashMap<Long, ConcurrentHashMap<Integer, ArrayList<PrintingUser>>> printingUsers;
    public PeerColors profilePeerColors;
    private TLRPC$Dialog promoDialog;
    private long promoDialogId;
    public int promoDialogType;
    public String promoPsaMessage;
    public String promoPsaType;
    private String proxyDialogAddress;
    public int publicLinksLimitDefault;
    public int publicLinksLimitPremium;
    public boolean qrLoginCamera;
    public int quoteLengthMax;
    public int ratingDecay;
    public int reactionsInChatMax;
    public int reactionsUserMaxDefault;
    public int reactionsUserMaxPremium;
    private ArrayList<ReadTask> readTasks;
    private LongSparseArray<ReadTask> readTasksMap;
    private Runnable recentEmojiStatusUpdateRunnable;
    private long recentEmojiStatusUpdateRunnableTime;
    private long recentEmojiStatusUpdateRunnableTimeout;
    public int recommendedChannelsLimitDefault;
    public int recommendedChannelsLimitPremium;
    public boolean registeringForPush;
    private LongSparseArray<ArrayList<Integer>> reloadingMessages;
    private HashMap<String, ArrayList<MessageObject>> reloadingSavedWebpages;
    private LongSparseArray<ArrayList<MessageObject>> reloadingSavedWebpagesPending;
    private HashMap<String, ArrayList<MessageObject>> reloadingScheduledWebpages;
    private LongSparseArray<ArrayList<MessageObject>> reloadingScheduledWebpagesPending;
    private HashMap<String, ArrayList<MessageObject>> reloadingWebpages;
    private LongSparseArray<ArrayList<MessageObject>> reloadingWebpagesPending;
    public boolean remoteConfigLoaded;
    private ArrayList<ReadTask> repliesReadTasks;
    private boolean requestingContactToken;
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
    public int savedDialogsPinnedLimitDefault;
    public int savedDialogsPinnedLimitPremium;
    public int savedGifsLimitDefault;
    public int savedGifsLimitPremium;
    public SavedMessagesController savedMessagesController;
    public int secretWebpagePreview;
    public DialogFilter[] selectedDialogFilter;
    private LongSparseArray<SendAsPeersInfo> sendAsPeers;
    public LongSparseArray<LongSparseArray<Boolean>>[] sendingTypings;
    private SparseBooleanArray serverDialogsEndReached;
    private LongSparseIntArray shortPollChannels;
    private LongSparseIntArray shortPollOnlines;
    public boolean showFiltersTooltip;
    public int smallQueueMaxActiveOperations;
    private DialogFilter sortingDialogFilter;
    private LongSparseArray<SponsoredMessagesInfo> sponsoredMessages;
    private int statusRequest;
    private int statusSettingState;
    public int stealthModeCooldown;
    public int stealthModeFuture;
    public int stealthModePast;
    public int stickersFavedLimitDefault;
    public int stickersFavedLimitPremium;
    public long storiesChangelogUserId;
    public StoriesController storiesController;
    public String storiesEntities;
    public boolean storiesExportNopublicLink;
    public String storiesPosting;
    public int storiesSentMonthlyLimitDefault;
    public int storiesSentMonthlyLimitPremium;
    public int storiesSentWeeklyLimitDefault;
    public int storiesSentWeeklyLimitPremium;
    public int storiesSuggestedReactionsLimitDefault;
    public int storiesSuggestedReactionsLimitPremium;
    public int storyCaptionLengthLimitDefault;
    public int storyCaptionLengthLimitPremium;
    public int storyExpiringLimitDefault;
    public int storyExpiringLimitPremium;
    public String storyVenueSearchBot;
    public boolean suggestContacts;
    public boolean suggestStickersApiOnly;
    public ArrayList<TLRPC$TL_dialogFilterSuggested> suggestedFilters;
    public String suggestedLangCode;
    public int telegramAntispamGroupSizeMin;
    public long telegramAntispamUserId;
    private Runnable themeCheckRunnable;
    private HashMap<String, ReadTask> threadsReadTasksMap;
    private TopicsController topicsController;
    public int topicsPinnedLimit;
    public int totalBlockedCount;
    public int transcribeAudioTrialCooldownUntil;
    public int transcribeAudioTrialCurrentNumber;
    public int transcribeAudioTrialDurationMax;
    public int transcribeAudioTrialWeeklyNumber;
    public int transcribeButtonPressed;
    private TranslateController translateController;
    public UnconfirmedAuthController unconfirmedAuthController;
    public int unreadUnmutedDialogs;
    public int updateCheckDelay;
    private Comparator<TLRPC$Update> updatesComparator;
    private LongSparseArray<ArrayList<TLRPC$Updates>> updatesQueueChannels;
    private ArrayList<TLRPC$Updates> updatesQueuePts;
    private ArrayList<TLRPC$Updates> updatesQueueQts;
    private ArrayList<TLRPC$Updates> updatesQueueSeq;
    private LongSparseLongArray updatesStartWaitTimeChannels;
    private long updatesStartWaitTimePts;
    private long updatesStartWaitTimeQts;
    private long updatesStartWaitTimeSeq;
    public boolean updatingState;
    public boolean uploadMarkupVideo;
    public int uploadMaxFileParts;
    public int uploadMaxFilePartsPremium;
    private String uploadingAvatar;
    private HashMap<String, Object> uploadingThemes;
    public String uploadingWallpaper;
    public Theme.OverrideWallpaperInfo uploadingWallpaperInfo;
    private UserNameResolver userNameResolver;
    private ConcurrentHashMap<Long, TLRPC$User> users;
    public String venueSearchBot;
    private ArrayList<Long> visibleDialogMainThreadIds;
    private ArrayList<Long> visibleScheduledDialogMainThreadIds;
    public int webFileDatacenterId;
    public String youtubePipType;
    public static int UPDATE_MASK_ALL = (((((((((2 | 4) | 1) | 8) | 16) | 32) | 64) | 128) | LiteMode.FLAG_CHAT_BLUR) | 1024) | FileLoaderPriorityQueue.PRIORITY_VALUE_MAX;
    public static int DIALOG_FILTER_FLAG_ALL_CHATS = (((1 | 2) | 4) | 8) | 16;
    private static volatile MessagesController[] Instance = new MessagesController[4];
    private static final Object[] lockObjects = new Object[4];

    public interface ErrorDelegate {
        boolean run(TLRPC$TL_error tLRPC$TL_error);
    }

    public interface IsInChatCheckedCallback {
        void run(boolean z, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, String str);
    }

    public interface MessagesLoadedCallback {
        void onError();

        void onMessagesLoaded(boolean z);
    }

    public interface NewMessageCallback {
        boolean onMessageReceived(TLRPC$Message tLRPC$Message);
    }

    public static class PrintingUser {
        public TLRPC$SendMessageAction action;
        public long lastTime;
        public long userId;
    }

    public static void lambda$blockPeer$80(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$completeReadTask$214(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$completeReadTask$216(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$deleteParticipantFromChat$271(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$deleteParticipantFromChat$274(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$deleteUserPhoto$106(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$hidePeerSettingsBar$66(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$hidePromoDialog$120(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$installTheme$108(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$installTheme$109(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$logDeviceStats$26(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$markMentionMessageAsRead$210(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$markMentionsAsRead$218(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$markMessageContentAsRead$208(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$markReactionsAsRead$375(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$processUpdates$342(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$removeSuggestion$33(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$reportSpam$67(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$reportSpam$68(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$reportSpam$69(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$saveTheme$107(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$unregistedPush$280(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void markSponsoredAsRead(long j, MessageObject messageObject) {
    }

    public static TLRPC$Peer getPeerFromInputPeer(TLRPC$InputPeer tLRPC$InputPeer) {
        if (tLRPC$InputPeer.chat_id != 0) {
            TLRPC$TL_peerChat tLRPC$TL_peerChat = new TLRPC$TL_peerChat();
            tLRPC$TL_peerChat.chat_id = tLRPC$InputPeer.chat_id;
            return tLRPC$TL_peerChat;
        } else if (tLRPC$InputPeer.channel_id != 0) {
            TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
            tLRPC$TL_peerChannel.channel_id = tLRPC$InputPeer.channel_id;
            return tLRPC$TL_peerChannel;
        } else {
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            tLRPC$TL_peerUser.user_id = tLRPC$InputPeer.user_id;
            return tLRPC$TL_peerUser;
        }
    }

    public ChannelBoostsController getBoostsController() {
        ChannelBoostsController channelBoostsController = this.channelBoostsControler;
        if (channelBoostsController != null) {
            return channelBoostsController;
        }
        synchronized (lockObjects[this.currentAccount]) {
            ChannelBoostsController channelBoostsController2 = this.channelBoostsControler;
            if (channelBoostsController2 != null) {
                return channelBoostsController2;
            }
            ChannelBoostsController channelBoostsController3 = new ChannelBoostsController(this.currentAccount);
            this.channelBoostsControler = channelBoostsController3;
            return channelBoostsController3;
        }
    }

    public class ChatlistUpdatesStat {
        long lastRequestTime;
        TL_chatlists$TL_chatlists_chatlistUpdates lastValue;
        boolean loading;

        public ChatlistUpdatesStat() {
            MessagesController.this = r1;
            this.loading = false;
            this.loading = true;
        }

        public ChatlistUpdatesStat(TL_chatlists$TL_chatlists_chatlistUpdates tL_chatlists$TL_chatlists_chatlistUpdates) {
            MessagesController.this = r3;
            this.loading = false;
            this.lastRequestTime = System.currentTimeMillis();
            this.lastValue = tL_chatlists$TL_chatlists_chatlistUpdates;
        }
    }

    public void lambda$new$0() {
        getUserConfig().checkSavedPassword();
    }

    public ArrayList<DialogFilter> getDialogFilters() {
        ArrayList<DialogFilter> arrayList = this.frozenDialogFilters;
        return arrayList != null ? arrayList : this.dialogFilters;
    }

    public class AnonymousClass1 extends CacheFetcher<Integer, TLRPC$TL_help_appConfig> {
        @Override
        public boolean useCache(Integer num) {
            return false;
        }

        AnonymousClass1() {
            MessagesController.this = r1;
        }

        @Override
        public void getRemote(int i, Integer num, long j, final Utilities.Callback4<Boolean, TLRPC$TL_help_appConfig, Long, Boolean> callback4) {
            TLRPC$TL_help_getAppConfig tLRPC$TL_help_getAppConfig = new TLRPC$TL_help_getAppConfig();
            tLRPC$TL_help_getAppConfig.hash = (int) j;
            MessagesController.this.getConnectionsManager().sendRequest(tLRPC$TL_help_getAppConfig, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.AnonymousClass1.lambda$getRemote$0(Utilities.Callback4.this, tLObject, tLRPC$TL_error);
                }
            });
        }

        public static void lambda$getRemote$0(Utilities.Callback4 callback4, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            String str;
            int i;
            TLRPC$TL_help_appConfig tLRPC$TL_help_appConfig;
            if (tLObject instanceof TLRPC$TL_help_appConfigNotModified) {
                Boolean bool = Boolean.TRUE;
                callback4.run(bool, null, 0L, bool);
            } else if (tLObject instanceof TLRPC$TL_help_appConfig) {
                callback4.run(Boolean.FALSE, (TLRPC$TL_help_appConfig) tLObject, Long.valueOf(tLRPC$TL_help_appConfig.hash), Boolean.TRUE);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("getting appconfig error ");
                if (tLRPC$TL_error != null) {
                    str = tLRPC$TL_error.code + " " + tLRPC$TL_error.text;
                } else {
                    str = "";
                }
                sb.append(str);
                FileLog.e(sb.toString());
                callback4.run(Boolean.FALSE, null, 0L, Boolean.valueOf(tLRPC$TL_error == null || !((i = tLRPC$TL_error.code) == -2000 || i == -2001)));
            }
        }

        @Override
        public void getLocal(final int i, Integer num, final Utilities.Callback2<Long, TLRPC$TL_help_appConfig> callback2) {
            MessagesController.this.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.AnonymousClass1.lambda$getLocal$1(i, callback2);
                }
            });
        }

        public static void lambda$getLocal$1(int r7, org.telegram.messenger.Utilities.Callback2 r8) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.AnonymousClass1.lambda$getLocal$1(int, org.telegram.messenger.Utilities$Callback2):void");
        }

        @Override
        public void setLocal(final int i, Integer num, final TLRPC$TL_help_appConfig tLRPC$TL_help_appConfig, long j) {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.AnonymousClass1.lambda$setLocal$2(i, tLRPC$TL_help_appConfig);
                }
            });
        }

        public static void lambda$setLocal$2(int i, TLRPC$TL_help_appConfig tLRPC$TL_help_appConfig) {
            try {
                SQLiteDatabase database = MessagesStorage.getInstance(i).getDatabase();
                if (database != null) {
                    database.executeFast("DELETE FROM app_config").stepThis().dispose();
                    if (tLRPC$TL_help_appConfig != null) {
                        SQLitePreparedStatement executeFast = database.executeFast("INSERT INTO app_config VALUES(?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_help_appConfig.getObjectSize());
                        tLRPC$TL_help_appConfig.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public boolean premiumFeaturesBlocked() {
        return this.premiumLocked && !getUserConfig().isPremium();
    }

    public boolean premiumPurchaseBlocked() {
        return this.premiumLocked;
    }

    public void getNextReactionMention(final long j, final long j2, final int i, final Consumer<Integer> consumer) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getNextReactionMention$5(j2, j, consumer, i);
            }
        });
    }

    public void lambda$getNextReactionMention$5(long r13, long r15, final androidx.core.util.Consumer r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getNextReactionMention$5(long, long, androidx.core.util.Consumer, int):void");
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
        if (tLRPC$TL_error != null && tLRPC$messages_Messages != null && (arrayList = tLRPC$messages_Messages.messages) != null && !arrayList.isEmpty()) {
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

    public void updatePremium(boolean z) {
        if (this.dialogFilters.isEmpty()) {
            return;
        }
        if (!z) {
            if (!this.dialogFilters.get(0).isDefault()) {
                int i = 1;
                while (true) {
                    if (i >= this.dialogFilters.size()) {
                        break;
                    } else if (this.dialogFilters.get(i).isDefault()) {
                        this.dialogFilters.add(0, this.dialogFilters.remove(i));
                        break;
                    } else {
                        i++;
                    }
                }
            }
            lockFiltersInternal();
        } else {
            for (int i2 = 0; i2 < this.dialogFilters.size(); i2++) {
                this.dialogFilters.get(i2).locked = false;
            }
        }
        getMessagesStorage().saveDialogFiltersOrder();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        getStoriesController().onPremiumChanged();
    }

    public void lockFiltersInternal() {
        boolean z;
        if (getUserConfig().isPremium() || this.dialogFilters.size() - 1 <= this.dialogFiltersLimitDefault) {
            z = false;
        } else {
            int size = (this.dialogFilters.size() - 1) - this.dialogFiltersLimitDefault;
            ArrayList arrayList = new ArrayList(this.dialogFilters);
            Collections.reverse(arrayList);
            z = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (i < size) {
                    if (!((DialogFilter) arrayList.get(i)).locked) {
                        z = true;
                    }
                    ((DialogFilter) arrayList.get(i)).locked = true;
                } else {
                    if (((DialogFilter) arrayList.get(i)).locked) {
                        z = true;
                    }
                    ((DialogFilter) arrayList.get(i)).locked = false;
                }
            }
        }
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        }
    }

    public int getCaptionMaxLengthLimit() {
        return getUserConfig().isPremium() ? this.captionLengthLimitPremium : this.captionLengthLimitDefault;
    }

    public int getAboutLimit() {
        return getUserConfig().isPremium() ? this.aboutLengthLimitPremium : this.aboutLengthLimitDefault;
    }

    public int getMaxUserReactionsCount() {
        return getUserConfig().isPremium() ? this.reactionsUserMaxPremium : this.reactionsUserMaxDefault;
    }

    public int getChatReactionsCount() {
        if (getUserConfig().isPremium()) {
            return this.reactionsInChatMax;
        }
        return 1;
    }

    public boolean isPremiumUser(TLRPC$User tLRPC$User) {
        return !premiumFeaturesBlocked() && tLRPC$User.premium;
    }

    public boolean didPressTranscribeButtonEnough() {
        return this.transcribeButtonPressed >= 2;
    }

    public void pressTranscribeButton() {
        int i = this.transcribeButtonPressed;
        if (i < 2) {
            this.transcribeButtonPressed = i + 1;
            SharedPreferences sharedPreferences = this.mainPreferences;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt("transcribeButtonPressed", this.transcribeButtonPressed).apply();
            }
        }
    }

    public ArrayList<TLRPC$TL_messages_stickerSet> filterPremiumStickers(ArrayList<TLRPC$TL_messages_stickerSet> arrayList) {
        if (premiumFeaturesBlocked()) {
            int i = 0;
            while (i < arrayList.size()) {
                TLRPC$TL_messages_stickerSet filterPremiumStickers = getInstance(this.currentAccount).filterPremiumStickers(arrayList.get(i));
                if (filterPremiumStickers == null) {
                    arrayList.remove(i);
                    i--;
                } else {
                    arrayList.set(i, filterPremiumStickers);
                }
                i++;
            }
            return arrayList;
        }
        return arrayList;
    }

    public TLRPC$TL_messages_stickerSet filterPremiumStickers(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        boolean z;
        if (!premiumFeaturesBlocked() || tLRPC$TL_messages_stickerSet == null) {
            return tLRPC$TL_messages_stickerSet;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                if (i2 >= tLRPC$TL_messages_stickerSet.documents.size()) {
                    z = false;
                    break;
                } else if (MessageObject.isPremiumSticker(tLRPC$TL_messages_stickerSet.documents.get(i2))) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            } catch (Exception e) {
                e = e;
            }
        }
        if (z) {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_messages_stickerSet.getObjectSize());
            tLRPC$TL_messages_stickerSet.serializeToStream(nativeByteBuffer);
            nativeByteBuffer.position(0);
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = new TLRPC$TL_messages_stickerSet();
            nativeByteBuffer.readInt32(true);
            tLRPC$TL_messages_stickerSet2.readParams(nativeByteBuffer, true);
            nativeByteBuffer.reuse();
            while (i < tLRPC$TL_messages_stickerSet2.documents.size()) {
                try {
                    if (MessageObject.isPremiumSticker(tLRPC$TL_messages_stickerSet2.documents.get(i))) {
                        tLRPC$TL_messages_stickerSet2.documents.remove(i);
                        tLRPC$TL_messages_stickerSet2.packs.remove(i);
                        i--;
                        if (tLRPC$TL_messages_stickerSet2.documents.isEmpty()) {
                            return null;
                        }
                    }
                    i++;
                } catch (Exception e2) {
                    e = e2;
                    tLRPC$TL_messages_stickerSet = tLRPC$TL_messages_stickerSet2;
                    e.printStackTrace();
                    return tLRPC$TL_messages_stickerSet;
                }
            }
            return tLRPC$TL_messages_stickerSet2;
        }
        return tLRPC$TL_messages_stickerSet;
    }

    public TopicsController getTopicsController() {
        return this.topicsController;
    }

    public TranslateController getTranslateController() {
        return this.translateController;
    }

    public boolean isForum(long j) {
        TLRPC$Chat chat = getChat(Long.valueOf(-j));
        return chat != null && chat.forum;
    }

    public boolean isForum(MessageObject messageObject) {
        return messageObject != null && isForum(messageObject.getDialogId());
    }

    public boolean isForum(TLRPC$Message tLRPC$Message) {
        return tLRPC$Message != null && isForum(MessageObject.getDialogId(tLRPC$Message));
    }

    public void markAllTopicsAsRead(final long j) {
        getMessagesStorage().loadTopics(j, new j$.util.function.Consumer() {
            @Override
            public final void accept(Object obj) {
                MessagesController.this.lambda$markAllTopicsAsRead$9(j, (ArrayList) obj);
            }

            @Override
            public j$.util.function.Consumer andThen(j$.util.function.Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    public void lambda$markAllTopicsAsRead$9(final long j, final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markAllTopicsAsRead$8(arrayList, j);
            }
        });
    }

    public void lambda$markAllTopicsAsRead$8(ArrayList arrayList, long j) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic = (TLRPC$TL_forumTopic) arrayList.get(i);
                MessagesController messagesController = getMessagesController();
                int i2 = tLRPC$TL_forumTopic.top_message;
                TLRPC$Message tLRPC$Message = tLRPC$TL_forumTopic.topMessage;
                messagesController.markDialogAsRead(j, i2, 0, tLRPC$Message != null ? tLRPC$Message.date : 0, false, tLRPC$TL_forumTopic.id, 0, true, 0);
                getMessagesStorage().updateRepliesMaxReadId(-j, tLRPC$TL_forumTopic.id, tLRPC$TL_forumTopic.top_message, 0, true);
            }
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markAllTopicsAsRead$7();
            }
        });
    }

    public void lambda$markAllTopicsAsRead$7() {
        getMessagesStorage().resetAllUnreadCounters(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markAllTopicsAsRead$6();
            }
        });
    }

    public void lambda$markAllTopicsAsRead$6() {
        getMessagesController().sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public String getFullName(long j) {
        if (j > 0) {
            TLRPC$User user = getUser(Long.valueOf(j));
            if (user != null) {
                return ContactsController.formatName(user.first_name, user.last_name);
            }
            return null;
        }
        TLRPC$Chat chat = getChat(Long.valueOf(-j));
        if (chat != null) {
            return chat.title;
        }
        return null;
    }

    public UserNameResolver getUserNameResolver() {
        if (this.userNameResolver == null) {
            this.userNameResolver = new UserNameResolver(this.currentAccount);
        }
        return this.userNameResolver;
    }

    public class SponsoredMessagesInfo {
        public long loadTime;
        public boolean loading;
        public ArrayList<MessageObject> messages;
        public Integer posts_between;

        public SponsoredMessagesInfo() {
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

        SendAsPeersInfo(MessagesController messagesController, AnonymousClass1 anonymousClass1) {
            this();
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
            if (obj instanceof FaqSearchResult) {
                return this.title.equals(((FaqSearchResult) obj).title);
            }
            return false;
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
            if (obj instanceof EmojiSound) {
                EmojiSound emojiSound = (EmojiSound) obj;
                return this.id == emojiSound.id && this.accessHash == emojiSound.accessHash && Arrays.equals(this.fileReference, emojiSound.fileReference);
            }
            return false;
        }
    }

    public void clearQueryTime() {
        this.lastServerQueryTime.clear();
        this.lastScheduledServerQueryTime.clear();
        this.lastSavedServerQueryTime.clear();
    }

    public static class DiceFrameSuccess {
        public int frame;
        public int num;

        public DiceFrameSuccess(int i, int i2) {
            this.frame = i;
            this.num = i2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof DiceFrameSuccess) {
                DiceFrameSuccess diceFrameSuccess = (DiceFrameSuccess) obj;
                return this.frame == diceFrameSuccess.frame && this.num == diceFrameSuccess.num;
            }
            return false;
        }
    }

    public static class UserActionUpdatesSeq extends TLRPC$Updates {
        private UserActionUpdatesSeq() {
        }

        UserActionUpdatesSeq(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class UserActionUpdatesPts extends TLRPC$Updates {
        private UserActionUpdatesPts() {
        }

        UserActionUpdatesPts(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
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

        ReadTask(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class DialogFilter {
        private static int dialogFilterPointer = 10;
        public int flags;
        public int id;
        public int localId;
        public boolean locked;
        public String name;
        public int order;
        public volatile int pendingUnreadCount;
        public int unreadCount;
        public ArrayList<Long> alwaysShow = new ArrayList<>();
        public ArrayList<Long> neverShow = new ArrayList<>();
        public LongSparseIntArray pinnedDialogs = new LongSparseIntArray();
        public ArrayList<TLRPC$Dialog> dialogs = new ArrayList<>();
        public ArrayList<TLRPC$Dialog> dialogsForward = new ArrayList<>();
        public ArrayList<TL_chatlists$TL_exportedChatlistInvite> invites = null;

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
            if (tLRPC$Dialog.folder_id == 0 || (this.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0) {
                MessagesController messagesController = accountInstance.getMessagesController();
                ContactsController contactsController = accountInstance.getContactsController();
                if (!((this.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0 && messagesController.isDialogMuted(tLRPC$Dialog.id, 0L) && tLRPC$Dialog.unread_mentions_count == 0) && ((this.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0 || messagesController.getDialogUnreadCount(tLRPC$Dialog) != 0 || tLRPC$Dialog.unread_mark || tLRPC$Dialog.unread_mentions_count != 0)) {
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
                        if (ChatObject.isChannel(chat) && !chat.megagroup) {
                            if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
                                return true;
                            }
                        } else if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
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

        public boolean isDefault() {
            return this.id == 0;
        }

        public boolean isChatlist() {
            return (this.flags & MessagesController.DIALOG_FILTER_FLAG_CHATLIST) > 0;
        }

        public boolean isMyChatlist() {
            return isChatlist() && (this.flags & MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN) > 0;
        }
    }

    public int lambda$new$10(TLRPC$Dialog tLRPC$Dialog, TLRPC$Dialog tLRPC$Dialog2) {
        DialogFilter dialogFilter = this.sortingDialogFilter;
        int i = dialogFilter == null ? Integer.MIN_VALUE : dialogFilter.pinnedDialogs.get(tLRPC$Dialog.id, Integer.MIN_VALUE);
        DialogFilter dialogFilter2 = this.sortingDialogFilter;
        int i2 = dialogFilter2 == null ? Integer.MIN_VALUE : dialogFilter2.pinnedDialogs.get(tLRPC$Dialog2.id, Integer.MIN_VALUE);
        boolean z = tLRPC$Dialog instanceof TLRPC$TL_dialogFolder;
        if (!z || (tLRPC$Dialog2 instanceof TLRPC$TL_dialogFolder)) {
            if (z || !(tLRPC$Dialog2 instanceof TLRPC$TL_dialogFolder)) {
                if (i != Integer.MIN_VALUE || i2 == Integer.MIN_VALUE) {
                    if (i == Integer.MIN_VALUE || i2 != Integer.MIN_VALUE) {
                        if (i != Integer.MIN_VALUE) {
                            if (i > i2) {
                                return 1;
                            }
                            return i < i2 ? -1 : 0;
                        }
                        MediaDataController mediaDataController = getMediaDataController();
                        long lastMessageOrDraftDate = DialogObject.getLastMessageOrDraftDate(tLRPC$Dialog, mediaDataController.getDraft(tLRPC$Dialog.id, 0L));
                        long lastMessageOrDraftDate2 = DialogObject.getLastMessageOrDraftDate(tLRPC$Dialog2, mediaDataController.getDraft(tLRPC$Dialog2.id, 0L));
                        if (lastMessageOrDraftDate < lastMessageOrDraftDate2) {
                            return 1;
                        }
                        return lastMessageOrDraftDate > lastMessageOrDraftDate2 ? -1 : 0;
                    }
                    return -1;
                }
                return 1;
            }
            return 1;
        }
        return -1;
    }

    public void sortDialogsList(ArrayList<TLRPC$Dialog> arrayList) {
        if (arrayList == null) {
            return;
        }
        Collections.sort(arrayList, this.dialogComparator);
    }

    public int lambda$new$11(TLRPC$Dialog tLRPC$Dialog, TLRPC$Dialog tLRPC$Dialog2) {
        boolean z = tLRPC$Dialog instanceof TLRPC$TL_dialogFolder;
        if (!z || (tLRPC$Dialog2 instanceof TLRPC$TL_dialogFolder)) {
            if (z || !(tLRPC$Dialog2 instanceof TLRPC$TL_dialogFolder)) {
                boolean z2 = tLRPC$Dialog.pinned;
                if (z2 || !tLRPC$Dialog2.pinned) {
                    if (!z2 || tLRPC$Dialog2.pinned) {
                        if (z2) {
                            int i = tLRPC$Dialog.pinnedNum;
                            int i2 = tLRPC$Dialog2.pinnedNum;
                            if (i < i2) {
                                return 1;
                            }
                            return i > i2 ? -1 : 0;
                        }
                        MediaDataController mediaDataController = getMediaDataController();
                        long lastMessageOrDraftDate = DialogObject.getLastMessageOrDraftDate(tLRPC$Dialog, mediaDataController.getDraft(tLRPC$Dialog.id, 0L));
                        long lastMessageOrDraftDate2 = DialogObject.getLastMessageOrDraftDate(tLRPC$Dialog2, mediaDataController.getDraft(tLRPC$Dialog2.id, 0L));
                        if (lastMessageOrDraftDate < lastMessageOrDraftDate2) {
                            return 1;
                        }
                        return lastMessageOrDraftDate > lastMessageOrDraftDate2 ? -1 : 0;
                    }
                    return -1;
                }
                return 1;
            }
            return 1;
        }
        return -1;
    }

    public int lambda$new$12(TLRPC$Update tLRPC$Update, TLRPC$Update tLRPC$Update2) {
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
        if (updateType == 2) {
            long updateChannelId = getUpdateChannelId(tLRPC$Update);
            long updateChannelId2 = getUpdateChannelId(tLRPC$Update2);
            if (updateChannelId == updateChannelId2) {
                return AndroidUtilities.compare(getUpdatePts(tLRPC$Update), getUpdatePts(tLRPC$Update2));
            }
            return AndroidUtilities.compare(updateChannelId, updateChannelId2);
        }
        return 0;
    }

    public static MessagesController getInstance(int i) {
        MessagesController messagesController = Instance[i];
        if (messagesController == null) {
            synchronized (lockObjects[i]) {
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

    public SharedPreferences getMainSettings() {
        return this.mainPreferences;
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
        this.chats = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.encryptedChats = new ConcurrentHashMap<>(10, 1.0f, 2);
        this.users = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.objectsByUsernames = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.activeVoiceChatsMap = new HashMap<>();
        this.joiningToChannels = new ArrayList<>();
        this.exportedChats = new LongSparseArray<>();
        this.hintDialogs = new ArrayList<>();
        this.dialogsByFolder = new SparseArray<>();
        this.allDialogs = new ArrayList<>();
        this.dialogsForward = new ArrayList<>();
        this.dialogsServerOnly = new ArrayList<>();
        this.dialogsCanAddUsers = new ArrayList<>();
        this.dialogsMyChannels = new ArrayList<>();
        this.dialogsMyGroups = new ArrayList<>();
        this.dialogsChannelsOnly = new ArrayList<>();
        this.dialogsUsersOnly = new ArrayList<>();
        this.dialogsForBlock = new ArrayList<>();
        this.dialogsGroupsOnly = new ArrayList<>();
        this.selectedDialogFilter = new DialogFilter[2];
        this.dialogsLoadedTillDate = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.dialogs_read_inbox_max = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.dialogs_read_outbox_max = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.dialogs_dict = new LongSparseArray<>();
        this.dialogMessage = new LongSparseArray<>();
        this.dialogMessagesByRandomIds = new LongSparseArray<>();
        this.deletedHistory = new LongSparseIntArray();
        this.dialogMessagesByIds = new SparseArray<>();
        this.printingUsers = new ConcurrentHashMap<>(20, 1.0f, 2);
        this.printingStrings = new LongSparseArray<>();
        this.printingStringsTypes = new LongSparseArray<>();
        this.sendingTypings = new LongSparseArray[12];
        this.onlinePrivacy = new ConcurrentHashMap<>(20, 1.0f, 2);
        this.pendingUnreadCounter = new LongSparseIntArray();
        this.chatlistFoldersUpdates = new SparseArray<>();
        this.largeQueueMaxActiveOperations = 2;
        this.smallQueueMaxActiveOperations = 5;
        this.storiesChangelogUserId = 777000L;
        this.giveawayAddPeersMax = 10L;
        this.giveawayPeriodMax = 7L;
        this.giveawayCountriesMax = 10L;
        this.giveawayBoostsPerPremium = 4L;
        this.boostsPerSentGift = 3L;
        this.loadingPeerSettings = new LongSparseArray<>();
        this.createdDialogIds = new ArrayList<>();
        this.createdScheduledDialogIds = new ArrayList<>();
        this.createdDialogMainThreadIds = new ArrayList<>();
        this.visibleDialogMainThreadIds = new ArrayList<>();
        this.visibleScheduledDialogMainThreadIds = new ArrayList<>();
        this.shortPollChannels = new LongSparseIntArray();
        this.needShortPollChannels = new LongSparseArray<>();
        this.shortPollOnlines = new LongSparseIntArray();
        this.needShortPollOnlines = new LongSparseArray<>();
        this.deletingDialogs = new LongSparseArray<>();
        this.clearingHistoryDialogs = new LongSparseArray<>();
        this.loadingBlockedPeers = false;
        this.blockePeers = new LongSparseIntArray();
        this.totalBlockedCount = -1;
        this.channelViewsToSend = new LongSparseArray<>();
        this.pollsToCheck = new LongSparseArray<>();
        this.premiumFeaturesTypesToPosition = new SparseIntArray();
        this.dialogFilters = new ArrayList<>();
        this.frozenDialogFilters = null;
        this.hiddenUndoChats = new ArrayList<>();
        this.dialogFiltersById = new SparseArray<>();
        this.suggestedFilters = new ArrayList<>();
        this.updatesQueueChannels = new LongSparseArray<>();
        this.updatesStartWaitTimeChannels = new LongSparseLongArray();
        this.channelsPts = new LongSparseIntArray();
        this.gettingDifferenceChannels = new LongSparseArray<>();
        this.gettingChatInviters = new LongSparseArray<>();
        this.gettingUnknownChannels = new LongSparseArray<>();
        this.gettingUnknownDialogs = new LongSparseArray<>();
        this.checkingLastMessagesDialogs = new LongSparseArray<>();
        this.updatesQueueSeq = new ArrayList<>();
        this.updatesQueuePts = new ArrayList<>();
        this.updatesQueueQts = new ArrayList<>();
        this.fullUsers = new LongSparseArray<>();
        this.fullChats = new LongSparseArray<>();
        this.groupCalls = new LongSparseArray<>();
        this.groupCallsByChatId = new LongSparseArray<>();
        this.loadingFullUsers = new HashSet<>();
        this.loadedFullUsers = new LongSparseLongArray();
        this.loadingFullChats = new HashSet<>();
        this.loadingGroupCalls = new HashSet<>();
        this.loadingFullParticipants = new HashSet<>();
        this.loadedFullParticipants = new HashSet<>();
        this.loadedFullChats = new LongSparseLongArray();
        this.channelAdmins = new LongSparseArray<>();
        this.loadingChannelAdmins = new LongSparseIntArray();
        this.migratedChats = new SparseIntArray();
        this.sponsoredMessages = new LongSparseArray<>();
        this.sendAsPeers = new LongSparseArray<>();
        this.reloadingWebpages = new HashMap<>();
        this.reloadingWebpagesPending = new LongSparseArray<>();
        this.reloadingScheduledWebpages = new HashMap<>();
        this.reloadingScheduledWebpagesPending = new LongSparseArray<>();
        this.reloadingSavedWebpages = new HashMap<>();
        this.reloadingSavedWebpagesPending = new LongSparseArray<>();
        this.lastScheduledServerQueryTime = new LongSparseArray<>();
        this.lastSavedServerQueryTime = new LongSparseArray<>();
        this.lastServerQueryTime = new LongSparseArray<>();
        this.reloadingMessages = new LongSparseArray<>();
        this.readTasks = new ArrayList<>();
        this.readTasksMap = new LongSparseArray<>();
        this.repliesReadTasks = new ArrayList<>();
        this.threadsReadTasksMap = new HashMap<>();
        this.nextDialogsCacheOffset = new SparseIntArray();
        this.loadingDialogs = new SparseBooleanArray();
        this.dialogsEndReached = new SparseBooleanArray();
        this.serverDialogsEndReached = new SparseBooleanArray();
        this.getDifferenceFirstSync = true;
        this.loadingPinnedDialogs = new SparseIntArray();
        this.faqSearchArray = new ArrayList<>();
        this.suggestContacts = true;
        this.themeCheckRunnable = MessagesController$$ExternalSyntheticLambda262.INSTANCE;
        this.passwordCheckRunnable = new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$new$0();
            }
        };
        this.uploadingThemes = new HashMap<>();
        this.appConfigFetcher = new AnonymousClass1();
        this.maxBroadcastCount = 100;
        this.minGroupConvertSize = 200;
        this.gifSearchEmojies = new ArrayList<>();
        this.diceSuccess = new HashMap<>();
        this.emojiSounds = new HashMap<>();
        this.emojiInteractions = new HashMap<>();
        this.directPaymentsCurrency = new ArrayList();
        this.emojiStatusUntilValues = new LongSparseArray<>();
        this.photoSuggestion = new SparseArray<>();
        this.dialogDateComparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$new$10;
                lambda$new$10 = MessagesController.this.lambda$new$10((TLRPC$Dialog) obj, (TLRPC$Dialog) obj2);
                return lambda$new$10;
            }
        };
        this.dialogComparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$new$11;
                lambda$new$11 = MessagesController.this.lambda$new$11((TLRPC$Dialog) obj, (TLRPC$Dialog) obj2);
                return lambda$new$11;
            }
        };
        this.updatesComparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$new$12;
                lambda$new$12 = MessagesController.this.lambda$new$12((TLRPC$Update) obj, (TLRPC$Update) obj2);
                return lambda$new$12;
            }
        };
        this.notifyTranscriptionAudioCooldownUpdate = new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$new$32();
            }
        };
        this.peerDialogsRequested = new LongSparseArray<>();
        this.peerDialogRequestTimeout = 240000L;
        this.dialogPhotos = new LongSparseArray<>();
        this.DIALOGS_LOAD_TYPE_CACHE = 1;
        this.DIALOGS_LOAD_TYPE_CHANNEL = 2;
        this.DIALOGS_LOAD_TYPE_UNKNOWN = 3;
        ImageLoader.getInstance();
        getMessagesStorage();
        getLocationController();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$new$13();
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
        System.currentTimeMillis();
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
        this.maxFolderPinnedDialogsCountDefault = this.mainPreferences.getInt("maxFolderPinnedDialogsCountDefault", 100);
        this.maxFolderPinnedDialogsCountPremium = this.mainPreferences.getInt("maxFolderPinnedDialogsCountPremium", 100);
        this.maxMessageLength = this.mainPreferences.getInt("maxMessageLength", LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM);
        this.maxCaptionLength = this.mainPreferences.getInt("maxCaptionLength", 1024);
        this.mapProvider = this.mainPreferences.getInt("mapProvider", 0);
        this.availableMapProviders = this.mainPreferences.getInt("availableMapProviders", 3);
        this.mapKey = this.mainPreferences.getString("pk", null);
        this.installReferer = this.mainPreferences.getString("installReferer", null);
        this.revokeTimeLimit = this.mainPreferences.getInt("revokeTimeLimit", ConnectionsManager.DEFAULT_DATACENTER_ID);
        this.revokeTimePmLimit = this.mainPreferences.getInt("revokeTimePmLimit", ConnectionsManager.DEFAULT_DATACENTER_ID);
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
        this.venueSearchBot = this.mainPreferences.getString("venueSearchBot", "foursquare");
        this.storyVenueSearchBot = this.mainPreferences.getString("storyVenueSearchBot", "foursquare");
        this.gifSearchBot = this.mainPreferences.getString("gifSearchBot", "gif");
        this.imageSearchBot = this.mainPreferences.getString("imageSearchBot", "pic");
        this.blockedCountry = this.mainPreferences.getBoolean("blockedCountry", false);
        this.suggestedLangCode = this.mainPreferences.getString("suggestedLangCode", "en");
        this.animatedEmojisZoom = this.mainPreferences.getFloat("animatedEmojisZoom", 0.625f);
        this.qrLoginCamera = this.mainPreferences.getBoolean("qrLoginCamera", true);
        this.saveGifsWithStickers = this.mainPreferences.getBoolean("saveGifsWithStickers", false);
        this.filtersEnabled = this.mainPreferences.getBoolean("filtersEnabled", false);
        this.getfileExperimentalParams = this.mainPreferences.getBoolean("getfileExperimentalParams", false);
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
        this.pendingSuggestions = this.mainPreferences.getStringSet("pendingSuggestions", null);
        int i2 = this.mainPreferences.getInt("channelsLimitDefault", 500);
        this.channelsLimitDefault = i2;
        this.channelsLimitPremium = this.mainPreferences.getInt("channelsLimitPremium", i2 * 2);
        this.savedGifsLimitDefault = this.mainPreferences.getInt("savedGifsLimitDefault", 200);
        this.savedGifsLimitPremium = this.mainPreferences.getInt("savedGifsLimitPremium", 400);
        this.stickersFavedLimitDefault = this.mainPreferences.getInt("stickersFavedLimitDefault", 5);
        this.stickersFavedLimitPremium = this.mainPreferences.getInt("stickersFavedLimitPremium", 200);
        this.maxPinnedDialogsCountDefault = this.mainPreferences.getInt("maxPinnedDialogsCountDefault", 5);
        this.maxPinnedDialogsCountPremium = this.mainPreferences.getInt("maxPinnedDialogsCountPremium", 5);
        this.maxPinnedDialogsCountDefault = this.mainPreferences.getInt("maxPinnedDialogsCountDefault", 5);
        this.maxPinnedDialogsCountPremium = this.mainPreferences.getInt("maxPinnedDialogsCountPremium", 5);
        this.dialogFiltersLimitDefault = this.mainPreferences.getInt("dialogFiltersLimitDefault", 10);
        this.dialogFiltersLimitPremium = this.mainPreferences.getInt("dialogFiltersLimitPremium", 20);
        this.dialogFiltersChatsLimitDefault = this.mainPreferences.getInt("dialogFiltersChatsLimitDefault", 100);
        this.dialogFiltersChatsLimitPremium = this.mainPreferences.getInt("dialogFiltersChatsLimitPremium", 200);
        this.dialogFiltersPinnedLimitDefault = this.mainPreferences.getInt("dialogFiltersPinnedLimitDefault", 5);
        this.dialogFiltersPinnedLimitPremium = this.mainPreferences.getInt("dialogFiltersPinnedLimitPremium", 10);
        this.publicLinksLimitDefault = this.mainPreferences.getInt("publicLinksLimitDefault", 10);
        this.publicLinksLimitPremium = this.mainPreferences.getInt("publicLinksLimitPremium", 20);
        this.captionLengthLimitDefault = this.mainPreferences.getInt("captionLengthLimitDefault", 1024);
        this.captionLengthLimitPremium = this.mainPreferences.getInt("captionLengthLimitPremium", LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM);
        this.storyCaptionLengthLimitDefault = this.mainPreferences.getInt("storyCaptionLengthLimit", 200);
        this.storyCaptionLengthLimitPremium = this.mainPreferences.getInt("storyCaptionLengthLimitPremium", LiteMode.FLAG_AUTOPLAY_GIFS);
        this.aboutLengthLimitDefault = this.mainPreferences.getInt("aboutLengthLimitDefault", 70);
        this.aboutLengthLimitPremium = this.mainPreferences.getInt("aboutLengthLimitPremium", 140);
        this.reactionsUserMaxDefault = this.mainPreferences.getInt("reactionsUserMaxDefault", 1);
        this.reactionsUserMaxPremium = this.mainPreferences.getInt("reactionsUserMaxPremium", 3);
        this.reactionsInChatMax = this.mainPreferences.getInt("reactionsInChatMax", 3);
        int i3 = this.mainPreferences.getInt("uploadMaxFileParts", 4000);
        this.uploadMaxFileParts = i3;
        this.uploadMaxFilePartsPremium = this.mainPreferences.getInt("uploadMaxFilePartsPremium", i3 * 2);
        this.premiumInvoiceSlug = this.mainPreferences.getString("premiumInvoiceSlug", null);
        this.premiumBotUsername = this.mainPreferences.getString("premiumBotUsername", null);
        this.premiumLocked = this.mainPreferences.getBoolean("premiumLocked", false);
        this.transcribeButtonPressed = this.mainPreferences.getInt("transcribeButtonPressed", 0);
        this.forumUpgradeParticipantsMin = this.mainPreferences.getInt("forumUpgradeParticipantsMin", 200);
        this.topicsPinnedLimit = this.mainPreferences.getInt("topicsPinnedLimit", 3);
        this.telegramAntispamUserId = this.mainPreferences.getLong("telegramAntispamUserId", -1L);
        this.telegramAntispamGroupSizeMin = this.mainPreferences.getInt("telegramAntispamGroupSizeMin", 100);
        this.hiddenMembersGroupSizeMin = this.mainPreferences.getInt("hiddenMembersGroupSizeMin", 100);
        this.chatlistUpdatePeriod = this.mainPreferences.getInt("chatlistUpdatePeriod", 3600);
        this.uploadMarkupVideo = this.mainPreferences.getBoolean("uploadMarkupVideo", true);
        this.giftAttachMenuIcon = this.mainPreferences.getBoolean("giftAttachMenuIcon", false);
        this.giftTextFieldIcon = this.mainPreferences.getBoolean("giftTextFieldIcon", false);
        this.checkResetLangpack = this.mainPreferences.getInt("checkResetLangpack", 0);
        this.smallQueueMaxActiveOperations = this.mainPreferences.getInt("smallQueueMaxActiveOperations", 5);
        this.largeQueueMaxActiveOperations = this.mainPreferences.getInt("largeQueueMaxActiveOperations", 2);
        this.stealthModeFuture = this.mainPreferences.getInt("stories_stealth_future_period", 1500);
        this.storiesChangelogUserId = this.mainPreferences.getLong("stories_changelog_user_id", 777000L);
        this.giveawayAddPeersMax = this.mainPreferences.getLong("giveaway_add_peers_max", 10L);
        this.giveawayCountriesMax = this.mainPreferences.getLong("giveaway_countries_max", 10L);
        this.giveawayBoostsPerPremium = this.mainPreferences.getLong("giveaway_boosts_per_premium", 4L);
        this.boostsPerSentGift = this.mainPreferences.getLong("boosts_per_sent_gift", 3L);
        this.giveawayPeriodMax = this.mainPreferences.getLong("giveaway_period_max", 7L);
        this.stealthModePast = this.mainPreferences.getInt("stories_stealth_past_period", 300);
        this.stealthModeCooldown = this.mainPreferences.getInt("stories_stealth_cooldown_period", 3600);
        boolean z = ConnectionsManager.native_isTestBackend(this.currentAccount) != 0;
        this.chatlistInvitesLimitDefault = this.mainPreferences.getInt("chatlistInvitesLimitDefault", 3);
        this.storyExpiringLimitDefault = this.mainPreferences.getInt("storyExpiringLimitDefault", 50);
        this.storyExpiringLimitPremium = this.mainPreferences.getInt("storyExpiringLimitPremium", 100);
        this.storiesSentWeeklyLimitDefault = this.mainPreferences.getInt("storiesSentWeeklyLimitDefault", 7);
        this.storiesSuggestedReactionsLimitDefault = this.mainPreferences.getInt("storiesSuggestedReactionsLimitDefault", 1);
        this.storiesSuggestedReactionsLimitPremium = this.mainPreferences.getInt("storiesSuggestedReactionsLimitPremium", 5);
        this.storiesSentWeeklyLimitPremium = this.mainPreferences.getInt("storiesSentWeeklyLimitPremium", 70);
        this.storiesSentMonthlyLimitDefault = this.mainPreferences.getInt("storiesSentMonthlyLimitDefault", 30);
        this.storiesSentMonthlyLimitPremium = this.mainPreferences.getInt("storiesSentMonthlyLimitPremium", 300);
        this.channelBgIconLevelMin = this.mainPreferences.getInt("channelBgIconLevelMin", 1);
        this.channelProfileIconLevelMin = this.mainPreferences.getInt("channelProfileIconLevelMin", 1);
        this.channelEmojiStatusLevelMin = this.mainPreferences.getInt("channelEmojiStatusLevelMin", 1);
        this.channelWallpaperLevelMin = this.mainPreferences.getInt("channelWallpaperLevelMin", 1);
        this.channelCustomWallpaperLevelMin = this.mainPreferences.getInt("channelCustomWallpaperLevelMin", 1);
        this.chatlistInvitesLimitPremium = this.mainPreferences.getInt("chatlistInvitesLimitPremium", z ? 5 : 20);
        this.chatlistJoinedLimitDefault = this.mainPreferences.getInt("chatlistJoinedLimitDefault", 2);
        this.chatlistJoinedLimitPremium = this.mainPreferences.getInt("chatlistJoinedLimitPremium", z ? 5 : 20);
        this.storiesPosting = this.mainPreferences.getString("storiesPosting", "enabled");
        this.storiesEntities = this.mainPreferences.getString("storiesEntities", "premium");
        this.storiesExportNopublicLink = this.mainPreferences.getBoolean("storiesExportNopublicLink", false);
        this.authorizationAutoconfirmPeriod = this.mainPreferences.getInt("authorization_autoconfirm_period", 604800);
        this.quoteLengthMax = this.mainPreferences.getInt("quoteLengthMax", 1024);
        this.giveawayGiftsPurchaseAvailable = this.mainPreferences.getBoolean("giveawayGiftsPurchaseAvailable", false);
        this.peerColors = PeerColors.fromString(0, this.mainPreferences.getString("peerColors", ""));
        this.profilePeerColors = PeerColors.fromString(1, this.mainPreferences.getString("profilePeerColors", ""));
        int i4 = this.mainPreferences.getInt("transcribeAudioTrialWeeklyNumber", BuildVars.DEBUG_PRIVATE_VERSION ? 2 : 0);
        this.transcribeAudioTrialWeeklyNumber = i4;
        this.transcribeAudioTrialCurrentNumber = this.mainPreferences.getInt("transcribeAudioTrialCurrentNumber", i4);
        this.transcribeAudioTrialDurationMax = this.mainPreferences.getInt("transcribeAudioTrialDurationMax", 300);
        this.transcribeAudioTrialCooldownUntil = this.mainPreferences.getInt("transcribeAudioTrialCooldownUntil", 0);
        this.recommendedChannelsLimitDefault = this.mainPreferences.getInt("recommendedChannelsLimitDefault", 10);
        this.recommendedChannelsLimitPremium = this.mainPreferences.getInt("recommendedChannelsLimitPremium", 100);
        this.boostsChannelLevelMax = this.mainPreferences.getInt("boostsChannelLevelMax", 100);
        this.savedDialogsPinnedLimitDefault = this.mainPreferences.getInt("savedDialogsPinnedLimitDefault", 4);
        this.savedDialogsPinnedLimitPremium = this.mainPreferences.getInt("savedDialogsPinnedLimitPremium", 6);
        scheduleTranscriptionUpdate();
        BuildVars.GOOGLE_AUTH_CLIENT_ID = this.mainPreferences.getString("googleAuthClientId", BuildVars.GOOGLE_AUTH_CLIENT_ID);
        if (this.mainPreferences.contains("dcDomainName2")) {
            this.dcDomainName = this.mainPreferences.getString("dcDomainName2", "apv3.stel.com");
        } else {
            this.dcDomainName = z ? "tapv3.stel.com" : "apv3.stel.com";
        }
        if (this.mainPreferences.contains("webFileDatacenterId")) {
            this.webFileDatacenterId = this.mainPreferences.getInt("webFileDatacenterId", 4);
        } else {
            this.webFileDatacenterId = z ? 2 : 4;
        }
        Set<String> stringSet = this.mainPreferences.getStringSet("directPaymentsCurrency", null);
        if (stringSet != null) {
            this.directPaymentsCurrency.clear();
            this.directPaymentsCurrency.addAll(stringSet);
        }
        loadPremiumFeaturesPreviewOrder(this.mainPreferences.getString("premiumFeaturesTypesToPosition", null));
        if (this.pendingSuggestions != null) {
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
                    for (int i5 = 0; i5 < readInt32; i5++) {
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
                    for (int i6 = 0; i6 < readInt322; i6++) {
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
            this.gifSearchEmojies.add("🥳");
            this.gifSearchEmojies.add("😎");
        } else {
            try {
                byte[] decode3 = Base64.decode(string3, 0);
                if (decode3 != null) {
                    SerializedData serializedData3 = new SerializedData(decode3);
                    int readInt323 = serializedData3.readInt32(true);
                    for (int i7 = 0; i7 < readInt323; i7++) {
                        this.gifSearchEmojies.add(serializedData3.readString(true));
                    }
                    serializedData3.cleanup();
                }
            } catch (Exception e3) {
                FileLog.e(e3);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.loadAppConfig();
            }
        }, 2000L);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$new$14();
            }
        }, 400L);
        this.topicsController = new TopicsController(i);
        this.cacheByChatsController = new CacheByChatsController(i);
        this.translateController = new TranslateController(this);
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$new$15();
            }
        });
    }

    public void lambda$new$13() {
        MessagesController messagesController = getMessagesController();
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileUploaded);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileUploadFailed);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileUploadProgressChanged);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileLoaded);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.fileLoadFailed);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.messageReceivedByServer);
        getNotificationCenter().addObserver(messagesController, NotificationCenter.updateMessageMedia);
    }

    public void lambda$new$14() {
        checkPeerColors(false);
    }

    public void lambda$new$15() {
        this.enableJoined = this.notificationsPreferences.getBoolean("EnableContactJoined", true);
        this.nextTosCheckTime = this.notificationsPreferences.getInt("nextTosCheckTime", 0);
    }

    private void sendLoadPeersRequest(final TLObject tLObject, final ArrayList<TLObject> arrayList, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, final ArrayList<TLRPC$User> arrayList2, final ArrayList<TLRPC$Chat> arrayList3, final ArrayList<DialogFilter> arrayList4, final SparseArray<DialogFilter> sparseArray, final ArrayList<Integer> arrayList5, final HashMap<Integer, HashSet<Long>> hashMap, final HashSet<Integer> hashSet, final Runnable runnable) {
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$sendLoadPeersRequest$16(arrayList3, arrayList2, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, tLObject, arrayList4, sparseArray, arrayList5, hashMap, hashSet, runnable, tLObject2, tLRPC$TL_error);
            }
        });
    }

    public void lambda$sendLoadPeersRequest$16(ArrayList arrayList, ArrayList arrayList2, TLRPC$messages_Dialogs tLRPC$messages_Dialogs, TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, ArrayList arrayList3, TLObject tLObject, ArrayList arrayList4, SparseArray sparseArray, ArrayList arrayList5, HashMap hashMap, HashSet hashSet, Runnable runnable, TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
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
            getMessagesStorage().processLoadedFilterPeers(tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList2, arrayList, arrayList4, sparseArray, arrayList5, hashMap, hashSet, runnable);
        }
    }

    public void loadFilterPeers(final HashMap<Long, TLRPC$InputPeer> hashMap, final HashMap<Long, TLRPC$InputPeer> hashMap2, final HashMap<Long, TLRPC$InputPeer> hashMap3, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, final ArrayList<TLRPC$User> arrayList, final ArrayList<TLRPC$Chat> arrayList2, final ArrayList<DialogFilter> arrayList3, final SparseArray<DialogFilter> sparseArray, final ArrayList<Integer> arrayList4, final HashMap<Integer, HashSet<Long>> hashMap4, final HashSet<Integer> hashSet, final Runnable runnable) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadFilterPeers$17(hashMap2, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap4, hashSet, runnable, hashMap3, hashMap);
            }
        });
    }

    public void lambda$loadFilterPeers$17(HashMap hashMap, TLRPC$messages_Dialogs tLRPC$messages_Dialogs, TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SparseArray sparseArray, ArrayList arrayList4, HashMap hashMap2, HashSet hashSet, Runnable runnable, HashMap hashMap3, HashMap hashMap4) {
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
            sendLoadPeersRequest(tLRPC$TL_users_getUsers, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashSet, runnable);
        }
        if (tLRPC$TL_users_getUsers != null) {
            i = 100;
            sendLoadPeersRequest(tLRPC$TL_users_getUsers, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashSet, runnable);
        } else {
            i = 100;
        }
        TLObject tLObject = null;
        TLObject tLObject2 = null;
        for (Map.Entry entry2 : hashMap3.entrySet()) {
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
                    sendLoadPeersRequest(tLRPC$TL_messages_getChats, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashSet, runnable);
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
                    sendLoadPeersRequest(tLRPC$TL_channels_getChannels, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashSet, runnable);
                    tLObject2 = null;
                } else {
                    tLObject2 = tLRPC$TL_channels_getChannels;
                }
            }
        }
        if (tLObject != null) {
            sendLoadPeersRequest(tLObject, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashSet, runnable);
        }
        if (tLObject2 != null) {
            sendLoadPeersRequest(tLObject2, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashSet, runnable);
        }
        loop3: while (true) {
            tLRPC$TL_messages_getPeerDialogs = null;
            for (Map.Entry entry3 : hashMap4.entrySet()) {
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
            sendLoadPeersRequest(tLRPC$TL_messages_getPeerDialogs, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashSet, runnable);
        }
        if (tLRPC$TL_messages_getPeerDialogs != null) {
            sendLoadPeersRequest(tLRPC$TL_messages_getPeerDialogs, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashSet, runnable);
        }
    }

    public void processLoadedDialogFilters(final ArrayList<DialogFilter> arrayList, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, final ArrayList<TLRPC$User> arrayList2, final ArrayList<TLRPC$Chat> arrayList3, final ArrayList<TLRPC$EncryptedChat> arrayList4, final int i, final Runnable runnable) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedDialogFilters$20(tLRPC$messages_Dialogs, arrayList4, tLRPC$messages_Dialogs2, i, arrayList, arrayList2, arrayList3, runnable);
            }
        });
    }

    public void lambda$processLoadedDialogFilters$20(org.telegram.tgnet.TLRPC$messages_Dialogs r20, final java.util.ArrayList r21, final org.telegram.tgnet.TLRPC$messages_Dialogs r22, final int r23, final java.util.ArrayList r24, final java.util.ArrayList r25, final java.util.ArrayList r26, final java.lang.Runnable r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processLoadedDialogFilters$20(org.telegram.tgnet.TLRPC$messages_Dialogs, java.util.ArrayList, org.telegram.tgnet.TLRPC$messages_Dialogs, int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.Runnable):void");
    }

    public void lambda$processLoadedDialogFilters$19(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, TLRPC$messages_Dialogs tLRPC$messages_Dialogs, ArrayList arrayList4, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, Runnable runnable) {
        int i2;
        boolean z;
        long j;
        if (i != 2) {
            this.dialogFilters = arrayList;
            this.dialogFiltersById.clear();
            int size = this.dialogFilters.size();
            for (int i3 = 0; i3 < size; i3++) {
                DialogFilter dialogFilter = this.dialogFilters.get(i3);
                this.dialogFiltersById.put(dialogFilter.id, dialogFilter);
            }
            Collections.sort(this.dialogFilters, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$processLoadedDialogFilters$18;
                    lambda$processLoadedDialogFilters$18 = MessagesController.lambda$processLoadedDialogFilters$18((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
                    return lambda$processLoadedDialogFilters$18;
                }
            });
            putUsers(arrayList2, true);
            putChats(arrayList3, true);
            this.dialogFiltersLoaded = true;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
            if (i == 0) {
                loadRemoteFilters(false);
            }
            if (tLRPC$messages_Dialogs != null && !tLRPC$messages_Dialogs.dialogs.isEmpty()) {
                applyDialogsNotificationsSettings(tLRPC$messages_Dialogs.dialogs);
            }
            if (arrayList4 != null) {
                for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                    TLRPC$EncryptedChat tLRPC$EncryptedChat = (TLRPC$EncryptedChat) arrayList4.get(i4);
                    if ((tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) && AndroidUtilities.getMyLayerVersion(tLRPC$EncryptedChat.layer) < SecretChatHelper.CURRENT_SECRET_CHAT_LAYER) {
                        getSecretChatHelper().sendNotifyLayerMessage(tLRPC$EncryptedChat, null);
                    }
                    putEncryptedChat(tLRPC$EncryptedChat, true);
                }
            }
            for (int i5 = 0; i5 < longSparseArray.size(); i5++) {
                long keyAt = longSparseArray.keyAt(i5);
                TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) longSparseArray.valueAt(i5);
                TLRPC$Dialog tLRPC$Dialog2 = this.dialogs_dict.get(keyAt);
                if (tLRPC$messages_Dialogs != null && tLRPC$messages_Dialogs.dialogs.contains(tLRPC$Dialog)) {
                    if (tLRPC$Dialog.draft instanceof TLRPC$TL_draftMessage) {
                        getMediaDataController().saveDraft(tLRPC$Dialog.id, 0L, tLRPC$Dialog.draft, null, false);
                    }
                    if (tLRPC$Dialog2 != null) {
                        tLRPC$Dialog2.notify_settings = tLRPC$Dialog.notify_settings;
                    }
                }
                ArrayList<MessageObject> arrayList5 = (ArrayList) longSparseArray2.get(tLRPC$Dialog.id);
                long j2 = 0;
                if (tLRPC$Dialog2 == null) {
                    this.dialogs_dict.put(keyAt, tLRPC$Dialog);
                    this.dialogMessage.put(keyAt, arrayList5);
                    if (arrayList5 != null) {
                        for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                            MessageObject messageObject = arrayList5.get(i6);
                            if (messageObject != null && messageObject.messageOwner.peer_id.channel_id == 0) {
                                this.dialogMessagesByIds.put(messageObject.getId(), messageObject);
                                long j3 = messageObject.messageOwner.random_id;
                                if (j3 != 0) {
                                    this.dialogMessagesByRandomIds.put(j3, messageObject);
                                }
                            }
                        }
                    }
                    getTranslateController().checkDialogMessage(keyAt);
                } else {
                    tLRPC$Dialog2.pinned = tLRPC$Dialog.pinned;
                    tLRPC$Dialog2.pinnedNum = tLRPC$Dialog.pinnedNum;
                    ArrayList<MessageObject> arrayList6 = this.dialogMessage.get(keyAt);
                    for (int i7 = 0; arrayList6 != null && i7 < arrayList6.size(); i7++) {
                        if (arrayList6.get(i7) != null && arrayList6.get(i7).deleted) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    if (z || arrayList6 == null || tLRPC$Dialog2.top_message > 0) {
                        if (tLRPC$Dialog.top_message < tLRPC$Dialog2.top_message) {
                            if ((arrayList6 == null) == (arrayList5 == null)) {
                                if (arrayList6 != null) {
                                    if (arrayList5 != null) {
                                        if (arrayList6.size() == arrayList5.size()) {
                                        }
                                    }
                                }
                            }
                        }
                        this.dialogs_dict.put(keyAt, tLRPC$Dialog);
                        this.dialogMessage.put(keyAt, arrayList5);
                        if (arrayList6 != null) {
                            for (int i8 = 0; i8 < arrayList6.size(); i8++) {
                                MessageObject messageObject2 = arrayList6.get(i8);
                                if (messageObject2 != null) {
                                    if (messageObject2.messageOwner.peer_id.channel_id == 0) {
                                        this.dialogMessagesByIds.remove(messageObject2.getId());
                                    }
                                    long j4 = messageObject2.messageOwner.random_id;
                                    if (j4 != 0) {
                                        this.dialogMessagesByRandomIds.remove(j4);
                                    }
                                }
                            }
                        }
                        if (arrayList5 != null) {
                            for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                MessageObject messageObject3 = arrayList5.get(i9);
                                if (messageObject3 != null && messageObject3.messageOwner.peer_id.channel_id == j2) {
                                    int i10 = 0;
                                    while (true) {
                                        if (arrayList6 == null || i10 >= arrayList6.size()) {
                                            break;
                                        }
                                        MessageObject messageObject4 = arrayList6.get(i10);
                                        if (messageObject4 != null && messageObject4.getId() == messageObject3.getId()) {
                                            messageObject3.deleted = messageObject4.deleted;
                                            break;
                                        }
                                        i10++;
                                    }
                                    this.dialogMessagesByIds.put(messageObject3.getId(), messageObject3);
                                    long j5 = messageObject3.messageOwner.random_id;
                                    j2 = 0;
                                    if (j5 != 0) {
                                        this.dialogMessagesByRandomIds.put(j5, messageObject3);
                                    }
                                }
                            }
                        }
                        getTranslateController().checkDialogMessage(keyAt);
                    } else {
                        this.dialogs_dict.put(keyAt, tLRPC$Dialog);
                        this.dialogMessage.put(keyAt, arrayList5);
                        int i11 = 0;
                        while (i11 < arrayList6.size()) {
                            MessageObject messageObject5 = arrayList6.get(i11);
                            if (messageObject5 == null) {
                                j = keyAt;
                            } else {
                                j = keyAt;
                                if (messageObject5.messageOwner.peer_id.channel_id == 0) {
                                    this.dialogMessagesByIds.remove(messageObject5.getId());
                                }
                                long j6 = messageObject5.messageOwner.random_id;
                                if (j6 != 0) {
                                    this.dialogMessagesByRandomIds.remove(j6);
                                }
                            }
                            i11++;
                            keyAt = j;
                        }
                        long j7 = keyAt;
                        if (arrayList5 != null) {
                            for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                                MessageObject messageObject6 = arrayList5.get(i12);
                                if (messageObject6 != null && messageObject6.messageOwner.peer_id.channel_id == 0) {
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= arrayList6.size()) {
                                            break;
                                        }
                                        MessageObject messageObject7 = arrayList6.get(i13);
                                        if (messageObject7 != null && messageObject7.getId() == messageObject6.getId()) {
                                            messageObject6.deleted = messageObject7.deleted;
                                            break;
                                        }
                                        i13++;
                                    }
                                    this.dialogMessagesByIds.put(messageObject6.getId(), messageObject6);
                                    long j8 = messageObject6.messageOwner.random_id;
                                    if (j8 != 0) {
                                        this.dialogMessagesByRandomIds.put(j8, messageObject6);
                                    }
                                }
                            }
                        }
                        getTranslateController().checkDialogMessage(j7);
                    }
                }
            }
            this.allDialogs.clear();
            int size2 = this.dialogs_dict.size();
            for (int i14 = 0; i14 < size2; i14++) {
                TLRPC$Dialog valueAt = this.dialogs_dict.valueAt(i14);
                if (this.deletingDialogs.indexOfKey(valueAt.id) < 0) {
                    this.allDialogs.add(valueAt);
                }
            }
            sortDialogs(null);
            i2 = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        } else {
            i2 = 0;
        }
        if (i != 0) {
            getUserConfig().filtersLoaded = true;
            getUserConfig().saveConfig(i2);
            this.loadingRemoteFilters = i2;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.filterSettingsUpdated, new Object[i2]);
        }
        lockFiltersInternal();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static int lambda$processLoadedDialogFilters$18(DialogFilter dialogFilter, DialogFilter dialogFilter2) {
        int i = dialogFilter.order;
        int i2 = dialogFilter2.order;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void loadSuggestedFilters() {
        if (this.loadingSuggestedFilters) {
            return;
        }
        this.loadingSuggestedFilters = true;
        getConnectionsManager().sendRequest(new TLObject() {
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
                abstractSerializedData.writeInt32(-1566780372);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadSuggestedFilters$22(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadSuggestedFilters$22(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadSuggestedFilters$21(tLObject);
            }
        });
    }

    public void lambda$loadSuggestedFilters$21(TLObject tLObject) {
        this.loadingSuggestedFilters = false;
        this.suggestedFilters.clear();
        if (tLObject instanceof TLRPC$Vector) {
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            int size = tLRPC$Vector.objects.size();
            for (int i = 0; i < size; i++) {
                this.suggestedFilters.add((TLRPC$TL_dialogFilterSuggested) tLRPC$Vector.objects.get(i));
            }
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.suggestedFiltersLoaded, new Object[0]);
    }

    public void loadRemoteFilters(boolean z) {
        loadRemoteFilters(z, null);
    }

    public void loadRemoteFilters(boolean z, Utilities.Callback<Boolean> callback) {
        if (callback != null) {
            this.onLoadedRemoteFilters = callback;
        }
        if (this.loadingRemoteFilters || !getUserConfig().isClientActivated()) {
            return;
        }
        if (z || !getUserConfig().filtersLoaded) {
            if (z) {
                getUserConfig().filtersLoaded = false;
                getUserConfig().saveConfig(false);
            }
            getConnectionsManager().sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z2) {
                    TLRPC$Vector tLRPC$Vector = new TLRPC$Vector();
                    int readInt32 = abstractSerializedData.readInt32(z2);
                    for (int i2 = 0; i2 < readInt32; i2++) {
                        TLRPC$DialogFilter TLdeserialize = TLRPC$DialogFilter.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return tLRPC$Vector;
                        }
                        tLRPC$Vector.objects.add(TLdeserialize);
                    }
                    return tLRPC$Vector;
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(-241247891);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadRemoteFilters$25(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadRemoteFilters$25(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$Vector) {
            getMessagesStorage().checkLoadedRemoteFilters((TLRPC$Vector) tLObject, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadRemoteFilters$23();
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadRemoteFilters$24();
                }
            });
        }
    }

    public void lambda$loadRemoteFilters$23() {
        Utilities.Callback<Boolean> callback = this.onLoadedRemoteFilters;
        if (callback != null) {
            callback.run(Boolean.TRUE);
            this.onLoadedRemoteFilters = null;
        }
    }

    public void lambda$loadRemoteFilters$24() {
        this.loadingRemoteFilters = false;
        Utilities.Callback<Boolean> callback = this.onLoadedRemoteFilters;
        if (callback != null) {
            callback.run(Boolean.FALSE);
            this.onLoadedRemoteFilters = null;
        }
    }

    public void logDeviceStats() {
        if (!this.collectDeviceStats || this.loggedDeviceStats) {
            return;
        }
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        if (!rootDirs.isEmpty()) {
            int i = 0;
            String absolutePath = rootDirs.get(0).getAbsolutePath();
            if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                int size = rootDirs.size();
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    String absolutePath2 = rootDirs.get(i).getAbsolutePath();
                    if (absolutePath2.startsWith(SharedConfig.storageCacheDir)) {
                        absolutePath = absolutePath2;
                        break;
                    }
                    i++;
                }
            }
            boolean contains = absolutePath.contains("/storage/emulated/");
            TLRPC$TL_help_saveAppLog tLRPC$TL_help_saveAppLog = new TLRPC$TL_help_saveAppLog();
            TLRPC$TL_inputAppEvent tLRPC$TL_inputAppEvent = new TLRPC$TL_inputAppEvent();
            tLRPC$TL_inputAppEvent.time = getConnectionsManager().getCurrentTime();
            tLRPC$TL_inputAppEvent.type = "android_sdcard_exists";
            TLRPC$TL_jsonBool tLRPC$TL_jsonBool = new TLRPC$TL_jsonBool();
            tLRPC$TL_jsonBool.value = contains;
            tLRPC$TL_inputAppEvent.data = tLRPC$TL_jsonBool;
            tLRPC$TL_inputAppEvent.peer = contains ? 1L : 0L;
            tLRPC$TL_help_saveAppLog.events.add(tLRPC$TL_inputAppEvent);
            getConnectionsManager().sendRequest(tLRPC$TL_help_saveAppLog, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$logDeviceStats$26(tLObject, tLRPC$TL_error);
                }
            });
        }
        this.loggedDeviceStats = true;
    }

    public void selectDialogFilter(DialogFilter dialogFilter, int i) {
        DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
        if (dialogFilterArr[i] == dialogFilter) {
            return;
        }
        DialogFilter dialogFilter2 = dialogFilterArr[i];
        dialogFilterArr[i] = dialogFilter;
        if (dialogFilterArr[i == 0 ? (char) 1 : (char) 0] == dialogFilter) {
            dialogFilterArr[i != 0 ? (char) 0 : (char) 1] = null;
        }
        if (dialogFilterArr[i] != null) {
            sortDialogs(null);
        } else if (dialogFilter2 != null) {
            dialogFilter2.dialogs.clear();
            dialogFilter2.dialogsForward.clear();
        }
    }

    public void onFilterUpdate(DialogFilter dialogFilter) {
        for (int i = 0; i < 2; i++) {
            if (this.selectedDialogFilter[i] == dialogFilter) {
                sortDialogs(null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
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
            if (this.dialogFilters.get(0).isDefault()) {
                this.dialogFilters.add(1, dialogFilter);
            } else {
                this.dialogFilters.add(0, dialogFilter);
            }
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
        lockFiltersInternal();
    }

    public void updateEmojiStatus(TLRPC$EmojiStatus tLRPC$EmojiStatus) {
        TLRPC$TL_account_updateEmojiStatus tLRPC$TL_account_updateEmojiStatus = new TLRPC$TL_account_updateEmojiStatus();
        tLRPC$TL_account_updateEmojiStatus.emoji_status = tLRPC$EmojiStatus;
        TLRPC$User currentUser = getUserConfig().getCurrentUser();
        if (currentUser != null) {
            currentUser.emoji_status = tLRPC$TL_account_updateEmojiStatus.emoji_status;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
            getMessagesController().updateEmojiStatusUntilUpdate(currentUser.id, currentUser.emoji_status);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_account_updateEmojiStatus, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$updateEmojiStatus$27(tLObject, tLRPC$TL_error);
            }
        });
    }

    public static void lambda$updateEmojiStatus$27(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        boolean z = tLObject instanceof TLRPC$TL_boolTrue;
    }

    public void removeFilter(DialogFilter dialogFilter) {
        this.dialogFilters.remove(dialogFilter);
        this.dialogFiltersById.remove(dialogFilter.id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
    }

    public void loadAppConfig() {
        loadAppConfig(false);
    }

    public void lambda$loadAppConfig$29(final TLRPC$TL_help_appConfig tLRPC$TL_help_appConfig) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadAppConfig$28(tLRPC$TL_help_appConfig);
            }
        });
    }

    public void loadAppConfig(boolean z) {
        if (z) {
            this.appConfigFetcher.forceRequest(this.currentAccount, 0);
        }
        this.appConfigFetcher.fetch(this.currentAccount, 0, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                MessagesController.this.lambda$loadAppConfig$29((TLRPC$TL_help_appConfig) obj);
            }
        });
    }

    public void lambda$loadAppConfig$28(TLRPC$TL_help_appConfig tLRPC$TL_help_appConfig) {
        if (tLRPC$TL_help_appConfig != null) {
            TLRPC$JSONValue tLRPC$JSONValue = tLRPC$TL_help_appConfig.config;
            if (tLRPC$JSONValue instanceof TLRPC$TL_jsonObject) {
                applyAppConfig((TLRPC$TL_jsonObject) tLRPC$JSONValue);
            }
        }
    }

    private void applyAppConfig(org.telegram.tgnet.TLRPC$TL_jsonObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.applyAppConfig(org.telegram.tgnet.TLRPC$TL_jsonObject):void");
    }

    public void lambda$applyAppConfig$30() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesEnabledUpdate, new Object[0]);
    }

    public void updateTranscribeAudioTrialCurrentNumber(int i) {
        if (i != this.transcribeAudioTrialCurrentNumber) {
            this.transcribeAudioTrialCurrentNumber = i;
            this.mainPreferences.edit().putInt("transcribeAudioTrialCurrentNumber", this.transcribeAudioTrialCurrentNumber).apply();
        }
    }

    public void updateTranscribeAudioTrialCooldownUntil(int i) {
        if (i != this.transcribeAudioTrialCooldownUntil) {
            this.transcribeAudioTrialCooldownUntil = i;
            this.mainPreferences.edit().putInt("transcribeAudioTrialCooldownUntil", this.transcribeAudioTrialCooldownUntil).apply();
            scheduleTranscriptionUpdate();
        }
    }

    private void scheduleTranscriptionUpdate() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$scheduleTranscriptionUpdate$31();
            }
        });
    }

    public void lambda$scheduleTranscriptionUpdate$31() {
        AndroidUtilities.cancelRunOnUIThread(this.notifyTranscriptionAudioCooldownUpdate);
        long currentTime = this.transcribeAudioTrialCooldownUntil - getConnectionsManager().getCurrentTime();
        if (currentTime > 0) {
            AndroidUtilities.runOnUIThread(this.notifyTranscriptionAudioCooldownUpdate, currentTime);
        }
    }

    public void lambda$new$32() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    public static class PeerColors {
        public static final int TYPE_NAME = 0;
        public static final int TYPE_PROFILE = 1;
        public final ArrayList<PeerColor> colors = new ArrayList<>();
        private final LongSparseArray<PeerColor> colorsById = new LongSparseArray<>();
        public final int hash;
        public final int type;

        public boolean needUpdate() {
            boolean z = true;
            boolean z2 = false;
            for (int i = 0; i < this.colors.size(); i++) {
                if (this.colors.get(i).lvl > 0) {
                    z = false;
                }
                if (this.colors.get(i).id < 7) {
                    z2 = true;
                }
            }
            return z || (this.type == 0 && !z2);
        }

        public int colorsAvailable(int i) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.colors.size(); i3++) {
                if (!this.colors.get(i3).hidden && i >= this.colors.get(i3).lvl) {
                    i2++;
                }
            }
            return i2;
        }

        public int maxLevel() {
            int i = 0;
            for (int i2 = 0; i2 < this.colors.size(); i2++) {
                if (!this.colors.get(i2).hidden) {
                    i = Math.max(i, this.colors.get(i2).lvl);
                }
            }
            return i;
        }

        public int minLevel() {
            int maxLevel = maxLevel();
            for (int i = 0; i < this.colors.size(); i++) {
                if (!this.colors.get(i).hidden) {
                    maxLevel = Math.min(maxLevel, this.colors.get(i).lvl);
                }
            }
            return maxLevel;
        }

        private PeerColors(int i, int i2) {
            this.type = i;
            this.hash = i2;
        }

        public PeerColor getColor(int i) {
            return this.colorsById.get(i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.hash != 0) {
                sb.append("@");
                sb.append(this.hash);
                sb.append("^");
            }
            for (int i = 0; i < this.colors.size(); i++) {
                PeerColor peerColor = this.colors.get(i);
                if (i > 0) {
                    sb.append(";");
                }
                peerColor.appendString(sb);
            }
            return sb.toString();
        }

        public static PeerColors fromString(int i, String str) {
            int i2;
            int indexOf;
            if (str == null) {
                return null;
            }
            if (!str.startsWith("@") || (indexOf = str.indexOf("^")) < 0) {
                i2 = 0;
            } else {
                i2 = Utilities.parseInt((CharSequence) str.substring(1, indexOf)).intValue();
                str = str.substring(indexOf + 1);
            }
            PeerColors peerColors = new PeerColors(i, i2);
            for (String str2 : str.split(";")) {
                PeerColor fromString = PeerColor.fromString(str2);
                if (fromString != null) {
                    fromString.isDefaultName = fromString.id < 7 && i == 0;
                    if (!fromString.hidden) {
                        peerColors.colors.add(fromString);
                    }
                    peerColors.colorsById.put(fromString.id, fromString);
                }
            }
            return peerColors;
        }

        private static int color(String str) {
            return MessagesController$PeerColors$$ExternalSyntheticBackport0.m("ff" + str, 16);
        }

        public static PeerColors fromTL(int i, TLRPC$TL_help_peerColors tLRPC$TL_help_peerColors) {
            if (tLRPC$TL_help_peerColors == null) {
                return null;
            }
            try {
                PeerColors peerColors = new PeerColors(i, tLRPC$TL_help_peerColors.hash);
                for (int i2 = 0; i2 < tLRPC$TL_help_peerColors.colors.size(); i2++) {
                    PeerColor fromTL = PeerColor.fromTL(tLRPC$TL_help_peerColors.colors.get(i2));
                    if (fromTL != null) {
                        fromTL.isDefaultName = fromTL.id < 7 && i == 0;
                        if (!fromTL.hidden) {
                            peerColors.colors.add(fromTL);
                        }
                        peerColors.colorsById.put(fromTL.id, fromTL);
                    }
                }
                return peerColors;
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }

        public static PeerColors fromJSON(int i, TLRPC$TL_jsonObject tLRPC$TL_jsonObject, TLRPC$TL_jsonObject tLRPC$TL_jsonObject2, TLRPC$TL_jsonArray tLRPC$TL_jsonArray) {
            PeerColor peerColor;
            long j;
            PeerColor peerColor2;
            try {
                PeerColors peerColors = new PeerColors(i, 0);
                if (tLRPC$TL_jsonObject != null) {
                    Iterator<TLRPC$TL_jsonObjectValue> it = tLRPC$TL_jsonObject.value.iterator();
                    while (it.hasNext()) {
                        TLRPC$TL_jsonObjectValue next = it.next();
                        int intValue = Utilities.parseInt((CharSequence) next.key).intValue();
                        TLRPC$JSONValue tLRPC$JSONValue = next.value;
                        if (tLRPC$JSONValue instanceof TLRPC$TL_jsonArray) {
                            ArrayList<TLRPC$JSONValue> arrayList = ((TLRPC$TL_jsonArray) tLRPC$JSONValue).value;
                            if (!arrayList.isEmpty()) {
                                PeerColor peerColor3 = new PeerColor();
                                try {
                                    peerColor3.id = intValue;
                                    int i2 = 0;
                                    while (i2 < 6) {
                                        int[] iArr = peerColor3.colors;
                                        int[] iArr2 = peerColor3.darkColors;
                                        int color = arrayList.size() > i2 ? color(((TLRPC$TL_jsonString) arrayList.get(i2)).value) : peerColor3.colors[0];
                                        iArr2[i2] = color;
                                        iArr[i2] = color;
                                        i2++;
                                    }
                                    peerColor3.isDefaultName = peerColor3.id < 7 && i == 0;
                                    peerColors.colorsById.put(intValue, peerColor3);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                        }
                    }
                }
                if (tLRPC$TL_jsonObject2 != null) {
                    Iterator<TLRPC$TL_jsonObjectValue> it2 = tLRPC$TL_jsonObject2.value.iterator();
                    while (it2.hasNext()) {
                        TLRPC$TL_jsonObjectValue next2 = it2.next();
                        int intValue2 = Utilities.parseInt((CharSequence) next2.key).intValue();
                        TLRPC$JSONValue tLRPC$JSONValue2 = next2.value;
                        if (tLRPC$JSONValue2 instanceof TLRPC$TL_jsonArray) {
                            ArrayList<TLRPC$JSONValue> arrayList2 = ((TLRPC$TL_jsonArray) tLRPC$JSONValue2).value;
                            if (!arrayList2.isEmpty() && (peerColor2 = peerColors.colorsById.get(intValue2)) != null) {
                                try {
                                    peerColor2.id = intValue2;
                                    int i3 = 0;
                                    while (i3 < 6) {
                                        peerColor2.darkColors[i3] = arrayList2.size() > i3 ? color(((TLRPC$TL_jsonString) arrayList2.get(i3)).value) : peerColor2.darkColors[0];
                                        i3++;
                                    }
                                    peerColors.colorsById.put(j, peerColor2);
                                } catch (Exception e2) {
                                    FileLog.e(e2);
                                }
                            }
                        }
                    }
                }
                peerColors.colors.clear();
                if (tLRPC$TL_jsonArray != null) {
                    Iterator<TLRPC$JSONValue> it3 = tLRPC$TL_jsonArray.value.iterator();
                    while (it3.hasNext()) {
                        TLRPC$JSONValue next3 = it3.next();
                        if ((next3 instanceof TLRPC$TL_jsonNumber) && (peerColor = peerColors.colorsById.get((int) ((TLRPC$TL_jsonNumber) next3).value)) != null) {
                            peerColors.colors.add(peerColor);
                        }
                    }
                }
                return peerColors;
            } catch (Exception e3) {
                FileLog.e(e3);
                return null;
            }
        }
    }

    public static class PeerColor {
        private final int[] colors = new int[6];
        private final int[] darkColors = new int[6];
        public boolean hidden;
        public int id;
        public boolean isDefaultName;
        public int lvl;

        public int getColor(int i, Theme.ResourcesProvider resourcesProvider) {
            int i2;
            if (i < 0 || i > 5) {
                return 0;
            }
            if (!this.isDefaultName || (i2 = this.id) < 0 || i2 >= 7) {
                return (resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[i];
            }
            return Theme.getColor(Theme.keys_avatar_nameInMessage[i2], resourcesProvider);
        }

        public int getColor1(boolean z) {
            return (z ? this.darkColors : this.colors)[0];
        }

        public int getColor2(boolean z) {
            return (z ? this.darkColors : this.colors)[1];
        }

        public int getColor3(boolean z) {
            return (z ? this.darkColors : this.colors)[2];
        }

        public int getColor4(boolean z) {
            return (z ? this.darkColors : this.colors)[3];
        }

        public int getColor5(boolean z) {
            return (z ? this.darkColors : this.colors)[4];
        }

        public int getColor6(boolean z) {
            return (z ? this.darkColors : this.colors)[5];
        }

        public int getColor1() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[0];
        }

        public int getColor2() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[1];
        }

        public int getColor3() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[2];
        }

        public int getColor4() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[3];
        }

        public int getColor5() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[4];
        }

        public boolean hasColor2() {
            return getColor2() != getColor1();
        }

        public boolean hasColor3() {
            return getColor3() != getColor1();
        }

        public boolean hasColor2(boolean z) {
            return getColor2(z) != getColor1(z);
        }

        public boolean hasColor3(boolean z) {
            return getColor3(z) != getColor1(z);
        }

        public boolean hasColor6(boolean z) {
            return getColor6(z) != getColor1(z);
        }

        public int getBgColor1(boolean z) {
            return hasColor6(z) ? getColor3(z) : getColor2(z);
        }

        public int getBgColor2(boolean z) {
            return hasColor6(z) ? getColor4(z) : getColor2(z);
        }

        public int getStoryColor1(boolean z) {
            return hasColor6(z) ? getColor5(z) : getColor3(z);
        }

        public int getStoryColor2(boolean z) {
            return hasColor6(z) ? getColor6(z) : getColor4(z);
        }

        public int getAvatarColor1() {
            return ColorUtils.blendARGB(getBgColor2(false), getStoryColor2(false), 0.5f);
        }

        public int getAvatarColor2() {
            return ColorUtils.blendARGB(getBgColor1(false), getStoryColor1(false), 0.5f);
        }

        public void appendString(StringBuilder sb) {
            sb.append("#");
            if (this.hidden) {
                sb.append("H");
            }
            if (this.lvl > 0) {
                sb.append("[");
                sb.append(this.lvl);
                sb.append("]");
            }
            sb.append(this.id);
            sb.append("{");
            sb.append(this.colors[0]);
            int[] iArr = this.colors;
            if (iArr[1] != iArr[0]) {
                sb.append(",");
                sb.append(this.colors[1]);
                int[] iArr2 = this.colors;
                if (iArr2[2] != iArr2[0] || iArr2[3] != iArr2[0]) {
                    sb.append(",");
                    sb.append(this.colors[2]);
                    sb.append(",");
                    sb.append(this.colors[3]);
                    int[] iArr3 = this.colors;
                    if (iArr3[4] != iArr3[0] || iArr3[5] != iArr3[0]) {
                        sb.append(",");
                        sb.append(this.colors[4]);
                        sb.append(",");
                        sb.append(this.colors[5]);
                    }
                }
            }
            int[] iArr4 = this.darkColors;
            int i = iArr4[0];
            int[] iArr5 = this.colors;
            if (i != iArr5[0] || iArr4[1] != iArr5[1] || iArr4[2] != iArr5[2]) {
                sb.append("@");
                sb.append(this.darkColors[0]);
                int[] iArr6 = this.darkColors;
                if (iArr6[1] != iArr6[0]) {
                    sb.append(",");
                    sb.append(this.darkColors[1]);
                    int[] iArr7 = this.darkColors;
                    if (iArr7[2] != iArr7[0] || iArr7[3] != iArr7[0]) {
                        sb.append(",");
                        sb.append(this.darkColors[2]);
                        sb.append(",");
                        sb.append(this.darkColors[3]);
                        int[] iArr8 = this.darkColors;
                        if (iArr8[4] != iArr8[0] || iArr8[5] != iArr8[0]) {
                            sb.append(",");
                            sb.append(this.darkColors[4]);
                            sb.append(",");
                            sb.append(this.darkColors[5]);
                        }
                    }
                }
            }
            sb.append("}");
        }

        public static PeerColor fromTL(TLRPC$TL_help_peerColorOption tLRPC$TL_help_peerColorOption) {
            if (tLRPC$TL_help_peerColorOption == null) {
                return null;
            }
            PeerColor peerColor = new PeerColor();
            peerColor.id = tLRPC$TL_help_peerColorOption.color_id;
            peerColor.hidden = tLRPC$TL_help_peerColorOption.hidden;
            if ((tLRPC$TL_help_peerColorOption.flags & 8) != 0) {
                peerColor.lvl = tLRPC$TL_help_peerColorOption.channel_min_level;
            }
            System.arraycopy(optionToColors(tLRPC$TL_help_peerColorOption.colors), 0, peerColor.colors, 0, 6);
            System.arraycopy(optionToColors(tLRPC$TL_help_peerColorOption.dark_colors), 0, peerColor.darkColors, 0, 6);
            return peerColor;
        }

        public static int[] optionToColors(TLRPC$help_PeerColorSet tLRPC$help_PeerColorSet) {
            ArrayList<Integer> arrayList;
            int[] iArr = {0, 0, 0, 0, 0, 0};
            if (tLRPC$help_PeerColorSet instanceof TLRPC$TL_help_peerColorSet) {
                arrayList = ((TLRPC$TL_help_peerColorSet) tLRPC$help_PeerColorSet).colors;
            } else if (tLRPC$help_PeerColorSet instanceof TLRPC$TL_help_peerColorProfileSet) {
                TLRPC$TL_help_peerColorProfileSet tLRPC$TL_help_peerColorProfileSet = (TLRPC$TL_help_peerColorProfileSet) tLRPC$help_PeerColorSet;
                ArrayList<Integer> arrayList2 = tLRPC$TL_help_peerColorProfileSet.palette_colors;
                ArrayList<Integer> arrayList3 = tLRPC$TL_help_peerColorProfileSet.bg_colors;
                ArrayList<Integer> arrayList4 = tLRPC$TL_help_peerColorProfileSet.story_colors;
                ArrayList<Integer> arrayList5 = new ArrayList<>();
                if (arrayList2 != null) {
                    for (int i = 0; i < Math.min(2, arrayList2.size()); i++) {
                        arrayList5.add(arrayList2.get(i));
                    }
                }
                if (arrayList3 != null) {
                    for (int i2 = 0; i2 < Math.min(2, arrayList3.size()); i2++) {
                        arrayList5.add(arrayList3.get(i2));
                    }
                }
                if (arrayList4 != null) {
                    for (int i3 = 0; i3 < Math.min(2, arrayList4.size()); i3++) {
                        arrayList5.add(arrayList4.get(i3));
                    }
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Arrays.fill(iArr, arrayList.get(0).intValue() | (-16777216));
                }
                for (int i4 = 0; i4 < Math.min(6, arrayList.size()); i4++) {
                    iArr[i4] = arrayList.get(i4).intValue() | (-16777216);
                }
            }
            return iArr;
        }

        public static PeerColor fromString(String str) {
            int i;
            int indexOf;
            if (str != null && !str.isEmpty()) {
                if (str.charAt(0) == '#') {
                    boolean z = str.length() > 1 && str.charAt(1) == 'H';
                    int i2 = z ? 2 : 1;
                    if (str.length() <= i2 || str.charAt(i2) != '[' || (indexOf = str.indexOf(93)) <= i2) {
                        i = 0;
                    } else {
                        int i3 = indexOf + 1;
                        i = Utilities.parseInt((CharSequence) str.substring(i2 + 1, indexOf)).intValue();
                        i2 = i3;
                    }
                    int indexOf2 = str.indexOf(123);
                    if (indexOf2 < 0) {
                        return null;
                    }
                    try {
                        PeerColor peerColor = new PeerColor();
                        peerColor.id = Utilities.parseInt((CharSequence) str.substring(i2, indexOf2)).intValue();
                        peerColor.hidden = z;
                        peerColor.lvl = i;
                        String[] split = str.substring(indexOf2 + 1, str.length() - 1).split("@");
                        String[] split2 = split[0].split(",");
                        int i4 = 0;
                        while (i4 < 6) {
                            int[] iArr = peerColor.colors;
                            int i5 = i4 + 1;
                            iArr[i4] = split2.length >= i5 ? Utilities.parseInt((CharSequence) split2[i4]).intValue() : iArr[0];
                            i4 = i5;
                        }
                        if (split.length >= 2) {
                            String[] split3 = split[1].split(",");
                            int i6 = 0;
                            while (i6 < 6) {
                                int[] iArr2 = peerColor.darkColors;
                                int i7 = i6 + 1;
                                iArr2[i6] = split3.length >= i7 ? Utilities.parseInt((CharSequence) split3[i6]).intValue() : iArr2[0];
                                i6 = i7;
                            }
                        } else {
                            for (int i8 = 0; i8 < 6; i8++) {
                                peerColor.darkColors[i8] = peerColor.colors[i8];
                            }
                        }
                        return peerColor;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            return null;
        }
    }

    private void resetAppConfig() {
        this.getfileExperimentalParams = false;
        this.collectDeviceStats = false;
        this.mainPreferences.edit().remove("getfileExperimentalParams").apply();
    }

    private boolean savePremiumFeaturesPreviewOrder(SharedPreferences.Editor editor, ArrayList<TLRPC$JSONValue> arrayList) {
        int serverStringToFeatureType;
        StringBuilder sb = new StringBuilder();
        this.premiumFeaturesTypesToPosition.clear();
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            String str = arrayList.get(i) instanceof TLRPC$TL_jsonString ? ((TLRPC$TL_jsonString) arrayList.get(i)).value : null;
            if (str != null && (serverStringToFeatureType = PremiumPreviewFragment.serverStringToFeatureType(str)) >= 0) {
                this.premiumFeaturesTypesToPosition.put(serverStringToFeatureType, i);
                if (sb.length() > 0) {
                    sb.append('_');
                }
                sb.append(serverStringToFeatureType);
            }
            i++;
        }
        if (sb.length() > 0) {
            String sb2 = sb.toString();
            boolean z = !sb2.equals(this.mainPreferences.getString("premiumFeaturesTypesToPosition", null));
            editor.putString("premiumFeaturesTypesToPosition", sb2);
            return z;
        }
        editor.remove("premiumFeaturesTypesToPosition");
        return this.mainPreferences.getString("premiumFeaturesTypesToPosition", null) != null;
    }

    private void loadPremiumFeaturesPreviewOrder(String str) {
        this.premiumFeaturesTypesToPosition.clear();
        if (str != null) {
            String[] split = str.split("_");
            for (int i = 0; i < split.length; i++) {
                this.premiumFeaturesTypesToPosition.put(Integer.parseInt(split[i]), i);
            }
        }
    }

    public void removeSuggestion(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (j == 0) {
            if (!this.pendingSuggestions.remove(str)) {
                return;
            }
            SharedPreferences.Editor edit = this.mainPreferences.edit();
            edit.putStringSet("pendingSuggestions", this.pendingSuggestions);
            edit.commit();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        }
        TLRPC$TL_help_dismissSuggestion tLRPC$TL_help_dismissSuggestion = new TLRPC$TL_help_dismissSuggestion();
        tLRPC$TL_help_dismissSuggestion.suggestion = str;
        if (j == 0) {
            tLRPC$TL_help_dismissSuggestion.peer = new TLRPC$TL_inputPeerEmpty();
        } else {
            tLRPC$TL_help_dismissSuggestion.peer = getInputPeer(j);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_help_dismissSuggestion, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$removeSuggestion$33(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void updateConfig(final TLRPC$TL_config tLRPC$TL_config) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$updateConfig$34(tLRPC$TL_config);
            }
        });
    }

    public void lambda$updateConfig$34(TLRPC$TL_config tLRPC$TL_config) {
        getDownloadController().loadAutoDownloadConfig(false);
        loadAppConfig(true);
        checkPeerColors(true);
        this.remoteConfigLoaded = true;
        this.maxMegagroupCount = tLRPC$TL_config.megagroup_size_max;
        this.maxGroupCount = tLRPC$TL_config.chat_size_max;
        this.maxEditTime = tLRPC$TL_config.edit_time_limit;
        this.ratingDecay = tLRPC$TL_config.rating_e_decay;
        this.maxRecentStickersCount = tLRPC$TL_config.stickers_recent_limit;
        this.revokeTimeLimit = tLRPC$TL_config.revoke_time_limit;
        this.revokeTimePmLimit = tLRPC$TL_config.revoke_pm_time_limit;
        this.canRevokePmInbox = tLRPC$TL_config.revoke_pm_inbox;
        String str = tLRPC$TL_config.me_url_prefix;
        this.linkPrefix = str;
        boolean z = tLRPC$TL_config.force_try_ipv6;
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
            boolean z2 = str6 == null || !str6.equals(str5);
            this.suggestedLangCode = tLRPC$TL_config.suggested_lang_code;
            if (z2) {
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
        edit.putInt("maxFolderPinnedDialogsCountDefault", this.maxFolderPinnedDialogsCountDefault);
        edit.putInt("maxFolderPinnedDialogsCountPremium", this.maxFolderPinnedDialogsCountPremium);
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
        edit.putBoolean("forceTryIpV6", z);
        String str8 = tLRPC$TL_config.autologin_token;
        this.autologinToken = str8;
        edit.putString("autologinToken", str8);
        edit.commit();
        getConnectionsManager().setForceTryIpV6(z);
        LocaleController.getInstance().checkUpdateForCurrentRemoteLocale(this.currentAccount, tLRPC$TL_config.lang_pack_version, tLRPC$TL_config.base_lang_pack_version);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.configLoaded, new Object[0]);
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
        if ((tLRPC$Chat instanceof TLRPC$TL_channel) || (tLRPC$Chat instanceof TLRPC$TL_channelForbidden)) {
            TLRPC$TL_inputChannel tLRPC$TL_inputChannel = new TLRPC$TL_inputChannel();
            tLRPC$TL_inputChannel.channel_id = tLRPC$Chat.id;
            tLRPC$TL_inputChannel.access_hash = tLRPC$Chat.access_hash;
            return tLRPC$TL_inputChannel;
        }
        return new TLRPC$TL_inputChannelEmpty();
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
            if (chat != null) {
                tLRPC$TL_inputPeerChannel.access_hash = chat.access_hash;
                return tLRPC$TL_inputPeerChannel;
            }
            return tLRPC$TL_inputPeerChannel;
        } else {
            TLRPC$TL_inputPeerUser tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
            long j2 = tLRPC$Peer.user_id;
            tLRPC$TL_inputPeerUser.user_id = j2;
            TLRPC$User user = getUser(Long.valueOf(j2));
            if (user != null) {
                tLRPC$TL_inputPeerUser.access_hash = user.access_hash;
                return tLRPC$TL_inputPeerUser;
            }
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
        if (user != null) {
            tLRPC$TL_inputPeerUser.access_hash = user.access_hash;
            return tLRPC$TL_inputPeerUser;
        }
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
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        tLRPC$TL_peerUser.user_id = j;
        return tLRPC$TL_peerUser;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageObject messageObject;
        TLRPC$InputFile tLRPC$InputFile;
        final Theme.ThemeInfo themeInfo;
        TLRPC$InputFile tLRPC$InputFile2;
        final Theme.ThemeAccent themeAccent;
        TLRPC$TL_theme tLRPC$TL_theme;
        TLRPC$TL_inputThemeSettings tLRPC$TL_inputThemeSettings = null;
        if (i == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC$InputFile tLRPC$InputFile3 = (TLRPC$InputFile) objArr[1];
            String str2 = this.uploadingAvatar;
            if (str2 != null && str2.equals(str)) {
                TLRPC$TL_photos_uploadProfilePhoto tLRPC$TL_photos_uploadProfilePhoto = new TLRPC$TL_photos_uploadProfilePhoto();
                tLRPC$TL_photos_uploadProfilePhoto.file = tLRPC$InputFile3;
                tLRPC$TL_photos_uploadProfilePhoto.flags |= 1;
                getConnectionsManager().sendRequest(tLRPC$TL_photos_uploadProfilePhoto, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$didReceivedNotification$36(tLObject, tLRPC$TL_error);
                    }
                });
            } else {
                String str3 = this.uploadingWallpaper;
                if (str3 != null && str3.equals(str)) {
                    TLRPC$TL_account_uploadWallPaper tLRPC$TL_account_uploadWallPaper = new TLRPC$TL_account_uploadWallPaper();
                    tLRPC$TL_account_uploadWallPaper.file = tLRPC$InputFile3;
                    tLRPC$TL_account_uploadWallPaper.mime_type = "image/jpeg";
                    final Theme.OverrideWallpaperInfo overrideWallpaperInfo = this.uploadingWallpaperInfo;
                    final String str4 = this.uploadingWallpaper;
                    final TLRPC$TL_wallPaperSettings tLRPC$TL_wallPaperSettings = new TLRPC$TL_wallPaperSettings();
                    tLRPC$TL_wallPaperSettings.blur = overrideWallpaperInfo.isBlurred;
                    tLRPC$TL_wallPaperSettings.motion = overrideWallpaperInfo.isMotion;
                    tLRPC$TL_account_uploadWallPaper.settings = tLRPC$TL_wallPaperSettings;
                    Theme.OverrideWallpaperInfo overrideWallpaperInfo2 = this.uploadingWallpaperInfo;
                    overrideWallpaperInfo2.uploadingProgress = 1.0f;
                    overrideWallpaperInfo2.requestIds = new ArrayList<>();
                    this.uploadingWallpaperInfo.requestIds.add(Integer.valueOf(getConnectionsManager().sendRequest(tLRPC$TL_account_uploadWallPaper, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$didReceivedNotification$38(overrideWallpaperInfo, tLRPC$TL_wallPaperSettings, str4, tLObject, tLRPC$TL_error);
                        }
                    })));
                } else {
                    Object obj = this.uploadingThemes.get(str);
                    if (obj instanceof Theme.ThemeInfo) {
                        themeInfo = (Theme.ThemeInfo) obj;
                        if (str.equals(themeInfo.uploadingThumb)) {
                            themeInfo.uploadedThumb = tLRPC$InputFile3;
                            themeInfo.uploadingThumb = null;
                        } else if (str.equals(themeInfo.uploadingFile)) {
                            themeInfo.uploadedFile = tLRPC$InputFile3;
                            themeInfo.uploadingFile = null;
                        }
                        tLRPC$InputFile = themeInfo.uploadedThumb;
                        tLRPC$InputFile2 = themeInfo.uploadedFile;
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
                        Theme.ThemeInfo themeInfo2 = themeAccent2.parentTheme;
                        TLRPC$InputFile tLRPC$InputFile4 = themeAccent2.uploadedThumb;
                        TLRPC$InputFile tLRPC$InputFile5 = themeAccent2.uploadedFile;
                        themeInfo = themeInfo2;
                        tLRPC$InputFile = tLRPC$InputFile4;
                        tLRPC$InputFile2 = tLRPC$InputFile5;
                        themeAccent = themeAccent2;
                    } else {
                        tLRPC$InputFile = null;
                        themeInfo = null;
                        tLRPC$InputFile2 = null;
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
                                MessagesController.this.lambda$didReceivedNotification$44(tLRPC$TL_theme2, themeInfo, tLRPC$TL_inputThemeSettings2, themeAccent, tLObject, tLRPC$TL_error);
                            }
                        });
                    }
                }
            }
        } else if (i == NotificationCenter.fileUploadFailed) {
            String str5 = (String) objArr[0];
            String str6 = this.uploadingAvatar;
            if (str6 != null && str6.equals(str5)) {
                this.uploadingAvatar = null;
            } else {
                String str7 = this.uploadingWallpaper;
                if (str7 != null && str7.equals(str5)) {
                    this.uploadingWallpaper = null;
                    this.uploadingWallpaperInfo = null;
                } else {
                    Object remove = this.uploadingThemes.remove(str5);
                    if (remove instanceof Theme.ThemeInfo) {
                        Theme.ThemeInfo themeInfo3 = (Theme.ThemeInfo) remove;
                        themeInfo3.uploadedFile = null;
                        themeInfo3.uploadedThumb = null;
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeInfo3, 0);
                    } else if (remove instanceof Theme.ThemeAccent) {
                        Theme.ThemeAccent themeAccent3 = (Theme.ThemeAccent) remove;
                        themeAccent3.uploadingThumb = null;
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeAccent3.parentTheme, themeAccent3);
                    }
                }
            }
        }
        if (i == NotificationCenter.fileUploadProgressChanged) {
            String str8 = (String) objArr[0];
            String str9 = this.uploadingWallpaper;
            if (str9 == null || !str9.equals(str8)) {
                return;
            }
            this.uploadingWallpaperInfo.uploadingProgress = ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue());
        } else if (i == NotificationCenter.messageReceivedByServer) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l = (Long) objArr[3];
            ArrayList<MessageObject> arrayList = this.dialogMessage.get(l.longValue());
            for (int i8 = 0; arrayList != null && i8 < arrayList.size(); i8++) {
                MessageObject messageObject2 = arrayList.get(i8);
                if (messageObject2 != null && (messageObject2.getId() == num.intValue() || messageObject2.messageOwner.local_id == num.intValue())) {
                    messageObject2.messageOwner.id = num2.intValue();
                    messageObject2.messageOwner.send_state = 0;
                }
                MessageObject messageObject3 = this.dialogMessagesByIds.get(num.intValue());
                if (messageObject3 != null) {
                    this.dialogMessagesByIds.remove(num.intValue());
                    this.dialogMessagesByIds.put(num2.intValue(), messageObject3);
                }
            }
            TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(l.longValue());
            if (tLRPC$Dialog != null && tLRPC$Dialog.top_message == num.intValue()) {
                tLRPC$Dialog.top_message = num2.intValue();
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            if (DialogObject.isChatDialog(l.longValue())) {
                TLRPC$ChatFull tLRPC$ChatFull = this.fullChats.get(-l.longValue());
                TLRPC$Chat chat = getChat(Long.valueOf(-l.longValue()));
                if (chat == null || ChatObject.hasAdminRights(chat) || tLRPC$ChatFull == null || tLRPC$ChatFull.slowmode_seconds == 0) {
                    return;
                }
                tLRPC$ChatFull.slowmode_next_send_date = getConnectionsManager().getCurrentTime() + tLRPC$ChatFull.slowmode_seconds;
                tLRPC$ChatFull.flags |= 262144;
                getMessagesStorage().updateChatInfo(tLRPC$ChatFull, false);
            }
        } else if (i == NotificationCenter.updateMessageMedia) {
            TLRPC$Message tLRPC$Message = (TLRPC$Message) objArr[0];
            if (tLRPC$Message.peer_id.channel_id != 0 || (messageObject = this.dialogMessagesByIds.get(tLRPC$Message.id)) == null) {
                return;
            }
            messageObject.messageOwner.media = MessageObject.getMedia(tLRPC$Message);
            if (MessageObject.getMedia(tLRPC$Message).ttl_seconds != 0) {
                if ((MessageObject.getMedia(tLRPC$Message).photo instanceof TLRPC$TL_photoEmpty) || (MessageObject.getMedia(tLRPC$Message).document instanceof TLRPC$TL_documentEmpty)) {
                    messageObject.setType();
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
                }
            }
        } else if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            loadAppConfig(false);
        }
    }

    public void lambda$didReceivedNotification$36(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$User user = getUser(Long.valueOf(getUserConfig().getClientUserId()));
            if (user == null) {
                user = getUserConfig().getCurrentUser();
                putUser(user, true);
            } else {
                getUserConfig().setCurrentUser(user);
            }
            if (user == null) {
                return;
            }
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
            getDialogPhotos(user.id).reset();
            getDialogPhotos(user.id).load(0, 80);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$didReceivedNotification$35();
                }
            });
        }
    }

    public void lambda$didReceivedNotification$35() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_AVATAR));
        getUserConfig().saveConfig(true);
    }

    public void lambda$didReceivedNotification$38(final Theme.OverrideWallpaperInfo overrideWallpaperInfo, final TLRPC$TL_wallPaperSettings tLRPC$TL_wallPaperSettings, final String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        final TLRPC$WallPaper tLRPC$WallPaper = (TLRPC$WallPaper) tLObject;
        final File file = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.originalFileName);
        if (tLRPC$WallPaper != null) {
            try {
                AndroidUtilities.copyFile(file, getFileLoader().getPathToAttach(tLRPC$WallPaper.document, true));
            } catch (Exception unused) {
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didReceivedNotification$37(tLRPC$WallPaper, tLRPC$TL_wallPaperSettings, overrideWallpaperInfo, file, str);
            }
        });
    }

    public void lambda$didReceivedNotification$37(TLRPC$WallPaper tLRPC$WallPaper, TLRPC$TL_wallPaperSettings tLRPC$TL_wallPaperSettings, Theme.OverrideWallpaperInfo overrideWallpaperInfo, File file, String str) {
        if (this.uploadingWallpaper == null || this.uploadingWallpaperInfo.requestIds == null || tLRPC$WallPaper == null) {
            return;
        }
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
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.wallpapersNeedReload, tLRPC$WallPaper.slug);
        ArrayList<Integer> arrayList2 = this.uploadingWallpaperInfo.requestIds;
        if (arrayList2 == null || overrideWallpaperInfo.dialogId == 0) {
            return;
        }
        arrayList2.add(Integer.valueOf(ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(overrideWallpaperInfo.dialogId, str, overrideWallpaperInfo, null, null)));
    }

    public void lambda$didReceivedNotification$44(TLRPC$TL_theme tLRPC$TL_theme, final Theme.ThemeInfo themeInfo, TLRPC$TL_inputThemeSettings tLRPC$TL_inputThemeSettings, final Theme.ThemeAccent themeAccent, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                        MessagesController.this.lambda$didReceivedNotification$40(themeInfo, themeAccent, tLObject2, tLRPC$TL_error2);
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
                    MessagesController.this.lambda$didReceivedNotification$42(themeInfo, themeAccent, tLObject2, tLRPC$TL_error2);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didReceivedNotification$43(themeInfo, themeAccent);
            }
        });
    }

    public void lambda$didReceivedNotification$40(final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didReceivedNotification$39(tLObject, themeInfo, themeAccent);
            }
        });
    }

    public void lambda$didReceivedNotification$39(TLObject tLObject, Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        if (tLObject instanceof TLRPC$TL_theme) {
            Theme.setThemeUploadInfo(themeInfo, themeAccent, (TLRPC$TL_theme) tLObject, this.currentAccount, false);
            installTheme(themeInfo, themeAccent, themeInfo == Theme.getCurrentNightTheme());
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadedToServer, themeInfo, themeAccent);
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeInfo, themeAccent);
    }

    public void lambda$didReceivedNotification$42(final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didReceivedNotification$41(tLObject, themeInfo, themeAccent);
            }
        });
    }

    public void lambda$didReceivedNotification$41(TLObject tLObject, Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        if (tLObject instanceof TLRPC$TL_theme) {
            Theme.setThemeUploadInfo(themeInfo, themeAccent, (TLRPC$TL_theme) tLObject, this.currentAccount, false);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadedToServer, themeInfo, themeAccent);
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeInfo, themeAccent);
    }

    public void lambda$didReceivedNotification$43(Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeInfo, themeAccent);
    }

    public void cleanup() {
        getContactsController().cleanup();
        MediaController.getInstance().cleanup();
        getNotificationsController().cleanup();
        getSendMessagesHelper().cleanup();
        getSecretChatHelper().cleanup();
        getLocationController().cleanup();
        getMediaDataController().cleanup();
        getColorPalette().cleanup();
        getTranslateController().cleanup();
        getSavedMessagesController().cleanup();
        StoriesController storiesController = this.storiesController;
        if (storiesController != null) {
            storiesController.cleanup();
        }
        UnconfirmedAuthController unconfirmedAuthController = this.unconfirmedAuthController;
        if (unconfirmedAuthController != null) {
            unconfirmedAuthController.cleanup();
        }
        this.showFiltersTooltip = false;
        DialogsActivity.dialogsLoaded[this.currentAccount] = false;
        this.notificationsPreferences.edit().clear().commit();
        this.emojiPreferences.edit().putLong("lastGifLoadTime", 0L).putLong("lastStickersLoadTime", 0L).putLong("lastStickersLoadTimeMask", 0L).putLong("lastStickersLoadTimeFavs", 0L).commit();
        this.mainPreferences.edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("gifhint").remove("reminderhint").remove("soundHint").remove("dcDomainName2").remove("webFileDatacenterId").remove("themehint").remove("showFiltersTooltip").remove("transcribeButtonPressed").commit();
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor editor = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        AppWidgetManager appWidgetManager = null;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("account") && ((Integer) entry.getValue()).intValue() == this.currentAccount) {
                int intValue = Utilities.parseInt((CharSequence) key).intValue();
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
        this.lastSavedServerQueryTime.clear();
        this.lastServerQueryTime.clear();
        this.reloadingWebpages.clear();
        this.reloadingWebpagesPending.clear();
        this.reloadingScheduledWebpages.clear();
        this.reloadingScheduledWebpagesPending.clear();
        this.reloadingSavedWebpages.clear();
        this.reloadingSavedWebpagesPending.clear();
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
        this.dialogFiltersLoaded = false;
        this.ignoreSetOnline = false;
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$cleanup$45();
            }
        });
        this.createdDialogMainThreadIds.clear();
        this.visibleDialogMainThreadIds.clear();
        this.visibleScheduledDialogMainThreadIds.clear();
        this.blockePeers.clear();
        int i3 = 0;
        while (true) {
            LongSparseArray<LongSparseArray<Boolean>>[] longSparseArrayArr = this.sendingTypings;
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
                MessagesController.this.lambda$cleanup$46();
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
                MessagesController.this.lambda$cleanup$47();
            }
        });
    }

    public void lambda$cleanup$45() {
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

    public void lambda$cleanup$46() {
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

    public void lambda$cleanup$47() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.suggestedFiltersLoaded, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public boolean isChatNoForwards(TLRPC$Chat tLRPC$Chat) {
        TLRPC$Chat chat;
        if (tLRPC$Chat == null) {
            return false;
        }
        TLRPC$InputChannel tLRPC$InputChannel = tLRPC$Chat.migrated_to;
        if (tLRPC$InputChannel != null && (chat = getChat(Long.valueOf(tLRPC$InputChannel.channel_id))) != null) {
            return chat.noforwards;
        }
        return tLRPC$Chat.noforwards;
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

    public TLObject getUserOrChat(long j) {
        if (this.users.containsKey(Long.valueOf(j))) {
            return this.users.get(Long.valueOf(j));
        }
        long j2 = -j;
        if (this.chats.containsKey(Long.valueOf(j2))) {
            return this.chats.get(Long.valueOf(j2));
        }
        return null;
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
        if (arrayList.size() == 2) {
            TLRPC$EncryptedChat tLRPC$EncryptedChat2 = (TLRPC$EncryptedChat) arrayList.get(0);
            putEncryptedChat(tLRPC$EncryptedChat2, false);
            putUser((TLRPC$User) arrayList.get(1), true);
            return tLRPC$EncryptedChat2;
        }
        return tLRPC$EncryptedChat;
    }

    public boolean isDialogVisible(long j, boolean z) {
        return (z ? this.visibleScheduledDialogMainThreadIds : this.visibleDialogMainThreadIds).contains(Long.valueOf(j));
    }

    public void setLastVisibleDialogId(long j, boolean z, boolean z2) {
        ArrayList<Long> arrayList = z ? this.visibleScheduledDialogMainThreadIds : this.visibleDialogMainThreadIds;
        if (z2) {
            if (arrayList.contains(Long.valueOf(j))) {
                return;
            }
            arrayList.add(Long.valueOf(j));
            return;
        }
        arrayList.remove(Long.valueOf(j));
    }

    public void setLastCreatedDialogId(final long j, final boolean z, final boolean z2) {
        if (!z) {
            ArrayList<Long> arrayList = this.createdDialogMainThreadIds;
            if (z2) {
                if (arrayList.contains(Long.valueOf(j))) {
                    return;
                }
                arrayList.add(Long.valueOf(j));
            } else {
                arrayList.remove(Long.valueOf(j));
                SparseArray<MessageObject> sparseArray = this.pollsToCheck.get(j);
                if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        sparseArray.valueAt(i).pollVisibleOnScreen = false;
                    }
                }
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$setLastCreatedDialogId$48(z, z2, j);
            }
        });
    }

    public void lambda$setLastCreatedDialogId$48(boolean z, boolean z2, long j) {
        ArrayList<Long> arrayList = z ? this.createdScheduledDialogIds : this.createdDialogIds;
        if (z2) {
            if (arrayList.contains(Long.valueOf(j))) {
                return;
            }
            arrayList.add(Long.valueOf(j));
            return;
        }
        arrayList.remove(Long.valueOf(j));
    }

    public TLRPC$TL_chatInviteExported getExportedInvite(long j) {
        return this.exportedChats.get(j);
    }

    public boolean putUser(TLRPC$User tLRPC$User, boolean z) {
        return putUser(tLRPC$User, z, false);
    }

    public boolean putUser(org.telegram.tgnet.TLRPC$User r9, boolean r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.putUser(org.telegram.tgnet.TLRPC$User, boolean, boolean):boolean");
    }

    public void putUsers(ArrayList<TLRPC$User> arrayList, boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
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
                    MessagesController.this.lambda$putUsers$49();
                }
            });
        }
    }

    public void lambda$putUsers$49() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_STATUS));
    }

    public void putChat(final TLRPC$Chat tLRPC$Chat, boolean z) {
        TLRPC$Chat tLRPC$Chat2;
        if (tLRPC$Chat == null || (tLRPC$Chat2 = this.chats.get(Long.valueOf(tLRPC$Chat.id))) == tLRPC$Chat) {
            return;
        }
        if (tLRPC$Chat2 != null && !TextUtils.isEmpty(tLRPC$Chat2.username)) {
            this.objectsByUsernames.remove(tLRPC$Chat2.username.toLowerCase());
        }
        if (tLRPC$Chat2 != null && tLRPC$Chat2.usernames != null) {
            for (int i = 0; i < tLRPC$Chat2.usernames.size(); i++) {
                TLRPC$TL_username tLRPC$TL_username = tLRPC$Chat2.usernames.get(i);
                if (tLRPC$TL_username != null && !TextUtils.isEmpty(tLRPC$TL_username.username)) {
                    this.objectsByUsernames.remove(tLRPC$TL_username.username.toLowerCase());
                }
            }
        }
        if (!TextUtils.isEmpty(tLRPC$Chat.username)) {
            this.objectsByUsernames.put(tLRPC$Chat.username.toLowerCase(), tLRPC$Chat);
        }
        if (tLRPC$Chat.usernames != null) {
            for (int i2 = 0; i2 < tLRPC$Chat.usernames.size(); i2++) {
                TLRPC$TL_username tLRPC$TL_username2 = tLRPC$Chat.usernames.get(i2);
                if (tLRPC$TL_username2 != null && !TextUtils.isEmpty(tLRPC$TL_username2.username) && tLRPC$TL_username2.active) {
                    this.objectsByUsernames.put(tLRPC$TL_username2.username.toLowerCase(), tLRPC$Chat);
                }
            }
        }
        updateEmojiStatusUntilUpdate(-tLRPC$Chat.id, tLRPC$Chat.emoji_status);
        if (!tLRPC$Chat.min) {
            if (!z) {
                if (tLRPC$Chat2 != null) {
                    if (tLRPC$Chat.version != tLRPC$Chat2.version) {
                        this.loadedFullChats.delete(tLRPC$Chat.id);
                    }
                    int i3 = tLRPC$Chat2.participants_count;
                    if (i3 != 0 && tLRPC$Chat.participants_count == 0) {
                        tLRPC$Chat.participants_count = i3;
                        tLRPC$Chat.flags |= 131072;
                    }
                    TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights = tLRPC$Chat2.banned_rights;
                    int i4 = tLRPC$TL_chatBannedRights != null ? tLRPC$TL_chatBannedRights.flags : 0;
                    TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2 = tLRPC$Chat.banned_rights;
                    int i5 = tLRPC$TL_chatBannedRights2 != null ? tLRPC$TL_chatBannedRights2.flags : 0;
                    TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights3 = tLRPC$Chat2.default_banned_rights;
                    int i6 = tLRPC$TL_chatBannedRights3 != null ? tLRPC$TL_chatBannedRights3.flags : 0;
                    TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights4 = tLRPC$Chat.default_banned_rights;
                    int i7 = tLRPC$TL_chatBannedRights4 != null ? tLRPC$TL_chatBannedRights4.flags : 0;
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
                        tLRPC$Chat2.flags |= LiteMode.FLAG_CHAT_SCALE;
                    }
                    TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = tLRPC$Chat.admin_rights;
                    tLRPC$Chat2.admin_rights = tLRPC$TL_chatAdminRights;
                    if (tLRPC$TL_chatAdminRights == null) {
                        tLRPC$Chat2.flags &= -16385;
                    } else {
                        tLRPC$Chat2.flags |= LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM;
                    }
                    if (tLRPC$Chat.stories_hidden_min) {
                        tLRPC$Chat.stories_hidden = tLRPC$Chat2.stories_hidden;
                    }
                    if (i4 != i5 || i6 != i7) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                MessagesController.this.lambda$putChat$50(tLRPC$Chat);
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
                    tLRPC$Chat.flags |= LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM;
                }
                TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights6 = tLRPC$Chat2.banned_rights;
                if (tLRPC$TL_chatBannedRights6 != null) {
                    tLRPC$Chat.banned_rights = tLRPC$TL_chatBannedRights6;
                    tLRPC$Chat.flags |= LiteMode.FLAG_CHAT_SCALE;
                }
                String str = tLRPC$Chat2.username;
                if (str != null) {
                    tLRPC$Chat.username = str;
                    tLRPC$Chat.flags |= 64;
                } else {
                    tLRPC$Chat.flags &= -65;
                    tLRPC$Chat.username = null;
                }
                int i8 = tLRPC$Chat2.participants_count;
                if (i8 != 0 && tLRPC$Chat.participants_count == 0) {
                    tLRPC$Chat.participants_count = i8;
                    tLRPC$Chat.flags |= 131072;
                }
                this.chats.put(Long.valueOf(tLRPC$Chat.id), tLRPC$Chat);
            }
            addOrRemoveActiveVoiceChat(tLRPC$Chat);
        } else if (tLRPC$Chat2 == null) {
            this.chats.put(Long.valueOf(tLRPC$Chat.id), tLRPC$Chat);
            addOrRemoveActiveVoiceChat(tLRPC$Chat);
        } else if (!z) {
            getUserNameResolver().update(tLRPC$Chat2, tLRPC$Chat);
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
                tLRPC$Chat2.flags |= LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM;
            }
            TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights8 = tLRPC$Chat.banned_rights;
            if (tLRPC$TL_chatBannedRights8 != null) {
                tLRPC$Chat2.banned_rights = tLRPC$TL_chatBannedRights8;
                tLRPC$Chat2.flags |= LiteMode.FLAG_CHAT_SCALE;
            }
            String str2 = tLRPC$Chat.username;
            if (str2 != null) {
                tLRPC$Chat2.username = str2;
                tLRPC$Chat2.flags |= 64;
            } else {
                tLRPC$Chat2.flags &= -65;
                tLRPC$Chat2.username = null;
            }
            int i9 = tLRPC$Chat.participants_count;
            if (i9 != 0) {
                tLRPC$Chat2.participants_count = i9;
            }
            addOrRemoveActiveVoiceChat(tLRPC$Chat2);
            boolean z2 = tLRPC$Chat2.forum;
            boolean z3 = tLRPC$Chat.forum;
            if (z2 != z3) {
                tLRPC$Chat2.forum = z3;
                if (z3) {
                    tLRPC$Chat2.flags |= 1073741824;
                } else {
                    tLRPC$Chat2.flags &= -1073741825;
                }
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSwithcedToForum, Long.valueOf(tLRPC$Chat.id));
            }
        }
        if (tLRPC$Chat2 == null || tLRPC$Chat2.forum == tLRPC$Chat.forum) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$putChat$51(tLRPC$Chat);
            }
        });
    }

    public void lambda$putChat$50(TLRPC$Chat tLRPC$Chat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRightsUpdated, tLRPC$Chat);
    }

    public void lambda$putChat$51(TLRPC$Chat tLRPC$Chat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSwithcedToForum, Long.valueOf(tLRPC$Chat.id));
    }

    public void putChats(ArrayList<TLRPC$Chat> arrayList, boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            putChat(arrayList.get(i), z);
        }
    }

    private void addOrRemoveActiveVoiceChat(final TLRPC$Chat tLRPC$Chat) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addOrRemoveActiveVoiceChat$52(tLRPC$Chat);
                }
            });
        } else {
            lambda$addOrRemoveActiveVoiceChat$52(tLRPC$Chat);
        }
    }

    public void lambda$addOrRemoveActiveVoiceChat$52(TLRPC$Chat tLRPC$Chat) {
        TLRPC$Chat tLRPC$Chat2 = this.activeVoiceChatsMap.get(Long.valueOf(tLRPC$Chat.id));
        if (tLRPC$Chat.call_active && tLRPC$Chat.call_not_empty && tLRPC$Chat.migrated_to == null && !ChatObject.isNotInChat(tLRPC$Chat)) {
            if (tLRPC$Chat2 != null) {
                return;
            }
            this.activeVoiceChatsMap.put(Long.valueOf(tLRPC$Chat.id), tLRPC$Chat);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeGroupCallsUpdated, new Object[0]);
        } else if (tLRPC$Chat2 == null) {
        } else {
            this.activeVoiceChatsMap.remove(Long.valueOf(tLRPC$Chat.id));
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeGroupCallsUpdated, new Object[0]);
        }
    }

    public ArrayList<Long> getActiveGroupCalls() {
        return new ArrayList<>(this.activeVoiceChatsMap.keySet());
    }

    public void setReferer(String str) {
        if (str == null) {
            return;
        }
        this.installReferer = str;
        this.mainPreferences.edit().putString("installReferer", str).commit();
    }

    public void putEncryptedChat(TLRPC$EncryptedChat tLRPC$EncryptedChat, boolean z) {
        if (tLRPC$EncryptedChat == null) {
            return;
        }
        if (z) {
            this.encryptedChats.putIfAbsent(Integer.valueOf(tLRPC$EncryptedChat.id), tLRPC$EncryptedChat);
        } else {
            this.encryptedChats.put(Integer.valueOf(tLRPC$EncryptedChat.id), tLRPC$EncryptedChat);
        }
    }

    public void putEncryptedChats(ArrayList<TLRPC$EncryptedChat> arrayList, boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            putEncryptedChat(arrayList.get(i), z);
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(j), Long.valueOf(call.call.id), Boolean.FALSE);
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
                        MessagesController.this.lambda$getGroupCall$54(j, runnable, tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
        if (call == null || !(call.call instanceof TLRPC$TL_groupCallDiscarded)) {
            return call;
        }
        return null;
    }

    public void lambda$getGroupCall$54(final long j, final Runnable runnable, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getGroupCall$53(tLObject, j, runnable);
            }
        });
    }

    public void lambda$getGroupCall$53(TLObject tLObject, long j, Runnable runnable) {
        if (tLObject != null) {
            TLRPC$TL_phone_groupCall tLRPC$TL_phone_groupCall = (TLRPC$TL_phone_groupCall) tLObject;
            putUsers(tLRPC$TL_phone_groupCall.users, false);
            putChats(tLRPC$TL_phone_groupCall.chats, false);
            ChatObject.Call call = new ChatObject.Call();
            call.setCall(getAccountInstance(), j, tLRPC$TL_phone_groupCall);
            this.groupCalls.put(tLRPC$TL_phone_groupCall.call.id, call);
            this.groupCallsByChatId.put(j, call);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, Long.valueOf(j), Long.valueOf(tLRPC$TL_phone_groupCall.call.id), Boolean.FALSE);
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
        if (j == 0 && (arrayList == null || arrayList.isEmpty())) {
            return;
        }
        TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs = new TLRPC$TL_messages_getPeerDialogs();
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$InputPeer inputPeer = getInputPeer(arrayList.get(i).id);
                if (!(inputPeer instanceof TLRPC$TL_inputPeerChannel) || inputPeer.access_hash != 0) {
                    TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
                    tLRPC$TL_inputDialogPeer.peer = inputPeer;
                    long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
                    Long l = this.peerDialogsRequested.get(peerDialogId);
                    if (l == null || System.currentTimeMillis() - l.longValue() > 240000) {
                        tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer);
                        this.peerDialogsRequested.put(peerDialogId, Long.valueOf(System.currentTimeMillis()));
                    }
                }
            }
        } else {
            TLRPC$InputPeer inputPeer2 = getInputPeer(j);
            if ((inputPeer2 instanceof TLRPC$TL_inputPeerChannel) && inputPeer2.access_hash == 0) {
                return;
            }
            TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer2 = new TLRPC$TL_inputDialogPeer();
            tLRPC$TL_inputDialogPeer2.peer = inputPeer2;
            long peerDialogId2 = DialogObject.getPeerDialogId(inputPeer2);
            Long l2 = this.peerDialogsRequested.get(peerDialogId2);
            if (l2 == null || System.currentTimeMillis() - l2.longValue() > 240000) {
                tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer2);
                this.peerDialogsRequested.put(peerDialogId2, Long.valueOf(System.currentTimeMillis()));
            }
        }
        if (tLRPC$TL_messages_getPeerDialogs.peers.isEmpty()) {
            return;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$reloadDialogsReadValue$55(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$reloadDialogsReadValue$55(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                        tLRPC$TL_updateReadChannelInbox.still_unread_count = tLRPC$Dialog.unread_count;
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
            if (arrayList.isEmpty()) {
                return;
            }
            processUpdateArray(arrayList, null, null, false, 0);
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
        if (j == j2) {
            return "";
        }
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
        if (SystemClock.elapsedRealtime() - this.loadingChannelAdmins.get(j) < 60) {
            return;
        }
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
                MessagesController.this.lambda$loadChannelAdmins$56(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadChannelAdmins$56(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                MessagesController.this.lambda$processLoadedChannelAdmins$57(j, longSparseArray, z);
            }
        });
    }

    public void lambda$processLoadedChannelAdmins$57(long j, LongSparseArray longSparseArray, boolean z) {
        this.channelAdmins.put(j, longSparseArray);
        if (z) {
            this.loadingChannelAdmins.delete(j);
            loadChannelAdmins(j, false);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadChatAdmins, Long.valueOf(j));
        }
    }

    public void loadFullChat(final long r12, final int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.loadFullChat(long, int, boolean):void");
    }

    public void lambda$loadFullChat$60(final long j, final long j2, TLRPC$Chat tLRPC$Chat, final int i, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            final TLRPC$TL_messages_chatFull tLRPC$TL_messages_chatFull = (TLRPC$TL_messages_chatFull) tLObject;
            getMessagesStorage().putUsersAndChats(tLRPC$TL_messages_chatFull.users, tLRPC$TL_messages_chatFull.chats, true, true);
            getMessagesStorage().updateChatInfo(tLRPC$TL_messages_chatFull.full_chat, false);
            getStoriesController().updateStoriesFromFullPeer(j, tLRPC$TL_messages_chatFull.full_chat.stories);
            ChatThemeController.getInstance(this.currentAccount).saveChatWallpaper(-j2, tLRPC$TL_messages_chatFull.full_chat.wallpaper);
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
                    TLRPC$ChatFull tLRPC$ChatFull = tLRPC$TL_messages_chatFull.full_chat;
                    tLRPC$TL_updateReadChannelInbox.max_id = tLRPC$ChatFull.read_inbox_max_id;
                    tLRPC$TL_updateReadChannelInbox.still_unread_count = tLRPC$ChatFull.unread_count;
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
                    MessagesController.this.lambda$loadFullChat$58(j2, tLRPC$TL_messages_chatFull, i, j);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadFullChat$59(tLRPC$TL_error, j2);
            }
        });
    }

    public void lambda$loadFullChat$58(long j, TLRPC$TL_messages_chatFull tLRPC$TL_messages_chatFull, int i, long j2) {
        TLRPC$ChatFull tLRPC$ChatFull = this.fullChats.get(j);
        if (tLRPC$ChatFull != null) {
            tLRPC$TL_messages_chatFull.full_chat.inviterId = tLRPC$ChatFull.inviterId;
        }
        this.fullChats.put(j, tLRPC$TL_messages_chatFull.full_chat);
        long j3 = -j;
        getTranslateController().updateDialogFull(j3);
        applyDialogNotificationsSettings(j3, 0L, tLRPC$TL_messages_chatFull.full_chat.notify_settings);
        for (int i2 = 0; i2 < tLRPC$TL_messages_chatFull.full_chat.bot_info.size(); i2++) {
            getMediaDataController().putBotInfo(j3, tLRPC$TL_messages_chatFull.full_chat.bot_info.get(i2));
        }
        int indexOfKey = this.blockePeers.indexOfKey(j3);
        if (tLRPC$TL_messages_chatFull.full_chat.blocked) {
            if (indexOfKey < 0) {
                this.blockePeers.put(j3, 1);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
            }
        } else if (indexOfKey >= 0) {
            this.blockePeers.removeAt(indexOfKey);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        }
        this.exportedChats.put(j, tLRPC$TL_messages_chatFull.full_chat.exported_invite);
        this.loadingFullChats.remove(Long.valueOf(j));
        this.loadedFullChats.put(j, System.currentTimeMillis());
        putUsers(tLRPC$TL_messages_chatFull.users, false);
        putChats(tLRPC$TL_messages_chatFull.chats, false);
        if (tLRPC$TL_messages_chatFull.full_chat.stickerset != null) {
            getMediaDataController().getGroupStickerSetById(tLRPC$TL_messages_chatFull.full_chat.stickerset);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, tLRPC$TL_messages_chatFull.full_chat, Integer.valueOf(i), Boolean.FALSE, Boolean.TRUE);
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j3);
        if (tLRPC$Dialog != null) {
            TLRPC$ChatFull tLRPC$ChatFull2 = tLRPC$TL_messages_chatFull.full_chat;
            if ((tLRPC$ChatFull2.flags & LiteMode.FLAG_AUTOPLAY_GIFS) != 0) {
                int i3 = tLRPC$Dialog.folder_id;
                int i4 = tLRPC$ChatFull2.folder_id;
                if (i3 != i4) {
                    tLRPC$Dialog.folder_id = i4;
                    sortDialogs(null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                }
            }
            int i5 = tLRPC$Dialog.ttl_period;
            int i6 = tLRPC$TL_messages_chatFull.full_chat.ttl_period;
            if (i5 != i6) {
                tLRPC$Dialog.ttl_period = i6;
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            boolean z = tLRPC$Dialog.view_forum_as_messages;
            boolean z2 = tLRPC$TL_messages_chatFull.full_chat.view_forum_as_messages;
            if (z != z2) {
                tLRPC$Dialog.view_forum_as_messages = z2;
                getMessagesStorage().setDialogViewThreadAsMessages(j2, tLRPC$TL_messages_chatFull.full_chat.view_forum_as_messages);
            }
        }
    }

    public void lambda$loadFullChat$59(TLRPC$TL_error tLRPC$TL_error, long j) {
        checkChannelError(tLRPC$TL_error.text, j);
        this.loadingFullChats.remove(Long.valueOf(j));
    }

    public void loadFullUser(final TLRPC$User tLRPC$User, final int i, boolean z) {
        if (tLRPC$User == null || this.loadingFullUsers.contains(Long.valueOf(tLRPC$User.id))) {
            return;
        }
        if (z || this.loadedFullUsers.get(tLRPC$User.id) <= 0) {
            this.loadingFullUsers.add(Long.valueOf(tLRPC$User.id));
            TLRPC$TL_users_getFullUser tLRPC$TL_users_getFullUser = new TLRPC$TL_users_getFullUser();
            tLRPC$TL_users_getFullUser.id = getInputUser(tLRPC$User);
            final long j = tLRPC$User.id;
            if (this.dialogs_read_inbox_max.get(Long.valueOf(j)) == null || this.dialogs_read_outbox_max.get(Long.valueOf(j)) == null) {
                reloadDialogsReadValue(null, j);
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_users_getFullUser, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadFullUser$63(j, tLRPC$User, i, tLObject, tLRPC$TL_error);
                }
            }), i);
        }
    }

    public void lambda$loadFullUser$63(long j, final TLRPC$User tLRPC$User, final int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_users_userFull tLRPC$TL_users_userFull = (TLRPC$TL_users_userFull) tLObject;
            final TLRPC$UserFull tLRPC$UserFull = tLRPC$TL_users_userFull.full_user;
            putUsers(tLRPC$TL_users_userFull.users, false);
            putChats(tLRPC$TL_users_userFull.chats, false);
            TLRPC$UserFull tLRPC$UserFull2 = tLRPC$TL_users_userFull.full_user;
            tLRPC$UserFull2.user = getUser(Long.valueOf(tLRPC$UserFull2.id));
            getMessagesStorage().updateUserInfo(tLRPC$UserFull, false);
            getStoriesController().updateStoriesFromFullPeer(j, tLRPC$UserFull.stories);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            TLRPC$UserFull tLRPC$UserFull3 = tLRPC$TL_users_userFull.full_user;
            chatThemeController.saveChatWallpaper(tLRPC$UserFull3.id, tLRPC$UserFull3.wallpaper);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadFullUser$61(tLRPC$UserFull, tLRPC$User, i);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadFullUser$62(tLRPC$User);
            }
        });
    }

    public void lambda$loadFullUser$61(TLRPC$UserFull tLRPC$UserFull, TLRPC$User tLRPC$User, int i) {
        savePeerSettings(tLRPC$UserFull.user.id, tLRPC$UserFull.settings, false);
        applyDialogNotificationsSettings(tLRPC$User.id, 0L, tLRPC$UserFull.notify_settings);
        TLRPC$BotInfo tLRPC$BotInfo = tLRPC$UserFull.bot_info;
        if (tLRPC$BotInfo instanceof TLRPC$TL_botInfo) {
            tLRPC$BotInfo.user_id = tLRPC$User.id;
            getMediaDataController().putBotInfo(tLRPC$User.id, tLRPC$UserFull.bot_info);
        }
        int indexOfKey = this.blockePeers.indexOfKey(tLRPC$User.id);
        if (tLRPC$UserFull.blocked) {
            if (indexOfKey < 0) {
                this.blockePeers.put(tLRPC$User.id, 1);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
            }
        } else if (indexOfKey >= 0) {
            this.blockePeers.removeAt(indexOfKey);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        }
        this.fullUsers.put(tLRPC$User.id, tLRPC$UserFull);
        getTranslateController().updateDialogFull(tLRPC$User.id);
        this.loadingFullUsers.remove(Long.valueOf(tLRPC$User.id));
        this.loadedFullUsers.put(tLRPC$User.id, System.currentTimeMillis());
        String str = tLRPC$User.first_name + tLRPC$User.last_name + UserObject.getPublicUsername(tLRPC$User);
        ArrayList<TLRPC$User> arrayList = new ArrayList<>();
        arrayList.add(tLRPC$UserFull.user);
        putUsers(arrayList, false);
        getMessagesStorage().putUsersAndChats(arrayList, null, false, true);
        if (!str.equals(tLRPC$UserFull.user.first_name + tLRPC$UserFull.user.last_name + UserObject.getPublicUsername(tLRPC$UserFull.user))) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_NAME));
        }
        TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = tLRPC$UserFull.user.photo;
        if (tLRPC$UserProfilePhoto != null && tLRPC$UserProfilePhoto.has_video) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_AVATAR));
        }
        TLRPC$BotInfo tLRPC$BotInfo2 = tLRPC$UserFull.bot_info;
        if (tLRPC$BotInfo2 instanceof TLRPC$TL_botInfo) {
            tLRPC$BotInfo2.user_id = tLRPC$UserFull.id;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, tLRPC$UserFull.bot_info, Integer.valueOf(i));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(tLRPC$User.id), tLRPC$UserFull);
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(tLRPC$User.id);
        if (tLRPC$Dialog != null) {
            if ((tLRPC$UserFull.flags & LiteMode.FLAG_AUTOPLAY_GIFS) != 0) {
                int i2 = tLRPC$Dialog.folder_id;
                int i3 = tLRPC$UserFull.folder_id;
                if (i2 != i3) {
                    tLRPC$Dialog.folder_id = i3;
                    sortDialogs(null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                }
            }
            if ((tLRPC$UserFull.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                int i4 = tLRPC$Dialog.ttl_period;
                int i5 = tLRPC$UserFull.ttl_period;
                if (i4 != i5) {
                    tLRPC$Dialog.ttl_period = i5;
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                }
            }
        }
    }

    public void lambda$loadFullUser$62(TLRPC$User tLRPC$User) {
        this.loadingFullUsers.remove(Long.valueOf(tLRPC$User.id));
    }

    private void reloadMessages(ArrayList<Integer> arrayList, final long j, final int i) {
        TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages;
        if (arrayList.isEmpty()) {
            return;
        }
        final boolean z = i == 1;
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
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Integer num = arrayList.get(i2);
            if (arrayList3 == null || !arrayList3.contains(num)) {
                arrayList2.add(num);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList3 == null) {
            arrayList3 = new ArrayList<>();
            this.reloadingMessages.put(j, arrayList3);
        }
        arrayList3.addAll(arrayList2);
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$reloadMessages$65(j, z, i, arrayList2, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$reloadMessages$65(final long j, boolean z, int i, final ArrayList arrayList, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i2 = 0; i2 < tLRPC$messages_Messages.users.size(); i2++) {
                TLRPC$User tLRPC$User = tLRPC$messages_Messages.users.get(i2);
                longSparseArray.put(tLRPC$User.id, tLRPC$User);
            }
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i3 = 0; i3 < tLRPC$messages_Messages.chats.size(); i3++) {
                TLRPC$Chat tLRPC$Chat = tLRPC$messages_Messages.chats.get(i3);
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
            int i4 = 0;
            while (i4 < tLRPC$messages_Messages.messages.size()) {
                TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i4);
                tLRPC$Message.dialog_id = j;
                if (!z) {
                    tLRPC$Message.unread = (tLRPC$Message.out ? num2 : num).intValue() < tLRPC$Message.id;
                }
                Integer num3 = num;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new MessageObject(this.currentAccount, tLRPC$Message, (LongSparseArray<TLRPC$User>) longSparseArray, (LongSparseArray<TLRPC$Chat>) longSparseArray2, true, true));
                i4++;
                arrayList2 = arrayList3;
                num = num3;
            }
            final ArrayList arrayList4 = arrayList2;
            ImageLoader.saveMessagesThumbs(tLRPC$messages_Messages.messages);
            getMessagesStorage().putMessages(tLRPC$messages_Messages, j, -1, 0, false, i, 0L);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$reloadMessages$64(j, arrayList, arrayList4);
                }
            });
        }
    }

    public void lambda$reloadMessages$64(long j, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList<Integer> arrayList3 = this.reloadingMessages.get(j);
        if (arrayList3 != null) {
            arrayList3.removeAll(arrayList);
            if (arrayList3.isEmpty()) {
                this.reloadingMessages.remove(j);
            }
        }
        ArrayList<MessageObject> arrayList4 = this.dialogMessage.get(j);
        if (arrayList4 != null) {
            for (int i = 0; i < arrayList4.size(); i++) {
                MessageObject messageObject = arrayList4.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList2.size()) {
                        MessageObject messageObject2 = (MessageObject) arrayList2.get(i2);
                        if (messageObject.getId() == messageObject2.getId()) {
                            arrayList4.set(i, messageObject2);
                            if (messageObject2.messageOwner.peer_id.channel_id == 0) {
                                MessageObject messageObject3 = this.dialogMessagesByIds.get(messageObject2.getId());
                                this.dialogMessagesByIds.remove(messageObject2.getId());
                                if (messageObject3 != null) {
                                    this.dialogMessagesByIds.put(messageObject3.getId(), messageObject3);
                                }
                            }
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(j), arrayList2);
    }

    public void hidePeerSettingsBar(long j, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat) {
        if (tLRPC$User == null && tLRPC$Chat == null) {
            return;
        }
        SharedPreferences.Editor edit = this.notificationsPreferences.edit();
        edit.putInt("dialog_bar_vis3" + j, 3);
        edit.remove("dialog_bar_invite" + j);
        edit.commit();
        if (DialogObject.isEncryptedDialog(j)) {
            return;
        }
        TLRPC$TL_messages_hidePeerSettingsBar tLRPC$TL_messages_hidePeerSettingsBar = new TLRPC$TL_messages_hidePeerSettingsBar();
        if (tLRPC$User != null) {
            tLRPC$TL_messages_hidePeerSettingsBar.peer = getInputPeer(tLRPC$User.id);
        } else {
            tLRPC$TL_messages_hidePeerSettingsBar.peer = getInputPeer(-tLRPC$Chat.id);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_hidePeerSettingsBar, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$hidePeerSettingsBar$66(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void reportSpam(long j, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, TLRPC$EncryptedChat tLRPC$EncryptedChat, boolean z) {
        if (tLRPC$User == null && tLRPC$Chat == null && tLRPC$EncryptedChat == null) {
            return;
        }
        SharedPreferences.Editor edit = this.notificationsPreferences.edit();
        edit.putInt("dialog_bar_vis3" + j, 3);
        edit.commit();
        if (DialogObject.isEncryptedDialog(j)) {
            if (tLRPC$EncryptedChat == null || tLRPC$EncryptedChat.access_hash == 0) {
                return;
            }
            TLRPC$TL_messages_reportEncryptedSpam tLRPC$TL_messages_reportEncryptedSpam = new TLRPC$TL_messages_reportEncryptedSpam();
            TLRPC$TL_inputEncryptedChat tLRPC$TL_inputEncryptedChat = new TLRPC$TL_inputEncryptedChat();
            tLRPC$TL_messages_reportEncryptedSpam.peer = tLRPC$TL_inputEncryptedChat;
            tLRPC$TL_inputEncryptedChat.chat_id = tLRPC$EncryptedChat.id;
            tLRPC$TL_inputEncryptedChat.access_hash = tLRPC$EncryptedChat.access_hash;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_reportEncryptedSpam, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$reportSpam$67(tLObject, tLRPC$TL_error);
                }
            }, 2);
        } else if (z) {
            TLRPC$TL_account_reportPeer tLRPC$TL_account_reportPeer = new TLRPC$TL_account_reportPeer();
            if (tLRPC$Chat != null) {
                tLRPC$TL_account_reportPeer.peer = getInputPeer(-tLRPC$Chat.id);
            } else if (tLRPC$User != null) {
                tLRPC$TL_account_reportPeer.peer = getInputPeer(tLRPC$User.id);
            }
            tLRPC$TL_account_reportPeer.message = "";
            tLRPC$TL_account_reportPeer.reason = new TLRPC$ReportReason() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(-606798099);
                }
            };
            getConnectionsManager().sendRequest(tLRPC$TL_account_reportPeer, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$reportSpam$68(tLObject, tLRPC$TL_error);
                }
            }, 2);
        } else {
            TLRPC$TL_messages_reportSpam tLRPC$TL_messages_reportSpam = new TLRPC$TL_messages_reportSpam();
            if (tLRPC$Chat != null) {
                tLRPC$TL_messages_reportSpam.peer = getInputPeer(-tLRPC$Chat.id);
            } else if (tLRPC$User != null) {
                tLRPC$TL_messages_reportSpam.peer = getInputPeer(tLRPC$User.id);
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_reportSpam, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$reportSpam$69(tLObject, tLRPC$TL_error);
                }
            }, 2);
        }
    }

    private void savePeerSettings(long j, TLRPC$TL_peerSettings tLRPC$TL_peerSettings, boolean z) {
        if (tLRPC$TL_peerSettings != null) {
            SharedPreferences sharedPreferences = this.notificationsPreferences;
            if (sharedPreferences.getInt("dialog_bar_vis3" + j, 0) == 3) {
                return;
            }
            SharedPreferences.Editor edit = this.notificationsPreferences.edit();
            boolean z2 = tLRPC$TL_peerSettings.flags == 0;
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
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(j));
        }
    }

    public void loadPeerSettings(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat) {
        final long j;
        if (tLRPC$User == null && tLRPC$Chat == null) {
            return;
        }
        if (tLRPC$User != null) {
            j = tLRPC$User.id;
        } else {
            j = -tLRPC$Chat.id;
        }
        if (this.loadingPeerSettings.indexOfKey(j) >= 0) {
            return;
        }
        this.loadingPeerSettings.put(j, Boolean.TRUE);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("request spam button for " + j);
        }
        SharedPreferences sharedPreferences = this.notificationsPreferences;
        int i = sharedPreferences.getInt("dialog_bar_vis3" + j, 0);
        if (i == 1 || i == 3) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("dialog bar already hidden for " + j);
                return;
            }
            return;
        }
        TLRPC$TL_messages_getPeerSettings tLRPC$TL_messages_getPeerSettings = new TLRPC$TL_messages_getPeerSettings();
        if (tLRPC$User != null) {
            tLRPC$TL_messages_getPeerSettings.peer = getInputPeer(tLRPC$User.id);
        } else {
            tLRPC$TL_messages_getPeerSettings.peer = getInputPeer(-tLRPC$Chat.id);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerSettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadPeerSettings$71(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadPeerSettings$71(final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadPeerSettings$70(j, tLObject);
            }
        });
    }

    public void lambda$loadPeerSettings$70(long j, TLObject tLObject) {
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
                UserActionUpdatesPts userActionUpdatesPts = new UserActionUpdatesPts(null);
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
                    UserActionUpdatesPts userActionUpdatesPts = new UserActionUpdatesPts(null);
                    userActionUpdatesPts.pts = i2;
                    userActionUpdatesPts.pts_count = i4;
                    this.updatesQueuePts.add(userActionUpdatesPts);
                } else {
                    getDifference();
                }
            }
        }
        if (i != -1) {
            if (getMessagesStorage().getLastSeqValue() + 1 == i) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("APPLY SEQ");
                }
                getMessagesStorage().setLastSeqValue(i);
                if (i3 != -1) {
                    getMessagesStorage().setLastDateValue(i3);
                }
                getMessagesStorage().saveDiffParams(getMessagesStorage().getLastSeqValue(), getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue());
            } else if (getMessagesStorage().getLastSeqValue() != i) {
                if (this.gettingDifference || this.updatesStartWaitTimeSeq == 0 || Math.abs(System.currentTimeMillis() - this.updatesStartWaitTimeSeq) <= 1500) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("ADD UPDATE TO QUEUE seq = " + i);
                    }
                    if (this.updatesStartWaitTimeSeq == 0) {
                        this.updatesStartWaitTimeSeq = System.currentTimeMillis();
                    }
                    UserActionUpdatesSeq userActionUpdatesSeq = new UserActionUpdatesSeq(null);
                    userActionUpdatesSeq.seq = i;
                    this.updatesQueueSeq.add(userActionUpdatesSeq);
                    return;
                }
                getDifference();
            }
        }
    }

    public void didAddedNewTask(final int i, final long j, final SparseArray<ArrayList<Integer>> sparseArray) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didAddedNewTask$72(i);
            }
        });
        if (sparseArray != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$didAddedNewTask$73(j, sparseArray);
                }
            });
        }
    }

    public void lambda$didAddedNewTask$72(int i) {
        int i2;
        if (!(this.currentDeletingTaskMids == null && this.currentDeletingTaskMediaMids == null && !this.gettingNewDeleteTask) && ((i2 = this.currentDeletingTaskTime) == 0 || i >= i2)) {
            return;
        }
        getNewDeleteTask(null, null);
    }

    public void lambda$didAddedNewTask$73(long j, SparseArray sparseArray) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didCreatedNewDeleteTask, Long.valueOf(j), sparseArray);
    }

    public void getNewDeleteTask(final LongSparseArray<ArrayList<Integer>> longSparseArray, final LongSparseArray<ArrayList<Integer>> longSparseArray2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getNewDeleteTask$74(longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$getNewDeleteTask$74(LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        this.gettingNewDeleteTask = true;
        getMessagesStorage().getNewTask(longSparseArray, longSparseArray2);
    }

    private boolean checkDeletingTask(boolean z) {
        int i;
        int currentTime = getConnectionsManager().getCurrentTime();
        if (!(this.currentDeletingTaskMids == null && this.currentDeletingTaskMediaMids == null) && (z || ((i = this.currentDeletingTaskTime) != 0 && i <= currentTime))) {
            this.currentDeletingTaskTime = 0;
            if (this.currentDeleteTaskRunnable != null && !z) {
                Utilities.stageQueue.cancelRunnable(this.currentDeleteTaskRunnable);
            }
            this.currentDeleteTaskRunnable = null;
            LongSparseArray<ArrayList<Integer>> longSparseArray = this.currentDeletingTaskMids;
            final LongSparseArray<ArrayList<Integer>> m2clone = longSparseArray != null ? longSparseArray.m2clone() : null;
            LongSparseArray<ArrayList<Integer>> longSparseArray2 = this.currentDeletingTaskMediaMids;
            final LongSparseArray<ArrayList<Integer>> m2clone2 = longSparseArray2 != null ? longSparseArray2.m2clone() : null;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkDeletingTask$77(m2clone, m2clone2);
                }
            });
            return true;
        }
        return false;
    }

    public void lambda$checkDeletingTask$77(final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        long j;
        ArrayList<Integer> arrayList;
        boolean z = true;
        if (longSparseArray != null) {
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> arrayList2 = (ArrayList) longSparseArray.valueAt(i);
                deleteMessages(arrayList2, null, null, longSparseArray.keyAt(i), true, false, !arrayList2.isEmpty() && arrayList2.get(0).intValue() > 0);
            }
        }
        if (longSparseArray2 != null) {
            boolean z2 = SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible();
            MessageObject currentMessageObject = z2 ? SecretMediaViewer.getInstance().getCurrentMessageObject() : null;
            int size2 = longSparseArray2.size();
            int i2 = 0;
            while (i2 < size2) {
                final long keyAt = longSparseArray2.keyAt(i2);
                ArrayList<Integer> arrayList3 = (ArrayList) longSparseArray2.valueAt(i2);
                if (z2 && currentMessageObject != null && currentMessageObject.currentAccount == this.currentAccount && currentMessageObject.getDialogId() == keyAt && arrayList3.contains(Integer.valueOf(currentMessageObject.getId()))) {
                    final int id = currentMessageObject.getId();
                    arrayList3.remove(Integer.valueOf(id));
                    currentMessageObject.forceExpired = z;
                    final long createDeleteShowOnceTask = createDeleteShowOnceTask(keyAt, id);
                    j = keyAt;
                    arrayList = arrayList3;
                    SecretMediaViewer.getInstance().setOnClose(new Runnable() {
                        @Override
                        public final void run() {
                            MessagesController.this.lambda$checkDeletingTask$75(createDeleteShowOnceTask, keyAt, id);
                        }
                    });
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateMessageMedia, currentMessageObject.messageOwner);
                } else {
                    j = keyAt;
                    arrayList = arrayList3;
                }
                if (!arrayList.isEmpty()) {
                    getMessagesStorage().emptyMessagesMedia(j, arrayList);
                }
                i2++;
                z = true;
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkDeletingTask$76(longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$checkDeletingTask$76(LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        getNewDeleteTask(longSparseArray, longSparseArray2);
        this.currentDeletingTaskTime = 0;
        this.currentDeletingTaskMids = null;
        this.currentDeletingTaskMediaMids = null;
    }

    public void processLoadedDeleteTask(final int i, final LongSparseArray<ArrayList<Integer>> longSparseArray, final LongSparseArray<ArrayList<Integer>> longSparseArray2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedDeleteTask$79(longSparseArray, longSparseArray2, i);
            }
        });
    }

    public void lambda$processLoadedDeleteTask$79(LongSparseArray longSparseArray, LongSparseArray longSparseArray2, int i) {
        this.gettingNewDeleteTask = false;
        if (longSparseArray != null || longSparseArray2 != null) {
            this.currentDeletingTaskTime = i;
            this.currentDeletingTaskMids = longSparseArray;
            this.currentDeletingTaskMediaMids = longSparseArray2;
            if (this.currentDeleteTaskRunnable != null) {
                Utilities.stageQueue.cancelRunnable(this.currentDeleteTaskRunnable);
                this.currentDeleteTaskRunnable = null;
            }
            if (checkDeletingTask(false)) {
                return;
            }
            this.currentDeleteTaskRunnable = new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$processLoadedDeleteTask$78();
                }
            };
            Utilities.stageQueue.postRunnable(this.currentDeleteTaskRunnable, Math.abs(getConnectionsManager().getCurrentTime() - this.currentDeletingTaskTime) * 1000);
            return;
        }
        this.currentDeletingTaskTime = 0;
        this.currentDeletingTaskMids = null;
        this.currentDeletingTaskMediaMids = null;
    }

    public void lambda$processLoadedDeleteTask$78() {
        checkDeletingTask(true);
    }

    public DialogPhotos getDialogPhotos(long j) {
        DialogPhotos dialogPhotos = this.dialogPhotos.get(j);
        if (dialogPhotos == null) {
            LongSparseArray<DialogPhotos> longSparseArray = this.dialogPhotos;
            DialogPhotos dialogPhotos2 = new DialogPhotos(j);
            longSparseArray.put(j, dialogPhotos2);
            return dialogPhotos2;
        }
        return dialogPhotos;
    }

    public class DialogPhotos {
        public static final int STEP = 80;
        public final long dialogId;
        private boolean loading;
        public final ArrayList<TLRPC$Photo> photos = new ArrayList<>();
        public boolean fromCache = true;
        public boolean loaded = false;

        public void addPhotoAtStart(TLRPC$Photo tLRPC$Photo) {
        }

        public DialogPhotos(long j) {
            MessagesController.this = r1;
            this.dialogId = j;
        }

        public void loadAfter(int i, boolean z) {
            boolean z2;
            int i2 = 0;
            if (this.photos.isEmpty()) {
                load(0, 80);
                return;
            }
            if (i < 0) {
                i += this.photos.size();
            }
            if (i >= this.photos.size()) {
                i -= this.photos.size();
            }
            if (i < 0 || i >= this.photos.size()) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.photos.size()) {
                    z2 = false;
                    break;
                } else if (this.photos.get(i3) == null) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z2) {
                if (z) {
                    while (this.photos.get(i) != null) {
                        i++;
                        if (i >= this.photos.size()) {
                            i = 0;
                        }
                    }
                    while (i2 <= 80) {
                        int i4 = i + i2;
                        if (i4 >= this.photos.size() || this.photos.get(i4) != null) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 > 0) {
                        load(i, i2);
                        return;
                    }
                    return;
                }
                while (this.photos.get(i) != null) {
                    i--;
                    if (i < 0) {
                        i = this.photos.size() - 1;
                    }
                }
                while (i2 <= 80) {
                    int i5 = i - i2;
                    if (i5 < 0 || this.photos.get(i5) != null) {
                        break;
                    }
                    i2++;
                }
                if (i2 > 0) {
                    load(i - i2, i2);
                }
            }
        }

        public void load(final int i, final int i2) {
            if (this.loading || i2 <= 0 || i < 0) {
                return;
            }
            this.loading = true;
            long j = this.dialogId;
            if (j >= 0) {
                TLRPC$User user = MessagesController.this.getUser(Long.valueOf(j));
                if (user == null) {
                    this.loading = false;
                    return;
                }
                TLRPC$TL_photos_getUserPhotos tLRPC$TL_photos_getUserPhotos = new TLRPC$TL_photos_getUserPhotos();
                tLRPC$TL_photos_getUserPhotos.offset = i;
                tLRPC$TL_photos_getUserPhotos.limit = i2;
                tLRPC$TL_photos_getUserPhotos.max_id = 0L;
                tLRPC$TL_photos_getUserPhotos.user_id = MessagesController.this.getInputUser(user);
                MessagesController.this.getConnectionsManager().sendRequest(tLRPC$TL_photos_getUserPhotos, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.DialogPhotos.this.lambda$load$1(i, i2, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            TLRPC$TL_messages_search tLRPC$TL_messages_search = new TLRPC$TL_messages_search();
            tLRPC$TL_messages_search.filter = new TLRPC$TL_inputMessagesFilterChatPhotos();
            tLRPC$TL_messages_search.add_offset = i;
            tLRPC$TL_messages_search.limit = i2;
            tLRPC$TL_messages_search.offset_id = 0;
            tLRPC$TL_messages_search.q = "";
            tLRPC$TL_messages_search.peer = MessagesController.this.getInputPeer(this.dialogId);
            MessagesController.this.getConnectionsManager().sendRequest(tLRPC$TL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.DialogPhotos.this.lambda$load$3(i, i2, tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$load$1(final int i, final int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLRPC$TL_error == null) {
                final TLRPC$photos_Photos tLRPC$photos_Photos = (TLRPC$photos_Photos) tLObject;
                MessagesController.this.getMessagesStorage().putUsersAndChats(tLRPC$photos_Photos.users, null, true, true);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.DialogPhotos.this.lambda$load$0(tLRPC$photos_Photos, i, i2);
                    }
                });
            }
        }

        public void lambda$load$0(TLRPC$photos_Photos tLRPC$photos_Photos, int i, int i2) {
            MessagesController.this.putUsers(tLRPC$photos_Photos.users, false);
            onLoaded(i, i2, tLRPC$photos_Photos);
        }

        public void lambda$load$3(final int i, final int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLRPC$TL_error == null) {
                final TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
                MessagesController.this.getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.DialogPhotos.this.lambda$load$2(tLRPC$messages_Messages, i, i2);
                    }
                });
            }
        }

        public void lambda$load$2(TLRPC$messages_Messages tLRPC$messages_Messages, int i, int i2) {
            TLRPC$Photo tLRPC$Photo;
            MessagesController.this.putUsers(tLRPC$messages_Messages.users, false);
            MessagesController.this.putChats(tLRPC$messages_Messages.chats, false);
            TLRPC$TL_photos_photos tLRPC$TL_photos_photos = new TLRPC$TL_photos_photos();
            tLRPC$TL_photos_photos.count = tLRPC$messages_Messages.count;
            for (int i3 = 0; i3 < tLRPC$messages_Messages.messages.size(); i3++) {
                TLRPC$MessageAction tLRPC$MessageAction = tLRPC$messages_Messages.messages.get(i3).action;
                if (tLRPC$MessageAction != null && (tLRPC$Photo = tLRPC$MessageAction.photo) != null) {
                    tLRPC$TL_photos_photos.photos.add(tLRPC$Photo);
                }
            }
            onLoaded(i, i2, tLRPC$TL_photos_photos);
        }

        private void onLoaded(int i, int i2, TLRPC$photos_Photos tLRPC$photos_Photos) {
            boolean z = this.loaded;
            this.loading = false;
            this.loaded = true;
            this.fromCache = false;
            int max = Math.max(tLRPC$photos_Photos.count, tLRPC$photos_Photos.photos.size());
            tLRPC$photos_Photos.count = max;
            boolean z2 = max != this.photos.size() || i + i2 > this.photos.size();
            if (!z2) {
                int i3 = 0;
                while (true) {
                    if (i3 >= tLRPC$photos_Photos.photos.size()) {
                        break;
                    }
                    int i4 = i + i3;
                    if (this.photos.get(i4) != null && this.photos.get(i4).id != tLRPC$photos_Photos.photos.get(i3).id) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
            }
            if (z2) {
                this.photos.clear();
                for (int i5 = 0; i5 < tLRPC$photos_Photos.count; i5++) {
                    int i6 = i5 - i;
                    this.photos.add((i6 < 0 || i6 >= tLRPC$photos_Photos.photos.size()) ? null : tLRPC$photos_Photos.photos.get(i6));
                }
            } else {
                for (int i7 = 0; i7 < tLRPC$photos_Photos.photos.size(); i7++) {
                    this.photos.set(i + i7, tLRPC$photos_Photos.photos.get(i7));
                }
            }
            saveCache();
            MessagesController.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogPhotosUpdate, this);
            if (z || i != 0 || i2 >= this.photos.size() || this.photos.size() - i2 <= 80) {
                return;
            }
            load(this.photos.size() - 80, 80);
        }

        public void removePhoto(long j) {
            if (removePhotoInternal(j)) {
                saveCache();
                MessagesController.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogPhotosUpdate, this);
            }
        }

        public void moveToStart(int i) {
            if (i < 0 || i >= this.photos.size()) {
                return;
            }
            ArrayList<TLRPC$Photo> arrayList = this.photos;
            arrayList.add(0, arrayList.remove(i));
            saveCache();
            MessagesController.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogPhotosUpdate, this);
        }

        private boolean removePhotoInternal(long j) {
            int i = 0;
            boolean z = false;
            while (i < this.photos.size()) {
                TLRPC$Photo tLRPC$Photo = this.photos.get(i);
                if (tLRPC$Photo != null && tLRPC$Photo.id == j) {
                    this.photos.remove(i);
                    i--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int getCount() {
            return this.photos.size();
        }

        public void loadCache() {
            MessagesController.this.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.DialogPhotos.this.lambda$loadCache$5();
                }
            });
        }

        public void lambda$loadCache$5() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.DialogPhotos.lambda$loadCache$5():void");
        }

        public void lambda$loadCache$4(int i, HashMap hashMap) {
            this.photos.clear();
            for (int i2 = 0; i2 < i; i2++) {
                this.photos.add(null);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                this.photos.set(((Integer) entry.getKey()).intValue(), (TLRPC$Photo) entry.getValue());
            }
            MessagesController.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogPhotosUpdate, this);
            load(0, 80);
        }

        private void saveCache() {
            MessagesController.this.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.DialogPhotos.this.lambda$saveCache$6();
                }
            });
        }

        public void lambda$saveCache$6() {
            SQLiteDatabase database = MessagesController.this.getMessagesStorage().getDatabase();
            SQLitePreparedStatement sQLitePreparedStatement = null;
            try {
                database.executeFast("DELETE FROM dialog_photos WHERE uid = " + this.dialogId).stepThis().dispose();
                database.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + this.dialogId).stepThis().dispose();
                database.executeFast("REPLACE INTO dialog_photos_count VALUES(" + this.dialogId + ", " + this.photos.size() + ")").stepThis().dispose();
                sQLitePreparedStatement = database.executeFast("REPLACE INTO dialog_photos VALUES(?, ?, ?, ?)");
                for (int i = 0; i < this.photos.size(); i++) {
                    TLRPC$Photo tLRPC$Photo = this.photos.get(i);
                    if (tLRPC$Photo != null) {
                        if (tLRPC$Photo.file_reference == null) {
                            tLRPC$Photo.file_reference = new byte[0];
                        }
                        sQLitePreparedStatement.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$Photo.getObjectSize());
                        tLRPC$Photo.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatement.bindLong(1, this.dialogId);
                        sQLitePreparedStatement.bindLong(2, tLRPC$Photo.id);
                        sQLitePreparedStatement.bindInteger(3, i);
                        sQLitePreparedStatement.bindByteBuffer(4, nativeByteBuffer);
                        sQLitePreparedStatement.step();
                        nativeByteBuffer.reuse();
                    }
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception unused) {
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            } catch (Throwable th) {
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
                throw th;
            }
        }

        public void reset() {
            this.photos.clear();
            this.fromCache = true;
            saveCache();
        }
    }

    public void blockPeer(long j) {
        TLRPC$Chat chat;
        TLRPC$User tLRPC$User = null;
        if (j > 0) {
            TLRPC$User user = getUser(Long.valueOf(j));
            if (user == null) {
                return;
            }
            chat = null;
            tLRPC$User = user;
        } else {
            chat = getChat(Long.valueOf(-j));
            if (chat == null) {
                return;
            }
        }
        if (this.blockePeers.indexOfKey(j) >= 0) {
            return;
        }
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        TLRPC$TL_contacts_block tLRPC$TL_contacts_block = new TLRPC$TL_contacts_block();
        if (tLRPC$User != null) {
            tLRPC$TL_contacts_block.id = getInputPeer(tLRPC$User);
        } else {
            tLRPC$TL_contacts_block.id = getInputPeer(chat);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_block, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$blockPeer$80(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void setParticipantBannedRole(final long j, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, final boolean z, final BaseFragment baseFragment) {
        if ((tLRPC$User == null && tLRPC$Chat == null) || tLRPC$TL_chatBannedRights == null) {
            return;
        }
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
                MessagesController.this.lambda$setParticipantBannedRole$83(j, baseFragment, tLRPC$TL_channels_editBanned, z, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$setParticipantBannedRole$83(final long j, final BaseFragment baseFragment, final TLRPC$TL_channels_editBanned tLRPC$TL_channels_editBanned, final boolean z, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setParticipantBannedRole$81(j);
                }
            }, 1000L);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$setParticipantBannedRole$82(tLRPC$TL_error, baseFragment, tLRPC$TL_channels_editBanned, z);
            }
        });
    }

    public void lambda$setParticipantBannedRole$81(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$setParticipantBannedRole$82(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_editBanned tLRPC$TL_channels_editBanned, boolean z) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_editBanned, Boolean.valueOf(z));
    }

    public void setChannelSlowMode(final long j, int i) {
        TLRPC$TL_channels_toggleSlowMode tLRPC$TL_channels_toggleSlowMode = new TLRPC$TL_channels_toggleSlowMode();
        tLRPC$TL_channels_toggleSlowMode.seconds = i;
        tLRPC$TL_channels_toggleSlowMode.channel = getInputChannel(j);
        getConnectionsManager().sendRequest(tLRPC$TL_channels_toggleSlowMode, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setChannelSlowMode$85(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$setChannelSlowMode$85(final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setChannelSlowMode$84(j);
                }
            }, 1000L);
        }
    }

    public void lambda$setChannelSlowMode$84(long j) {
        loadFullChat(j, 0, true);
    }

    public void setDefaultBannedRole(final long j, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, final boolean z, final BaseFragment baseFragment) {
        if (tLRPC$TL_chatBannedRights == null) {
            return;
        }
        final TLRPC$TL_messages_editChatDefaultBannedRights tLRPC$TL_messages_editChatDefaultBannedRights = new TLRPC$TL_messages_editChatDefaultBannedRights();
        tLRPC$TL_messages_editChatDefaultBannedRights.peer = getInputPeer(-j);
        tLRPC$TL_messages_editChatDefaultBannedRights.banned_rights = tLRPC$TL_chatBannedRights;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatDefaultBannedRights, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setDefaultBannedRole$88(j, baseFragment, tLRPC$TL_messages_editChatDefaultBannedRights, z, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$setDefaultBannedRole$88(final long j, final BaseFragment baseFragment, final TLRPC$TL_messages_editChatDefaultBannedRights tLRPC$TL_messages_editChatDefaultBannedRights, final boolean z, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setDefaultBannedRole$86(j);
                }
            }, 1000L);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$setDefaultBannedRole$87(tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editChatDefaultBannedRights, z);
            }
        });
    }

    public void lambda$setDefaultBannedRole$86(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$setDefaultBannedRole$87(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_editChatDefaultBannedRights tLRPC$TL_messages_editChatDefaultBannedRights, boolean z) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editChatDefaultBannedRights, Boolean.valueOf(z));
    }

    public void setUserAdminRole(long j, TLRPC$User tLRPC$User, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, String str, boolean z, BaseFragment baseFragment, boolean z2, boolean z3, String str2, Runnable runnable) {
        setUserAdminRole(j, tLRPC$User, tLRPC$TL_chatAdminRights, str, z, baseFragment, z2, z3, str2, runnable, null);
    }

    public void setUserAdminRole(final long j, final TLRPC$User tLRPC$User, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, String str, final boolean z, final BaseFragment baseFragment, boolean z2, boolean z3, String str2, final Runnable runnable, final ErrorDelegate errorDelegate) {
        if (tLRPC$User == null || tLRPC$TL_chatAdminRights == null) {
            return;
        }
        final TLRPC$Chat chat = getChat(Long.valueOf(j));
        if (ChatObject.isChannel(chat)) {
            final TLRPC$TL_channels_editAdmin tLRPC$TL_channels_editAdmin = new TLRPC$TL_channels_editAdmin();
            tLRPC$TL_channels_editAdmin.channel = getInputChannel(chat);
            tLRPC$TL_channels_editAdmin.user_id = getInputUser(tLRPC$User);
            tLRPC$TL_channels_editAdmin.admin_rights = tLRPC$TL_chatAdminRights;
            tLRPC$TL_channels_editAdmin.rank = str;
            final RequestDelegate requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$setUserAdminRole$93(j, runnable, chat, tLRPC$User, errorDelegate, baseFragment, tLRPC$TL_channels_editAdmin, z, tLObject, tLRPC$TL_error);
                }
            };
            if (!tLRPC$User.bot && z2) {
                addUserToChat(j, tLRPC$User, 0, str2, baseFragment, true, new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$setUserAdminRole$94(tLRPC$TL_channels_editAdmin, requestDelegate);
                    }
                }, errorDelegate);
                return;
            } else {
                getConnectionsManager().sendRequest(tLRPC$TL_channels_editAdmin, requestDelegate);
                return;
            }
        }
        final TLRPC$TL_messages_editChatAdmin tLRPC$TL_messages_editChatAdmin = new TLRPC$TL_messages_editChatAdmin();
        tLRPC$TL_messages_editChatAdmin.chat_id = j;
        tLRPC$TL_messages_editChatAdmin.user_id = getInputUser(tLRPC$User);
        tLRPC$TL_messages_editChatAdmin.is_admin = z3 || tLRPC$TL_chatAdminRights.change_info || tLRPC$TL_chatAdminRights.delete_messages || tLRPC$TL_chatAdminRights.ban_users || tLRPC$TL_chatAdminRights.invite_users || tLRPC$TL_chatAdminRights.pin_messages || tLRPC$TL_chatAdminRights.add_admins || tLRPC$TL_chatAdminRights.manage_call;
        final RequestDelegate requestDelegate2 = new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setUserAdminRole$98(j, runnable, baseFragment, tLRPC$TL_messages_editChatAdmin, errorDelegate, tLObject, tLRPC$TL_error);
            }
        };
        if (tLRPC$TL_messages_editChatAdmin.is_admin || z2 || !TextUtils.isEmpty(str2)) {
            addUserToChat(j, tLRPC$User, 0, str2, baseFragment, true, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setUserAdminRole$99(tLRPC$TL_messages_editChatAdmin, requestDelegate2);
                }
            }, errorDelegate);
        } else {
            getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatAdmin, requestDelegate2);
        }
    }

    public void lambda$setUserAdminRole$93(final long j, final Runnable runnable, final TLRPC$Chat tLRPC$Chat, final TLRPC$User tLRPC$User, final ErrorDelegate errorDelegate, final BaseFragment baseFragment, final TLRPC$TL_channels_editAdmin tLRPC$TL_channels_editAdmin, final boolean z, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setUserAdminRole$89(j, runnable);
                }
            }, 1000L);
        } else if ("USER_PRIVACY_RESTRICTED".equals(tLRPC$TL_error.text) && ChatObject.canUserDoAdminAction(tLRPC$Chat, 3)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setUserAdminRole$90(tLRPC$User, tLRPC$Chat, errorDelegate, tLRPC$TL_error);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setUserAdminRole$91(tLRPC$TL_error, baseFragment, tLRPC$TL_channels_editAdmin, z);
                }
            });
            if (errorDelegate != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.ErrorDelegate.this.run(tLRPC$TL_error);
                    }
                });
            }
        }
    }

    public void lambda$setUserAdminRole$89(long j, Runnable runnable) {
        loadFullChat(j, 0, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$setUserAdminRole$90(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, ErrorDelegate errorDelegate, TLRPC$TL_error tLRPC$TL_error) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null && lastFragment.getParentActivity() != null) {
            LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(lastFragment, lastFragment.getParentActivity(), 11, this.currentAccount, null);
            ArrayList<TLRPC$User> arrayList = new ArrayList<>();
            arrayList.add(tLRPC$User);
            limitReachedBottomSheet.setRestrictedUsers(tLRPC$Chat, arrayList);
            limitReachedBottomSheet.show();
        }
        errorDelegate.run(tLRPC$TL_error);
    }

    public void lambda$setUserAdminRole$91(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_editAdmin tLRPC$TL_channels_editAdmin, boolean z) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_editAdmin, Boolean.valueOf(z));
    }

    public void lambda$setUserAdminRole$94(TLRPC$TL_channels_editAdmin tLRPC$TL_channels_editAdmin, RequestDelegate requestDelegate) {
        getConnectionsManager().sendRequest(tLRPC$TL_channels_editAdmin, requestDelegate);
    }

    public void lambda$setUserAdminRole$98(final long j, final Runnable runnable, final BaseFragment baseFragment, final TLRPC$TL_messages_editChatAdmin tLRPC$TL_messages_editChatAdmin, final ErrorDelegate errorDelegate, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setUserAdminRole$95(j, runnable);
                }
            }, 1000L);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$setUserAdminRole$96(tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editChatAdmin);
            }
        });
        if (errorDelegate != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.ErrorDelegate.this.run(tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$setUserAdminRole$95(long j, Runnable runnable) {
        loadFullChat(j, 0, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$setUserAdminRole$96(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_editChatAdmin tLRPC$TL_messages_editChatAdmin) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editChatAdmin, Boolean.FALSE);
    }

    public void lambda$setUserAdminRole$99(TLRPC$TL_messages_editChatAdmin tLRPC$TL_messages_editChatAdmin, RequestDelegate requestDelegate) {
        getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatAdmin, requestDelegate);
    }

    public void unblockPeer(long j) {
        unblockPeer(j, null);
    }

    public void unblockPeer(long j, final Runnable runnable) {
        TLRPC$Chat chat;
        TLRPC$TL_contacts_unblock tLRPC$TL_contacts_unblock = new TLRPC$TL_contacts_unblock();
        TLRPC$User tLRPC$User = null;
        if (j > 0) {
            TLRPC$User user = getUser(Long.valueOf(j));
            if (user == null) {
                return;
            }
            chat = null;
            tLRPC$User = user;
        } else {
            chat = getChat(Long.valueOf(-j));
            if (chat == null) {
                return;
            }
        }
        this.totalBlockedCount--;
        this.blockePeers.delete(j);
        if (tLRPC$User != null) {
            tLRPC$TL_contacts_unblock.id = getInputPeer(tLRPC$User);
        } else {
            tLRPC$TL_contacts_unblock.id = getInputPeer(chat);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_unblock, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$unblockPeer$101(runnable, tLObject, tLRPC$TL_error);
            }
        });
    }

    public static void lambda$unblockPeer$101(final Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$unblockPeer$100(runnable);
            }
        });
    }

    public static void lambda$unblockPeer$100(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void getBlockedPeers(final boolean z) {
        if (!getUserConfig().isClientActivated() || this.loadingBlockedPeers) {
            return;
        }
        this.loadingBlockedPeers = true;
        final TLRPC$TL_contacts_getBlocked tLRPC$TL_contacts_getBlocked = new TLRPC$TL_contacts_getBlocked();
        tLRPC$TL_contacts_getBlocked.offset = z ? 0 : this.blockePeers.size();
        tLRPC$TL_contacts_getBlocked.limit = z ? 20 : 100;
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_getBlocked, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$getBlockedPeers$103(z, tLRPC$TL_contacts_getBlocked, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$getBlockedPeers$103(final boolean z, final TLRPC$TL_contacts_getBlocked tLRPC$TL_contacts_getBlocked, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getBlockedPeers$102(tLObject, z, tLRPC$TL_contacts_getBlocked);
            }
        });
    }

    public void lambda$getBlockedPeers$102(TLObject tLObject, boolean z, TLRPC$TL_contacts_getBlocked tLRPC$TL_contacts_getBlocked) {
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
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        }
    }

    public void deleteUserPhoto(TLRPC$InputPhoto tLRPC$InputPhoto) {
        TLRPC$Photo tLRPC$Photo;
        final long clientUserId = getUserConfig().getClientUserId();
        if (tLRPC$InputPhoto == null) {
            DialogPhotos dialogPhotos = getDialogPhotos(clientUserId);
            if (dialogPhotos != null && dialogPhotos.photos.size() > 0 && (tLRPC$Photo = dialogPhotos.photos.get(0)) != null) {
                dialogPhotos.removePhoto(tLRPC$Photo.id);
            }
            TLRPC$TL_photos_updateProfilePhoto tLRPC$TL_photos_updateProfilePhoto = new TLRPC$TL_photos_updateProfilePhoto();
            tLRPC$TL_photos_updateProfilePhoto.id = new TLRPC$TL_inputPhotoEmpty();
            TLRPC$User user = getUser(Long.valueOf(getUserConfig().getClientUserId()));
            if (user == null) {
                user = getUserConfig().getCurrentUser();
            }
            if (user == null) {
                return;
            }
            if (user.photo != null) {
                getMessagesStorage().clearUserPhoto(user.id, user.photo.photo_id);
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_ALL));
            getConnectionsManager().sendRequest(tLRPC$TL_photos_updateProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$deleteUserPhoto$105(clientUserId, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        TLRPC$TL_photos_deletePhotos tLRPC$TL_photos_deletePhotos = new TLRPC$TL_photos_deletePhotos();
        tLRPC$TL_photos_deletePhotos.id.add(tLRPC$InputPhoto);
        getDialogPhotos(clientUserId).removePhoto(tLRPC$InputPhoto.id);
        getConnectionsManager().sendRequest(tLRPC$TL_photos_deletePhotos, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$deleteUserPhoto$106(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$deleteUserPhoto$105(final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$deleteUserPhoto$104(tLObject, j);
                }
            });
        }
    }

    public void lambda$deleteUserPhoto$104(TLObject tLObject, long j) {
        TLRPC$TL_photos_photo tLRPC$TL_photos_photo = (TLRPC$TL_photos_photo) tLObject;
        TLRPC$User user = getUser(Long.valueOf(getUserConfig().getClientUserId()));
        if (user == null) {
            user = getUserConfig().getCurrentUser();
            putUser(user, false);
        } else {
            getUserConfig().setCurrentUser(user);
        }
        if (user == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
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
        TLRPC$UserFull userFull = getUserFull(j);
        userFull.profile_photo = tLRPC$TL_photos_photo.photo;
        getMessagesStorage().updateUserInfo(userFull, false);
        getUserConfig().getCurrentUser().photo = user.photo;
        putUser(user, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.updateInterfaces;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, Integer.valueOf(UPDATE_MASK_ALL));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, Integer.valueOf(UPDATE_MASK_AVATAR));
        getUserConfig().saveConfig(true);
    }

    public void uploadAndApplyUserAvatar(TLRPC$FileLocation tLRPC$FileLocation) {
        if (tLRPC$FileLocation == null) {
            return;
        }
        this.uploadingAvatar = FileLoader.getDirectory(4) + "/" + tLRPC$FileLocation.volume_id + "_" + tLRPC$FileLocation.local_id + ".jpg";
        getFileLoader().uploadFile(this.uploadingAvatar, false, true, ConnectionsManager.FileTypePhoto);
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
            getConnectionsManager().sendRequest(tLRPC$TL_account_saveTheme, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$saveTheme$107(tLObject, tLRPC$TL_error);
                }
            });
            getConnectionsManager().resumeNetworkMaybe();
        }
        if (z2) {
            return;
        }
        installTheme(themeInfo, themeAccent, z);
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
        getConnectionsManager().sendRequest(tLRPC$TL_account_installTheme, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$installTheme$108(tLObject, tLRPC$TL_error);
            }
        });
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC$TL_account_installWallPaper tLRPC$TL_account_installWallPaper = new TLRPC$TL_account_installWallPaper();
        TLRPC$TL_inputWallPaperSlug tLRPC$TL_inputWallPaperSlug = new TLRPC$TL_inputWallPaperSlug();
        tLRPC$TL_inputWallPaperSlug.slug = str;
        tLRPC$TL_account_installWallPaper.wallpaper = tLRPC$TL_inputWallPaperSlug;
        TLRPC$TL_wallPaperSettings tLRPC$TL_wallPaperSettings = new TLRPC$TL_wallPaperSettings();
        tLRPC$TL_account_installWallPaper.settings = tLRPC$TL_wallPaperSettings;
        tLRPC$TL_wallPaperSettings.blur = z2;
        tLRPC$TL_wallPaperSettings.motion = z3;
        getConnectionsManager().sendRequest(tLRPC$TL_account_installWallPaper, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$installTheme$109(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void saveThemeToServer(final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent) {
        String str;
        File file;
        if (themeInfo == null) {
            return;
        }
        if (themeAccent != 0) {
            str = themeAccent.saveToFile().getAbsolutePath();
            file = themeAccent.getPathToWallpaper();
        } else {
            str = themeInfo.pathToFile;
            file = null;
        }
        final String str2 = str;
        final File file2 = file;
        if (str2 == null || this.uploadingThemes.containsKey(str2)) {
            return;
        }
        this.uploadingThemes.put(str2, themeAccent != 0 ? themeAccent : themeInfo);
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$saveThemeToServer$111(str2, file2, themeAccent, themeInfo);
            }
        });
    }

    public void lambda$saveThemeToServer$111(final String str, File file, final Theme.ThemeAccent themeAccent, final Theme.ThemeInfo themeInfo) {
        final String createThemePreviewImage = Theme.createThemePreviewImage(str, file != null ? file.getAbsolutePath() : null, themeAccent);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$saveThemeToServer$110(createThemePreviewImage, str, themeAccent, themeInfo);
            }
        });
    }

    public void lambda$saveThemeToServer$110(String str, String str2, Theme.ThemeAccent themeAccent, Theme.ThemeInfo themeInfo) {
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

    public void saveWallpaperToServer(java.io.File r8, org.telegram.ui.ActionBar.Theme.OverrideWallpaperInfo r9, boolean r10, final long r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.saveWallpaperToServer(java.io.File, org.telegram.ui.ActionBar.Theme$OverrideWallpaperInfo, boolean, long):void");
    }

    public void lambda$saveWallpaperToServer$112(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        getMessagesStorage().removePendingTask(j);
    }

    public static TLRPC$TL_wallPaperSettings getWallpaperSetting(Theme.OverrideWallpaperInfo overrideWallpaperInfo) {
        TLRPC$TL_wallPaperSettings tLRPC$TL_wallPaperSettings = new TLRPC$TL_wallPaperSettings();
        tLRPC$TL_wallPaperSettings.blur = overrideWallpaperInfo.isBlurred;
        tLRPC$TL_wallPaperSettings.motion = overrideWallpaperInfo.isMotion;
        int i = overrideWallpaperInfo.color;
        if (i != 0) {
            tLRPC$TL_wallPaperSettings.background_color = i & 16777215;
            int i2 = tLRPC$TL_wallPaperSettings.flags | 1;
            tLRPC$TL_wallPaperSettings.flags = i2;
            tLRPC$TL_wallPaperSettings.intensity = (int) (overrideWallpaperInfo.intensity * 100.0f);
            tLRPC$TL_wallPaperSettings.flags = i2 | 8;
        } else {
            float f = overrideWallpaperInfo.intensity;
            if (f > 0.0f) {
                tLRPC$TL_wallPaperSettings.intensity = (int) (f * 100.0f);
                tLRPC$TL_wallPaperSettings.flags |= 8;
            }
        }
        int i3 = overrideWallpaperInfo.gradientColor1;
        if (i3 != 0) {
            tLRPC$TL_wallPaperSettings.second_background_color = i3 & 16777215;
            tLRPC$TL_wallPaperSettings.rotation = AndroidUtilities.getWallpaperRotation(overrideWallpaperInfo.rotation, true);
            tLRPC$TL_wallPaperSettings.flags |= 16;
        }
        int i4 = overrideWallpaperInfo.gradientColor2;
        if (i4 != 0) {
            tLRPC$TL_wallPaperSettings.third_background_color = i4 & 16777215;
            tLRPC$TL_wallPaperSettings.flags |= 32;
        }
        int i5 = overrideWallpaperInfo.gradientColor3;
        if (i5 != 0) {
            tLRPC$TL_wallPaperSettings.fourth_background_color = i5 & 16777215;
            tLRPC$TL_wallPaperSettings.flags |= 64;
        }
        return tLRPC$TL_wallPaperSettings;
    }

    public static TLRPC$InputWallPaper getInputWallpaper(Theme.OverrideWallpaperInfo overrideWallpaperInfo) {
        if (overrideWallpaperInfo.wallpaperId > 0) {
            TLRPC$TL_inputWallPaper tLRPC$TL_inputWallPaper = new TLRPC$TL_inputWallPaper();
            tLRPC$TL_inputWallPaper.id = overrideWallpaperInfo.wallpaperId;
            tLRPC$TL_inputWallPaper.access_hash = overrideWallpaperInfo.accessHash;
            return tLRPC$TL_inputWallPaper;
        }
        TLRPC$TL_inputWallPaperSlug tLRPC$TL_inputWallPaperSlug = new TLRPC$TL_inputWallPaperSlug();
        tLRPC$TL_inputWallPaperSlug.slug = overrideWallpaperInfo.slug;
        return tLRPC$TL_inputWallPaperSlug;
    }

    public void markDialogMessageAsDeleted(long j, ArrayList<Integer> arrayList) {
        ArrayList<MessageObject> arrayList2 = this.dialogMessage.get(j);
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                MessageObject messageObject = arrayList2.get(i);
                if (messageObject != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        } else if (messageObject.getId() == arrayList.get(i2).intValue()) {
                            messageObject.deleted = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
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
        long j3;
        ArrayList<Integer> arrayList3;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        final long createPendingTask;
        TLRPC$TL_messages_deleteMessages tLRPC$TL_messages_deleteMessages;
        NativeByteBuffer nativeByteBuffer3;
        long createPendingTask2;
        TLRPC$TL_channels_deleteMessages tLRPC$TL_channels_deleteMessages;
        NativeByteBuffer nativeByteBuffer4;
        final long createPendingTask3;
        TLRPC$TL_messages_deleteScheduledMessages tLRPC$TL_messages_deleteScheduledMessages;
        long j4;
        ArrayList<Integer> arrayList4;
        char c;
        if ((arrayList == null || arrayList.isEmpty()) && j2 == 0) {
            return;
        }
        if (j2 == 0) {
            if (j == 0 || !DialogObject.isChatDialog(j)) {
                j4 = 0;
            } else {
                TLRPC$Chat chat = getChat(Long.valueOf(-j));
                j4 = ChatObject.isChannel(chat) ? chat.id : 0L;
            }
            if (z3) {
                arrayList4 = null;
            } else {
                ArrayList<Integer> arrayList5 = new ArrayList<>();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Integer num = arrayList.get(i);
                    if (num.intValue() > 0) {
                        arrayList5.add(num);
                    }
                }
                arrayList4 = arrayList5;
            }
            if (z2) {
                getMessagesStorage().markMessagesAsDeleted(j, arrayList, true, false, true);
                c = 1;
            } else {
                if (j4 == 0) {
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
                getMessagesStorage().updateDialogsWithDeletedMessages(j, j4, arrayList, null, true);
            }
            NotificationCenter notificationCenter = getNotificationCenter();
            int i3 = NotificationCenter.messagesDeleted;
            Object[] objArr = new Object[3];
            objArr[0] = arrayList;
            objArr[c] = Long.valueOf(j4);
            objArr[2] = Boolean.valueOf(z2);
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i3, objArr);
            j3 = j4;
            arrayList3 = arrayList4;
        } else {
            j3 = tLObject instanceof TLRPC$TL_channels_deleteMessages ? ((TLRPC$TL_channels_deleteMessages) tLObject).channel.channel_id : 0L;
            arrayList3 = null;
        }
        if (z3) {
            return;
        }
        if (z2) {
            if (tLObject instanceof TLRPC$TL_messages_deleteScheduledMessages) {
                tLRPC$TL_messages_deleteScheduledMessages = (TLRPC$TL_messages_deleteScheduledMessages) tLObject;
                createPendingTask3 = j2;
            } else {
                TLRPC$TL_messages_deleteScheduledMessages tLRPC$TL_messages_deleteScheduledMessages2 = new TLRPC$TL_messages_deleteScheduledMessages();
                tLRPC$TL_messages_deleteScheduledMessages2.id = arrayList3;
                tLRPC$TL_messages_deleteScheduledMessages2.peer = getInputPeer(j);
                try {
                    nativeByteBuffer4 = new NativeByteBuffer(tLRPC$TL_messages_deleteScheduledMessages2.getObjectSize() + 12);
                } catch (Exception e) {
                    e = e;
                    nativeByteBuffer4 = null;
                }
                try {
                    nativeByteBuffer4.writeInt32(24);
                    nativeByteBuffer4.writeInt64(j);
                    tLRPC$TL_messages_deleteScheduledMessages2.serializeToStream(nativeByteBuffer4);
                } catch (Exception e2) {
                    e = e2;
                    FileLog.e(e);
                    createPendingTask3 = getMessagesStorage().createPendingTask(nativeByteBuffer4);
                    tLRPC$TL_messages_deleteScheduledMessages = tLRPC$TL_messages_deleteScheduledMessages2;
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteScheduledMessages, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$deleteMessages$113(createPendingTask3, tLObject2, tLRPC$TL_error);
                        }
                    });
                }
                createPendingTask3 = getMessagesStorage().createPendingTask(nativeByteBuffer4);
                tLRPC$TL_messages_deleteScheduledMessages = tLRPC$TL_messages_deleteScheduledMessages2;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteScheduledMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$deleteMessages$113(createPendingTask3, tLObject2, tLRPC$TL_error);
                }
            });
        } else if (j3 != 0) {
            if (tLObject != null) {
                tLRPC$TL_channels_deleteMessages = (TLRPC$TL_channels_deleteMessages) tLObject;
                createPendingTask2 = j2;
            } else {
                TLRPC$TL_channels_deleteMessages tLRPC$TL_channels_deleteMessages2 = new TLRPC$TL_channels_deleteMessages();
                tLRPC$TL_channels_deleteMessages2.id = arrayList3;
                tLRPC$TL_channels_deleteMessages2.channel = getInputChannel(j3);
                try {
                    nativeByteBuffer3 = new NativeByteBuffer(tLRPC$TL_channels_deleteMessages2.getObjectSize() + 12);
                } catch (Exception e3) {
                    e = e3;
                    nativeByteBuffer3 = null;
                }
                try {
                    nativeByteBuffer3.writeInt32(24);
                    nativeByteBuffer3.writeInt64(j);
                    tLRPC$TL_channels_deleteMessages2.serializeToStream(nativeByteBuffer3);
                } catch (Exception e4) {
                    e = e4;
                    FileLog.e(e);
                    createPendingTask2 = getMessagesStorage().createPendingTask(nativeByteBuffer3);
                    tLRPC$TL_channels_deleteMessages = tLRPC$TL_channels_deleteMessages2;
                    final long j5 = j3;
                    final long j6 = createPendingTask2;
                    getConnectionsManager().sendRequest(tLRPC$TL_channels_deleteMessages, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$deleteMessages$114(j5, j6, tLObject2, tLRPC$TL_error);
                        }
                    });
                }
                createPendingTask2 = getMessagesStorage().createPendingTask(nativeByteBuffer3);
                tLRPC$TL_channels_deleteMessages = tLRPC$TL_channels_deleteMessages2;
            }
            final long j52 = j3;
            final long j62 = createPendingTask2;
            getConnectionsManager().sendRequest(tLRPC$TL_channels_deleteMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$deleteMessages$114(j52, j62, tLObject2, tLRPC$TL_error);
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
                createPendingTask = j2;
            } else {
                TLRPC$TL_messages_deleteMessages tLRPC$TL_messages_deleteMessages2 = new TLRPC$TL_messages_deleteMessages();
                tLRPC$TL_messages_deleteMessages2.id = arrayList3;
                tLRPC$TL_messages_deleteMessages2.revoke = z;
                try {
                    nativeByteBuffer2 = new NativeByteBuffer(tLRPC$TL_messages_deleteMessages2.getObjectSize() + 12);
                } catch (Exception e5) {
                    e = e5;
                    nativeByteBuffer2 = nativeByteBuffer;
                }
                try {
                    nativeByteBuffer2.writeInt32(24);
                    nativeByteBuffer2.writeInt64(j);
                    tLRPC$TL_messages_deleteMessages2.serializeToStream(nativeByteBuffer2);
                } catch (Exception e6) {
                    e = e6;
                    FileLog.e(e);
                    createPendingTask = getMessagesStorage().createPendingTask(nativeByteBuffer2);
                    tLRPC$TL_messages_deleteMessages = tLRPC$TL_messages_deleteMessages2;
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteMessages, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$deleteMessages$115(createPendingTask, tLObject2, tLRPC$TL_error);
                        }
                    });
                }
                createPendingTask = getMessagesStorage().createPendingTask(nativeByteBuffer2);
                tLRPC$TL_messages_deleteMessages = tLRPC$TL_messages_deleteMessages2;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$deleteMessages$115(createPendingTask, tLObject2, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$deleteMessages$113(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$deleteMessages$114(long j, long j2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewChannelDifferenceParams(tLRPC$TL_messages_affectedMessages.pts, tLRPC$TL_messages_affectedMessages.pts_count, j);
        }
        if (j2 != 0) {
            getMessagesStorage().removePendingTask(j2);
        }
    }

    public void lambda$deleteMessages$115(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void unpinAllMessages(final TLRPC$Chat tLRPC$Chat, final TLRPC$User tLRPC$User) {
        if (tLRPC$Chat == null && tLRPC$User == null) {
            return;
        }
        TLRPC$TL_messages_unpinAllMessages tLRPC$TL_messages_unpinAllMessages = new TLRPC$TL_messages_unpinAllMessages();
        tLRPC$TL_messages_unpinAllMessages.peer = getInputPeer(tLRPC$Chat != null ? -tLRPC$Chat.id : tLRPC$User.id);
        getConnectionsManager().sendRequest(tLRPC$TL_messages_unpinAllMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$unpinAllMessages$116(tLRPC$Chat, tLRPC$User, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$unpinAllMessages$116(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
        if (tLRPC$Chat == null && tLRPC$User == null) {
            return;
        }
        TLRPC$TL_messages_updatePinnedMessage tLRPC$TL_messages_updatePinnedMessage = new TLRPC$TL_messages_updatePinnedMessage();
        tLRPC$TL_messages_updatePinnedMessage.peer = getInputPeer(tLRPC$Chat != null ? -tLRPC$Chat.id : tLRPC$User.id);
        tLRPC$TL_messages_updatePinnedMessage.id = i;
        tLRPC$TL_messages_updatePinnedMessage.unpin = z;
        tLRPC$TL_messages_updatePinnedMessage.silent = !z3;
        tLRPC$TL_messages_updatePinnedMessage.pm_oneside = z2;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_updatePinnedMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$pinMessage$117(i, tLRPC$Chat, tLRPC$User, z, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$pinMessage$117(int i, TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, boolean z, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                MessagesController.this.lambda$deleteUserChannelHistory$118(tLRPC$Chat, tLRPC$User, tLRPC$Chat2, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$deleteUserChannelHistory$118(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
        LongSparseArray<LongSparseArray<TLRPC$DraftMessage>> drafts = getMediaDataController().getDrafts();
        int size = drafts.size();
        for (int i = 0; i < size; i++) {
            TLRPC$DraftMessage tLRPC$DraftMessage = drafts.valueAt(i).get(0L);
            if (tLRPC$DraftMessage != null) {
                putDraftDialogIfNeed(drafts.keyAt(i), tLRPC$DraftMessage);
            }
        }
    }

    public void putDraftDialogIfNeed(long j, TLRPC$DraftMessage tLRPC$DraftMessage) {
        if (this.dialogs_dict.indexOfKey(j) < 0) {
            MediaDataController mediaDataController = getMediaDataController();
            int size = this.allDialogs.size();
            int i = 1;
            if (size > 0) {
                TLRPC$Dialog tLRPC$Dialog = this.allDialogs.get(size - 1);
                if (tLRPC$DraftMessage.date < DialogObject.getLastMessageOrDraftDate(tLRPC$Dialog, mediaDataController.getDraft(tLRPC$Dialog.id, 0L))) {
                    return;
                }
            }
            TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
            tLRPC$TL_dialog.id = j;
            tLRPC$TL_dialog.draft = tLRPC$DraftMessage;
            tLRPC$TL_dialog.folder_id = mediaDataController.getDraftFolderId(j);
            tLRPC$TL_dialog.flags = (j >= 0 || !ChatObject.isChannel(getChat(Long.valueOf(-j)))) ? 0 : 0;
            this.dialogs_dict.put(j, tLRPC$TL_dialog);
            this.allDialogs.add(tLRPC$TL_dialog);
            sortDialogs(null);
        }
    }

    public void removeDraftDialogIfNeed(long j) {
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog == null || tLRPC$Dialog.top_message != 0) {
            return;
        }
        this.dialogs_dict.remove(tLRPC$Dialog.id);
        this.allDialogs.remove(tLRPC$Dialog);
    }

    private void removeDialog(TLRPC$Dialog tLRPC$Dialog) {
        if (tLRPC$Dialog == null) {
            return;
        }
        final long j = tLRPC$Dialog.id;
        if (this.dialogsServerOnly.remove(tLRPC$Dialog) && DialogObject.isChannel(tLRPC$Dialog)) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$removeDialog$119(j);
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
                this.selectedDialogFilter[i].dialogsForward.remove(tLRPC$Dialog);
            }
            i++;
        }
        this.dialogs_dict.remove(j);
        ArrayList<TLRPC$Dialog> arrayList = this.dialogsByFolder.get(tLRPC$Dialog.folder_id);
        if (arrayList != null) {
            arrayList.remove(tLRPC$Dialog);
        }
    }

    public void lambda$removeDialog$119(long j) {
        long j2 = -j;
        this.channelsPts.delete(j2);
        this.shortPollChannels.delete(j2);
        this.needShortPollChannels.delete(j2);
        this.shortPollOnlines.delete(j2);
        this.needShortPollOnlines.delete(j2);
    }

    public void hidePromoDialog() {
        if (this.promoDialog == null) {
            return;
        }
        TLRPC$TL_help_hidePromoData tLRPC$TL_help_hidePromoData = new TLRPC$TL_help_hidePromoData();
        tLRPC$TL_help_hidePromoData.peer = getInputPeer(this.promoDialog.id);
        getConnectionsManager().sendRequest(tLRPC$TL_help_hidePromoData, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$hidePromoDialog$120(tLObject, tLRPC$TL_error);
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$hidePromoDialog$121();
            }
        });
        removePromoDialog();
    }

    public void lambda$hidePromoDialog$121() {
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
                MessagesController.this.lambda$setDialogHistoryTTL$122(tLObject, tLRPC$TL_error);
            }
        });
        TLRPC$Dialog tLRPC$Dialog = getMessagesController().dialogs_dict.get(j);
        if (tLRPC$Dialog != null) {
            tLRPC$Dialog.ttl_period = i;
        }
        getMessagesStorage().setDialogTtl(j, i);
        TLRPC$ChatFull tLRPC$ChatFull = null;
        if (j > 0) {
            tLRPC$UserFull = getUserFull(j);
            if (tLRPC$UserFull != null) {
                tLRPC$UserFull.ttl_period = i;
                tLRPC$UserFull.flags |= LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM;
            }
        } else {
            TLRPC$ChatFull chatFull = getChatFull(-j);
            if (chatFull != null) {
                chatFull.ttl_period = i;
                if (chatFull instanceof TLRPC$TL_channelFull) {
                    chatFull.flags |= ConnectionsManager.FileTypePhoto;
                } else {
                    chatFull.flags |= LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM;
                }
            }
            tLRPC$ChatFull = chatFull;
            tLRPC$UserFull = null;
        }
        if (tLRPC$ChatFull == null) {
            if (tLRPC$UserFull != null) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), tLRPC$UserFull);
                return;
            }
            return;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i2 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, tLRPC$ChatFull, 0, bool, bool);
    }

    public void lambda$setDialogHistoryTTL$122(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void setDialogsInTransaction(boolean z) {
        this.dialogsInTransaction = z;
        if (z) {
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public void deleteDialog(final long r32, int r34, final int r35, int r36, final boolean r37, final org.telegram.tgnet.TLRPC$InputPeer r38, final long r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.deleteDialog(long, int, int, int, boolean, org.telegram.tgnet.TLRPC$InputPeer, long):void");
    }

    public void lambda$deleteDialog$123(long j, int i, boolean z, TLRPC$InputPeer tLRPC$InputPeer, long j2, int i2) {
        deleteDialog(j, 2, i, Math.max(0, i2), z, tLRPC$InputPeer, j2);
        checkIfFolderEmpty(1);
    }

    public void lambda$deleteDialog$124(long j) {
        getNotificationsController().removeNotificationsForDialog(j);
    }

    public void lambda$deleteDialog$125(final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteDialog$124(j);
            }
        });
    }

    public void lambda$deleteDialog$126(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void lambda$deleteDialog$127(long j, long j2, int i, int i2, boolean z, TLRPC$InputPeer tLRPC$InputPeer, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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

    public void deleteSavedDialog(long j) {
        deleteSavedDialog(j, 0);
    }

    protected void deleteSavedDialog(final long j, final int i) {
        final int[] iArr = {i};
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteSavedDialog$129(j, i, iArr);
            }
        };
        if (iArr[0] <= 0) {
            getMessagesStorage().getSavedDialogMaxMessageId(j, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i2) {
                    MessagesController.lambda$deleteSavedDialog$130(iArr, runnable, i2);
                }
            });
        } else {
            runnable.run();
        }
    }

    public void lambda$deleteSavedDialog$129(final long j, int i, final int[] iArr) {
        getMessagesStorage().deleteSavedDialog(j);
        TLRPC$TL_messages_deleteSavedHistory tLRPC$TL_messages_deleteSavedHistory = new TLRPC$TL_messages_deleteSavedHistory();
        tLRPC$TL_messages_deleteSavedHistory.peer = getInputPeer(j);
        if (i == 0) {
            SavedMessagesController.SavedDialog savedDialog = null;
            int i2 = 0;
            while (true) {
                if (i2 >= getSavedMessagesController().allDialogs.size()) {
                    break;
                } else if (getSavedMessagesController().allDialogs.get(i2).dialogId == j) {
                    savedDialog = getSavedMessagesController().allDialogs.get(i2);
                    break;
                } else {
                    i2++;
                }
            }
            if (savedDialog != null) {
                iArr[0] = Math.max(iArr[0], savedDialog.top_message_id);
                getSavedMessagesController().deleteDialog(j);
            }
            tLRPC$TL_messages_deleteSavedHistory.max_id = iArr[0] <= 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : iArr[0];
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteSavedHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$deleteSavedDialog$128(j, iArr, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$deleteSavedDialog$128(long j, int[] iArr, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedHistory tLRPC$TL_messages_affectedHistory = (TLRPC$TL_messages_affectedHistory) tLObject;
            if (tLRPC$TL_messages_affectedHistory.offset > 0) {
                deleteSavedDialog(j, iArr[0]);
            }
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedHistory.pts, -1, tLRPC$TL_messages_affectedHistory.pts_count);
            getMessagesStorage().onDeleteQueryComplete(j);
        }
    }

    public static void lambda$deleteSavedDialog$130(int[] iArr, Runnable runnable, int i) {
        iArr[0] = i;
        runnable.run();
    }

    public void saveGif(final Object obj, TLRPC$Document tLRPC$Document) {
        if (obj == null || !MessageObject.isGifDocument(tLRPC$Document)) {
            return;
        }
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
                MessagesController.this.lambda$saveGif$131(obj, tLRPC$TL_messages_saveGif, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$saveGif$131(Object obj, TLRPC$TL_messages_saveGif tLRPC$TL_messages_saveGif, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null || !FileRefController.isFileRefError(tLRPC$TL_error.text)) {
            return;
        }
        getFileRefController().requestReference(obj, tLRPC$TL_messages_saveGif);
    }

    public void saveRecentSticker(final Object obj, TLRPC$Document tLRPC$Document, boolean z) {
        if (obj == null || tLRPC$Document == null) {
            return;
        }
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
                MessagesController.this.lambda$saveRecentSticker$132(obj, tLRPC$TL_messages_saveRecentSticker, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$saveRecentSticker$132(Object obj, TLRPC$TL_messages_saveRecentSticker tLRPC$TL_messages_saveRecentSticker, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null || !FileRefController.isFileRefError(tLRPC$TL_error.text)) {
            return;
        }
        getFileRefController().requestReference(obj, tLRPC$TL_messages_saveRecentSticker);
    }

    public void loadChannelParticipants(Long l) {
        loadChannelParticipants(l, null, 32);
    }

    public void loadChannelParticipants(final Long l, final Utilities.Callback<TLRPC$TL_channels_channelParticipants> callback, int i) {
        if (callback == null && (this.loadingFullParticipants.contains(l) || this.loadedFullParticipants.contains(l))) {
            return;
        }
        this.loadingFullParticipants.add(l);
        TLRPC$TL_channels_getParticipants tLRPC$TL_channels_getParticipants = new TLRPC$TL_channels_getParticipants();
        tLRPC$TL_channels_getParticipants.channel = getInputChannel(l.longValue());
        tLRPC$TL_channels_getParticipants.filter = new TLRPC$TL_channelParticipantsRecent();
        tLRPC$TL_channels_getParticipants.offset = 0;
        tLRPC$TL_channels_getParticipants.limit = i;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_getParticipants, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadChannelParticipants$134(l, callback, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadChannelParticipants$134(final Long l, final Utilities.Callback callback, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadChannelParticipants$133(tLRPC$TL_error, tLObject, l, callback);
            }
        });
    }

    public void lambda$loadChannelParticipants$133(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, Long l, Utilities.Callback callback) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_channels_channelParticipants tLRPC$TL_channels_channelParticipants = (TLRPC$TL_channels_channelParticipants) tLObject;
            putUsers(tLRPC$TL_channels_channelParticipants.users, false);
            putChats(tLRPC$TL_channels_channelParticipants.chats, false);
            getMessagesStorage().putUsersAndChats(tLRPC$TL_channels_channelParticipants.users, tLRPC$TL_channels_channelParticipants.chats, true, true);
            getMessagesStorage().updateChannelUsers(l.longValue(), tLRPC$TL_channels_channelParticipants.participants);
            this.loadedFullParticipants.add(l);
        }
        this.loadingFullParticipants.remove(l);
        if (callback != null) {
            callback.run(tLObject instanceof TLRPC$TL_channels_channelParticipants ? (TLRPC$TL_channels_channelParticipants) tLObject : null);
        }
    }

    public void putChatFull(TLRPC$ChatFull tLRPC$ChatFull) {
        this.fullChats.put(tLRPC$ChatFull.id, tLRPC$ChatFull);
        getTranslateController().updateDialogFull(-tLRPC$ChatFull.id);
    }

    public void processChatInfo(final long j, final TLRPC$ChatFull tLRPC$ChatFull, final ArrayList<TLRPC$User> arrayList, final boolean z, final boolean z2, final boolean z3, final ArrayList<Integer> arrayList2, final HashMap<Integer, MessageObject> hashMap, final int i, final boolean z4) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processChatInfo$135(z, j, z3, z2, tLRPC$ChatFull, arrayList, arrayList2, hashMap, i, z4);
            }
        });
    }

    public void lambda$processChatInfo$135(boolean z, long j, boolean z2, boolean z3, TLRPC$ChatFull tLRPC$ChatFull, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap, int i, boolean z4) {
        if (z && j > 0 && !z2 && System.currentTimeMillis() - this.loadedFullChats.get(j, 0L) > 60000) {
            loadFullChat(j, 0, z3);
        }
        if (tLRPC$ChatFull != null) {
            if (this.fullChats.get(j) == null) {
                this.fullChats.put(j, tLRPC$ChatFull);
                getTranslateController().updateDialogFull(-j);
            }
            putUsers(arrayList, z);
            if (tLRPC$ChatFull.stickerset != null) {
                getMediaDataController().getGroupStickerSetById(tLRPC$ChatFull.stickerset);
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, tLRPC$ChatFull, 0, Boolean.valueOf(z2), Boolean.FALSE);
        }
        if (arrayList2 != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pinnedInfoDidLoad, Long.valueOf(-j), arrayList2, hashMap, Integer.valueOf(i), Boolean.valueOf(z4));
        }
    }

    public void loadUserInfo(TLRPC$User tLRPC$User, boolean z, int i) {
        loadUserInfo(tLRPC$User, z, i, 0);
    }

    public void loadUserInfo(TLRPC$User tLRPC$User, boolean z, int i, int i2) {
        getMessagesStorage().loadUserInfo(tLRPC$User, z, i, i2);
    }

    public void updateUsernameActiveness(TLObject tLObject, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.objectsByUsernames.remove(str);
        if (z) {
            this.objectsByUsernames.put(str.toLowerCase(), tLObject);
        }
    }

    public void processUserInfo(final TLRPC$User tLRPC$User, final TLRPC$UserFull tLRPC$UserFull, final boolean z, final boolean z2, final int i, final ArrayList<Integer> arrayList, final HashMap<Integer, MessageObject> hashMap, final int i2, final boolean z3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUserInfo$136(z, tLRPC$User, i, z2, tLRPC$UserFull, arrayList, hashMap, i2, z3);
            }
        });
    }

    public void lambda$processUserInfo$136(boolean z, TLRPC$User tLRPC$User, int i, boolean z2, TLRPC$UserFull tLRPC$UserFull, ArrayList arrayList, HashMap hashMap, int i2, boolean z3) {
        if (z && System.currentTimeMillis() - this.loadedFullUsers.get(tLRPC$User.id, 0L) > 60000) {
            loadFullUser(tLRPC$User, i, z2);
        }
        if (tLRPC$UserFull != null) {
            if (this.fullUsers.get(tLRPC$User.id) == null) {
                this.fullUsers.put(tLRPC$User.id, tLRPC$UserFull);
                getTranslateController().updateDialogFull(tLRPC$User.id);
                int indexOfKey = this.blockePeers.indexOfKey(tLRPC$User.id);
                if (tLRPC$UserFull.blocked) {
                    if (indexOfKey < 0) {
                        this.blockePeers.put(tLRPC$User.id, 1);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    this.blockePeers.removeAt(indexOfKey);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
                }
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(tLRPC$User.id), tLRPC$UserFull);
        }
        if (arrayList != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pinnedInfoDidLoad, Long.valueOf(tLRPC$User.id), arrayList, hashMap, Integer.valueOf(i2), Boolean.valueOf(z3));
        }
    }

    public void updateTimerProc() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = 0;
        checkDeletingTask(false);
        checkReadTasks();
        if (getUserConfig().isClientActivated()) {
            if (!this.ignoreSetOnline && getConnectionsManager().getPauseTime() == 0 && ApplicationLoader.isScreenOn && !ApplicationLoader.mainInterfacePausedStageQueue) {
                if (ApplicationLoader.mainInterfacePausedStageQueueTime != 0 && Math.abs(ApplicationLoader.mainInterfacePausedStageQueueTime - System.currentTimeMillis()) > 1000 && this.statusSettingState != 1 && (this.lastStatusUpdateTime == 0 || Math.abs(System.currentTimeMillis() - this.lastStatusUpdateTime) >= 55000 || this.offlineSent)) {
                    this.statusSettingState = 1;
                    if (this.statusRequest != 0) {
                        getConnectionsManager().cancelRequest(this.statusRequest, true);
                    }
                    TLRPC$TL_account_updateStatus tLRPC$TL_account_updateStatus = new TLRPC$TL_account_updateStatus();
                    tLRPC$TL_account_updateStatus.offline = false;
                    this.statusRequest = getConnectionsManager().sendRequest(tLRPC$TL_account_updateStatus, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$updateTimerProc$137(tLObject, tLRPC$TL_error);
                        }
                    });
                }
            } else if (this.statusSettingState != 2 && !this.offlineSent && Math.abs(System.currentTimeMillis() - getConnectionsManager().getPauseTime()) >= 2000) {
                this.statusSettingState = 2;
                if (this.statusRequest != 0) {
                    getConnectionsManager().cancelRequest(this.statusRequest, true);
                }
                TLRPC$TL_account_updateStatus tLRPC$TL_account_updateStatus2 = new TLRPC$TL_account_updateStatus();
                tLRPC$TL_account_updateStatus2.offline = true;
                this.statusRequest = getConnectionsManager().sendRequest(tLRPC$TL_account_updateStatus2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$updateTimerProc$138(tLObject, tLRPC$TL_error);
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
                            MessagesController.this.lambda$updateTimerProc$140(keyAt2, tLRPC$TL_messages_getMessagesViews, tLObject, tLRPC$TL_error);
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
                        MessagesController.this.lambda$updateTimerProc$142(currentTime);
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
                        MessagesController.this.lambda$updateTimerProc$143();
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
                            MessagesController.this.lambda$updateTimerProc$145(keyAt4, tLObject, tLRPC$TL_error);
                        }
                    });
                }
                i9++;
            }
        }
        if (this.printingUsers.isEmpty() && this.lastPrintingStringCount == this.printingUsers.size()) {
            i = 1;
        } else {
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
                                Long l2 = l;
                                ArrayList arrayList6 = arrayList3;
                                int i12 = i10;
                                if (printingUser.lastTime + (printingUser.action instanceof TLRPC$TL_sendMessageGamePlayAction ? 30000 : 5900) < currentTimeMillis) {
                                    arrayList5.remove(printingUser);
                                    i4--;
                                    i3 = 1;
                                    z = true;
                                } else {
                                    i3 = 1;
                                }
                                i4 += i3;
                                l = l2;
                                arrayList3 = arrayList6;
                                i10 = i12;
                            }
                        }
                        ArrayList arrayList7 = arrayList3;
                        int i13 = i10;
                        Long l3 = l;
                        if (arrayList5 == null || arrayList5.isEmpty()) {
                            concurrentHashMap.remove(num);
                            arrayList4.remove(i11);
                            i11--;
                        }
                        i11++;
                        l = l3;
                        arrayList3 = arrayList7;
                        i10 = i13;
                        i4 = 0;
                    }
                }
                ArrayList arrayList8 = arrayList3;
                int i14 = i10;
                Long l4 = l;
                if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                    this.printingUsers.remove(l4);
                    arrayList = arrayList8;
                    arrayList.remove(i14);
                    i2 = i14 - 1;
                } else {
                    arrayList = arrayList8;
                    i2 = i14;
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
                        MessagesController.this.lambda$updateTimerProc$146();
                    }
                });
            }
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
            PushListenerController.sendRegistrationToServer(SharedConfig.pushType, SharedConfig.pushString);
        }
        getLocationController().update();
        lambda$checkPromoInfo$149(false);
        checkTosUpdate();
    }

    public void lambda$updateTimerProc$137(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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

    public void lambda$updateTimerProc$138(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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

    public void lambda$updateTimerProc$140(long j, TLRPC$TL_messages_getMessagesViews tLRPC$TL_messages_getMessagesViews, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                    MessagesController.this.lambda$updateTimerProc$139(tLRPC$TL_messages_messageViews, longSparseArray, longSparseArray2, longSparseArray3);
                }
            });
        }
    }

    public void lambda$updateTimerProc$139(TLRPC$TL_messages_messageViews tLRPC$TL_messages_messageViews, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, LongSparseArray longSparseArray3) {
        putUsers(tLRPC$TL_messages_messageViews.users, false);
        putChats(tLRPC$TL_messages_messageViews.chats, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateMessagesViews, longSparseArray, longSparseArray2, longSparseArray3, Boolean.FALSE);
    }

    public void lambda$updateTimerProc$142(int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$updateTimerProc$142(int):void");
    }

    public void lambda$updateTimerProc$141(boolean z, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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

    public void lambda$updateTimerProc$143() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_STATUS));
    }

    public void lambda$updateTimerProc$145(final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$TL_chatOnlines tLRPC$TL_chatOnlines = (TLRPC$TL_chatOnlines) tLObject;
            getMessagesStorage().updateChatOnlineCount(j, tLRPC$TL_chatOnlines.onlines);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$updateTimerProc$144(j, tLRPC$TL_chatOnlines);
                }
            });
        }
    }

    public void lambda$updateTimerProc$144(long j, TLRPC$TL_chatOnlines tLRPC$TL_chatOnlines) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatOnlineCountDidLoad, Long.valueOf(j), Integer.valueOf(tLRPC$TL_chatOnlines.onlines));
    }

    public void lambda$updateTimerProc$146() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_USER_PRINT));
    }

    private void checkTosUpdate() {
        if (this.nextTosCheckTime > getConnectionsManager().getCurrentTime() || this.checkingTosUpdate || !getUserConfig().isClientActivated()) {
            return;
        }
        this.checkingTosUpdate = true;
        getConnectionsManager().sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                return TLRPC$help_TermsOfServiceUpdate.TLdeserialize(abstractSerializedData, i, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(749019089);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$checkTosUpdate$148(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$checkTosUpdate$148(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.checkingTosUpdate = false;
        if (tLObject instanceof TLRPC$TL_help_termsOfServiceUpdateEmpty) {
            this.nextTosCheckTime = ((TLRPC$TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
        } else if (tLObject instanceof TLRPC$TL_help_termsOfServiceUpdate) {
            final TLRPC$TL_help_termsOfServiceUpdate tLRPC$TL_help_termsOfServiceUpdate = (TLRPC$TL_help_termsOfServiceUpdate) tLObject;
            this.nextTosCheckTime = tLRPC$TL_help_termsOfServiceUpdate.expires;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkTosUpdate$147(tLRPC$TL_help_termsOfServiceUpdate);
                }
            });
        } else {
            this.nextTosCheckTime = getConnectionsManager().getCurrentTime() + 3600;
        }
        this.notificationsPreferences.edit().putInt("nextTosCheckTime", this.nextTosCheckTime).commit();
    }

    public void lambda$checkTosUpdate$147(TLRPC$TL_help_termsOfServiceUpdate tLRPC$TL_help_termsOfServiceUpdate) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 4, tLRPC$TL_help_termsOfServiceUpdate.terms_of_service);
    }

    public void checkPromoInfo(final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkPromoInfo$149(z);
            }
        });
    }

    public void lambda$checkPromoInfo$149(boolean z) {
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
            if (this.promoDialogId != 0 && this.promoDialogType == PROMO_TYPE_PROXY && (str = this.proxyDialogAddress) != null) {
                if (!str.equals(string + string2)) {
                    z2 = true;
                }
            }
            final int i = this.lastCheckPromoId + 1;
            this.lastCheckPromoId = i;
            this.checkingPromoInfo = true;
            this.checkingPromoInfoRequestId = getConnectionsManager().sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i2, boolean z3) {
                    return TLRPC$help_PromoData.TLdeserialize(abstractSerializedData, i2, z3);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(-1063816159);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkPromoInfoInternal$154(i, string, string2, tLObject, tLRPC$TL_error);
                }
            });
            if (z2) {
                this.promoDialogId = 0L;
                this.proxyDialogAddress = null;
                this.nextPromoInfoCheckTime = getConnectionsManager().getCurrentTime() + 3600;
                getGlobalMainSettings().edit().putLong("proxy_dialog", this.promoDialogId).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.nextPromoInfoCheckTime).commit();
                AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda23(this));
            }
        }
    }

    public void lambda$checkPromoInfoInternal$154(final int r17, java.lang.String r18, java.lang.String r19, org.telegram.tgnet.TLObject r20, org.telegram.tgnet.TLRPC$TL_error r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$checkPromoInfoInternal$154(int, java.lang.String, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$checkPromoInfoInternal$153(final long j, final TLRPC$TL_help_promoData tLRPC$TL_help_promoData, final int i) {
        TLRPC$Dialog tLRPC$Dialog = this.promoDialog;
        if (tLRPC$Dialog != null && j != tLRPC$Dialog.id) {
            removePromoDialog();
        }
        TLRPC$Dialog tLRPC$Dialog2 = this.dialogs_dict.get(j);
        this.promoDialog = tLRPC$Dialog2;
        if (tLRPC$Dialog2 != null) {
            this.checkingPromoInfo = false;
            sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
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
                MessagesController.this.lambda$checkPromoInfoInternal$152(i, tLRPC$TL_help_promoData, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$checkPromoInfoInternal$152(int i, final TLRPC$TL_help_promoData tLRPC$TL_help_promoData, final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (i != this.lastCheckPromoId) {
            return;
        }
        this.checkingPromoInfoRequestId = 0;
        final TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
        if (tLRPC$TL_messages_peerDialogs != null && !tLRPC$TL_messages_peerDialogs.dialogs.isEmpty()) {
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
                    MessagesController.this.lambda$checkPromoInfoInternal$150(tLRPC$TL_help_promoData, tLRPC$TL_messages_peerDialogs, j);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkPromoInfoInternal$151();
                }
            });
        }
        this.checkingPromoInfo = false;
    }

    public void lambda$checkPromoInfoInternal$150(TLRPC$TL_help_promoData tLRPC$TL_help_promoData, TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs, long j) {
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
        Integer num = this.dialogs_read_inbox_max.get(Long.valueOf(this.promoDialog.id));
        if (num == null) {
            num = r2;
        }
        this.dialogs_read_inbox_max.put(Long.valueOf(this.promoDialog.id), Integer.valueOf(Math.max(num.intValue(), this.promoDialog.read_inbox_max_id)));
        Integer num2 = this.dialogs_read_outbox_max.get(Long.valueOf(this.promoDialog.id));
        this.dialogs_read_outbox_max.put(Long.valueOf(this.promoDialog.id), Integer.valueOf(Math.max((num2 != null ? num2 : 0).intValue(), this.promoDialog.read_outbox_max_id)));
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
            ArrayList<MessageObject> arrayList = this.dialogMessage.get(j);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
            }
            if (arrayList.size() > 0 && arrayList.get(0) != null && arrayList.get(0).hasValidGroupId() && arrayList.get(0).getGroupIdForUse() != messageObject.getGroupIdForUse()) {
                arrayList.clear();
            }
            arrayList.add(messageObject);
            this.dialogMessage.put(j, arrayList);
            TLRPC$Dialog tLRPC$Dialog4 = this.promoDialog;
            if (tLRPC$Dialog4.last_message_date == 0) {
                tLRPC$Dialog4.last_message_date = messageObject.messageOwner.date;
            }
            getTranslateController().checkDialogMessage(j);
        }
        sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public void lambda$checkPromoInfoInternal$151() {
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
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void removePromoDialog() {
        TLRPC$Dialog tLRPC$Dialog = this.promoDialog;
        if (tLRPC$Dialog == null) {
            return;
        }
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
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
        return (str2 == null || str2.length() <= 0) ? "" : tLRPC$User.last_name;
    }

    private void updatePrintingStrings() {
        Iterator<Map.Entry<Long, ConcurrentHashMap<Integer, ArrayList<PrintingUser>>>> it;
        Iterator<Map.Entry<Integer, ArrayList<PrintingUser>>> it2;
        String string;
        int i;
        String str;
        int i2;
        String formatString;
        final LongSparseArray longSparseArray = new LongSparseArray();
        final LongSparseArray longSparseArray2 = new LongSparseArray();
        Iterator<Map.Entry<Long, ConcurrentHashMap<Integer, ArrayList<PrintingUser>>>> it3 = this.printingUsers.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<Long, ConcurrentHashMap<Integer, ArrayList<PrintingUser>>> next = it3.next();
            Long key = next.getKey();
            boolean isEncryptedDialog = DialogObject.isEncryptedDialog(key.longValue());
            Iterator<Map.Entry<Integer, ArrayList<PrintingUser>>> it4 = next.getValue().entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry<Integer, ArrayList<PrintingUser>> next2 = it4.next();
                Integer key2 = next2.getKey();
                ArrayList<PrintingUser> value = next2.getValue();
                LongSparseArray longSparseArray3 = new LongSparseArray();
                LongSparseArray longSparseArray4 = new LongSparseArray();
                longSparseArray.put(key.longValue(), longSparseArray3);
                longSparseArray2.put(key.longValue(), longSparseArray4);
                if (key.longValue() > 0 || isEncryptedDialog || value.size() == 1) {
                    it = it3;
                    it2 = it4;
                    PrintingUser printingUser = value.get(0);
                    TLRPC$User user = getUser(Long.valueOf(printingUser.userId));
                    if (user != null) {
                        boolean z = key.longValue() < 0 && !isEncryptedDialog;
                        TLRPC$SendMessageAction tLRPC$SendMessageAction = printingUser.action;
                        if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageRecordAudioAction) {
                            if (z) {
                                string = LocaleController.formatString("IsRecordingAudio", R.string.IsRecordingAudio, getUserNameForTyping(user));
                            } else {
                                string = LocaleController.getString("RecordingAudio", R.string.RecordingAudio);
                            }
                            i = 1;
                        } else {
                            if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageRecordRoundAction) {
                                if (z) {
                                    string = LocaleController.formatString("IsRecordingRound", R.string.IsRecordingRound, getUserNameForTyping(user));
                                } else {
                                    string = LocaleController.getString("RecordingRound", R.string.RecordingRound);
                                }
                            } else if (!(tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageUploadRoundAction)) {
                                if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageUploadAudioAction) {
                                    if (z) {
                                        string = LocaleController.formatString("IsSendingAudio", R.string.IsSendingAudio, getUserNameForTyping(user));
                                    } else {
                                        string = LocaleController.getString("SendingAudio", R.string.SendingAudio);
                                    }
                                } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageUploadVideoAction) {
                                    if (z) {
                                        string = LocaleController.formatString("IsSendingVideo", R.string.IsSendingVideo, getUserNameForTyping(user));
                                    } else {
                                        string = LocaleController.getString("SendingVideoStatus", R.string.SendingVideoStatus);
                                    }
                                } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageRecordVideoAction) {
                                    if (z) {
                                        string = LocaleController.formatString("IsRecordingVideo", R.string.IsRecordingVideo, getUserNameForTyping(user));
                                    } else {
                                        string = LocaleController.getString("RecordingVideoStatus", R.string.RecordingVideoStatus);
                                    }
                                } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageUploadDocumentAction) {
                                    if (z) {
                                        string = LocaleController.formatString("IsSendingFile", R.string.IsSendingFile, getUserNameForTyping(user));
                                    } else {
                                        string = LocaleController.getString("SendingFile", R.string.SendingFile);
                                    }
                                } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageUploadPhotoAction) {
                                    if (z) {
                                        string = LocaleController.formatString("IsSendingPhoto", R.string.IsSendingPhoto, getUserNameForTyping(user));
                                    } else {
                                        string = LocaleController.getString("SendingPhoto", R.string.SendingPhoto);
                                    }
                                } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageGamePlayAction) {
                                    if (z) {
                                        string = LocaleController.formatString("IsSendingGame", R.string.IsSendingGame, getUserNameForTyping(user));
                                    } else {
                                        string = LocaleController.getString("SendingGame", R.string.SendingGame);
                                    }
                                    i = 3;
                                } else {
                                    if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageGeoLocationAction) {
                                        if (z) {
                                            string = LocaleController.formatString("IsSelectingLocation", R.string.IsSelectingLocation, getUserNameForTyping(user));
                                        } else {
                                            string = LocaleController.getString("SelectingLocation", R.string.SelectingLocation);
                                        }
                                    } else if (!(tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageChooseContactAction)) {
                                        if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageEmojiInteractionSeen) {
                                            String str2 = ((TLRPC$TL_sendMessageEmojiInteractionSeen) tLRPC$SendMessageAction).emoticon;
                                            if (z) {
                                                string = LocaleController.formatString("IsEnjoyngAnimations", R.string.IsEnjoyngAnimations, getUserNameForTyping(user), str2);
                                            } else {
                                                string = LocaleController.formatString("EnjoyngAnimations", R.string.EnjoyngAnimations, str2);
                                            }
                                        } else if (tLRPC$SendMessageAction instanceof TLRPC$TL_sendMessageChooseStickerAction) {
                                            if (z) {
                                                string = LocaleController.formatString("IsChoosingSticker", R.string.IsChoosingSticker, getUserNameForTyping(user));
                                            } else {
                                                string = LocaleController.getString("ChoosingSticker", R.string.ChoosingSticker);
                                            }
                                        } else if (z) {
                                            string = LocaleController.formatString("IsTypingGroup", R.string.IsTypingGroup, getUserNameForTyping(user));
                                        } else {
                                            string = LocaleController.getString("Typing", R.string.Typing);
                                        }
                                        i = 5;
                                    } else if (z) {
                                        string = LocaleController.formatString("IsSelectingContact", R.string.IsSelectingContact, getUserNameForTyping(user));
                                    } else {
                                        string = LocaleController.getString("SelectingContact", R.string.SelectingContact);
                                    }
                                    i = 0;
                                }
                                i = 2;
                            } else if (z) {
                                string = LocaleController.formatString("IsSendingVideo", R.string.IsSendingVideo, getUserNameForTyping(user));
                            } else {
                                string = LocaleController.getString("SendingVideoStatus", R.string.SendingVideoStatus);
                            }
                            i = 4;
                        }
                        int i3 = i;
                        str = string;
                        i2 = i3;
                    } else {
                        it3 = it;
                        it4 = it2;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    Iterator<PrintingUser> it5 = value.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it5.hasNext()) {
                            it = it3;
                            it2 = it4;
                            break;
                        }
                        it = it3;
                        it2 = it4;
                        TLRPC$User user2 = getUser(Long.valueOf(it5.next().userId));
                        if (user2 != null) {
                            if (sb.length() != 0) {
                                sb.append(", ");
                            }
                            sb.append(getUserNameForTyping(user2));
                            i4++;
                        }
                        if (i4 == 2) {
                            break;
                        }
                        it3 = it;
                        it4 = it2;
                    }
                    if (sb.length() != 0) {
                        if (i4 == 1) {
                            formatString = LocaleController.formatString("IsTypingGroup", R.string.IsTypingGroup, sb.toString());
                        } else if (value.size() > 2) {
                            try {
                                formatString = String.format(LocaleController.getPluralString("AndMoreTypingGroup", value.size() - 2), sb.toString(), Integer.valueOf(value.size() - 2));
                            } catch (Exception unused) {
                                formatString = "LOC_ERR: AndMoreTypingGroup";
                            }
                        } else {
                            formatString = LocaleController.formatString("AreTypingGroup", R.string.AreTypingGroup, sb.toString());
                            str = formatString;
                            i2 = 0;
                        }
                        str = formatString;
                        i2 = 0;
                    } else {
                        i2 = 0;
                        str = null;
                    }
                }
                if (str != null) {
                    Paint paint = Theme.dialogs_messageNamePaint;
                    if (paint == null) {
                        paint = new Paint();
                        paint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        paint.setTextSize(AndroidUtilities.dp(14.0f));
                    }
                    longSparseArray3.put(key2.intValue(), Emoji.replaceEmoji(str, paint.getFontMetricsInt(), false));
                    longSparseArray4.put(key2.intValue(), Integer.valueOf(i2));
                }
                it3 = it;
                it4 = it2;
            }
        }
        this.lastPrintingStringCount = longSparseArray.size();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$updatePrintingStrings$155(longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$updatePrintingStrings$155(LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        this.printingStrings = longSparseArray;
        this.printingStringsTypes = longSparseArray2;
    }

    public void lambda$sendTyping$158(int i, long j, long j2) {
        LongSparseArray<LongSparseArray<Boolean>> longSparseArray;
        LongSparseArray<Boolean> longSparseArray2;
        if (i >= 0) {
            LongSparseArray<LongSparseArray<Boolean>>[] longSparseArrayArr = this.sendingTypings;
            if (i >= longSparseArrayArr.length || longSparseArrayArr[i] == null || (longSparseArray2 = (longSparseArray = longSparseArrayArr[i]).get(j)) == null) {
                return;
            }
            longSparseArray2.remove(j2);
            if (longSparseArray2.size() == 0) {
                longSparseArray.remove(j);
            }
        }
    }

    public boolean sendTyping(long j, long j2, int i, int i2) {
        return sendTyping(j, j2, i, null, i2);
    }

    public boolean sendTyping(final long j, final long j2, final int i, String str, int i2) {
        TLRPC$Chat chat;
        if (i < 0 || i >= this.sendingTypings.length || j == 0) {
            return false;
        }
        long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
        if (j == clientUserId) {
            return false;
        }
        if (j < 0) {
            long j3 = -j;
            if (ChatObject.getSendAsPeerId(getChat(Long.valueOf(j3)), getChatFull(j3)) != clientUserId) {
                return false;
            }
        } else {
            TLRPC$User user = getUser(Long.valueOf(j));
            if (user != null) {
                if (user.id == getUserConfig().getClientUserId()) {
                    return false;
                }
                TLRPC$UserStatus tLRPC$UserStatus = user.status;
                if (tLRPC$UserStatus != null && tLRPC$UserStatus.expires != -100 && !this.onlinePrivacy.containsKey(Long.valueOf(user.id))) {
                    if (user.status.expires <= getConnectionsManager().getCurrentTime() - 30) {
                        return false;
                    }
                }
            }
        }
        LongSparseArray<LongSparseArray<Boolean>>[] longSparseArrayArr = this.sendingTypings;
        LongSparseArray<LongSparseArray<Boolean>> longSparseArray = longSparseArrayArr[i];
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
            longSparseArrayArr[i] = longSparseArray;
        }
        LongSparseArray<Boolean> longSparseArray2 = longSparseArray.get(j);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray<>();
            longSparseArray.put(j, longSparseArray2);
        }
        if (longSparseArray2.get(j2) != null) {
            return false;
        }
        if (!DialogObject.isEncryptedDialog(j)) {
            TLRPC$TL_messages_setTyping tLRPC$TL_messages_setTyping = new TLRPC$TL_messages_setTyping();
            if (j2 != 0) {
                tLRPC$TL_messages_setTyping.top_msg_id = (int) j2;
                tLRPC$TL_messages_setTyping.flags |= 1;
            }
            TLRPC$InputPeer inputPeer = getInputPeer(j);
            tLRPC$TL_messages_setTyping.peer = inputPeer;
            if (((inputPeer instanceof TLRPC$TL_inputPeerChannel) && ((chat = getChat(Long.valueOf(inputPeer.channel_id))) == null || !chat.megagroup)) || tLRPC$TL_messages_setTyping.peer == null) {
                return false;
            }
            if (i == 0) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageTypingAction();
            } else if (i == 1) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageRecordAudioAction();
            } else if (i == 2) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageCancelAction();
            } else if (i == 3) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageUploadDocumentAction();
            } else if (i == 4) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageUploadPhotoAction();
            } else if (i == 5) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageUploadVideoAction();
            } else if (i == 6) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageGamePlayAction();
            } else if (i == 7) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageRecordRoundAction();
            } else if (i == 8) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageUploadRoundAction();
            } else if (i == 9) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageUploadAudioAction();
            } else if (i == 10) {
                tLRPC$TL_messages_setTyping.action = new TLRPC$TL_sendMessageChooseStickerAction();
            } else if (i == 11) {
                TLRPC$TL_sendMessageEmojiInteractionSeen tLRPC$TL_sendMessageEmojiInteractionSeen = new TLRPC$TL_sendMessageEmojiInteractionSeen();
                tLRPC$TL_sendMessageEmojiInteractionSeen.emoticon = str;
                tLRPC$TL_messages_setTyping.action = tLRPC$TL_sendMessageEmojiInteractionSeen;
            }
            longSparseArray2.put(j2, Boolean.TRUE);
            int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_setTyping, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$sendTyping$157(i, j, j2, tLObject, tLRPC$TL_error);
                }
            }, 2);
            if (i2 != 0) {
                getConnectionsManager().bindRequestToGuid(sendRequest, i2);
            }
        } else if (i != 0) {
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
                longSparseArray2.put(j2, Boolean.TRUE);
                int sendRequest2 = getConnectionsManager().sendRequest(tLRPC$TL_messages_setEncryptedTyping, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$sendTyping$159(i, j, j2, tLObject, tLRPC$TL_error);
                    }
                }, 2);
                if (i2 != 0) {
                    getConnectionsManager().bindRequestToGuid(sendRequest2, i2);
                }
            }
        }
        return true;
    }

    public void lambda$sendTyping$157(final int i, final long j, final long j2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$sendTyping$156(i, j, j2);
            }
        });
    }

    public void lambda$sendTyping$159(final int i, final long j, final long j2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$sendTyping$158(i, j, j2);
            }
        });
    }

    public void removeDeletedMessagesFromArray(long j, ArrayList<TLRPC$Message> arrayList) {
        int i = 0;
        int i2 = this.deletedHistory.get(j, 0);
        if (i2 == 0) {
            return;
        }
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

    public void loadMessages(long j, long j2, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7, int i8, long j3, int i9, int i10, boolean z3) {
        loadMessages(j, j2, z, i, i2, i3, z2, i4, i5, i6, i7, i8, j3, i10, j3 != 0 ? i9 : 0, 0, 0, false, 0, z3);
    }

    public void loadMessages(long j, long j2, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7, int i8, long j3, int i9, int i10, int i11, int i12, boolean z3, int i13, boolean z4) {
        loadMessagesInternal(j, j2, z, i, i2, i3, z2, i4, i5, i6, i7, i8, j3, i9, i10, i11, i12, z3, i13, true, true, z4, null, 0L);
    }

    public void loadMessagesInternal(final long j, final long j2, final boolean z, final int i, final int i2, final int i3, boolean z2, final int i4, final int i5, final int i6, final int i7, final int i8, final long j3, final int i9, final int i10, final int i11, final int i12, final boolean z3, final int i13, boolean z4, final boolean z5, final boolean z6, MessageLoaderLogger messageLoaderLogger, long j4) {
        int i14;
        int i15;
        StringWriter stringWriter;
        if (BuildVars.LOGS_ENABLED) {
            new Exception().printStackTrace(new PrintWriter(new StringWriter()));
            FileLog.d("load messages in chat " + j + " topic_id " + j3 + " count " + i + " max_id " + i2 + " cache " + z2 + " mindate = " + i4 + " guid " + i5 + " load_type " + i6 + " last_message_id " + i7 + " mode " + i8 + " index " + i9 + " firstUnread " + i10 + " unread_count " + i11 + " last_date " + i12 + " queryFromServer " + z3 + " isTopic " + z6 + "\n" + stringWriter.toString());
        }
        MessageLoaderLogger messageLoaderLogger2 = (BuildVars.LOGS_ENABLED && messageLoaderLogger == null && i8 == 0) ? new MessageLoaderLogger(j, i9, i) : messageLoaderLogger;
        if ((j3 == 0 || z6 || i8 == 3) && i8 != 2 && (z2 || DialogObject.isEncryptedDialog(j))) {
            getMessagesStorage().getMessages(j, j2, z, i, i2, i3, i4, i5, i6, i8, j3, i9, z5, z6, messageLoaderLogger2);
        } else if (j3 == 0) {
            if (i8 == 2) {
                return;
            }
            if (i8 == 1) {
                TLRPC$TL_messages_getScheduledHistory tLRPC$TL_messages_getScheduledHistory = new TLRPC$TL_messages_getScheduledHistory();
                tLRPC$TL_messages_getScheduledHistory.peer = getInputPeer(j);
                tLRPC$TL_messages_getScheduledHistory.hash = j4;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getScheduledHistory, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadMessagesInternal$164(i2, i3, j, j2, i, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLObject, tLRPC$TL_error);
                    }
                }), i5);
            } else if (z4 && ((i6 == 3 || i6 == 2) && i7 == 0)) {
                final TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs = new TLRPC$TL_messages_getPeerDialogs();
                TLRPC$InputPeer inputPeer = getInputPeer(j);
                TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
                tLRPC$TL_inputDialogPeer.peer = inputPeer;
                tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer);
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadMessagesInternal$166(j, j2, z, i, i2, i3, i4, i5, i6, j3, i9, i10, i12, z3, z5, z6, tLRPC$TL_messages_getPeerDialogs, tLObject, tLRPC$TL_error);
                    }
                });
            } else {
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
                            MessagesController.this.lambda$loadMessagesInternal$168(j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getHistory, tLObject, tLRPC$TL_error);
                        }
                    }), i5);
                }
                tLRPC$TL_messages_getHistory.limit = i;
                tLRPC$TL_messages_getHistory.offset_id = i2;
                tLRPC$TL_messages_getHistory.offset_date = i3;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getHistory, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadMessagesInternal$168(j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getHistory, tLObject, tLRPC$TL_error);
                    }
                }), i5);
            }
        } else if (i8 == 3) {
            final TLRPC$TL_messages_getSavedHistory tLRPC$TL_messages_getSavedHistory = new TLRPC$TL_messages_getSavedHistory();
            tLRPC$TL_messages_getSavedHistory.peer = getInputPeer(j3);
            if (i6 == 4) {
                tLRPC$TL_messages_getSavedHistory.add_offset = (-i) + 5;
            } else if (i6 == 3) {
                tLRPC$TL_messages_getSavedHistory.add_offset = (-i) / 2;
            } else if (i6 == 1) {
                tLRPC$TL_messages_getSavedHistory.add_offset = (-i) - 1;
            } else if (i6 == 2 && i2 != 0) {
                tLRPC$TL_messages_getSavedHistory.add_offset = (-i) + 6;
            } else if (j < 0 && i2 != 0 && ChatObject.isChannel(getChat(Long.valueOf(-j)))) {
                tLRPC$TL_messages_getSavedHistory.add_offset = -1;
                tLRPC$TL_messages_getSavedHistory.limit++;
            }
            tLRPC$TL_messages_getSavedHistory.limit = i;
            tLRPC$TL_messages_getSavedHistory.offset_id = i2;
            tLRPC$TL_messages_getSavedHistory.offset_date = i3;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getSavedHistory, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadMessagesInternal$161(j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getSavedHistory, tLObject, tLRPC$TL_error);
                }
            }), i5);
        } else {
            if (z4 && z6 && i6 == 2 && i7 == 0) {
                TLRPC$TL_forumTopic findTopic = this.topicsController.findTopic(-j, j3);
                if (findTopic != null) {
                    loadMessagesInternal(j, j2, z, i, i2, i3, false, i4, i5, i6, findTopic.top_message, 0, j3, i9, i10, findTopic.unread_count, i12, z3, findTopic.unread_mentions_count, false, z5, z6, messageLoaderLogger2, 0L);
                    return;
                } else {
                    i15 = i6;
                    i14 = i3;
                }
            } else {
                i14 = i3;
                i15 = i6;
            }
            if (i8 != 0) {
                return;
            }
            final TLRPC$TL_messages_getReplies tLRPC$TL_messages_getReplies = new TLRPC$TL_messages_getReplies();
            tLRPC$TL_messages_getReplies.peer = getInputPeer(j);
            tLRPC$TL_messages_getReplies.msg_id = (int) j3;
            tLRPC$TL_messages_getReplies.offset_date = i14;
            if (i15 == 4) {
                tLRPC$TL_messages_getReplies.add_offset = (-i) + 5;
            } else if (i15 == 3) {
                tLRPC$TL_messages_getReplies.add_offset = (-i) / 2;
            } else if (i15 == 1) {
                tLRPC$TL_messages_getReplies.add_offset = (-i) - 1;
            } else if (i15 == 2 && i2 != 0) {
                tLRPC$TL_messages_getReplies.add_offset = (-i) + 10;
            } else if (j < 0 && i2 != 0) {
                if (ChatObject.isChannel(getChat(Long.valueOf(-j)))) {
                    tLRPC$TL_messages_getReplies.add_offset = -1;
                    tLRPC$TL_messages_getReplies.limit++;
                }
                tLRPC$TL_messages_getReplies.limit = i;
                tLRPC$TL_messages_getReplies.offset_id = i2;
                tLRPC$TL_messages_getReplies.hash = j4;
                System.currentTimeMillis();
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getReplies, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadMessagesInternal$163(i, i2, i3, i10, i6, j, j2, i5, i7, i11, i12, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getReplies, tLObject, tLRPC$TL_error);
                    }
                }), i5);
            }
            tLRPC$TL_messages_getReplies.limit = i;
            tLRPC$TL_messages_getReplies.offset_id = i2;
            tLRPC$TL_messages_getReplies.hash = j4;
            System.currentTimeMillis();
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getReplies, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadMessagesInternal$163(i, i2, i3, i10, i6, j, j2, i5, i7, i11, i12, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getReplies, tLObject, tLRPC$TL_error);
                }
            }), i5);
        }
    }

    public void lambda$loadMessagesInternal$161(long j, int i, int i2, int i3, long j2, final int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, final TLRPC$TL_messages_getSavedHistory tLRPC$TL_messages_getSavedHistory, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
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
            processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i13, i3, false, i4, i5, i6, i7, i8, i9, false, i10, j3, i11, z, i12, z2, z3, null);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadMessagesInternal$160(i4, tLRPC$TL_messages_getSavedHistory, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadMessagesInternal$160(int i, TLRPC$TL_messages_getSavedHistory tLRPC$TL_messages_getSavedHistory, TLRPC$TL_error tLRPC$TL_error) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tLRPC$TL_messages_getSavedHistory, tLRPC$TL_error);
    }

    public void lambda$loadMessagesInternal$163(int i, int i2, int i3, int i4, int i5, long j, long j2, final int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, final TLRPC$TL_messages_getReplies tLRPC$TL_messages_getReplies, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
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
                    i13 = i15;
                    i14 = 0;
                    processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i13, i3, false, i6, i14, i7, i8, i9, i5, false, i10, j3, i11, z, i12, z2, z3, null);
                    return;
                } else if (i4 != 0) {
                    if (i5 == 2 && i2 > 0) {
                        for (int size2 = tLRPC$messages_Messages.messages.size() - 1; size2 >= 0; size2--) {
                            TLRPC$Message tLRPC$Message2 = tLRPC$messages_Messages.messages.get(size2);
                            int i16 = tLRPC$Message2.id;
                            if (i16 > i4 && !tLRPC$Message2.out) {
                                i13 = i2;
                                i14 = i16;
                                break;
                            }
                        }
                    }
                    i13 = i2;
                    i14 = 0;
                    processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i13, i3, false, i6, i14, i7, i8, i9, i5, false, i10, j3, i11, z, i12, z2, z3, null);
                    return;
                }
            }
            i13 = i2;
            i14 = 0;
            processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i13, i3, false, i6, i14, i7, i8, i9, i5, false, i10, j3, i11, z, i12, z2, z3, null);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadMessagesInternal$162(i6, tLRPC$TL_messages_getReplies, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadMessagesInternal$162(int i, TLRPC$TL_messages_getReplies tLRPC$TL_messages_getReplies, TLRPC$TL_error tLRPC$TL_error) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tLRPC$TL_messages_getReplies, tLRPC$TL_error);
    }

    public void lambda$loadMessagesInternal$164(int i, int i2, long j, long j2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int i13;
        ArrayList<TLRPC$Message> arrayList;
        if (tLObject != null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            if (tLRPC$messages_Messages instanceof TLRPC$TL_messages_messagesNotModified) {
                return;
            }
            if (i2 == 0 || tLRPC$messages_Messages.messages.isEmpty()) {
                i13 = i;
            } else {
                int i14 = tLRPC$messages_Messages.messages.get(arrayList.size() - 1).id;
                int size = tLRPC$messages_Messages.messages.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(size);
                    if (tLRPC$Message.date > i2) {
                        i14 = tLRPC$Message.id;
                        break;
                    }
                    size--;
                }
                i13 = i14;
            }
            processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i3, i13, i2, false, i4, i5, i6, i7, i8, i9, false, i10, j3, i11, z, i12, z2, z3, null);
        }
    }

    public void lambda$loadMessagesInternal$166(long j, long j2, boolean z, int i, int i2, int i3, int i4, final int i5, int i6, long j3, int i7, int i8, int i9, boolean z2, boolean z3, boolean z4, final TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
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
                loadMessagesInternal(j, j2, z, i, i2, i3, false, i4, i5, i6, tLRPC$Dialog.top_message, 0, j3, i7, i8, tLRPC$Dialog.unread_count, i9, z2, tLRPC$Dialog.unread_mentions_count, false, z3, z4, null, 0L);
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadMessagesInternal$165(i5, tLRPC$TL_messages_getPeerDialogs, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadMessagesInternal$165(int i, TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs, TLRPC$TL_error tLRPC$TL_error) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tLRPC$TL_messages_getPeerDialogs, tLRPC$TL_error);
    }

    public void lambda$loadMessagesInternal$168(long j, int i, int i2, int i3, long j2, final int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, final TLRPC$TL_messages_getHistory tLRPC$TL_messages_getHistory, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
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
            processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i13, i3, false, i4, i5, i6, i7, i8, i9, false, i10, j3, i11, z, i12, z2, z3, null);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadMessagesInternal$167(i4, tLRPC$TL_messages_getHistory, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadMessagesInternal$167(int i, TLRPC$TL_messages_getHistory tLRPC$TL_messages_getHistory, TLRPC$TL_error tLRPC$TL_error) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tLRPC$TL_messages_getHistory, tLRPC$TL_error);
    }

    public void reloadWebPages(final long j, HashMap<String, ArrayList<MessageObject>> hashMap, final int i) {
        HashMap<String, ArrayList<MessageObject>> hashMap2;
        LongSparseArray<ArrayList<MessageObject>> longSparseArray;
        boolean z = i == 1;
        boolean z2 = i == 3;
        if (z) {
            hashMap2 = this.reloadingScheduledWebpages;
            longSparseArray = this.reloadingScheduledWebpagesPending;
        } else if (z2) {
            hashMap2 = this.reloadingSavedWebpages;
            longSparseArray = this.reloadingSavedWebpagesPending;
        } else {
            hashMap2 = this.reloadingWebpages;
            longSparseArray = this.reloadingWebpagesPending;
        }
        final HashMap<String, ArrayList<MessageObject>> hashMap3 = hashMap2;
        final LongSparseArray<ArrayList<MessageObject>> longSparseArray2 = longSparseArray;
        for (Map.Entry<String, ArrayList<MessageObject>> entry : hashMap.entrySet()) {
            final String key = entry.getKey();
            ArrayList<MessageObject> value = entry.getValue();
            ArrayList<MessageObject> arrayList = hashMap3.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                hashMap3.put(key, arrayList);
            }
            arrayList.addAll(value);
            TLRPC$TL_messages_getWebPagePreview tLRPC$TL_messages_getWebPagePreview = new TLRPC$TL_messages_getWebPagePreview();
            tLRPC$TL_messages_getWebPagePreview.message = key;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getWebPagePreview, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$reloadWebPages$170(hashMap3, key, longSparseArray2, j, i, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$reloadWebPages$170(final HashMap hashMap, final String str, final LongSparseArray longSparseArray, final long j, final int i, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$reloadWebPages$169(hashMap, str, tLObject, longSparseArray, j, i);
            }
        });
    }

    public void lambda$reloadWebPages$169(HashMap hashMap, String str, TLObject tLObject, LongSparseArray longSparseArray, long j, int i) {
        ArrayList arrayList = (ArrayList) hashMap.remove(str);
        if (arrayList == null) {
            return;
        }
        TLRPC$TL_messages_messages tLRPC$TL_messages_messages = new TLRPC$TL_messages_messages();
        if (!(tLObject instanceof TLRPC$TL_messageMediaWebPage)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((MessageObject) arrayList.get(i2)).messageOwner.media.webpage = new TLRPC$TL_webPageEmpty();
                tLRPC$TL_messages_messages.messages.add(((MessageObject) arrayList.get(i2)).messageOwner);
            }
        } else {
            TLRPC$TL_messageMediaWebPage tLRPC$TL_messageMediaWebPage = (TLRPC$TL_messageMediaWebPage) tLObject;
            TLRPC$WebPage tLRPC$WebPage = tLRPC$TL_messageMediaWebPage.webpage;
            if ((tLRPC$WebPage instanceof TLRPC$TL_webPage) || (tLRPC$WebPage instanceof TLRPC$TL_webPageEmpty)) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((MessageObject) arrayList.get(i3)).messageOwner.media.webpage = tLRPC$TL_messageMediaWebPage.webpage;
                    if (i3 == 0) {
                        ImageLoader.saveMessageThumbs(((MessageObject) arrayList.get(i3)).messageOwner);
                    }
                    tLRPC$TL_messages_messages.messages.add(((MessageObject) arrayList.get(i3)).messageOwner);
                }
            } else {
                longSparseArray.put(tLRPC$WebPage.id, arrayList);
            }
        }
        if (tLRPC$TL_messages_messages.messages.isEmpty()) {
            return;
        }
        getMessagesStorage().putMessages((TLRPC$messages_Messages) tLRPC$TL_messages_messages, j, -2, 0, false, i, 0L);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(j), arrayList);
    }

    public void processLoadedMessages(final org.telegram.tgnet.TLRPC$messages_Messages r35, final int r36, final long r37, final long r39, final int r41, final int r42, final int r43, final boolean r44, final int r45, final int r46, final int r47, final int r48, final int r49, final int r50, final boolean r51, final int r52, final long r53, final int r55, final boolean r56, final int r57, final boolean r58, final boolean r59, final org.telegram.messenger.MessageLoaderLogger r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processLoadedMessages(org.telegram.tgnet.TLRPC$messages_Messages, int, long, long, int, int, int, boolean, int, int, int, int, int, int, boolean, int, long, int, boolean, int, boolean, boolean, org.telegram.messenger.MessageLoaderLogger):void");
    }

    public void lambda$processLoadedMessages$171(long j, long j2, int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, long j3, int i9, int i10, int i11, int i12, boolean z2, boolean z3, MessageLoaderLogger messageLoaderLogger, long j4) {
        loadMessagesInternal(j, j2, false, i, (i2 == 2 && z) ? i3 : i4, i5, false, 0, i6, i2, i7, i8, j3, i9, i3, i10, i11, z, i12, true, z2, z3, messageLoaderLogger, j4);
    }

    public void lambda$processLoadedMessages$172(int i, TLRPC$messages_Messages tLRPC$messages_Messages, boolean z, boolean z2, int i2) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoadWithoutProcess, Integer.valueOf(i), Integer.valueOf(tLRPC$messages_Messages.messages.size()), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2));
    }

    public static int lambda$processLoadedMessages$173(MessageObject messageObject, MessageObject messageObject2) {
        int i;
        int i2;
        if (messageObject.messageOwner.date == messageObject2.messageOwner.date && messageObject.getId() >= 0 && messageObject2.getId() >= 0) {
            i = messageObject2.getId();
            i2 = messageObject.getId();
        } else {
            i = messageObject2.messageOwner.date;
            i2 = messageObject.messageOwner.date;
        }
        return i - i2;
    }

    public void lambda$processLoadedMessages$175(TLRPC$messages_Messages tLRPC$messages_Messages, final boolean z, MessageLoaderLogger messageLoaderLogger, final boolean z2, final int i, boolean z3, final int i2, int i3, final int i4, final long j, final ArrayList arrayList, long j2, final int i5, final int i6, final boolean z4, final int i7, final int i8, final int i9, final int i10, final int i11, final int i12, ArrayList arrayList2, HashMap hashMap) {
        int i13;
        int i14;
        int i15;
        int i16;
        MessagesController messagesController;
        int i17;
        long j3;
        putUsers(tLRPC$messages_Messages.users, z);
        putChats(tLRPC$messages_Messages.chats, z);
        if (messageLoaderLogger != null) {
            messageLoaderLogger.finish();
        }
        if (tLRPC$messages_Messages.animatedEmoji != null && z2) {
            AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).processDocuments(tLRPC$messages_Messages.animatedEmoji);
        }
        if (i == 1) {
            i15 = 0;
        } else {
            if (z3 && i2 == 2) {
                i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i18 = 0; i18 < tLRPC$messages_Messages.messages.size(); i18++) {
                    TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i18);
                    if ((!tLRPC$Message.out || tLRPC$Message.from_scheduled) && (i16 = tLRPC$Message.id) > i3 && i16 < i14) {
                        i14 = i16;
                    }
                }
                i13 = i3;
            } else {
                i13 = i3;
                i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            i15 = i14 == Integer.MAX_VALUE ? i13 : i14;
        }
        if (i == 1 && i4 == 1) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.scheduledMessagesUpdated, Long.valueOf(j), Integer.valueOf(arrayList.size()), Boolean.FALSE);
        }
        if (!DialogObject.isEncryptedDialog(j)) {
            final int i19 = i15;
            getMediaDataController().loadReplyMessagesForMessages(arrayList, j, i == 1, j2, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$processLoadedMessages$174(z2, i5, i6, z, z4, i7, j, i4, arrayList, i19, i8, i9, i2, i10, i11, i12, i);
                }
            }, i5);
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoad, Long.valueOf(j), Integer.valueOf(i4), arrayList, Boolean.valueOf(z), Integer.valueOf(i15), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i2), Boolean.valueOf(z4), Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i));
        }
        if (arrayList2.isEmpty()) {
            messagesController = this;
            i17 = i;
            j3 = j;
        } else {
            messagesController = this;
            i17 = i;
            j3 = j;
            messagesController.reloadMessages(arrayList2, j3, i17);
        }
        if (hashMap.isEmpty()) {
            return;
        }
        messagesController.reloadWebPages(j3, hashMap, i17);
    }

    public void lambda$processLoadedMessages$174(boolean z, int i, int i2, boolean z2, boolean z3, int i3, long j, int i4, ArrayList arrayList, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        if (!z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoadWithoutProcess, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i3));
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoad, Long.valueOf(j), Integer.valueOf(i4), arrayList, Boolean.valueOf(z2), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Boolean.valueOf(z3), Integer.valueOf(i), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    public void loadHintDialogs() {
        if (!this.hintDialogs.isEmpty() || TextUtils.isEmpty(this.installReferer)) {
            return;
        }
        TLRPC$TL_help_getRecentMeUrls tLRPC$TL_help_getRecentMeUrls = new TLRPC$TL_help_getRecentMeUrls();
        tLRPC$TL_help_getRecentMeUrls.referer = this.installReferer;
        getConnectionsManager().sendRequest(tLRPC$TL_help_getRecentMeUrls, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadHintDialogs$177(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadHintDialogs$177(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadHintDialogs$176(tLObject);
                }
            });
        }
    }

    public void lambda$loadHintDialogs$176(TLObject tLObject) {
        TLRPC$TL_help_recentMeUrls tLRPC$TL_help_recentMeUrls = (TLRPC$TL_help_recentMeUrls) tLObject;
        putUsers(tLRPC$TL_help_recentMeUrls.users, false);
        putChats(tLRPC$TL_help_recentMeUrls.chats, false);
        this.hintDialogs.clear();
        this.hintDialogs.addAll(tLRPC$TL_help_recentMeUrls.urls);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public TLRPC$TL_dialogFolder ensureFolderDialogExists(int i, boolean[] zArr) {
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
            if (!tLRPC$Dialog2.pinned) {
                if (tLRPC$Dialog2.id != this.promoDialogId) {
                    break;
                }
            } else {
                i2 = Math.max(tLRPC$Dialog2.pinnedNum, i2);
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

    private void removeFolder(int i) {
        long makeFolderDialogId = DialogObject.makeFolderDialogId(i);
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(makeFolderDialogId);
        if (tLRPC$Dialog == null) {
            return;
        }
        this.dialogs_dict.remove(makeFolderDialogId);
        this.allDialogs.remove(tLRPC$Dialog);
        sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.folderBecomeEmpty, Integer.valueOf(i));
    }

    public void onFolderEmpty(final int i) {
        if (getUserConfig().getDialogLoadOffsets(i)[0] != 2147483647L) {
            loadDialogs(i, 0, 10, false, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$onFolderEmpty$178(i);
                }
            });
        } else if (i == 1) {
            this.hasArchivedChats = false;
            checkArchiveFolder();
        } else {
            removeFolder(i);
        }
    }

    public void lambda$onFolderEmpty$178(int i) {
        if (i == 1) {
            this.hasArchivedChats = false;
            checkArchiveFolder();
            return;
        }
        removeFolder(i);
    }

    public void checkArchiveFolder() {
        if (!this.hasArchivedChats && !getStoriesController().hasHiddenStories()) {
            removeFolder(1);
        } else {
            boolean[] zArr = {false};
            ensureFolderDialogExists(1, zArr);
            if (zArr[0]) {
                sortDialogs(null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
    }

    public void checkIfFolderEmpty(int i) {
        if (i == 0) {
            return;
        }
        getMessagesStorage().checkIfFolderEmpty(i);
    }

    public int addDialogToFolder(long j, int i, int i2, long j2) {
        ArrayList<Long> arrayList = new ArrayList<>(1);
        arrayList.add(Long.valueOf(j));
        return addDialogToFolder(arrayList, i, i2, null, j2);
    }

    public int addDialogToFolder(java.util.ArrayList<java.lang.Long> r24, int r25, int r26, java.util.ArrayList<org.telegram.tgnet.TLRPC$TL_inputFolderPeer> r27, long r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.addDialogToFolder(java.util.ArrayList, int, int, java.util.ArrayList, long):int");
    }

    public void lambda$addDialogToFolder$179(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
        long j;
        if (this.loadingDialogs.get(i) || this.resetingDialogs) {
            return;
        }
        boolean z2 = true;
        this.loadingDialogs.put(i, true);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i4 = NotificationCenter.dialogsNeedReload;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i4, new Object[0]);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("folderId = " + i + " load cacheOffset = " + i2 + " count = " + i3 + " cache = " + z);
        }
        if (z) {
            getMessagesStorage().getDialogs(i, i2 == 0 ? 0 : this.nextDialogsCacheOffset.get(i, 0), i3, (i == 0 && i2 == 0) ? false : false);
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
        if (dialogLoadOffsets[0] != -1) {
            if (dialogLoadOffsets[0] == 2147483647L) {
                this.dialogsEndReached.put(i, true);
                this.serverDialogsEndReached.put(i, true);
                this.loadingDialogs.put(i, false);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i4, new Object[0]);
                return;
            }
            int i5 = (int) dialogLoadOffsets[0];
            tLRPC$TL_messages_getDialogs.offset_id = i5;
            tLRPC$TL_messages_getDialogs.offset_date = (int) dialogLoadOffsets[1];
            if (i5 == 0) {
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
        } else {
            ArrayList<TLRPC$Dialog> dialogs = getDialogs(i);
            int size = dialogs.size() - 1;
            while (true) {
                if (size < 0) {
                    z2 = false;
                    break;
                }
                TLRPC$Dialog tLRPC$Dialog = dialogs.get(size);
                if (!tLRPC$Dialog.pinned && !DialogObject.isEncryptedDialog(tLRPC$Dialog.id) && tLRPC$Dialog.top_message > 0) {
                    ArrayList<MessageObject> arrayList = this.dialogMessage.get(tLRPC$Dialog.id);
                    MessageObject messageObject = null;
                    if (arrayList != null) {
                        for (int i6 = 0; i6 < arrayList.size(); i6++) {
                            MessageObject messageObject2 = arrayList.get(i6);
                            if (messageObject2 != null && (messageObject == null || messageObject2.getId() > messageObject.getId())) {
                                messageObject = arrayList.get(i6);
                            }
                        }
                    }
                    if (messageObject != null && messageObject.getId() > 0) {
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
                    }
                }
                size--;
            }
            if (!z2) {
                tLRPC$TL_messages_getDialogs.offset_peer = new TLRPC$TL_inputPeerEmpty();
            }
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadDialogs$180(i, i3, runnable, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadDialogs$180(int i, int i2, Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Dialogs tLRPC$messages_Dialogs = (TLRPC$messages_Dialogs) tLObject;
            processLoadedDialogs(tLRPC$messages_Dialogs, null, null, i, 0, i2, 0, false, false, false);
            if (runnable == null || !tLRPC$messages_Dialogs.dialogs.isEmpty()) {
                return;
            }
            AndroidUtilities.runOnUIThread(runnable);
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
                        MessagesController.this.lambda$loadGlobalNotificationsSettings$182(i, tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
        if (getUserConfig().notificationsSignUpSettingsLoaded) {
            return;
        }
        loadSignUpNotificationsSettings();
    }

    public void lambda$loadGlobalNotificationsSettings$182(final int i, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadGlobalNotificationsSettings$181(tLObject, i);
            }
        });
    }

    public void lambda$loadGlobalNotificationsSettings$181(TLObject tLObject, int i) {
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
                if ((tLRPC$TL_peerNotifySettings.flags & 64) != 0) {
                    edit.putBoolean("EnableAllStories", !tLRPC$TL_peerNotifySettings.stories_muted);
                }
                if ((tLRPC$TL_peerNotifySettings.flags & 128) != 0) {
                    edit.putBoolean("EnableHideStoriesSenders", tLRPC$TL_peerNotifySettings.stories_hide_sender);
                }
                if ((tLRPC$TL_peerNotifySettings.flags & 4) != 0) {
                    edit.putInt("EnableAll2", tLRPC$TL_peerNotifySettings.mute_until);
                }
                if ((tLRPC$TL_peerNotifySettings.flags & 64) != 0) {
                    edit.putBoolean("EnableAllStories", !tLRPC$TL_peerNotifySettings.stories_muted);
                }
            } else {
                if ((tLRPC$TL_peerNotifySettings.flags & 1) != 0) {
                    edit.putBoolean("EnablePreviewChannel", tLRPC$TL_peerNotifySettings.show_previews);
                }
                if ((tLRPC$TL_peerNotifySettings.flags & 4) != 0) {
                    edit.putInt("EnableChannel2", tLRPC$TL_peerNotifySettings.mute_until);
                }
            }
            getNotificationsController().getNotificationsSettingsFacade().applySoundSettings(tLRPC$TL_peerNotifySettings.android_sound, edit, 0L, 0L, i, false);
            edit.commit();
            if (this.loadingNotificationSettings == 0) {
                getUserConfig().notificationsSettingsLoaded = true;
                getUserConfig().saveConfig(false);
            }
        }
    }

    public void loadSignUpNotificationsSettings() {
        if (this.loadingNotificationSignUpSettings) {
            return;
        }
        this.loadingNotificationSignUpSettings = true;
        getConnectionsManager().sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-1626880216);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadSignUpNotificationsSettings$184(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadSignUpNotificationsSettings$184(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadSignUpNotificationsSettings$183(tLObject);
            }
        });
    }

    public void lambda$loadSignUpNotificationsSettings$183(TLObject tLObject) {
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
        if (tLRPC$InputPeer == null) {
            return;
        }
        final long peerDialogId = DialogObject.getPeerDialogId(tLRPC$InputPeer);
        if (this.gettingUnknownDialogs.indexOfKey(peerDialogId) >= 0) {
            return;
        }
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
            } catch (Exception e) {
                e = e;
            }
            try {
                nativeByteBuffer.writeInt32(15);
                tLRPC$InputPeer.serializeToStream(nativeByteBuffer);
            } catch (Exception e2) {
                e = e2;
                nativeByteBuffer2 = nativeByteBuffer;
                FileLog.e(e);
                nativeByteBuffer = nativeByteBuffer2;
                j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                final long j2 = j;
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadUnknownDialog$185(j2, peerDialogId, tLObject, tLRPC$TL_error);
                    }
                });
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        final long j22 = j;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadUnknownDialog$185(j22, peerDialogId, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadUnknownDialog$185(long j, long j2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            if (!tLRPC$TL_messages_peerDialogs.dialogs.isEmpty()) {
                TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
                tLRPC$TL_messages_dialogs.dialogs.addAll(tLRPC$TL_messages_peerDialogs.dialogs);
                tLRPC$TL_messages_dialogs.messages.addAll(tLRPC$TL_messages_peerDialogs.messages);
                tLRPC$TL_messages_dialogs.users.addAll(tLRPC$TL_messages_peerDialogs.users);
                tLRPC$TL_messages_dialogs.chats.addAll(tLRPC$TL_messages_peerDialogs.chats);
                processLoadedDialogs(tLRPC$TL_messages_dialogs, null, null, ((TLRPC$TL_dialog) tLRPC$TL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, this.DIALOGS_LOAD_TYPE_UNKNOWN, false, false, false);
            }
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        this.gettingUnknownDialogs.delete(j2);
    }

    private void fetchFolderInLoadedPinnedDialogs(TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs) {
        TLRPC$InputPeer tLRPC$TL_inputPeerUser;
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
                                tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerChannel();
                                tLRPC$TL_inputPeerUser.channel_id = tLRPC$Dialog.peer.channel_id;
                                int size3 = tLRPC$TL_messages_peerDialogs.chats.size();
                                while (true) {
                                    if (i >= size3) {
                                        break;
                                    }
                                    TLRPC$Chat tLRPC$Chat = tLRPC$TL_messages_peerDialogs.chats.get(i);
                                    if (tLRPC$Chat.id == tLRPC$TL_inputPeerUser.channel_id) {
                                        tLRPC$TL_inputPeerUser.access_hash = tLRPC$Chat.access_hash;
                                        break;
                                    }
                                    i++;
                                }
                            } else if (tLRPC$Peer instanceof TLRPC$TL_peerChat) {
                                tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerChat();
                                tLRPC$TL_inputPeerUser.chat_id = tLRPC$Dialog.peer.chat_id;
                            } else {
                                tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
                                tLRPC$TL_inputPeerUser.user_id = tLRPC$Dialog.peer.user_id;
                                int size4 = tLRPC$TL_messages_peerDialogs.users.size();
                                while (true) {
                                    if (i >= size4) {
                                        break;
                                    }
                                    TLRPC$User tLRPC$User = tLRPC$TL_messages_peerDialogs.users.get(i);
                                    if (tLRPC$User.id == tLRPC$TL_inputPeerUser.user_id) {
                                        tLRPC$TL_inputPeerUser.access_hash = tLRPC$User.access_hash;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            loadUnknownDialog(tLRPC$TL_inputPeerUser, 0L);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    public void lambda$resetDialogs$186(int i, int i2, int i3, int i4, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            this.resetDialogsPinned = (TLRPC$TL_messages_peerDialogs) tLObject;
            for (int i5 = 0; i5 < this.resetDialogsPinned.dialogs.size(); i5++) {
                this.resetDialogsPinned.dialogs.get(i5).pinned = true;
            }
            resetDialogs(false, i, i2, i3, i4);
        }
    }

    public void lambda$resetDialogs$187(int i, int i2, int i3, int i4, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            this.resetDialogsAll = (TLRPC$messages_Dialogs) tLObject;
            resetDialogs(false, i, i2, i3, i4);
        }
    }

    private void resetDialogs(boolean r27, final int r28, final int r29, final int r30, final int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.resetDialogs(boolean, int, int, int, int):void");
    }

    public void completeDialogsReset(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, int i, int i2, final int i3, final int i4, final int i5, final LongSparseArray<TLRPC$Dialog> longSparseArray, final LongSparseArray<ArrayList<MessageObject>> longSparseArray2, TLRPC$Message tLRPC$Message) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$completeDialogsReset$189(i3, i4, i5, tLRPC$messages_Dialogs, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$completeDialogsReset$189(int i, int i2, int i3, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        this.gettingDifference = false;
        getMessagesStorage().setLastPtsValue(i);
        getMessagesStorage().setLastDateValue(i2);
        getMessagesStorage().setLastQtsValue(i3);
        getDifference();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$completeDialogsReset$188(tLRPC$messages_Dialogs, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$completeDialogsReset$188(TLRPC$messages_Dialogs tLRPC$messages_Dialogs, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        MediaDataController mediaDataController;
        long j;
        this.resetingDialogs = false;
        applyDialogsNotificationsSettings(tLRPC$messages_Dialogs.dialogs);
        MediaDataController mediaDataController2 = getMediaDataController();
        mediaDataController2.clearAllDrafts(false);
        mediaDataController2.loadDraftsIfNeed();
        putUsers(tLRPC$messages_Dialogs.users, false);
        putChats(tLRPC$messages_Dialogs.chats, false);
        for (int i = 0; i < this.allDialogs.size(); i++) {
            TLRPC$Dialog tLRPC$Dialog = this.allDialogs.get(i);
            if (!DialogObject.isEncryptedDialog(tLRPC$Dialog.id)) {
                this.dialogs_dict.remove(tLRPC$Dialog.id);
                ArrayList<MessageObject> arrayList = this.dialogMessage.get(tLRPC$Dialog.id);
                this.dialogMessage.remove(tLRPC$Dialog.id);
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        MessageObject messageObject = arrayList.get(i2);
                        if (messageObject != null) {
                            if (messageObject.messageOwner.peer_id.channel_id == 0) {
                                this.dialogMessagesByIds.remove(messageObject.getId());
                            }
                            long j2 = messageObject.messageOwner.random_id;
                            if (j2 != 0) {
                                this.dialogMessagesByRandomIds.remove(j2);
                            }
                        }
                    }
                }
            }
        }
        int i3 = 0;
        while (i3 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i3);
            TLRPC$Dialog tLRPC$Dialog2 = (TLRPC$Dialog) longSparseArray.valueAt(i3);
            TLRPC$DraftMessage tLRPC$DraftMessage = tLRPC$Dialog2.draft;
            if (tLRPC$DraftMessage instanceof TLRPC$TL_draftMessage) {
                mediaDataController = mediaDataController2;
                j = keyAt;
                mediaDataController2.saveDraft(tLRPC$Dialog2.id, 0L, tLRPC$DraftMessage, null, false);
            } else {
                mediaDataController = mediaDataController2;
                j = keyAt;
            }
            this.dialogs_dict.put(j, tLRPC$Dialog2);
            ArrayList<MessageObject> arrayList2 = (ArrayList) longSparseArray2.get(tLRPC$Dialog2.id);
            this.dialogMessage.put(j, arrayList2);
            if (arrayList2 != null) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    MessageObject messageObject2 = arrayList2.get(i4);
                    if (messageObject2 != null && messageObject2.messageOwner.peer_id.channel_id == 0) {
                        this.dialogMessagesByIds.put(messageObject2.getId(), messageObject2);
                        this.dialogsLoadedTillDate = Math.min(this.dialogsLoadedTillDate, messageObject2.messageOwner.date);
                        long j3 = messageObject2.messageOwner.random_id;
                        if (j3 != 0) {
                            this.dialogMessagesByRandomIds.put(j3, messageObject2);
                        }
                    }
                }
            }
            getTranslateController().checkDialogMessage(j);
            i3++;
            mediaDataController2 = mediaDataController;
        }
        this.allDialogs.clear();
        int size = this.dialogs_dict.size();
        for (int i5 = 0; i5 < size; i5++) {
            TLRPC$Dialog valueAt = this.dialogs_dict.valueAt(i5);
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
        if (totalDialogsCount < 400 && dialogLoadOffsets[0] != -1 && dialogLoadOffsets[0] != 2147483647L) {
            loadDialogs(0, 0, 100, false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    private void migrateDialogs(final int i, int i2, long j, long j2, long j3, long j4) {
        if (this.migratingDialogs || i == -1) {
            return;
        }
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
                MessagesController.this.lambda$migrateDialogs$193(i, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$migrateDialogs$193(final int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            final TLRPC$messages_Dialogs tLRPC$messages_Dialogs = (TLRPC$messages_Dialogs) tLObject;
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$migrateDialogs$191(tLRPC$messages_Dialogs, i);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$migrateDialogs$192();
            }
        });
    }

    public void lambda$migrateDialogs$191(org.telegram.tgnet.TLRPC$messages_Dialogs r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$migrateDialogs$191(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    public void lambda$migrateDialogs$190() {
        this.migratingDialogs = false;
    }

    public void lambda$migrateDialogs$192() {
        this.migratingDialogs = false;
    }

    public void processLoadedDialogs(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final ArrayList<TLRPC$EncryptedChat> arrayList, final ArrayList<TLRPC$UserFull> arrayList2, final int i, final int i2, final int i3, final int i4, final boolean z, final boolean z2, final boolean z3) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedDialogs$197(i, i4, tLRPC$messages_Dialogs, arrayList2, z, i3, arrayList, i2, z3, z2);
            }
        });
    }

    public void lambda$processLoadedDialogs$197(final int r32, final int r33, final org.telegram.tgnet.TLRPC$messages_Dialogs r34, final java.util.ArrayList r35, final boolean r36, final int r37, final java.util.ArrayList r38, final int r39, final boolean r40, final boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processLoadedDialogs$197(int, int, org.telegram.tgnet.TLRPC$messages_Dialogs, java.util.ArrayList, boolean, int, java.util.ArrayList, int, boolean, boolean):void");
    }

    public void lambda$processLoadedDialogs$194(TLRPC$messages_Dialogs tLRPC$messages_Dialogs, ArrayList arrayList, int i, boolean z, long[] jArr, int i2) {
        putUsers(tLRPC$messages_Dialogs.users, true);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                long j = ((TLRPC$UserFull) arrayList.get(i3)).id;
                this.fullUsers.put(j, (TLRPC$UserFull) arrayList.get(i3));
                getTranslateController().updateDialogFull(j);
            }
        }
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processLoadedDialogs$195(TLRPC$Chat tLRPC$Chat) {
        checkChatInviter(tLRPC$Chat.id, true);
    }

    public void lambda$processLoadedDialogs$196(org.telegram.tgnet.TLRPC$Message r28, int r29, org.telegram.tgnet.TLRPC$messages_Dialogs r30, java.util.ArrayList r31, java.util.ArrayList r32, boolean r33, int r34, androidx.collection.LongSparseArray r35, androidx.collection.LongSparseArray r36, androidx.collection.LongSparseArray r37, int r38, boolean r39, int r40, java.util.ArrayList r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processLoadedDialogs$196(org.telegram.tgnet.TLRPC$Message, int, org.telegram.tgnet.TLRPC$messages_Dialogs, java.util.ArrayList, java.util.ArrayList, boolean, int, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, int, boolean, int, java.util.ArrayList):void");
    }

    private void applyDialogNotificationsSettings(long j, long j2, TLRPC$PeerNotifySettings tLRPC$PeerNotifySettings) {
        getNotificationsController().getNotificationsSettingsFacade().applyDialogNotificationsSettings(j, j2, tLRPC$PeerNotifySettings);
    }

    private void applyDialogsNotificationsSettings(ArrayList<TLRPC$Dialog> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$Dialog tLRPC$Dialog = arrayList.get(i);
            if (tLRPC$Dialog.peer != null && (tLRPC$Dialog.notify_settings instanceof TLRPC$TL_peerNotifySettings)) {
                getNotificationsController().getNotificationsSettingsFacade().setSettingsForDialog(tLRPC$Dialog, tLRPC$Dialog.notify_settings);
            }
        }
    }

    public void reloadMentionsCountForChannel(final TLRPC$InputPeer tLRPC$InputPeer, final long j) {
        NativeByteBuffer nativeByteBuffer;
        Exception e;
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(tLRPC$InputPeer.getObjectSize() + 4);
            } catch (Exception e2) {
                nativeByteBuffer = null;
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
                        MessagesController.this.lambda$reloadMentionsCountForChannel$198(tLRPC$InputPeer, j, tLObject, tLRPC$TL_error);
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
                MessagesController.this.lambda$reloadMentionsCountForChannel$198(tLRPC$InputPeer, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$reloadMentionsCountForChannel$198(TLRPC$InputPeer tLRPC$InputPeer, long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
        if (tLRPC$messages_Messages != null) {
            int i = tLRPC$messages_Messages.count;
            if (i == 0) {
                i = tLRPC$messages_Messages.messages.size();
            }
            getMessagesStorage().resetMentionsCount(-tLRPC$InputPeer.channel_id, 0L, i);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void reloadMentionsCountForChannels(final ArrayList<Long> arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$reloadMentionsCountForChannels$199(arrayList);
            }
        });
    }

    public void lambda$reloadMentionsCountForChannels$199(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            reloadMentionsCountForChannel(getInputPeer(-((Long) arrayList.get(i)).longValue()), 0L);
        }
    }

    public void processDialogsUpdateRead(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processDialogsUpdateRead$200(longSparseIntArray, longSparseIntArray2);
            }
        });
    }

    public void lambda$processDialogsUpdateRead$200(org.telegram.messenger.support.LongSparseIntArray r14, org.telegram.messenger.support.LongSparseIntArray r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processDialogsUpdateRead$200(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    public void checkLastDialogMessage(final TLRPC$Dialog tLRPC$Dialog, TLRPC$InputPeer tLRPC$InputPeer, final long j) {
        NativeByteBuffer nativeByteBuffer;
        Exception e;
        if (DialogObject.isEncryptedDialog(tLRPC$Dialog.id) || this.checkingLastMessagesDialogs.indexOfKey(tLRPC$Dialog.id) >= 0) {
            return;
        }
        TLRPC$TL_messages_getHistory tLRPC$TL_messages_getHistory = new TLRPC$TL_messages_getHistory();
        if (tLRPC$InputPeer == null) {
            tLRPC$InputPeer = getInputPeer(tLRPC$Dialog.id);
        }
        tLRPC$TL_messages_getHistory.peer = tLRPC$InputPeer;
        if (tLRPC$InputPeer == null) {
            return;
        }
        tLRPC$TL_messages_getHistory.limit = 1;
        this.checkingLastMessagesDialogs.put(tLRPC$Dialog.id, Boolean.TRUE);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkLastDialogMessage for " + tLRPC$Dialog.id);
        }
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_messages_getHistory.peer.getObjectSize() + 60);
            } catch (Exception e2) {
                nativeByteBuffer = null;
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
                        MessagesController.this.lambda$checkLastDialogMessage$204(tLRPC$Dialog, j, tLObject, tLRPC$TL_error);
                    }
                });
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$checkLastDialogMessage$204(tLRPC$Dialog, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$checkLastDialogMessage$204(final TLRPC$Dialog tLRPC$Dialog, long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                getMessagesStorage().putMessages(tLRPC$messages_Messages.messages, true, true, false, getDownloadController().getAutodownloadMask(), true, 0, 0L);
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkLastDialogMessage$202(tLRPC$Dialog);
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
                MessagesController.this.lambda$checkLastDialogMessage$203(tLRPC$Dialog);
            }
        });
    }

    public void lambda$checkLastDialogMessage$202(final TLRPC$Dialog tLRPC$Dialog) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkLastDialogMessage for " + tLRPC$Dialog.id + " has not message");
        }
        if (getMediaDataController().getDraft(tLRPC$Dialog.id, 0L) == null) {
            TLRPC$Dialog tLRPC$Dialog2 = this.dialogs_dict.get(tLRPC$Dialog.id);
            if (tLRPC$Dialog2 == null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("checkLastDialogMessage for " + tLRPC$Dialog.id + " current dialog not found");
                }
                getMessagesStorage().isDialogHasTopMessage(tLRPC$Dialog.id, new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkLastDialogMessage$201(tLRPC$Dialog);
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

    public void lambda$checkLastDialogMessage$201(TLRPC$Dialog tLRPC$Dialog) {
        deleteDialog(tLRPC$Dialog.id, 3);
    }

    public void lambda$checkLastDialogMessage$203(TLRPC$Dialog tLRPC$Dialog) {
        this.checkingLastMessagesDialogs.delete(tLRPC$Dialog.id);
    }

    public void processDialogsUpdate(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, ArrayList<TLRPC$EncryptedChat> arrayList, final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processDialogsUpdate$206(tLRPC$messages_Dialogs, z);
            }
        });
    }

    public void lambda$processDialogsUpdate$206(final org.telegram.tgnet.TLRPC$messages_Dialogs r20, final boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processDialogsUpdate$206(org.telegram.tgnet.TLRPC$messages_Dialogs, boolean):void");
    }

    public void lambda$processDialogsUpdate$205(org.telegram.tgnet.TLRPC$messages_Dialogs r22, androidx.collection.LongSparseArray r23, androidx.collection.LongSparseArray r24, boolean r25, org.telegram.messenger.support.LongSparseIntArray r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processDialogsUpdate$205(org.telegram.tgnet.TLRPC$messages_Dialogs, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    private int messagesMaxDate(ArrayList<MessageObject> arrayList) {
        TLRPC$Message tLRPC$Message;
        int i;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; arrayList != null && i3 < arrayList.size(); i3++) {
            MessageObject messageObject = arrayList.get(i3);
            if (messageObject != null && (tLRPC$Message = messageObject.messageOwner) != null && (i = tLRPC$Message.date) > i2) {
                i2 = i;
            }
        }
        return i2;
    }

    public void addToViewsQueue(final MessageObject messageObject) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$addToViewsQueue$207(messageObject);
            }
        });
    }

    public void lambda$addToViewsQueue$207(MessageObject messageObject) {
        long dialogId = messageObject.getDialogId();
        int id = messageObject.getId();
        ArrayList<Integer> arrayList = this.channelViewsToSend.get(dialogId);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.channelViewsToSend.put(dialogId, arrayList);
        }
        if (arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        arrayList.add(Integer.valueOf(id));
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
        if (messageObject.scheduled) {
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (messageObject.messageOwner.mentioned) {
            getMessagesStorage().markMentionMessageAsRead(-messageObject.messageOwner.peer_id.channel_id, messageObject.getId(), messageObject.getDialogId());
        }
        arrayList.add(Integer.valueOf(messageObject.getId()));
        long dialogId = messageObject.getDialogId();
        getMessagesStorage().markMessagesContentAsRead(dialogId, arrayList, 0, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesReadContent, Long.valueOf(dialogId), arrayList);
        if (messageObject.getId() < 0) {
            markMessageAsRead(messageObject.getDialogId(), messageObject.messageOwner.random_id, Integer.MIN_VALUE);
        } else if (messageObject.messageOwner.peer_id.channel_id != 0) {
            TLRPC$TL_channels_readMessageContents tLRPC$TL_channels_readMessageContents = new TLRPC$TL_channels_readMessageContents();
            TLRPC$InputChannel inputChannel = getInputChannel(messageObject.messageOwner.peer_id.channel_id);
            tLRPC$TL_channels_readMessageContents.channel = inputChannel;
            if (inputChannel == null) {
                return;
            }
            tLRPC$TL_channels_readMessageContents.id.add(Integer.valueOf(messageObject.getId()));
            getConnectionsManager().sendRequest(tLRPC$TL_channels_readMessageContents, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$markMessageContentAsRead$208(tLObject, tLRPC$TL_error);
                }
            });
        } else {
            TLRPC$TL_messages_readMessageContents tLRPC$TL_messages_readMessageContents = new TLRPC$TL_messages_readMessageContents();
            tLRPC$TL_messages_readMessageContents.id.add(Integer.valueOf(messageObject.getId()));
            getConnectionsManager().sendRequest(tLRPC$TL_messages_readMessageContents, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$markMessageContentAsRead$209(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$markMessageContentAsRead$209(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
            if (inputChannel == null) {
                return;
            }
            tLRPC$TL_channels_readMessageContents.id.add(Integer.valueOf(i));
            getConnectionsManager().sendRequest(tLRPC$TL_channels_readMessageContents, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$markMentionMessageAsRead$210(tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        TLRPC$TL_messages_readMessageContents tLRPC$TL_messages_readMessageContents = new TLRPC$TL_messages_readMessageContents();
        tLRPC$TL_messages_readMessageContents.id.add(Integer.valueOf(i));
        getConnectionsManager().sendRequest(tLRPC$TL_messages_readMessageContents, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$markMentionMessageAsRead$211(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$markMentionMessageAsRead$211(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
    }

    public long createDeleteShowOnceTask(long j, int i) {
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2 = null;
        try {
            nativeByteBuffer = new NativeByteBuffer(16);
        } catch (Exception e) {
            e = e;
        }
        try {
            nativeByteBuffer.writeInt32(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
            nativeByteBuffer.writeInt64(j);
            nativeByteBuffer.writeInt32(i);
        } catch (Exception e2) {
            e = e2;
            nativeByteBuffer2 = nativeByteBuffer;
            FileLog.e(e);
            nativeByteBuffer = nativeByteBuffer2;
            return getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        return getMessagesStorage().createPendingTask(nativeByteBuffer);
    }

    public void lambda$checkDeletingTask$75(long j, long j2, int i) {
        getMessagesStorage().removePendingTask(j);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(i));
        getMessagesStorage().emptyMessagesMedia(j2, arrayList);
    }

    public void markMessageAsRead2(long j, int i, TLRPC$InputChannel tLRPC$InputChannel, int i2, long j2) {
        markMessageAsRead2(j, i, tLRPC$InputChannel, i2, j2, true);
    }

    public void markMessageAsRead2(long r15, int r17, org.telegram.tgnet.TLRPC$InputChannel r18, int r19, long r20, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.markMessageAsRead2(long, int, org.telegram.tgnet.TLRPC$InputChannel, int, long, boolean):void");
    }

    public void lambda$markMessageAsRead2$212(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$markMessageAsRead2$213(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
        if (j2 == 0 || j == 0) {
            return;
        }
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

    private void completeReadTask(ReadTask readTask) {
        TLRPC$TL_messages_readHistory tLRPC$TL_messages_readHistory;
        if (readTask.replyId != 0) {
            TLRPC$TL_messages_readDiscussion tLRPC$TL_messages_readDiscussion = new TLRPC$TL_messages_readDiscussion();
            tLRPC$TL_messages_readDiscussion.msg_id = (int) readTask.replyId;
            tLRPC$TL_messages_readDiscussion.peer = getInputPeer(readTask.dialogId);
            tLRPC$TL_messages_readDiscussion.read_max_id = readTask.maxId;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_readDiscussion, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$completeReadTask$214(tLObject, tLRPC$TL_error);
                }
            });
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
                    MessagesController.this.lambda$completeReadTask$215(tLObject, tLRPC$TL_error);
                }
            });
        } else {
            TLRPC$EncryptedChat encryptedChat = getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(readTask.dialogId)));
            byte[] bArr = encryptedChat.auth_key;
            if (bArr == null || bArr.length <= 1 || !(encryptedChat instanceof TLRPC$TL_encryptedChat)) {
                return;
            }
            TLRPC$TL_messages_readEncryptedHistory tLRPC$TL_messages_readEncryptedHistory = new TLRPC$TL_messages_readEncryptedHistory();
            TLRPC$TL_inputEncryptedChat tLRPC$TL_inputEncryptedChat = new TLRPC$TL_inputEncryptedChat();
            tLRPC$TL_messages_readEncryptedHistory.peer = tLRPC$TL_inputEncryptedChat;
            tLRPC$TL_inputEncryptedChat.chat_id = encryptedChat.id;
            tLRPC$TL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
            tLRPC$TL_messages_readEncryptedHistory.max_date = readTask.maxDate;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_readEncryptedHistory, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$completeReadTask$216(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$completeReadTask$215(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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

    public void markDialogAsReadNow(final long j, final long j2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markDialogAsReadNow$217(j2, j);
            }
        });
    }

    public void lambda$markDialogAsReadNow$217(long j, long j2) {
        if (j != 0) {
            String str = j2 + "_" + j;
            ReadTask readTask = this.threadsReadTasksMap.get(str);
            if (readTask == null) {
                return;
            }
            completeReadTask(readTask);
            this.repliesReadTasks.remove(readTask);
            this.threadsReadTasksMap.remove(str);
            return;
        }
        ReadTask readTask2 = this.readTasksMap.get(j2);
        if (readTask2 == null) {
            return;
        }
        completeReadTask(readTask2);
        this.readTasks.remove(readTask2);
        this.readTasksMap.remove(j2);
    }

    public void markMentionsAsRead(long j, long j2) {
        if (DialogObject.isEncryptedDialog(j) || j == getUserConfig().getClientUserId()) {
            return;
        }
        getMessagesStorage().resetMentionsCount(j, j2, 0);
        TLRPC$TL_messages_readMentions tLRPC$TL_messages_readMentions = new TLRPC$TL_messages_readMentions();
        tLRPC$TL_messages_readMentions.peer = getInputPeer(j);
        if (j2 != 0) {
            tLRPC$TL_messages_readMentions.top_msg_id = (int) j2;
            tLRPC$TL_messages_readMentions.flags |= 1;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_readMentions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$markMentionsAsRead$218(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void markDialogAsRead(final long r16, final int r18, final int r19, final int r20, final boolean r21, final long r22, final int r24, final boolean r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.markDialogAsRead(long, int, int, int, boolean, long, int, boolean, int):void");
    }

    public void lambda$markDialogAsRead$220(final long j, final int i, final int i2, final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markDialogAsRead$219(j, i, i2, z);
            }
        });
    }

    public void lambda$markDialogAsRead$219(long j, int i, int i2, boolean z) {
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
                if (!isDialogMuted(j, 0L)) {
                    this.unreadUnmutedDialogs--;
                }
                int i5 = 0;
                while (true) {
                    DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                    if (i5 < dialogFilterArr.length) {
                        if (dialogFilterArr[i5] != null && (dialogFilterArr[i5].flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                            sortDialogs(null);
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                            break;
                        }
                        i5++;
                    } else {
                        break;
                    }
                }
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
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

    public void lambda$markDialogAsRead$222(final long j, final int i, final boolean z, final int i2, final int i3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markDialogAsRead$221(j, i, z, i2, i3);
            }
        });
    }

    public void lambda$markDialogAsRead$221(long j, int i, boolean z, int i2, int i3) {
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
                if (!isDialogMuted(j, 0L)) {
                    this.unreadUnmutedDialogs--;
                }
                int i6 = 0;
                while (true) {
                    DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                    if (i6 < dialogFilterArr.length) {
                        if (dialogFilterArr[i6] != null && (dialogFilterArr[i6].flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                            sortDialogs(null);
                            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                            break;
                        }
                        i6++;
                    } else {
                        break;
                    }
                }
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
        }
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
        longSparseIntArray.put(j, 0);
        getNotificationsController().processDialogsUpdateRead(longSparseIntArray);
    }

    public void lambda$markDialogAsRead$223(long j, long j2, boolean z, int i, int i2) {
        ReadTask readTask;
        if (j != 0) {
            HashMap<String, ReadTask> hashMap = this.threadsReadTasksMap;
            readTask = hashMap.get(j2 + "_" + j);
        } else {
            readTask = this.readTasksMap.get(j2);
        }
        if (readTask == null) {
            readTask = new ReadTask(null);
            readTask.dialogId = j2;
            readTask.replyId = j;
            readTask.sendRequestTime = SystemClock.elapsedRealtime() + 5000;
            if (!z) {
                if (j != 0) {
                    HashMap<String, ReadTask> hashMap2 = this.threadsReadTasksMap;
                    hashMap2.put(j2 + "_" + j, readTask);
                    this.repliesReadTasks.add(readTask);
                } else {
                    this.readTasksMap.put(j2, readTask);
                    this.readTasks.add(readTask);
                }
            }
        }
        readTask.maxDate = i;
        readTask.maxId = i2;
        if (z) {
            completeReadTask(readTask);
        }
    }

    public int createChat(String str, ArrayList<Long> arrayList, String str2, int i, boolean z, Location location, String str3, int i2, final BaseFragment baseFragment) {
        if (i == 0 && !z) {
            final TLRPC$TL_messages_createChat tLRPC$TL_messages_createChat = new TLRPC$TL_messages_createChat();
            tLRPC$TL_messages_createChat.title = str;
            if (i2 >= 0) {
                tLRPC$TL_messages_createChat.ttl_period = i2;
                tLRPC$TL_messages_createChat.flags |= 1;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC$User user = getUser(arrayList.get(i3));
                if (user != null) {
                    tLRPC$TL_messages_createChat.users.add(getInputUser(user));
                }
            }
            return getConnectionsManager().sendRequest(tLRPC$TL_messages_createChat, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$createChat$226(baseFragment, tLRPC$TL_messages_createChat, tLObject, tLRPC$TL_error);
                }
            }, 2);
        } else if (z || i == 2 || i == 4 || i == 5) {
            final TLRPC$TL_channels_createChannel tLRPC$TL_channels_createChannel = new TLRPC$TL_channels_createChannel();
            tLRPC$TL_channels_createChannel.title = str;
            if (str2 == null) {
                str2 = "";
            }
            tLRPC$TL_channels_createChannel.about = str2;
            tLRPC$TL_channels_createChannel.for_import = z;
            if (z || i == 4 || i == 5) {
                tLRPC$TL_channels_createChannel.megagroup = true;
            } else {
                tLRPC$TL_channels_createChannel.broadcast = true;
            }
            tLRPC$TL_channels_createChannel.forum = i == 5;
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
                    MessagesController.this.lambda$createChat$229(baseFragment, tLRPC$TL_channels_createChannel, tLObject, tLRPC$TL_error);
                }
            }, 2);
        } else {
            return 0;
        }
    }

    public void lambda$createChat$226(final BaseFragment baseFragment, final TLRPC$TL_messages_createChat tLRPC$TL_messages_createChat, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$createChat$224(tLRPC$TL_error, baseFragment, tLRPC$TL_messages_createChat);
                }
            });
            return;
        }
        final TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        processUpdates(tLRPC$Updates, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$createChat$225(tLRPC$Updates);
            }
        });
    }

    public void lambda$createChat$224(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_createChat tLRPC$TL_messages_createChat) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_createChat, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidFailCreate, new Object[0]);
    }

    public void lambda$createChat$225(TLRPC$Updates tLRPC$Updates) {
        putUsers(tLRPC$Updates.users, false);
        putChats(tLRPC$Updates.chats, false);
        ArrayList<TLRPC$Chat> arrayList = tLRPC$Updates.chats;
        if (arrayList != null && !arrayList.isEmpty()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidCreated, Long.valueOf(tLRPC$Updates.chats.get(0).id));
            AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, tLRPC$Updates.chats.get(0), tLRPC$Updates);
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidFailCreate, new Object[0]);
    }

    public void lambda$createChat$229(final BaseFragment baseFragment, final TLRPC$TL_channels_createChannel tLRPC$TL_channels_createChannel, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$createChat$227(tLRPC$TL_error, baseFragment, tLRPC$TL_channels_createChannel);
                }
            });
            return;
        }
        final TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        processUpdates(tLRPC$Updates, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$createChat$228(tLRPC$Updates);
            }
        });
    }

    public void lambda$createChat$227(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_createChannel tLRPC$TL_channels_createChannel) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_createChannel, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidFailCreate, new Object[0]);
    }

    public void lambda$createChat$228(TLRPC$Updates tLRPC$Updates) {
        putUsers(tLRPC$Updates.users, false);
        putChats(tLRPC$Updates.chats, false);
        ArrayList<TLRPC$Chat> arrayList = tLRPC$Updates.chats;
        if (arrayList != null && !arrayList.isEmpty()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidCreated, Long.valueOf(tLRPC$Updates.chats.get(0).id));
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidFailCreate, new Object[0]);
        }
    }

    public void convertToMegaGroup(Context context, long j, BaseFragment baseFragment, MessagesStorage.LongCallback longCallback) {
        convertToMegaGroup(context, j, baseFragment, longCallback, null);
    }

    public void convertToMegaGroup(final Context context, final long j, final BaseFragment baseFragment, final MessagesStorage.LongCallback longCallback, final Runnable runnable) {
        final TLRPC$TL_messages_migrateChat tLRPC$TL_messages_migrateChat = new TLRPC$TL_messages_migrateChat();
        tLRPC$TL_messages_migrateChat.chat_id = j;
        final AlertDialog alertDialog = context != null ? new AlertDialog(context, 3) : null;
        final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_migrateChat, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$convertToMegaGroup$233(context, alertDialog, longCallback, j, runnable, baseFragment, tLRPC$TL_messages_migrateChat, tLObject, tLRPC$TL_error);
            }
        });
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    MessagesController.this.lambda$convertToMegaGroup$234(sendRequest, dialogInterface);
                }
            });
            try {
                alertDialog.show();
            } catch (Exception unused) {
            }
        }
    }

    public void lambda$convertToMegaGroup$233(final Context context, final AlertDialog alertDialog, final MessagesStorage.LongCallback longCallback, final long j, Runnable runnable, final BaseFragment baseFragment, final TLRPC$TL_messages_migrateChat tLRPC$TL_messages_migrateChat, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            if (context != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.lambda$convertToMegaGroup$230(context, alertDialog);
                    }
                });
            }
            final TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
            processUpdates(tLRPC$Updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$convertToMegaGroup$231(MessagesStorage.LongCallback.this, tLRPC$Updates, j);
                }
            });
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$convertToMegaGroup$232(longCallback, context, alertDialog, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_migrateChat);
            }
        });
    }

    public static void lambda$convertToMegaGroup$230(Context context, AlertDialog alertDialog) {
        if (((Activity) context).isFinishing()) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$convertToMegaGroup$231(MessagesStorage.LongCallback longCallback, TLRPC$Updates tLRPC$Updates, long j) {
        TLRPC$Chat tLRPC$Chat;
        TLRPC$Chat tLRPC$Chat2;
        TLRPC$InputChannel tLRPC$InputChannel;
        if (longCallback != null) {
            int i = 0;
            int i2 = 0;
            while (true) {
                tLRPC$Chat = null;
                if (i2 >= tLRPC$Updates.chats.size()) {
                    tLRPC$Chat2 = null;
                    break;
                }
                tLRPC$Chat2 = tLRPC$Updates.chats.get(i2);
                if (j == tLRPC$Chat2.id) {
                    break;
                }
                i2++;
            }
            if (tLRPC$Chat2 == null || (tLRPC$InputChannel = tLRPC$Chat2.migrated_to) == null) {
                return;
            }
            long j2 = tLRPC$InputChannel.channel_id;
            while (true) {
                if (i >= tLRPC$Updates.chats.size()) {
                    break;
                }
                TLRPC$Chat tLRPC$Chat3 = tLRPC$Updates.chats.get(i);
                if (j2 == tLRPC$Chat3.id) {
                    tLRPC$Chat = tLRPC$Chat3;
                    break;
                }
                i++;
            }
            if (tLRPC$Chat != null) {
                longCallback.run(j2);
            }
        }
    }

    public void lambda$convertToMegaGroup$232(MessagesStorage.LongCallback longCallback, Context context, AlertDialog alertDialog, TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_migrateChat tLRPC$TL_messages_migrateChat) {
        if (longCallback != null) {
            longCallback.run(0L);
        }
        if (context == null || ((Activity) context).isFinishing()) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_migrateChat, Boolean.FALSE);
    }

    public void lambda$convertToMegaGroup$234(int i, DialogInterface dialogInterface) {
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
                MessagesController.this.lambda$convertToGigaGroup$238(context, alertDialog2, booleanCallback, baseFragment, tLRPC$TL_channels_convertToGigagroup, tLObject, tLRPC$TL_error);
            }
        });
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    MessagesController.this.lambda$convertToGigaGroup$239(sendRequest, dialogInterface);
                }
            });
            try {
                alertDialog.showDelayed(400L);
            } catch (Exception unused) {
            }
        }
    }

    public void lambda$convertToGigaGroup$238(final Context context, final AlertDialog alertDialog, final MessagesStorage.BooleanCallback booleanCallback, final BaseFragment baseFragment, final TLRPC$TL_channels_convertToGigagroup tLRPC$TL_channels_convertToGigagroup, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            if (context != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.lambda$convertToGigaGroup$235(context, alertDialog);
                    }
                });
            }
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$convertToGigaGroup$236(MessagesStorage.BooleanCallback.this);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$convertToGigaGroup$237(booleanCallback, context, alertDialog, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_convertToGigagroup);
            }
        });
    }

    public static void lambda$convertToGigaGroup$235(Context context, AlertDialog alertDialog) {
        if (((Activity) context).isFinishing()) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$convertToGigaGroup$236(MessagesStorage.BooleanCallback booleanCallback) {
        if (booleanCallback != null) {
            booleanCallback.run(true);
        }
    }

    public void lambda$convertToGigaGroup$237(MessagesStorage.BooleanCallback booleanCallback, Context context, AlertDialog alertDialog, TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_convertToGigagroup tLRPC$TL_channels_convertToGigagroup) {
        if (booleanCallback != null) {
            booleanCallback.run(false);
        }
        if (context == null || ((Activity) context).isFinishing()) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_convertToGigagroup, Boolean.FALSE);
    }

    public void lambda$convertToGigaGroup$239(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public void addUsersToChannel(final long j, ArrayList<TLRPC$InputUser> arrayList, final BaseFragment baseFragment) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        final TLRPC$TL_channels_inviteToChannel tLRPC$TL_channels_inviteToChannel = new TLRPC$TL_channels_inviteToChannel();
        tLRPC$TL_channels_inviteToChannel.channel = getInputChannel(j);
        tLRPC$TL_channels_inviteToChannel.users = arrayList;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_inviteToChannel, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$addUsersToChannel$242(baseFragment, tLRPC$TL_channels_inviteToChannel, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$addUsersToChannel$240(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_inviteToChannel tLRPC$TL_channels_inviteToChannel) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_inviteToChannel, Boolean.TRUE);
    }

    public void lambda$addUsersToChannel$242(final BaseFragment baseFragment, final TLRPC$TL_channels_inviteToChannel tLRPC$TL_channels_inviteToChannel, final long j, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addUsersToChannel$240(tLRPC$TL_error, baseFragment, tLRPC$TL_channels_inviteToChannel);
                }
            });
            return;
        }
        processUpdates((TLRPC$Updates) tLObject, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$addUsersToChannel$241(j, tLObject);
            }
        });
    }

    public void lambda$addUsersToChannel$241(long j, TLObject tLObject) {
        AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, getChat(Long.valueOf(j)), (TLRPC$Updates) tLObject);
    }

    public void setDefaultSendAs(final long j, long j2) {
        TLRPC$ChatFull chatFull = getChatFull(-j);
        if (chatFull != null) {
            chatFull.default_send_as = getPeer(j2);
            getMessagesStorage().updateChatInfo(chatFull, false);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateDefaultSendAsPeer, Long.valueOf(j), chatFull.default_send_as);
        }
        TLRPC$TL_messages_saveDefaultSendAs tLRPC$TL_messages_saveDefaultSendAs = new TLRPC$TL_messages_saveDefaultSendAs();
        tLRPC$TL_messages_saveDefaultSendAs.peer = getInputPeer(j);
        tLRPC$TL_messages_saveDefaultSendAs.send_as = getInputPeer(j2);
        getConnectionsManager().sendRequest(tLRPC$TL_messages_saveDefaultSendAs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setDefaultSendAs$243(j, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$setDefaultSendAs$243(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            long j2 = -j;
            if (getChatFull(j2) == null) {
                loadFullChat(j2, 0, true);
            }
        } else if (tLRPC$TL_error == null || tLRPC$TL_error.code != 400) {
        } else {
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
                MessagesController.this.lambda$toggleChatNoForwards$245(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$toggleChatNoForwards$245(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChatNoForwards$244();
                }
            });
        }
    }

    public void lambda$toggleChatNoForwards$244() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void toggleChatJoinToSend(long j, boolean z, final Runnable runnable, final Runnable runnable2) {
        TLRPC$TL_channels_toggleJoinToSend tLRPC$TL_channels_toggleJoinToSend = new TLRPC$TL_channels_toggleJoinToSend();
        tLRPC$TL_channels_toggleJoinToSend.channel = getInputChannel(j);
        tLRPC$TL_channels_toggleJoinToSend.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_toggleJoinToSend, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toggleChatJoinToSend$247(runnable, runnable2, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$toggleChatJoinToSend$247(Runnable runnable, Runnable runnable2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChatJoinToSend$246();
                }
            });
            if (runnable != null) {
                runnable.run();
            }
        } else if (tLRPC$TL_error == null || "CHAT_NOT_MODIFIED".equals(tLRPC$TL_error.text)) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (runnable2 != null) {
            runnable2.run();
        }
    }

    public void lambda$toggleChatJoinToSend$246() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void toggleChatJoinRequest(long j, boolean z, final Runnable runnable, final Runnable runnable2) {
        TLRPC$TL_channels_toggleJoinRequest tLRPC$TL_channels_toggleJoinRequest = new TLRPC$TL_channels_toggleJoinRequest();
        tLRPC$TL_channels_toggleJoinRequest.channel = getInputChannel(j);
        tLRPC$TL_channels_toggleJoinRequest.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_toggleJoinRequest, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toggleChatJoinRequest$249(runnable, runnable2, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$toggleChatJoinRequest$249(Runnable runnable, Runnable runnable2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChatJoinRequest$248();
                }
            });
            if (runnable != null) {
                runnable.run();
            }
        } else if (tLRPC$TL_error == null || "CHAT_NOT_MODIFIED".equals(tLRPC$TL_error.text)) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (runnable2 != null) {
            runnable2.run();
        }
    }

    public void lambda$toggleChatJoinRequest$248() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void toggleChannelSignatures(long j, boolean z) {
        TLRPC$TL_channels_toggleSignatures tLRPC$TL_channels_toggleSignatures = new TLRPC$TL_channels_toggleSignatures();
        tLRPC$TL_channels_toggleSignatures.channel = getInputChannel(j);
        tLRPC$TL_channels_toggleSignatures.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_toggleSignatures, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toggleChannelSignatures$251(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$toggleChannelSignatures$251(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChannelSignatures$250();
                }
            });
        }
    }

    public void lambda$toggleChannelSignatures$250() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void toggleChannelForum(long j, boolean z) {
        TLRPC$TL_channels_toggleForum tLRPC$TL_channels_toggleForum = new TLRPC$TL_channels_toggleForum();
        tLRPC$TL_channels_toggleForum.channel = getInputChannel(j);
        tLRPC$TL_channels_toggleForum.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_toggleForum, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toggleChannelForum$253(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$toggleChannelForum$253(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChannelForum$252();
                }
            });
        }
    }

    public void lambda$toggleChannelForum$252() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void toggleChannelInvitesHistory(long j, boolean z) {
        TLRPC$TL_channels_togglePreHistoryHidden tLRPC$TL_channels_togglePreHistoryHidden = new TLRPC$TL_channels_togglePreHistoryHidden();
        tLRPC$TL_channels_togglePreHistoryHidden.channel = getInputChannel(j);
        tLRPC$TL_channels_togglePreHistoryHidden.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_togglePreHistoryHidden, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toggleChannelInvitesHistory$255(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$toggleChannelInvitesHistory$255(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChannelInvitesHistory$254();
                }
            });
        }
    }

    public void lambda$toggleChannelInvitesHistory$254() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void updateChatAbout(long j, final String str, final TLRPC$ChatFull tLRPC$ChatFull) {
        TLRPC$TL_messages_editChatAbout tLRPC$TL_messages_editChatAbout = new TLRPC$TL_messages_editChatAbout();
        tLRPC$TL_messages_editChatAbout.peer = getInputPeer(-j);
        tLRPC$TL_messages_editChatAbout.about = str;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatAbout, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$updateChatAbout$257(tLRPC$ChatFull, str, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$updateChatAbout$257(final TLRPC$ChatFull tLRPC$ChatFull, final String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (!(tLObject instanceof TLRPC$TL_boolTrue) || tLRPC$ChatFull == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$updateChatAbout$256(tLRPC$ChatFull, str);
            }
        });
    }

    public void lambda$updateChatAbout$256(TLRPC$ChatFull tLRPC$ChatFull, String str) {
        tLRPC$ChatFull.about = str;
        getMessagesStorage().updateChatInfo(tLRPC$ChatFull, false);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, tLRPC$ChatFull, 0, bool, bool);
    }

    public void updateChannelUserName(final BaseFragment baseFragment, final long j, final String str, final Runnable runnable, final Runnable runnable2) {
        final TLRPC$TL_channels_updateUsername tLRPC$TL_channels_updateUsername = new TLRPC$TL_channels_updateUsername();
        tLRPC$TL_channels_updateUsername.channel = getInputChannel(j);
        tLRPC$TL_channels_updateUsername.username = str;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_updateUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$updateChannelUserName$259(j, str, runnable, baseFragment, tLRPC$TL_channels_updateUsername, runnable2, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$updateChannelUserName$259(final long j, final String str, final Runnable runnable, BaseFragment baseFragment, TLRPC$TL_channels_updateUsername tLRPC$TL_channels_updateUsername, Runnable runnable2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if ((tLObject instanceof TLRPC$TL_boolTrue) || (tLRPC$TL_error != null && "USERNAME_NOT_MODIFIED".equals(tLRPC$TL_error.text))) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$updateChannelUserName$258(j, str, runnable);
                }
            });
            return;
        }
        AlertsCreator.processError(UserConfig.selectedAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_updateUsername, new Object[0]);
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public void lambda$updateChannelUserName$258(long j, String str, Runnable runnable) {
        boolean z;
        TLRPC$Chat chat = getChat(Long.valueOf(j));
        if (chat.usernames != null) {
            for (int i = 0; i < chat.usernames.size(); i++) {
                TLRPC$TL_username tLRPC$TL_username = chat.usernames.get(i);
                if (tLRPC$TL_username != null && tLRPC$TL_username.editable) {
                    tLRPC$TL_username.username = str;
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            ArrayList<TLRPC$TL_username> arrayList = chat.usernames;
            if (arrayList == null || arrayList.size() >= 1) {
                if (chat.usernames == null) {
                    chat.usernames = new ArrayList<>();
                }
                TLRPC$TL_username tLRPC$TL_username2 = new TLRPC$TL_username();
                tLRPC$TL_username2.username = str;
                tLRPC$TL_username2.active = true;
                tLRPC$TL_username2.editable = true;
                chat.usernames.add(0, tLRPC$TL_username2);
            } else {
                chat.username = str;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(chat);
        getMessagesStorage().putUsersAndChats(null, arrayList2, true, true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
        if (runnable != null) {
            runnable.run();
        }
    }

    public void sendBotStart(TLRPC$User tLRPC$User, String str) {
        if (tLRPC$User == null) {
            return;
        }
        TLRPC$TL_messages_startBot tLRPC$TL_messages_startBot = new TLRPC$TL_messages_startBot();
        tLRPC$TL_messages_startBot.bot = getInputUser(tLRPC$User);
        tLRPC$TL_messages_startBot.peer = getInputPeer(tLRPC$User.id);
        tLRPC$TL_messages_startBot.start_param = str;
        tLRPC$TL_messages_startBot.random_id = Utilities.random.nextLong();
        getConnectionsManager().sendRequest(tLRPC$TL_messages_startBot, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$sendBotStart$260(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$sendBotStart$260(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        processUpdates((TLRPC$Updates) tLObject, false);
    }

    public boolean isJoiningChannel(long j) {
        return this.joiningToChannels.contains(Long.valueOf(j));
    }

    public void addUserToChat(long j, TLRPC$User tLRPC$User, int i, String str, BaseFragment baseFragment, Runnable runnable) {
        addUserToChat(j, tLRPC$User, i, str, baseFragment, false, runnable, null);
    }

    public void addUsersToChat(final TLRPC$Chat tLRPC$Chat, BaseFragment baseFragment, ArrayList<TLRPC$User> arrayList, int i, final androidx.core.util.Consumer<TLRPC$User> consumer, final androidx.core.util.Consumer<TLRPC$User> consumer2, final Runnable runnable) {
        final int size = arrayList.size();
        final ArrayList arrayList2 = new ArrayList();
        final int[] iArr = {0};
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$addUsersToChat$262(tLRPC$Chat, arrayList2);
            }
        };
        long j = tLRPC$Chat.id;
        int i2 = 0;
        while (i2 < size) {
            final TLRPC$User tLRPC$User = arrayList.get(i2);
            addUserToChat(j, tLRPC$User, i, null, baseFragment, false, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$addUsersToChat$263(androidx.core.util.Consumer.this, tLRPC$User, iArr, size, arrayList2, runnable2, runnable);
                }
            }, new ErrorDelegate() {
                @Override
                public final boolean run(TLRPC$TL_error tLRPC$TL_error) {
                    boolean lambda$addUsersToChat$264;
                    lambda$addUsersToChat$264 = MessagesController.lambda$addUsersToChat$264(iArr, arrayList2, tLRPC$User, size, runnable2, consumer2, tLRPC$TL_error);
                    return lambda$addUsersToChat$264;
                }
            });
            putUser(tLRPC$User, false);
            i2++;
            j = j;
        }
    }

    public void lambda$addUsersToChat$262(final TLRPC$Chat tLRPC$Chat, final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$addUsersToChat$261(tLRPC$Chat, arrayList);
            }
        }, 200L);
    }

    public void lambda$addUsersToChat$261(TLRPC$Chat tLRPC$Chat, ArrayList arrayList) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null || lastFragment.getParentActivity() == null || lastFragment.getParentActivity().isFinishing()) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(lastFragment, lastFragment.getParentActivity(), 11, this.currentAccount, null);
        limitReachedBottomSheet.setRestrictedUsers(tLRPC$Chat, arrayList);
        limitReachedBottomSheet.show();
    }

    public static void lambda$addUsersToChat$263(androidx.core.util.Consumer consumer, TLRPC$User tLRPC$User, int[] iArr, int i, ArrayList arrayList, Runnable runnable, Runnable runnable2) {
        if (consumer != null) {
            consumer.accept(tLRPC$User);
        }
        iArr[0] = iArr[0] + 1;
        if (iArr[0] >= i) {
            if (arrayList.size() > 0) {
                runnable.run();
            }
            if (runnable2 != null) {
                runnable2.run();
            }
        }
    }

    public static boolean lambda$addUsersToChat$264(int[] iArr, ArrayList arrayList, TLRPC$User tLRPC$User, int i, Runnable runnable, androidx.core.util.Consumer consumer, TLRPC$TL_error tLRPC$TL_error) {
        iArr[0] = iArr[0] + 1;
        boolean z = tLRPC$TL_error != null && "USER_PRIVACY_RESTRICTED".equals(tLRPC$TL_error.text);
        if (z) {
            arrayList.add(tLRPC$User);
        }
        if (iArr[0] >= i && arrayList.size() > 0) {
            runnable.run();
        }
        if (consumer != null) {
            consumer.accept(tLRPC$User);
        }
        return !z;
    }

    public void addUserToChat(final long j, TLRPC$User tLRPC$User, int i, String str, final BaseFragment baseFragment, final boolean z, final Runnable runnable, final ErrorDelegate errorDelegate) {
        TLRPC$TL_messages_addChatUser tLRPC$TL_messages_addChatUser;
        if (tLRPC$User == null) {
            if (errorDelegate != null) {
                errorDelegate.run(null);
                return;
            }
            return;
        }
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
        } else if (isChannel) {
            if (inputUser instanceof TLRPC$TL_inputUserSelf) {
                if (this.joiningToChannels.contains(Long.valueOf(j))) {
                    if (errorDelegate != null) {
                        errorDelegate.run(null);
                        return;
                    }
                    return;
                }
                TLRPC$TL_channels_joinChannel tLRPC$TL_channels_joinChannel = new TLRPC$TL_channels_joinChannel();
                tLRPC$TL_channels_joinChannel.channel = getInputChannel(j);
                this.joiningToChannels.add(Long.valueOf(j));
                tLRPC$TL_messages_addChatUser = tLRPC$TL_channels_joinChannel;
            } else {
                TLRPC$TL_channels_inviteToChannel tLRPC$TL_channels_inviteToChannel = new TLRPC$TL_channels_inviteToChannel();
                tLRPC$TL_channels_inviteToChannel.channel = getInputChannel(j);
                tLRPC$TL_channels_inviteToChannel.users.add(inputUser);
                tLRPC$TL_messages_addChatUser = tLRPC$TL_channels_inviteToChannel;
            }
        } else {
            TLRPC$TL_messages_addChatUser tLRPC$TL_messages_addChatUser2 = new TLRPC$TL_messages_addChatUser();
            tLRPC$TL_messages_addChatUser2.chat_id = j;
            tLRPC$TL_messages_addChatUser2.fwd_limit = i;
            tLRPC$TL_messages_addChatUser2.user_id = inputUser;
            tLRPC$TL_messages_addChatUser = tLRPC$TL_messages_addChatUser2;
        }
        final TLRPC$TL_messages_addChatUser tLRPC$TL_messages_addChatUser3 = tLRPC$TL_messages_addChatUser;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_addChatUser3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$addUserToChat$270(isChannel, inputUser, j, z, runnable, errorDelegate, baseFragment, tLRPC$TL_messages_addChatUser3, z2, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$addUserToChat$270(final boolean z, final TLRPC$InputUser tLRPC$InputUser, final long j, boolean z2, Runnable runnable, final ErrorDelegate errorDelegate, final BaseFragment baseFragment, final TLObject tLObject, final boolean z3, final TLObject tLObject2, final TLRPC$TL_error tLRPC$TL_error) {
        boolean z4;
        if (z && (tLRPC$InputUser instanceof TLRPC$TL_inputUserSelf)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addUserToChat$265(j);
                }
            });
        }
        if (tLRPC$TL_error != null) {
            if ("USER_ALREADY_PARTICIPANT".equals(tLRPC$TL_error.text) && z2) {
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            }
            if (errorDelegate != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$addUserToChat$266(errorDelegate, tLRPC$TL_error, baseFragment, tLObject, z, z3);
                    }
                });
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addUserToChat$267(errorDelegate, tLRPC$TL_error, baseFragment, tLObject, z, z3, tLRPC$InputUser);
                }
            });
            return;
        }
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
                    MessagesController.this.lambda$addUserToChat$268(j, tLObject2);
                }
            });
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addUserToChat$269(j);
                }
            }, 1000L);
        }
        if (z && (tLRPC$InputUser instanceof TLRPC$TL_inputUserSelf)) {
            getMessagesStorage().updateDialogsWithDeletedMessages(-j, j, new ArrayList<>(), null, true);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$addUserToChat$265(long j) {
        this.joiningToChannels.remove(Long.valueOf(j));
    }

    public void lambda$addUserToChat$266(ErrorDelegate errorDelegate, TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLObject tLObject, boolean z, boolean z2) {
        if (errorDelegate.run(tLRPC$TL_error)) {
            int i = this.currentAccount;
            boolean z3 = true;
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf((!z || z2) ? false : false);
            AlertsCreator.processError(i, tLRPC$TL_error, baseFragment, tLObject, objArr);
        }
    }

    public void lambda$addUserToChat$267(ErrorDelegate errorDelegate, TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLObject tLObject, boolean z, boolean z2, TLRPC$InputUser tLRPC$InputUser) {
        if (errorDelegate == null) {
            int i = this.currentAccount;
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(z && !z2);
            AlertsCreator.processError(i, tLRPC$TL_error, baseFragment, tLObject, objArr);
        }
        if (z && (tLRPC$InputUser instanceof TLRPC$TL_inputUserSelf)) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
        }
    }

    public void lambda$addUserToChat$268(long j, TLObject tLObject) {
        AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, getChat(Long.valueOf(j)), (TLRPC$Updates) tLObject);
    }

    public void lambda$addUserToChat$269(long j) {
        loadFullChat(j, 0, true);
    }

    public void deleteParticipantFromChat(long j, TLRPC$User tLRPC$User) {
        deleteParticipantFromChat(j, tLRPC$User, null, false, false);
    }

    public void deleteParticipantFromChat(long j, TLRPC$InputPeer tLRPC$InputPeer) {
        deleteParticipantFromChat(j, tLRPC$InputPeer, false, false);
    }

    public void deleteParticipantFromChat(final long r11, org.telegram.tgnet.TLRPC$InputPeer r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.deleteParticipantFromChat(long, org.telegram.tgnet.TLRPC$InputPeer, boolean, boolean):void");
    }

    public void lambda$deleteParticipantFromChat$273(boolean z, boolean z2, final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        processUpdates((TLRPC$Updates) tLObject, false);
        if (!z || z2) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteParticipantFromChat$272(j);
            }
        }, 1000L);
    }

    public void lambda$deleteParticipantFromChat$272(long j) {
        loadFullChat(j, 0, true);
    }

    public void deleteParticipantFromChat(final long j, final TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, boolean z, boolean z2) {
        TLRPC$InputPeer inputPeer;
        TLRPC$TL_messages_deleteChatUser tLRPC$TL_messages_deleteChatUser;
        if (tLRPC$User == null && tLRPC$Chat == null) {
            return;
        }
        if (tLRPC$User != null) {
            inputPeer = getInputPeer(tLRPC$User);
        } else {
            inputPeer = getInputPeer(tLRPC$Chat);
        }
        TLRPC$Chat chat = getChat(Long.valueOf(j));
        final boolean isChannel = ChatObject.isChannel(chat);
        if (isChannel) {
            if (UserObject.isUserSelf(tLRPC$User)) {
                if (chat.creator && z) {
                    TLRPC$TL_channels_deleteChannel tLRPC$TL_channels_deleteChannel = new TLRPC$TL_channels_deleteChannel();
                    tLRPC$TL_channels_deleteChannel.channel = getInputChannel(chat);
                    tLRPC$TL_messages_deleteChatUser = tLRPC$TL_channels_deleteChannel;
                } else {
                    TLRPC$TL_channels_leaveChannel tLRPC$TL_channels_leaveChannel = new TLRPC$TL_channels_leaveChannel();
                    tLRPC$TL_channels_leaveChannel.channel = getInputChannel(chat);
                    tLRPC$TL_messages_deleteChatUser = tLRPC$TL_channels_leaveChannel;
                }
            } else {
                TLRPC$TL_channels_editBanned tLRPC$TL_channels_editBanned = new TLRPC$TL_channels_editBanned();
                tLRPC$TL_channels_editBanned.channel = getInputChannel(chat);
                tLRPC$TL_channels_editBanned.participant = inputPeer;
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
            }
        } else if (z) {
            TLRPC$TL_messages_deleteChat tLRPC$TL_messages_deleteChat = new TLRPC$TL_messages_deleteChat();
            tLRPC$TL_messages_deleteChat.chat_id = j;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteChat, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$deleteParticipantFromChat$274(tLObject, tLRPC$TL_error);
                }
            });
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
                MessagesController.this.lambda$deleteParticipantFromChat$276(isChannel, tLRPC$User, j, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$deleteParticipantFromChat$276(boolean z, TLRPC$User tLRPC$User, final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        processUpdates((TLRPC$Updates) tLObject, false);
        if (!z || UserObject.isUserSelf(tLRPC$User)) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteParticipantFromChat$275(j);
            }
        }, 1000L);
    }

    public void lambda$deleteParticipantFromChat$275(long j) {
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
                MessagesController.this.lambda$changeChatTitle$277(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$changeChatTitle$277(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        processUpdates((TLRPC$Updates) tLObject, false);
    }

    public void changeChatAvatar(final long j, final TLRPC$TL_inputChatPhoto tLRPC$TL_inputChatPhoto, TLRPC$InputFile tLRPC$InputFile, TLRPC$InputFile tLRPC$InputFile2, TLRPC$VideoSize tLRPC$VideoSize, double d, final String str, final TLRPC$FileLocation tLRPC$FileLocation, final TLRPC$FileLocation tLRPC$FileLocation2, final Runnable runnable) {
        MessagesController messagesController;
        TLRPC$InputChatPhoto tLRPC$InputChatPhoto;
        TLRPC$TL_messages_editChatPhoto tLRPC$TL_messages_editChatPhoto;
        if (tLRPC$TL_inputChatPhoto != null) {
            messagesController = this;
            tLRPC$InputChatPhoto = tLRPC$TL_inputChatPhoto;
        } else if (tLRPC$InputFile != null || tLRPC$InputFile2 != null || tLRPC$VideoSize != null) {
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
            if (tLRPC$VideoSize != null) {
                tLRPC$TL_inputChatUploadedPhoto.video_emoji_markup = tLRPC$VideoSize;
                tLRPC$TL_inputChatUploadedPhoto.flags |= 8;
            }
            messagesController = this;
            tLRPC$InputChatPhoto = tLRPC$TL_inputChatUploadedPhoto;
        } else {
            tLRPC$InputChatPhoto = new TLRPC$InputChatPhoto() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(480546647);
                }
            };
            messagesController = this;
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
                MessagesController.this.lambda$changeChatAvatar$279(tLRPC$TL_inputChatPhoto, tLRPC$FileLocation, tLRPC$FileLocation2, str, j, runnable, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$changeChatAvatar$279(TLRPC$TL_inputChatPhoto tLRPC$TL_inputChatPhoto, TLRPC$FileLocation tLRPC$FileLocation, TLRPC$FileLocation tLRPC$FileLocation2, String str, long j, final Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$Photo tLRPC$Photo;
        if (tLRPC$TL_error != null) {
            return;
        }
        TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        if (tLRPC$TL_inputChatPhoto == null) {
            int size = tLRPC$Updates.updates.size();
            int i = 0;
            while (true) {
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
                TLRPC$VideoSize tLRPC$VideoSize = tLRPC$Photo.video_sizes.isEmpty() ? null : tLRPC$Photo.video_sizes.get(0);
                if (closestPhotoSizeWithSize != null && tLRPC$FileLocation != null) {
                    getFileLoader().getPathToAttach(tLRPC$FileLocation, true).renameTo(getFileLoader().getPathToAttach(closestPhotoSizeWithSize, true));
                    ImageLoader.getInstance().replaceImageInCache(tLRPC$FileLocation.volume_id + "_" + tLRPC$FileLocation.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForPhoto(closestPhotoSizeWithSize, tLRPC$Photo), true);
                }
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, 800);
                if (closestPhotoSizeWithSize2 != null && tLRPC$FileLocation2 != null) {
                    getFileLoader().getPathToAttach(tLRPC$FileLocation2, true).renameTo(getFileLoader().getPathToAttach(closestPhotoSizeWithSize2, true));
                }
                if (tLRPC$VideoSize != null && str != null) {
                    new File(str).renameTo(getFileLoader().getPathToAttach(tLRPC$VideoSize, "mp4", true));
                }
                getDialogPhotos(-j).addPhotoAtStart(tLRPC$Photo);
            }
        }
        processUpdates(tLRPC$Updates, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$changeChatAvatar$278(runnable);
            }
        });
    }

    public void lambda$changeChatAvatar$278(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_AVATAR));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
    }

    public void unregistedPush() {
        if (getUserConfig().registeredForPush && SharedConfig.pushString.length() == 0) {
            TLRPC$TL_account_unregisterDevice tLRPC$TL_account_unregisterDevice = new TLRPC$TL_account_unregisterDevice();
            tLRPC$TL_account_unregisterDevice.token = SharedConfig.pushString;
            tLRPC$TL_account_unregisterDevice.token_type = SharedConfig.pushType;
            for (int i = 0; i < 4; i++) {
                UserConfig userConfig = UserConfig.getInstance(i);
                if (i != this.currentAccount && userConfig.isClientActivated()) {
                    tLRPC$TL_account_unregisterDevice.other_uids.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            getConnectionsManager().sendRequest(tLRPC$TL_account_unregisterDevice, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$unregistedPush$280(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void performLogout(int i) {
        boolean z = true;
        if (i == 1) {
            unregistedPush();
            getConnectionsManager().sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i2, boolean z2) {
                    return TLRPC$TL_auth_loggedOut.TLdeserialize(abstractSerializedData, i2, z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(1047706137);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$performLogout$282(tLObject, tLRPC$TL_error);
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
                if (i3 >= 4) {
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appDidLogout, new Object[0]);
        getMessagesStorage().cleanup(false);
        cleanup();
        getContactsController().deleteUnknownAppAccounts();
    }

    public void lambda$performLogout$282(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        getConnectionsManager().cleanup(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$performLogout$281(TLObject.this);
            }
        });
    }

    public static void lambda$performLogout$281(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_auth_loggedOut) {
            TLRPC$TL_auth_loggedOut tLRPC$TL_auth_loggedOut = (TLRPC$TL_auth_loggedOut) tLObject;
            if (tLRPC$TL_auth_loggedOut.future_auth_token != null) {
                AuthTokensHelper.addLogOutToken(tLRPC$TL_auth_loggedOut);
            }
        }
    }

    public void registerForPush(final int i, final String str) {
        if (TextUtils.isEmpty(str) || this.registeringForPush || getUserConfig().getClientUserId() == 0) {
            return;
        }
        if (getUserConfig().registeredForPush && str.equals(SharedConfig.pushString)) {
            return;
        }
        this.registeringForPush = true;
        this.lastPushRegisterSendTime = SystemClock.elapsedRealtime();
        if (SharedConfig.pushAuthKey == null) {
            SharedConfig.pushAuthKey = new byte[LiteMode.FLAG_CHAT_BLUR];
            Utilities.random.nextBytes(SharedConfig.pushAuthKey);
            SharedConfig.saveConfig();
        }
        TLRPC$TL_account_registerDevice tLRPC$TL_account_registerDevice = new TLRPC$TL_account_registerDevice();
        tLRPC$TL_account_registerDevice.token_type = i;
        tLRPC$TL_account_registerDevice.token = str;
        tLRPC$TL_account_registerDevice.no_muted = false;
        tLRPC$TL_account_registerDevice.secret = SharedConfig.pushAuthKey;
        for (int i2 = 0; i2 < 4; i2++) {
            UserConfig userConfig = UserConfig.getInstance(i2);
            if (i2 != this.currentAccount && userConfig.isClientActivated()) {
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
                MessagesController.this.lambda$registerForPush$284(i, str, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$registerForPush$284(int i, String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("account " + this.currentAccount + " registered for push, push type: " + i);
            }
            getUserConfig().registeredForPush = true;
            SharedConfig.pushString = str;
            SharedConfig.pushType = i;
            getUserConfig().saveConfig(false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$registerForPush$283();
            }
        });
    }

    public void lambda$registerForPush$283() {
        this.registeringForPush = false;
    }

    public void loadCurrentState() {
        if (this.updatingState) {
            return;
        }
        this.updatingState = true;
        getConnectionsManager().sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                return TLRPC$TL_updates_state.TLdeserialize(abstractSerializedData, i, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-304838614);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadCurrentState$285(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadCurrentState$285(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
        } else if (i == 2) {
            if (tLRPC$Updates.pts <= getMessagesStorage().getLastQtsValue()) {
                return 2;
            }
            return getMessagesStorage().getLastQtsValue() + tLRPC$Updates.updates.size() == tLRPC$Updates.pts ? 0 : 1;
        } else {
            return 0;
        }
    }

    private void processChannelsUpdatesQueue(long j, int i) {
        char c;
        ArrayList<TLRPC$Updates> arrayList = this.updatesQueueChannels.get(j);
        if (arrayList == null) {
            return;
        }
        int i2 = this.channelsPts.get(j);
        if (arrayList.isEmpty() || i2 == 0) {
            this.updatesQueueChannels.remove(j);
            return;
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$processChannelsUpdatesQueue$286;
                lambda$processChannelsUpdatesQueue$286 = MessagesController.lambda$processChannelsUpdatesQueue$286((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
                return lambda$processChannelsUpdatesQueue$286;
            }
        });
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
                if (j2 != 0 && (z || Math.abs(System.currentTimeMillis() - j2) <= 1500)) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("HOLE IN CHANNEL " + j + " UPDATES QUEUE - will wait more time");
                    }
                    if (z) {
                        this.updatesStartWaitTimeChannels.put(j, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("HOLE IN CHANNEL " + j + " UPDATES QUEUE - getChannelDifference ");
                }
                this.updatesStartWaitTimeChannels.delete(j);
                this.updatesQueueChannels.remove(j);
                getChannelDifference(j);
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

    public static int lambda$processChannelsUpdatesQueue$286(TLRPC$Updates tLRPC$Updates, TLRPC$Updates tLRPC$Updates2) {
        return AndroidUtilities.compare(tLRPC$Updates.pts, tLRPC$Updates2.pts);
    }

    private void processUpdatesQueue(int i, int i2) {
        ArrayList<TLRPC$Updates> arrayList;
        if (i == 0) {
            arrayList = this.updatesQueueSeq;
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$processUpdatesQueue$287;
                    lambda$processUpdatesQueue$287 = MessagesController.this.lambda$processUpdatesQueue$287((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
                    return lambda$processUpdatesQueue$287;
                }
            });
        } else if (i == 1) {
            arrayList = this.updatesQueuePts;
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$processUpdatesQueue$288;
                    lambda$processUpdatesQueue$288 = MessagesController.lambda$processUpdatesQueue$288((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
                    return lambda$processUpdatesQueue$288;
                }
            });
        } else if (i == 2) {
            arrayList = this.updatesQueueQts;
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$processUpdatesQueue$289;
                    lambda$processUpdatesQueue$289 = MessagesController.lambda$processUpdatesQueue$289((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
                    return lambda$processUpdatesQueue$289;
                }
            });
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
                } else if (isValidUpdate == 1) {
                    if (getUpdatesStartTime(i) != 0 && (z || Math.abs(System.currentTimeMillis() - getUpdatesStartTime(i)) <= 1500)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("HOLE IN UPDATES QUEUE - will wait more time");
                        }
                        if (z) {
                            setUpdatesStartTime(i, System.currentTimeMillis());
                            return;
                        }
                        return;
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("HOLE IN UPDATES QUEUE - getDifference");
                    }
                    setUpdatesStartTime(i, 0L);
                    arrayList.clear();
                    getDifference();
                    return;
                } else {
                    arrayList.remove(0);
                }
            }
            arrayList.clear();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("UPDATES QUEUE PROCEED - OK");
            }
        }
        setUpdatesStartTime(i, 0L);
    }

    public int lambda$processUpdatesQueue$287(TLRPC$Updates tLRPC$Updates, TLRPC$Updates tLRPC$Updates2) {
        return AndroidUtilities.compare(getUpdateSeq(tLRPC$Updates), getUpdateSeq(tLRPC$Updates2));
    }

    public static int lambda$processUpdatesQueue$288(TLRPC$Updates tLRPC$Updates, TLRPC$Updates tLRPC$Updates2) {
        return AndroidUtilities.compare(tLRPC$Updates.pts, tLRPC$Updates2.pts);
    }

    public static int lambda$processUpdatesQueue$289(TLRPC$Updates tLRPC$Updates, TLRPC$Updates tLRPC$Updates2) {
        return AndroidUtilities.compare(tLRPC$Updates.pts, tLRPC$Updates2.pts);
    }

    public void loadUnknownChannel(final TLRPC$Chat tLRPC$Chat, final long j) {
        NativeByteBuffer nativeByteBuffer;
        Exception e;
        if (!(tLRPC$Chat instanceof TLRPC$TL_channel) || this.gettingUnknownChannels.indexOfKey(tLRPC$Chat.id) >= 0) {
            return;
        }
        if (tLRPC$Chat.access_hash == 0) {
            if (j != 0) {
                getMessagesStorage().removePendingTask(j);
                return;
            }
            return;
        }
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
                            MessagesController.this.lambda$loadUnknownChannel$290(j, tLRPC$Chat, tLObject, tLRPC$TL_error);
                        }
                    });
                }
            } catch (Exception e3) {
                nativeByteBuffer = null;
                e = e3;
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadUnknownChannel$290(j, tLRPC$Chat, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadUnknownChannel$290(long j, TLRPC$Chat tLRPC$Chat, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            if (!tLRPC$TL_messages_peerDialogs.dialogs.isEmpty() && !tLRPC$TL_messages_peerDialogs.chats.isEmpty()) {
                TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
                tLRPC$TL_messages_dialogs.dialogs.addAll(tLRPC$TL_messages_peerDialogs.dialogs);
                tLRPC$TL_messages_dialogs.messages.addAll(tLRPC$TL_messages_peerDialogs.messages);
                tLRPC$TL_messages_dialogs.users.addAll(tLRPC$TL_messages_peerDialogs.users);
                tLRPC$TL_messages_dialogs.chats.addAll(tLRPC$TL_messages_peerDialogs.chats);
                processLoadedDialogs(tLRPC$TL_messages_dialogs, null, null, ((TLRPC$TL_dialog) tLRPC$TL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, this.DIALOGS_LOAD_TYPE_CHANNEL, false, false, false);
            }
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        this.gettingUnknownChannels.delete(tLRPC$Chat.id);
    }

    public void startShortPoll(TLRPC$Chat tLRPC$Chat, int i, boolean z) {
        startShortPoll(tLRPC$Chat, i, z, null);
    }

    public void startShortPoll(final TLRPC$Chat tLRPC$Chat, final int i, final boolean z, final androidx.core.util.Consumer<Boolean> consumer) {
        if (tLRPC$Chat == null) {
            return;
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$startShortPoll$293(tLRPC$Chat, z, i, consumer);
            }
        });
    }

    public void lambda$startShortPoll$293(TLRPC$Chat tLRPC$Chat, boolean z, int i, final androidx.core.util.Consumer consumer) {
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
            if (consumer != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.lambda$startShortPoll$291(androidx.core.util.Consumer.this);
                    }
                });
            }
            getChannelDifference(tLRPC$Chat.id, 3, 0L, null);
        } else if (consumer != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$startShortPoll$292(androidx.core.util.Consumer.this);
                }
            });
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

    public static void lambda$startShortPoll$291(androidx.core.util.Consumer consumer) {
        consumer.accept(Boolean.TRUE);
    }

    public static void lambda$startShortPoll$292(androidx.core.util.Consumer consumer) {
        consumer.accept(Boolean.FALSE);
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

    public void lambda$getChannelDifference$294(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$295(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$296(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$297(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$309(final long j, final int i, final long j2, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        final TLRPC$Chat tLRPC$Chat;
        if (tLObject == null) {
            if (tLRPC$TL_error != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getChannelDifference$308(tLRPC$TL_error, j);
                    }
                });
                this.gettingDifferenceChannels.delete(j);
                if (j2 != 0) {
                    getMessagesStorage().removePendingTask(j2);
                    return;
                }
                return;
            }
            return;
        }
        final TLRPC$updates_ChannelDifference tLRPC$updates_ChannelDifference = (TLRPC$updates_ChannelDifference) tLObject;
        final LongSparseArray longSparseArray = new LongSparseArray();
        int i2 = 0;
        for (int i3 = 0; i3 < tLRPC$updates_ChannelDifference.users.size(); i3++) {
            TLRPC$User tLRPC$User = tLRPC$updates_ChannelDifference.users.get(i3);
            longSparseArray.put(tLRPC$User.id, tLRPC$User);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= tLRPC$updates_ChannelDifference.chats.size()) {
                tLRPC$Chat = null;
                break;
            }
            tLRPC$Chat = tLRPC$updates_ChannelDifference.chats.get(i4);
            if (tLRPC$Chat.id == j) {
                break;
            }
            i4++;
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
                MessagesController.this.lambda$getChannelDifference$298(tLRPC$updates_ChannelDifference);
            }
        });
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getChannelDifference$307(arrayList, j, tLRPC$updates_ChannelDifference, tLRPC$Chat, longSparseArray, i, j2);
            }
        });
    }

    public void lambda$getChannelDifference$298(TLRPC$updates_ChannelDifference tLRPC$updates_ChannelDifference) {
        putUsers(tLRPC$updates_ChannelDifference.users, false);
        putChats(tLRPC$updates_ChannelDifference.chats, false);
    }

    public void lambda$getChannelDifference$307(ArrayList arrayList, final long j, final TLRPC$updates_ChannelDifference tLRPC$updates_ChannelDifference, final TLRPC$Chat tLRPC$Chat, final LongSparseArray longSparseArray, final int i, final long j2) {
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
                        MessagesController.this.lambda$getChannelDifference$299(sparseArray);
                    }
                });
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getChannelDifference$306(tLRPC$updates_ChannelDifference, j, tLRPC$Chat, longSparseArray, i, j2);
            }
        });
    }

    public void lambda$getChannelDifference$299(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            long[] jArr = (long[]) sparseArray.valueAt(i);
            getSendMessagesHelper().processSentMessage((int) jArr[1]);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf((int) jArr[1]), Integer.valueOf(keyAt), null, Long.valueOf(jArr[0]), 0L, -1, Boolean.FALSE);
        }
    }

    public void lambda$getChannelDifference$306(final org.telegram.tgnet.TLRPC$updates_ChannelDifference r23, final long r24, org.telegram.tgnet.TLRPC$Chat r26, androidx.collection.LongSparseArray r27, int r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getChannelDifference$306(org.telegram.tgnet.TLRPC$updates_ChannelDifference, long, org.telegram.tgnet.TLRPC$Chat, androidx.collection.LongSparseArray, int, long):void");
    }

    public void lambda$getChannelDifference$300(LongSparseArray longSparseArray) {
        for (int i = 0; i < longSparseArray.size(); i++) {
            updateInterfaceWithMessages(longSparseArray.keyAt(i), (ArrayList) longSparseArray.valueAt(i), false);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$getChannelDifference$302(final ArrayList arrayList, TLRPC$updates_ChannelDifference tLRPC$updates_ChannelDifference) {
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getChannelDifference$301(arrayList);
                }
            });
        }
        getMessagesStorage().putMessages(tLRPC$updates_ChannelDifference.new_messages, true, false, false, getDownloadController().getAutodownloadMask(), 0, 0L);
    }

    public void lambda$getChannelDifference$301(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$getChannelDifference$304(final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getChannelDifference$303(j);
            }
        });
    }

    public void lambda$getChannelDifference$303(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$305(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$308(TLRPC$TL_error tLRPC$TL_error, long j) {
        checkChannelError(tLRPC$TL_error.text, j);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
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
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoCantLoad, Long.valueOf(j), 2);
                return;
            case 1:
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoCantLoad, Long.valueOf(j), 0);
                return;
            case 2:
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoCantLoad, Long.valueOf(j), 1);
                return;
            default:
                return;
        }
    }

    public void getDifference() {
        getDifference(getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue(), false);
    }

    public void getDifference(int i, final int i2, final int i3, boolean z) {
        registerForPush(SharedConfig.pushType, SharedConfig.pushString);
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
                    MessagesController.this.lambda$getDifference$319(i2, i3, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$getDifference$319(final int i, final int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int i3 = 0;
        if (tLRPC$TL_error == null) {
            final TLRPC$updates_Difference tLRPC$updates_Difference = (TLRPC$updates_Difference) tLObject;
            if (tLRPC$updates_Difference instanceof TLRPC$TL_updates_differenceTooLong) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getDifference$310(tLRPC$updates_Difference, i, i2);
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
                    MessagesController.this.lambda$getDifference$311(tLRPC$updates_Difference);
                }
            });
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getDifference$318(tLRPC$updates_Difference, arrayList, longSparseArray, longSparseArray2);
                }
            });
            return;
        }
        this.gettingDifference = false;
        getConnectionsManager().setIsUpdating(false);
    }

    public void lambda$getDifference$310(TLRPC$updates_Difference tLRPC$updates_Difference, int i, int i2) {
        this.loadedFullUsers.clear();
        this.loadedFullChats.clear();
        resetDialogs(true, getMessagesStorage().getLastSeqValue(), tLRPC$updates_Difference.pts, i, i2);
        getStoriesController().cleanup();
    }

    public void lambda$getDifference$311(TLRPC$updates_Difference tLRPC$updates_Difference) {
        this.loadedFullUsers.clear();
        this.loadedFullChats.clear();
        putUsers(tLRPC$updates_Difference.users, false);
        putChats(tLRPC$updates_Difference.chats, false);
    }

    public void lambda$getDifference$318(final TLRPC$updates_Difference tLRPC$updates_Difference, ArrayList arrayList, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
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
                        MessagesController.this.lambda$getDifference$312(sparseArray);
                    }
                });
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getDifference$317(tLRPC$updates_Difference, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$getDifference$312(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            long[] jArr = (long[]) sparseArray.valueAt(i);
            getSendMessagesHelper().processSentMessage((int) jArr[1]);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf((int) jArr[1]), Integer.valueOf(keyAt), null, Long.valueOf(jArr[0]), 0L, -1, Boolean.FALSE);
        }
    }

    public void lambda$getDifference$317(final org.telegram.tgnet.TLRPC$updates_Difference r19, androidx.collection.LongSparseArray r20, androidx.collection.LongSparseArray r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getDifference$317(org.telegram.tgnet.TLRPC$updates_Difference, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray):void");
    }

    public void lambda$getDifference$316(final ArrayList arrayList, final TLRPC$updates_Difference tLRPC$updates_Difference, LongSparseArray longSparseArray) {
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getDifference$313(arrayList, tLRPC$updates_Difference);
                }
            });
        }
        getMessagesStorage().putMessages(tLRPC$updates_Difference.new_messages, true, false, false, getDownloadController().getAutodownloadMask(), 0, 0L);
        for (int i = 0; i < longSparseArray.size(); i++) {
            final long keyAt = longSparseArray.keyAt(i);
            final ArrayList<MessageObject> arrayList2 = (ArrayList) longSparseArray.valueAt(i);
            getMediaDataController().loadReplyMessagesForMessages(arrayList2, keyAt, false, 0L, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getDifference$315(keyAt, arrayList2);
                }
            }, 0);
        }
    }

    public void lambda$getDifference$313(ArrayList arrayList, TLRPC$updates_Difference tLRPC$updates_Difference) {
        getNotificationsController().processNewMessages(arrayList, !(tLRPC$updates_Difference instanceof TLRPC$TL_updates_differenceSlice), false, null);
    }

    public void lambda$getDifference$315(final long j, final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getDifference$314(j, arrayList);
            }
        });
    }

    public void lambda$getDifference$314(long j, ArrayList arrayList) {
        updateInterfaceWithMessages(j, arrayList, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void markDialogAsUnread(long j, TLRPC$InputPeer tLRPC$InputPeer, final long j2) {
        NativeByteBuffer nativeByteBuffer;
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        NativeByteBuffer nativeByteBuffer2 = null;
        if (tLRPC$Dialog != null) {
            tLRPC$Dialog.unread_mark = true;
            if (tLRPC$Dialog.unread_count == 0 && !isDialogMuted(j, 0L)) {
                this.unreadUnmutedDialogs++;
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
            getMessagesStorage().setDialogUnread(j, true);
            int i = 0;
            while (true) {
                DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                if (i < dialogFilterArr.length) {
                    if (dialogFilterArr[i] != null && (dialogFilterArr[i].flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                        sortDialogs(null);
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        if (DialogObject.isEncryptedDialog(j)) {
            return;
        }
        TLRPC$TL_messages_markDialogUnread tLRPC$TL_messages_markDialogUnread = new TLRPC$TL_messages_markDialogUnread();
        tLRPC$TL_messages_markDialogUnread.unread = true;
        if (tLRPC$InputPeer == null) {
            tLRPC$InputPeer = getInputPeer(j);
        }
        if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerEmpty) {
            return;
        }
        TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
        tLRPC$TL_inputDialogPeer.peer = tLRPC$InputPeer;
        tLRPC$TL_messages_markDialogUnread.peer = tLRPC$TL_inputDialogPeer;
        if (j2 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(tLRPC$InputPeer.getObjectSize() + 12);
            } catch (Exception e) {
                e = e;
            }
            try {
                nativeByteBuffer.writeInt32(9);
                nativeByteBuffer.writeInt64(j);
                tLRPC$InputPeer.serializeToStream(nativeByteBuffer);
            } catch (Exception e2) {
                e = e2;
                nativeByteBuffer2 = nativeByteBuffer;
                FileLog.e(e);
                nativeByteBuffer = nativeByteBuffer2;
                j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
                getConnectionsManager().sendRequest(tLRPC$TL_messages_markDialogUnread, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$markDialogAsUnread$320(j2, tLObject, tLRPC$TL_error);
                    }
                });
            }
            j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_markDialogUnread, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$markDialogAsUnread$320(j2, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$markDialogAsUnread$320(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void loadUnreadDialogs() {
        if (this.loadingUnreadDialogs || getUserConfig().unreadDialogsLoaded) {
            return;
        }
        this.loadingUnreadDialogs = true;
        getConnectionsManager().sendRequest(new TLObject() {
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
                abstractSerializedData.writeInt32(585256482);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadUnreadDialogs$322(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadUnreadDialogs$322(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadUnreadDialogs$321(tLObject);
            }
        });
    }

    public void lambda$loadUnreadDialogs$321(TLObject tLObject) {
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
                        if (tLRPC$Dialog.unread_count == 0 && !isDialogMuted(j, 0L)) {
                            this.unreadUnmutedDialogs++;
                        }
                    }
                }
            }
            getUserConfig().unreadDialogsLoaded = true;
            getUserConfig().saveConfig(false);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_READ_DIALOG_MESSAGE));
            this.loadingUnreadDialogs = false;
        }
    }

    public void reorderPinnedDialogs(int i, ArrayList<TLRPC$InputDialogPeer> arrayList, final long j) {
        NativeByteBuffer nativeByteBuffer;
        TLRPC$TL_messages_reorderPinnedDialogs tLRPC$TL_messages_reorderPinnedDialogs = new TLRPC$TL_messages_reorderPinnedDialogs();
        tLRPC$TL_messages_reorderPinnedDialogs.folder_id = i;
        tLRPC$TL_messages_reorderPinnedDialogs.force = true;
        if (j == 0) {
            ArrayList<TLRPC$Dialog> dialogs = getDialogs(i);
            if (dialogs.isEmpty()) {
                return;
            }
            ArrayList<Long> arrayList2 = new ArrayList<>();
            ArrayList<Integer> arrayList3 = new ArrayList<>();
            int size = dialogs.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC$Dialog tLRPC$Dialog = dialogs.get(i3);
                if (!(tLRPC$Dialog instanceof TLRPC$TL_dialogFolder)) {
                    if (!tLRPC$Dialog.pinned) {
                        if (tLRPC$Dialog.id != this.promoDialogId) {
                            break;
                        }
                    } else {
                        arrayList2.add(Long.valueOf(tLRPC$Dialog.id));
                        arrayList3.add(Integer.valueOf(tLRPC$Dialog.pinnedNum));
                        if (!DialogObject.isEncryptedDialog(tLRPC$Dialog.id)) {
                            TLRPC$InputPeer inputPeer = getInputPeer(tLRPC$Dialog.id);
                            TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
                            tLRPC$TL_inputDialogPeer.peer = inputPeer;
                            tLRPC$TL_messages_reorderPinnedDialogs.order.add(tLRPC$TL_inputDialogPeer);
                            i2 += tLRPC$TL_inputDialogPeer.getObjectSize();
                        }
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
                } catch (Exception e) {
                    e = e;
                    nativeByteBuffer2 = nativeByteBuffer;
                    FileLog.e(e);
                    nativeByteBuffer = nativeByteBuffer2;
                    j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_reorderPinnedDialogs, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$reorderPinnedDialogs$323(j, tLObject, tLRPC$TL_error);
                        }
                    });
                }
            } catch (Exception e2) {
                e = e2;
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        } else {
            tLRPC$TL_messages_reorderPinnedDialogs.order = arrayList;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_reorderPinnedDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$reorderPinnedDialogs$323(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$reorderPinnedDialogs$323(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public boolean pinDialog(long j, boolean z, TLRPC$InputPeer tLRPC$InputPeer, long j2) {
        NativeByteBuffer nativeByteBuffer;
        final long createPendingTask;
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
                    if (!tLRPC$Dialog2.pinned) {
                        if (tLRPC$Dialog2.id != this.promoDialogId) {
                            break;
                        }
                    } else {
                        i2 = Math.max(tLRPC$Dialog2.pinnedNum, i2);
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
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
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
                } catch (Exception e) {
                    e = e;
                }
                try {
                    nativeByteBuffer.writeInt32(4);
                    nativeByteBuffer.writeInt64(j);
                    nativeByteBuffer.writeBool(z);
                    inputPeer.serializeToStream(nativeByteBuffer);
                } catch (Exception e2) {
                    e = e2;
                    nativeByteBuffer2 = nativeByteBuffer;
                    FileLog.e(e);
                    nativeByteBuffer = nativeByteBuffer2;
                    createPendingTask = getMessagesStorage().createPendingTask(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_toggleDialogPin, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$pinDialog$324(createPendingTask, tLObject, tLRPC$TL_error);
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
                    MessagesController.this.lambda$pinDialog$324(createPendingTask, tLObject, tLRPC$TL_error);
                }
            });
        }
        getMessagesStorage().setDialogPinned(j, tLRPC$Dialog.pinnedNum);
        return true;
    }

    public void lambda$pinDialog$324(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void loadPinnedDialogs(final int i, long j, ArrayList<Long> arrayList) {
        if (this.loadingPinnedDialogs.indexOfKey(i) >= 0 || getUserConfig().isPinnedDialogsLoaded(i)) {
            return;
        }
        this.loadingPinnedDialogs.put(i, 1);
        TLRPC$TL_messages_getPinnedDialogs tLRPC$TL_messages_getPinnedDialogs = new TLRPC$TL_messages_getPinnedDialogs();
        tLRPC$TL_messages_getPinnedDialogs.folder_id = i;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getPinnedDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadPinnedDialogs$327(i, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadPinnedDialogs$327(final int r19, org.telegram.tgnet.TLObject r20, org.telegram.tgnet.TLRPC$TL_error r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$loadPinnedDialogs$327(int, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$loadPinnedDialogs$326(final int i, final ArrayList arrayList, final boolean z, final TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs, final LongSparseArray longSparseArray, final TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadPinnedDialogs$325(i, arrayList, z, tLRPC$TL_messages_peerDialogs, longSparseArray, tLRPC$TL_messages_dialogs);
            }
        });
    }

    public void lambda$loadPinnedDialogs$325(int i, ArrayList arrayList, boolean z, TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs, LongSparseArray longSparseArray, TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs) {
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList<Integer> arrayList2;
        ArrayList<MessageObject> arrayList3;
        this.loadingPinnedDialogs.delete(i);
        applyDialogsNotificationsSettings(arrayList);
        ArrayList<TLRPC$Dialog> dialogs = getDialogs(i);
        int i2 = z ? 1 : 0;
        int i3 = 0;
        int i4 = 0;
        boolean z5 = false;
        while (true) {
            z2 = true;
            if (i3 >= dialogs.size()) {
                break;
            }
            TLRPC$Dialog tLRPC$Dialog = dialogs.get(i3);
            if (!(tLRPC$Dialog instanceof TLRPC$TL_dialogFolder)) {
                if (DialogObject.isEncryptedDialog(tLRPC$Dialog.id)) {
                    if (i2 < arrayList.size()) {
                        arrayList.add(i2, tLRPC$Dialog);
                    } else {
                        arrayList.add(tLRPC$Dialog);
                    }
                    i2++;
                } else if (!tLRPC$Dialog.pinned) {
                    if (tLRPC$Dialog.id != this.promoDialogId) {
                        break;
                    }
                } else {
                    i4 = Math.max(tLRPC$Dialog.pinnedNum, i4);
                    tLRPC$Dialog.pinned = false;
                    tLRPC$Dialog.pinnedNum = 0;
                    i2++;
                    z5 = true;
                }
            }
            i3++;
        }
        ArrayList<Long> arrayList4 = new ArrayList<>();
        if (arrayList.isEmpty()) {
            z3 = false;
        } else {
            putUsers(tLRPC$TL_messages_peerDialogs.users, false);
            putChats(tLRPC$TL_messages_peerDialogs.chats, false);
            ArrayList<Long> arrayList5 = new ArrayList<>();
            ArrayList<Integer> arrayList6 = new ArrayList<>();
            int size = arrayList.size();
            int i5 = 0;
            z3 = false;
            while (i5 < size) {
                TLRPC$Dialog tLRPC$Dialog2 = (TLRPC$Dialog) arrayList.get(i5);
                tLRPC$Dialog2.pinnedNum = (size - i5) + i4;
                arrayList4.add(Long.valueOf(tLRPC$Dialog2.id));
                TLRPC$Dialog tLRPC$Dialog3 = this.dialogs_dict.get(tLRPC$Dialog2.id);
                if (tLRPC$Dialog3 != null) {
                    tLRPC$Dialog3.pinned = z2;
                    tLRPC$Dialog3.pinnedNum = tLRPC$Dialog2.pinnedNum;
                    arrayList5.add(Long.valueOf(tLRPC$Dialog2.id));
                    arrayList6.add(Integer.valueOf(tLRPC$Dialog2.pinnedNum));
                    arrayList2 = arrayList6;
                } else {
                    this.dialogs_dict.put(tLRPC$Dialog2.id, tLRPC$Dialog2);
                    ArrayList<MessageObject> arrayList7 = (ArrayList) longSparseArray.get(tLRPC$Dialog2.id);
                    arrayList2 = arrayList6;
                    this.dialogMessage.put(tLRPC$Dialog2.id, arrayList7);
                    if (arrayList7 != null) {
                        int i6 = 0;
                        while (i6 < arrayList7.size()) {
                            MessageObject messageObject = arrayList7.get(i6);
                            if (messageObject != null) {
                                arrayList3 = arrayList7;
                                if (messageObject.messageOwner.peer_id.channel_id == 0) {
                                    this.dialogMessagesByIds.put(messageObject.getId(), messageObject);
                                    this.dialogsLoadedTillDate = Math.min(this.dialogsLoadedTillDate, messageObject.messageOwner.date);
                                    long j = messageObject.messageOwner.random_id;
                                    if (j != 0) {
                                        this.dialogMessagesByRandomIds.put(j, messageObject);
                                    }
                                }
                            } else {
                                arrayList3 = arrayList7;
                            }
                            i6++;
                            arrayList7 = arrayList3;
                        }
                    }
                    getTranslateController().checkDialogMessage(tLRPC$Dialog2.id);
                    z3 = true;
                }
                i5++;
                arrayList6 = arrayList2;
                z5 = true;
                z2 = true;
            }
            getMessagesStorage().setDialogsPinned(arrayList5, arrayList6);
        }
        if (z5) {
            if (z3) {
                this.allDialogs.clear();
                int size2 = this.dialogs_dict.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    TLRPC$Dialog valueAt = this.dialogs_dict.valueAt(i7);
                    if (this.deletingDialogs.indexOfKey(valueAt.id) < 0) {
                        this.allDialogs.add(valueAt);
                    }
                }
            }
            sortDialogs(null);
            z4 = false;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        } else {
            z4 = false;
        }
        getMessagesStorage().unpinAllDialogsExceptNew(arrayList4, i);
        getMessagesStorage().putDialogs(tLRPC$TL_messages_dialogs, 1);
        getUserConfig().setPinnedDialogsLoaded(i, true);
        getUserConfig().saveConfig(z4);
    }

    public void generateJoinMessage(final long j, boolean z) {
        TLRPC$Chat chat = getChat(Long.valueOf(j));
        if (chat == null || !ChatObject.isChannel(j, this.currentAccount)) {
            return;
        }
        if ((!ChatObject.isNotInChat(chat) || z) && !chat.creator) {
            TLRPC$TL_messageService tLRPC$TL_messageService = new TLRPC$TL_messageService();
            tLRPC$TL_messageService.flags = LiteMode.FLAG_CHAT_BLUR;
            int newMessageId = getUserConfig().getNewMessageId();
            tLRPC$TL_messageService.id = newMessageId;
            tLRPC$TL_messageService.local_id = newMessageId;
            if ((chat instanceof TLRPC$TL_channel) && !z) {
                tLRPC$TL_messageService.date = chat.date;
            } else {
                tLRPC$TL_messageService.date = getConnectionsManager().getCurrentTime();
            }
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
                    MessagesController.this.lambda$generateJoinMessage$329(arrayList);
                }
            });
            getMessagesStorage().putMessages(arrayList2, true, true, false, 0, 0, 0L);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$generateJoinMessage$330(j, arrayList);
                }
            });
        }
    }

    public void lambda$generateJoinMessage$328(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$generateJoinMessage$329(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$generateJoinMessage$328(arrayList);
            }
        });
    }

    public void lambda$generateJoinMessage$330(long j, ArrayList arrayList) {
        updateInterfaceWithMessages(-j, arrayList, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void deleteMessagesByPush(final long j, final ArrayList<Integer> arrayList, final long j2) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteMessagesByPush$332(arrayList, j2, j);
            }
        });
    }

    public void lambda$deleteMessagesByPush$332(final ArrayList arrayList, final long j, long j2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteMessagesByPush$331(arrayList, j);
            }
        });
        getMessagesStorage().deletePushMessages(j2, arrayList);
        getMessagesStorage().updateDialogsWithDeletedMessages(j2, j, arrayList, getMessagesStorage().markMessagesAsDeleted(j2, arrayList, false, true, false), false);
    }

    public void lambda$deleteMessagesByPush$331(ArrayList arrayList, long j) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, Long.valueOf(j), Boolean.FALSE);
        if (j == 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                MessageObject messageObject = this.dialogMessagesByIds.get(((Integer) arrayList.get(i)).intValue());
                if (messageObject != null) {
                    messageObject.deleted = true;
                }
            }
            return;
        }
        ArrayList<MessageObject> arrayList2 = this.dialogMessage.get(-j);
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                MessageObject messageObject2 = arrayList2.get(i2);
                int size2 = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    } else if (messageObject2.getId() == ((Integer) arrayList.get(i3)).intValue()) {
                        messageObject2.deleted = true;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
    }

    public void checkChatInviter(final long j, final boolean z) {
        final TLRPC$Chat chat = getChat(Long.valueOf(j));
        if (!ChatObject.isChannel(chat) || chat.creator || this.gettingChatInviters.indexOfKey(j) >= 0) {
            return;
        }
        this.gettingChatInviters.put(j, Boolean.TRUE);
        TLRPC$TL_channels_getParticipant tLRPC$TL_channels_getParticipant = new TLRPC$TL_channels_getParticipant();
        tLRPC$TL_channels_getParticipant.channel = getInputChannel(j);
        tLRPC$TL_channels_getParticipant.participant = getInputPeer(getUserConfig().getClientUserId());
        getConnectionsManager().sendRequest(tLRPC$TL_channels_getParticipant, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$checkChatInviter$337(chat, z, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$checkChatInviter$337(TLRPC$Chat tLRPC$Chat, boolean z, final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        final ArrayList arrayList;
        final TLRPC$TL_channels_channelParticipant tLRPC$TL_channels_channelParticipant = (TLRPC$TL_channels_channelParticipant) tLObject;
        if (tLRPC$TL_channels_channelParticipant != null) {
            TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLRPC$TL_channels_channelParticipant.participant;
            if (tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantSelf) {
                TLRPC$TL_channelParticipantSelf tLRPC$TL_channelParticipantSelf = (TLRPC$TL_channelParticipantSelf) tLRPC$ChannelParticipant;
                if (tLRPC$Chat.megagroup && getMessagesStorage().isMigratedChat(tLRPC$Chat.id)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkChatInviter$333(tLRPC$TL_channels_channelParticipant);
                    }
                });
                getMessagesStorage().putUsersAndChats(tLRPC$TL_channels_channelParticipant.users, tLRPC$TL_channels_channelParticipant.chats, true, true);
                if (!z || Math.abs(getConnectionsManager().getCurrentTime() - tLRPC$TL_channels_channelParticipant.participant.date) >= 86400 || getMessagesStorage().hasInviteMeMessage(j)) {
                    arrayList = null;
                } else {
                    TLRPC$TL_messageService tLRPC$TL_messageService = new TLRPC$TL_messageService();
                    tLRPC$TL_messageService.flags = LiteMode.FLAG_CHAT_BLUR;
                    int newMessageId = getUserConfig().getNewMessageId();
                    tLRPC$TL_messageService.id = newMessageId;
                    tLRPC$TL_messageService.local_id = newMessageId;
                    tLRPC$TL_messageService.date = tLRPC$TL_channels_channelParticipant.participant.date;
                    TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                    tLRPC$TL_messageService.from_id = tLRPC$TL_peerUser;
                    tLRPC$TL_peerUser.user_id = tLRPC$TL_channels_channelParticipant.participant.inviter_id;
                    TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
                    tLRPC$TL_messageService.peer_id = tLRPC$TL_peerChannel;
                    tLRPC$TL_peerChannel.channel_id = j;
                    tLRPC$TL_messageService.media_unread = true;
                    tLRPC$TL_messageService.unread = true;
                    tLRPC$TL_messageService.post = true;
                    if (!tLRPC$TL_channelParticipantSelf.via_invite || tLRPC$TL_channelParticipantSelf.inviter_id != getUserConfig().getClientUserId()) {
                        tLRPC$TL_messageService.action = new TLRPC$TL_messageActionChatAddUser();
                    } else {
                        tLRPC$TL_messageService.action = new TLRPC$TL_messageActionChatJoinedByRequest();
                    }
                    tLRPC$TL_messageService.action.users.add(Long.valueOf(getUserConfig().getClientUserId()));
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
                            MessagesController.this.lambda$checkChatInviter$335(arrayList);
                        }
                    });
                    getMessagesStorage().putMessages(arrayList2, true, true, false, 0, 0, 0L);
                }
                final ArrayList arrayList3 = arrayList;
                getMessagesStorage().saveChatInviter(j, tLRPC$TL_channels_channelParticipant.participant.inviter_id);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkChatInviter$336(j, arrayList3, tLRPC$TL_channels_channelParticipant);
                    }
                });
            }
        }
    }

    public void lambda$checkChatInviter$333(TLRPC$TL_channels_channelParticipant tLRPC$TL_channels_channelParticipant) {
        putUsers(tLRPC$TL_channels_channelParticipant.users, false);
        putChats(tLRPC$TL_channels_channelParticipant.chats, false);
    }

    public void lambda$checkChatInviter$334(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$checkChatInviter$335(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkChatInviter$334(arrayList);
            }
        });
    }

    public void lambda$checkChatInviter$336(long j, ArrayList arrayList, TLRPC$TL_channels_channelParticipant tLRPC$TL_channels_channelParticipant) {
        this.gettingChatInviters.delete(j);
        if (arrayList != null) {
            updateInterfaceWithMessages(-j, arrayList, false);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadChatInviter, Long.valueOf(j), Long.valueOf(tLRPC$TL_channels_channelParticipant.participant.inviter_id));
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
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelPinnedTopic) {
            return ((TLRPC$TL_updateChannelPinnedTopic) tLRPC$Update).channel_id;
        }
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelPinnedTopics) {
            return ((TLRPC$TL_updateChannelPinnedTopics) tLRPC$Update).channel_id;
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
        if (tLRPC$Update instanceof TLRPC$TL_updateChannelViewForumAsMessages) {
            return ((TLRPC$TL_updateChannelViewForumAsMessages) tLRPC$Update).channel_id;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("trying to get unknown update channel_id for " + tLRPC$Update);
            return 0L;
        }
        return 0L;
    }

    public void processUpdates(final org.telegram.tgnet.TLRPC$Updates r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processUpdates(org.telegram.tgnet.TLRPC$Updates, boolean):void");
    }

    public void lambda$processUpdates$338(boolean z, long j, ArrayList arrayList) {
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_USER_PRINT));
        }
        updateInterfaceWithMessages(j, arrayList, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processUpdates$339(boolean z, TLRPC$Updates tLRPC$Updates, ArrayList arrayList) {
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_USER_PRINT));
        }
        updateInterfaceWithMessages(-tLRPC$Updates.chat_id, arrayList, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processUpdates$340(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$processUpdates$341(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdates$340(arrayList);
            }
        });
    }

    public void lambda$processUpdates$343() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_STATUS));
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
                        this.hasArchivedChats = true;
                        checkArchiveFolder();
                    }
                }
            }
            getMessagesStorage().setDialogsFolderId(arrayList.get(i).folder_peers, null, 0L, 0);
            i++;
            z = true;
        }
        return z;
    }

    public boolean processUpdateArray(java.util.ArrayList<org.telegram.tgnet.TLRPC$Update> r80, final java.util.ArrayList<org.telegram.tgnet.TLRPC$User> r81, final java.util.ArrayList<org.telegram.tgnet.TLRPC$Chat> r82, boolean r83, final int r84) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processUpdateArray(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean, int):boolean");
    }

    public void lambda$processUpdateArray$344(ArrayList arrayList, ArrayList arrayList2) {
        putUsers(arrayList, false);
        putChats(arrayList2, false);
    }

    public void lambda$processUpdateArray$345(ArrayList arrayList, ArrayList arrayList2) {
        putUsers(arrayList, false);
        putChats(arrayList2, false);
    }

    public void lambda$processUpdateArray$346(TLRPC$TL_updateUserTyping tLRPC$TL_updateUserTyping) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onEmojiInteractionsReceived, Long.valueOf(tLRPC$TL_updateUserTyping.user_id), tLRPC$TL_updateUserTyping.action);
    }

    public void lambda$processUpdateArray$347(TLRPC$TL_updateChatUserTyping tLRPC$TL_updateChatUserTyping) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onEmojiInteractionsReceived, Long.valueOf(-tLRPC$TL_updateChatUserTyping.chat_id), tLRPC$TL_updateChatUserTyping.action);
    }

    public void lambda$processUpdateArray$349(final TLRPC$TL_updatePeerBlocked tLRPC$TL_updatePeerBlocked) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdateArray$348(tLRPC$TL_updatePeerBlocked);
            }
        });
    }

    public void lambda$processUpdateArray$348(TLRPC$TL_updatePeerBlocked tLRPC$TL_updatePeerBlocked) {
        long peerId = MessageObject.getPeerId(tLRPC$TL_updatePeerBlocked.peer_id);
        if (tLRPC$TL_updatePeerBlocked.blocked) {
            if (this.blockePeers.indexOfKey(peerId) < 0) {
                this.blockePeers.put(peerId, 1);
            }
        } else {
            this.blockePeers.delete(peerId);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        getStoriesController().updateBlockUser(peerId, tLRPC$TL_updatePeerBlocked.blocked_my_stories_from, false);
    }

    public void lambda$processUpdateArray$350(TLRPC$TL_updateServiceNotification tLRPC$TL_updateServiceNotification) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 2, tLRPC$TL_updateServiceNotification.message, tLRPC$TL_updateServiceNotification.type);
    }

    public void lambda$processUpdateArray$351(TLRPC$Message tLRPC$Message) {
        getSendMessagesHelper().onMessageEdited(tLRPC$Message);
    }

    public void lambda$processUpdateArray$352(TLRPC$TL_updateLangPack tLRPC$TL_updateLangPack) {
        LocaleController.getInstance().saveRemoteLocaleStringsForCurrentLocale(tLRPC$TL_updateLangPack.difference, this.currentAccount);
    }

    public void lambda$processUpdateArray$353(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$processUpdateArray$354(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdateArray$353(arrayList);
            }
        });
    }

    public void lambda$processUpdateArray$356(final LongSparseArray longSparseArray) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdateArray$355(longSparseArray);
            }
        });
    }

    public void lambda$processUpdateArray$355(LongSparseArray longSparseArray) {
        getNotificationsController().processEditedMessages(longSparseArray);
        getTopicsController().processEditedMessages(longSparseArray);
    }

    public void lambda$processUpdateArray$357(TLRPC$User tLRPC$User) {
        getContactsController().addContactToPhoneBook(tLRPC$User, true);
    }

    public void lambda$processUpdateArray$358() {
        getNotificationsController().deleteNotificationChannelGlobal(0);
    }

    public void lambda$processUpdateArray$359() {
        getNotificationsController().deleteNotificationChannelGlobal(1);
    }

    public void lambda$processUpdateArray$360() {
        getNotificationsController().deleteNotificationChannelGlobal(2);
    }

    public void lambda$processUpdateArray$361(TLRPC$TL_updateChannel tLRPC$TL_updateChannel) {
        getChannelDifference(tLRPC$TL_updateChannel.channel_id, 1, 0L, null);
    }

    public void lambda$processUpdateArray$362(TLRPC$Chat tLRPC$Chat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRightsUpdated, tLRPC$Chat);
    }

    public void lambda$processUpdateArray$363(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void lambda$processUpdateArray$364(int r44, java.util.ArrayList r45, java.util.ArrayList r46, androidx.collection.LongSparseArray r47, int r48, org.telegram.messenger.support.LongSparseIntArray r49, androidx.collection.LongSparseArray r50, androidx.collection.LongSparseArray r51, java.util.ArrayList r52, androidx.collection.LongSparseArray r53, androidx.collection.LongSparseArray r54, boolean r55, java.util.ArrayList r56, java.util.ArrayList r57, androidx.collection.LongSparseArray r58, androidx.collection.LongSparseArray r59, androidx.collection.LongSparseArray r60, java.util.ArrayList r61) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processUpdateArray$364(int, java.util.ArrayList, java.util.ArrayList, androidx.collection.LongSparseArray, int, org.telegram.messenger.support.LongSparseIntArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, java.util.ArrayList, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean, java.util.ArrayList, java.util.ArrayList, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, java.util.ArrayList):void");
    }

    public void lambda$processUpdateArray$366(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2, final SparseIntArray sparseIntArray, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2, final LongSparseArray longSparseArray3, final LongSparseIntArray longSparseIntArray3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdateArray$365(longSparseIntArray, longSparseIntArray2, sparseIntArray, longSparseArray, longSparseArray2, longSparseArray3, longSparseIntArray3);
            }
        });
    }

    public void lambda$processUpdateArray$365(org.telegram.messenger.support.LongSparseIntArray r19, org.telegram.messenger.support.LongSparseIntArray r20, android.util.SparseIntArray r21, androidx.collection.LongSparseArray r22, androidx.collection.LongSparseArray r23, androidx.collection.LongSparseArray r24, org.telegram.messenger.support.LongSparseIntArray r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processUpdateArray$365(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, android.util.SparseIntArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    public void lambda$processUpdateArray$367(long j, ArrayList arrayList) {
        getMessagesStorage().updateDialogsWithDeletedMessages(j, -j, arrayList, getMessagesStorage().markMessagesAsDeleted(j, arrayList, false, true, false), false);
    }

    public void lambda$processUpdateArray$368(long j, int i) {
        getMessagesStorage().updateDialogsWithDeletedMessages(j, -j, new ArrayList<>(), getMessagesStorage().markMessagesAsDeleted(j, i, false, true), false);
    }

    public void checkUnreadReactions(final long j, final long j2, final SparseBooleanArray sparseBooleanArray) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkUnreadReactions$374(sparseBooleanArray, j2, j);
            }
        });
    }

    public void lambda$checkUnreadReactions$374(SparseBooleanArray sparseBooleanArray, final long j, final long j2) {
        int i;
        SQLiteCursor queryFinalized;
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
            if (j != 0) {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT message_id, state FROM reaction_mentions WHERE message_id IN (%s) AND dialog_id = %d", sb, Long.valueOf(j2)), new Object[0]);
            } else {
                queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT message_id, state FROM reaction_mentions_topics WHERE message_id IN (%s) AND dialog_id = %d AND topic_id = %d", sb, Long.valueOf(j2), Long.valueOf(j)), new Object[0]);
            }
            while (queryFinalized.next()) {
                sparseBooleanArray2.put(queryFinalized.intValue(0), queryFinalized.intValue(1) == 1);
            }
            queryFinalized.dispose();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        while (i4 < sparseBooleanArray.size()) {
            int keyAt2 = sparseBooleanArray.keyAt(i4);
            boolean valueAt = sparseBooleanArray.valueAt(i4);
            if (sparseBooleanArray2.indexOfKey(keyAt2) < 0) {
                i = i3;
                z = true;
            } else if (sparseBooleanArray2.get(keyAt2) != valueAt) {
                i = i3 + (valueAt ? 1 : -1);
                z2 = true;
            } else {
                i = i3;
            }
            if (valueAt) {
                arrayList.add(Integer.valueOf(keyAt2));
            }
            if (j == 0) {
                try {
                    try {
                        SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reaction_mentions VALUES(?, ?, ?)");
                        executeFast.requery();
                        executeFast.bindInteger(1, keyAt2);
                        executeFast.bindInteger(2, valueAt ? 1 : 0);
                        executeFast.bindLong(3, j2);
                        executeFast.step();
                        executeFast.dispose();
                    } catch (SQLiteException e2) {
                        e = e2;
                        e.printStackTrace();
                        i4++;
                        i3 = i;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                }
            } else {
                SQLitePreparedStatement executeFast2 = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reaction_mentions_topics VALUES(?, ?, ?, ?)");
                executeFast2.requery();
                executeFast2.bindInteger(1, keyAt2);
                try {
                    executeFast2.bindInteger(2, valueAt ? 1 : 0);
                    executeFast2.bindLong(3, j2);
                    executeFast2.bindLong(4, j);
                    executeFast2.step();
                    executeFast2.dispose();
                } catch (SQLiteException e4) {
                    e = e4;
                    e.printStackTrace();
                    i4++;
                    i3 = i;
                }
            }
            i4++;
            i3 = i;
        }
        if (!z) {
            if (z2) {
                final int i5 = i3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkUnreadReactions$373(j, j2, i5);
                    }
                });
            }
        } else if (j == 0) {
            TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs = new TLRPC$TL_messages_getPeerDialogs();
            TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
            tLRPC$TL_inputDialogPeer.peer = getInputPeer(j2);
            tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkUnreadReactions$370(j2, j, arrayList, tLObject, tLRPC$TL_error);
                }
            });
        } else {
            TLRPC$TL_channels_getForumTopicsByID tLRPC$TL_channels_getForumTopicsByID = new TLRPC$TL_channels_getForumTopicsByID();
            tLRPC$TL_channels_getForumTopicsByID.topics.add(Integer.valueOf((int) j));
            tLRPC$TL_channels_getForumTopicsByID.channel = getMessagesController().getInputChannel(-j2);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_getForumTopicsByID, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkUnreadReactions$372(j2, j, arrayList, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$checkUnreadReactions$370(final long j, final long j2, final ArrayList arrayList, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            final int i = tLRPC$TL_messages_peerDialogs.dialogs.size() == 0 ? 0 : tLRPC$TL_messages_peerDialogs.dialogs.get(0).unread_reactions_count;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkUnreadReactions$369(j, i, j2, arrayList);
                }
            });
        }
    }

    public void lambda$checkUnreadReactions$369(long j, int i, long j2, ArrayList arrayList) {
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog == null) {
            getMessagesStorage().updateDialogUnreadReactions(j, 0L, i, false);
            return;
        }
        tLRPC$Dialog.unread_reactions_count = i;
        getMessagesStorage().updateUnreadReactionsCount(j, j2, i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadReactionsCounterChanged, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), arrayList);
    }

    public void lambda$checkUnreadReactions$372(final long j, final long j2, final ArrayList arrayList, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_forumTopics tLRPC$TL_messages_forumTopics = (TLRPC$TL_messages_forumTopics) tLObject;
            final int i = tLRPC$TL_messages_forumTopics.topics.size() == 0 ? 0 : tLRPC$TL_messages_forumTopics.topics.get(0).unread_reactions_count;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkUnreadReactions$371(j, j2, i, arrayList);
                }
            });
        }
    }

    public void lambda$checkUnreadReactions$371(long j, long j2, int i, ArrayList arrayList) {
        getMessagesController().getTopicsController().updateReactionsUnread(j, j2, i, false);
        getMessagesStorage().updateUnreadReactionsCount(j, j2, i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadReactionsCounterChanged, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), arrayList);
    }

    public void lambda$checkUnreadReactions$373(long j, long j2, int i) {
        if (j == 0) {
            TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j2);
            if (tLRPC$Dialog == null) {
                getMessagesStorage().updateDialogUnreadReactions(j2, 0L, i, true);
                return;
            }
            int i2 = tLRPC$Dialog.unread_reactions_count + i;
            tLRPC$Dialog.unread_reactions_count = i2;
            if (i2 < 0) {
                tLRPC$Dialog.unread_reactions_count = 0;
            }
            getMessagesStorage().updateUnreadReactionsCount(j2, 0L, tLRPC$Dialog.unread_reactions_count);
            return;
        }
        int updateReactionsUnread = getMessagesController().getTopicsController().updateReactionsUnread(j2, j, i, true);
        if (updateReactionsUnread >= 0) {
            getMessagesStorage().updateUnreadReactionsCount(j2, j, updateReactionsUnread, true);
        }
    }

    public boolean isDialogMuted(long j, long j2) {
        return isDialogMuted(j, j2, null);
    }

    public boolean isDialogNotificationsSoundEnabled(long j, long j2) {
        SharedPreferences sharedPreferences = this.notificationsPreferences;
        return sharedPreferences.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(j, j2), true);
    }

    public boolean isDialogMuted(long j, long j2, TLRPC$Chat tLRPC$Chat) {
        Boolean bool;
        SharedPreferences sharedPreferences = this.notificationsPreferences;
        int i = sharedPreferences.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + NotificationsController.getSharedPrefKey(j, j2), -1);
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
            if (j2 != 0) {
                return isDialogMuted(j, 0L, tLRPC$Chat);
            }
            return !getNotificationsController().isGlobalNotificationsEnabled(j, bool);
        } else if (i == 2) {
            return true;
        } else {
            if (i == 3) {
                SharedPreferences sharedPreferences2 = this.notificationsPreferences;
                if (sharedPreferences2.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + NotificationsController.getSharedPrefKey(j, j2), 0) >= getConnectionsManager().getCurrentTime()) {
                    return true;
                }
            }
            return false;
        }
    }

    public void markReactionsAsRead(long j, long j2) {
        if (j2 == 0) {
            TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
            if (tLRPC$Dialog != null) {
                tLRPC$Dialog.unread_reactions_count = 0;
            }
        } else {
            this.topicsController.markAllReactionsAsRead(-j, j2);
        }
        getMessagesStorage().updateUnreadReactionsCount(j, j2, 0);
        TLRPC$TL_messages_readReactions tLRPC$TL_messages_readReactions = new TLRPC$TL_messages_readReactions();
        tLRPC$TL_messages_readReactions.peer = getInputPeer(j);
        if (j2 != 0) {
            tLRPC$TL_messages_readReactions.top_msg_id = (int) j2;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_readReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$markReactionsAsRead$375(tLObject, tLRPC$TL_error);
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_REACTIONS_READ));
    }

    public SponsoredMessagesInfo getSponsoredMessages(final long j) {
        SponsoredMessagesInfo sponsoredMessagesInfo = this.sponsoredMessages.get(j);
        if (sponsoredMessagesInfo == null || (!sponsoredMessagesInfo.loading && Math.abs(SystemClock.elapsedRealtime() - sponsoredMessagesInfo.loadTime) > 300000)) {
            TLRPC$Chat chat = getChat(Long.valueOf(-j));
            if (ChatObject.isChannel(chat)) {
                final SponsoredMessagesInfo sponsoredMessagesInfo2 = new SponsoredMessagesInfo();
                sponsoredMessagesInfo2.loading = true;
                this.sponsoredMessages.put(j, sponsoredMessagesInfo2);
                TLRPC$TL_channels_getSponsoredMessages tLRPC$TL_channels_getSponsoredMessages = new TLRPC$TL_channels_getSponsoredMessages();
                tLRPC$TL_channels_getSponsoredMessages.channel = getInputChannel(chat);
                getConnectionsManager().sendRequest(tLRPC$TL_channels_getSponsoredMessages, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$getSponsoredMessages$378(j, sponsoredMessagesInfo2, tLObject, tLRPC$TL_error);
                    }
                });
                return null;
            }
            return null;
        }
        return sponsoredMessagesInfo;
    }

    public void lambda$getSponsoredMessages$378(final long j, final SponsoredMessagesInfo sponsoredMessagesInfo, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        final ?? r6;
        ArrayList arrayList;
        final ArrayList arrayList2 = null;
        if (tLObject instanceof TLRPC$messages_SponsoredMessages) {
            final TLRPC$messages_SponsoredMessages tLRPC$messages_SponsoredMessages = (TLRPC$messages_SponsoredMessages) tLObject;
            if (tLRPC$messages_SponsoredMessages.messages.isEmpty()) {
                arrayList = null;
            } else {
                if ((tLRPC$messages_SponsoredMessages instanceof TLRPC$TL_messages_sponsoredMessages) && (tLRPC$messages_SponsoredMessages.flags & 1) > 0) {
                    arrayList2 = Integer.valueOf(tLRPC$messages_SponsoredMessages.posts_between);
                }
                ArrayList arrayList3 = new ArrayList();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getSponsoredMessages$376(tLRPC$messages_SponsoredMessages);
                    }
                });
                LongSparseArray longSparseArray = new LongSparseArray();
                LongSparseArray longSparseArray2 = new LongSparseArray();
                int i = 0;
                for (int i2 = 0; i2 < tLRPC$messages_SponsoredMessages.users.size(); i2++) {
                    TLRPC$User tLRPC$User = tLRPC$messages_SponsoredMessages.users.get(i2);
                    longSparseArray.put(tLRPC$User.id, tLRPC$User);
                }
                for (int i3 = 0; i3 < tLRPC$messages_SponsoredMessages.chats.size(); i3++) {
                    TLRPC$Chat tLRPC$Chat = tLRPC$messages_SponsoredMessages.chats.get(i3);
                    longSparseArray2.put(tLRPC$Chat.id, tLRPC$Chat);
                }
                int i4 = -10000000;
                int size = tLRPC$messages_SponsoredMessages.messages.size();
                while (i < size) {
                    TLRPC$TL_sponsoredMessage tLRPC$TL_sponsoredMessage = tLRPC$messages_SponsoredMessages.messages.get(i);
                    TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
                    tLRPC$TL_message.message = tLRPC$TL_sponsoredMessage.message;
                    if (!tLRPC$TL_sponsoredMessage.entities.isEmpty()) {
                        tLRPC$TL_message.entities = tLRPC$TL_sponsoredMessage.entities;
                        tLRPC$TL_message.flags |= 128;
                    }
                    tLRPC$TL_message.peer_id = getPeer(j);
                    tLRPC$TL_message.from_id = tLRPC$TL_sponsoredMessage.from_id;
                    tLRPC$TL_message.flags |= LiteMode.FLAG_CHAT_BLUR;
                    tLRPC$TL_message.date = getConnectionsManager().getCurrentTime();
                    int i5 = i4 - 1;
                    tLRPC$TL_message.id = i4;
                    MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC$Message) tLRPC$TL_message, (LongSparseArray<TLRPC$User>) longSparseArray, (LongSparseArray<TLRPC$Chat>) longSparseArray2, true, true);
                    messageObject.sponsoredId = tLRPC$TL_sponsoredMessage.random_id;
                    messageObject.botStartParam = tLRPC$TL_sponsoredMessage.start_param;
                    messageObject.sponsoredChannelPost = tLRPC$TL_sponsoredMessage.channel_post;
                    messageObject.sponsoredChatInvite = tLRPC$TL_sponsoredMessage.chat_invite;
                    messageObject.sponsoredChatInviteHash = tLRPC$TL_sponsoredMessage.chat_invite_hash;
                    messageObject.sponsoredRecommended = tLRPC$TL_sponsoredMessage.recommended;
                    messageObject.sponsoredShowPeerPhoto = tLRPC$TL_sponsoredMessage.show_peer_photo;
                    messageObject.sponsoredInfo = tLRPC$TL_sponsoredMessage.sponsor_info;
                    messageObject.sponsoredAdditionalInfo = tLRPC$TL_sponsoredMessage.additional_info;
                    messageObject.sponsoredWebPage = tLRPC$TL_sponsoredMessage.webpage;
                    messageObject.sponsoredBotApp = tLRPC$TL_sponsoredMessage.app;
                    messageObject.sponsoredButtonText = tLRPC$TL_sponsoredMessage.button_text;
                    arrayList3.add(messageObject);
                    i++;
                    tLRPC$messages_SponsoredMessages = tLRPC$messages_SponsoredMessages;
                    i4 = i5;
                }
                arrayList = arrayList2;
                arrayList2 = arrayList3;
            }
            r6 = arrayList;
        } else {
            r6 = 0;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getSponsoredMessages$377(arrayList2, j, sponsoredMessagesInfo, r6);
            }
        });
    }

    public void lambda$getSponsoredMessages$376(TLRPC$messages_SponsoredMessages tLRPC$messages_SponsoredMessages) {
        putUsers(tLRPC$messages_SponsoredMessages.users, false);
        putChats(tLRPC$messages_SponsoredMessages.chats, false);
    }

    public void lambda$getSponsoredMessages$377(ArrayList arrayList, long j, SponsoredMessagesInfo sponsoredMessagesInfo, Integer num) {
        if (arrayList == null) {
            this.sponsoredMessages.remove(j);
            return;
        }
        sponsoredMessagesInfo.loadTime = SystemClock.elapsedRealtime();
        sponsoredMessagesInfo.messages = arrayList;
        sponsoredMessagesInfo.posts_between = num;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadSponsoredMessages, Long.valueOf(j), arrayList);
    }

    public void clearSendAsPeers() {
        this.sendAsPeers.clear();
    }

    public TLRPC$TL_channels_sendAsPeers getSendAsPeers(final long j) {
        SendAsPeersInfo sendAsPeersInfo = this.sendAsPeers.get(j);
        if (sendAsPeersInfo != null && (sendAsPeersInfo.loading || Math.abs(SystemClock.elapsedRealtime() - sendAsPeersInfo.loadTime) <= 300000)) {
            return sendAsPeersInfo.sendAsPeers;
        }
        TLRPC$Chat chat = getChat(Long.valueOf(-j));
        if (chat != null && ChatObject.canSendAsPeers(chat)) {
            final SendAsPeersInfo sendAsPeersInfo2 = new SendAsPeersInfo(this, null);
            sendAsPeersInfo2.loading = true;
            this.sendAsPeers.put(j, sendAsPeersInfo2);
            TLRPC$TL_channels_getSendAs tLRPC$TL_channels_getSendAs = new TLRPC$TL_channels_getSendAs();
            tLRPC$TL_channels_getSendAs.peer = getInputPeer(j);
            getConnectionsManager().sendRequest(tLRPC$TL_channels_getSendAs, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$getSendAsPeers$381(j, sendAsPeersInfo2, tLObject, tLRPC$TL_error);
                }
            });
        }
        return null;
    }

    public void lambda$getSendAsPeers$381(final long j, final SendAsPeersInfo sendAsPeersInfo, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers = null;
        if (tLObject != null) {
            final TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers2 = (TLRPC$TL_channels_sendAsPeers) tLObject;
            if (!tLRPC$TL_channels_sendAsPeers2.peers.isEmpty()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getSendAsPeers$379(tLRPC$TL_channels_sendAsPeers2);
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
                MessagesController.this.lambda$getSendAsPeers$380(tLRPC$TL_channels_sendAsPeers3, j, sendAsPeersInfo);
            }
        });
    }

    public void lambda$getSendAsPeers$379(TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers) {
        putUsers(tLRPC$TL_channels_sendAsPeers.users, false);
        putChats(tLRPC$TL_channels_sendAsPeers.chats, false);
    }

    public void lambda$getSendAsPeers$380(TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers, long j, SendAsPeersInfo sendAsPeersInfo) {
        if (tLRPC$TL_channels_sendAsPeers != null) {
            sendAsPeersInfo.loadTime = SystemClock.elapsedRealtime();
            sendAsPeersInfo.sendAsPeers = tLRPC$TL_channels_sendAsPeers;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadSendAsPeers, Long.valueOf(j), tLRPC$TL_channels_sendAsPeers);
            return;
        }
        this.sendAsPeers.remove(j);
    }

    public TLRPC$Peer getSendAsSelectedPeer(long j) {
        TLRPC$Peer tLRPC$Peer;
        TLRPC$ChatFull chatFull = getChatFull(-j);
        if (chatFull == null || (tLRPC$Peer = chatFull.default_send_as) == null) {
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            tLRPC$TL_peerUser.user_id = getAccountInstance().getUserConfig().clientUserId;
            return tLRPC$TL_peerUser;
        }
        return tLRPC$Peer;
    }

    public CharSequence getPrintingString(long j, long j2, boolean z) {
        LongSparseArray<CharSequence> longSparseArray;
        TLRPC$User user;
        TLRPC$UserStatus tLRPC$UserStatus;
        if ((!z || !DialogObject.isUserDialog(j) || (user = getUser(Long.valueOf(j))) == null || (tLRPC$UserStatus = user.status) == null || tLRPC$UserStatus.expires >= 0) && (longSparseArray = this.printingStrings.get(j)) != null) {
            return longSparseArray.get(j2);
        }
        return null;
    }

    public Integer getPrintingStringType(long j, long j2) {
        LongSparseArray<Integer> longSparseArray = this.printingStringsTypes.get(j);
        if (longSparseArray == null) {
            return null;
        }
        return longSparseArray.get(j2);
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

    public boolean updateInterfaceWithMessages(final long r23, java.util.ArrayList<org.telegram.messenger.MessageObject> r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.updateInterfaceWithMessages(long, java.util.ArrayList, boolean):boolean");
    }

    public void lambda$updateInterfaceWithMessages$382(TLRPC$Dialog tLRPC$Dialog, int i, long j, int i2) {
        if (i2 == -1) {
            if (i <= 0 || DialogObject.isEncryptedDialog(j)) {
                return;
            }
            loadUnknownDialog(getInputPeer(j), 0L);
        } else if (i2 != 0) {
            tLRPC$Dialog.folder_id = i2;
            sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
        }
    }

    public TLRPC$Dialog getDialog(long j) {
        return this.dialogs_dict.get(j);
    }

    public void addDialogAction(long j, boolean z) {
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog == null) {
            return;
        }
        if (z) {
            this.clearingHistoryDialogs.put(j, tLRPC$Dialog);
        } else {
            this.deletingDialogs.put(j, tLRPC$Dialog);
            this.allDialogs.remove(tLRPC$Dialog);
            sortDialogs(null);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public void removeDialogAction(long j, boolean z, boolean z2) {
        TLRPC$Dialog tLRPC$Dialog = this.dialogs_dict.get(j);
        if (tLRPC$Dialog == null) {
            return;
        }
        if (z) {
            this.clearingHistoryDialogs.remove(j);
        } else {
            this.deletingDialogs.remove(j);
            if (!z2) {
                this.allDialogs.add(tLRPC$Dialog);
                sortDialogs(null);
            }
        }
        if (z2) {
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public boolean isClearingDialog(long j) {
        return this.clearingHistoryDialogs.get(j) != null;
    }

    public void updateFilterDialogs(DialogFilter dialogFilter) {
        TLRPC$EncryptedChat encryptedChat;
        if (dialogFilter == null) {
            return;
        }
        ArrayList<TLRPC$Dialog> arrayList = dialogFilter.dialogs;
        ArrayList<TLRPC$Dialog> arrayList2 = dialogFilter.dialogsForward;
        arrayList.clear();
        arrayList2.clear();
        this.sortingDialogFilter = dialogFilter;
        try {
            Collections.sort(this.allDialogs, this.dialogDateComparator);
        } catch (Exception e) {
            FileLog.e(e);
        }
        int size = this.allDialogs.size();
        for (int i = 0; i < size; i++) {
            TLRPC$Dialog tLRPC$Dialog = this.allDialogs.get(i);
            if (tLRPC$Dialog instanceof TLRPC$TL_dialog) {
                long j = tLRPC$Dialog.id;
                if (DialogObject.isEncryptedDialog(j) && (encryptedChat = getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)))) != null) {
                    j = encryptedChat.user_id;
                }
                if (dialogFilter.includesDialog(getAccountInstance(), j, tLRPC$Dialog)) {
                    if (canAddToForward(tLRPC$Dialog)) {
                        arrayList2.add(tLRPC$Dialog);
                    }
                    arrayList.add(tLRPC$Dialog);
                }
            }
        }
        try {
            Collections.sort(this.allDialogs, this.dialogComparator);
        } catch (Exception unused) {
        }
    }

    public boolean canAddToForward(TLRPC$Dialog tLRPC$Dialog) {
        boolean z = false;
        if (tLRPC$Dialog == null) {
            return false;
        }
        if (!DialogObject.isEncryptedDialog(tLRPC$Dialog.id) && DialogObject.isChannel(tLRPC$Dialog)) {
            TLRPC$Chat chat = getChat(Long.valueOf(-tLRPC$Dialog.id));
            if (chat == null || !chat.megagroup ? !(!ChatObject.hasAdminRights(chat) || !ChatObject.canPost(chat)) : !(chat.gigagroup && !ChatObject.hasAdminRights(chat))) {
                z = true;
            }
            return z;
        }
        return true;
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
        } else if (i == -2) {
            if (arrayList.isEmpty() || !(arrayList.get(0) instanceof TLRPC$TL_dialogFolder)) {
                arrayList.add(0, tLRPC$Dialog);
            } else {
                arrayList.add(1, tLRPC$Dialog);
            }
        } else {
            arrayList.add(i, tLRPC$Dialog);
        }
    }

    public static String getRestrictionReason(ArrayList<TLRPC$TL_restrictionReason> arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$TL_restrictionReason tLRPC$TL_restrictionReason = arrayList.get(i);
            if ("all".equals(tLRPC$TL_restrictionReason.platform) || !(ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || !"android".equals(tLRPC$TL_restrictionReason.platform))) {
                return tLRPC$TL_restrictionReason.text;
            }
        }
        return null;
    }

    public static void showCantOpenAlert(BaseFragment baseFragment, String str) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        builder.setTitle(LocaleController.getString(R.string.DialogNotAvailable));
        HashMap hashMap = new HashMap();
        int i = Theme.key_dialogTopBackground;
        hashMap.put("info1.**", Integer.valueOf(baseFragment.getThemedColor(i)));
        hashMap.put("info2.**", Integer.valueOf(baseFragment.getThemedColor(i)));
        builder.setTopAnimation(R.raw.not_available, 52, false, baseFragment.getThemedColor(i), hashMap);
        builder.setTopAnimationIsNew(true);
        builder.setPositiveButton(LocaleController.getString(R.string.Close), null);
        builder.setMessage(str);
        baseFragment.showDialog(builder.create());
    }

    public boolean checkCanOpenChat(Bundle bundle, BaseFragment baseFragment) {
        return checkCanOpenChat(bundle, baseFragment, null);
    }

    public boolean checkCanOpenChat(final Bundle bundle, final BaseFragment baseFragment, MessageObject messageObject) {
        TLRPC$Chat chat;
        String restrictionReason;
        TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages;
        if (bundle != null && baseFragment != null) {
            long j = bundle.getLong("user_id", 0L);
            long j2 = bundle.getLong("chat_id", 0L);
            int i = bundle.getInt("message_id", 0);
            TLRPC$User tLRPC$User = null;
            if (j != 0) {
                tLRPC$User = getUser(Long.valueOf(j));
                chat = null;
            } else {
                chat = j2 != 0 ? getChat(Long.valueOf(j2)) : null;
            }
            if (tLRPC$User == null && chat == null) {
                return true;
            }
            if (chat != null) {
                restrictionReason = getRestrictionReason(chat.restriction_reason);
            } else {
                restrictionReason = getRestrictionReason(tLRPC$User.restriction_reason);
            }
            if (restrictionReason != null) {
                showCantOpenAlert(baseFragment, restrictionReason);
                return false;
            } else if (i != 0 && messageObject != null && chat != null && chat.access_hash == 0) {
                long dialogId = messageObject.getDialogId();
                if (!DialogObject.isEncryptedDialog(dialogId)) {
                    final AlertDialog alertDialog = new AlertDialog(baseFragment.getParentActivity(), 3);
                    if (dialogId < 0) {
                        chat = getChat(Long.valueOf(-dialogId));
                    }
                    if (dialogId > 0 || !ChatObject.isChannel(chat)) {
                        TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages2 = new TLRPC$TL_messages_getMessages();
                        tLRPC$TL_messages_getMessages2.id.add(Integer.valueOf(messageObject.getId()));
                        tLRPC$TL_messages_getMessages = tLRPC$TL_messages_getMessages2;
                    } else {
                        TLRPC$Chat chat2 = getChat(Long.valueOf(-dialogId));
                        TLRPC$TL_channels_getMessages tLRPC$TL_channels_getMessages = new TLRPC$TL_channels_getMessages();
                        tLRPC$TL_channels_getMessages.channel = getInputChannel(chat2);
                        tLRPC$TL_channels_getMessages.id.add(Integer.valueOf(messageObject.getId()));
                        tLRPC$TL_messages_getMessages = tLRPC$TL_channels_getMessages;
                    }
                    final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$checkCanOpenChat$384(alertDialog, baseFragment, bundle, tLObject, tLRPC$TL_error);
                        }
                    });
                    alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            MessagesController.this.lambda$checkCanOpenChat$385(sendRequest, baseFragment, dialogInterface);
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

    public void lambda$checkCanOpenChat$384(final AlertDialog alertDialog, final BaseFragment baseFragment, final Bundle bundle, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkCanOpenChat$383(alertDialog, tLObject, baseFragment, bundle);
                }
            });
        }
    }

    public void lambda$checkCanOpenChat$383(AlertDialog alertDialog, TLObject tLObject, BaseFragment baseFragment, Bundle bundle) {
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

    public void lambda$checkCanOpenChat$385(int i, BaseFragment baseFragment, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
        baseFragment.setVisibleDialog(null);
    }

    public static void openChatOrProfileWith(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, BaseFragment baseFragment, int i, boolean z) {
        String restrictionReason;
        if ((tLRPC$User == null && tLRPC$Chat == null) || baseFragment == null) {
            return;
        }
        if (tLRPC$Chat != null) {
            restrictionReason = getRestrictionReason(tLRPC$Chat.restriction_reason);
        } else {
            restrictionReason = getRestrictionReason(tLRPC$User.restriction_reason);
            if (i != 3 && tLRPC$User.bot) {
                StoryViewer storyViewer = LaunchActivity.getLastFragment().storyViewer;
                if (storyViewer == null || !storyViewer.isShown()) {
                    i = 1;
                    z = true;
                } else {
                    i = 1;
                }
            }
        }
        if (restrictionReason != null) {
            showCantOpenAlert(baseFragment, restrictionReason);
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
            if (ChatObject.isForum(tLRPC$Chat)) {
                baseFragment.presentFragment(TopicsFragment.getTopicsOrChat(baseFragment, bundle), true, true);
            } else {
                baseFragment.presentFragment(new ChatActivity(bundle), true, true);
            }
        } else if (ChatObject.isForum(tLRPC$Chat)) {
            baseFragment.presentFragment(TopicsFragment.getTopicsOrChat(baseFragment, bundle), z);
        } else {
            baseFragment.presentFragment(new ChatActivity(bundle), z);
        }
    }

    public void openByUserName(String str, BaseFragment baseFragment, int i) {
        openByUserName(str, baseFragment, i, null);
    }

    public void openByUserName(String str, final BaseFragment baseFragment, final int i, final Browser.Progress progress) {
        TLRPC$Chat tLRPC$Chat;
        TLRPC$User tLRPC$User;
        if (str == null || baseFragment == null) {
            return;
        }
        TLObject userOrChat = getUserOrChat(str);
        if (userOrChat instanceof TLRPC$User) {
            tLRPC$User = (TLRPC$User) userOrChat;
            if (!tLRPC$User.min) {
                tLRPC$Chat = null;
            }
            tLRPC$User = null;
            tLRPC$Chat = null;
        } else {
            if (userOrChat instanceof TLRPC$Chat) {
                TLRPC$Chat tLRPC$Chat2 = (TLRPC$Chat) userOrChat;
                if (!tLRPC$Chat2.min) {
                    tLRPC$Chat = tLRPC$Chat2;
                    tLRPC$User = null;
                }
            }
            tLRPC$User = null;
            tLRPC$Chat = null;
        }
        if (tLRPC$User != null) {
            openChatOrProfileWith(tLRPC$User, null, baseFragment, i, false);
        } else if (tLRPC$Chat != null) {
            openChatOrProfileWith(null, tLRPC$Chat, baseFragment, 1, false);
        } else if (baseFragment.getParentActivity() == null) {
        } else {
            final AlertDialog[] alertDialogArr = {new AlertDialog(baseFragment.getParentActivity(), 3)};
            final boolean[] zArr = {false};
            getMessagesController().getUserNameResolver().resolve(str, new com.google.android.exoplayer2.util.Consumer() {
                @Override
                public final void accept(Object obj) {
                    MessagesController.this.lambda$openByUserName$386(progress, alertDialogArr, baseFragment, zArr, i, (Long) obj);
                }
            });
            if (progress != null) {
                progress.onCancel(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.lambda$openByUserName$387(zArr);
                    }
                });
                progress.init();
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$openByUserName$389(alertDialogArr, zArr, baseFragment);
                }
            }, 500L);
        }
    }

    public void lambda$openByUserName$386(Browser.Progress progress, AlertDialog[] alertDialogArr, BaseFragment baseFragment, boolean[] zArr, int i, Long l) {
        try {
            if (progress != null) {
                progress.end();
            } else {
                alertDialogArr[0].dismiss();
            }
        } catch (Exception unused) {
        }
        alertDialogArr[0] = null;
        baseFragment.setVisibleDialog(null);
        if (zArr[0]) {
            return;
        }
        if (l != null) {
            if (l.longValue() < 0) {
                openChatOrProfileWith(null, getChat(Long.valueOf(-l.longValue())), baseFragment, 1, false);
            } else {
                openChatOrProfileWith(getUser(l), null, baseFragment, i, false);
            }
        } else if (baseFragment.getParentActivity() != null) {
            try {
                if (baseFragment instanceof ChatActivity) {
                    ((ChatActivity) baseFragment).shakeContent();
                }
                BulletinFactory.of(baseFragment).createErrorBulletin(LocaleController.getString("NoUsernameFound", R.string.NoUsernameFound)).show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void lambda$openByUserName$387(boolean[] zArr) {
        zArr[0] = true;
    }

    public static void lambda$openByUserName$389(AlertDialog[] alertDialogArr, final boolean[] zArr, BaseFragment baseFragment) {
        if (alertDialogArr[0] == null) {
            return;
        }
        alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                MessagesController.lambda$openByUserName$388(zArr, dialogInterface);
            }
        });
        baseFragment.showDialog(alertDialogArr[0]);
    }

    public static void lambda$openByUserName$388(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
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
        if (j2 != 0 && getMessagesController().getChat(Long.valueOf(j2)) == null) {
            final MessagesStorage messagesStorage = getMessagesStorage();
            final int i3 = i2;
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$ensureMessagesLoaded$391(messagesStorage, j2, j, i3, messagesLoadedCallback);
                }
            });
            return;
        }
        int i4 = AndroidUtilities.isTablet() ? 30 : 20;
        final int i5 = i4;
        final int i6 = i2;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = new NotificationCenter.NotificationCenterDelegate() {
            {
                MessagesController.this = this;
            }

            @Override
            public void didReceivedNotification(int i7, int i8, Object... objArr) {
                int i9 = NotificationCenter.messagesDidLoadWithoutProcess;
                if (i7 == i9 && ((Integer) objArr[0]).intValue() == generateClassGuid) {
                    int intValue = ((Integer) objArr[1]).intValue();
                    boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                    boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
                    int intValue2 = ((Integer) objArr[4]).intValue();
                    int i10 = i5;
                    if (intValue < i10 / 2 && !booleanValue2 && booleanValue) {
                        int i11 = i6;
                        if (i11 != 0) {
                            MessagesController.this.loadMessagesInternal(j, 0L, false, i10, i11, 0, false, 0, generateClassGuid, 3, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                            return;
                        } else {
                            MessagesController.this.loadMessagesInternal(j, 0L, false, i10, i11, 0, false, 0, generateClassGuid, 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                            return;
                        }
                    }
                    MessagesController.this.getNotificationCenter().removeObserver(this, i9);
                    MessagesController.this.getNotificationCenter().removeObserver(this, NotificationCenter.loadingMessagesFailed);
                    MessagesLoadedCallback messagesLoadedCallback2 = messagesLoadedCallback;
                    if (messagesLoadedCallback2 != null) {
                        messagesLoadedCallback2.onMessagesLoaded(booleanValue);
                        return;
                    }
                    return;
                }
                int i12 = NotificationCenter.loadingMessagesFailed;
                if (i7 == i12 && ((Integer) objArr[0]).intValue() == generateClassGuid) {
                    MessagesController.this.getNotificationCenter().removeObserver(this, i9);
                    MessagesController.this.getNotificationCenter().removeObserver(this, i12);
                    MessagesLoadedCallback messagesLoadedCallback3 = messagesLoadedCallback;
                    if (messagesLoadedCallback3 != null) {
                        messagesLoadedCallback3.onError();
                    }
                }
            }
        };
        getNotificationCenter().addObserver(notificationCenterDelegate, NotificationCenter.messagesDidLoadWithoutProcess);
        getNotificationCenter().addObserver(notificationCenterDelegate, NotificationCenter.loadingMessagesFailed);
        if (i2 != 0) {
            loadMessagesInternal(j, 0L, true, i4, i2, 0, true, 0, generateClassGuid, 3, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        } else {
            loadMessagesInternal(j, 0L, true, i4, i2, 0, true, 0, generateClassGuid, 2, 0, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
        }
    }

    public void lambda$ensureMessagesLoaded$391(MessagesStorage messagesStorage, long j, final long j2, final int i, final MessagesLoadedCallback messagesLoadedCallback) {
        final TLRPC$Chat chat = messagesStorage.getChat(j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$ensureMessagesLoaded$390(chat, j2, i, messagesLoadedCallback);
            }
        });
    }

    public void lambda$ensureMessagesLoaded$390(TLRPC$Chat tLRPC$Chat, long j, int i, MessagesLoadedCallback messagesLoadedCallback) {
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
                MessagesController.this.lambda$deleteMessagesRange$395(j, i, i2, j2, runnable, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$deleteMessagesRange$395(final long j, final int i, final int i2, final long j2, final Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedHistory tLRPC$TL_messages_affectedHistory = (TLRPC$TL_messages_affectedHistory) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedHistory.pts, -1, tLRPC$TL_messages_affectedHistory.pts_count);
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$deleteMessagesRange$393(j, i, i2, j2, runnable);
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

    public void lambda$deleteMessagesRange$393(long j, int i, int i2, final long j2, final Runnable runnable) {
        final ArrayList<Integer> cachedMessagesInRange = getMessagesStorage().getCachedMessagesInRange(j, i, i2);
        getMessagesStorage().markMessagesAsDeleted(j, cachedMessagesInRange, false, true, false);
        getMessagesStorage().updateDialogsWithDeletedMessages(j, 0L, cachedMessagesInRange, null, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteMessagesRange$392(cachedMessagesInRange, j2, runnable);
            }
        });
    }

    public void lambda$deleteMessagesRange$392(ArrayList arrayList, long j, Runnable runnable) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, Long.valueOf(j), Boolean.FALSE);
        runnable.run();
    }

    public void setCustomChatReactions(final long j, int i, List<TLRPC$Reaction> list, final Utilities.Callback<TLRPC$TL_error> callback, final Runnable runnable) {
        final TLRPC$TL_messages_setChatAvailableReactions tLRPC$TL_messages_setChatAvailableReactions = new TLRPC$TL_messages_setChatAvailableReactions();
        tLRPC$TL_messages_setChatAvailableReactions.peer = getInputPeer(-j);
        if (i == 2 || list.isEmpty()) {
            tLRPC$TL_messages_setChatAvailableReactions.available_reactions = new TLRPC$TL_chatReactionsNone();
        } else if (i == 0) {
            tLRPC$TL_messages_setChatAvailableReactions.available_reactions = new TLRPC$TL_chatReactionsAll();
        } else {
            TLRPC$TL_chatReactionsSome tLRPC$TL_chatReactionsSome = new TLRPC$TL_chatReactionsSome();
            tLRPC$TL_messages_setChatAvailableReactions.available_reactions = tLRPC$TL_chatReactionsSome;
            tLRPC$TL_chatReactionsSome.reactions.addAll(list);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_setChatAvailableReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setCustomChatReactions$398(j, tLRPC$TL_messages_setChatAvailableReactions, runnable, callback, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$setCustomChatReactions$398(final long j, TLRPC$TL_messages_setChatAvailableReactions tLRPC$TL_messages_setChatAvailableReactions, final Runnable runnable, final Utilities.Callback callback, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
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
                chatFull.available_reactions = tLRPC$TL_messages_setChatAvailableReactions.available_reactions;
                getMessagesStorage().updateChatInfo(chatFull, false);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setCustomChatReactions$396(runnable, j);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$setCustomChatReactions$397(Utilities.Callback.this, tLRPC$TL_error);
            }
        });
    }

    public void lambda$setCustomChatReactions$396(Runnable runnable, long j) {
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatAvailableReactionsUpdated, Long.valueOf(j), 0L);
    }

    public static void lambda$setCustomChatReactions$397(Utilities.Callback callback, TLRPC$TL_error tLRPC$TL_error) {
        if (callback != null) {
            callback.run(tLRPC$TL_error);
        }
    }

    public void setChatReactions(final long j, int i, List<String> list) {
        final TLRPC$TL_messages_setChatAvailableReactions tLRPC$TL_messages_setChatAvailableReactions = new TLRPC$TL_messages_setChatAvailableReactions();
        tLRPC$TL_messages_setChatAvailableReactions.peer = getInputPeer(-j);
        if (i == 2) {
            tLRPC$TL_messages_setChatAvailableReactions.available_reactions = new TLRPC$TL_chatReactionsNone();
        } else if (i == 0) {
            tLRPC$TL_messages_setChatAvailableReactions.available_reactions = new TLRPC$TL_chatReactionsAll();
        } else {
            TLRPC$TL_chatReactionsSome tLRPC$TL_chatReactionsSome = new TLRPC$TL_chatReactionsSome();
            tLRPC$TL_messages_setChatAvailableReactions.available_reactions = tLRPC$TL_chatReactionsSome;
            for (int i2 = 0; i2 < list.size(); i2++) {
                TLRPC$TL_reactionEmoji tLRPC$TL_reactionEmoji = new TLRPC$TL_reactionEmoji();
                tLRPC$TL_reactionEmoji.emoticon = list.get(i2);
                tLRPC$TL_chatReactionsSome.reactions.add(tLRPC$TL_reactionEmoji);
            }
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_setChatAvailableReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setChatReactions$400(j, tLRPC$TL_messages_setChatAvailableReactions, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$setChatReactions$400(final long j, TLRPC$TL_messages_setChatAvailableReactions tLRPC$TL_messages_setChatAvailableReactions, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                chatFull.available_reactions = tLRPC$TL_messages_setChatAvailableReactions.available_reactions;
                getMessagesStorage().updateChatInfo(chatFull, false);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setChatReactions$399(j);
                }
            });
        }
    }

    public void lambda$setChatReactions$399(long j) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatAvailableReactionsUpdated, Long.valueOf(j), 0L);
    }

    public boolean matchesAdminRights(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights) {
        if (tLRPC$TL_chatAdminRights == null) {
            return true;
        }
        TLRPC$TL_chatAdminRights chatAdminRightsCached = getChatAdminRightsCached(tLRPC$Chat, tLRPC$User);
        if ((!tLRPC$TL_chatAdminRights.change_info || (chatAdminRightsCached != null && chatAdminRightsCached.change_info)) && ((!tLRPC$TL_chatAdminRights.post_messages || (chatAdminRightsCached != null && chatAdminRightsCached.post_messages)) && ((!tLRPC$TL_chatAdminRights.edit_messages || (chatAdminRightsCached != null && chatAdminRightsCached.edit_messages)) && ((!tLRPC$TL_chatAdminRights.delete_messages || (chatAdminRightsCached != null && chatAdminRightsCached.delete_messages)) && ((!tLRPC$TL_chatAdminRights.ban_users || (chatAdminRightsCached != null && chatAdminRightsCached.ban_users)) && ((!tLRPC$TL_chatAdminRights.invite_users || (chatAdminRightsCached != null && chatAdminRightsCached.invite_users)) && ((!tLRPC$TL_chatAdminRights.pin_messages || (chatAdminRightsCached != null && chatAdminRightsCached.pin_messages)) && ((!tLRPC$TL_chatAdminRights.add_admins || (chatAdminRightsCached != null && chatAdminRightsCached.add_admins)) && ((!tLRPC$TL_chatAdminRights.anonymous || (chatAdminRightsCached != null && chatAdminRightsCached.anonymous)) && ((!tLRPC$TL_chatAdminRights.manage_call || (chatAdminRightsCached != null && chatAdminRightsCached.manage_call)) && (!tLRPC$TL_chatAdminRights.other || (chatAdminRightsCached != null && chatAdminRightsCached.other)))))))))))) {
            if (!tLRPC$TL_chatAdminRights.manage_topics) {
                return true;
            }
            if (chatAdminRightsCached != null && chatAdminRightsCached.manage_topics) {
                return true;
            }
        }
        return false;
    }

    public TLRPC$TL_chatAdminRights getChatAdminRightsCached(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User) {
        TLRPC$ChatParticipants tLRPC$ChatParticipants;
        ArrayList<TLRPC$ChatParticipant> arrayList;
        TLRPC$ChannelParticipant tLRPC$ChannelParticipant;
        if (tLRPC$Chat != null && tLRPC$User != null) {
            if (UserObject.isUserSelf(tLRPC$User)) {
                return tLRPC$Chat.admin_rights;
            }
            TLRPC$ChatFull chatFull = getChatFull(tLRPC$Chat.id);
            if (chatFull != null && (tLRPC$ChatParticipants = chatFull.participants) != null && (arrayList = tLRPC$ChatParticipants.participants) != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC$ChatParticipant tLRPC$ChatParticipant = arrayList.get(i);
                    if (tLRPC$ChatParticipant != null && tLRPC$ChatParticipant.user_id == tLRPC$User.id) {
                        if (!(tLRPC$ChatParticipant instanceof TLRPC$TL_chatChannelParticipant) || (tLRPC$ChannelParticipant = ((TLRPC$TL_chatChannelParticipant) tLRPC$ChatParticipant).channelParticipant) == null) {
                            return null;
                        }
                        return tLRPC$ChannelParticipant.admin_rights;
                    }
                }
            }
        }
        return null;
    }

    public boolean isInChatCached(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User) {
        TLRPC$ChatParticipants tLRPC$ChatParticipants;
        ArrayList<TLRPC$ChatParticipant> arrayList;
        if (tLRPC$Chat != null && tLRPC$User != null) {
            if (UserObject.isUserSelf(tLRPC$User)) {
                return !ChatObject.isNotInChat(tLRPC$Chat);
            }
            TLRPC$ChatFull chatFull = getChatFull(tLRPC$Chat.id);
            if (chatFull != null && (tLRPC$ChatParticipants = chatFull.participants) != null && (arrayList = tLRPC$ChatParticipants.participants) != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC$ChatParticipant tLRPC$ChatParticipant = arrayList.get(i);
                    if (tLRPC$ChatParticipant != null && tLRPC$ChatParticipant.user_id == tLRPC$User.id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void checkIsInChat(boolean z, TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, final IsInChatCheckedCallback isInChatCheckedCallback) {
        TLRPC$ChatFull chatFull;
        TLRPC$ChatParticipant tLRPC$ChatParticipant;
        ArrayList<TLRPC$ChatParticipant> arrayList;
        TLRPC$ChatParticipant tLRPC$ChatParticipant2;
        ArrayList<TLRPC$ChatParticipant> arrayList2;
        if (tLRPC$Chat == null || tLRPC$User == null) {
            if (isInChatCheckedCallback != null) {
                isInChatCheckedCallback.run(false, null, null);
            }
        } else if (tLRPC$Chat.megagroup || ChatObject.isChannel(tLRPC$Chat)) {
            if (z && (chatFull = getChatFull(tLRPC$Chat.id)) != null) {
                TLRPC$ChatParticipants tLRPC$ChatParticipants = chatFull.participants;
                if (tLRPC$ChatParticipants != null && (arrayList = tLRPC$ChatParticipants.participants) != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        tLRPC$ChatParticipant = chatFull.participants.participants.get(i);
                        if (tLRPC$ChatParticipant != null && tLRPC$ChatParticipant.user_id == tLRPC$User.id) {
                            break;
                        }
                    }
                }
                tLRPC$ChatParticipant = null;
                if (isInChatCheckedCallback != null && tLRPC$ChatParticipant != null) {
                    TLRPC$ChatParticipants tLRPC$ChatParticipants2 = chatFull.participants;
                    isInChatCheckedCallback.run(true, (tLRPC$ChatParticipants2 == null || tLRPC$ChatParticipants2.admin_id != tLRPC$User.id) ? null : ChatRightsEditActivity.emptyAdminRights(true), null);
                    return;
                }
            }
            TLRPC$TL_channels_getParticipant tLRPC$TL_channels_getParticipant = new TLRPC$TL_channels_getParticipant();
            tLRPC$TL_channels_getParticipant.channel = getInputChannel(tLRPC$Chat.id);
            tLRPC$TL_channels_getParticipant.participant = getInputPeer(tLRPC$User);
            getConnectionsManager().sendRequest(tLRPC$TL_channels_getParticipant, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$checkIsInChat$401(MessagesController.IsInChatCheckedCallback.this, tLObject, tLRPC$TL_error);
                }
            });
        } else {
            TLRPC$ChatFull chatFull2 = getChatFull(tLRPC$Chat.id);
            if (chatFull2 == null) {
                if (isInChatCheckedCallback != null) {
                    isInChatCheckedCallback.run(false, null, null);
                    return;
                }
                return;
            }
            TLRPC$ChatParticipants tLRPC$ChatParticipants3 = chatFull2.participants;
            if (tLRPC$ChatParticipants3 != null && (arrayList2 = tLRPC$ChatParticipants3.participants) != null) {
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    tLRPC$ChatParticipant2 = chatFull2.participants.participants.get(i2);
                    if (tLRPC$ChatParticipant2 != null && tLRPC$ChatParticipant2.user_id == tLRPC$User.id) {
                        break;
                    }
                }
            }
            tLRPC$ChatParticipant2 = null;
            if (isInChatCheckedCallback != null) {
                boolean z2 = tLRPC$ChatParticipant2 != null;
                TLRPC$ChatParticipants tLRPC$ChatParticipants4 = chatFull2.participants;
                isInChatCheckedCallback.run(z2, (tLRPC$ChatParticipants4 == null || tLRPC$ChatParticipants4.admin_id != tLRPC$User.id) ? null : ChatRightsEditActivity.emptyAdminRights(true), null);
            }
        }
    }

    public static void lambda$checkIsInChat$401(IsInChatCheckedCallback isInChatCheckedCallback, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (isInChatCheckedCallback != null) {
            TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLObject instanceof TLRPC$TL_channels_channelParticipant ? ((TLRPC$TL_channels_channelParticipant) tLObject).participant : null;
            isInChatCheckedCallback.run((tLRPC$TL_error != null || tLRPC$ChannelParticipant == null || tLRPC$ChannelParticipant.left) ? false : true, tLRPC$ChannelParticipant != null ? tLRPC$ChannelParticipant.admin_rights : null, tLRPC$ChannelParticipant != null ? tLRPC$ChannelParticipant.rank : null);
        }
    }

    public void updateEmojiStatusUntilUpdate(long j, TLRPC$EmojiStatus tLRPC$EmojiStatus) {
        if (tLRPC$EmojiStatus instanceof TLRPC$TL_emojiStatusUntil) {
            this.emojiStatusUntilValues.put(j, Integer.valueOf(((TLRPC$TL_emojiStatusUntil) tLRPC$EmojiStatus).until));
        } else if (!this.emojiStatusUntilValues.containsKey(j)) {
            return;
        } else {
            this.emojiStatusUntilValues.remove(j);
        }
        updateEmojiStatusUntil();
    }

    public void updateEmojiStatusUntil() {
        int intValue;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        Long l = null;
        int i = 0;
        while (i < this.emojiStatusUntilValues.size()) {
            if (this.emojiStatusUntilValues.valueAt(i).intValue() > currentTimeMillis) {
                l = Long.valueOf(Math.min(l == null ? Long.MAX_VALUE : l.longValue(), intValue - currentTimeMillis));
            } else {
                this.emojiStatusUntilValues.removeAt(i);
                i--;
            }
            i++;
        }
        if (l != null) {
            Long valueOf = Long.valueOf(l.longValue() + 2);
            long j = currentTimeMillis;
            if (valueOf.longValue() + j != this.recentEmojiStatusUpdateRunnableTime + this.recentEmojiStatusUpdateRunnableTimeout) {
                AndroidUtilities.cancelRunOnUIThread(this.recentEmojiStatusUpdateRunnable);
                this.recentEmojiStatusUpdateRunnableTime = j;
                this.recentEmojiStatusUpdateRunnableTimeout = valueOf.longValue();
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$updateEmojiStatusUntil$402();
                    }
                };
                this.recentEmojiStatusUpdateRunnable = runnable;
                AndroidUtilities.runOnUIThread(runnable, valueOf.longValue() * 1000);
                return;
            }
            return;
        }
        Runnable runnable2 = this.recentEmojiStatusUpdateRunnable;
        if (runnable2 != null) {
            this.recentEmojiStatusUpdateRunnableTime = -1L;
            this.recentEmojiStatusUpdateRunnableTimeout = -1L;
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void lambda$updateEmojiStatusUntil$402() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_EMOJI_STATUS));
        updateEmojiStatusUntil();
    }

    public String getMutedString(long j, long j2) {
        if (getMessagesController().isDialogMuted(j, j2)) {
            SharedPreferences sharedPreferences = this.notificationsPreferences;
            int i = sharedPreferences.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + NotificationsController.getSharedPrefKey(j, j2), 0);
            return i >= getConnectionsManager().getCurrentTime() ? LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i)) : LocaleController.getString(R.string.NotificationsMuted);
        }
        return LocaleController.getString(R.string.NotificationsUnmuted);
    }

    public int getDialogUnreadCount(TLRPC$Dialog tLRPC$Dialog) {
        if (tLRPC$Dialog == null) {
            return 0;
        }
        int i = tLRPC$Dialog.unread_count;
        TLRPC$Chat chat = getChat(Long.valueOf(-tLRPC$Dialog.id));
        return (chat == null || !chat.forum) ? i : this.topicsController.getForumUnreadCount(-tLRPC$Dialog.id)[0];
    }

    public TLRPC$TL_exportedContactToken getCachedContactToken() {
        TLRPC$TL_exportedContactToken tLRPC$TL_exportedContactToken = this.cachedContactToken;
        if (tLRPC$TL_exportedContactToken == null || tLRPC$TL_exportedContactToken.expires <= System.currentTimeMillis() / 1000) {
            return null;
        }
        return this.cachedContactToken;
    }

    public void requestContactToken(Utilities.Callback<TLRPC$TL_exportedContactToken> callback) {
        requestContactToken(0L, callback);
    }

    public void requestContactToken(final long j, final Utilities.Callback<TLRPC$TL_exportedContactToken> callback) {
        if (callback == null || this.requestingContactToken) {
            return;
        }
        TLRPC$TL_exportedContactToken tLRPC$TL_exportedContactToken = this.cachedContactToken;
        if (tLRPC$TL_exportedContactToken != null && tLRPC$TL_exportedContactToken.expires > System.currentTimeMillis() / 1000) {
            callback.run(this.cachedContactToken);
            return;
        }
        this.requestingContactToken = true;
        final long currentTimeMillis = System.currentTimeMillis();
        getConnectionsManager().sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                return TLRPC$TL_exportedContactToken.TLdeserialize(abstractSerializedData, i, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-127582169);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$requestContactToken$404(callback, j, currentTimeMillis, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$requestContactToken$404(final Utilities.Callback callback, long j, long j2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_exportedContactToken) {
            this.cachedContactToken = (TLRPC$TL_exportedContactToken) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$requestContactToken$403(callback);
                }
            }, Math.max(0L, j - (System.currentTimeMillis() - j2)));
            return;
        }
        this.requestingContactToken = false;
    }

    public void lambda$requestContactToken$403(Utilities.Callback callback) {
        callback.run(this.cachedContactToken);
        this.requestingContactToken = false;
    }

    public CacheByChatsController getCacheByChatsController() {
        return this.cacheByChatsController;
    }

    public int getFilterIdByDialogsType(int i) {
        if (i == 7 || i == 8) {
            DialogFilter dialogFilter = this.selectedDialogFilter[i - 7];
            if (dialogFilter == null) {
                return -1;
            }
            return dialogFilter.id;
        }
        return 0;
    }

    public void invalidateChatlistFolderUpdate(int i) {
        this.chatlistFoldersUpdates.remove(i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatlistFolderUpdate, Integer.valueOf(i));
    }

    public void checkChatlistFolderUpdate(final int i, boolean z) {
        if (i < 0) {
            return;
        }
        final ChatlistUpdatesStat chatlistUpdatesStat = this.chatlistFoldersUpdates.get(i);
        if (chatlistUpdatesStat != null) {
            if (chatlistUpdatesStat.loading) {
                return;
            }
            if (System.currentTimeMillis() - chatlistUpdatesStat.lastRequestTime <= this.chatlistUpdatePeriod * 1000 && !z) {
                return;
            }
        }
        if (chatlistUpdatesStat == null) {
            chatlistUpdatesStat = new ChatlistUpdatesStat();
            this.chatlistFoldersUpdates.put(i, chatlistUpdatesStat);
        }
        chatlistUpdatesStat.loading = false;
        TL_chatlists$TL_chatlists_getChatlistUpdates tL_chatlists$TL_chatlists_getChatlistUpdates = new TL_chatlists$TL_chatlists_getChatlistUpdates();
        TL_chatlists$TL_inputChatlistDialogFilter tL_chatlists$TL_inputChatlistDialogFilter = new TL_chatlists$TL_inputChatlistDialogFilter();
        tL_chatlists$TL_chatlists_getChatlistUpdates.chatlist = tL_chatlists$TL_inputChatlistDialogFilter;
        tL_chatlists$TL_inputChatlistDialogFilter.filter_id = i;
        getConnectionsManager().sendRequest(tL_chatlists$TL_chatlists_getChatlistUpdates, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$checkChatlistFolderUpdate$406(i, chatlistUpdatesStat, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$checkChatlistFolderUpdate$406(final int i, final ChatlistUpdatesStat chatlistUpdatesStat, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkChatlistFolderUpdate$405(tLObject, i, chatlistUpdatesStat);
            }
        });
    }

    public void lambda$checkChatlistFolderUpdate$405(TLObject tLObject, int i, ChatlistUpdatesStat chatlistUpdatesStat) {
        if (tLObject instanceof TL_chatlists$TL_chatlists_chatlistUpdates) {
            TL_chatlists$TL_chatlists_chatlistUpdates tL_chatlists$TL_chatlists_chatlistUpdates = (TL_chatlists$TL_chatlists_chatlistUpdates) tLObject;
            putChats(tL_chatlists$TL_chatlists_chatlistUpdates.chats, false);
            putUsers(tL_chatlists$TL_chatlists_chatlistUpdates.users, false);
            this.chatlistFoldersUpdates.put(i, new ChatlistUpdatesStat(tL_chatlists$TL_chatlists_chatlistUpdates));
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatlistFolderUpdate, Integer.valueOf(i));
            return;
        }
        chatlistUpdatesStat.loading = false;
    }

    public TL_chatlists$TL_chatlists_chatlistUpdates getChatlistFolderUpdates(int i) {
        ChatlistUpdatesStat chatlistUpdatesStat = this.chatlistFoldersUpdates.get(i);
        if (chatlistUpdatesStat == null) {
            return null;
        }
        return chatlistUpdatesStat.lastValue;
    }

    public Pair<Runnable, Runnable> removeFolderTemporarily(final int i, ArrayList<Long> arrayList) {
        this.frozenDialogFilters = new ArrayList<>(this.dialogFilters);
        int i2 = 0;
        while (i2 < this.frozenDialogFilters.size()) {
            if (this.frozenDialogFilters.get(i2).id == i) {
                this.frozenDialogFilters.remove(i2);
                i2--;
            }
            i2++;
        }
        this.hiddenUndoChats.clear();
        if (arrayList != null) {
            this.hiddenUndoChats.addAll(arrayList);
        }
        final boolean z = !this.hiddenUndoChats.isEmpty();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
        return new Pair<>(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$removeFolderTemporarily$407(i, z);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$removeFolderTemporarily$408(z);
            }
        });
    }

    public void lambda$removeFolderTemporarily$407(int i, boolean z) {
        int i2 = 0;
        while (i2 < this.dialogFilters.size()) {
            if (this.dialogFilters.get(i2).id == i) {
                this.dialogFilters.remove(i2);
                i2--;
            }
            i2++;
        }
        this.frozenDialogFilters = null;
        this.hiddenUndoChats.clear();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void lambda$removeFolderTemporarily$408(boolean z) {
        this.frozenDialogFilters = null;
        this.hiddenUndoChats.clear();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public boolean isHiddenByUndo(long j) {
        return !this.hiddenUndoChats.isEmpty() && this.hiddenUndoChats.contains(Long.valueOf(j));
    }

    public void cancelUploadWallpaper() {
        Theme.OverrideWallpaperInfo overrideWallpaperInfo = this.uploadingWallpaperInfo;
        if (overrideWallpaperInfo != null) {
            if (overrideWallpaperInfo.requestIds != null) {
                for (int i = 0; i < this.uploadingWallpaperInfo.requestIds.size(); i++) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.uploadingWallpaperInfo.requestIds.get(i).intValue(), true);
                }
            }
            FileLoader.getInstance(this.currentAccount).cancelFileUpload(this.uploadingWallpaper, false);
            long j = this.uploadingWallpaperInfo.dialogId;
            if (j != 0) {
                if (j >= 0) {
                    TLRPC$UserFull userFull = getUserFull(j);
                    if (userFull != null) {
                        userFull.wallpaper = this.uploadingWallpaperInfo.prevUserWallpaper;
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(this.uploadingWallpaperInfo.dialogId), userFull);
                    }
                } else {
                    TLRPC$ChatFull chatFull = getChatFull(-j);
                    if (chatFull != null) {
                        chatFull.wallpaper = this.uploadingWallpaperInfo.prevUserWallpaper;
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                        int i2 = NotificationCenter.chatInfoDidLoad;
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, chatFull, 0, bool, bool);
                    }
                }
            }
            this.uploadingWallpaperInfo = null;
            this.uploadingWallpaper = null;
        }
    }

    public StoriesController getStoriesController() {
        StoriesController storiesController = this.storiesController;
        if (storiesController != null) {
            return storiesController;
        }
        synchronized (lockObjects[this.currentAccount]) {
            StoriesController storiesController2 = this.storiesController;
            if (storiesController2 != null) {
                return storiesController2;
            }
            StoriesController storiesController3 = new StoriesController(this.currentAccount);
            this.storiesController = storiesController3;
            return storiesController3;
        }
    }

    public SavedMessagesController getSavedMessagesController() {
        SavedMessagesController savedMessagesController = this.savedMessagesController;
        if (savedMessagesController != null) {
            return savedMessagesController;
        }
        synchronized (lockObjects[this.currentAccount]) {
            SavedMessagesController savedMessagesController2 = this.savedMessagesController;
            if (savedMessagesController2 != null) {
                return savedMessagesController2;
            }
            SavedMessagesController savedMessagesController3 = new SavedMessagesController(this.currentAccount);
            this.savedMessagesController = savedMessagesController3;
            return savedMessagesController3;
        }
    }

    public UnconfirmedAuthController getUnconfirmedAuthController() {
        UnconfirmedAuthController unconfirmedAuthController = this.unconfirmedAuthController;
        if (unconfirmedAuthController != null) {
            return unconfirmedAuthController;
        }
        synchronized (lockObjects[this.currentAccount]) {
            UnconfirmedAuthController unconfirmedAuthController2 = this.unconfirmedAuthController;
            if (unconfirmedAuthController2 != null) {
                return unconfirmedAuthController2;
            }
            UnconfirmedAuthController unconfirmedAuthController3 = new UnconfirmedAuthController(this.currentAccount);
            this.unconfirmedAuthController = unconfirmedAuthController3;
            return unconfirmedAuthController3;
        }
    }

    public boolean storiesEnabled() {
        char c;
        String str = this.storiesPosting;
        int hashCode = str.hashCode();
        if (hashCode == -1609594047) {
            if (str.equals("enabled")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -318452137) {
            if (hashCode == 270940796 && str.equals("disabled")) {
                c = 3;
            }
            c = 65535;
        } else {
            if (str.equals("premium")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            return c == 1;
        }
        return getUserConfig().isPremium();
    }

    public boolean storyEntitiesAllowed() {
        char c;
        String str = this.storiesEntities;
        int hashCode = str.hashCode();
        if (hashCode == -1609594047) {
            if (str.equals("enabled")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -318452137) {
            if (hashCode == 270940796 && str.equals("disabled")) {
                c = 3;
            }
            c = 65535;
        } else {
            if (str.equals("premium")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            return c == 1;
        }
        return getUserConfig().isPremium();
    }

    public boolean storyEntitiesAllowed(TLRPC$User tLRPC$User) {
        if (tLRPC$User == null || tLRPC$User.id != this.storiesChangelogUserId) {
            String str = this.storiesEntities;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1609594047) {
                if (hashCode != -318452137) {
                    if (hashCode == 270940796 && str.equals("disabled")) {
                        c = 3;
                    }
                } else if (str.equals("premium")) {
                    c = 0;
                }
            } else if (str.equals("enabled")) {
                c = 1;
            }
            return c != 0 ? c == 1 : tLRPC$User != null && tLRPC$User.premium;
        }
        return true;
    }

    public static class ChannelRecommendations {
        public final ArrayList<TLRPC$Chat> chats = new ArrayList<>();
        public int more;
        public boolean wasPremium;

        public static boolean hasRecommendations(ChannelRecommendations channelRecommendations) {
            return (channelRecommendations == null || channelRecommendations.chats.isEmpty()) ? false : true;
        }

        public static boolean hasRecommendations(int i, long j) {
            return hasRecommendations(MessagesController.getInstance(i).getChannelRecommendations(j));
        }
    }

    public ChannelRecommendations getChannelRecommendations(final long j) {
        ChannelRecommendations channelRecommendations;
        TLRPC$InputChannel inputChannel = getInputChannel(j);
        if (inputChannel == null) {
            return null;
        }
        if (this.cachedChannelRecommendations == null) {
            this.cachedChannelRecommendations = new HashMap<>();
        }
        final boolean isPremium = getUserConfig().isPremium();
        if (this.cachedChannelRecommendations.containsKey(Long.valueOf(j))) {
            channelRecommendations = this.cachedChannelRecommendations.get(Long.valueOf(j));
            if (channelRecommendations != null && channelRecommendations.wasPremium == isPremium) {
                return channelRecommendations;
            }
        } else {
            channelRecommendations = null;
        }
        this.cachedChannelRecommendations.put(Long.valueOf(j), null);
        TLRPC$TL_channels_getChannelRecommendations tLRPC$TL_channels_getChannelRecommendations = new TLRPC$TL_channels_getChannelRecommendations();
        tLRPC$TL_channels_getChannelRecommendations.channel = inputChannel;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_getChannelRecommendations, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$getChannelRecommendations$410(isPremium, j, tLObject, tLRPC$TL_error);
            }
        });
        return channelRecommendations;
    }

    public void lambda$getChannelRecommendations$410(final boolean z, final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getChannelRecommendations$409(tLObject, z, j);
            }
        });
    }

    public void lambda$getChannelRecommendations$409(TLObject tLObject, boolean z, long j) {
        if (tLObject instanceof TLRPC$messages_Chats) {
            ArrayList<TLRPC$Chat> arrayList = ((TLRPC$messages_Chats) tLObject).chats;
            putChats(arrayList, false);
            ChannelRecommendations channelRecommendations = new ChannelRecommendations();
            channelRecommendations.wasPremium = z;
            channelRecommendations.chats.addAll(arrayList);
            if (tLObject instanceof TLRPC$TL_messages_chatsSlice) {
                channelRecommendations.more = Math.max(0, ((TLRPC$TL_messages_chatsSlice) tLObject).count - arrayList.size());
            } else if (!getUserConfig().isPremium() && BuildVars.DEBUG_PRIVATE_VERSION) {
                channelRecommendations.more = 90;
            }
            this.cachedChannelRecommendations.put(Long.valueOf(j), channelRecommendations);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(j));
        }
    }

    public void checkPeerColors(boolean z) {
        PeerColors peerColors = this.peerColors;
        if (peerColors == null || peerColors.needUpdate() || z) {
            TLRPC$TL_help_getPeerColors tLRPC$TL_help_getPeerColors = new TLRPC$TL_help_getPeerColors();
            PeerColors peerColors2 = this.peerColors;
            tLRPC$TL_help_getPeerColors.hash = peerColors2 != null ? peerColors2.hash : 0;
            if (peerColors2 != null && peerColors2.needUpdate()) {
                tLRPC$TL_help_getPeerColors.hash = 0;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_help_getPeerColors, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkPeerColors$412(tLObject, tLRPC$TL_error);
                }
            });
        }
        PeerColors peerColors3 = this.profilePeerColors;
        if (peerColors3 == null || peerColors3.needUpdate() || z) {
            TLRPC$TL_help_getPeerProfileColors tLRPC$TL_help_getPeerProfileColors = new TLRPC$TL_help_getPeerProfileColors();
            PeerColors peerColors4 = this.profilePeerColors;
            tLRPC$TL_help_getPeerProfileColors.hash = peerColors4 != null ? peerColors4.hash : 0;
            if (peerColors4 != null && peerColors4.needUpdate()) {
                tLRPC$TL_help_getPeerProfileColors.hash = 0;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_help_getPeerProfileColors, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkPeerColors$414(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$checkPeerColors$412(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_help_peerColors) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkPeerColors$411(tLObject);
                }
            });
        }
    }

    public void lambda$checkPeerColors$411(TLObject tLObject) {
        this.peerColors = PeerColors.fromTL(0, (TLRPC$TL_help_peerColors) tLObject);
        this.mainPreferences.edit().putString("peerColors", this.peerColors.toString()).apply();
    }

    public void lambda$checkPeerColors$414(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_help_peerColors) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkPeerColors$413(tLObject);
                }
            });
        }
    }

    public void lambda$checkPeerColors$413(TLObject tLObject) {
        this.profilePeerColors = PeerColors.fromTL(1, (TLRPC$TL_help_peerColors) tLObject);
        this.mainPreferences.edit().putString("profilePeerColors", this.profilePeerColors.toString()).apply();
    }
}
