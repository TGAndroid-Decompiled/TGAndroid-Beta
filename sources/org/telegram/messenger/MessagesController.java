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
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
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
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.AbstractSerializedData;
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
import org.telegram.tgnet.TLRPC$ChatReactions;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$DialogFilter;
import org.telegram.tgnet.TLRPC$DialogPeer;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DraftMessage;
import org.telegram.tgnet.TLRPC$EmojiStatus;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputChannel;
import org.telegram.tgnet.TLRPC$InputChatPhoto;
import org.telegram.tgnet.TLRPC$InputDialogPeer;
import org.telegram.tgnet.TLRPC$InputDocument;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$InputMedia;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputPhoto;
import org.telegram.tgnet.TLRPC$InputUser;
import org.telegram.tgnet.TLRPC$InputWallPaper;
import org.telegram.tgnet.TLRPC$JSONValue;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$PeerNotifySettings;
import org.telegram.tgnet.TLRPC$PeerSettings;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$Poll;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$ReactionNotificationsFrom;
import org.telegram.tgnet.TLRPC$RecentMeUrl;
import org.telegram.tgnet.TLRPC$ReportReason;
import org.telegram.tgnet.TLRPC$RestrictionReason;
import org.telegram.tgnet.TLRPC$SendMessageAction;
import org.telegram.tgnet.TLRPC$TL_account_createTheme;
import org.telegram.tgnet.TLRPC$TL_account_getNotifySettings;
import org.telegram.tgnet.TLRPC$TL_account_getReactionsNotifySettings;
import org.telegram.tgnet.TLRPC$TL_account_installTheme;
import org.telegram.tgnet.TLRPC$TL_account_installWallPaper;
import org.telegram.tgnet.TLRPC$TL_account_registerDevice;
import org.telegram.tgnet.TLRPC$TL_account_reportPeer;
import org.telegram.tgnet.TLRPC$TL_account_saveTheme;
import org.telegram.tgnet.TLRPC$TL_account_toggleSponsoredMessages;
import org.telegram.tgnet.TLRPC$TL_account_unregisterDevice;
import org.telegram.tgnet.TLRPC$TL_account_updateEmojiStatus;
import org.telegram.tgnet.TLRPC$TL_account_updateTheme;
import org.telegram.tgnet.TLRPC$TL_account_uploadTheme;
import org.telegram.tgnet.TLRPC$TL_account_uploadWallPaper;
import org.telegram.tgnet.TLRPC$TL_auth_loggedOut;
import org.telegram.tgnet.TLRPC$TL_availableEffect;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
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
import org.telegram.tgnet.TLRPC$TL_channels_setBoostsToUnblockRestrictions;
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
import org.telegram.tgnet.TLRPC$TL_inputMediaDocument;
import org.telegram.tgnet.TLRPC$TL_inputMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterChatPhotos;
import org.telegram.tgnet.TLRPC$TL_inputNotifyBroadcasts;
import org.telegram.tgnet.TLRPC$TL_inputNotifyChats;
import org.telegram.tgnet.TLRPC$TL_inputNotifyUsers;
import org.telegram.tgnet.TLRPC$TL_inputPeerChannel;
import org.telegram.tgnet.TLRPC$TL_inputPeerChat;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_inputPeerSelf;
import org.telegram.tgnet.TLRPC$TL_inputPeerUser;
import org.telegram.tgnet.TLRPC$TL_inputPhoto;
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
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaPoll;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_messageReactions;
import org.telegram.tgnet.TLRPC$TL_messageService;
import org.telegram.tgnet.TLRPC$TL_messageViews;
import org.telegram.tgnet.TLRPC$TL_messages_addChatUser;
import org.telegram.tgnet.TLRPC$TL_messages_affectedHistory;
import org.telegram.tgnet.TLRPC$TL_messages_affectedMessages;
import org.telegram.tgnet.TLRPC$TL_messages_availableEffects;
import org.telegram.tgnet.TLRPC$TL_messages_availableEffectsNotModified;
import org.telegram.tgnet.TLRPC$TL_messages_chatFull;
import org.telegram.tgnet.TLRPC$TL_messages_chatsSlice;
import org.telegram.tgnet.TLRPC$TL_messages_createChat;
import org.telegram.tgnet.TLRPC$TL_messages_deleteChat;
import org.telegram.tgnet.TLRPC$TL_messages_deleteChatUser;
import org.telegram.tgnet.TLRPC$TL_messages_deleteHistory;
import org.telegram.tgnet.TLRPC$TL_messages_deleteSavedHistory;
import org.telegram.tgnet.TLRPC$TL_messages_dialogFilters;
import org.telegram.tgnet.TLRPC$TL_messages_dialogs;
import org.telegram.tgnet.TLRPC$TL_messages_editChatAbout;
import org.telegram.tgnet.TLRPC$TL_messages_editChatAdmin;
import org.telegram.tgnet.TLRPC$TL_messages_editChatDefaultBannedRights;
import org.telegram.tgnet.TLRPC$TL_messages_editChatPhoto;
import org.telegram.tgnet.TLRPC$TL_messages_editChatTitle;
import org.telegram.tgnet.TLRPC$TL_messages_forumTopics;
import org.telegram.tgnet.TLRPC$TL_messages_getAvailableEffects;
import org.telegram.tgnet.TLRPC$TL_messages_getChats;
import org.telegram.tgnet.TLRPC$TL_messages_getDialogs;
import org.telegram.tgnet.TLRPC$TL_messages_getHistory;
import org.telegram.tgnet.TLRPC$TL_messages_getMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getMessagesViews;
import org.telegram.tgnet.TLRPC$TL_messages_getPeerDialogs;
import org.telegram.tgnet.TLRPC$TL_messages_getPeerSettings;
import org.telegram.tgnet.TLRPC$TL_messages_getPinnedDialogs;
import org.telegram.tgnet.TLRPC$TL_messages_getQuickReplyMessages;
import org.telegram.tgnet.TLRPC$TL_messages_getReplies;
import org.telegram.tgnet.TLRPC$TL_messages_getSavedHistory;
import org.telegram.tgnet.TLRPC$TL_messages_getSavedReactionTags;
import org.telegram.tgnet.TLRPC$TL_messages_getScheduledHistory;
import org.telegram.tgnet.TLRPC$TL_messages_getUnreadMentions;
import org.telegram.tgnet.TLRPC$TL_messages_getWebPagePreview;
import org.telegram.tgnet.TLRPC$TL_messages_hidePeerSettingsBar;
import org.telegram.tgnet.TLRPC$TL_messages_invitedUsers;
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
import org.telegram.tgnet.TLRPC$TL_messages_savedReactionsTags;
import org.telegram.tgnet.TLRPC$TL_messages_savedReactionsTagsNotModified;
import org.telegram.tgnet.TLRPC$TL_messages_search;
import org.telegram.tgnet.TLRPC$TL_messages_setChatAvailableReactions;
import org.telegram.tgnet.TLRPC$TL_messages_setHistoryTTL;
import org.telegram.tgnet.TLRPC$TL_messages_sponsoredMessages;
import org.telegram.tgnet.TLRPC$TL_messages_startBot;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_toggleDialogPin;
import org.telegram.tgnet.TLRPC$TL_messages_toggleNoForwards;
import org.telegram.tgnet.TLRPC$TL_messages_unpinAllMessages;
import org.telegram.tgnet.TLRPC$TL_messages_updatePinnedMessage;
import org.telegram.tgnet.TLRPC$TL_messages_updateSavedReactionTag;
import org.telegram.tgnet.TLRPC$TL_missingInvitee;
import org.telegram.tgnet.TLRPC$TL_peerBlocked;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$TL_peerChat;
import org.telegram.tgnet.TLRPC$TL_peerNotifySettings;
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
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionNotificationsFromContacts;
import org.telegram.tgnet.TLRPC$TL_reactionsNotifySettings;
import org.telegram.tgnet.TLRPC$TL_savedReactionTag;
import org.telegram.tgnet.TLRPC$TL_sendMessageEmojiInteraction;
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
import org.telegram.tgnet.TLRPC$TL_updates;
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
import org.telegram.tgnet.TLRPC$TL_users_getIsPremiumRequiredToContact;
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
import org.telegram.tgnet.TLRPC$messages_AvailableEffects;
import org.telegram.tgnet.TLRPC$messages_Chats;
import org.telegram.tgnet.TLRPC$messages_Dialogs;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.tgnet.TLRPC$messages_SavedReactionTags;
import org.telegram.tgnet.TLRPC$messages_SponsoredMessages;
import org.telegram.tgnet.TLRPC$photos_Photos;
import org.telegram.tgnet.TLRPC$updates_ChannelDifference;
import org.telegram.tgnet.TLRPC$updates_Difference;
import org.telegram.tgnet.tl.TL_account$contentSettings;
import org.telegram.tgnet.tl.TL_account$setContentSettings;
import org.telegram.tgnet.tl.TL_bots$BotInfo;
import org.telegram.tgnet.tl.TL_bots$TL_botInfo;
import org.telegram.tgnet.tl.TL_bots$TL_botMenuButton;
import org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_chatlistUpdates;
import org.telegram.tgnet.tl.TL_chatlists$TL_chatlists_getChatlistUpdates;
import org.telegram.tgnet.tl.TL_chatlists$TL_exportedChatlistInvite;
import org.telegram.tgnet.tl.TL_chatlists$TL_inputChatlistDialogFilter;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatRightsEditActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bots.BotWebViewAttachedSheet;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;

public class MessagesController extends BaseController implements NotificationCenter.NotificationCenterDelegate {
    public static int DIALOG_FILTER_FLAG_ALL_CHATS = 31;
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
    public static int UPDATE_MASK_ALL = 1050111;
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
    private final HashMap<Long, TLRPC$Chat> activeVoiceChatsMap;
    protected ArrayList<TLRPC$Dialog> allDialogs;
    public boolean androidDisableRoundCamera2;
    public float animatedEmojisZoom;
    private final CacheFetcher<Integer, TLRPC$TL_help_appConfig> appConfigFetcher;
    public Set<String> authDomains;
    public int authorizationAutoconfirmPeriod;
    public boolean autoarchiveAvailable;
    public Set<String> autologinDomains;
    public String autologinToken;
    private TLRPC$messages_AvailableEffects availableEffects;
    public int availableMapProviders;
    public boolean backgroundConnection;
    public LongSparseIntArray blockePeers;
    public boolean blockedCountry;
    public boolean blockedEndReached;
    public int boostsChannelLevelMax;
    public long boostsPerSentGift;
    public int botPreviewMediasMax;
    public int businessChatLinksLimit;
    public SparseIntArray businessFeaturesTypesToPosition;
    private CacheByChatsController cacheByChatsController;
    private HashMap<Long, ChannelRecommendations> cachedChannelRecommendations;
    private TLRPC$TL_exportedContactToken cachedContactToken;
    private LongSparseArray cachedIsUserPremiumBlocked;
    public int callConnectTimeout;
    public int callPacketTimeout;
    public int callReceiveTimeout;
    public int callRingTimeout;
    public boolean canEditFactcheck;
    public boolean canRevokePmInbox;
    public int captionLengthLimitDefault;
    public int captionLengthLimitPremium;
    private LongSparseArray channelAdmins;
    public int channelBgIconLevelMin;
    private ChannelBoostsController channelBoostsControler;
    public int channelCustomWallpaperLevelMin;
    public int channelEmojiStatusLevelMin;
    public int channelProfileIconLevelMin;
    public int channelRestrictSponsoredLevelMin;
    public boolean channelRevenueWithdrawalEnabled;
    private LongSparseArray channelViewsToSend;
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
    private final ConcurrentHashMap<Long, TLRPC$Chat> chats;
    public int checkResetLangpack;
    private LongSparseArray checkingLastMessagesDialogs;
    private boolean checkingPromoInfo;
    private int checkingPromoInfoRequestId;
    private boolean checkingTosUpdate;
    private LongSparseArray clearingHistoryDialogs;
    public boolean collectDeviceStats;
    private TL_account$contentSettings contentSettings;
    private ArrayList<Utilities.Callback<TL_account$contentSettings>> contentSettingsCallbacks;
    private long contentSettingsLoadedTime;
    private boolean contentSettingsLoading;
    private ArrayList<Long> createdDialogIds;
    private ArrayList<Long> createdDialogMainThreadIds;
    private ArrayList<Long> createdScheduledDialogIds;
    private Runnable currentDeleteTaskRunnable;
    private LongSparseArray currentDeletingTaskMediaMids;
    private LongSparseArray currentDeletingTaskMids;
    private int currentDeletingTaskTime;
    public String dcDomainName;
    public LongSparseIntArray deletedHistory;
    private LongSparseArray deletingDialogs;
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
    public LongSparseArray dialogMessage;
    public SparseArray<MessageObject> dialogMessagesByIds;
    public LongSparseArray dialogMessagesByRandomIds;
    private LongSparseArray dialogPhotos;
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
    public LongSparseArray dialogs_dict;
    public ConcurrentHashMap<Long, Integer> dialogs_read_inbox_max;
    public ConcurrentHashMap<Long, Integer> dialogs_read_outbox_max;
    public HashSet<String> diceEmojies;
    public HashMap<String, DiceFrameSuccess> diceSuccess;
    public List<String> directPaymentsCurrency;
    public Set<String> dismissedSuggestions;
    private final CacheFetcher<Integer, TLRPC$messages_AvailableEffects> effectsFetcher;
    public HashMap<Long, ArrayList<TLRPC$TL_sendMessageEmojiInteraction>> emojiInteractions;
    private final SharedPreferences emojiPreferences;
    public HashMap<String, EmojiSound> emojiSounds;
    private LongSparseArray emojiStatusUntilValues;
    public boolean enableJoined;
    private final ConcurrentHashMap<Integer, TLRPC$EncryptedChat> encryptedChats;
    public Set<String> exportGroupUri;
    public Set<String> exportPrivateUri;
    public Set<String> exportUri;
    private final LongSparseArray exportedChats;
    public int factcheckLengthLimit;
    public ArrayList<FaqSearchResult> faqSearchArray;
    public TLRPC$WebPage faqWebPage;
    public boolean filtersEnabled;
    public boolean firstGettingTask;
    public boolean folderTags;
    public int forumUpgradeParticipantsMin;
    public ArrayList<DialogFilter> frozenDialogFilters;
    private LongSparseArray fullChats;
    private LongSparseArray fullUsers;
    private boolean getDifferenceFirstSync;
    public boolean getfileExperimentalParams;
    private LongSparseArray gettingChatInviters;
    public boolean gettingDifference;
    private LongSparseArray gettingDifferenceChannels;
    private boolean gettingNewDeleteTask;
    private LongSparseArray gettingUnknownChannels;
    private LongSparseArray gettingUnknownDialogs;
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
    private LongSparseArray groupCalls;
    private LongSparseArray groupCallsByChatId;
    public int groupCustomWallpaperLevelMin;
    public int groupEmojiStatusLevelMin;
    public int groupEmojiStickersLevelMin;
    public int groupProfileBgIconLevelMin;
    public int groupTranscribeLevelMin;
    public int groupWallpaperLevelMin;
    private boolean hasArchivedChats;
    private boolean hasStories;
    public int hiddenMembersGroupSizeMin;
    public ArrayList<Long> hiddenUndoChats;
    public ArrayList<TLRPC$RecentMeUrl> hintDialogs;
    public Set<String> ignoreRestrictionReasons;
    public volatile boolean ignoreSetOnline;
    public String imageSearchBot;
    private String installReferer;
    public int introDescriptionLengthLimit;
    public int introTitleLengthLimit;
    private boolean isLeftPromoChannel;
    private final ArrayList<Long> joiningToChannels;
    public boolean keepAliveService;
    public int largeQueueMaxActiveOperations;
    private int lastCheckPromoId;
    public int lastKnownSessionsCount;
    private int lastPrintingStringCount;
    private long lastPushRegisterSendTime;
    private LongSparseArray lastQuickReplyServerQueryTime;
    private LongSparseArray lastSavedServerQueryTime;
    private LongSparseArray lastScheduledServerQueryTime;
    private LongSparseArray lastServerQueryTime;
    private long lastStatusUpdateTime;
    private long lastViewsCheckTime;
    public String linkPrefix;
    private Runnable loadAppConfigRunnable;
    public LongSparseLongArray loadedFullChats;
    private HashSet<Long> loadedFullParticipants;
    private LongSparseLongArray loadedFullUsers;
    private boolean loadingArePaidReactionsAnonymous;
    private boolean loadingAvailableEffects;
    public boolean loadingBlockedPeers;
    private LongSparseIntArray loadingChannelAdmins;
    private SparseBooleanArray loadingDialogs;
    private HashSet<Long> loadingFullChats;
    private HashSet<Long> loadingFullParticipants;
    private HashSet<Long> loadingFullUsers;
    private HashSet<Long> loadingGroupCalls;
    private HashSet<Long> loadingIsUserPremiumBlocked;
    private int loadingNotificationSettings;
    private boolean loadingNotificationSignUpSettings;
    private boolean loadingPeerColors;
    private LongSparseArray loadingPeerSettings;
    private SparseIntArray loadingPinnedDialogs;
    private boolean loadingProfilePeerColors;
    private HashSet<Long> loadingReactionTags;
    private boolean loadingRemoteFilters;
    private boolean loadingSuggestedFilters;
    private boolean loadingUnreadDialogs;
    private boolean loggedDeviceStats;
    private final SharedPreferences mainPreferences;
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
    private LongSparseArray needShortPollChannels;
    private LongSparseArray needShortPollOnlines;
    public NewMessageCallback newMessageCallback;
    public boolean newNoncontactPeersRequirePremiumWithoutOwnpremium;
    private SparseIntArray nextDialogsCacheOffset;
    private int nextPromoInfoCheckTime;
    private int nextTosCheckTime;
    private final SharedPreferences notificationsPreferences;
    private final Runnable notifyTranscriptionAudioCooldownUpdate;
    private final ConcurrentHashMap<String, TLObject> objectsByUsernames;
    private boolean offlineSent;
    private Utilities.Callback<Boolean> onLoadedRemoteFilters;
    public ConcurrentHashMap<Long, Integer> onlinePrivacy;
    public Boolean paidReactionsAnonymous;
    public long paidReactionsAnonymousTime;
    private Runnable passwordCheckRunnable;
    public PeerColors peerColors;
    private final long peerDialogRequestTimeout;
    private final LongSparseArray peerDialogsRequested;
    public Set<String> pendingSuggestions;
    private LongSparseIntArray pendingUnreadCounter;
    public SparseArray<ImageUpdater> photoSuggestion;
    public int pmReadDateExpirePeriod;
    private LongSparseArray pollsToCheck;
    private int pollsToCheckSize;
    public boolean preloadFeaturedStickers;
    public String premiumBotUsername;
    public SparseIntArray premiumFeaturesTypesToPosition;
    public String premiumInvoiceSlug;
    public boolean premiumLocked;
    public String premiumManageSubscriptionUrl;
    public LongSparseArray printingStrings;
    public LongSparseArray printingStringsTypes;
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
    public int quickRepliesLimit;
    public int quickReplyMessagesLimit;
    public int quoteLengthMax;
    public int ratingDecay;
    private LongSparseArray reactionTags;
    public int reactionsInChatMax;
    public int reactionsUniqMax;
    public int reactionsUserMaxDefault;
    public int reactionsUserMaxPremium;
    private ArrayList<ReadTask> readTasks;
    private LongSparseArray readTasksMap;
    private Runnable recentEmojiStatusUpdateRunnable;
    private long recentEmojiStatusUpdateRunnableTime;
    private long recentEmojiStatusUpdateRunnableTimeout;
    public int recommendedChannelsLimitDefault;
    public int recommendedChannelsLimitPremium;
    public boolean registeringForPush;
    private LongSparseArray reloadingMessages;
    private HashMap<String, ArrayList<MessageObject>> reloadingSavedWebpages;
    private LongSparseArray reloadingSavedWebpagesPending;
    private HashMap<String, ArrayList<MessageObject>> reloadingScheduledWebpages;
    private LongSparseArray reloadingScheduledWebpagesPending;
    private HashMap<String, ArrayList<MessageObject>> reloadingWebpages;
    private LongSparseArray reloadingWebpagesPending;
    public boolean remoteConfigLoaded;
    private ArrayList<ReadTask> repliesReadTasks;
    private Runnable requestIsUserPremiumBlockedRunnable;
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
    public boolean savedViewAsChats;
    public int secretWebpagePreview;
    public DialogFilter[] selectedDialogFilter;
    private LongSparseArray sendAsPeers;
    public LongSparseArray[] sendingTypings;
    private final HashSet<Long> sensitiveAgreed;
    private SparseBooleanArray serverDialogsEndReached;
    private LongSparseIntArray shortPollChannels;
    private LongSparseIntArray shortPollOnlines;
    public boolean showAnnualPerMonth;
    public boolean showFiltersTooltip;
    public int smallQueueMaxActiveOperations;
    public boolean smsjobsStickyNotificationEnabled;
    private DialogFilter sortingDialogFilter;
    public boolean sponsoredLinksInappAllow;
    private LongSparseArray sponsoredMessages;
    public boolean stargiftsBlocked;
    public int stargiftsMessageLengthMax;
    public boolean starsGiftsEnabled;
    public boolean starsLocked;
    public long starsPaidPostAmountMax;
    public long starsPaidReactionAmountMax;
    public long starsRevenueWithdrawalMin;
    public long starsSubscriptionAmountMax;
    public float starsUsdSellRate1000;
    public float starsUsdWithdrawRate1000;
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
    public int storiesPinnedToTopCountMax;
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
    public boolean storyQualityFull;
    public String storyVenueSearchBot;
    public boolean storyWeatherPreload;
    public boolean suggestContacts;
    public boolean suggestStickersApiOnly;
    public ArrayList<TLRPC$TL_dialogFilterSuggested> suggestedFilters;
    public String suggestedLangCode;
    public int telegramAntispamGroupSizeMin;
    public long telegramAntispamUserId;
    private Runnable themeCheckRunnable;
    private HashMap<String, ReadTask> threadsReadTasksMap;
    public String tonProxyAddress;
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
    private final LongSparseArray updatesQueueChannels;
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
    public float uploadPremiumSpeedupDownload;
    public int uploadPremiumSpeedupNotifyPeriod;
    public float uploadPremiumSpeedupUpload;
    private String uploadingAvatar;
    private HashMap<String, Object> uploadingThemes;
    public String uploadingWallpaper;
    public Theme.OverrideWallpaperInfo uploadingWallpaperInfo;
    private UserNameResolver userNameResolver;
    private final ConcurrentHashMap<Long, TLRPC$User> users;
    public String venueSearchBot;
    private ArrayList<Long> visibleDialogMainThreadIds;
    private ArrayList<Long> visibleScheduledDialogMainThreadIds;
    public String weatherSearchUsername;
    public Set<String> webAppAllowedProtocols;
    public int webFileDatacenterId;
    public String youtubePipType;
    private static volatile MessagesController[] Instance = new MessagesController[4];
    private static final Object[] lockObjects = new Object[4];

    public class AnonymousClass1 extends CacheFetcher<Integer, TLRPC$TL_help_appConfig> {
        AnonymousClass1() {
        }

        public static void lambda$getLocal$1(int r7, org.telegram.messenger.Utilities.Callback2 r8) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.AnonymousClass1.lambda$getLocal$1(int, org.telegram.messenger.Utilities$Callback2):void");
        }

        public static void lambda$getRemote$0(Utilities.Callback4 callback4, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            String str;
            int i;
            if (tLObject instanceof TLRPC$TL_help_appConfigNotModified) {
                Boolean bool = Boolean.TRUE;
                callback4.run(bool, null, 0L, bool);
                return;
            }
            if (tLObject instanceof TLRPC$TL_help_appConfig) {
                callback4.run(Boolean.FALSE, (TLRPC$TL_help_appConfig) tLObject, Long.valueOf(r5.hash), Boolean.TRUE);
                return;
            }
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

        @Override
        public void getLocal(final int i, Integer num, final Utilities.Callback2<Long, TLRPC$TL_help_appConfig> callback2) {
            MessagesController.this.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.AnonymousClass1.lambda$getLocal$1(i, callback2);
                }
            });
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

        @Override
        public void setLocal(final int i, Integer num, final TLRPC$TL_help_appConfig tLRPC$TL_help_appConfig, long j) {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.AnonymousClass1.lambda$setLocal$2(i, tLRPC$TL_help_appConfig);
                }
            });
        }

        @Override
        public boolean useCache(Integer num) {
            return false;
        }
    }

    public class AnonymousClass2 implements MessagesLoadedCallback {
        final Bundle val$bundle;
        final BaseFragment val$fragment;
        final Browser.Progress val$progress;

        AnonymousClass2(Browser.Progress progress, BaseFragment baseFragment, Bundle bundle) {
            r2 = progress;
            r3 = baseFragment;
            r4 = bundle;
        }

        @Override
        public void onError() {
            r2.end();
            r3.presentFragment(new ChatActivity(r4));
        }

        @Override
        public void onMessagesLoaded(boolean z) {
            r2.end();
            r3.presentFragment(new ChatActivity(r4));
        }
    }

    public class AnonymousClass3 implements NotificationCenter.NotificationCenterDelegate {
        final MessagesLoadedCallback val$callback;
        final int val$classGuid;
        final int val$count;
        final long val$dialogId;
        final int val$finalMessageId;

        AnonymousClass3(int i, int i2, int i3, long j, MessagesLoadedCallback messagesLoadedCallback) {
            r2 = i;
            r3 = i2;
            r4 = i3;
            r5 = j;
            r7 = messagesLoadedCallback;
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            int i3 = NotificationCenter.messagesDidLoadWithoutProcess;
            if (i != i3 || ((Integer) objArr[0]).intValue() != r2) {
                int i4 = NotificationCenter.loadingMessagesFailed;
                if (i == i4 && ((Integer) objArr[0]).intValue() == r2) {
                    MessagesController.this.getNotificationCenter().removeObserver(this, i3);
                    MessagesController.this.getNotificationCenter().removeObserver(this, i4);
                    MessagesLoadedCallback messagesLoadedCallback = r7;
                    if (messagesLoadedCallback != null) {
                        messagesLoadedCallback.onError();
                        return;
                    }
                    return;
                }
                return;
            }
            int intValue = ((Integer) objArr[1]).intValue();
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            int intValue2 = ((Integer) objArr[4]).intValue();
            int i5 = r3;
            if (intValue < i5 / 2 && !booleanValue2 && booleanValue) {
                int i6 = r4;
                MessagesController.this.loadMessagesInternal(r5, 0L, false, i5, i6, 0, false, 0, r2, i6 != 0 ? 3 : 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                return;
            }
            MessagesController.this.getNotificationCenter().removeObserver(this, i3);
            MessagesController.this.getNotificationCenter().removeObserver(this, NotificationCenter.loadingMessagesFailed);
            MessagesLoadedCallback messagesLoadedCallback2 = r7;
            if (messagesLoadedCallback2 != null) {
                messagesLoadedCallback2.onMessagesLoaded(booleanValue);
            }
        }
    }

    public class AnonymousClass4 extends CacheFetcher<Integer, TLRPC$messages_AvailableEffects> {
        AnonymousClass4() {
        }

        public static void lambda$getLocal$1(int r7, org.telegram.messenger.Utilities.Callback2 r8) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.AnonymousClass4.lambda$getLocal$1(int, org.telegram.messenger.Utilities$Callback2):void");
        }

        public static void lambda$getRemote$0(Utilities.Callback4 callback4, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            String str;
            int i;
            if (tLObject instanceof TLRPC$TL_messages_availableEffectsNotModified) {
                Boolean bool = Boolean.TRUE;
                callback4.run(bool, null, 0L, bool);
                return;
            }
            if (tLObject instanceof TLRPC$TL_messages_availableEffects) {
                callback4.run(Boolean.FALSE, (TLRPC$TL_messages_availableEffects) tLObject, Long.valueOf(r5.hash), Boolean.TRUE);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getting available effects error ");
            if (tLRPC$TL_error != null) {
                str = tLRPC$TL_error.code + " " + tLRPC$TL_error.text;
            } else {
                str = "";
            }
            sb.append(str);
            FileLog.e(sb.toString());
            callback4.run(Boolean.FALSE, null, 0L, Boolean.valueOf(tLRPC$TL_error == null || !((i = tLRPC$TL_error.code) == -2000 || i == -2001)));
        }

        public static void lambda$setLocal$2(int i, TLRPC$messages_AvailableEffects tLRPC$messages_AvailableEffects) {
            try {
                SQLiteDatabase database = MessagesStorage.getInstance(i).getDatabase();
                if (database != null) {
                    database.executeFast("DELETE FROM effects").stepThis().dispose();
                    if (tLRPC$messages_AvailableEffects != null) {
                        SQLitePreparedStatement executeFast = database.executeFast("INSERT INTO effects VALUES(?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$messages_AvailableEffects.getObjectSize());
                        tLRPC$messages_AvailableEffects.serializeToStream(nativeByteBuffer);
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

        @Override
        public boolean emitLocal(Integer num) {
            return true;
        }

        @Override
        public void getLocal(final int i, Integer num, final Utilities.Callback2<Long, TLRPC$messages_AvailableEffects> callback2) {
            MessagesController.this.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.AnonymousClass4.lambda$getLocal$1(i, callback2);
                }
            });
        }

        @Override
        public void getRemote(int i, Integer num, long j, final Utilities.Callback4<Boolean, TLRPC$messages_AvailableEffects, Long, Boolean> callback4) {
            TLRPC$TL_messages_getAvailableEffects tLRPC$TL_messages_getAvailableEffects = new TLRPC$TL_messages_getAvailableEffects();
            tLRPC$TL_messages_getAvailableEffects.hash = (int) j;
            MessagesController.this.getConnectionsManager().sendRequest(tLRPC$TL_messages_getAvailableEffects, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.AnonymousClass4.lambda$getRemote$0(Utilities.Callback4.this, tLObject, tLRPC$TL_error);
                }
            });
        }

        @Override
        protected long getSavedLastTimeRequested(int i) {
            return MessagesController.this.mainPreferences.getLong("effects_last_" + i, 0L);
        }

        @Override
        protected boolean saveLastTimeRequested() {
            return true;
        }

        @Override
        public void setLocal(final int i, Integer num, final TLRPC$messages_AvailableEffects tLRPC$messages_AvailableEffects, long j) {
            MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.AnonymousClass4.lambda$setLocal$2(i, tLRPC$messages_AvailableEffects);
                }
            });
        }

        @Override
        protected void setSavedLastTimeRequested(int i, long j) {
            MessagesController.this.mainPreferences.edit().putLong("effects_last_" + i, j).apply();
        }
    }

    public static class ChannelRecommendations {
        public final ArrayList<TLRPC$Chat> chats = new ArrayList<>();
        public int more;
        public boolean wasPremium;

        public static boolean hasRecommendations(int i, long j) {
            return hasRecommendations(MessagesController.getInstance(i).getChannelRecommendations(j));
        }

        public static boolean hasRecommendations(ChannelRecommendations channelRecommendations) {
            return (channelRecommendations == null || channelRecommendations.chats.isEmpty()) ? false : true;
        }
    }

    public class ChatlistUpdatesStat {
        long lastRequestTime;
        TL_chatlists$TL_chatlists_chatlistUpdates lastValue;
        boolean loading;

        public ChatlistUpdatesStat() {
            this.loading = true;
        }

        public ChatlistUpdatesStat(TL_chatlists$TL_chatlists_chatlistUpdates tL_chatlists$TL_chatlists_chatlistUpdates) {
            this.loading = false;
            this.lastRequestTime = System.currentTimeMillis();
            this.lastValue = tL_chatlists$TL_chatlists_chatlistUpdates;
        }
    }

    public static class DialogFilter {
        private static int dialogFilterPointer = 10;
        public int color;
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

        public boolean includesDialog(AccountInstance accountInstance, long j) {
            TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) accountInstance.getMessagesController().dialogs_dict.get(j);
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
            if (((this.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0 && messagesController.isDialogMuted(tLRPC$Dialog.id, 0L) && tLRPC$Dialog.unread_mentions_count == 0) || ((this.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && messagesController.getDialogUnreadCount(tLRPC$Dialog) == 0 && !tLRPC$Dialog.unread_mark && tLRPC$Dialog.unread_mentions_count == 0)) {
                return false;
            }
            if (j > 0) {
                TLRPC$User user = messagesController.getUser(Long.valueOf(j));
                if (user != null) {
                    if (user.bot) {
                        if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
                            return true;
                        }
                    } else if (user.self || user.contact || contactsController.isContact(j)) {
                        if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
                            return true;
                        }
                    } else if ((this.flags & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
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

        public boolean isChatlist() {
            return (this.flags & MessagesController.DIALOG_FILTER_FLAG_CHATLIST) > 0;
        }

        public boolean isDefault() {
            return this.id == 0;
        }

        public boolean isMyChatlist() {
            return isChatlist() && (this.flags & MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN) > 0;
        }
    }

    public class DialogPhotos {
        public static final int STEP = 80;
        public final long dialogId;
        private boolean loading;
        public final ArrayList<TLRPC$Photo> photos = new ArrayList<>();
        public boolean fromCache = true;
        public boolean loaded = false;

        public DialogPhotos(long j) {
            this.dialogId = j;
        }

        public void lambda$load$0(TLRPC$photos_Photos tLRPC$photos_Photos, int i, int i2) {
            MessagesController.this.putUsers(tLRPC$photos_Photos.users, false);
            onLoaded(i, i2, tLRPC$photos_Photos);
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

        public void lambda$load$2(TLRPC$messages_Messages tLRPC$messages_Messages, int i, int i2) {
            TLRPC$Photo tLRPC$Photo;
            MessagesController.this.putUsers(tLRPC$messages_Messages.users, false);
            MessagesController.this.putChats(tLRPC$messages_Messages.chats, false);
            TLRPC$TL_photos_photos tLRPC$TL_photos_photos = new TLRPC$TL_photos_photos();
            tLRPC$TL_photos_photos.count = tLRPC$messages_Messages.count;
            for (int i3 = 0; i3 < tLRPC$messages_Messages.messages.size(); i3++) {
                TLRPC$MessageAction tLRPC$MessageAction = ((TLRPC$Message) tLRPC$messages_Messages.messages.get(i3)).action;
                if (tLRPC$MessageAction != null && (tLRPC$Photo = tLRPC$MessageAction.photo) != null) {
                    tLRPC$TL_photos_photos.photos.add(tLRPC$Photo);
                }
            }
            onLoaded(i, i2, tLRPC$TL_photos_photos);
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

        public void lambda$loadCache$5() {
            int i;
            int readInt32;
            int i2 = 0;
            SQLiteDatabase database = MessagesController.this.getMessagesStorage().getDatabase();
            final HashMap hashMap = new HashMap();
            SQLiteCursor sQLiteCursor = null;
            try {
                try {
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = database.queryFinalized(String.format(locale, "SELECT count FROM dialog_photos_count WHERE uid = %d", Long.valueOf(this.dialogId)), new Object[0]);
                    try {
                        try {
                            i = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                            try {
                                queryFinalized.dispose();
                                try {
                                    SQLiteCursor queryFinalized2 = database.queryFinalized(String.format(locale, "SELECT num, data FROM dialog_photos WHERE uid = %d", Long.valueOf(this.dialogId)), new Object[0]);
                                    while (queryFinalized2.next()) {
                                        try {
                                            int intValue = queryFinalized2.intValue(0);
                                            NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(1);
                                            TLRPC$Photo TLdeserialize = (byteBufferValue == null || (readInt32 = byteBufferValue.readInt32(false)) == 1450380236) ? null : TLRPC$Photo.TLdeserialize(byteBufferValue, readInt32, false);
                                            if (TLdeserialize != null) {
                                                i = Math.max(intValue + 1, i);
                                                hashMap.put(Integer.valueOf(intValue), TLdeserialize);
                                            }
                                        } catch (Exception unused) {
                                            sQLiteCursor = queryFinalized2;
                                            i2 = i;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            i = i2;
                                            final int max = Math.max(i, hashMap.size());
                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    MessagesController.DialogPhotos.this.lambda$loadCache$4(max, hashMap);
                                                }
                                            });
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteCursor = queryFinalized2;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                    queryFinalized2.dispose();
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                sQLiteCursor = queryFinalized;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = queryFinalized;
                        }
                    } catch (Exception unused4) {
                        sQLiteCursor = queryFinalized;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception unused5) {
            }
            final int max2 = Math.max(i, hashMap.size());
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.DialogPhotos.this.lambda$loadCache$4(max2, hashMap);
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
                    if (this.photos.get(i4) != null && this.photos.get(i4).id != ((TLRPC$Photo) tLRPC$photos_Photos.photos.get(i3)).id) {
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
                    this.photos.add((i6 < 0 || i6 >= tLRPC$photos_Photos.photos.size()) ? null : (TLRPC$Photo) tLRPC$photos_Photos.photos.get(i6));
                }
            } else {
                for (int i7 = 0; i7 < tLRPC$photos_Photos.photos.size(); i7++) {
                    this.photos.set(i + i7, (TLRPC$Photo) tLRPC$photos_Photos.photos.get(i7));
                }
            }
            saveCache();
            MessagesController.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogPhotosUpdate, this);
            if (z || i != 0 || i2 >= this.photos.size() || this.photos.size() - i2 <= 80) {
                return;
            }
            load(this.photos.size() - 80, 80);
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

        private void saveCache() {
            MessagesController.this.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.DialogPhotos.this.lambda$saveCache$6();
                }
            });
        }

        public void addPhotoAtStart(TLRPC$Photo tLRPC$Photo) {
        }

        public int getCount() {
            return this.photos.size();
        }

        public void load(final int i, final int i2) {
            if (this.loading || i2 <= 0 || i < 0) {
                return;
            }
            this.loading = true;
            long j = this.dialogId;
            if (j < 0) {
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
                return;
            }
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
        }

        public void loadAfter(int i, boolean z) {
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
            for (int i3 = 0; i3 < this.photos.size(); i3++) {
                if (this.photos.get(i3) == null) {
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
                            } else {
                                i2++;
                            }
                        }
                        if (i2 <= 0) {
                            return;
                        }
                    } else {
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
                            } else {
                                i2++;
                            }
                        }
                        if (i2 <= 0) {
                            return;
                        } else {
                            i -= i2;
                        }
                    }
                    load(i, i2);
                    return;
                }
            }
        }

        public void loadCache() {
            MessagesController.this.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.DialogPhotos.this.lambda$loadCache$5();
                }
            });
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

        public void removePhoto(long j) {
            if (removePhotoInternal(j)) {
                saveCache();
                MessagesController.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogPhotosUpdate, this);
            }
        }

        public void reset() {
            this.photos.clear();
            this.fromCache = true;
            saveCache();
        }
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

    public interface ErrorDelegate {
        boolean run(TLRPC$TL_error tLRPC$TL_error);
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

    public static class PeerColor {
        public int channelLvl;
        private final int[] colors = new int[6];
        private final int[] darkColors = new int[6];
        public int groupLvl;
        public boolean hidden;
        public int id;
        public boolean isDefaultName;

        public static PeerColor fromString(String str) {
            int i;
            int i2;
            int i3;
            int indexOf;
            if (str != null && !str.isEmpty()) {
                if (str.charAt(0) == '#') {
                    boolean z = str.length() > 1 && str.charAt(1) == 'H';
                    int i4 = z ? 2 : 1;
                    if (str.length() <= i4 || str.charAt(i4) != '[' || (indexOf = str.indexOf(93)) <= i4) {
                        i = i4;
                        i2 = 0;
                        i3 = 0;
                    } else {
                        String substring = str.substring(i4 + 1, indexOf);
                        if (substring.contains(",")) {
                            String[] split = substring.split(",");
                            i3 = Utilities.parseInt((CharSequence) split[0]).intValue();
                            i2 = Utilities.parseInt((CharSequence) split[1]).intValue();
                        } else {
                            i3 = Utilities.parseInt((CharSequence) substring).intValue();
                            i2 = 0;
                        }
                        i = indexOf + 1;
                    }
                    int indexOf2 = str.indexOf(123);
                    if (indexOf2 < 0) {
                        return null;
                    }
                    try {
                        PeerColor peerColor = new PeerColor();
                        peerColor.id = Utilities.parseInt((CharSequence) str.substring(i, indexOf2)).intValue();
                        peerColor.hidden = z;
                        peerColor.channelLvl = i3;
                        peerColor.groupLvl = i2;
                        String[] split2 = str.substring(indexOf2 + 1, str.length() - 1).split("@");
                        String[] split3 = split2[0].split(",");
                        int i5 = 0;
                        while (i5 < 6) {
                            int[] iArr = peerColor.colors;
                            int i6 = i5 + 1;
                            iArr[i5] = split3.length >= i6 ? Utilities.parseInt((CharSequence) split3[i5]).intValue() : iArr[0];
                            i5 = i6;
                        }
                        if (split2.length >= 2) {
                            String[] split4 = split2[1].split(",");
                            int i7 = 0;
                            while (i7 < 6) {
                                int[] iArr2 = peerColor.darkColors;
                                int i8 = i7 + 1;
                                iArr2[i7] = split4.length >= i8 ? Utilities.parseInt((CharSequence) split4[i7]).intValue() : iArr2[0];
                                i7 = i8;
                            }
                        } else {
                            for (int i9 = 0; i9 < 6; i9++) {
                                peerColor.darkColors[i9] = peerColor.colors[i9];
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

        public static PeerColor fromTL(TLRPC$TL_help_peerColorOption tLRPC$TL_help_peerColorOption) {
            if (tLRPC$TL_help_peerColorOption == null) {
                return null;
            }
            PeerColor peerColor = new PeerColor();
            peerColor.id = tLRPC$TL_help_peerColorOption.color_id;
            peerColor.hidden = tLRPC$TL_help_peerColorOption.hidden;
            int i = tLRPC$TL_help_peerColorOption.flags;
            if ((i & 8) != 0) {
                peerColor.channelLvl = tLRPC$TL_help_peerColorOption.channel_min_level;
            }
            if ((i & 16) != 0) {
                peerColor.groupLvl = tLRPC$TL_help_peerColorOption.group_min_level;
            }
            System.arraycopy(optionToColors(tLRPC$TL_help_peerColorOption.colors), 0, peerColor.colors, 0, 6);
            System.arraycopy(optionToColors(tLRPC$TL_help_peerColorOption.dark_colors), 0, peerColor.darkColors, 0, 6);
            return peerColor;
        }

        public static int[] optionToColors(TLRPC$help_PeerColorSet tLRPC$help_PeerColorSet) {
            ArrayList arrayList;
            int[] iArr = new int[6];
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            iArr[5] = 0;
            if (tLRPC$help_PeerColorSet instanceof TLRPC$TL_help_peerColorSet) {
                arrayList = ((TLRPC$TL_help_peerColorSet) tLRPC$help_PeerColorSet).colors;
            } else if (tLRPC$help_PeerColorSet instanceof TLRPC$TL_help_peerColorProfileSet) {
                TLRPC$TL_help_peerColorProfileSet tLRPC$TL_help_peerColorProfileSet = (TLRPC$TL_help_peerColorProfileSet) tLRPC$help_PeerColorSet;
                ArrayList arrayList2 = tLRPC$TL_help_peerColorProfileSet.palette_colors;
                ArrayList arrayList3 = tLRPC$TL_help_peerColorProfileSet.bg_colors;
                ArrayList arrayList4 = tLRPC$TL_help_peerColorProfileSet.story_colors;
                ArrayList arrayList5 = new ArrayList();
                if (arrayList2 != null) {
                    for (int i = 0; i < Math.min(2, arrayList2.size()); i++) {
                        arrayList5.add((Integer) arrayList2.get(i));
                    }
                }
                if (arrayList3 != null) {
                    for (int i2 = 0; i2 < Math.min(2, arrayList3.size()); i2++) {
                        arrayList5.add((Integer) arrayList3.get(i2));
                    }
                }
                if (arrayList4 != null) {
                    for (int i3 = 0; i3 < Math.min(2, arrayList4.size()); i3++) {
                        arrayList5.add((Integer) arrayList4.get(i3));
                    }
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Arrays.fill(iArr, ((Integer) arrayList.get(0)).intValue() | (-16777216));
                }
                for (int i4 = 0; i4 < Math.min(6, arrayList.size()); i4++) {
                    iArr[i4] = ((Integer) arrayList.get(i4)).intValue() | (-16777216);
                }
            }
            return iArr;
        }

        public void appendString(StringBuilder sb) {
            sb.append("#");
            if (this.hidden) {
                sb.append("H");
            }
            if (this.channelLvl != 0 || this.groupLvl != 0) {
                sb.append("[");
                sb.append(this.channelLvl);
                sb.append(",");
                sb.append(this.groupLvl);
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
                int i = iArr2[2];
                int i2 = iArr2[0];
                if (i != i2 || iArr2[3] != i2) {
                    sb.append(",");
                    sb.append(this.colors[2]);
                    sb.append(",");
                    sb.append(this.colors[3]);
                    int[] iArr3 = this.colors;
                    int i3 = iArr3[4];
                    int i4 = iArr3[0];
                    if (i3 != i4 || iArr3[5] != i4) {
                        sb.append(",");
                        sb.append(this.colors[4]);
                        sb.append(",");
                        sb.append(this.colors[5]);
                    }
                }
            }
            int[] iArr4 = this.darkColors;
            int i5 = iArr4[0];
            int[] iArr5 = this.colors;
            if (i5 != iArr5[0] || iArr4[1] != iArr5[1] || iArr4[2] != iArr5[2]) {
                sb.append("@");
                sb.append(this.darkColors[0]);
                int[] iArr6 = this.darkColors;
                if (iArr6[1] != iArr6[0]) {
                    sb.append(",");
                    sb.append(this.darkColors[1]);
                    int[] iArr7 = this.darkColors;
                    int i6 = iArr7[2];
                    int i7 = iArr7[0];
                    if (i6 != i7 || iArr7[3] != i7) {
                        sb.append(",");
                        sb.append(this.darkColors[2]);
                        sb.append(",");
                        sb.append(this.darkColors[3]);
                        int[] iArr8 = this.darkColors;
                        int i8 = iArr8[4];
                        int i9 = iArr8[0];
                        if (i8 != i9 || iArr8[5] != i9) {
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

        public int getAvatarColor1() {
            return ColorUtils.blendARGB(getBgColor2(false), getStoryColor2(false), 0.5f);
        }

        public int getAvatarColor2() {
            return ColorUtils.blendARGB(getBgColor1(false), getStoryColor1(false), 0.5f);
        }

        public int getBgColor1(boolean z) {
            return hasColor6(z) ? getColor3(z) : getColor2(z);
        }

        public int getBgColor2(boolean z) {
            return hasColor6(z) ? getColor4(z) : getColor2(z);
        }

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

        public int getColor1() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[0];
        }

        public int getColor1(boolean z) {
            return (z ? this.darkColors : this.colors)[0];
        }

        public int getColor2() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[1];
        }

        public int getColor2(boolean z) {
            return (z ? this.darkColors : this.colors)[1];
        }

        public int getColor3() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[2];
        }

        public int getColor3(boolean z) {
            return (z ? this.darkColors : this.colors)[2];
        }

        public int getColor4() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[3];
        }

        public int getColor4(boolean z) {
            return (z ? this.darkColors : this.colors)[3];
        }

        public int getColor5() {
            return (Theme.isCurrentThemeDark() ? this.darkColors : this.colors)[4];
        }

        public int getColor5(boolean z) {
            return (z ? this.darkColors : this.colors)[4];
        }

        public int getColor6(boolean z) {
            return (z ? this.darkColors : this.colors)[5];
        }

        public int getLvl(boolean z) {
            return z ? this.groupLvl : this.channelLvl;
        }

        public int getStoryColor1(boolean z) {
            return hasColor6(z) ? getColor5(z) : getColor3(z);
        }

        public int getStoryColor2(boolean z) {
            return hasColor6(z) ? getColor6(z) : getColor4(z);
        }

        public boolean hasColor2() {
            return getColor2() != getColor1();
        }

        public boolean hasColor2(boolean z) {
            return getColor2(z) != getColor1(z);
        }

        public boolean hasColor3() {
            return getColor3() != getColor1();
        }

        public boolean hasColor3(boolean z) {
            return getColor3(z) != getColor1(z);
        }

        public boolean hasColor6(boolean z) {
            return getColor6(z) != getColor1(z);
        }
    }

    public static class PeerColors {
        public static final int TYPE_NAME = 0;
        public static final int TYPE_PROFILE = 1;
        public final ArrayList<PeerColor> colors = new ArrayList<>();
        private final LongSparseArray colorsById = new LongSparseArray();
        public final int hash;
        public final int type;

        private PeerColors(int i, int i2) {
            this.type = i;
            this.hash = i2;
        }

        private static int color(String str) {
            return MessagesController$PeerColors$$ExternalSyntheticBackport0.m("ff" + str, 16);
        }

        public static PeerColors fromJSON(int i, TLRPC$TL_jsonObject tLRPC$TL_jsonObject, TLRPC$TL_jsonObject tLRPC$TL_jsonObject2, TLRPC$TL_jsonArray tLRPC$TL_jsonArray) {
            try {
                PeerColors peerColors = new PeerColors(i, 0);
                if (tLRPC$TL_jsonObject != null) {
                    Iterator it = tLRPC$TL_jsonObject.value.iterator();
                    while (it.hasNext()) {
                        TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue = (TLRPC$TL_jsonObjectValue) it.next();
                        int intValue = Utilities.parseInt((CharSequence) tLRPC$TL_jsonObjectValue.key).intValue();
                        TLRPC$JSONValue tLRPC$JSONValue = tLRPC$TL_jsonObjectValue.value;
                        if (tLRPC$JSONValue instanceof TLRPC$TL_jsonArray) {
                            ArrayList arrayList = ((TLRPC$TL_jsonArray) tLRPC$JSONValue).value;
                            if (!arrayList.isEmpty()) {
                                PeerColor peerColor = new PeerColor();
                                try {
                                    peerColor.id = intValue;
                                    int i2 = 0;
                                    while (i2 < 6) {
                                        int[] iArr = peerColor.colors;
                                        int[] iArr2 = peerColor.darkColors;
                                        int color = arrayList.size() > i2 ? color(((TLRPC$TL_jsonString) arrayList.get(i2)).value) : peerColor.colors[0];
                                        iArr2[i2] = color;
                                        iArr[i2] = color;
                                        i2++;
                                    }
                                    peerColor.isDefaultName = peerColor.id < 7 && i == 0;
                                    peerColors.colorsById.put(intValue, peerColor);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                        }
                    }
                }
                if (tLRPC$TL_jsonObject2 != null) {
                    Iterator it2 = tLRPC$TL_jsonObject2.value.iterator();
                    while (it2.hasNext()) {
                        TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue2 = (TLRPC$TL_jsonObjectValue) it2.next();
                        int intValue2 = Utilities.parseInt((CharSequence) tLRPC$TL_jsonObjectValue2.key).intValue();
                        TLRPC$JSONValue tLRPC$JSONValue2 = tLRPC$TL_jsonObjectValue2.value;
                        if (tLRPC$JSONValue2 instanceof TLRPC$TL_jsonArray) {
                            ArrayList arrayList2 = ((TLRPC$TL_jsonArray) tLRPC$JSONValue2).value;
                            if (!arrayList2.isEmpty()) {
                                long j = intValue2;
                                PeerColor peerColor2 = (PeerColor) peerColors.colorsById.get(j);
                                if (peerColor2 != null) {
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
                }
                peerColors.colors.clear();
                if (tLRPC$TL_jsonArray != null) {
                    Iterator it3 = tLRPC$TL_jsonArray.value.iterator();
                    while (it3.hasNext()) {
                        if (((TLRPC$JSONValue) it3.next()) instanceof TLRPC$TL_jsonNumber) {
                            PeerColor peerColor3 = (PeerColor) peerColors.colorsById.get((int) ((TLRPC$TL_jsonNumber) r11).value);
                            if (peerColor3 != null) {
                                peerColors.colors.add(peerColor3);
                            }
                        }
                    }
                }
                return peerColors;
            } catch (Exception e3) {
                FileLog.e(e3);
                return null;
            }
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

        public static PeerColors fromTL(int i, TLRPC$TL_help_peerColors tLRPC$TL_help_peerColors) {
            if (tLRPC$TL_help_peerColors == null) {
                return null;
            }
            try {
                PeerColors peerColors = new PeerColors(i, tLRPC$TL_help_peerColors.hash);
                for (int i2 = 0; i2 < tLRPC$TL_help_peerColors.colors.size(); i2++) {
                    PeerColor fromTL = PeerColor.fromTL((TLRPC$TL_help_peerColorOption) tLRPC$TL_help_peerColors.colors.get(i2));
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

        public int colorsAvailable(int i, boolean z) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.colors.size(); i3++) {
                PeerColor peerColor = this.colors.get(i3);
                if (!peerColor.hidden && i >= peerColor.getLvl(z)) {
                    i2++;
                }
            }
            return i2;
        }

        public PeerColor getColor(int i) {
            return (PeerColor) this.colorsById.get(i);
        }

        public int maxLevel() {
            return maxLevel(false);
        }

        public int maxLevel(boolean z) {
            int i = 0;
            for (int i2 = 0; i2 < this.colors.size(); i2++) {
                PeerColor peerColor = this.colors.get(i2);
                if (!peerColor.hidden) {
                    i = Math.max(i, peerColor.getLvl(z));
                }
            }
            return i;
        }

        public int minLevel() {
            return minLevel(false);
        }

        public int minLevel(boolean z) {
            int maxLevel = maxLevel(z);
            for (int i = 0; i < this.colors.size(); i++) {
                PeerColor peerColor = this.colors.get(i);
                if (!peerColor.hidden) {
                    maxLevel = Math.min(maxLevel, peerColor.getLvl(z));
                }
            }
            return maxLevel;
        }

        public boolean needUpdate() {
            boolean z = true;
            boolean z2 = false;
            for (int i = 0; i < this.colors.size(); i++) {
                if (this.colors.get(i).channelLvl > 0) {
                    z = false;
                }
                if (this.colors.get(i).id < 7) {
                    z2 = true;
                }
            }
            if (this.type == 1 && !z) {
                Iterator<PeerColor> it = this.colors.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    if (it.next().groupLvl > 0) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                return true;
            }
            return this.type == 0 && !z2;
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
    }

    public static class PrintingUser {
        public TLRPC$SendMessageAction action;
        public long lastTime;
        public long userId;
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

    public class SendAsPeersInfo {
        private long loadTime;
        private boolean loading;
        private TLRPC$TL_channels_sendAsPeers sendAsPeers;

        private SendAsPeersInfo() {
        }

        SendAsPeersInfo(MessagesController messagesController, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public class SponsoredMessagesInfo {
        public boolean faked;
        public long loadTime;
        public boolean loading;
        public ArrayList<MessageObject> messages;
        public Integer posts_between;

        public SponsoredMessagesInfo() {
        }
    }

    public static class UserActionUpdatesPts extends TLRPC$Updates {
        private UserActionUpdatesPts() {
        }

        UserActionUpdatesPts(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class UserActionUpdatesSeq extends TLRPC$Updates {
        private UserActionUpdatesSeq() {
        }

        UserActionUpdatesSeq(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public MessagesController(int i) {
        super(i);
        Context context;
        String str;
        this.chats = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.encryptedChats = new ConcurrentHashMap<>(10, 1.0f, 2);
        this.users = new ConcurrentHashMap<>(100, 1.0f, 3);
        this.objectsByUsernames = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.activeVoiceChatsMap = new HashMap<>();
        this.joiningToChannels = new ArrayList<>();
        this.exportedChats = new LongSparseArray();
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
        this.dialogsLoadedTillDate = Integer.MAX_VALUE;
        this.dialogs_read_inbox_max = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.dialogs_read_outbox_max = new ConcurrentHashMap<>(100, 1.0f, 2);
        this.dialogs_dict = new LongSparseArray();
        this.dialogMessage = new LongSparseArray();
        this.dialogMessagesByRandomIds = new LongSparseArray();
        this.deletedHistory = new LongSparseIntArray();
        this.dialogMessagesByIds = new SparseArray<>();
        this.printingUsers = new ConcurrentHashMap<>(20, 1.0f, 2);
        this.printingStrings = new LongSparseArray();
        this.printingStringsTypes = new LongSparseArray();
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
        this.loadingPeerSettings = new LongSparseArray();
        this.createdDialogIds = new ArrayList<>();
        this.createdScheduledDialogIds = new ArrayList<>();
        this.createdDialogMainThreadIds = new ArrayList<>();
        this.visibleDialogMainThreadIds = new ArrayList<>();
        this.visibleScheduledDialogMainThreadIds = new ArrayList<>();
        this.shortPollChannels = new LongSparseIntArray();
        this.needShortPollChannels = new LongSparseArray();
        this.shortPollOnlines = new LongSparseIntArray();
        this.needShortPollOnlines = new LongSparseArray();
        this.deletingDialogs = new LongSparseArray();
        this.clearingHistoryDialogs = new LongSparseArray();
        this.loadingBlockedPeers = false;
        this.blockePeers = new LongSparseIntArray();
        this.totalBlockedCount = -1;
        this.channelViewsToSend = new LongSparseArray();
        this.pollsToCheck = new LongSparseArray();
        this.premiumFeaturesTypesToPosition = new SparseIntArray();
        this.businessFeaturesTypesToPosition = new SparseIntArray();
        this.dialogFilters = new ArrayList<>();
        this.frozenDialogFilters = null;
        this.hiddenUndoChats = new ArrayList<>();
        this.dialogFiltersById = new SparseArray<>();
        this.suggestedFilters = new ArrayList<>();
        this.updatesQueueChannels = new LongSparseArray();
        this.updatesStartWaitTimeChannels = new LongSparseLongArray();
        this.channelsPts = new LongSparseIntArray();
        this.gettingDifferenceChannels = new LongSparseArray();
        this.gettingChatInviters = new LongSparseArray();
        this.gettingUnknownChannels = new LongSparseArray();
        this.gettingUnknownDialogs = new LongSparseArray();
        this.checkingLastMessagesDialogs = new LongSparseArray();
        this.updatesQueueSeq = new ArrayList<>();
        this.updatesQueuePts = new ArrayList<>();
        this.updatesQueueQts = new ArrayList<>();
        this.fullUsers = new LongSparseArray();
        this.fullChats = new LongSparseArray();
        this.groupCalls = new LongSparseArray();
        this.groupCallsByChatId = new LongSparseArray();
        this.loadingFullUsers = new HashSet<>();
        this.loadedFullUsers = new LongSparseLongArray();
        this.loadingFullChats = new HashSet<>();
        this.loadingGroupCalls = new HashSet<>();
        this.loadingFullParticipants = new HashSet<>();
        this.loadedFullParticipants = new HashSet<>();
        this.loadedFullChats = new LongSparseLongArray();
        this.channelAdmins = new LongSparseArray();
        this.loadingChannelAdmins = new LongSparseIntArray();
        this.migratedChats = new SparseIntArray();
        this.sponsoredMessages = new LongSparseArray();
        this.sendAsPeers = new LongSparseArray();
        this.reloadingWebpages = new HashMap<>();
        this.reloadingWebpagesPending = new LongSparseArray();
        this.reloadingScheduledWebpages = new HashMap<>();
        this.reloadingScheduledWebpagesPending = new LongSparseArray();
        this.reloadingSavedWebpages = new HashMap<>();
        this.reloadingSavedWebpagesPending = new LongSparseArray();
        this.lastScheduledServerQueryTime = new LongSparseArray();
        this.lastQuickReplyServerQueryTime = new LongSparseArray();
        this.lastSavedServerQueryTime = new LongSparseArray();
        this.lastServerQueryTime = new LongSparseArray();
        this.reloadingMessages = new LongSparseArray();
        this.readTasks = new ArrayList<>();
        this.readTasksMap = new LongSparseArray();
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
        this.themeCheckRunnable = new MessagesController$$ExternalSyntheticLambda91();
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
        this.showAnnualPerMonth = false;
        this.directPaymentsCurrency = new ArrayList();
        this.emojiStatusUntilValues = new LongSparseArray();
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
        this.loadAppConfigRunnable = new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.loadAppConfig();
            }
        };
        this.notifyTranscriptionAudioCooldownUpdate = new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$new$34();
            }
        };
        this.peerDialogsRequested = new LongSparseArray();
        this.peerDialogRequestTimeout = 240000L;
        this.dialogPhotos = new LongSparseArray();
        this.DIALOGS_LOAD_TYPE_CACHE = 1;
        this.DIALOGS_LOAD_TYPE_CHANNEL = 2;
        this.DIALOGS_LOAD_TYPE_UNKNOWN = 3;
        this.sensitiveAgreed = new HashSet<>();
        this.cachedIsUserPremiumBlocked = new LongSparseArray();
        this.loadingIsUserPremiumBlocked = new HashSet<>();
        this.requestIsUserPremiumBlockedRunnable = new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.requestIsUserPremiumBlocked();
            }
        };
        this.effectsFetcher = new AnonymousClass4();
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
            context = ApplicationLoader.applicationContext;
            str = "emoji";
        } else {
            this.notificationsPreferences = ApplicationLoader.applicationContext.getSharedPreferences("Notifications" + this.currentAccount, 0);
            this.mainPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig" + this.currentAccount, 0);
            context = ApplicationLoader.applicationContext;
            str = "emoji" + this.currentAccount;
        }
        this.emojiPreferences = context.getSharedPreferences(str, 0);
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
        this.maxMessageLength = this.mainPreferences.getInt("maxMessageLength", 4096);
        this.maxCaptionLength = this.mainPreferences.getInt("maxCaptionLength", 1024);
        this.mapProvider = this.mainPreferences.getInt("mapProvider", 0);
        this.availableMapProviders = this.mainPreferences.getInt("availableMapProviders", 3);
        this.mapKey = this.mainPreferences.getString("pk", null);
        this.installReferer = this.mainPreferences.getString("installReferer", null);
        this.revokeTimeLimit = this.mainPreferences.getInt("revokeTimeLimit", Integer.MAX_VALUE);
        this.revokeTimePmLimit = this.mainPreferences.getInt("revokeTimePmLimit", Integer.MAX_VALUE);
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
        this.smsjobsStickyNotificationEnabled = this.mainPreferences.getBoolean("smsjobsStickyNotificationEnabled", false);
        this.showFiltersTooltip = this.mainPreferences.getBoolean("showFiltersTooltip", false);
        this.autoarchiveAvailable = this.mainPreferences.getBoolean("autoarchiveAvailable", false);
        this.groupCallVideoMaxParticipants = this.mainPreferences.getInt("groipCallVideoMaxParticipants", 30);
        this.chatReadMarkSizeThreshold = this.mainPreferences.getInt("chatReadMarkSizeThreshold", 100);
        this.chatReadMarkExpirePeriod = this.mainPreferences.getInt("chatReadMarkExpirePeriod", 604800);
        this.ringtoneDurationMax = this.mainPreferences.getInt("ringtoneDurationMax", 5);
        this.ringtoneSizeMax = this.mainPreferences.getInt("ringtoneSizeMax", 102400);
        this.pmReadDateExpirePeriod = this.mainPreferences.getInt("pmReadDateExpirePeriod", 604800);
        this.suggestStickersApiOnly = this.mainPreferences.getBoolean("suggestStickersApiOnly", false);
        this.roundVideoSize = this.mainPreferences.getInt("roundVideoSize", 384);
        this.roundVideoBitrate = this.mainPreferences.getInt("roundVideoBitrate", 1000);
        this.roundAudioBitrate = this.mainPreferences.getInt("roundAudioBitrate", 64);
        this.pendingSuggestions = this.mainPreferences.getStringSet("pendingSuggestions", null);
        this.dismissedSuggestions = this.mainPreferences.getStringSet("dismissedSuggestions", null);
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
        this.captionLengthLimitPremium = this.mainPreferences.getInt("captionLengthLimitPremium", 4096);
        this.storyCaptionLengthLimitDefault = this.mainPreferences.getInt("storyCaptionLengthLimit", 200);
        this.storyCaptionLengthLimitPremium = this.mainPreferences.getInt("storyCaptionLengthLimitPremium", 2048);
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
        this.starsLocked = this.mainPreferences.getBoolean("starsLocked", true);
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
        this.groupProfileBgIconLevelMin = this.mainPreferences.getInt("groupProfileBgIconLevelMin", 1);
        this.groupEmojiStatusLevelMin = this.mainPreferences.getInt("groupEmojiStatusLevelMin", 1);
        this.groupEmojiStickersLevelMin = this.mainPreferences.getInt("groupEmojiStickersLevelMin", 1);
        this.groupWallpaperLevelMin = this.mainPreferences.getInt("groupWallpaperLevelMin", 1);
        this.groupCustomWallpaperLevelMin = this.mainPreferences.getInt("groupCustomWallpaperLevelMin", 1);
        this.groupTranscribeLevelMin = this.mainPreferences.getInt("groupTranscribeLevelMin", 1);
        this.quickRepliesLimit = this.mainPreferences.getInt("quickRepliesLimit", 10);
        this.quickReplyMessagesLimit = this.mainPreferences.getInt("quickReplyMessagesLimit", 20);
        this.channelWallpaperLevelMin = this.mainPreferences.getInt("channelWallpaperLevelMin", 1);
        this.channelCustomWallpaperLevelMin = this.mainPreferences.getInt("channelCustomWallpaperLevelMin", 1);
        this.chatlistInvitesLimitPremium = this.mainPreferences.getInt("chatlistInvitesLimitPremium", z ? 5 : 20);
        this.chatlistJoinedLimitDefault = this.mainPreferences.getInt("chatlistJoinedLimitDefault", 2);
        this.chatlistJoinedLimitPremium = this.mainPreferences.getInt("chatlistJoinedLimitPremium", z ? 5 : 20);
        this.stargiftsMessageLengthMax = this.mainPreferences.getInt("stargiftsMessageLengthMax", 255);
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
        this.channelRestrictSponsoredLevelMin = this.mainPreferences.getInt("channelRestrictSponsoredLevelMin", 30);
        this.savedDialogsPinnedLimitDefault = this.mainPreferences.getInt("savedDialogsPinnedLimitDefault", 4);
        this.savedDialogsPinnedLimitPremium = this.mainPreferences.getInt("savedDialogsPinnedLimitPremium", 6);
        this.storyQualityFull = this.mainPreferences.getBoolean("storyQualityFull", true);
        this.savedViewAsChats = this.mainPreferences.getBoolean("savedViewAsChats", false);
        this.folderTags = this.mainPreferences.getBoolean("folderTags", false);
        this.uploadPremiumSpeedupUpload = this.mainPreferences.getFloat("uploadPremiumSpeedupUpload", 10.0f);
        this.uploadPremiumSpeedupDownload = this.mainPreferences.getFloat("uploadPremiumSpeedupDownload", 10.0f);
        this.uploadPremiumSpeedupNotifyPeriod = this.mainPreferences.getInt("uploadPremiumSpeedupNotifyPeriod2", 3600);
        this.introTitleLengthLimit = this.mainPreferences.getInt("introTitleLengthLimit", 32);
        this.introDescriptionLengthLimit = this.mainPreferences.getInt("introDescriptionLengthLimit", 72);
        this.businessChatLinksLimit = this.mainPreferences.getInt("businessChatLinksLimit", 100);
        this.channelRevenueWithdrawalEnabled = this.mainPreferences.getBoolean("channelRevenueWithdrawalEnabled", false);
        this.newNoncontactPeersRequirePremiumWithoutOwnpremium = this.mainPreferences.getBoolean("newNoncontactPeersRequirePremiumWithoutOwnpremium", false);
        this.reactionsUniqMax = this.mainPreferences.getInt("reactionsUniqMax", 11);
        this.premiumManageSubscriptionUrl = this.mainPreferences.getString("premiumManageSubscriptionUrl", ApplicationLoader.isStandaloneBuild() ? "https://t.me/premiumbot?start=status" : "https://play.google.com/store/account/subscriptions?sku=telegram_premium&package=org.telegram.messenger");
        this.androidDisableRoundCamera2 = this.mainPreferences.getBoolean("androidDisableRoundCamera2", true);
        this.storiesPinnedToTopCountMax = this.mainPreferences.getInt("storiesPinnedToTopCountMax", 3);
        this.showAnnualPerMonth = this.mainPreferences.getBoolean("showAnnualPerMonth", false);
        this.canEditFactcheck = this.mainPreferences.getBoolean("canEditFactcheck", false);
        this.factcheckLengthLimit = this.mainPreferences.getInt("factcheckLengthLimit", 1024);
        this.starsRevenueWithdrawalMin = this.mainPreferences.getLong("starsRevenueWithdrawalMin", 1000L);
        this.starsPaidPostAmountMax = this.mainPreferences.getLong("starsPaidPostAmountMax", 10000L);
        this.botPreviewMediasMax = this.mainPreferences.getInt("botPreviewMediasMax", 10);
        this.webAppAllowedProtocols = this.mainPreferences.getStringSet("webAppAllowedProtocols", new HashSet(Arrays.asList("http", "https")));
        this.ignoreRestrictionReasons = this.mainPreferences.getStringSet("ignoreRestrictionReasons", new HashSet(Arrays.asList(new String[0])));
        this.tonProxyAddress = this.mainPreferences.getString("tonProxyAddress", "magic.org");
        this.weatherSearchUsername = this.mainPreferences.getString("weatherSearchUsername", "izweatherbot");
        this.storyWeatherPreload = this.mainPreferences.getBoolean("storyWeatherPreload", true);
        this.starsGiftsEnabled = this.mainPreferences.getBoolean("starsGiftsEnabled", true);
        this.stargiftsBlocked = this.mainPreferences.getBoolean("stargiftsBlocked", true);
        this.starsPaidReactionAmountMax = this.mainPreferences.getLong("starsPaidReactionAmountMax", 10000L);
        this.starsSubscriptionAmountMax = this.mainPreferences.getLong("starsSubscriptionAmountMax", 2500L);
        this.starsUsdSellRate1000 = this.mainPreferences.getFloat("starsUsdSellRate1000", 2000.0f);
        this.starsUsdWithdrawRate1000 = this.mainPreferences.getFloat("starsUsdWithdrawRate1000", 1200.0f);
        this.sponsoredLinksInappAllow = this.mainPreferences.getBoolean("sponsoredLinksInappAllow", false);
        this.paidReactionsAnonymousTime = this.mainPreferences.getLong("paidReactionsAnonymousTime", 0L);
        this.paidReactionsAnonymous = (!this.mainPreferences.contains("paidReactionsAnonymous") || System.currentTimeMillis() - this.paidReactionsAnonymousTime >= 7200000) ? null : Boolean.valueOf(this.mainPreferences.getBoolean("paidReactionsAnonymous", false));
        scheduleTranscriptionUpdate();
        BuildVars.GOOGLE_AUTH_CLIENT_ID = this.mainPreferences.getString("googleAuthClientId", BuildVars.GOOGLE_AUTH_CLIENT_ID);
        this.dcDomainName = this.mainPreferences.contains("dcDomainName2") ? this.mainPreferences.getString("dcDomainName2", "apv3.stel.com") : z ? "tapv3.stel.com" : "apv3.stel.com";
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
        loadPremiumFeaturesPreviewOrder(this.premiumFeaturesTypesToPosition, this.mainPreferences.getString("premiumFeaturesTypesToPosition", null));
        loadPremiumFeaturesPreviewOrder(this.businessFeaturesTypesToPosition, this.mainPreferences.getString("businessFeaturesTypesToPosition", null));
        this.pendingSuggestions = this.pendingSuggestions != null ? new HashSet(this.pendingSuggestions) : new HashSet();
        this.dismissedSuggestions = this.dismissedSuggestions != null ? new HashSet(this.dismissedSuggestions) : new HashSet();
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
            this.exportUri.add(".*WhatsApp.*\\.zip$");
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
        this.autologinDomains = stringSet5 != null ? new HashSet(this.autologinDomains) : new HashSet();
        Set<String> stringSet6 = this.mainPreferences.getStringSet("authDomains", null);
        this.authDomains = stringSet6;
        this.authDomains = stringSet6 != null ? new HashSet(this.authDomains) : new HashSet();
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

    private void addDialogToItsFolder(int i, TLRPC$Dialog tLRPC$Dialog) {
        int i2 = tLRPC$Dialog instanceof TLRPC$TL_dialogFolder ? 0 : tLRPC$Dialog.folder_id;
        ArrayList<TLRPC$Dialog> arrayList = this.dialogsByFolder.get(i2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.dialogsByFolder.put(i2, arrayList);
        }
        if (i == -1) {
            arrayList.add(tLRPC$Dialog);
            return;
        }
        if (i == -2) {
            if (arrayList.isEmpty() || !(arrayList.get(0) instanceof TLRPC$TL_dialogFolder)) {
                arrayList.add(0, tLRPC$Dialog);
                return;
            }
            i = 1;
        }
        arrayList.add(i, tLRPC$Dialog);
    }

    private void addOrRemoveActiveVoiceChat(final TLRPC$Chat tLRPC$Chat) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addOrRemoveActiveVoiceChat$55(tLRPC$Chat);
                }
            });
        } else {
            lambda$addOrRemoveActiveVoiceChat$55(tLRPC$Chat);
        }
    }

    public void lambda$addOrRemoveActiveVoiceChat$55(TLRPC$Chat tLRPC$Chat) {
        TLRPC$Chat tLRPC$Chat2 = this.activeVoiceChatsMap.get(Long.valueOf(tLRPC$Chat.id));
        if (tLRPC$Chat.call_active && tLRPC$Chat.call_not_empty && tLRPC$Chat.migrated_to == null && !ChatObject.isNotInChat(tLRPC$Chat)) {
            if (tLRPC$Chat2 != null) {
                return;
            }
            this.activeVoiceChatsMap.put(Long.valueOf(tLRPC$Chat.id), tLRPC$Chat);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeGroupCallsUpdated, new Object[0]);
            return;
        }
        if (tLRPC$Chat2 == null) {
            return;
        }
        this.activeVoiceChatsMap.remove(Long.valueOf(tLRPC$Chat.id));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeGroupCallsUpdated, new Object[0]);
    }

    private void applyAppConfig(org.telegram.tgnet.TLRPC$TL_jsonObject r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.applyAppConfig(org.telegram.tgnet.TLRPC$TL_jsonObject):void");
    }

    private void applyDialogNotificationsSettings(long j, long j2, TLRPC$PeerNotifySettings tLRPC$PeerNotifySettings) {
        getNotificationsController().getNotificationsSettingsFacade().applyDialogNotificationsSettings(j, j2, tLRPC$PeerNotifySettings);
    }

    private void applyDialogsNotificationsSettings(ArrayList<TLRPC$Dialog> arrayList) {
        SharedPreferences.Editor edit = getNotificationsSettings(this.currentAccount).edit();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$Dialog tLRPC$Dialog = arrayList.get(i);
            if (tLRPC$Dialog.peer != null && (tLRPC$Dialog.notify_settings instanceof TLRPC$TL_peerNotifySettings)) {
                getNotificationsController().getNotificationsSettingsFacade().setSettingsForDialog(edit, tLRPC$Dialog, tLRPC$Dialog.notify_settings);
            }
        }
        edit.apply();
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
                TLRPC$TL_folderPeer tLRPC$TL_folderPeer = (TLRPC$TL_folderPeer) tLRPC$TL_updateFolderPeers.folder_peers.get(i2);
                TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(DialogObject.getPeerDialogId(tLRPC$TL_folderPeer.peer));
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
        this.currentDeleteTaskRunnable = null;
        LongSparseArray longSparseArray = this.currentDeletingTaskMids;
        final LongSparseArray m2clone = longSparseArray != null ? longSparseArray.m2clone() : null;
        LongSparseArray longSparseArray2 = this.currentDeletingTaskMediaMids;
        final LongSparseArray m2clone2 = longSparseArray2 != null ? longSparseArray2.m2clone() : null;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkDeletingTask$80(m2clone, m2clone2);
            }
        });
        return true;
    }

    public void lambda$checkPromoInfo$155(boolean z) {
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
                    MessagesController.this.lambda$checkPromoInfoInternal$160(i, string, string2, tLObject, tLRPC$TL_error);
                }
            });
            if (z2) {
                this.promoDialogId = 0L;
                this.proxyDialogAddress = null;
                this.nextPromoInfoCheckTime = getConnectionsManager().getCurrentTime() + 3600;
                getGlobalMainSettings().edit().putLong("proxy_dialog", this.promoDialogId).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.nextPromoInfoCheckTime).commit();
                AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda65(this));
            }
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
                MessagesController.this.lambda$checkTosUpdate$154(tLObject, tLRPC$TL_error);
            }
        });
    }

    private void completeReadTask(ReadTask readTask) {
        TLRPC$TL_messages_readHistory tLRPC$TL_messages_readHistory;
        RequestDelegate requestDelegate;
        ConnectionsManager connectionsManager;
        TLRPC$TL_messages_readHistory tLRPC$TL_messages_readHistory2;
        if (readTask.replyId != 0) {
            TLRPC$TL_messages_readDiscussion tLRPC$TL_messages_readDiscussion = new TLRPC$TL_messages_readDiscussion();
            tLRPC$TL_messages_readDiscussion.msg_id = (int) readTask.replyId;
            tLRPC$TL_messages_readDiscussion.peer = getInputPeer(readTask.dialogId);
            tLRPC$TL_messages_readDiscussion.read_max_id = readTask.maxId;
            ConnectionsManager connectionsManager2 = getConnectionsManager();
            requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$completeReadTask$226(tLObject, tLRPC$TL_error);
                }
            };
            tLRPC$TL_messages_readHistory2 = tLRPC$TL_messages_readDiscussion;
            connectionsManager = connectionsManager2;
        } else {
            if (DialogObject.isEncryptedDialog(readTask.dialogId)) {
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
                        MessagesController.lambda$completeReadTask$228(tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            TLRPC$InputPeer inputPeer = getInputPeer(readTask.dialogId);
            if (inputPeer instanceof TLRPC$TL_inputPeerChannel) {
                TLRPC$TL_channels_readHistory tLRPC$TL_channels_readHistory = new TLRPC$TL_channels_readHistory();
                tLRPC$TL_channels_readHistory.channel = getInputChannel(-readTask.dialogId);
                tLRPC$TL_channels_readHistory.max_id = readTask.maxId;
                tLRPC$TL_messages_readHistory = tLRPC$TL_channels_readHistory;
            } else {
                TLRPC$TL_messages_readHistory tLRPC$TL_messages_readHistory3 = new TLRPC$TL_messages_readHistory();
                tLRPC$TL_messages_readHistory3.peer = inputPeer;
                tLRPC$TL_messages_readHistory3.max_id = readTask.maxId;
                tLRPC$TL_messages_readHistory = tLRPC$TL_messages_readHistory3;
            }
            ConnectionsManager connectionsManager3 = getConnectionsManager();
            requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$completeReadTask$227(tLObject, tLRPC$TL_error);
                }
            };
            tLRPC$TL_messages_readHistory2 = tLRPC$TL_messages_readHistory;
            connectionsManager = connectionsManager3;
        }
        connectionsManager.sendRequest(tLRPC$TL_messages_readHistory2, requestDelegate);
    }

    public static boolean equals(TLRPC$MessageMedia tLRPC$MessageMedia, TLRPC$MessageMedia tLRPC$MessageMedia2) {
        return tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument ? (tLRPC$MessageMedia2 instanceof TLRPC$TL_messageMediaDocument) && tLRPC$MessageMedia.document.id == tLRPC$MessageMedia2.document.id : (tLRPC$MessageMedia2 instanceof TLRPC$TL_messageMediaPhoto) && (tLRPC$MessageMedia2 instanceof TLRPC$TL_messageMediaPhoto) && tLRPC$MessageMedia.photo.id == tLRPC$MessageMedia2.photo.id;
    }

    private void fetchFolderInLoadedPinnedDialogs(TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs) {
        TLRPC$InputPeer tLRPC$TL_inputPeerUser;
        long j;
        int size = tLRPC$TL_messages_peerDialogs.dialogs.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) tLRPC$TL_messages_peerDialogs.dialogs.get(i2);
            if (tLRPC$Dialog instanceof TLRPC$TL_dialogFolder) {
                TLRPC$TL_dialogFolder tLRPC$TL_dialogFolder = (TLRPC$TL_dialogFolder) tLRPC$Dialog;
                long peerDialogId = DialogObject.getPeerDialogId(tLRPC$Dialog.peer);
                if (tLRPC$TL_dialogFolder.top_message != 0 && peerDialogId != 0) {
                    int size2 = tLRPC$TL_messages_peerDialogs.messages.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        TLRPC$Message tLRPC$Message = (TLRPC$Message) tLRPC$TL_messages_peerDialogs.messages.get(i3);
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
                                while (i < size3) {
                                    TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLRPC$TL_messages_peerDialogs.chats.get(i);
                                    if (tLRPC$Chat.id == tLRPC$TL_inputPeerUser.channel_id) {
                                        j = tLRPC$Chat.access_hash;
                                        tLRPC$TL_inputPeerUser.access_hash = j;
                                        break;
                                    }
                                    i++;
                                }
                                loadUnknownDialog(tLRPC$TL_inputPeerUser, 0L);
                                return;
                            }
                            if (tLRPC$Peer instanceof TLRPC$TL_peerChat) {
                                tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerChat();
                                tLRPC$TL_inputPeerUser.chat_id = tLRPC$Dialog.peer.chat_id;
                            } else {
                                tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
                                tLRPC$TL_inputPeerUser.user_id = tLRPC$Dialog.peer.user_id;
                                int size4 = tLRPC$TL_messages_peerDialogs.users.size();
                                while (i < size4) {
                                    TLRPC$User tLRPC$User = (TLRPC$User) tLRPC$TL_messages_peerDialogs.users.get(i);
                                    if (tLRPC$User.id == tLRPC$TL_inputPeerUser.user_id) {
                                        j = tLRPC$User.access_hash;
                                        tLRPC$TL_inputPeerUser.access_hash = j;
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
                tLRPC$TL_messages_peerDialogs.dialogs.remove(tLRPC$TL_dialogFolder);
            }
        }
    }

    private void getChannelDifference(long j) {
        getChannelDifference(j, 0, 0L, null);
    }

    public static SharedPreferences getEmojiSettings(int i) {
        return getInstance(i).emojiPreferences;
    }

    public static SharedPreferences getGlobalEmojiSettings() {
        return getInstance(0).emojiPreferences;
    }

    public static SharedPreferences getGlobalMainSettings() {
        return getInstance(0).mainPreferences;
    }

    public static SharedPreferences getGlobalNotificationsSettings() {
        return getInstance(0).notificationsPreferences;
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

    public static TLRPC$InputPeer getInputPeer(TLObject tLObject) {
        if (tLObject instanceof TLRPC$User) {
            return getInputPeer((TLRPC$User) tLObject);
        }
        if (tLObject instanceof TLRPC$Chat) {
            return getInputPeer((TLRPC$Chat) tLObject);
        }
        return null;
    }

    public static TLRPC$InputPeer getInputPeer(TLRPC$Chat tLRPC$Chat) {
        if (!ChatObject.isChannel(tLRPC$Chat)) {
            TLRPC$TL_inputPeerChat tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChat();
            tLRPC$TL_inputPeerChat.chat_id = tLRPC$Chat.id;
            return tLRPC$TL_inputPeerChat;
        }
        TLRPC$TL_inputPeerChannel tLRPC$TL_inputPeerChannel = new TLRPC$TL_inputPeerChannel();
        tLRPC$TL_inputPeerChannel.channel_id = tLRPC$Chat.id;
        tLRPC$TL_inputPeerChannel.access_hash = tLRPC$Chat.access_hash;
        return tLRPC$TL_inputPeerChannel;
    }

    public static TLRPC$InputPeer getInputPeer(TLRPC$User tLRPC$User) {
        TLRPC$TL_inputPeerUser tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
        tLRPC$TL_inputPeerUser.user_id = tLRPC$User.id;
        tLRPC$TL_inputPeerUser.access_hash = tLRPC$User.access_hash;
        return tLRPC$TL_inputPeerUser;
    }

    public static TLRPC$InputWallPaper getInputWallpaper(Theme.OverrideWallpaperInfo overrideWallpaperInfo) {
        if (overrideWallpaperInfo.wallpaperId <= 0) {
            TLRPC$TL_inputWallPaperSlug tLRPC$TL_inputWallPaperSlug = new TLRPC$TL_inputWallPaperSlug();
            tLRPC$TL_inputWallPaperSlug.slug = overrideWallpaperInfo.slug;
            return tLRPC$TL_inputWallPaperSlug;
        }
        TLRPC$TL_inputWallPaper tLRPC$TL_inputWallPaper = new TLRPC$TL_inputWallPaper();
        tLRPC$TL_inputWallPaper.id = overrideWallpaperInfo.wallpaperId;
        tLRPC$TL_inputWallPaper.access_hash = overrideWallpaperInfo.accessHash;
        return tLRPC$TL_inputWallPaper;
    }

    public static MessagesController getInstance(int i) {
        MessagesController messagesController = Instance[i];
        if (messagesController == null) {
            synchronized (lockObjects[i]) {
                try {
                    messagesController = Instance[i];
                    if (messagesController == null) {
                        MessagesController[] messagesControllerArr = Instance;
                        MessagesController messagesController2 = new MessagesController(i);
                        messagesControllerArr[i] = messagesController2;
                        messagesController = messagesController2;
                    }
                } finally {
                }
            }
        }
        return messagesController;
    }

    public static SharedPreferences getMainSettings(int i) {
        return getInstance(i).mainPreferences;
    }

    public static SharedPreferences getNotificationsSettings(int i) {
        return getInstance(i).notificationsPreferences;
    }

    public static TLRPC$Peer getPeerFromInputPeer(TLRPC$InputPeer tLRPC$InputPeer) {
        if (tLRPC$InputPeer.chat_id != 0) {
            TLRPC$TL_peerChat tLRPC$TL_peerChat = new TLRPC$TL_peerChat();
            tLRPC$TL_peerChat.chat_id = tLRPC$InputPeer.chat_id;
            return tLRPC$TL_peerChat;
        }
        if (tLRPC$InputPeer.channel_id != 0) {
            TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
            tLRPC$TL_peerChannel.channel_id = tLRPC$InputPeer.channel_id;
            return tLRPC$TL_peerChannel;
        }
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        tLRPC$TL_peerUser.user_id = tLRPC$InputPeer.user_id;
        return tLRPC$TL_peerUser;
    }

    private long getTagLongId(TLRPC$Reaction tLRPC$Reaction) {
        long j;
        if (tLRPC$Reaction == null) {
            return 0L;
        }
        long j2 = tLRPC$Reaction.tag_long_id;
        if (j2 != 0) {
            return j2;
        }
        if (tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) {
            j = MessagesController$$ExternalSyntheticBackport8.m(r0, 0, Utilities.MD5(((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon).substring(0, 16).length(), 16);
        } else {
            if (!(tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji)) {
                return 0L;
            }
            j = ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id;
        }
        tLRPC$Reaction.tag_long_id = j;
        return j;
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
        if (!BuildVars.LOGS_ENABLED) {
            return 0L;
        }
        FileLog.e("trying to get unknown update channel_id for " + tLRPC$Update);
        return 0L;
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

    private int getUpdateSeq(TLRPC$Updates tLRPC$Updates) {
        return tLRPC$Updates instanceof TLRPC$TL_updatesCombined ? tLRPC$Updates.seq_start : tLRPC$Updates.seq;
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

    private String getUserNameForTyping(TLRPC$User tLRPC$User) {
        String str;
        if (tLRPC$User == null) {
            return "";
        }
        String str2 = tLRPC$User.first_name;
        if (str2 == null || str2.length() <= 0) {
            String str3 = tLRPC$User.last_name;
            if (str3 == null || str3.length() <= 0) {
                return "";
            }
            str = tLRPC$User.last_name;
        } else {
            str = tLRPC$User.first_name;
        }
        return AndroidUtilities.removeDiacritics(str);
    }

    public static org.telegram.tgnet.TLRPC$TL_wallPaperSettings getWallpaperSetting(org.telegram.ui.ActionBar.Theme.OverrideWallpaperInfo r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.getWallpaperSetting(org.telegram.ui.ActionBar.Theme$OverrideWallpaperInfo):org.telegram.tgnet.TLRPC$TL_wallPaperSettings");
    }

    public static boolean isStoryQualityFull() {
        return getInstance(UserConfig.selectedAccount).isStoryQualityFullOnAccount();
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

    private int isValidUpdate(TLRPC$Updates tLRPC$Updates, int i) {
        if (i == 0) {
            int updateSeq = getUpdateSeq(tLRPC$Updates);
            if (getMessagesStorage().getLastSeqValue() + 1 == updateSeq || getMessagesStorage().getLastSeqValue() == updateSeq) {
                return 0;
            }
            return getMessagesStorage().getLastSeqValue() < updateSeq ? 1 : 2;
        }
        if (i == 1) {
            if (tLRPC$Updates.pts <= getMessagesStorage().getLastPtsValue()) {
                return 2;
            }
            return getMessagesStorage().getLastPtsValue() + tLRPC$Updates.pts_count == tLRPC$Updates.pts ? 0 : 1;
        }
        if (i != 2) {
            return 0;
        }
        if (tLRPC$Updates.pts <= getMessagesStorage().getLastQtsValue()) {
            return 2;
        }
        return getMessagesStorage().getLastQtsValue() + tLRPC$Updates.updates.size() == tLRPC$Updates.pts ? 0 : 1;
    }

    public void lambda$addDialogToFolder$187(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$addToViewsQueue$219(MessageObject messageObject) {
        long dialogId = messageObject.getDialogId();
        int id = messageObject.getId();
        ArrayList arrayList = (ArrayList) this.channelViewsToSend.get(dialogId);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.channelViewsToSend.put(dialogId, arrayList);
        }
        if (arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        arrayList.add(Integer.valueOf(id));
    }

    public void lambda$addUserToChat$279(long j) {
        this.joiningToChannels.remove(Long.valueOf(j));
    }

    public void lambda$addUserToChat$280(Utilities.Callback callback, TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers, long j) {
        if (callback != null) {
            callback.run(tLRPC$TL_messages_invitedUsers);
        } else {
            AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, getChat(Long.valueOf(j)), tLRPC$TL_messages_invitedUsers);
        }
    }

    public static void lambda$addUserToChat$281(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public void lambda$addUserToChat$282(ErrorDelegate errorDelegate, TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLObject tLObject, boolean z, boolean z2) {
        if (errorDelegate.run(tLRPC$TL_error)) {
            AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLObject, Boolean.valueOf(z && !z2));
        }
    }

    public void lambda$addUserToChat$283(ErrorDelegate errorDelegate, TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLObject tLObject, boolean z, boolean z2, TLRPC$InputUser tLRPC$InputUser) {
        if (errorDelegate == null) {
            AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLObject, Boolean.valueOf(z && !z2));
        }
        if (z && (tLRPC$InputUser instanceof TLRPC$TL_inputUserSelf)) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
        }
    }

    public static void lambda$addUserToChat$284(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(null);
        }
    }

    public void lambda$addUserToChat$285(TLRPC$Updates tLRPC$Updates, Utilities.Callback callback, TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers, long j) {
        putUsers(tLRPC$Updates.users, false);
        putChats(tLRPC$Updates.chats, false);
        if (callback != null) {
            callback.run(tLRPC$TL_messages_invitedUsers);
        } else {
            AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, getChat(Long.valueOf(j)), tLRPC$TL_messages_invitedUsers);
        }
    }

    public void lambda$addUserToChat$286(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$addUserToChat$288(final boolean z, final TLRPC$InputUser tLRPC$InputUser, final long j, TLRPC$User tLRPC$User, final Utilities.Callback callback, boolean z2, Runnable runnable, final ErrorDelegate errorDelegate, final BaseFragment baseFragment, final TLObject tLObject, final boolean z3, TLObject tLObject2, final TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$Updates tLRPC$Updates;
        TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers;
        boolean z4;
        if (z && (tLRPC$InputUser instanceof TLRPC$TL_inputUserSelf)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addUserToChat$279(j);
                }
            });
        }
        if (tLRPC$TL_error != null) {
            if ("PRIVACY_PREMIUM_REQUIRED".equals(tLRPC$TL_error.text)) {
                final TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers2 = new TLRPC$TL_messages_invitedUsers();
                tLRPC$TL_messages_invitedUsers2.updates = new TLRPC$TL_updates();
                TLRPC$TL_missingInvitee tLRPC$TL_missingInvitee = new TLRPC$TL_missingInvitee();
                tLRPC$TL_missingInvitee.user_id = tLRPC$User.id;
                tLRPC$TL_missingInvitee.premium_would_allow_invite = true;
                tLRPC$TL_missingInvitee.premium_required_for_pm = true;
                tLRPC$TL_messages_invitedUsers2.missing_invitees.add(tLRPC$TL_missingInvitee);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$addUserToChat$280(callback, tLRPC$TL_messages_invitedUsers2, j);
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$addUserToChat$281(Utilities.Callback.this);
                }
            });
            if ("USER_ALREADY_PARTICIPANT".equals(tLRPC$TL_error.text) && z2) {
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            } else {
                if (errorDelegate != null) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            MessagesController.this.lambda$addUserToChat$282(errorDelegate, tLRPC$TL_error, baseFragment, tLObject, z, z3);
                        }
                    });
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$addUserToChat$283(errorDelegate, tLRPC$TL_error, baseFragment, tLObject, z, z3, tLRPC$InputUser);
                    }
                });
                return;
            }
        }
        if (tLObject2 instanceof TLRPC$TL_messages_invitedUsers) {
            tLRPC$TL_messages_invitedUsers = (TLRPC$TL_messages_invitedUsers) tLObject2;
            tLRPC$Updates = tLRPC$TL_messages_invitedUsers.updates;
        } else {
            if (!(tLObject2 instanceof TLRPC$Updates)) {
                FileLog.e("unexpected " + tLObject2 + " in addUserToChat");
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.lambda$addUserToChat$284(Utilities.Callback.this);
                    }
                });
                return;
            }
            tLRPC$Updates = (TLRPC$Updates) tLObject2;
            tLRPC$TL_messages_invitedUsers = null;
        }
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
        if (tLRPC$TL_messages_invitedUsers != null && !tLRPC$TL_messages_invitedUsers.missing_invitees.isEmpty()) {
            final TLRPC$Updates tLRPC$Updates2 = tLRPC$Updates;
            final TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers3 = tLRPC$TL_messages_invitedUsers;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addUserToChat$285(tLRPC$Updates2, callback, tLRPC$TL_messages_invitedUsers3, j);
                }
            });
            return;
        }
        if (z) {
            if (!z4 && (tLRPC$InputUser instanceof TLRPC$TL_inputUserSelf)) {
                generateJoinMessage(j, true);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addUserToChat$286(j);
                }
            }, 1000L);
        }
        if (z && (tLRPC$InputUser instanceof TLRPC$TL_inputUserSelf)) {
            getMessagesStorage().updateDialogsWithDeletedMessages(-j, j, new ArrayList<>(), null, true);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
        if (callback != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Utilities.Callback.this.run(null);
                }
            });
        }
    }

    public void lambda$addUsersToChannel$252(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_inviteToChannel tLRPC$TL_channels_inviteToChannel) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_inviteToChannel, Boolean.TRUE);
    }

    public void lambda$addUsersToChannel$253(TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers, long j) {
        putUsers(tLRPC$TL_messages_invitedUsers.updates.users, false);
        putChats(tLRPC$TL_messages_invitedUsers.updates.chats, false);
        AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, getChat(Long.valueOf(j)), tLRPC$TL_messages_invitedUsers);
    }

    public void lambda$addUsersToChannel$254(final BaseFragment baseFragment, final TLRPC$TL_channels_inviteToChannel tLRPC$TL_channels_inviteToChannel, final long j, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addUsersToChannel$252(tLRPC$TL_error, baseFragment, tLRPC$TL_channels_inviteToChannel);
                }
            });
        } else if (tLObject instanceof TLRPC$TL_messages_invitedUsers) {
            final TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers = (TLRPC$TL_messages_invitedUsers) tLObject;
            processUpdates(tLRPC$TL_messages_invitedUsers.updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$addUsersToChannel$253(tLRPC$TL_messages_invitedUsers, j);
                }
            });
        }
    }

    public static void lambda$addUsersToChat$275(Consumer consumer, TLRPC$User tLRPC$User) {
        if (consumer != null) {
            consumer.accept(tLRPC$User);
        }
    }

    public static boolean lambda$addUsersToChat$276(Consumer consumer, TLRPC$User tLRPC$User, TLRPC$TL_error tLRPC$TL_error) {
        if (consumer != null) {
            consumer.accept(tLRPC$User);
        }
        return tLRPC$TL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tLRPC$TL_error.text);
    }

    public void lambda$addUsersToChat$277(TLRPC$Chat tLRPC$Chat, TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers) {
        AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, tLRPC$Chat, tLRPC$TL_messages_invitedUsers);
    }

    public void lambda$addUsersToChat$278(final TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers, int[] iArr, int i, final TLRPC$Chat tLRPC$Chat, Runnable runnable, TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers2) {
        if (tLRPC$TL_messages_invitedUsers2 != null) {
            tLRPC$TL_messages_invitedUsers.missing_invitees.addAll(tLRPC$TL_messages_invitedUsers2.missing_invitees);
        }
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 >= i) {
            if (!tLRPC$TL_messages_invitedUsers.missing_invitees.isEmpty()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$addUsersToChat$277(tLRPC$Chat, tLRPC$TL_messages_invitedUsers);
                    }
                });
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void lambda$applyAppConfig$32() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesEnabledUpdate, new Object[0]);
    }

    public static void lambda$blockPeer$83(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$changeChatAvatar$296(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_AVATAR));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
    }

    public void lambda$changeChatAvatar$297(TLRPC$TL_inputChatPhoto tLRPC$TL_inputChatPhoto, TLRPC$FileLocation tLRPC$FileLocation, TLRPC$FileLocation tLRPC$FileLocation2, String str, long j, final Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, 150);
                TLRPC$VideoSize tLRPC$VideoSize = tLRPC$Photo.video_sizes.isEmpty() ? null : (TLRPC$VideoSize) tLRPC$Photo.video_sizes.get(0);
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
                MessagesController.this.lambda$changeChatAvatar$296(runnable);
            }
        });
    }

    public void lambda$changeChatTitle$295(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        processUpdates((TLRPC$Updates) tLObject, false);
    }

    public void lambda$checkCanOpenChat$405(AlertDialog alertDialog, Browser.Progress progress, TLObject tLObject, BaseFragment baseFragment, Bundle bundle) {
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (progress != null) {
            progress.end();
        }
        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
        putUsers(tLRPC$messages_Messages.users, false);
        putChats(tLRPC$messages_Messages.chats, false);
        getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
        baseFragment.presentFragment(new ChatActivity(bundle), true);
    }

    public void lambda$checkCanOpenChat$406(final AlertDialog alertDialog, final Browser.Progress progress, final BaseFragment baseFragment, final Bundle bundle, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkCanOpenChat$405(alertDialog, progress, tLObject, baseFragment, bundle);
                }
            });
        }
    }

    public void lambda$checkCanOpenChat$407(int i, BaseFragment baseFragment, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
        baseFragment.setVisibleDialog(null);
    }

    public void lambda$checkCanOpenChat$408(int i, BaseFragment baseFragment) {
        getConnectionsManager().cancelRequest(i, true);
        baseFragment.setVisibleDialog(null);
    }

    public void lambda$checkChatInviter$349(TLRPC$TL_channels_channelParticipant tLRPC$TL_channels_channelParticipant) {
        putUsers(tLRPC$TL_channels_channelParticipant.users, false);
        putChats(tLRPC$TL_channels_channelParticipant.chats, false);
    }

    public void lambda$checkChatInviter$350(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$checkChatInviter$351(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkChatInviter$350(arrayList);
            }
        });
    }

    public void lambda$checkChatInviter$352(long j, ArrayList arrayList, TLRPC$TL_channels_channelParticipant tLRPC$TL_channels_channelParticipant) {
        this.gettingChatInviters.delete(j);
        if (arrayList != null) {
            updateInterfaceWithMessages(-j, arrayList, 0);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadChatInviter, Long.valueOf(j), Long.valueOf(tLRPC$TL_channels_channelParticipant.participant.inviter_id));
    }

    public void lambda$checkChatInviter$353(TLRPC$Chat tLRPC$Chat, boolean z, final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                        MessagesController.this.lambda$checkChatInviter$349(tLRPC$TL_channels_channelParticipant);
                    }
                });
                getMessagesStorage().putUsersAndChats(tLRPC$TL_channels_channelParticipant.users, tLRPC$TL_channels_channelParticipant.chats, true, true);
                if (!z || Math.abs(getConnectionsManager().getCurrentTime() - tLRPC$TL_channels_channelParticipant.participant.date) >= 86400 || getMessagesStorage().hasInviteMeMessage(j)) {
                    arrayList = null;
                } else {
                    TLRPC$TL_messageService tLRPC$TL_messageService = new TLRPC$TL_messageService();
                    tLRPC$TL_messageService.flags = 256;
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
                    tLRPC$TL_messageService.action = (tLRPC$TL_channelParticipantSelf.via_invite && tLRPC$TL_channelParticipantSelf.inviter_id == getUserConfig().getClientUserId()) ? new TLRPC$TL_messageActionChatJoinedByRequest() : new TLRPC$TL_messageActionChatAddUser();
                    tLRPC$TL_messageService.action.users.add(Long.valueOf(getUserConfig().getClientUserId()));
                    tLRPC$TL_messageService.dialog_id = -j;
                    getUserConfig().saveConfig(false);
                    final ArrayList arrayList2 = new ArrayList();
                    ArrayList<TLRPC$Message> arrayList3 = new ArrayList<>();
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    for (int i = 0; i < tLRPC$TL_channels_channelParticipant.users.size(); i++) {
                        TLRPC$User tLRPC$User = (TLRPC$User) tLRPC$TL_channels_channelParticipant.users.get(i);
                        concurrentHashMap.put(Long.valueOf(tLRPC$User.id), tLRPC$User);
                    }
                    arrayList3.add(tLRPC$TL_messageService);
                    arrayList2.add(new MessageObject(this.currentAccount, (TLRPC$Message) tLRPC$TL_messageService, (AbstractMap<Long, TLRPC$User>) concurrentHashMap, true, false));
                    if (tLRPC$TL_messageService.from_id.user_id != getUserConfig().getClientUserId()) {
                        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                MessagesController.this.lambda$checkChatInviter$351(arrayList2);
                            }
                        });
                    }
                    getMessagesStorage().putMessages(arrayList3, true, true, false, 0, 0, 0L);
                    arrayList = arrayList2;
                }
                getMessagesStorage().saveChatInviter(j, tLRPC$TL_channels_channelParticipant.participant.inviter_id);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkChatInviter$352(j, arrayList, tLRPC$TL_channels_channelParticipant);
                    }
                });
            }
        }
    }

    public void lambda$checkChatlistFolderUpdate$431(TLObject tLObject, int i, ChatlistUpdatesStat chatlistUpdatesStat) {
        if (!(tLObject instanceof TL_chatlists$TL_chatlists_chatlistUpdates)) {
            chatlistUpdatesStat.loading = false;
            return;
        }
        TL_chatlists$TL_chatlists_chatlistUpdates tL_chatlists$TL_chatlists_chatlistUpdates = (TL_chatlists$TL_chatlists_chatlistUpdates) tLObject;
        putChats(tL_chatlists$TL_chatlists_chatlistUpdates.chats, false);
        putUsers(tL_chatlists$TL_chatlists_chatlistUpdates.users, false);
        this.chatlistFoldersUpdates.put(i, new ChatlistUpdatesStat(tL_chatlists$TL_chatlists_chatlistUpdates));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatlistFolderUpdate, Integer.valueOf(i));
    }

    public void lambda$checkChatlistFolderUpdate$432(final int i, final ChatlistUpdatesStat chatlistUpdatesStat, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkChatlistFolderUpdate$431(tLObject, i, chatlistUpdatesStat);
            }
        });
    }

    public void lambda$checkDeletingTask$79(LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        getNewDeleteTask(longSparseArray, longSparseArray2);
        this.currentDeletingTaskTime = 0;
        this.currentDeletingTaskMids = null;
        this.currentDeletingTaskMediaMids = null;
    }

    public void lambda$checkDeletingTask$80(final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        long j;
        ArrayList<Integer> arrayList;
        boolean z = true;
        if (longSparseArray != null) {
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> arrayList2 = (ArrayList) longSparseArray.valueAt(i);
                deleteMessages(arrayList2, null, null, longSparseArray.keyAt(i), 0, true, 0, !arrayList2.isEmpty() && arrayList2.get(0).intValue() > 0);
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
                            MessagesController.this.lambda$checkDeletingTask$78(createDeleteShowOnceTask, keyAt, id);
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
                MessagesController.this.lambda$checkDeletingTask$79(longSparseArray, longSparseArray2);
            }
        });
    }

    public static void lambda$checkIsInChat$427(IsInChatCheckedCallback isInChatCheckedCallback, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (isInChatCheckedCallback != null) {
            TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLObject instanceof TLRPC$TL_channels_channelParticipant ? ((TLRPC$TL_channels_channelParticipant) tLObject).participant : null;
            isInChatCheckedCallback.run((tLRPC$TL_error != null || tLRPC$ChannelParticipant == null || tLRPC$ChannelParticipant.left) ? false : true, tLRPC$ChannelParticipant != null ? tLRPC$ChannelParticipant.admin_rights : null, tLRPC$ChannelParticipant != null ? tLRPC$ChannelParticipant.rank : null);
        }
    }

    public void lambda$checkLastDialogMessage$213(TLRPC$Dialog tLRPC$Dialog) {
        deleteDialog(tLRPC$Dialog.id, 3);
    }

    public void lambda$checkLastDialogMessage$214(final TLRPC$Dialog tLRPC$Dialog) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("checkLastDialogMessage for " + tLRPC$Dialog.id + " has not message");
        }
        if (getMediaDataController().getDraft(tLRPC$Dialog.id, 0L) == null) {
            TLRPC$Dialog tLRPC$Dialog2 = (TLRPC$Dialog) this.dialogs_dict.get(tLRPC$Dialog.id);
            if (tLRPC$Dialog2 == null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("checkLastDialogMessage for " + tLRPC$Dialog.id + " current dialog not found");
                }
                getMessagesStorage().isDialogHasTopMessage(tLRPC$Dialog.id, new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkLastDialogMessage$213(tLRPC$Dialog);
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

    public void lambda$checkLastDialogMessage$215(TLRPC$Dialog tLRPC$Dialog) {
        this.checkingLastMessagesDialogs.delete(tLRPC$Dialog.id);
    }

    public void lambda$checkLastDialogMessage$216(final TLRPC$Dialog tLRPC$Dialog, long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            removeDeletedMessagesFromArray(tLRPC$Dialog.id, tLRPC$messages_Messages.messages);
            if (tLRPC$messages_Messages.messages.isEmpty()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkLastDialogMessage$214(tLRPC$Dialog);
                    }
                });
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("checkLastDialogMessage for " + tLRPC$Dialog.id + " has message");
                }
                TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
                TLRPC$Message tLRPC$Message = (TLRPC$Message) tLRPC$messages_Messages.messages.get(0);
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
            }
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkLastDialogMessage$215(tLRPC$Dialog);
            }
        });
    }

    public void lambda$checkPeerColors$444(TLObject tLObject) {
        this.loadingPeerColors = false;
        this.peerColors = PeerColors.fromTL(0, (TLRPC$TL_help_peerColors) tLObject);
        this.mainPreferences.edit().putString("peerColors", this.peerColors.toString()).apply();
    }

    public void lambda$checkPeerColors$445(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_help_peerColors) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkPeerColors$444(tLObject);
                }
            });
        }
    }

    public void lambda$checkPeerColors$446(TLObject tLObject) {
        this.loadingProfilePeerColors = false;
        this.profilePeerColors = PeerColors.fromTL(1, (TLRPC$TL_help_peerColors) tLObject);
        this.mainPreferences.edit().putString("profilePeerColors", this.profilePeerColors.toString()).apply();
    }

    public void lambda$checkPeerColors$447(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_help_peerColors) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkPeerColors$446(tLObject);
                }
            });
        }
    }

    public void lambda$checkPromoInfoInternal$156(TLRPC$TL_help_promoData tLRPC$TL_help_promoData, TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs, long j) {
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
                    tLRPC$Dialog = this.promoDialog;
                }
            }
            removeDialog(tLRPC$Dialog);
        }
        TLRPC$Dialog tLRPC$Dialog2 = (TLRPC$Dialog) tLRPC$TL_messages_peerDialogs.dialogs.get(0);
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
            num = r3;
        }
        this.dialogs_read_inbox_max.put(Long.valueOf(this.promoDialog.id), Integer.valueOf(Math.max(num.intValue(), this.promoDialog.read_inbox_max_id)));
        Integer num2 = this.dialogs_read_outbox_max.get(Long.valueOf(this.promoDialog.id));
        this.dialogs_read_outbox_max.put(Long.valueOf(this.promoDialog.id), Integer.valueOf(Math.max((num2 != null ? num2 : 0).intValue(), this.promoDialog.read_outbox_max_id)));
        this.dialogs_dict.put(j, this.promoDialog);
        if (!tLRPC$TL_messages_peerDialogs.messages.isEmpty()) {
            LongSparseArray longSparseArray = new LongSparseArray();
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i = 0; i < tLRPC$TL_messages_peerDialogs.users.size(); i++) {
                TLRPC$User tLRPC$User = (TLRPC$User) tLRPC$TL_messages_peerDialogs.users.get(i);
                longSparseArray.put(tLRPC$User.id, tLRPC$User);
            }
            for (int i2 = 0; i2 < tLRPC$TL_messages_peerDialogs.chats.size(); i2++) {
                TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLRPC$TL_messages_peerDialogs.chats.get(i2);
                longSparseArray2.put(tLRPC$Chat.id, tLRPC$Chat);
            }
            MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC$Message) tLRPC$TL_messages_peerDialogs.messages.get(0), longSparseArray, longSparseArray2, false, true);
            ArrayList arrayList = (ArrayList) this.dialogMessage.get(j);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
            }
            if (arrayList.size() > 0 && arrayList.get(0) != null && ((MessageObject) arrayList.get(0)).hasValidGroupId() && ((MessageObject) arrayList.get(0)).getGroupIdForUse() != messageObject.getGroupIdForUse()) {
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

    public void lambda$checkPromoInfoInternal$157() {
        TLRPC$Dialog tLRPC$Dialog = this.promoDialog;
        if (tLRPC$Dialog != null) {
            long j = tLRPC$Dialog.id;
            if (j < 0) {
                TLRPC$Chat chat = getChat(Long.valueOf(-j));
                if (ChatObject.isNotInChat(chat) || chat.restricted) {
                    tLRPC$Dialog = this.promoDialog;
                }
                this.promoDialog = null;
                sortDialogs(null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            removeDialog(tLRPC$Dialog);
            this.promoDialog = null;
            sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public void lambda$checkPromoInfoInternal$158(int i, final TLRPC$TL_help_promoData tLRPC$TL_help_promoData, final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (i != this.lastCheckPromoId) {
            return;
        }
        this.checkingPromoInfoRequestId = 0;
        final TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
        if (tLRPC$TL_messages_peerDialogs == null || tLRPC$TL_messages_peerDialogs.dialogs.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkPromoInfoInternal$157();
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
                    MessagesController.this.lambda$checkPromoInfoInternal$156(tLRPC$TL_help_promoData, tLRPC$TL_messages_peerDialogs, j);
                }
            });
        }
        this.checkingPromoInfo = false;
    }

    public void lambda$checkPromoInfoInternal$159(final long r11, final org.telegram.tgnet.TLRPC$TL_help_promoData r13, final int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$checkPromoInfoInternal$159(long, org.telegram.tgnet.TLRPC$TL_help_promoData, int):void");
    }

    public void lambda$checkPromoInfoInternal$160(final int r17, java.lang.String r18, java.lang.String r19, org.telegram.tgnet.TLObject r20, org.telegram.tgnet.TLRPC$TL_error r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$checkPromoInfoInternal$160(int, java.lang.String, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public static void lambda$checkSensitive$400(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$checkSensitive$401(BaseFragment baseFragment) {
        baseFragment.presentFragment(new ThemeActivity(0).highlightSensitiveRow());
    }

    public void lambda$checkSensitive$402(boolean[] zArr, long j, boolean[] zArr2, TL_account$contentSettings tL_account$contentSettings, final BaseFragment baseFragment, Runnable runnable, DialogInterface dialogInterface, int i) {
        zArr[0] = true;
        this.sensitiveAgreed.add(Long.valueOf(j));
        if (zArr2[0] && tL_account$contentSettings != null && tL_account$contentSettings.sensitive_can_change) {
            getMessagesController().setContentSettings(true);
            BulletinFactory.of(baseFragment).createSimpleBulletinDetail(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$checkSensitive$401(BaseFragment.this);
                }
            }), true)).show(true);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$checkSensitive$403(boolean[] zArr, Runnable runnable, DialogInterface dialogInterface) {
        if (zArr[0] || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void lambda$checkSensitive$404(AlertDialog alertDialog, final BaseFragment baseFragment, final long j, final Runnable runnable, final Runnable runnable2, final TL_account$contentSettings tL_account$contentSettings) {
        alertDialog.dismissUnless(200L);
        final boolean[] zArr = new boolean[1];
        FrameLayout frameLayout = new FrameLayout(baseFragment.getContext());
        if (tL_account$contentSettings != null && tL_account$contentSettings.sensitive_can_change) {
            CheckBoxCell checkBoxCell = new CheckBoxCell(baseFragment.getContext(), 1, baseFragment.getResourceProvider());
            checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
            checkBoxCell.setText(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false);
            checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    MessagesController.lambda$checkSensitive$400(zArr, view);
                }
            });
        }
        final boolean[] zArr2 = new boolean[1];
        new AlertDialog.Builder(baseFragment.getContext(), baseFragment.getResourceProvider()).setTitle(LocaleController.getString(R.string.MessageShowSensitiveContentChannelTitle)).setMessage(LocaleController.getString(R.string.MessageShowSensitiveContentChannelText)).setView(frameLayout).setCustomViewOffset(9).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                MessagesController.this.lambda$checkSensitive$402(zArr2, j, zArr, tL_account$contentSettings, baseFragment, runnable, dialogInterface, i);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                MessagesController.lambda$checkSensitive$403(zArr2, runnable2, dialogInterface);
            }
        }).show();
    }

    public void lambda$checkTosUpdate$153(TLRPC$TL_help_termsOfServiceUpdate tLRPC$TL_help_termsOfServiceUpdate) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 4, tLRPC$TL_help_termsOfServiceUpdate.terms_of_service);
    }

    public void lambda$checkTosUpdate$154(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int currentTime;
        this.checkingTosUpdate = false;
        if (tLObject instanceof TLRPC$TL_help_termsOfServiceUpdateEmpty) {
            currentTime = ((TLRPC$TL_help_termsOfServiceUpdateEmpty) tLObject).expires;
        } else {
            if (tLObject instanceof TLRPC$TL_help_termsOfServiceUpdate) {
                final TLRPC$TL_help_termsOfServiceUpdate tLRPC$TL_help_termsOfServiceUpdate = (TLRPC$TL_help_termsOfServiceUpdate) tLObject;
                this.nextTosCheckTime = tLRPC$TL_help_termsOfServiceUpdate.expires;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkTosUpdate$153(tLRPC$TL_help_termsOfServiceUpdate);
                    }
                });
                this.notificationsPreferences.edit().putInt("nextTosCheckTime", this.nextTosCheckTime).commit();
            }
            currentTime = getConnectionsManager().getCurrentTime() + 3600;
        }
        this.nextTosCheckTime = currentTime;
        this.notificationsPreferences.edit().putInt("nextTosCheckTime", this.nextTosCheckTime).commit();
    }

    public void lambda$checkUnreadReactions$386(long j, int i, long j2, ArrayList arrayList) {
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(j);
        if (tLRPC$Dialog == null) {
            getMessagesStorage().updateDialogUnreadReactions(j, 0L, i, false);
            return;
        }
        tLRPC$Dialog.unread_reactions_count = i;
        getMessagesStorage().updateUnreadReactionsCount(j, j2, i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadReactionsCounterChanged, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), arrayList);
    }

    public void lambda$checkUnreadReactions$387(final long j, final long j2, final ArrayList arrayList, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            final int i = tLRPC$TL_messages_peerDialogs.dialogs.size() == 0 ? 0 : ((TLRPC$Dialog) tLRPC$TL_messages_peerDialogs.dialogs.get(0)).unread_reactions_count;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkUnreadReactions$386(j, i, j2, arrayList);
                }
            });
        }
    }

    public void lambda$checkUnreadReactions$388(long j, long j2, int i, ArrayList arrayList) {
        getMessagesController().getTopicsController().updateReactionsUnread(j, j2, i, false);
        getMessagesStorage().updateUnreadReactionsCount(j, j2, i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsUnreadReactionsCounterChanged, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), arrayList);
    }

    public void lambda$checkUnreadReactions$389(final long j, final long j2, final ArrayList arrayList, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_forumTopics tLRPC$TL_messages_forumTopics = (TLRPC$TL_messages_forumTopics) tLObject;
            final int i = tLRPC$TL_messages_forumTopics.topics.size() == 0 ? 0 : ((TLRPC$TL_forumTopic) tLRPC$TL_messages_forumTopics.topics.get(0)).unread_reactions_count;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$checkUnreadReactions$388(j, j2, i, arrayList);
                }
            });
        }
    }

    public void lambda$checkUnreadReactions$390(long j, long j2, int i) {
        if (j != 0) {
            int updateReactionsUnread = getMessagesController().getTopicsController().updateReactionsUnread(j2, j, i, true);
            if (updateReactionsUnread >= 0) {
                getMessagesStorage().updateUnreadReactionsCount(j2, j, updateReactionsUnread, true);
                return;
            }
            return;
        }
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(j2);
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
    }

    public void lambda$checkUnreadReactions$391(SparseBooleanArray sparseBooleanArray, final long j, final long j2) {
        RequestDelegate requestDelegate;
        ConnectionsManager connectionsManager;
        TLRPC$TL_channels_getForumTopicsByID tLRPC$TL_channels_getForumTopicsByID;
        int i;
        boolean z;
        boolean z2;
        SQLitePreparedStatement executeFast;
        final ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            int keyAt = sparseBooleanArray.keyAt(i3);
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(keyAt);
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        try {
            SQLiteCursor queryFinalized = j != 0 ? getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT message_id, state FROM reaction_mentions WHERE message_id IN (%s) AND dialog_id = %d", sb, Long.valueOf(j2)), new Object[0]) : getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT message_id, state FROM reaction_mentions_topics WHERE message_id IN (%s) AND dialog_id = %d AND topic_id = %d", sb, Long.valueOf(j2), Long.valueOf(j)), new Object[0]);
            while (queryFinalized.next()) {
                sparseBooleanArray2.put(queryFinalized.intValue(0), queryFinalized.intValue(1) == 1);
            }
            queryFinalized.dispose();
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
        boolean z3 = false;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < sparseBooleanArray.size()) {
            int keyAt2 = sparseBooleanArray.keyAt(i4);
            boolean valueAt = sparseBooleanArray.valueAt(i4);
            if (sparseBooleanArray2.indexOfKey(keyAt2) < 0) {
                i = i2;
                z = z4;
                z2 = true;
            } else if (sparseBooleanArray2.get(keyAt2) != valueAt) {
                z2 = z3;
                i = i2 + (valueAt ? 1 : -1);
                z = true;
            } else {
                i = i2;
                z = z4;
                z2 = z3;
            }
            if (valueAt) {
                arrayList.add(Integer.valueOf(keyAt2));
            }
            if (j == 0) {
                try {
                    executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reaction_mentions VALUES(?, ?, ?)");
                    executeFast.requery();
                    executeFast.bindInteger(1, keyAt2);
                    executeFast.bindInteger(2, valueAt ? 1 : 0);
                    executeFast.bindLong(3, j2);
                    executeFast.step();
                } catch (SQLiteException e2) {
                    e = e2;
                    e.printStackTrace();
                    i4++;
                    z3 = z2;
                    z4 = z;
                    i2 = i;
                }
            } else {
                executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO reaction_mentions_topics VALUES(?, ?, ?, ?)");
                executeFast.requery();
                executeFast.bindInteger(1, keyAt2);
                try {
                    executeFast.bindInteger(2, valueAt ? 1 : 0);
                } catch (SQLiteException e3) {
                    e = e3;
                    e.printStackTrace();
                    i4++;
                    z3 = z2;
                    z4 = z;
                    i2 = i;
                }
                try {
                    executeFast.bindLong(3, j2);
                    executeFast.bindLong(4, j);
                    executeFast.step();
                } catch (SQLiteException e4) {
                    e = e4;
                    e.printStackTrace();
                    i4++;
                    z3 = z2;
                    z4 = z;
                    i2 = i;
                }
            }
            executeFast.dispose();
            i4++;
            z3 = z2;
            z4 = z;
            i2 = i;
        }
        if (!z3) {
            if (z4) {
                final int i5 = i2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$checkUnreadReactions$390(j, j2, i5);
                    }
                });
                return;
            }
            return;
        }
        if (j == 0) {
            TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs = new TLRPC$TL_messages_getPeerDialogs();
            TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
            tLRPC$TL_inputDialogPeer.peer = getInputPeer(j2);
            tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer);
            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.currentAccount);
            requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkUnreadReactions$387(j2, j, arrayList, tLObject, tLRPC$TL_error);
                }
            };
            tLRPC$TL_channels_getForumTopicsByID = tLRPC$TL_messages_getPeerDialogs;
            connectionsManager = connectionsManager2;
        } else {
            TLRPC$TL_channels_getForumTopicsByID tLRPC$TL_channels_getForumTopicsByID2 = new TLRPC$TL_channels_getForumTopicsByID();
            tLRPC$TL_channels_getForumTopicsByID2.topics.add(Integer.valueOf((int) j));
            tLRPC$TL_channels_getForumTopicsByID2.channel = getMessagesController().getInputChannel(-j2);
            ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(this.currentAccount);
            requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkUnreadReactions$389(j2, j, arrayList, tLObject, tLRPC$TL_error);
                }
            };
            tLRPC$TL_channels_getForumTopicsByID = tLRPC$TL_channels_getForumTopicsByID2;
            connectionsManager = connectionsManager3;
        }
        connectionsManager.sendRequest(tLRPC$TL_channels_getForumTopicsByID, requestDelegate);
    }

    public void lambda$cleanup$47() {
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

    public void lambda$cleanup$48() {
        FileLog.d("cleanup: isUpdating = false");
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

    public void lambda$cleanup$49() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.suggestedFiltersLoaded, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$completeDialogsReset$200(TLRPC$messages_Dialogs tLRPC$messages_Dialogs, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
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
                ArrayList arrayList = (ArrayList) this.dialogMessage.get(tLRPC$Dialog.id);
                this.dialogMessage.remove(tLRPC$Dialog.id);
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i2);
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
            ArrayList arrayList2 = (ArrayList) longSparseArray2.get(tLRPC$Dialog2.id);
            this.dialogMessage.put(j, arrayList2);
            if (arrayList2 != null) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(i4);
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
            TLRPC$Dialog tLRPC$Dialog3 = (TLRPC$Dialog) this.dialogs_dict.valueAt(i5);
            if (this.deletingDialogs.indexOfKey(tLRPC$Dialog3.id) < 0) {
                this.allDialogs.add(tLRPC$Dialog3);
            }
        }
        sortDialogs(null);
        this.dialogsEndReached.put(0, true);
        this.serverDialogsEndReached.put(0, false);
        this.dialogsEndReached.put(1, true);
        this.serverDialogsEndReached.put(1, false);
        int totalDialogsCount = getUserConfig().getTotalDialogsCount(0);
        long[] dialogLoadOffsets = getUserConfig().getDialogLoadOffsets(0);
        if (totalDialogsCount < 400) {
            long j4 = dialogLoadOffsets[0];
            if (j4 != -1 && j4 != 2147483647L) {
                loadDialogs(0, 0, 100, false);
            }
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$completeDialogsReset$201(int i, int i2, int i3, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        this.gettingDifference = false;
        getMessagesStorage().setLastPtsValue(i);
        getMessagesStorage().setLastDateValue(i2);
        getMessagesStorage().setLastQtsValue(i3);
        getDifference();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$completeDialogsReset$200(tLRPC$messages_Dialogs, longSparseArray, longSparseArray2);
            }
        });
    }

    public static void lambda$completeReadTask$226(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$completeReadTask$227(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null && (tLObject instanceof TLRPC$TL_messages_affectedMessages)) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
    }

    public static void lambda$completeReadTask$228(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$convertToGigaGroup$247(Context context, AlertDialog alertDialog) {
        if (((Activity) context).isFinishing()) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$convertToGigaGroup$248(MessagesStorage.BooleanCallback booleanCallback) {
        if (booleanCallback != null) {
            booleanCallback.run(true);
        }
    }

    public void lambda$convertToGigaGroup$249(MessagesStorage.BooleanCallback booleanCallback, Context context, AlertDialog alertDialog, TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_convertToGigagroup tLRPC$TL_channels_convertToGigagroup) {
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

    public void lambda$convertToGigaGroup$250(final Context context, final AlertDialog alertDialog, final MessagesStorage.BooleanCallback booleanCallback, final BaseFragment baseFragment, final TLRPC$TL_channels_convertToGigagroup tLRPC$TL_channels_convertToGigagroup, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$convertToGigaGroup$249(booleanCallback, context, alertDialog, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_convertToGigagroup);
                }
            });
            return;
        }
        if (context != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$convertToGigaGroup$247(context, alertDialog);
                }
            });
        }
        processUpdates((TLRPC$Updates) tLObject, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$convertToGigaGroup$248(MessagesStorage.BooleanCallback.this);
            }
        });
    }

    public void lambda$convertToGigaGroup$251(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public static void lambda$convertToMegaGroup$242(Context context, AlertDialog alertDialog) {
        if (((Activity) context).isFinishing()) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$convertToMegaGroup$243(MessagesStorage.LongCallback longCallback, TLRPC$Updates tLRPC$Updates, long j) {
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
                } else {
                    i2++;
                }
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

    public void lambda$convertToMegaGroup$244(MessagesStorage.LongCallback longCallback, Context context, AlertDialog alertDialog, TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_migrateChat tLRPC$TL_messages_migrateChat) {
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

    public void lambda$convertToMegaGroup$245(final Context context, final AlertDialog alertDialog, final MessagesStorage.LongCallback longCallback, final long j, Runnable runnable, final BaseFragment baseFragment, final TLRPC$TL_messages_migrateChat tLRPC$TL_messages_migrateChat, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$convertToMegaGroup$244(longCallback, context, alertDialog, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_migrateChat);
                }
            });
        } else {
            if (context != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.lambda$convertToMegaGroup$242(context, alertDialog);
                    }
                });
            }
            final TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
            processUpdates(tLRPC$Updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$convertToMegaGroup$243(MessagesStorage.LongCallback.this, tLRPC$Updates, j);
                }
            });
        }
    }

    public void lambda$convertToMegaGroup$246(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public void lambda$createChat$236(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_createChat tLRPC$TL_messages_createChat) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_createChat, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidFailCreate, new Object[0]);
    }

    public void lambda$createChat$237(TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers) {
        putUsers(tLRPC$TL_messages_invitedUsers.updates.users, false);
        putChats(tLRPC$TL_messages_invitedUsers.updates.chats, false);
        ArrayList<TLRPC$Chat> arrayList = tLRPC$TL_messages_invitedUsers.updates.chats;
        if (arrayList == null || arrayList.isEmpty()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidFailCreate, new Object[0]);
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidCreated, Long.valueOf(tLRPC$TL_messages_invitedUsers.updates.chats.get(0).id));
            AlertsCreator.checkRestrictedInviteUsers(this.currentAccount, tLRPC$TL_messages_invitedUsers.updates.chats.get(0), tLRPC$TL_messages_invitedUsers);
        }
    }

    public void lambda$createChat$238(final BaseFragment baseFragment, final TLRPC$TL_messages_createChat tLRPC$TL_messages_createChat, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$createChat$236(tLRPC$TL_error, baseFragment, tLRPC$TL_messages_createChat);
                }
            });
        } else if (tLObject instanceof TLRPC$TL_messages_invitedUsers) {
            final TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers = (TLRPC$TL_messages_invitedUsers) tLObject;
            processUpdates(tLRPC$TL_messages_invitedUsers.updates, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$createChat$237(tLRPC$TL_messages_invitedUsers);
                }
            });
        }
    }

    public void lambda$createChat$239(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_createChannel tLRPC$TL_channels_createChannel) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_createChannel, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidFailCreate, new Object[0]);
    }

    public void lambda$createChat$240(TLRPC$Updates tLRPC$Updates) {
        putUsers(tLRPC$Updates.users, false);
        putChats(tLRPC$Updates.chats, false);
        ArrayList<TLRPC$Chat> arrayList = tLRPC$Updates.chats;
        if (arrayList == null || arrayList.isEmpty()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidFailCreate, new Object[0]);
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatDidCreated, Long.valueOf(tLRPC$Updates.chats.get(0).id));
        }
    }

    public void lambda$createChat$241(final BaseFragment baseFragment, final TLRPC$TL_channels_createChannel tLRPC$TL_channels_createChannel, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$createChat$239(tLRPC$TL_error, baseFragment, tLRPC$TL_channels_createChannel);
                }
            });
            return;
        }
        final TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        processUpdates(tLRPC$Updates, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$createChat$240(tLRPC$Updates);
            }
        });
    }

    public void lambda$deleteDialog$129(long j, int i, boolean z, TLRPC$InputPeer tLRPC$InputPeer, long j2, int i2) {
        if (j == getUserConfig().getClientUserId()) {
            getSavedMessagesController().deleteAllDialogs();
        }
        deleteDialog(j, 2, i, Math.max(0, i2), z, tLRPC$InputPeer, j2);
        checkIfFolderEmpty(1);
    }

    public void lambda$deleteDialog$130(long j) {
        getNotificationsController().removeNotificationsForDialog(j);
    }

    public void lambda$deleteDialog$131(final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteDialog$130(j);
            }
        });
    }

    public void lambda$deleteDialog$132(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void lambda$deleteDialog$133(long j, long j2, int i, int i2, boolean z, TLRPC$InputPeer tLRPC$InputPeer, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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

    public void lambda$deleteMessages$118(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$deleteMessages$119(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$deleteMessages$120(long j, long j2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewChannelDifferenceParams(tLRPC$TL_messages_affectedMessages.pts, tLRPC$TL_messages_affectedMessages.pts_count, j);
        }
        if (j2 != 0) {
            getMessagesStorage().removePendingTask(j2);
        }
    }

    public void lambda$deleteMessages$121(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$deleteMessagesByPush$347(ArrayList arrayList, long j) {
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
        ArrayList arrayList2 = (ArrayList) this.dialogMessage.get(-j);
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i2);
                int size2 = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (messageObject2.getId() == ((Integer) arrayList.get(i3)).intValue()) {
                        messageObject2.deleted = true;
                        break;
                    }
                    i3++;
                }
            }
        }
    }

    public void lambda$deleteMessagesByPush$348(final ArrayList arrayList, final long j, long j2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteMessagesByPush$347(arrayList, j);
            }
        });
        getMessagesStorage().deletePushMessages(j2, arrayList);
        getMessagesStorage().updateDialogsWithDeletedMessages(j2, j, arrayList, getMessagesStorage().markMessagesAsDeleted(j2, arrayList, false, true, 0, 0), false);
    }

    public void lambda$deleteMessagesRange$417(ArrayList arrayList, long j, TLRPC$TL_messages_affectedHistory tLRPC$TL_messages_affectedHistory, long j2, int i, int i2, boolean z, Runnable runnable) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, Long.valueOf(j), Boolean.FALSE);
        if (tLRPC$TL_messages_affectedHistory.offset > 0) {
            deleteMessagesRange(j2, j, i, i2, z, runnable);
        } else {
            runnable.run();
        }
    }

    public void lambda$deleteMessagesRange$418(final long j, final int i, final int i2, final long j2, final TLRPC$TL_messages_affectedHistory tLRPC$TL_messages_affectedHistory, final boolean z, final Runnable runnable) {
        final ArrayList<Integer> cachedMessagesInRange = getMessagesStorage().getCachedMessagesInRange(j, i, i2);
        getMessagesStorage().markMessagesAsDeleted(j, cachedMessagesInRange, false, true, 0, 0);
        getMessagesStorage().updateDialogsWithDeletedMessages(j, 0L, cachedMessagesInRange, null, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteMessagesRange$417(cachedMessagesInRange, j2, tLRPC$TL_messages_affectedHistory, j, i, i2, z, runnable);
            }
        });
    }

    public void lambda$deleteMessagesRange$420(final long j, final int i, final int i2, final long j2, final boolean z, final Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    runnable.run();
                }
            });
            return;
        }
        final TLRPC$TL_messages_affectedHistory tLRPC$TL_messages_affectedHistory = (TLRPC$TL_messages_affectedHistory) tLObject;
        processNewDifferenceParams(-1, tLRPC$TL_messages_affectedHistory.pts, -1, tLRPC$TL_messages_affectedHistory.pts_count);
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteMessagesRange$418(j, i, i2, j2, tLRPC$TL_messages_affectedHistory, z, runnable);
            }
        });
    }

    public static void lambda$deleteParticipantFromChat$289(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$deleteParticipantFromChat$290(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$deleteParticipantFromChat$291(boolean z, boolean z2, final long j, Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        processUpdates((TLRPC$Updates) tLObject, false);
        if (z && !z2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$deleteParticipantFromChat$290(j);
                }
            }, 1000L);
        }
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public static void lambda$deleteParticipantFromChat$292(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$deleteParticipantFromChat$293(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$deleteParticipantFromChat$294(boolean z, TLRPC$User tLRPC$User, final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                MessagesController.this.lambda$deleteParticipantFromChat$293(j);
            }
        }, 1000L);
    }

    public void lambda$deleteSavedDialog$134(long j, int[] iArr, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedHistory tLRPC$TL_messages_affectedHistory = (TLRPC$TL_messages_affectedHistory) tLObject;
            if (tLRPC$TL_messages_affectedHistory.offset > 0) {
                deleteSavedDialog(j, iArr[0]);
            }
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedHistory.pts, -1, tLRPC$TL_messages_affectedHistory.pts_count);
            getMessagesStorage().onDeleteQueryComplete(j);
        }
    }

    public void lambda$deleteSavedDialog$135(final long j, int i, final int[] iArr) {
        SavedMessagesController.SavedDialog savedDialog;
        getMessagesStorage().deleteSavedDialog(j);
        TLRPC$TL_messages_deleteSavedHistory tLRPC$TL_messages_deleteSavedHistory = new TLRPC$TL_messages_deleteSavedHistory();
        tLRPC$TL_messages_deleteSavedHistory.peer = getInputPeer(j);
        if (i == 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= getSavedMessagesController().allDialogs.size()) {
                    savedDialog = null;
                    break;
                } else {
                    if (getSavedMessagesController().allDialogs.get(i2).dialogId == j) {
                        savedDialog = getSavedMessagesController().allDialogs.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (savedDialog != null) {
                iArr[0] = Math.max(iArr[0], savedDialog.top_message_id);
                getSavedMessagesController().deleteDialog(j);
            }
            int i3 = iArr[0];
            if (i3 <= 0) {
                i3 = Integer.MAX_VALUE;
            }
            tLRPC$TL_messages_deleteSavedHistory.max_id = i3;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteSavedHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$deleteSavedDialog$134(j, iArr, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public static void lambda$deleteSavedDialog$136(int[] iArr, Runnable runnable, int i) {
        iArr[0] = i;
        runnable.run();
    }

    public void lambda$deleteUserChannelHistory$124(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedHistory tLRPC$TL_messages_affectedHistory = (TLRPC$TL_messages_affectedHistory) tLObject;
            int i = tLRPC$TL_messages_affectedHistory.offset;
            if (i > 0) {
                deleteUserChannelHistory(tLRPC$Chat, tLRPC$User, tLRPC$Chat2, i);
            }
            processNewChannelDifferenceParams(tLRPC$TL_messages_affectedHistory.pts, tLRPC$TL_messages_affectedHistory.pts_count, tLRPC$Chat.id);
        }
    }

    public void lambda$deleteUserPhoto$109(TLObject tLObject, long j) {
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
            tLRPC$UserProfilePhoto.photo_small = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, 150).location;
            user.photo.photo_big = FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_photos_photo.photo.sizes, 800).location;
            user.photo.dc_id = tLRPC$TL_photos_photo.photo.dc_id;
        } else {
            user.photo = new TLRPC$TL_userProfilePhotoEmpty();
        }
        TLRPC$UserFull userFull = getUserFull(j);
        if (userFull != null) {
            userFull.profile_photo = tLRPC$TL_photos_photo.photo;
            getMessagesStorage().updateUserInfo(userFull, false);
        }
        getUserConfig().getCurrentUser().photo = user.photo;
        putUser(user, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.updateInterfaces;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, Integer.valueOf(UPDATE_MASK_ALL));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, Integer.valueOf(UPDATE_MASK_AVATAR));
        getUserConfig().saveConfig(true);
    }

    public void lambda$deleteUserPhoto$110(final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$deleteUserPhoto$109(tLObject, j);
                }
            });
        }
    }

    public static void lambda$deleteUserPhoto$111(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$didAddedNewTask$75(int i) {
        int i2;
        if (!(this.currentDeletingTaskMids == null && this.currentDeletingTaskMediaMids == null && !this.gettingNewDeleteTask) && ((i2 = this.currentDeletingTaskTime) == 0 || i >= i2)) {
            return;
        }
        getNewDeleteTask(null, null);
    }

    public void lambda$didAddedNewTask$76(long j, SparseArray sparseArray) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didCreatedNewDeleteTask, Long.valueOf(j), sparseArray);
    }

    public void lambda$didReceivedNotification$37() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_AVATAR));
        getUserConfig().saveConfig(true);
    }

    public void lambda$didReceivedNotification$38(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
            ArrayList arrayList = tLRPC$TL_photos_photo.photo.sizes;
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
                    MessagesController.this.lambda$didReceivedNotification$37();
                }
            });
        }
    }

    public void lambda$didReceivedNotification$39(TLRPC$WallPaper tLRPC$WallPaper, TLRPC$TL_wallPaperSettings tLRPC$TL_wallPaperSettings, Theme.OverrideWallpaperInfo overrideWallpaperInfo, File file, String str) {
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
        ArrayList arrayList2 = this.uploadingWallpaperInfo.requestIds;
        if (arrayList2 == null || overrideWallpaperInfo.dialogId == 0) {
            return;
        }
        arrayList2.add(Integer.valueOf(ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(overrideWallpaperInfo.dialogId, str, overrideWallpaperInfo, null, null)));
    }

    public void lambda$didReceivedNotification$40(final Theme.OverrideWallpaperInfo overrideWallpaperInfo, final TLRPC$TL_wallPaperSettings tLRPC$TL_wallPaperSettings, final String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                MessagesController.this.lambda$didReceivedNotification$39(tLRPC$WallPaper, tLRPC$TL_wallPaperSettings, overrideWallpaperInfo, file, str);
            }
        });
    }

    public void lambda$didReceivedNotification$41(TLObject tLObject, Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        if (!(tLObject instanceof TLRPC$TL_theme)) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeInfo, themeAccent);
            return;
        }
        Theme.setThemeUploadInfo(themeInfo, themeAccent, (TLRPC$TL_theme) tLObject, this.currentAccount, false);
        installTheme(themeInfo, themeAccent, themeInfo == Theme.getCurrentNightTheme());
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadedToServer, themeInfo, themeAccent);
    }

    public void lambda$didReceivedNotification$42(final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didReceivedNotification$41(tLObject, themeInfo, themeAccent);
            }
        });
    }

    public void lambda$didReceivedNotification$43(TLObject tLObject, Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        if (!(tLObject instanceof TLRPC$TL_theme)) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeInfo, themeAccent);
        } else {
            Theme.setThemeUploadInfo(themeInfo, themeAccent, (TLRPC$TL_theme) tLObject, this.currentAccount, false);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadedToServer, themeInfo, themeAccent);
        }
    }

    public void lambda$didReceivedNotification$44(final Theme.ThemeInfo themeInfo, final Theme.ThemeAccent themeAccent, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didReceivedNotification$43(tLObject, themeInfo, themeAccent);
            }
        });
    }

    public void lambda$didReceivedNotification$45(Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeInfo, themeAccent);
    }

    public void lambda$didReceivedNotification$46(TLRPC$TL_theme tLRPC$TL_theme, final Theme.ThemeInfo themeInfo, TLRPC$TL_inputThemeSettings tLRPC$TL_inputThemeSettings, final Theme.ThemeAccent themeAccent, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        RequestDelegate requestDelegate;
        TLRPC$TL_account_createTheme tLRPC$TL_account_createTheme;
        ConnectionsManager connectionsManager;
        String name = tLRPC$TL_theme != null ? tLRPC$TL_theme.title : themeInfo.getName();
        int lastIndexOf = name.lastIndexOf(".attheme");
        if (lastIndexOf > 0) {
            name = name.substring(0, lastIndexOf);
        }
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$didReceivedNotification$45(themeInfo, themeAccent);
                }
            });
            return;
        }
        TLRPC$Document tLRPC$Document = (TLRPC$Document) tLObject;
        TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
        tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
        tLRPC$TL_inputDocument.id = tLRPC$Document.id;
        tLRPC$TL_inputDocument.file_reference = tLRPC$Document.file_reference;
        if (tLRPC$TL_theme == null || !tLRPC$TL_theme.creator) {
            TLRPC$TL_account_createTheme tLRPC$TL_account_createTheme2 = new TLRPC$TL_account_createTheme();
            tLRPC$TL_account_createTheme2.document = tLRPC$TL_inputDocument;
            tLRPC$TL_account_createTheme2.flags |= 4;
            tLRPC$TL_account_createTheme2.slug = (tLRPC$TL_theme == null || TextUtils.isEmpty(tLRPC$TL_theme.slug)) ? "" : tLRPC$TL_theme.slug;
            tLRPC$TL_account_createTheme2.title = name;
            if (tLRPC$TL_inputThemeSettings != null) {
                tLRPC$TL_account_createTheme2.settings = tLRPC$TL_inputThemeSettings;
                tLRPC$TL_account_createTheme2.flags |= 8;
            }
            ConnectionsManager connectionsManager2 = getConnectionsManager();
            requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    MessagesController.this.lambda$didReceivedNotification$42(themeInfo, themeAccent, tLObject2, tLRPC$TL_error2);
                }
            };
            connectionsManager = connectionsManager2;
            tLRPC$TL_account_createTheme = tLRPC$TL_account_createTheme2;
        } else {
            TLRPC$TL_account_updateTheme tLRPC$TL_account_updateTheme = new TLRPC$TL_account_updateTheme();
            TLRPC$TL_inputTheme tLRPC$TL_inputTheme = new TLRPC$TL_inputTheme();
            tLRPC$TL_inputTheme.id = tLRPC$TL_theme.id;
            tLRPC$TL_inputTheme.access_hash = tLRPC$TL_theme.access_hash;
            tLRPC$TL_account_updateTheme.theme = tLRPC$TL_inputTheme;
            tLRPC$TL_account_updateTheme.slug = tLRPC$TL_theme.slug;
            int i = tLRPC$TL_account_updateTheme.flags;
            tLRPC$TL_account_updateTheme.title = name;
            tLRPC$TL_account_updateTheme.document = tLRPC$TL_inputDocument;
            tLRPC$TL_account_updateTheme.flags = i | 7;
            if (tLRPC$TL_inputThemeSettings != null) {
                tLRPC$TL_account_updateTheme.settings = tLRPC$TL_inputThemeSettings;
                tLRPC$TL_account_updateTheme.flags = i | 15;
            }
            tLRPC$TL_account_updateTheme.format = "android";
            ConnectionsManager connectionsManager3 = getConnectionsManager();
            requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    MessagesController.this.lambda$didReceivedNotification$44(themeInfo, themeAccent, tLObject2, tLRPC$TL_error2);
                }
            };
            connectionsManager = connectionsManager3;
            tLRPC$TL_account_createTheme = tLRPC$TL_account_updateTheme;
        }
        connectionsManager.sendRequest(tLRPC$TL_account_createTheme, requestDelegate);
    }

    public void lambda$ensureMessagesLoaded$413(boolean[] zArr, TLRPC$Chat tLRPC$Chat, Runnable[] runnableArr, long j, int i, MessagesLoadedCallback messagesLoadedCallback) {
        if (zArr[0]) {
            return;
        }
        if (tLRPC$Chat != null) {
            getMessagesController().putChat(tLRPC$Chat, true);
            runnableArr[0] = ensureMessagesLoaded(j, i, messagesLoadedCallback);
        } else if (messagesLoadedCallback != null) {
            messagesLoadedCallback.onError();
        }
    }

    public void lambda$ensureMessagesLoaded$414(final boolean[] zArr, MessagesStorage messagesStorage, long j, final Runnable[] runnableArr, final long j2, final int i, final MessagesLoadedCallback messagesLoadedCallback) {
        if (zArr[0]) {
            return;
        }
        final TLRPC$Chat chat = messagesStorage.getChat(j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$ensureMessagesLoaded$413(zArr, chat, runnableArr, j2, i, messagesLoadedCallback);
            }
        });
    }

    public static void lambda$ensureMessagesLoaded$415(boolean[] zArr, Runnable[] runnableArr) {
        zArr[0] = true;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$ensureMessagesLoaded$416(int i) {
        getConnectionsManager().cancelRequestsForGuid(i);
    }

    public void lambda$generateJoinMessage$346(long j, ArrayList arrayList) {
        updateInterfaceWithMessages(-j, arrayList, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$getAvailableEffects$450(TLRPC$messages_AvailableEffects tLRPC$messages_AvailableEffects) {
        if (this.availableEffects != tLRPC$messages_AvailableEffects) {
            this.availableEffects = tLRPC$messages_AvailableEffects;
            if (tLRPC$messages_AvailableEffects != null) {
                AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).putDocuments(this.availableEffects.documents);
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.availableEffectsUpdate, new Object[0]);
        }
        this.loadingAvailableEffects = false;
    }

    public void lambda$getBlockedPeers$107(TLObject tLObject, boolean z, TLRPC$TL_contacts_getBlocked tLRPC$TL_contacts_getBlocked) {
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
                this.blockePeers.put(MessageObject.getPeerId(((TLRPC$TL_peerBlocked) tLRPC$contacts_Blocked.blocked.get(i)).peer_id), 1);
            }
            this.loadingBlockedPeers = false;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        }
    }

    public void lambda$getBlockedPeers$108(final boolean z, final TLRPC$TL_contacts_getBlocked tLRPC$TL_contacts_getBlocked, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getBlockedPeers$107(tLObject, z, tLRPC$TL_contacts_getBlocked);
            }
        });
    }

    public void lambda$getChannelDifference$312(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$313(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$314(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$315(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$316(TLRPC$updates_ChannelDifference tLRPC$updates_ChannelDifference) {
        putUsers(tLRPC$updates_ChannelDifference.users, false);
        putChats(tLRPC$updates_ChannelDifference.chats, false);
    }

    public void lambda$getChannelDifference$317(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            long[] jArr = (long[]) sparseArray.valueAt(i);
            getSendMessagesHelper().processSentMessage((int) jArr[1]);
            NotificationCenter notificationCenter = getNotificationCenter();
            int i2 = NotificationCenter.messageReceivedByServer;
            Integer valueOf = Integer.valueOf((int) jArr[1]);
            Integer valueOf2 = Integer.valueOf(keyAt);
            Long valueOf3 = Long.valueOf(jArr[0]);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, valueOf, valueOf2, null, valueOf3, 0L, -1, bool);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf((int) jArr[1]), Integer.valueOf(keyAt), null, Long.valueOf(jArr[0]), 0L, -1, bool);
        }
    }

    public void lambda$getChannelDifference$318(LongSparseArray longSparseArray) {
        for (int i = 0; i < longSparseArray.size(); i++) {
            updateInterfaceWithMessages(longSparseArray.keyAt(i), (ArrayList) longSparseArray.valueAt(i), 0);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$getChannelDifference$319(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$getChannelDifference$320(final ArrayList arrayList, TLRPC$updates_ChannelDifference tLRPC$updates_ChannelDifference) {
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getChannelDifference$319(arrayList);
                }
            });
        }
        getMessagesStorage().putMessages(tLRPC$updates_ChannelDifference.new_messages, true, false, false, getDownloadController().getAutodownloadMask(), 0, 0L);
    }

    public void lambda$getChannelDifference$321(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$322(final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getChannelDifference$321(j);
            }
        });
    }

    public void lambda$getChannelDifference$323(long j) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$324(final org.telegram.tgnet.TLRPC$updates_ChannelDifference r23, final long r24, org.telegram.tgnet.TLRPC$Chat r26, androidx.collection.LongSparseArray r27, int r28, long r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getChannelDifference$324(org.telegram.tgnet.TLRPC$updates_ChannelDifference, long, org.telegram.tgnet.TLRPC$Chat, androidx.collection.LongSparseArray, int, long):void");
    }

    public void lambda$getChannelDifference$325(ArrayList arrayList, final long j, final TLRPC$updates_ChannelDifference tLRPC$updates_ChannelDifference, final TLRPC$Chat tLRPC$Chat, final LongSparseArray longSparseArray, final int i, final long j2) {
        if (!arrayList.isEmpty()) {
            final SparseArray sparseArray = new SparseArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLRPC$TL_updateMessageID tLRPC$TL_updateMessageID = (TLRPC$TL_updateMessageID) it.next();
                long[] updateMessageStateAndId = getMessagesStorage().updateMessageStateAndId(tLRPC$TL_updateMessageID.random_id, -j, null, tLRPC$TL_updateMessageID.id, 0, false, -1, 0);
                if (updateMessageStateAndId != null) {
                    sparseArray.put(tLRPC$TL_updateMessageID.id, updateMessageStateAndId);
                }
            }
            if (sparseArray.size() != 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getChannelDifference$317(sparseArray);
                    }
                });
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getChannelDifference$324(tLRPC$updates_ChannelDifference, j, tLRPC$Chat, longSparseArray, i, j2);
            }
        });
    }

    public void lambda$getChannelDifference$326(TLRPC$TL_error tLRPC$TL_error, long j) {
        checkChannelError(tLRPC$TL_error.text, j);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onReceivedChannelDifference, Long.valueOf(j));
    }

    public void lambda$getChannelDifference$327(final long j, final int i, final long j2, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        final TLRPC$Chat tLRPC$Chat;
        if (tLObject == null) {
            if (tLRPC$TL_error != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getChannelDifference$326(tLRPC$TL_error, j);
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
            TLRPC$User tLRPC$User = (TLRPC$User) tLRPC$updates_ChannelDifference.users.get(i3);
            longSparseArray.put(tLRPC$User.id, tLRPC$User);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= tLRPC$updates_ChannelDifference.chats.size()) {
                tLRPC$Chat = null;
                break;
            }
            TLRPC$Chat tLRPC$Chat2 = (TLRPC$Chat) tLRPC$updates_ChannelDifference.chats.get(i4);
            if (tLRPC$Chat2.id == j) {
                tLRPC$Chat = tLRPC$Chat2;
                break;
            }
            i4++;
        }
        final ArrayList arrayList = new ArrayList();
        if (!tLRPC$updates_ChannelDifference.other_updates.isEmpty()) {
            while (i2 < tLRPC$updates_ChannelDifference.other_updates.size()) {
                TLRPC$Update tLRPC$Update = (TLRPC$Update) tLRPC$updates_ChannelDifference.other_updates.get(i2);
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
                MessagesController.this.lambda$getChannelDifference$316(tLRPC$updates_ChannelDifference);
            }
        });
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getChannelDifference$325(arrayList, j, tLRPC$updates_ChannelDifference, tLRPC$Chat, longSparseArray, i, j2);
            }
        });
    }

    public static void lambda$getChannelParticipant$426(Utilities.Callback callback, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (callback != null) {
            callback.run(tLObject instanceof TLRPC$TL_channels_channelParticipant ? ((TLRPC$TL_channels_channelParticipant) tLObject).participant : null);
        }
    }

    public void lambda$getChannelRecommendations$435(TLObject tLObject, boolean z, long j) {
        int i;
        if (tLObject instanceof TLRPC$messages_Chats) {
            ArrayList<TLRPC$Chat> arrayList = ((TLRPC$messages_Chats) tLObject).chats;
            putChats(arrayList, false);
            ChannelRecommendations channelRecommendations = new ChannelRecommendations();
            channelRecommendations.wasPremium = z;
            channelRecommendations.chats.addAll(arrayList);
            if (!(tLObject instanceof TLRPC$TL_messages_chatsSlice)) {
                if (!getUserConfig().isPremium() && BuildVars.DEBUG_PRIVATE_VERSION) {
                    i = 90;
                }
                this.cachedChannelRecommendations.put(Long.valueOf(j), channelRecommendations);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(j));
            }
            i = Math.max(0, ((TLRPC$TL_messages_chatsSlice) tLObject).count - arrayList.size());
            channelRecommendations.more = i;
            this.cachedChannelRecommendations.put(Long.valueOf(j), channelRecommendations);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(j));
        }
    }

    public void lambda$getChannelRecommendations$436(final boolean z, final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getChannelRecommendations$435(tLObject, z, j);
            }
        });
    }

    public void lambda$getContentSettings$455(TLObject tLObject) {
        if (tLObject instanceof TL_account$contentSettings) {
            this.contentSettings = (TL_account$contentSettings) tLObject;
            this.contentSettingsLoadedTime = System.currentTimeMillis();
        }
        this.contentSettingsLoading = false;
        ArrayList<Utilities.Callback<TL_account$contentSettings>> arrayList = this.contentSettingsCallbacks;
        if (arrayList != null) {
            Iterator<Utilities.Callback<TL_account$contentSettings>> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run(this.contentSettings);
            }
            this.contentSettingsCallbacks.clear();
            this.contentSettingsCallbacks = null;
        }
    }

    public void lambda$getContentSettings$456(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getContentSettings$455(tLObject);
            }
        });
    }

    public void lambda$getDifference$328(TLRPC$updates_Difference tLRPC$updates_Difference, int i, int i2) {
        this.loadedFullUsers.clear();
        this.loadedFullChats.clear();
        resetDialogs(true, getMessagesStorage().getLastSeqValue(), tLRPC$updates_Difference.pts, i, i2);
        getStoriesController().cleanup();
    }

    public void lambda$getDifference$329(TLRPC$updates_Difference tLRPC$updates_Difference) {
        this.loadedFullUsers.clear();
        this.loadedFullChats.clear();
        putUsers(tLRPC$updates_Difference.users, false);
        putChats(tLRPC$updates_Difference.chats, false);
    }

    public void lambda$getDifference$330(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            long[] jArr = (long[]) sparseArray.valueAt(i);
            getSendMessagesHelper().processSentMessage((int) jArr[1]);
            NotificationCenter notificationCenter = getNotificationCenter();
            int i2 = NotificationCenter.messageReceivedByServer;
            Integer valueOf = Integer.valueOf((int) jArr[1]);
            Integer valueOf2 = Integer.valueOf(keyAt);
            Long valueOf3 = Long.valueOf(jArr[0]);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, valueOf, valueOf2, null, valueOf3, 0L, -1, bool);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf((int) jArr[1]), Integer.valueOf(keyAt), null, Long.valueOf(jArr[0]), 0L, -1, bool);
        }
    }

    public void lambda$getDifference$331(ArrayList arrayList, TLRPC$updates_Difference tLRPC$updates_Difference) {
        getNotificationsController().processNewMessages(arrayList, !(tLRPC$updates_Difference instanceof TLRPC$TL_updates_differenceSlice), false, null);
    }

    public void lambda$getDifference$332(long j, ArrayList arrayList) {
        updateInterfaceWithMessages(j, arrayList, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$getDifference$333(final long j, final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getDifference$332(j, arrayList);
            }
        });
    }

    public void lambda$getDifference$334(final ArrayList arrayList, final TLRPC$updates_Difference tLRPC$updates_Difference, LongSparseArray longSparseArray) {
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getDifference$331(arrayList, tLRPC$updates_Difference);
                }
            });
        }
        getMessagesStorage().putMessages(tLRPC$updates_Difference.new_messages, true, false, false, getDownloadController().getAutodownloadMask(), 0, 0L);
        for (int i = 0; i < longSparseArray.size(); i++) {
            final long keyAt = longSparseArray.keyAt(i);
            final ArrayList<MessageObject> arrayList2 = (ArrayList) longSparseArray.valueAt(i);
            getMediaDataController().loadReplyMessagesForMessages(arrayList2, keyAt, 0, 0L, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getDifference$333(keyAt, arrayList2);
                }
            }, 0, null);
        }
    }

    public void lambda$getDifference$335(final org.telegram.tgnet.TLRPC$updates_Difference r19, androidx.collection.LongSparseArray r20, androidx.collection.LongSparseArray r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getDifference$335(org.telegram.tgnet.TLRPC$updates_Difference, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray):void");
    }

    public void lambda$getDifference$336(final TLRPC$updates_Difference tLRPC$updates_Difference, ArrayList arrayList, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        getMessagesStorage().putUsersAndChats(tLRPC$updates_Difference.users, tLRPC$updates_Difference.chats, true, false);
        if (!arrayList.isEmpty()) {
            final SparseArray sparseArray = new SparseArray();
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC$TL_updateMessageID tLRPC$TL_updateMessageID = (TLRPC$TL_updateMessageID) arrayList.get(i);
                long[] updateMessageStateAndId = getMessagesStorage().updateMessageStateAndId(tLRPC$TL_updateMessageID.random_id, 0L, null, tLRPC$TL_updateMessageID.id, 0, false, -1, 0);
                if (updateMessageStateAndId != null) {
                    sparseArray.put(tLRPC$TL_updateMessageID.id, updateMessageStateAndId);
                }
            }
            if (sparseArray.size() != 0) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getDifference$330(sparseArray);
                    }
                });
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getDifference$335(tLRPC$updates_Difference, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$getDifference$337(final int i, final int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int i3 = 0;
        if (tLRPC$TL_error != null) {
            this.gettingDifference = false;
            getConnectionsManager().setIsUpdating(false);
            FileLog.d("received: isUpdating = false");
            return;
        }
        final TLRPC$updates_Difference tLRPC$updates_Difference = (TLRPC$updates_Difference) tLObject;
        if (tLRPC$updates_Difference instanceof TLRPC$TL_updates_differenceTooLong) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$getDifference$328(tLRPC$updates_Difference, i, i2);
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
            TLRPC$User tLRPC$User = (TLRPC$User) tLRPC$updates_Difference.users.get(i4);
            longSparseArray.put(tLRPC$User.id, tLRPC$User);
        }
        for (int i5 = 0; i5 < tLRPC$updates_Difference.chats.size(); i5++) {
            TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLRPC$updates_Difference.chats.get(i5);
            longSparseArray2.put(tLRPC$Chat.id, tLRPC$Chat);
        }
        final ArrayList arrayList = new ArrayList();
        if (!tLRPC$updates_Difference.other_updates.isEmpty()) {
            while (i3 < tLRPC$updates_Difference.other_updates.size()) {
                TLRPC$Update tLRPC$Update = (TLRPC$Update) tLRPC$updates_Difference.other_updates.get(i3);
                if (tLRPC$Update instanceof TLRPC$TL_updateMessageID) {
                    arrayList.add((TLRPC$TL_updateMessageID) tLRPC$Update);
                } else {
                    if (getUpdateType(tLRPC$Update) == 2) {
                        long updateChannelId = getUpdateChannelId(tLRPC$Update);
                        int i6 = this.channelsPts.get(updateChannelId);
                        if (i6 == 0 && (i6 = getMessagesStorage().getChannelPtsSync(updateChannelId)) != 0) {
                            this.channelsPts.put(updateChannelId, i6);
                        }
                        if (i6 != 0) {
                            if (getUpdatePts(tLRPC$Update) > i6) {
                            }
                        }
                    }
                    i3++;
                }
                tLRPC$updates_Difference.other_updates.remove(i3);
                i3--;
                i3++;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getDifference$329(tLRPC$updates_Difference);
            }
        });
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getDifference$336(tLRPC$updates_Difference, arrayList, longSparseArray, longSparseArray2);
            }
        });
    }

    public void lambda$getGroupCall$56(TLObject tLObject, long j, Runnable runnable) {
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

    public void lambda$getGroupCall$57(final long j, final Runnable runnable, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getGroupCall$56(tLObject, j, runnable);
            }
        });
    }

    public void lambda$getNewDeleteTask$77(LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        this.gettingNewDeleteTask = true;
        getMessagesStorage().getNewTask(longSparseArray, longSparseArray2);
    }

    public static void lambda$getNextReactionMention$1(Consumer consumer, int i) {
        consumer.accept(Integer.valueOf(i));
    }

    public static void lambda$getNextReactionMention$2(Consumer consumer, int i) {
        consumer.accept(Integer.valueOf(i));
    }

    public static void lambda$getNextReactionMention$3(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error, final Consumer consumer) {
        ArrayList arrayList;
        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
        final int i = 0;
        if (tLRPC$TL_error != null && tLRPC$messages_Messages != null && (arrayList = tLRPC$messages_Messages.messages) != null && !arrayList.isEmpty()) {
            i = ((TLRPC$Message) tLRPC$messages_Messages.messages.get(0)).id;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$getNextReactionMention$2(Consumer.this, i);
            }
        });
    }

    public static void lambda$getNextReactionMention$4(final Consumer consumer, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$getNextReactionMention$3(TLObject.this, tLRPC$TL_error, consumer);
            }
        });
    }

    public void lambda$getNextReactionMention$5(long r13, long r15, final androidx.core.util.Consumer r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getNextReactionMention$5(long, long, androidx.core.util.Consumer, int):void");
    }

    public void lambda$getSavedReactionTags$439(TLObject tLObject, long j, TLRPC$messages_SavedReactionTags tLRPC$messages_SavedReactionTags, TLRPC$TL_messages_getSavedReactionTags tLRPC$TL_messages_getSavedReactionTags) {
        TLRPC$TL_messages_savedReactionsTags tLRPC$TL_messages_savedReactionsTags;
        if (tLObject instanceof TLRPC$TL_messages_savedReactionsTags) {
            tLRPC$TL_messages_savedReactionsTags = (TLRPC$TL_messages_savedReactionsTags) tLObject;
            this.reactionTags.put(j, tLRPC$TL_messages_savedReactionsTags);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, Long.valueOf(j));
        } else {
            if (!(tLObject instanceof TLRPC$TL_messages_savedReactionsTagsNotModified) || tLRPC$messages_SavedReactionTags != null || tLRPC$TL_messages_getSavedReactionTags.hash != 0) {
                return;
            }
            tLRPC$TL_messages_savedReactionsTags = new TLRPC$TL_messages_savedReactionsTags();
            this.reactionTags.put(j, tLRPC$TL_messages_savedReactionsTags);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, Long.valueOf(j));
        }
        saveSavedReactionsTags(j, tLRPC$TL_messages_savedReactionsTags);
    }

    public void lambda$getSavedReactionTags$440(final long j, final TLRPC$messages_SavedReactionTags tLRPC$messages_SavedReactionTags, final TLRPC$TL_messages_getSavedReactionTags tLRPC$TL_messages_getSavedReactionTags, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getSavedReactionTags$439(tLObject, j, tLRPC$messages_SavedReactionTags, tLRPC$TL_messages_getSavedReactionTags);
            }
        });
    }

    public void lambda$getSavedReactionTags$441(final TLRPC$messages_SavedReactionTags tLRPC$messages_SavedReactionTags, final long j) {
        if (this.reactionTags == null) {
            this.reactionTags = new LongSparseArray();
        }
        boolean z = tLRPC$messages_SavedReactionTags instanceof TLRPC$TL_messages_savedReactionsTags;
        if (z) {
            this.reactionTags.put(j, (TLRPC$TL_messages_savedReactionsTags) tLRPC$messages_SavedReactionTags);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, Long.valueOf(j));
        }
        final TLRPC$TL_messages_getSavedReactionTags tLRPC$TL_messages_getSavedReactionTags = new TLRPC$TL_messages_getSavedReactionTags();
        if (z) {
            tLRPC$TL_messages_getSavedReactionTags.hash = tLRPC$messages_SavedReactionTags.hash;
        }
        if (j != 0) {
            tLRPC$TL_messages_getSavedReactionTags.flags = 1 | tLRPC$TL_messages_getSavedReactionTags.flags;
            tLRPC$TL_messages_getSavedReactionTags.peer = getInputPeer(j);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getSavedReactionTags, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$getSavedReactionTags$440(j, tLRPC$messages_SavedReactionTags, tLRPC$TL_messages_getSavedReactionTags, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$getSavedReactionTags$442(final long r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$getSavedReactionTags$442(long):void");
    }

    public void lambda$getSendAsPeers$396(TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers) {
        putUsers(tLRPC$TL_channels_sendAsPeers.users, false);
        putChats(tLRPC$TL_channels_sendAsPeers.chats, false);
    }

    public void lambda$getSendAsPeers$397(TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers, long j, SendAsPeersInfo sendAsPeersInfo) {
        if (tLRPC$TL_channels_sendAsPeers == null) {
            this.sendAsPeers.remove(j);
            return;
        }
        sendAsPeersInfo.loadTime = SystemClock.elapsedRealtime();
        sendAsPeersInfo.sendAsPeers = tLRPC$TL_channels_sendAsPeers;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadSendAsPeers, Long.valueOf(j), tLRPC$TL_channels_sendAsPeers);
    }

    public void lambda$getSendAsPeers$398(final long j, final SendAsPeersInfo sendAsPeersInfo, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        final TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers;
        if (tLObject != null) {
            tLRPC$TL_channels_sendAsPeers = (TLRPC$TL_channels_sendAsPeers) tLObject;
            if (!tLRPC$TL_channels_sendAsPeers.peers.isEmpty()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getSendAsPeers$396(tLRPC$TL_channels_sendAsPeers);
                    }
                });
                final TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers2 = tLRPC$TL_channels_sendAsPeers;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getSendAsPeers$397(tLRPC$TL_channels_sendAsPeers2, j, sendAsPeersInfo);
                    }
                });
            }
        }
        tLRPC$TL_channels_sendAsPeers = null;
        final TLRPC$TL_channels_sendAsPeers tLRPC$TL_channels_sendAsPeers22 = tLRPC$TL_channels_sendAsPeers;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getSendAsPeers$397(tLRPC$TL_channels_sendAsPeers22, j, sendAsPeersInfo);
            }
        });
    }

    public void lambda$getSponsoredMessages$393(TLRPC$messages_SponsoredMessages tLRPC$messages_SponsoredMessages) {
        putUsers(tLRPC$messages_SponsoredMessages.users, false);
        putChats(tLRPC$messages_SponsoredMessages.chats, false);
    }

    public void lambda$getSponsoredMessages$394(ArrayList arrayList, long j, SponsoredMessagesInfo sponsoredMessagesInfo, Integer num) {
        if (arrayList == null) {
            this.sponsoredMessages.remove(j);
            return;
        }
        sponsoredMessagesInfo.loadTime = SystemClock.elapsedRealtime();
        sponsoredMessagesInfo.messages = arrayList;
        sponsoredMessagesInfo.posts_between = num;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadSponsoredMessages, Long.valueOf(j), arrayList);
    }

    public void lambda$getSponsoredMessages$395(final long j, final SponsoredMessagesInfo sponsoredMessagesInfo, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        final Integer num;
        final ArrayList arrayList = null;
        r2 = null;
        Integer num2 = null;
        if (tLObject instanceof TLRPC$messages_SponsoredMessages) {
            final TLRPC$messages_SponsoredMessages tLRPC$messages_SponsoredMessages = (TLRPC$messages_SponsoredMessages) tLObject;
            if (!tLRPC$messages_SponsoredMessages.messages.isEmpty()) {
                if ((tLRPC$messages_SponsoredMessages instanceof TLRPC$TL_messages_sponsoredMessages) && (tLRPC$messages_SponsoredMessages.flags & 1) > 0) {
                    num2 = Integer.valueOf(tLRPC$messages_SponsoredMessages.posts_between);
                }
                ArrayList arrayList2 = new ArrayList();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getSponsoredMessages$393(tLRPC$messages_SponsoredMessages);
                    }
                });
                LongSparseArray longSparseArray = new LongSparseArray();
                LongSparseArray longSparseArray2 = new LongSparseArray();
                int i = 0;
                for (int i2 = 0; i2 < tLRPC$messages_SponsoredMessages.users.size(); i2++) {
                    TLRPC$User tLRPC$User = (TLRPC$User) tLRPC$messages_SponsoredMessages.users.get(i2);
                    longSparseArray.put(tLRPC$User.id, tLRPC$User);
                }
                for (int i3 = 0; i3 < tLRPC$messages_SponsoredMessages.chats.size(); i3++) {
                    TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLRPC$messages_SponsoredMessages.chats.get(i3);
                    longSparseArray2.put(tLRPC$Chat.id, tLRPC$Chat);
                }
                int size = tLRPC$messages_SponsoredMessages.messages.size();
                int i4 = -10000000;
                while (i < size) {
                    TLRPC$TL_sponsoredMessage tLRPC$TL_sponsoredMessage = (TLRPC$TL_sponsoredMessage) tLRPC$messages_SponsoredMessages.messages.get(i);
                    TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
                    if (!tLRPC$TL_sponsoredMessage.entities.isEmpty()) {
                        tLRPC$TL_message.entities = tLRPC$TL_sponsoredMessage.entities;
                        tLRPC$TL_message.flags |= 128;
                    }
                    tLRPC$TL_message.peer_id = getPeer(j);
                    tLRPC$TL_message.flags |= 256;
                    tLRPC$TL_message.date = getConnectionsManager().getCurrentTime();
                    int i5 = i4 - 1;
                    tLRPC$TL_message.id = i4;
                    tLRPC$TL_message.message = tLRPC$TL_sponsoredMessage.message;
                    TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$TL_sponsoredMessage.media;
                    if (tLRPC$MessageMedia != null) {
                        tLRPC$TL_message.flags |= 512;
                    }
                    tLRPC$TL_message.media = tLRPC$MessageMedia;
                    MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC$Message) tLRPC$TL_message, longSparseArray, longSparseArray2, true, true);
                    messageObject.sponsoredId = tLRPC$TL_sponsoredMessage.random_id;
                    messageObject.sponsoredTitle = tLRPC$TL_sponsoredMessage.title;
                    messageObject.sponsoredUrl = tLRPC$TL_sponsoredMessage.url;
                    messageObject.sponsoredRecommended = tLRPC$TL_sponsoredMessage.recommended;
                    messageObject.sponsoredPhoto = tLRPC$TL_sponsoredMessage.photo;
                    messageObject.sponsoredInfo = tLRPC$TL_sponsoredMessage.sponsor_info;
                    messageObject.sponsoredAdditionalInfo = tLRPC$TL_sponsoredMessage.additional_info;
                    messageObject.sponsoredButtonText = tLRPC$TL_sponsoredMessage.button_text;
                    messageObject.sponsoredCanReport = tLRPC$TL_sponsoredMessage.can_report;
                    messageObject.sponsoredColor = tLRPC$TL_sponsoredMessage.color;
                    messageObject.sponsoredMedia = tLRPC$TL_sponsoredMessage.media;
                    messageObject.setType();
                    messageObject.textLayoutBlocks = new ArrayList<>();
                    messageObject.generateThumbs(true);
                    arrayList2.add(messageObject);
                    i++;
                    tLRPC$messages_SponsoredMessages = tLRPC$messages_SponsoredMessages;
                    i4 = i5;
                }
                num = num2;
                arrayList = arrayList2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$getSponsoredMessages$394(arrayList, j, sponsoredMessagesInfo, num);
                    }
                });
            }
        }
        num = null;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getSponsoredMessages$394(arrayList, j, sponsoredMessagesInfo, num);
            }
        });
    }

    public static void lambda$hidePeerSettingsBar$69(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$hidePromoDialog$126(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$hidePromoDialog$127() {
        this.promoDialogId = 0L;
        this.proxyDialogAddress = null;
        this.nextPromoInfoCheckTime = getConnectionsManager().getCurrentTime() + 3600;
        getGlobalMainSettings().edit().putLong("proxy_dialog", this.promoDialogId).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", this.nextPromoInfoCheckTime).commit();
    }

    public static void lambda$installTheme$113(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$installTheme$114(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$loadAppConfig$30(TLRPC$TL_help_appConfig tLRPC$TL_help_appConfig) {
        if (tLRPC$TL_help_appConfig != null) {
            TLRPC$JSONValue tLRPC$JSONValue = tLRPC$TL_help_appConfig.config;
            if (tLRPC$JSONValue instanceof TLRPC$TL_jsonObject) {
                applyAppConfig((TLRPC$TL_jsonObject) tLRPC$JSONValue);
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.loadAppConfigRunnable);
        AndroidUtilities.runOnUIThread(this.loadAppConfigRunnable, 240010L);
    }

    public void lambda$loadAppConfig$31(final TLRPC$TL_help_appConfig tLRPC$TL_help_appConfig) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadAppConfig$30(tLRPC$TL_help_appConfig);
            }
        });
    }

    public void lambda$loadChannelAdmins$59(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_channels_channelParticipants) {
            processLoadedAdminsResponse(j, (TLRPC$TL_channels_channelParticipants) tLObject);
        }
    }

    public void lambda$loadChannelParticipants$139(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, Long l, Utilities.Callback callback) {
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

    public void lambda$loadChannelParticipants$140(final Long l, final Utilities.Callback callback, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadChannelParticipants$139(tLRPC$TL_error, tLObject, l, callback);
            }
        });
    }

    public void lambda$loadCurrentState$303(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.updatingState = false;
        if (tLRPC$TL_error != null) {
            if (tLRPC$TL_error.code != 401) {
                loadCurrentState();
                return;
            }
            return;
        }
        TLRPC$TL_updates_state tLRPC$TL_updates_state = (TLRPC$TL_updates_state) tLObject;
        getMessagesStorage().setLastDateValue(tLRPC$TL_updates_state.date);
        getMessagesStorage().setLastPtsValue(tLRPC$TL_updates_state.pts);
        getMessagesStorage().setLastSeqValue(tLRPC$TL_updates_state.seq);
        getMessagesStorage().setLastQtsValue(tLRPC$TL_updates_state.qts);
        for (int i = 0; i < 3; i++) {
            processUpdatesQueue(i, 2);
        }
        getMessagesStorage().saveDiffParams(getMessagesStorage().getLastSeqValue(), getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue());
    }

    public void lambda$loadDialogs$188(int i, int i2, Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Dialogs tLRPC$messages_Dialogs = (TLRPC$messages_Dialogs) tLObject;
            processLoadedDialogs(tLRPC$messages_Dialogs, null, null, i, 0, i2, 0, false, false, false);
            if (runnable == null || !tLRPC$messages_Dialogs.dialogs.isEmpty()) {
                return;
            }
            AndroidUtilities.runOnUIThread(runnable);
        }
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
        TLRPC$TL_messages_getChats tLRPC$TL_messages_getChats2 = null;
        TLRPC$TL_channels_getChannels tLRPC$TL_channels_getChannels2 = null;
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            TLRPC$InputPeer tLRPC$InputPeer = (TLRPC$InputPeer) entry2.getValue();
            if (tLRPC$InputPeer.chat_id != 0) {
                if (tLRPC$TL_messages_getChats2 == null) {
                    tLRPC$TL_messages_getChats = new TLRPC$TL_messages_getChats();
                    arrayList5.add(tLRPC$TL_messages_getChats);
                } else {
                    tLRPC$TL_messages_getChats = tLRPC$TL_messages_getChats2;
                }
                tLRPC$TL_messages_getChats.id.add((Long) entry2.getKey());
                if (tLRPC$TL_messages_getChats.id.size() == i) {
                    sendLoadPeersRequest(tLRPC$TL_messages_getChats, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashSet, runnable);
                    tLRPC$TL_messages_getChats2 = null;
                } else {
                    tLRPC$TL_messages_getChats2 = tLRPC$TL_messages_getChats;
                }
            } else if (tLRPC$InputPeer.channel_id != 0) {
                if (tLRPC$TL_channels_getChannels2 == null) {
                    TLRPC$TL_channels_getChannels tLRPC$TL_channels_getChannels3 = new TLRPC$TL_channels_getChannels();
                    arrayList5.add(tLRPC$TL_channels_getChannels3);
                    tLRPC$TL_channels_getChannels = tLRPC$TL_channels_getChannels3;
                } else {
                    tLRPC$TL_channels_getChannels = tLRPC$TL_channels_getChannels2;
                }
                tLRPC$TL_channels_getChannels.id.add(getInputChannel(tLRPC$InputPeer));
                if (tLRPC$TL_channels_getChannels.id.size() == i) {
                    sendLoadPeersRequest(tLRPC$TL_channels_getChannels, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashSet, runnable);
                    tLRPC$TL_channels_getChannels2 = null;
                } else {
                    tLRPC$TL_channels_getChannels2 = tLRPC$TL_channels_getChannels;
                }
            }
        }
        if (tLRPC$TL_messages_getChats2 != null) {
            sendLoadPeersRequest(tLRPC$TL_messages_getChats2, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashSet, runnable);
        }
        if (tLRPC$TL_channels_getChannels2 != null) {
            sendLoadPeersRequest(tLRPC$TL_channels_getChannels2, arrayList5, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap2, hashSet, runnable);
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

    public void lambda$loadFullChat$61(long j, TLRPC$TL_messages_chatFull tLRPC$TL_messages_chatFull, int i, long j2) {
        TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) this.fullChats.get(j);
        if (tLRPC$ChatFull != null) {
            tLRPC$TL_messages_chatFull.full_chat.inviterId = tLRPC$ChatFull.inviterId;
        }
        this.fullChats.put(j, tLRPC$TL_messages_chatFull.full_chat);
        long j3 = -j;
        getTranslateController().updateDialogFull(j3);
        applyDialogNotificationsSettings(j3, 0L, tLRPC$TL_messages_chatFull.full_chat.notify_settings);
        for (int i2 = 0; i2 < tLRPC$TL_messages_chatFull.full_chat.bot_info.size(); i2++) {
            getMediaDataController().putBotInfo(j3, (TL_bots$BotInfo) tLRPC$TL_messages_chatFull.full_chat.bot_info.get(i2));
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
        if (tLRPC$TL_messages_chatFull.full_chat.emojiset != null) {
            getMediaDataController().getGroupStickerSetById(tLRPC$TL_messages_chatFull.full_chat.emojiset);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, tLRPC$TL_messages_chatFull.full_chat, Integer.valueOf(i), Boolean.FALSE, Boolean.TRUE);
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(j3);
        if (tLRPC$Dialog != null) {
            TLRPC$ChatFull tLRPC$ChatFull2 = tLRPC$TL_messages_chatFull.full_chat;
            if ((tLRPC$ChatFull2.flags & 2048) != 0) {
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

    public void lambda$loadFullChat$62(TLRPC$TL_error tLRPC$TL_error, long j) {
        checkChannelError(tLRPC$TL_error.text, j);
        this.loadingFullChats.remove(Long.valueOf(j));
    }

    public void lambda$loadFullChat$63(final long j, final long j2, TLRPC$Chat tLRPC$Chat, final int i, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadFullChat$62(tLRPC$TL_error, j2);
                }
            });
            return;
        }
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
                MessagesController.this.lambda$loadFullChat$61(j2, tLRPC$TL_messages_chatFull, i, j);
            }
        });
    }

    public void lambda$loadFullUser$64(TLRPC$UserFull tLRPC$UserFull, TLRPC$User tLRPC$User, int i) {
        savePeerSettings(tLRPC$UserFull.user.id, tLRPC$UserFull.settings, false);
        applyDialogNotificationsSettings(tLRPC$User.id, 0L, tLRPC$UserFull.notify_settings);
        TL_bots$BotInfo tL_bots$BotInfo = tLRPC$UserFull.bot_info;
        if (tL_bots$BotInfo instanceof TL_bots$TL_botInfo) {
            tL_bots$BotInfo.user_id = tLRPC$User.id;
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
        TL_bots$BotInfo tL_bots$BotInfo2 = tLRPC$UserFull.bot_info;
        if (tL_bots$BotInfo2 instanceof TL_bots$TL_botInfo) {
            tL_bots$BotInfo2.user_id = tLRPC$UserFull.id;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.botInfoDidLoad, tLRPC$UserFull.bot_info, Integer.valueOf(i));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(tLRPC$User.id), tLRPC$UserFull);
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(tLRPC$User.id);
        if (tLRPC$Dialog != null) {
            if ((tLRPC$UserFull.flags & 2048) != 0) {
                int i2 = tLRPC$Dialog.folder_id;
                int i3 = tLRPC$UserFull.folder_id;
                if (i2 != i3) {
                    tLRPC$Dialog.folder_id = i3;
                    sortDialogs(null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                }
            }
            if ((tLRPC$UserFull.flags & 16384) != 0) {
                int i4 = tLRPC$Dialog.ttl_period;
                int i5 = tLRPC$UserFull.ttl_period;
                if (i4 != i5) {
                    tLRPC$Dialog.ttl_period = i5;
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
                }
            }
        }
    }

    public void lambda$loadFullUser$65(TLRPC$User tLRPC$User) {
        this.loadingFullUsers.remove(Long.valueOf(tLRPC$User.id));
    }

    public void lambda$loadFullUser$66(long j, Utilities.Callback callback, final TLRPC$User tLRPC$User, final int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        Runnable runnable;
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
            if (callback != null) {
                callback.run(tLRPC$UserFull);
            }
            runnable = new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadFullUser$64(tLRPC$UserFull, tLRPC$User, i);
                }
            };
        } else {
            runnable = new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadFullUser$65(tLRPC$User);
                }
            };
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$loadGlobalNotificationsSettings$189(org.telegram.tgnet.TLObject r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$loadGlobalNotificationsSettings$189(org.telegram.tgnet.TLObject, int):void");
    }

    public void lambda$loadGlobalNotificationsSettings$190(final int i, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadGlobalNotificationsSettings$189(tLObject, i);
            }
        });
    }

    public void lambda$loadGlobalNotificationsSettings$191(TLObject tLObject) {
        this.loadingNotificationSettings--;
        if (tLObject instanceof TLRPC$TL_reactionsNotifySettings) {
            TLRPC$TL_reactionsNotifySettings tLRPC$TL_reactionsNotifySettings = (TLRPC$TL_reactionsNotifySettings) tLObject;
            SharedPreferences.Editor edit = this.notificationsPreferences.edit();
            edit.putBoolean("EnableReactionsMessages", tLRPC$TL_reactionsNotifySettings.messages_notify_from != null);
            TLRPC$ReactionNotificationsFrom tLRPC$ReactionNotificationsFrom = tLRPC$TL_reactionsNotifySettings.messages_notify_from;
            if (tLRPC$ReactionNotificationsFrom != null) {
                edit.putBoolean("EnableReactionsMessagesContacts", tLRPC$ReactionNotificationsFrom instanceof TLRPC$TL_reactionNotificationsFromContacts);
            }
            edit.putBoolean("EnableReactionsStories", tLRPC$TL_reactionsNotifySettings.stories_notify_from != null);
            TLRPC$ReactionNotificationsFrom tLRPC$ReactionNotificationsFrom2 = tLRPC$TL_reactionsNotifySettings.stories_notify_from;
            if (tLRPC$ReactionNotificationsFrom2 != null) {
                edit.putBoolean("EnableReactionsStoriesContacts", tLRPC$ReactionNotificationsFrom2 instanceof TLRPC$TL_reactionNotificationsFromContacts);
            }
            edit.putBoolean("EnableReactionsPreview", tLRPC$TL_reactionsNotifySettings.show_previews);
            getNotificationsController().getNotificationsSettingsFacade().applySoundSettings(tLRPC$TL_reactionsNotifySettings.sound, edit, 0L, 0L, 4, false);
            edit.apply();
        }
        if (this.loadingNotificationSettings == 0) {
            getUserConfig().notificationsSettingsLoaded = true;
            getUserConfig().saveConfig(false);
        }
    }

    public void lambda$loadGlobalNotificationsSettings$192(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadGlobalNotificationsSettings$191(tLObject);
            }
        });
    }

    public void lambda$loadHintDialogs$184(TLObject tLObject) {
        TLRPC$TL_help_recentMeUrls tLRPC$TL_help_recentMeUrls = (TLRPC$TL_help_recentMeUrls) tLObject;
        putUsers(tLRPC$TL_help_recentMeUrls.users, false);
        putChats(tLRPC$TL_help_recentMeUrls.chats, false);
        this.hintDialogs.clear();
        this.hintDialogs.addAll(tLRPC$TL_help_recentMeUrls.urls);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$loadHintDialogs$185(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadHintDialogs$184(tLObject);
                }
            });
        }
    }

    public void lambda$loadMessagesInternal$166(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            if (tLRPC$messages_Messages instanceof TLRPC$TL_messages_messagesNotModified) {
                return;
            }
            processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i2, i3, false, i4, i5, i6, i7, i8, i9, false, i10, j3, i11, z, i12, z2, z3, null);
            return;
        }
        if (tLRPC$TL_error == null || !"SHORTCUT_INVALID".equals(tLRPC$TL_error.text)) {
            return;
        }
        processLoadedMessages(new TLRPC$TL_messages_messages(), 0, j, j2, i, i2, i3, false, i4, i5, i6, i7, i8, i9, false, i10, j3, i11, z, i12, z2, z3, null);
    }

    public void lambda$loadMessagesInternal$167(int i, TLRPC$TL_messages_getSavedHistory tLRPC$TL_messages_getSavedHistory, TLRPC$TL_error tLRPC$TL_error) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tLRPC$TL_messages_getSavedHistory, tLRPC$TL_error);
    }

    public void lambda$loadMessagesInternal$168(long j, int i, int i2, int i3, long j2, final int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, final TLRPC$TL_messages_getSavedHistory tLRPC$TL_messages_getSavedHistory, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        int i13;
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadMessagesInternal$167(i4, tLRPC$TL_messages_getSavedHistory, tLRPC$TL_error);
                }
            });
            return;
        }
        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
        removeDeletedMessagesFromArray(j, tLRPC$messages_Messages.messages);
        if (tLRPC$messages_Messages.messages.size() > i) {
            tLRPC$messages_Messages.messages.remove(0);
        }
        if (i3 == 0 || tLRPC$messages_Messages.messages.isEmpty()) {
            i13 = i2;
        } else {
            int i14 = ((TLRPC$Message) tLRPC$messages_Messages.messages.get(r0.size() - 1)).id;
            int size = tLRPC$messages_Messages.messages.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                TLRPC$Message tLRPC$Message = (TLRPC$Message) tLRPC$messages_Messages.messages.get(size);
                if (tLRPC$Message.date > i3) {
                    i14 = tLRPC$Message.id;
                    break;
                }
                size--;
            }
            i13 = i14;
        }
        processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i13, i3, false, i4, i5, i6, i7, i8, i9, false, i10, j3, i11, z, i12, z2, z3, null);
    }

    public void lambda$loadMessagesInternal$169(int i, TLRPC$TL_messages_getReplies tLRPC$TL_messages_getReplies, TLRPC$TL_error tLRPC$TL_error) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tLRPC$TL_messages_getReplies, tLRPC$TL_error);
    }

    public void lambda$loadMessagesInternal$170(int i, int i2, int i3, int i4, int i5, long j, long j2, final int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, final TLRPC$TL_messages_getReplies tLRPC$TL_messages_getReplies, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        int i13;
        int i14;
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadMessagesInternal$169(i6, tLRPC$TL_messages_getReplies, tLRPC$TL_error);
                }
            });
            return;
        }
        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
        if (tLRPC$messages_Messages.messages.size() > i) {
            tLRPC$messages_Messages.messages.remove(0);
        }
        if (!tLRPC$messages_Messages.messages.isEmpty()) {
            if (i3 != 0) {
                int i15 = ((TLRPC$Message) tLRPC$messages_Messages.messages.get(r0.size() - 1)).id;
                int size = tLRPC$messages_Messages.messages.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    TLRPC$Message tLRPC$Message = (TLRPC$Message) tLRPC$messages_Messages.messages.get(size);
                    if (tLRPC$Message.date > i3) {
                        i15 = tLRPC$Message.id;
                        break;
                    }
                    size--;
                }
                i13 = i15;
                i14 = 0;
                processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i13, i3, false, i6, i14, i7, i8, i9, i5, false, i10, j3, i11, z, i12, z2, z3, null);
            }
            if (i4 != 0) {
                if (i5 == 2 && i2 > 0) {
                    for (int size2 = tLRPC$messages_Messages.messages.size() - 1; size2 >= 0; size2--) {
                        TLRPC$Message tLRPC$Message2 = (TLRPC$Message) tLRPC$messages_Messages.messages.get(size2);
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
            }
        }
        i13 = i2;
        i14 = 0;
        processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i13, i3, false, i6, i14, i7, i8, i9, i5, false, i10, j3, i11, z, i12, z2, z3, null);
    }

    public void lambda$loadMessagesInternal$171(int i, int i2, long j, long j2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        int i13;
        if (tLObject != null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            if (tLRPC$messages_Messages instanceof TLRPC$TL_messages_messagesNotModified) {
                return;
            }
            if (i2 == 0 || tLRPC$messages_Messages.messages.isEmpty()) {
                i13 = i;
            } else {
                int i14 = ((TLRPC$Message) tLRPC$messages_Messages.messages.get(r0.size() - 1)).id;
                int size = tLRPC$messages_Messages.messages.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    TLRPC$Message tLRPC$Message = (TLRPC$Message) tLRPC$messages_Messages.messages.get(size);
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

    public void lambda$loadMessagesInternal$172(int i, TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs, TLRPC$TL_error tLRPC$TL_error) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tLRPC$TL_messages_getPeerDialogs, tLRPC$TL_error);
    }

    public void lambda$loadMessagesInternal$173(long j, long j2, boolean z, int i, int i2, int i3, int i4, final int i5, int i6, long j3, int i7, int i8, int i9, boolean z2, boolean z3, boolean z4, final TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadMessagesInternal$172(i5, tLRPC$TL_messages_getPeerDialogs, tLRPC$TL_error);
                }
            });
            return;
        }
        TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
        if (!tLRPC$TL_messages_peerDialogs.dialogs.isEmpty()) {
            TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) tLRPC$TL_messages_peerDialogs.dialogs.get(0);
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
    }

    public void lambda$loadMessagesInternal$174(int i, TLRPC$TL_messages_getHistory tLRPC$TL_messages_getHistory, TLRPC$TL_error tLRPC$TL_error) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.loadingMessagesFailed, Integer.valueOf(i), tLRPC$TL_messages_getHistory, tLRPC$TL_error);
    }

    public void lambda$loadMessagesInternal$175(long j, int i, int i2, int i3, long j2, final int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, final TLRPC$TL_messages_getHistory tLRPC$TL_messages_getHistory, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        int i13;
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadMessagesInternal$174(i4, tLRPC$TL_messages_getHistory, tLRPC$TL_error);
                }
            });
            return;
        }
        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
        removeDeletedMessagesFromArray(j, tLRPC$messages_Messages.messages);
        if (tLRPC$messages_Messages.messages.size() > i) {
            tLRPC$messages_Messages.messages.remove(0);
        }
        if (i3 == 0 || tLRPC$messages_Messages.messages.isEmpty()) {
            i13 = i2;
        } else {
            int i14 = ((TLRPC$Message) tLRPC$messages_Messages.messages.get(r0.size() - 1)).id;
            int size = tLRPC$messages_Messages.messages.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                TLRPC$Message tLRPC$Message = (TLRPC$Message) tLRPC$messages_Messages.messages.get(size);
                if (tLRPC$Message.date > i3) {
                    i14 = tLRPC$Message.id;
                    break;
                }
                size--;
            }
            i13 = i14;
        }
        processLoadedMessages(tLRPC$messages_Messages, tLRPC$messages_Messages.messages.size(), j, j2, i, i13, i3, false, i4, i5, i6, i7, i8, i9, false, i10, j3, i11, z, i12, z2, z3, null);
    }

    public void lambda$loadPeerSettings$73(long j, TLObject tLObject) {
        this.loadingPeerSettings.remove(j);
        if (tLObject != null) {
            TLRPC$TL_messages_peerSettings tLRPC$TL_messages_peerSettings = (TLRPC$TL_messages_peerSettings) tLObject;
            TLRPC$PeerSettings tLRPC$PeerSettings = tLRPC$TL_messages_peerSettings.settings;
            putUsers(tLRPC$TL_messages_peerSettings.users, false);
            putChats(tLRPC$TL_messages_peerSettings.chats, false);
            savePeerSettings(j, tLRPC$PeerSettings, false);
        }
    }

    public void lambda$loadPeerSettings$74(final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadPeerSettings$73(j, tLObject);
            }
        });
    }

    public void lambda$loadPinnedDialogs$343(int i, ArrayList arrayList, boolean z, TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs, LongSparseArray longSparseArray, TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs) {
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList<Integer> arrayList2;
        ArrayList arrayList3;
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
                if (!DialogObject.isEncryptedDialog(tLRPC$Dialog.id)) {
                    if (!tLRPC$Dialog.pinned) {
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
                } else {
                    if (i2 < arrayList.size()) {
                        arrayList.add(i2, tLRPC$Dialog);
                    } else {
                        arrayList.add(tLRPC$Dialog);
                    }
                    i2++;
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
                TLRPC$Dialog tLRPC$Dialog3 = (TLRPC$Dialog) this.dialogs_dict.get(tLRPC$Dialog2.id);
                if (tLRPC$Dialog3 != null) {
                    tLRPC$Dialog3.pinned = z2;
                    tLRPC$Dialog3.pinnedNum = tLRPC$Dialog2.pinnedNum;
                    arrayList5.add(Long.valueOf(tLRPC$Dialog2.id));
                    arrayList6.add(Integer.valueOf(tLRPC$Dialog2.pinnedNum));
                    arrayList2 = arrayList6;
                } else {
                    this.dialogs_dict.put(tLRPC$Dialog2.id, tLRPC$Dialog2);
                    ArrayList arrayList7 = (ArrayList) longSparseArray.get(tLRPC$Dialog2.id);
                    arrayList2 = arrayList6;
                    this.dialogMessage.put(tLRPC$Dialog2.id, arrayList7);
                    if (arrayList7 != null) {
                        int i6 = 0;
                        while (i6 < arrayList7.size()) {
                            MessageObject messageObject = (MessageObject) arrayList7.get(i6);
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
                    TLRPC$Dialog tLRPC$Dialog4 = (TLRPC$Dialog) this.dialogs_dict.valueAt(i7);
                    if (this.deletingDialogs.indexOfKey(tLRPC$Dialog4.id) < 0) {
                        this.allDialogs.add(tLRPC$Dialog4);
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

    public void lambda$loadPinnedDialogs$344(final int i, final ArrayList arrayList, final boolean z, final TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs, final LongSparseArray longSparseArray, final TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadPinnedDialogs$343(i, arrayList, z, tLRPC$TL_messages_peerDialogs, longSparseArray, tLRPC$TL_messages_dialogs);
            }
        });
    }

    public void lambda$loadPinnedDialogs$345(final int r19, org.telegram.tgnet.TLObject r20, org.telegram.tgnet.TLRPC$TL_error r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$loadPinnedDialogs$345(int, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$loadRemoteFilters$23() {
        Utilities.Callback<Boolean> callback = this.onLoadedRemoteFilters;
        if (callback != null) {
            callback.run(Boolean.TRUE);
            this.onLoadedRemoteFilters = null;
        }
    }

    public void lambda$loadRemoteFilters$24() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
    }

    public void lambda$loadRemoteFilters$25() {
        Utilities.Callback<Boolean> callback = this.onLoadedRemoteFilters;
        if (callback != null) {
            callback.run(Boolean.TRUE);
            this.onLoadedRemoteFilters = null;
        }
    }

    public void lambda$loadRemoteFilters$26() {
        this.loadingRemoteFilters = false;
        Utilities.Callback<Boolean> callback = this.onLoadedRemoteFilters;
        if (callback != null) {
            callback.run(Boolean.FALSE);
            this.onLoadedRemoteFilters = null;
        }
    }

    public void lambda$loadRemoteFilters$27(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$Vector) {
            ArrayList<TLRPC$DialogFilter> arrayList = new ArrayList<>();
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            for (int i = 0; i < tLRPC$Vector.objects.size(); i++) {
                arrayList.add((TLRPC$DialogFilter) tLRPC$Vector.objects.get(i));
            }
            getMessagesStorage().checkLoadedRemoteFilters(arrayList, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadRemoteFilters$23();
                }
            });
            return;
        }
        if (!(tLObject instanceof TLRPC$TL_messages_dialogFilters)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadRemoteFilters$26();
                }
            });
            return;
        }
        TLRPC$TL_messages_dialogFilters tLRPC$TL_messages_dialogFilters = (TLRPC$TL_messages_dialogFilters) tLObject;
        boolean z = this.folderTags;
        boolean z2 = tLRPC$TL_messages_dialogFilters.tags_enabled;
        if (z != z2) {
            setFolderTags(z2);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$loadRemoteFilters$24();
                }
            });
        }
        getMessagesStorage().checkLoadedRemoteFilters(tLRPC$TL_messages_dialogFilters.filters, new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadRemoteFilters$25();
            }
        });
    }

    public void lambda$loadSignUpNotificationsSettings$195(TLObject tLObject) {
        this.loadingNotificationSignUpSettings = false;
        SharedPreferences.Editor edit = this.notificationsPreferences.edit();
        boolean z = tLObject instanceof TLRPC$TL_boolFalse;
        this.enableJoined = z;
        edit.putBoolean("EnableContactJoined", z);
        edit.commit();
        getUserConfig().notificationsSignUpSettingsLoaded = true;
        getUserConfig().saveConfig(false);
    }

    public void lambda$loadSignUpNotificationsSettings$196(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadSignUpNotificationsSettings$195(tLObject);
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

    public void lambda$loadSuggestedFilters$22(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadSuggestedFilters$21(tLObject);
            }
        });
    }

    public void lambda$loadUnknownChannel$308(long j, TLRPC$Chat tLRPC$Chat, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            if (!tLRPC$TL_messages_peerDialogs.dialogs.isEmpty() && !tLRPC$TL_messages_peerDialogs.chats.isEmpty()) {
                TLRPC$TL_dialog tLRPC$TL_dialog = (TLRPC$TL_dialog) tLRPC$TL_messages_peerDialogs.dialogs.get(0);
                TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
                tLRPC$TL_messages_dialogs.dialogs.addAll(tLRPC$TL_messages_peerDialogs.dialogs);
                tLRPC$TL_messages_dialogs.messages.addAll(tLRPC$TL_messages_peerDialogs.messages);
                tLRPC$TL_messages_dialogs.users.addAll(tLRPC$TL_messages_peerDialogs.users);
                tLRPC$TL_messages_dialogs.chats.addAll(tLRPC$TL_messages_peerDialogs.chats);
                processLoadedDialogs(tLRPC$TL_messages_dialogs, null, null, tLRPC$TL_dialog.folder_id, 0, 1, this.DIALOGS_LOAD_TYPE_CHANNEL, false, false, false);
            }
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        this.gettingUnknownChannels.delete(tLRPC$Chat.id);
    }

    public void lambda$loadUnknownDialog$197(long j, long j2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            if (!tLRPC$TL_messages_peerDialogs.dialogs.isEmpty()) {
                TLRPC$TL_dialog tLRPC$TL_dialog = (TLRPC$TL_dialog) tLRPC$TL_messages_peerDialogs.dialogs.get(0);
                TLRPC$TL_messages_dialogs tLRPC$TL_messages_dialogs = new TLRPC$TL_messages_dialogs();
                tLRPC$TL_messages_dialogs.dialogs.addAll(tLRPC$TL_messages_peerDialogs.dialogs);
                tLRPC$TL_messages_dialogs.messages.addAll(tLRPC$TL_messages_peerDialogs.messages);
                tLRPC$TL_messages_dialogs.users.addAll(tLRPC$TL_messages_peerDialogs.users);
                tLRPC$TL_messages_dialogs.chats.addAll(tLRPC$TL_messages_peerDialogs.chats);
                processLoadedDialogs(tLRPC$TL_messages_dialogs, null, null, tLRPC$TL_dialog.folder_id, 0, 1, this.DIALOGS_LOAD_TYPE_UNKNOWN, false, false, false);
            }
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
        this.gettingUnknownDialogs.delete(j2);
    }

    public void lambda$loadUnreadDialogs$339(TLObject tLObject) {
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
                    TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(j);
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

    public void lambda$loadUnreadDialogs$340(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadUnreadDialogs$339(tLObject);
            }
        });
    }

    public static void lambda$loadUsersPremiumLocked$273(TLObject tLObject, ArrayList arrayList, Utilities.Callback callback) {
        ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof TLRPC$Vector) {
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            for (int i = 0; i < tLRPC$Vector.objects.size(); i++) {
                if (i < arrayList.size() && (tLRPC$Vector.objects.get(i) instanceof TLRPC$TL_boolTrue)) {
                    arrayList2.add(Long.valueOf(((TLRPC$User) arrayList.get(i)).id));
                }
            }
        }
        callback.run(arrayList2);
    }

    public static void lambda$loadUsersPremiumLocked$274(final ArrayList arrayList, final Utilities.Callback callback, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$loadUsersPremiumLocked$273(TLObject.this, arrayList, callback);
            }
        });
    }

    public static void lambda$logDeviceStats$28(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$markAllTopicsAsRead$6() {
        getMessagesController().sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
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

    public void lambda$markAllTopicsAsRead$9(final long j, final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markAllTopicsAsRead$8(arrayList, j);
            }
        });
    }

    public void lambda$markDialogAsRead$231(long j, int i, int i2, boolean z) {
        LongSparseIntArray longSparseIntArray;
        int i3;
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(j);
        if (tLRPC$Dialog != null) {
            int i4 = tLRPC$Dialog.unread_count;
            if (i == 0 || i2 >= tLRPC$Dialog.top_message) {
                tLRPC$Dialog.unread_count = 0;
            } else {
                int max = Math.max(i4 - i, 0);
                tLRPC$Dialog.unread_count = max;
                if (i2 != Integer.MIN_VALUE && max > (i3 = tLRPC$Dialog.top_message - i2)) {
                    tLRPC$Dialog.unread_count = i3;
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
                int i5 = 0;
                while (true) {
                    DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                    if (i5 < dialogFilterArr.length) {
                        DialogFilter dialogFilter = dialogFilterArr[i5];
                        if (dialogFilter != null && (dialogFilter.flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
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
        NotificationsController notificationsController = getNotificationsController();
        if (z) {
            notificationsController.processReadMessages(null, j, 0, i2, true);
            longSparseIntArray = new LongSparseIntArray(1);
            longSparseIntArray.put(j, -1);
        } else {
            notificationsController.processReadMessages(null, j, 0, i2, false);
            longSparseIntArray = new LongSparseIntArray(1);
            longSparseIntArray.put(j, 0);
        }
        getNotificationsController().processDialogsUpdateRead(longSparseIntArray);
    }

    public void lambda$markDialogAsRead$232(final long j, final int i, final int i2, final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markDialogAsRead$231(j, i, i2, z);
            }
        });
    }

    public void lambda$markDialogAsRead$233(long j, int i, boolean z, int i2, int i3) {
        int i4;
        getNotificationsController().processReadMessages(null, j, i, 0, z);
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(j);
        if (tLRPC$Dialog != null) {
            int i5 = tLRPC$Dialog.unread_count;
            if (i2 == 0 || i3 <= tLRPC$Dialog.top_message) {
                tLRPC$Dialog.unread_count = 0;
            } else {
                int max = Math.max(i5 - i2, 0);
                tLRPC$Dialog.unread_count = max;
                if (i3 != Integer.MAX_VALUE && max > (i4 = i3 - tLRPC$Dialog.top_message)) {
                    tLRPC$Dialog.unread_count = i4;
                }
            }
            boolean z2 = tLRPC$Dialog.unread_mark;
            if (z2) {
                tLRPC$Dialog.unread_mark = false;
                getMessagesStorage().setDialogUnread(tLRPC$Dialog.id, false);
            }
            if ((i5 != 0 || z2) && tLRPC$Dialog.unread_count == 0) {
                if (!isDialogMuted(j, 0L)) {
                    this.unreadUnmutedDialogs--;
                }
                int i6 = 0;
                while (true) {
                    DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
                    if (i6 < dialogFilterArr.length) {
                        DialogFilter dialogFilter = dialogFilterArr[i6];
                        if (dialogFilter != null && (dialogFilter.flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
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

    public void lambda$markDialogAsRead$234(final long j, final int i, final boolean z, final int i2, final int i3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markDialogAsRead$233(j, i, z, i2, i3);
            }
        });
    }

    public void lambda$markDialogAsRead$235(long j, long j2, boolean z, int i, int i2) {
        Object obj;
        ArrayList<ReadTask> arrayList;
        if (j != 0) {
            obj = this.threadsReadTasksMap.get(j2 + "_" + j);
        } else {
            obj = this.readTasksMap.get(j2);
        }
        ReadTask readTask = (ReadTask) obj;
        if (readTask == null) {
            readTask = new ReadTask(null);
            readTask.dialogId = j2;
            readTask.replyId = j;
            readTask.sendRequestTime = SystemClock.elapsedRealtime() + 5000;
            if (!z) {
                if (j != 0) {
                    this.threadsReadTasksMap.put(j2 + "_" + j, readTask);
                    arrayList = this.repliesReadTasks;
                } else {
                    this.readTasksMap.put(j2, readTask);
                    arrayList = this.readTasks;
                }
                arrayList.add(readTask);
            }
        }
        readTask.maxDate = i;
        readTask.maxId = i2;
        if (z) {
            completeReadTask(readTask);
        }
    }

    public void lambda$markDialogAsReadNow$229(long j, long j2) {
        if (j == 0) {
            ReadTask readTask = (ReadTask) this.readTasksMap.get(j2);
            if (readTask == null) {
                return;
            }
            completeReadTask(readTask);
            this.readTasks.remove(readTask);
            this.readTasksMap.remove(j2);
            return;
        }
        String str = j2 + "_" + j;
        ReadTask readTask2 = this.threadsReadTasksMap.get(str);
        if (readTask2 == null) {
            return;
        }
        completeReadTask(readTask2);
        this.repliesReadTasks.remove(readTask2);
        this.threadsReadTasksMap.remove(str);
    }

    public void lambda$markDialogAsUnread$338(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public static void lambda$markMentionMessageAsRead$222(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$markMentionMessageAsRead$223(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
    }

    public static void lambda$markMentionsAsRead$230(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$markMessageAsRead2$224(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$markMessageAsRead2$225(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public static void lambda$markMessageContentAsRead$220(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$markMessageContentAsRead$221(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
    }

    public static void lambda$markReactionsAsRead$392(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$migrateDialogs$202() {
        this.migratingDialogs = false;
    }

    public void lambda$migrateDialogs$203(org.telegram.tgnet.TLRPC$messages_Dialogs r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$migrateDialogs$203(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    public void lambda$migrateDialogs$204() {
        this.migratingDialogs = false;
    }

    public void lambda$migrateDialogs$205(final int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$migrateDialogs$204();
                }
            });
        } else {
            final TLRPC$messages_Dialogs tLRPC$messages_Dialogs = (TLRPC$messages_Dialogs) tLObject;
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$migrateDialogs$203(tLRPC$messages_Dialogs, i);
                }
            });
        }
    }

    public void lambda$new$0() {
        getUserConfig().checkSavedPassword();
    }

    public int lambda$new$10(TLRPC$Dialog tLRPC$Dialog, TLRPC$Dialog tLRPC$Dialog2) {
        DialogFilter dialogFilter = this.sortingDialogFilter;
        int i = dialogFilter == null ? Integer.MIN_VALUE : dialogFilter.pinnedDialogs.get(tLRPC$Dialog.id, Integer.MIN_VALUE);
        DialogFilter dialogFilter2 = this.sortingDialogFilter;
        int i2 = dialogFilter2 == null ? Integer.MIN_VALUE : dialogFilter2.pinnedDialogs.get(tLRPC$Dialog2.id, Integer.MIN_VALUE);
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

    public int lambda$new$11(TLRPC$Dialog tLRPC$Dialog, TLRPC$Dialog tLRPC$Dialog2) {
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
        long lastMessageOrDraftDate = DialogObject.getLastMessageOrDraftDate(tLRPC$Dialog, mediaDataController.getDraft(tLRPC$Dialog.id, 0L));
        long lastMessageOrDraftDate2 = DialogObject.getLastMessageOrDraftDate(tLRPC$Dialog2, mediaDataController.getDraft(tLRPC$Dialog2.id, 0L));
        if (lastMessageOrDraftDate < lastMessageOrDraftDate2) {
            return 1;
        }
        return lastMessageOrDraftDate > lastMessageOrDraftDate2 ? -1 : 0;
    }

    public int lambda$new$12(TLRPC$Update tLRPC$Update, TLRPC$Update tLRPC$Update2) {
        int updateQts;
        int updateQts2;
        int updateType = getUpdateType(tLRPC$Update);
        int updateType2 = getUpdateType(tLRPC$Update2);
        if (updateType != updateType2) {
            return AndroidUtilities.compare(updateType, updateType2);
        }
        if (updateType != 0) {
            if (updateType == 1) {
                updateQts = getUpdateQts(tLRPC$Update);
                updateQts2 = getUpdateQts(tLRPC$Update2);
                return AndroidUtilities.compare(updateQts, updateQts2);
            }
            if (updateType != 2) {
                return 0;
            }
            long updateChannelId = getUpdateChannelId(tLRPC$Update);
            long updateChannelId2 = getUpdateChannelId(tLRPC$Update2);
            if (updateChannelId != updateChannelId2) {
                return AndroidUtilities.compare(updateChannelId, updateChannelId2);
            }
        }
        updateQts = getUpdatePts(tLRPC$Update);
        updateQts2 = getUpdatePts(tLRPC$Update2);
        return AndroidUtilities.compare(updateQts, updateQts2);
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

    public void lambda$new$34() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    public void lambda$onFolderEmpty$186(int i) {
        if (i != 1) {
            removeFolder(i);
        } else {
            this.hasArchivedChats = false;
            checkArchiveFolder();
        }
    }

    public static void lambda$openApp$451(boolean[] zArr) {
        zArr[0] = true;
    }

    public void lambda$openApp$452(BaseFragment baseFragment, Browser.Progress progress, boolean[] zArr, TLRPC$User tLRPC$User, String str, TL_bots$BotInfo[] tL_bots$BotInfoArr) {
        BotWebViewAttachedSheet createBotViewer;
        BotWebViewSheet botWebViewSheet;
        BaseFragment safeLastFragment = baseFragment != null ? baseFragment : LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (progress != null) {
            progress.end();
        }
        if (zArr[0]) {
            return;
        }
        if (tLRPC$User.bot_has_main_app) {
            if (safeLastFragment.getParentLayout() instanceof ActionBarLayout) {
                safeLastFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment();
            }
            BaseFragment baseFragment2 = safeLastFragment;
            AndroidUtilities.hideKeyboard(baseFragment2.getFragmentView());
            int i = this.currentAccount;
            long j = tLRPC$User.id;
            WebViewRequestProps of = WebViewRequestProps.of(i, j, j, null, null, 4, 0, false, null, false, str, tLRPC$User, 0, false);
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(of) == null) {
                if (AndroidUtilities.isTablet()) {
                    botWebViewSheet = new BotWebViewSheet(baseFragment2.getContext(), baseFragment2.getResourceProvider());
                    botWebViewSheet.setDefaultFullsize(true);
                    botWebViewSheet.setNeedsContext(true);
                    botWebViewSheet.setParentActivity(baseFragment2.getParentActivity());
                    botWebViewSheet.requestWebView(baseFragment2, of);
                    botWebViewSheet.show();
                    return;
                }
                createBotViewer = baseFragment2.createBotViewer();
                createBotViewer.setDefaultFullsize(true);
                createBotViewer.setNeedsContext(false);
                createBotViewer.setParentActivity(baseFragment2.getParentActivity());
                createBotViewer.requestWebView(baseFragment2, of);
                createBotViewer.show();
            }
            return;
        }
        TL_bots$BotInfo tL_bots$BotInfo = tL_bots$BotInfoArr[0];
        if (tL_bots$BotInfo == null || !(tL_bots$BotInfo.menu_button instanceof TL_bots$TL_botMenuButton)) {
            safeLastFragment.presentFragment(ChatActivity.of(tLRPC$User.id));
            return;
        }
        if (safeLastFragment.getParentLayout() instanceof ActionBarLayout) {
            safeLastFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment();
        }
        BaseFragment baseFragment3 = safeLastFragment;
        TL_bots$TL_botMenuButton tL_bots$TL_botMenuButton = (TL_bots$TL_botMenuButton) tL_bots$BotInfoArr[0].menu_button;
        AndroidUtilities.hideKeyboard(baseFragment3.getFragmentView());
        int i2 = this.currentAccount;
        long j2 = tLRPC$User.id;
        WebViewRequestProps of2 = WebViewRequestProps.of(i2, j2, j2, tL_bots$TL_botMenuButton.text, tL_bots$TL_botMenuButton.url, 2, 0, false, null, false, str, tLRPC$User, 0, false);
        LaunchActivity launchActivity2 = LaunchActivity.instance;
        if (launchActivity2 == null || launchActivity2.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(of2) == null) {
            if (AndroidUtilities.isTablet()) {
                botWebViewSheet = new BotWebViewSheet(baseFragment3.getContext(), baseFragment3.getResourceProvider());
                botWebViewSheet.setDefaultFullsize(false);
                botWebViewSheet.setNeedsContext(true);
                botWebViewSheet.setParentActivity(baseFragment3.getParentActivity());
                botWebViewSheet.requestWebView(baseFragment3, of2);
                botWebViewSheet.show();
                return;
            }
            createBotViewer = baseFragment3.createBotViewer();
            createBotViewer.setDefaultFullsize(false);
            createBotViewer.setNeedsContext(false);
            createBotViewer.setParentActivity(baseFragment3.getParentActivity());
            createBotViewer.requestWebView(baseFragment3, of2);
            createBotViewer.show();
        }
    }

    public static void lambda$openApp$453(boolean[] zArr, TL_bots$BotInfo[] tL_bots$BotInfoArr, Runnable runnable, TLRPC$UserFull tLRPC$UserFull) {
        if (zArr[0]) {
            return;
        }
        if (tLRPC$UserFull != null) {
            tL_bots$BotInfoArr[0] = tLRPC$UserFull.bot_info;
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$openApp$454(final boolean[] zArr, final TL_bots$BotInfo[] tL_bots$BotInfoArr, TLRPC$User tLRPC$User, int i, final Runnable runnable, TL_bots$BotInfo tL_bots$BotInfo) {
        if (zArr[0]) {
            return;
        }
        tL_bots$BotInfoArr[0] = tL_bots$BotInfo;
        if (tL_bots$BotInfo == null) {
            TLRPC$UserFull userFull = getUserFull(tLRPC$User.id);
            if (userFull == null) {
                if (zArr[0]) {
                    return;
                }
                loadFullUser(tLRPC$User, i, true, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        MessagesController.lambda$openApp$453(zArr, tL_bots$BotInfoArr, runnable, (TLRPC$UserFull) obj);
                    }
                });
                return;
            }
            tL_bots$BotInfoArr[0] = userFull.bot_info;
        }
        runnable.run();
    }

    public void lambda$openByUserName$409(Browser.Progress progress, AlertDialog[] alertDialogArr, BaseFragment baseFragment, boolean[] zArr, int i, Long l) {
        TLRPC$User user;
        TLRPC$Chat tLRPC$Chat;
        boolean z;
        MessagesController messagesController;
        BaseFragment baseFragment2;
        int i2;
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
        if (l == null) {
            if (baseFragment.getParentActivity() != null) {
                try {
                    if (baseFragment instanceof ChatActivity) {
                        ((ChatActivity) baseFragment).shakeContent();
                    }
                    BulletinFactory.of(baseFragment).createErrorBulletin(LocaleController.getString(R.string.NoUsernameFound)).show();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (l.longValue() < 0) {
            tLRPC$Chat = getChat(Long.valueOf(-l.longValue()));
            i2 = 1;
            z = false;
            user = null;
            messagesController = this;
            baseFragment2 = baseFragment;
        } else {
            user = getUser(l);
            tLRPC$Chat = null;
            z = false;
            messagesController = this;
            baseFragment2 = baseFragment;
            i2 = i;
        }
        messagesController.openChatOrProfileWith(user, tLRPC$Chat, baseFragment2, i2, z);
    }

    public static void lambda$openByUserName$410(boolean[] zArr) {
        zArr[0] = true;
    }

    public static void lambda$openByUserName$411(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
    }

    public static void lambda$openByUserName$412(AlertDialog[] alertDialogArr, final boolean[] zArr, BaseFragment baseFragment) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                MessagesController.lambda$openByUserName$411(zArr, dialogInterface);
            }
        });
        baseFragment.showDialog(alertDialogArr[0]);
    }

    public static void lambda$performLogout$299(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_auth_loggedOut) {
            TLRPC$TL_auth_loggedOut tLRPC$TL_auth_loggedOut = (TLRPC$TL_auth_loggedOut) tLObject;
            if (tLRPC$TL_auth_loggedOut.future_auth_token != null) {
                AuthTokensHelper.addLogOutToken(tLRPC$TL_auth_loggedOut);
            }
        }
    }

    public void lambda$performLogout$300(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        getConnectionsManager().cleanup(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$performLogout$299(TLObject.this);
            }
        });
    }

    public void lambda$pinDialog$342(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void lambda$pinMessage$123(int i, TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, boolean z, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(Integer.valueOf(i));
            getMessagesStorage().updatePinnedMessages(tLRPC$Chat != null ? -tLRPC$Chat.id : tLRPC$User.id, arrayList, !z, -1, 0, false, null);
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public static int lambda$processChannelsUpdatesQueue$304(TLRPC$Updates tLRPC$Updates, TLRPC$Updates tLRPC$Updates2) {
        return AndroidUtilities.compare(tLRPC$Updates.pts, tLRPC$Updates2.pts);
    }

    public void lambda$processChatInfo$141(boolean z, long j, boolean z2, boolean z3, TLRPC$ChatFull tLRPC$ChatFull, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap, int i, boolean z4) {
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
            if (tLRPC$ChatFull.emojiset != null) {
                getMediaDataController().getGroupStickerSetById(tLRPC$ChatFull.emojiset);
            }
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, tLRPC$ChatFull, 0, Boolean.valueOf(z2), Boolean.FALSE);
        }
        if (arrayList2 != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.pinnedInfoDidLoad, Long.valueOf(-j), arrayList2, hashMap, Integer.valueOf(i), Boolean.valueOf(z4));
        }
    }

    public void lambda$processDialogsUpdate$217(org.telegram.tgnet.TLRPC$messages_Dialogs r23, androidx.collection.LongSparseArray r24, androidx.collection.LongSparseArray r25, boolean r26, org.telegram.messenger.support.LongSparseIntArray r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processDialogsUpdate$217(org.telegram.tgnet.TLRPC$messages_Dialogs, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    public void lambda$processDialogsUpdate$218(final org.telegram.tgnet.TLRPC$messages_Dialogs r20, final boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processDialogsUpdate$218(org.telegram.tgnet.TLRPC$messages_Dialogs, boolean):void");
    }

    public void lambda$processDialogsUpdateRead$212(org.telegram.messenger.support.LongSparseIntArray r14, org.telegram.messenger.support.LongSparseIntArray r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processDialogsUpdateRead$212(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    public void lambda$processLoadedChannelAdmins$60(long j, LongSparseArray longSparseArray, boolean z) {
        this.channelAdmins.put(j, longSparseArray);
        if (z) {
            this.loadingChannelAdmins.delete(j);
            loadChannelAdmins(j, false);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadChatAdmins, Long.valueOf(j));
        }
    }

    public void lambda$processLoadedDeleteTask$81() {
        checkDeletingTask(true);
    }

    public void lambda$processLoadedDeleteTask$82(LongSparseArray longSparseArray, LongSparseArray longSparseArray2, int i) {
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
        if (checkDeletingTask(false)) {
            return;
        }
        this.currentDeleteTaskRunnable = new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedDeleteTask$81();
            }
        };
        Utilities.stageQueue.postRunnable(this.currentDeleteTaskRunnable, Math.abs(getConnectionsManager().getCurrentTime() - this.currentDeletingTaskTime) * 1000);
    }

    public static int lambda$processLoadedDialogFilters$18(DialogFilter dialogFilter, DialogFilter dialogFilter2) {
        int i = dialogFilter.order;
        int i2 = dialogFilter2.order;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public void lambda$processLoadedDialogFilters$19(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, TLRPC$messages_Dialogs tLRPC$messages_Dialogs, ArrayList arrayList4, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, Runnable runnable) {
        int i2;
        ArrayList arrayList5;
        ArrayList arrayList6;
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
                TLRPC$Dialog tLRPC$Dialog2 = (TLRPC$Dialog) this.dialogs_dict.get(keyAt);
                if (tLRPC$messages_Dialogs != null && tLRPC$messages_Dialogs.dialogs.contains(tLRPC$Dialog)) {
                    if (tLRPC$Dialog.draft instanceof TLRPC$TL_draftMessage) {
                        getMediaDataController().saveDraft(tLRPC$Dialog.id, 0L, tLRPC$Dialog.draft, null, false);
                    }
                    if (tLRPC$Dialog2 != null) {
                        tLRPC$Dialog2.notify_settings = tLRPC$Dialog.notify_settings;
                    }
                }
                ArrayList arrayList7 = (ArrayList) longSparseArray2.get(tLRPC$Dialog.id);
                long j = 0;
                if (tLRPC$Dialog2 == null) {
                    this.dialogs_dict.put(keyAt, tLRPC$Dialog);
                    this.dialogMessage.put(keyAt, arrayList7);
                    if (arrayList7 != null) {
                        for (int i6 = 0; i6 < arrayList7.size(); i6++) {
                            MessageObject messageObject = (MessageObject) arrayList7.get(i6);
                            if (messageObject != null && messageObject.messageOwner.peer_id.channel_id == 0) {
                                this.dialogMessagesByIds.put(messageObject.getId(), messageObject);
                                long j2 = messageObject.messageOwner.random_id;
                                if (j2 != 0) {
                                    this.dialogMessagesByRandomIds.put(j2, messageObject);
                                }
                            }
                        }
                    }
                } else {
                    tLRPC$Dialog2.pinned = tLRPC$Dialog.pinned;
                    tLRPC$Dialog2.pinnedNum = tLRPC$Dialog.pinnedNum;
                    ArrayList arrayList8 = (ArrayList) this.dialogMessage.get(keyAt);
                    for (int i7 = 0; arrayList8 != null && i7 < arrayList8.size(); i7++) {
                        if (arrayList8.get(i7) != null && ((MessageObject) arrayList8.get(i7)).deleted) {
                            break;
                        }
                    }
                    if (arrayList8 != null && tLRPC$Dialog2.top_message <= 0) {
                        this.dialogs_dict.put(keyAt, tLRPC$Dialog);
                        this.dialogMessage.put(keyAt, arrayList7);
                        int i8 = 0;
                        while (i8 < arrayList8.size()) {
                            MessageObject messageObject2 = (MessageObject) arrayList8.get(i8);
                            if (messageObject2 == null) {
                                arrayList6 = arrayList8;
                            } else {
                                arrayList6 = arrayList8;
                                if (messageObject2.messageOwner.peer_id.channel_id == 0) {
                                    this.dialogMessagesByIds.remove(messageObject2.getId());
                                }
                                long j3 = messageObject2.messageOwner.random_id;
                                if (j3 != 0) {
                                    this.dialogMessagesByRandomIds.remove(j3);
                                }
                            }
                            i8++;
                            arrayList8 = arrayList6;
                        }
                        ArrayList arrayList9 = arrayList8;
                        if (arrayList7 != null) {
                            int i9 = 0;
                            while (i9 < arrayList7.size()) {
                                MessageObject messageObject3 = (MessageObject) arrayList7.get(i9);
                                if (messageObject3 == null || messageObject3.messageOwner.peer_id.channel_id != j) {
                                    arrayList5 = arrayList9;
                                } else {
                                    int i10 = 0;
                                    while (true) {
                                        arrayList5 = arrayList9;
                                        if (i10 >= arrayList9.size()) {
                                            break;
                                        }
                                        MessageObject messageObject4 = (MessageObject) arrayList5.get(i10);
                                        if (messageObject4 != null && messageObject4.getId() == messageObject3.getId()) {
                                            messageObject3.deleted = messageObject4.deleted;
                                            break;
                                        } else {
                                            i10++;
                                            arrayList9 = arrayList5;
                                        }
                                    }
                                    this.dialogMessagesByIds.put(messageObject3.getId(), messageObject3);
                                    long j4 = messageObject3.messageOwner.random_id;
                                    if (j4 != 0) {
                                        this.dialogMessagesByRandomIds.put(j4, messageObject3);
                                    }
                                }
                                i9++;
                                arrayList9 = arrayList5;
                                j = 0;
                            }
                        }
                    }
                    if (tLRPC$Dialog.top_message < tLRPC$Dialog2.top_message) {
                        if ((arrayList8 == null) == (arrayList7 == null)) {
                            if (arrayList8 != null) {
                                if (arrayList7 != null) {
                                    if (arrayList8.size() == arrayList7.size()) {
                                    }
                                }
                            }
                        }
                    }
                    this.dialogs_dict.put(keyAt, tLRPC$Dialog);
                    this.dialogMessage.put(keyAt, arrayList7);
                    if (arrayList8 != null) {
                        for (int i11 = 0; i11 < arrayList8.size(); i11++) {
                            MessageObject messageObject5 = (MessageObject) arrayList8.get(i11);
                            if (messageObject5 != null) {
                                if (messageObject5.messageOwner.peer_id.channel_id == 0) {
                                    this.dialogMessagesByIds.remove(messageObject5.getId());
                                }
                                long j5 = messageObject5.messageOwner.random_id;
                                if (j5 != 0) {
                                    this.dialogMessagesByRandomIds.remove(j5);
                                }
                            }
                        }
                    }
                    if (arrayList7 != null) {
                        for (int i12 = 0; i12 < arrayList7.size(); i12++) {
                            MessageObject messageObject6 = (MessageObject) arrayList7.get(i12);
                            if (messageObject6 != null && messageObject6.messageOwner.peer_id.channel_id == 0) {
                                int i13 = 0;
                                while (true) {
                                    if (arrayList8 == null || i13 >= arrayList8.size()) {
                                        break;
                                    }
                                    MessageObject messageObject7 = (MessageObject) arrayList8.get(i13);
                                    if (messageObject7 != null && messageObject7.getId() == messageObject6.getId()) {
                                        messageObject6.deleted = messageObject7.deleted;
                                        break;
                                    }
                                    i13++;
                                }
                                this.dialogMessagesByIds.put(messageObject6.getId(), messageObject6);
                                long j6 = messageObject6.messageOwner.random_id;
                                if (j6 != 0) {
                                    this.dialogMessagesByRandomIds.put(j6, messageObject6);
                                }
                            }
                        }
                    }
                }
                getTranslateController().checkDialogMessage(keyAt);
            }
            this.allDialogs.clear();
            int size2 = this.dialogs_dict.size();
            for (int i14 = 0; i14 < size2; i14++) {
                TLRPC$Dialog tLRPC$Dialog3 = (TLRPC$Dialog) this.dialogs_dict.valueAt(i14);
                if (this.deletingDialogs.indexOfKey(tLRPC$Dialog3.id) < 0) {
                    this.allDialogs.add(tLRPC$Dialog3);
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

    public void lambda$processLoadedDialogFilters$20(org.telegram.tgnet.TLRPC$messages_Dialogs r20, final java.util.ArrayList r21, final org.telegram.tgnet.TLRPC$messages_Dialogs r22, final int r23, final java.util.ArrayList r24, final java.util.ArrayList r25, final java.util.ArrayList r26, final java.lang.Runnable r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processLoadedDialogFilters$20(org.telegram.tgnet.TLRPC$messages_Dialogs, java.util.ArrayList, org.telegram.tgnet.TLRPC$messages_Dialogs, int, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.Runnable):void");
    }

    public void lambda$processLoadedDialogs$206(TLRPC$messages_Dialogs tLRPC$messages_Dialogs, ArrayList arrayList, int i, boolean z, long[] jArr, int i2) {
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

    public void lambda$processLoadedDialogs$207(TLRPC$Chat tLRPC$Chat) {
        checkChatInviter(tLRPC$Chat.id, true);
    }

    public void lambda$processLoadedDialogs$208(org.telegram.tgnet.TLRPC$Message r28, int r29, org.telegram.tgnet.TLRPC$messages_Dialogs r30, java.util.ArrayList r31, java.util.ArrayList r32, boolean r33, int r34, androidx.collection.LongSparseArray r35, androidx.collection.LongSparseArray r36, androidx.collection.LongSparseArray r37, int r38, boolean r39, int r40, java.util.ArrayList r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processLoadedDialogs$208(org.telegram.tgnet.TLRPC$Message, int, org.telegram.tgnet.TLRPC$messages_Dialogs, java.util.ArrayList, java.util.ArrayList, boolean, int, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, int, boolean, int, java.util.ArrayList):void");
    }

    public void lambda$processLoadedDialogs$209(final int r32, final int r33, final org.telegram.tgnet.TLRPC$messages_Dialogs r34, final java.util.ArrayList r35, final boolean r36, final int r37, final java.util.ArrayList r38, final int r39, final boolean r40, final boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processLoadedDialogs$209(int, int, org.telegram.tgnet.TLRPC$messages_Dialogs, java.util.ArrayList, boolean, int, java.util.ArrayList, int, boolean, boolean):void");
    }

    public void lambda$processLoadedMessages$178(long j, long j2, int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, long j3, int i9, int i10, int i11, int i12, boolean z2, boolean z3, Timer timer, long j4) {
        loadMessagesInternal(j, j2, false, i, (i2 == 2 && z) ? i3 : i4, i5, false, 0, i6, i2, i7, i8, j3, i9, i3, i10, i11, z, i12, true, z2, z3, timer, j4);
    }

    public void lambda$processLoadedMessages$179(int i, TLRPC$messages_Messages tLRPC$messages_Messages, boolean z, boolean z2, int i2) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoadWithoutProcess, Integer.valueOf(i), Integer.valueOf(tLRPC$messages_Messages.messages.size()), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2));
    }

    public static int lambda$processLoadedMessages$180(MessageObject messageObject, MessageObject messageObject2) {
        int i;
        int i2;
        if (messageObject.messageOwner.date != messageObject2.messageOwner.date || messageObject.getId() < 0 || messageObject2.getId() < 0) {
            i = messageObject2.messageOwner.date;
            i2 = messageObject.messageOwner.date;
        } else {
            i = messageObject2.getId();
            i2 = messageObject.getId();
        }
        return i - i2;
    }

    public static int lambda$processLoadedMessages$181(MessageObject messageObject, MessageObject messageObject2) {
        return messageObject2.getId() - messageObject.getId();
    }

    public void lambda$processLoadedMessages$182(Timer.Task task, boolean z, int i, int i2, boolean z2, boolean z3, int i3, long j, int i4, ArrayList arrayList, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        Timer.done(task);
        NotificationCenter notificationCenter = getNotificationCenter();
        if (z) {
            notificationCenter.lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoad, Long.valueOf(j), Integer.valueOf(i4), arrayList, Boolean.valueOf(z2), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Boolean.valueOf(z3), Integer.valueOf(i), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        } else {
            notificationCenter.lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoadWithoutProcess, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i3));
        }
    }

    public void lambda$processLoadedMessages$183(Timer.Task task, Timer timer, TLRPC$messages_Messages tLRPC$messages_Messages, final boolean z, final boolean z2, final int i, boolean z3, final int i2, int i3, final int i4, final long j, final ArrayList arrayList, long j2, final int i5, final int i6, final boolean z4, final int i7, final int i8, final int i9, final int i10, final int i11, final int i12, ArrayList arrayList2, HashMap hashMap) {
        int i13;
        int i14;
        int i15;
        int i16;
        MessagesController messagesController;
        int i17;
        long j3;
        Timer.done(task);
        Timer.Task start = Timer.start(timer, "processLoadedMessages: post runOnUIThread");
        putUsers(tLRPC$messages_Messages.users, z);
        putChats(tLRPC$messages_Messages.chats, z);
        if (tLRPC$messages_Messages.animatedEmoji != null && z2) {
            AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).processDocuments(tLRPC$messages_Messages.animatedEmoji);
        }
        if (i == 1) {
            i15 = 0;
        } else {
            if (z3 && i2 == 2) {
                i14 = Integer.MAX_VALUE;
                for (int i18 = 0; i18 < tLRPC$messages_Messages.messages.size(); i18++) {
                    TLRPC$Message tLRPC$Message = (TLRPC$Message) tLRPC$messages_Messages.messages.get(i18);
                    if ((!tLRPC$Message.out || tLRPC$Message.from_scheduled) && (i16 = tLRPC$Message.id) > i3 && i16 < i14) {
                        i14 = i16;
                    }
                }
                i13 = i3;
            } else {
                i13 = i3;
                i14 = Integer.MAX_VALUE;
            }
            i15 = i14 == Integer.MAX_VALUE ? i13 : i14;
        }
        if (i == 1 && i4 == 1) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.scheduledMessagesUpdated, Long.valueOf(j), Integer.valueOf(arrayList.size()), Boolean.FALSE);
        }
        if (DialogObject.isEncryptedDialog(j) || i == 5) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoad, Long.valueOf(j), Integer.valueOf(i4), arrayList, Boolean.valueOf(z), Integer.valueOf(i15), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i2), Boolean.valueOf(z4), Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i));
        } else {
            final Timer.Task start2 = Timer.start(timer, "loadReplyMessagesForMessages");
            final int i19 = i15;
            getMediaDataController().loadReplyMessagesForMessages(arrayList, j, i, j2, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$processLoadedMessages$182(start2, z2, i5, i6, z, z4, i7, j, i4, arrayList, i19, i8, i9, i2, i10, i11, i12, i);
                }
            }, i5, timer);
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
        if (!hashMap.isEmpty()) {
            messagesController.reloadWebPages(j3, hashMap, i17);
        }
        Timer.done(start);
        Timer.finish(timer);
    }

    public void lambda$processUpdateArray$360(ArrayList arrayList, ArrayList arrayList2) {
        putUsers(arrayList, false);
        putChats(arrayList2, false);
    }

    public void lambda$processUpdateArray$361(ArrayList arrayList, ArrayList arrayList2) {
        putUsers(arrayList, false);
        putChats(arrayList2, false);
    }

    public void lambda$processUpdateArray$362(TLRPC$TL_updateUserTyping tLRPC$TL_updateUserTyping) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onEmojiInteractionsReceived, Long.valueOf(tLRPC$TL_updateUserTyping.user_id), tLRPC$TL_updateUserTyping.action);
    }

    public void lambda$processUpdateArray$363(TLRPC$TL_updateChatUserTyping tLRPC$TL_updateChatUserTyping) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onEmojiInteractionsReceived, Long.valueOf(-tLRPC$TL_updateChatUserTyping.chat_id), tLRPC$TL_updateChatUserTyping.action);
    }

    public void lambda$processUpdateArray$364(TLRPC$TL_updatePeerBlocked tLRPC$TL_updatePeerBlocked) {
        long peerId = MessageObject.getPeerId(tLRPC$TL_updatePeerBlocked.peer_id);
        if (!tLRPC$TL_updatePeerBlocked.blocked) {
            this.blockePeers.delete(peerId);
        } else if (this.blockePeers.indexOfKey(peerId) < 0) {
            this.blockePeers.put(peerId, 1);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        getStoriesController().updateBlockUser(peerId, tLRPC$TL_updatePeerBlocked.blocked_my_stories_from, false);
    }

    public void lambda$processUpdateArray$365(final TLRPC$TL_updatePeerBlocked tLRPC$TL_updatePeerBlocked) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdateArray$364(tLRPC$TL_updatePeerBlocked);
            }
        });
    }

    public void lambda$processUpdateArray$366(TLRPC$TL_updateServiceNotification tLRPC$TL_updateServiceNotification) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 2, tLRPC$TL_updateServiceNotification.message, tLRPC$TL_updateServiceNotification.type);
    }

    public void lambda$processUpdateArray$367(TLRPC$Message tLRPC$Message) {
        getSendMessagesHelper().onMessageEdited(tLRPC$Message);
    }

    public void lambda$processUpdateArray$368(TLRPC$TL_updateLangPack tLRPC$TL_updateLangPack) {
        LocaleController.getInstance().saveRemoteLocaleStringsForCurrentLocale(tLRPC$TL_updateLangPack.difference, this.currentAccount);
    }

    public void lambda$processUpdateArray$369(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$processUpdateArray$370(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdateArray$369(arrayList);
            }
        });
    }

    public void lambda$processUpdateArray$371(LongSparseArray longSparseArray) {
        getNotificationsController().processEditedMessages(longSparseArray);
        getTopicsController().processEditedMessages(longSparseArray);
    }

    public void lambda$processUpdateArray$372(final LongSparseArray longSparseArray) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdateArray$371(longSparseArray);
            }
        });
    }

    public void lambda$processUpdateArray$373(TLRPC$User tLRPC$User) {
        getContactsController().addContactToPhoneBook(tLRPC$User, true);
    }

    public void lambda$processUpdateArray$374() {
        getNotificationsController().deleteNotificationChannelGlobal(0);
    }

    public void lambda$processUpdateArray$375() {
        getNotificationsController().deleteNotificationChannelGlobal(1);
    }

    public void lambda$processUpdateArray$376() {
        getNotificationsController().deleteNotificationChannelGlobal(2);
    }

    public void lambda$processUpdateArray$377(TLRPC$TL_updateChannel tLRPC$TL_updateChannel) {
        getChannelDifference(tLRPC$TL_updateChannel.channel_id, 1, 0L, null);
    }

    public void lambda$processUpdateArray$378(TLRPC$Chat tLRPC$Chat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRightsUpdated, tLRPC$Chat);
    }

    public void lambda$processUpdateArray$379(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void lambda$processUpdateArray$380(int r44, java.util.ArrayList r45, java.util.ArrayList r46, androidx.collection.LongSparseArray r47, int r48, org.telegram.messenger.support.LongSparseIntArray r49, androidx.collection.LongSparseArray r50, androidx.collection.LongSparseArray r51, java.util.ArrayList r52, androidx.collection.LongSparseArray r53, androidx.collection.LongSparseArray r54, boolean r55, java.util.ArrayList r56, java.util.ArrayList r57, androidx.collection.LongSparseArray r58, androidx.collection.LongSparseArray r59, androidx.collection.LongSparseArray r60, java.util.ArrayList r61) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processUpdateArray$380(int, java.util.ArrayList, java.util.ArrayList, androidx.collection.LongSparseArray, int, org.telegram.messenger.support.LongSparseIntArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, java.util.ArrayList, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, boolean, java.util.ArrayList, java.util.ArrayList, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, java.util.ArrayList):void");
    }

    public void lambda$processUpdateArray$381(org.telegram.messenger.support.LongSparseIntArray r22, org.telegram.messenger.support.LongSparseIntArray r23, android.util.SparseIntArray r24, androidx.collection.LongSparseArray r25, androidx.collection.LongSparseArray r26, androidx.collection.LongSparseArray r27, androidx.collection.LongSparseArray r28, org.telegram.messenger.support.LongSparseIntArray r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$processUpdateArray$381(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, android.util.SparseIntArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, androidx.collection.LongSparseArray, org.telegram.messenger.support.LongSparseIntArray):void");
    }

    public void lambda$processUpdateArray$382(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2, final SparseIntArray sparseIntArray, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2, final LongSparseArray longSparseArray3, final LongSparseArray longSparseArray4, final LongSparseIntArray longSparseIntArray3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdateArray$381(longSparseIntArray, longSparseIntArray2, sparseIntArray, longSparseArray, longSparseArray2, longSparseArray3, longSparseArray4, longSparseIntArray3);
            }
        });
    }

    public void lambda$processUpdateArray$383(long j, ArrayList arrayList) {
        getMessagesStorage().updateDialogsWithDeletedMessages(j, -j, arrayList, getMessagesStorage().markMessagesAsDeleted(j, arrayList, false, true, 0, 0), false);
    }

    public void lambda$processUpdateArray$384(long j, ArrayList arrayList, long j2) {
        getMessagesStorage().updateDialogsWithDeletedMessages(j, -j, arrayList, getMessagesStorage().markMessagesAsDeleted(j, arrayList, false, true, 5, (int) j2), false);
    }

    public void lambda$processUpdateArray$385(long j, int i) {
        getMessagesStorage().updateDialogsWithDeletedMessages(j, -j, new ArrayList<>(), getMessagesStorage().markMessagesAsDeleted(j, i, false, true), false);
    }

    public void lambda$processUpdates$354(boolean z, long j, ArrayList arrayList) {
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_USER_PRINT));
        }
        updateInterfaceWithMessages(j, arrayList, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processUpdates$355(boolean z, TLRPC$Updates tLRPC$Updates, ArrayList arrayList) {
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_USER_PRINT));
        }
        updateInterfaceWithMessages(-tLRPC$Updates.chat_id, arrayList, 0);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processUpdates$356(ArrayList arrayList) {
        getNotificationsController().processNewMessages(arrayList, true, false, null);
    }

    public void lambda$processUpdates$357(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUpdates$356(arrayList);
            }
        });
    }

    public static void lambda$processUpdates$358(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$processUpdates$359() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_STATUS));
    }

    public int lambda$processUpdatesQueue$305(TLRPC$Updates tLRPC$Updates, TLRPC$Updates tLRPC$Updates2) {
        return AndroidUtilities.compare(getUpdateSeq(tLRPC$Updates), getUpdateSeq(tLRPC$Updates2));
    }

    public static int lambda$processUpdatesQueue$306(TLRPC$Updates tLRPC$Updates, TLRPC$Updates tLRPC$Updates2) {
        return AndroidUtilities.compare(tLRPC$Updates.pts, tLRPC$Updates2.pts);
    }

    public static int lambda$processUpdatesQueue$307(TLRPC$Updates tLRPC$Updates, TLRPC$Updates tLRPC$Updates2) {
        return AndroidUtilities.compare(tLRPC$Updates.pts, tLRPC$Updates2.pts);
    }

    public void lambda$processUserInfo$142(boolean z, TLRPC$User tLRPC$User, int i, boolean z2, TLRPC$UserFull tLRPC$UserFull, ArrayList arrayList, HashMap hashMap, int i2, boolean z3) {
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

    public void lambda$putChat$53(TLRPC$Chat tLRPC$Chat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRightsUpdated, tLRPC$Chat);
    }

    public void lambda$putChat$54(TLRPC$Chat tLRPC$Chat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatSwithcedToForum, Long.valueOf(tLRPC$Chat.id));
    }

    public void lambda$putUsers$52() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_STATUS));
    }

    public void lambda$registerForPush$301() {
        this.registeringForPush = false;
    }

    public void lambda$registerForPush$302(int i, String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                MessagesController.this.lambda$registerForPush$301();
            }
        });
    }

    public void lambda$reloadDialogsReadValue$58(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$TL_updateReadHistoryOutbox tLRPC$TL_updateReadHistoryOutbox;
        TLRPC$TL_updateReadHistoryInbox tLRPC$TL_updateReadHistoryInbox;
        if (tLObject != null) {
            TLRPC$TL_messages_peerDialogs tLRPC$TL_messages_peerDialogs = (TLRPC$TL_messages_peerDialogs) tLObject;
            ArrayList<TLRPC$Update> arrayList = new ArrayList<>();
            for (int i = 0; i < tLRPC$TL_messages_peerDialogs.dialogs.size(); i++) {
                TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) tLRPC$TL_messages_peerDialogs.dialogs.get(i);
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
                        tLRPC$TL_updateReadHistoryInbox = tLRPC$TL_updateReadChannelInbox;
                    } else {
                        TLRPC$TL_updateReadHistoryInbox tLRPC$TL_updateReadHistoryInbox2 = new TLRPC$TL_updateReadHistoryInbox();
                        tLRPC$TL_updateReadHistoryInbox2.peer = tLRPC$Dialog.peer;
                        tLRPC$TL_updateReadHistoryInbox2.max_id = tLRPC$Dialog.read_inbox_max_id;
                        tLRPC$TL_updateReadHistoryInbox = tLRPC$TL_updateReadHistoryInbox2;
                    }
                    arrayList.add(tLRPC$TL_updateReadHistoryInbox);
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
                        tLRPC$TL_updateReadHistoryOutbox = tLRPC$TL_updateReadChannelOutbox;
                    } else {
                        TLRPC$TL_updateReadHistoryOutbox tLRPC$TL_updateReadHistoryOutbox2 = new TLRPC$TL_updateReadHistoryOutbox();
                        tLRPC$TL_updateReadHistoryOutbox2.peer = tLRPC$Dialog.peer;
                        tLRPC$TL_updateReadHistoryOutbox2.max_id = tLRPC$Dialog.read_outbox_max_id;
                        tLRPC$TL_updateReadHistoryOutbox = tLRPC$TL_updateReadHistoryOutbox2;
                    }
                    arrayList.add(tLRPC$TL_updateReadHistoryOutbox);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            processUpdateArray(arrayList, null, null, false, 0);
        }
    }

    public void lambda$reloadMentionsCountForChannel$210(TLRPC$InputPeer tLRPC$InputPeer, long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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

    public void lambda$reloadMentionsCountForChannels$211(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            reloadMentionsCountForChannel(getInputPeer(-((Long) arrayList.get(i)).longValue()), 0L);
        }
    }

    public void lambda$reloadMessages$67(long j, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = (ArrayList) this.reloadingMessages.get(j);
        if (arrayList3 != null) {
            arrayList3.removeAll(arrayList);
            if (arrayList3.isEmpty()) {
                this.reloadingMessages.remove(j);
            }
        }
        ArrayList arrayList4 = (ArrayList) this.dialogMessage.get(j);
        if (arrayList4 != null) {
            for (int i = 0; i < arrayList4.size(); i++) {
                MessageObject messageObject = (MessageObject) arrayList4.get(i);
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

    public void lambda$reloadMessages$68(final long j, boolean z, int i, final ArrayList arrayList, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i2 = 0; i2 < tLRPC$messages_Messages.users.size(); i2++) {
                TLRPC$User tLRPC$User = (TLRPC$User) tLRPC$messages_Messages.users.get(i2);
                longSparseArray.put(tLRPC$User.id, tLRPC$User);
            }
            LongSparseArray longSparseArray2 = new LongSparseArray();
            for (int i3 = 0; i3 < tLRPC$messages_Messages.chats.size(); i3++) {
                TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLRPC$messages_Messages.chats.get(i3);
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
                TLRPC$Message tLRPC$Message = (TLRPC$Message) tLRPC$messages_Messages.messages.get(i4);
                tLRPC$Message.dialog_id = j;
                if (!z) {
                    tLRPC$Message.unread = (tLRPC$Message.out ? num2 : num).intValue() < tLRPC$Message.id;
                }
                Integer num3 = num;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new MessageObject(this.currentAccount, tLRPC$Message, longSparseArray, longSparseArray2, true, true));
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
                    MessagesController.this.lambda$reloadMessages$67(j, arrayList, arrayList4);
                }
            });
        }
    }

    public void lambda$reloadReactionsNotifySettings$193(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_reactionsNotifySettings) {
            TLRPC$TL_reactionsNotifySettings tLRPC$TL_reactionsNotifySettings = (TLRPC$TL_reactionsNotifySettings) tLObject;
            SharedPreferences.Editor edit = this.notificationsPreferences.edit();
            edit.putBoolean("EnableReactionsMessages", tLRPC$TL_reactionsNotifySettings.messages_notify_from != null);
            TLRPC$ReactionNotificationsFrom tLRPC$ReactionNotificationsFrom = tLRPC$TL_reactionsNotifySettings.messages_notify_from;
            if (tLRPC$ReactionNotificationsFrom != null) {
                edit.putBoolean("EnableReactionsMessagesContacts", tLRPC$ReactionNotificationsFrom instanceof TLRPC$TL_reactionNotificationsFromContacts);
            }
            edit.putBoolean("EnableReactionsStories", tLRPC$TL_reactionsNotifySettings.stories_notify_from != null);
            TLRPC$ReactionNotificationsFrom tLRPC$ReactionNotificationsFrom2 = tLRPC$TL_reactionsNotifySettings.stories_notify_from;
            if (tLRPC$ReactionNotificationsFrom2 != null) {
                edit.putBoolean("EnableReactionsStoriesContacts", tLRPC$ReactionNotificationsFrom2 instanceof TLRPC$TL_reactionNotificationsFromContacts);
            }
            edit.putBoolean("EnableReactionsPreview", tLRPC$TL_reactionsNotifySettings.show_previews);
            getNotificationsController().getNotificationsSettingsFacade().applySoundSettings(tLRPC$TL_reactionsNotifySettings.sound, edit, 0L, 0L, 4, false);
            edit.apply();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
    }

    public void lambda$reloadReactionsNotifySettings$194(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$reloadReactionsNotifySettings$193(tLObject);
            }
        });
    }

    public void lambda$reloadUser$51(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$Vector) {
            ArrayList arrayList = ((TLRPC$Vector) tLObject).objects;
            ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) instanceof TLRPC$User) {
                    arrayList2.add((TLRPC$User) arrayList.get(i));
                }
            }
            getMessagesController().putUsers(arrayList2, false);
        }
    }

    public void lambda$reloadWebPages$176(HashMap hashMap, String str, TLObject tLObject, LongSparseArray longSparseArray, long j, int i) {
        ArrayList arrayList = (ArrayList) hashMap.remove(str);
        if (arrayList == null) {
            return;
        }
        TLRPC$TL_messages_messages tLRPC$TL_messages_messages = new TLRPC$TL_messages_messages();
        if (tLObject instanceof TLRPC$TL_messageMediaWebPage) {
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
        } else {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((MessageObject) arrayList.get(i3)).messageOwner.media.webpage = new TLRPC$TL_webPageEmpty();
                tLRPC$TL_messages_messages.messages.add(((MessageObject) arrayList.get(i3)).messageOwner);
            }
        }
        if (tLRPC$TL_messages_messages.messages.isEmpty()) {
            return;
        }
        getMessagesStorage().putMessages((TLRPC$messages_Messages) tLRPC$TL_messages_messages, j, -2, 0, false, i, 0L);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(j), arrayList);
    }

    public void lambda$reloadWebPages$177(final HashMap hashMap, final String str, final LongSparseArray longSparseArray, final long j, final int i, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$reloadWebPages$176(hashMap, str, tLObject, longSparseArray, j, i);
            }
        });
    }

    public void lambda$removeDialog$125(long j) {
        long j2 = -j;
        this.channelsPts.delete(j2);
        this.shortPollChannels.delete(j2);
        this.needShortPollChannels.delete(j2);
        this.shortPollOnlines.delete(j2);
        this.needShortPollOnlines.delete(j2);
    }

    public void lambda$removeFolderTemporarily$433(int i, boolean z) {
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

    public void lambda$removeFolderTemporarily$434(boolean z) {
        this.frozenDialogFilters = null;
        this.hiddenUndoChats.clear();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
    }

    public static void lambda$removeSuggestion$35(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public int lambda$renameSavedReactionTag$438(TLRPC$TL_savedReactionTag tLRPC$TL_savedReactionTag, TLRPC$TL_savedReactionTag tLRPC$TL_savedReactionTag2) {
        int compare;
        int i = tLRPC$TL_savedReactionTag.count;
        int i2 = tLRPC$TL_savedReactionTag2.count;
        if (i != i2) {
            return i2 - i;
        }
        compare = Long.compare(getTagLongId(tLRPC$TL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, getTagLongId(tLRPC$TL_savedReactionTag.reaction) ^ Long.MIN_VALUE);
        return compare;
    }

    public void lambda$reorderPinnedDialogs$341(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public static void lambda$reportSpam$70(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$reportSpam$71(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$reportSpam$72(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$requestContactToken$429(Utilities.Callback callback) {
        callback.run(this.cachedContactToken);
        this.requestingContactToken = false;
    }

    public void lambda$requestContactToken$430(final Utilities.Callback callback, long j, long j2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (!(tLObject instanceof TLRPC$TL_exportedContactToken)) {
            this.requestingContactToken = false;
        } else {
            this.cachedContactToken = (TLRPC$TL_exportedContactToken) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$requestContactToken$429(callback);
                }
            }, Math.max(0L, j - (System.currentTimeMillis() - j2)));
        }
    }

    public void lambda$requestIsUserPremiumBlocked$448(TLObject tLObject, ArrayList arrayList) {
        boolean z;
        if (tLObject instanceof TLRPC$Vector) {
            ArrayList arrayList2 = ((TLRPC$Vector) tLObject).objects;
            z = false;
            for (int i = 0; i < Math.min(arrayList.size(), arrayList2.size()); i++) {
                long longValue = ((Long) arrayList.get(i)).longValue();
                boolean z2 = arrayList2.get(i) instanceof TLRPC$TL_boolTrue;
                Boolean bool = (Boolean) this.cachedIsUserPremiumBlocked.get(longValue);
                if (bool == null || bool.booleanValue() != z2) {
                    this.cachedIsUserPremiumBlocked.put(longValue, Boolean.valueOf(z2));
                    z = true;
                }
                TLRPC$UserFull userFull = getUserFull(longValue);
                if (userFull != null && userFull.contact_require_premium != z2) {
                    userFull.contact_require_premium = z2;
                    getMessagesStorage().updateUserInfo(userFull, true);
                } else if (userFull == null) {
                    getMessagesStorage().updateUserInfoPremiumBlocked(longValue, z2);
                }
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userIsPremiumBlockedUpadted, new Object[0]);
        }
    }

    public void lambda$requestIsUserPremiumBlocked$449(final ArrayList arrayList, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$requestIsUserPremiumBlocked$448(tLObject, arrayList);
            }
        });
    }

    public void lambda$resetDialogs$198(int i, int i2, int i3, int i4, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            this.resetDialogsPinned = (TLRPC$TL_messages_peerDialogs) tLObject;
            for (int i5 = 0; i5 < this.resetDialogsPinned.dialogs.size(); i5++) {
                ((TLRPC$Dialog) this.resetDialogsPinned.dialogs.get(i5)).pinned = true;
            }
            resetDialogs(false, i, i2, i3, i4);
        }
    }

    public void lambda$resetDialogs$199(int i, int i2, int i3, int i4, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            this.resetDialogsAll = (TLRPC$messages_Dialogs) tLObject;
            resetDialogs(false, i, i2, i3, i4);
        }
    }

    public void lambda$saveGif$137(Object obj, TLRPC$TL_messages_saveGif tLRPC$TL_messages_saveGif, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null || !FileRefController.isFileRefError(tLRPC$TL_error.text)) {
            return;
        }
        getFileRefController().requestReference(obj, tLRPC$TL_messages_saveGif);
    }

    public void lambda$saveRecentSticker$138(Object obj, TLRPC$TL_messages_saveRecentSticker tLRPC$TL_messages_saveRecentSticker, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null || !FileRefController.isFileRefError(tLRPC$TL_error.text)) {
            return;
        }
        getFileRefController().requestReference(obj, tLRPC$TL_messages_saveRecentSticker);
    }

    public void lambda$saveSavedReactionsTags$443(long j, TLRPC$TL_messages_savedReactionsTags tLRPC$TL_messages_savedReactionsTags) {
        SQLiteDatabase database = getMessagesStorage().getDatabase();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                database.executeFast("DELETE FROM saved_reaction_tags WHERE topic_id = " + j).stepThis().dispose();
                sQLitePreparedStatement = database.executeFast("REPLACE INTO saved_reaction_tags VALUES(?, ?)");
                sQLitePreparedStatement.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_messages_savedReactionsTags.getObjectSize());
                tLRPC$TL_messages_savedReactionsTags.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatement.bindLong(1, j);
                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatement.step();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public static void lambda$saveTheme$112(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$saveThemeToServer$115(String str, String str2, Theme.ThemeAccent themeAccent, Theme.ThemeInfo themeInfo) {
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
        getFileLoader().uploadFile(str2, false, true, 67108864);
        getFileLoader().uploadFile(str, false, true, 16777216);
    }

    public void lambda$saveThemeToServer$116(final String str, File file, final Theme.ThemeAccent themeAccent, final Theme.ThemeInfo themeInfo) {
        final String createThemePreviewImage = Theme.createThemePreviewImage(str, file != null ? file.getAbsolutePath() : null, themeAccent);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$saveThemeToServer$115(createThemePreviewImage, str, themeAccent, themeInfo);
            }
        });
    }

    public void lambda$saveWallpaperToServer$117(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        getMessagesStorage().removePendingTask(j);
    }

    public void lambda$scheduleTranscriptionUpdate$33() {
        AndroidUtilities.cancelRunOnUIThread(this.notifyTranscriptionAudioCooldownUpdate);
        long currentTime = this.transcribeAudioTrialCooldownUntil - getConnectionsManager().getCurrentTime();
        if (currentTime > 0) {
            AndroidUtilities.runOnUIThread(this.notifyTranscriptionAudioCooldownUpdate, currentTime);
        }
    }

    public void lambda$sendBotStart$272(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        processUpdates((TLRPC$Updates) tLObject, false);
    }

    public void lambda$sendLoadPeersRequest$16(java.util.ArrayList r12, java.util.ArrayList r13, org.telegram.tgnet.TLRPC$messages_Dialogs r14, org.telegram.tgnet.TLRPC$messages_Dialogs r15, java.util.ArrayList r16, org.telegram.tgnet.TLObject r17, java.util.ArrayList r18, android.util.SparseArray r19, java.util.ArrayList r20, java.util.HashMap r21, java.util.HashSet r22, java.lang.Runnable r23, org.telegram.tgnet.TLObject r24, org.telegram.tgnet.TLRPC$TL_error r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$sendLoadPeersRequest$16(java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$messages_Dialogs, org.telegram.tgnet.TLRPC$messages_Dialogs, java.util.ArrayList, org.telegram.tgnet.TLObject, java.util.ArrayList, android.util.SparseArray, java.util.ArrayList, java.util.HashMap, java.util.HashSet, java.lang.Runnable, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$sendTyping$163(final int i, final long j, final long j2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$sendTyping$162(i, j, j2);
            }
        });
    }

    public void lambda$sendTyping$165(final int i, final long j, final long j2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$sendTyping$164(i, j, j2);
            }
        });
    }

    public void lambda$setBoostsToUnblockRestrictions$89(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$setBoostsToUnblockRestrictions$90(final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setBoostsToUnblockRestrictions$89(j);
                }
            }, 1000L);
        }
    }

    public void lambda$setChannelSlowMode$87(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$setChannelSlowMode$88(final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setChannelSlowMode$87(j);
                }
            }, 1000L);
        }
    }

    public void lambda$setChatReactions$424(long j) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatAvailableReactionsUpdated, Long.valueOf(j), 0L);
    }

    public void lambda$setChatReactions$425(final long j, TLRPC$TL_messages_setChatAvailableReactions tLRPC$TL_messages_setChatAvailableReactions, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
                    MessagesController.this.lambda$setChatReactions$424(j);
                }
            });
        }
    }

    public static void lambda$setContentSettings$457(TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
        }
    }

    public static void lambda$setContentSettings$458(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$setContentSettings$457(TLRPC$TL_error.this);
            }
        });
    }

    public void lambda$setCustomChatReactions$421(Runnable runnable, long j) {
        if (runnable != null) {
            runnable.run();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatAvailableReactionsUpdated, Long.valueOf(j), 0L);
    }

    public static void lambda$setCustomChatReactions$422(Utilities.Callback callback, TLRPC$TL_error tLRPC$TL_error) {
        if (callback != null) {
            callback.run(tLRPC$TL_error);
        }
    }

    public void lambda$setCustomChatReactions$423(final long j, TLRPC$TL_messages_setChatAvailableReactions tLRPC$TL_messages_setChatAvailableReactions, final Runnable runnable, final Utilities.Callback callback, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$setCustomChatReactions$422(Utilities.Callback.this, tLRPC$TL_error);
                }
            });
            return;
        }
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
                MessagesController.this.lambda$setCustomChatReactions$421(runnable, j);
            }
        });
    }

    public void lambda$setDefaultBannedRole$91(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$setDefaultBannedRole$92(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_editChatDefaultBannedRights tLRPC$TL_messages_editChatDefaultBannedRights, boolean z) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editChatDefaultBannedRights, Boolean.valueOf(z));
    }

    public void lambda$setDefaultBannedRole$93(final long j, final BaseFragment baseFragment, final TLRPC$TL_messages_editChatDefaultBannedRights tLRPC$TL_messages_editChatDefaultBannedRights, final boolean z, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setDefaultBannedRole$92(tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editChatDefaultBannedRights, z);
                }
            });
        } else {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setDefaultBannedRole$91(j);
                }
            }, 1000L);
        }
    }

    public void lambda$setDefaultSendAs$255(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        long j2;
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            j2 = -j;
            if (getChatFull(j2) != null) {
                return;
            }
        } else if (tLRPC$TL_error == null || tLRPC$TL_error.code != 400) {
            return;
        } else {
            j2 = -j;
        }
        loadFullChat(j2, 0, true);
    }

    public void lambda$setDialogHistoryTTL$128(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
        }
    }

    public void lambda$setLastCreatedDialogId$50(boolean z, boolean z2, long j) {
        ArrayList<Long> arrayList = z ? this.createdScheduledDialogIds : this.createdDialogIds;
        if (!z2) {
            arrayList.remove(Long.valueOf(j));
        } else {
            if (arrayList.contains(Long.valueOf(j))) {
                return;
            }
            arrayList.add(Long.valueOf(j));
        }
    }

    public void lambda$setParticipantBannedRole$84(long j) {
        loadFullChat(j, 0, true);
    }

    public void lambda$setParticipantBannedRole$85(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_editBanned tLRPC$TL_channels_editBanned, boolean z) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_editBanned, Boolean.valueOf(z));
    }

    public void lambda$setParticipantBannedRole$86(final long j, Runnable runnable, final BaseFragment baseFragment, final TLRPC$TL_channels_editBanned tLRPC$TL_channels_editBanned, final boolean z, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setParticipantBannedRole$85(tLRPC$TL_error, baseFragment, tLRPC$TL_channels_editBanned, z);
                }
            });
            return;
        }
        processUpdates((TLRPC$Updates) tLObject, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$setParticipantBannedRole$84(j);
            }
        }, 1000L);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public void lambda$setUserAdminRole$100(long j, Runnable runnable) {
        loadFullChat(j, 0, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$setUserAdminRole$101(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_messages_editChatAdmin tLRPC$TL_messages_editChatAdmin) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editChatAdmin, Boolean.FALSE);
    }

    public void lambda$setUserAdminRole$103(final long j, final Runnable runnable, final BaseFragment baseFragment, final TLRPC$TL_messages_editChatAdmin tLRPC$TL_messages_editChatAdmin, final ErrorDelegate errorDelegate, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setUserAdminRole$100(j, runnable);
                }
            }, 1000L);
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$setUserAdminRole$101(tLRPC$TL_error, baseFragment, tLRPC$TL_messages_editChatAdmin);
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

    public void lambda$setUserAdminRole$104(TLRPC$TL_messages_editChatAdmin tLRPC$TL_messages_editChatAdmin, RequestDelegate requestDelegate) {
        getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatAdmin, requestDelegate);
    }

    public void lambda$setUserAdminRole$94(long j, Runnable runnable) {
        loadFullChat(j, 0, true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$setUserAdminRole$95(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, ErrorDelegate errorDelegate, TLRPC$TL_error tLRPC$TL_error) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null && lastFragment.getParentActivity() != null) {
            LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(lastFragment, lastFragment.getParentActivity(), 11, this.currentAccount, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(tLRPC$User);
            limitReachedBottomSheet.setRestrictedUsers(tLRPC$Chat, arrayList, null, null);
            limitReachedBottomSheet.show();
        }
        errorDelegate.run(tLRPC$TL_error);
    }

    public void lambda$setUserAdminRole$96(TLRPC$TL_error tLRPC$TL_error, BaseFragment baseFragment, TLRPC$TL_channels_editAdmin tLRPC$TL_channels_editAdmin, boolean z) {
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_editAdmin, Boolean.valueOf(z));
    }

    public void lambda$setUserAdminRole$98(final long j, final Runnable runnable, final TLRPC$Chat tLRPC$Chat, final TLRPC$User tLRPC$User, final ErrorDelegate errorDelegate, final BaseFragment baseFragment, final TLRPC$TL_channels_editAdmin tLRPC$TL_channels_editAdmin, final boolean z, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setUserAdminRole$94(j, runnable);
                }
            }, 1000L);
        } else {
            if ("USER_PRIVACY_RESTRICTED".equals(tLRPC$TL_error.text) && ChatObject.canUserDoAdminAction(tLRPC$Chat, 3)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$setUserAdminRole$95(tLRPC$User, tLRPC$Chat, errorDelegate, tLRPC$TL_error);
                    }
                });
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setUserAdminRole$96(tLRPC$TL_error, baseFragment, tLRPC$TL_channels_editAdmin, z);
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

    public void lambda$setUserAdminRole$99(TLRPC$TL_channels_editAdmin tLRPC$TL_channels_editAdmin, RequestDelegate requestDelegate) {
        getConnectionsManager().sendRequest(tLRPC$TL_channels_editAdmin, requestDelegate);
    }

    public static void lambda$startShortPoll$309(Consumer consumer) {
        consumer.accept(Boolean.TRUE);
    }

    public static void lambda$startShortPoll$310(Consumer consumer) {
        consumer.accept(Boolean.FALSE);
    }

    public void lambda$startShortPoll$311(TLRPC$Chat tLRPC$Chat, boolean z, int i, final Consumer consumer) {
        ArrayList arrayList = (ArrayList) this.needShortPollChannels.get(tLRPC$Chat.id);
        ArrayList arrayList2 = (ArrayList) this.needShortPollOnlines.get(tLRPC$Chat.id);
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
            arrayList = new ArrayList();
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
                        MessagesController.lambda$startShortPoll$309(Consumer.this);
                    }
                });
            }
            getChannelDifference(tLRPC$Chat.id, 3, 0L, null);
        } else if (consumer != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$startShortPoll$310(Consumer.this);
                }
            });
        }
        if (tLRPC$Chat.megagroup) {
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
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

    public void lambda$toggleChannelForum$264() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void lambda$toggleChannelForum$265(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChannelForum$264();
                }
            });
        }
    }

    public void lambda$toggleChannelInvitesHistory$266() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void lambda$toggleChannelInvitesHistory$267(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChannelInvitesHistory$266();
                }
            });
        }
    }

    public void lambda$toggleChannelSignatures$262() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void lambda$toggleChannelSignatures$263(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChannelSignatures$262();
                }
            });
        }
    }

    public void lambda$toggleChatJoinRequest$260() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void lambda$toggleChatJoinRequest$261(Runnable runnable, Runnable runnable2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChatJoinRequest$260();
                }
            });
            if (runnable == null) {
                return;
            }
        } else if (tLRPC$TL_error != null && !"CHAT_NOT_MODIFIED".equals(tLRPC$TL_error.text)) {
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        } else if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public void lambda$toggleChatJoinToSend$258() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void lambda$toggleChatJoinToSend$259(Runnable runnable, Runnable runnable2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChatJoinToSend$258();
                }
            });
            if (runnable == null) {
                return;
            }
        } else if (tLRPC$TL_error != null && !"CHAT_NOT_MODIFIED".equals(tLRPC$TL_error.text)) {
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        } else if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public void lambda$toggleChatNoForwards$256() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
    }

    public void lambda$toggleChatNoForwards$257(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            processUpdates((TLRPC$Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$toggleChatNoForwards$256();
                }
            });
        }
    }

    public static void lambda$unblockPeer$105(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$unblockPeer$106(final Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.lambda$unblockPeer$105(runnable);
            }
        });
    }

    public void lambda$unpinAllMessages$122(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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

    public static void lambda$unregistedPush$298(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$updateChannelUserName$270(long j, String str, Runnable runnable) {
        TLRPC$Chat chat = getChat(Long.valueOf(j));
        if (chat.usernames != null) {
            for (int i = 0; i < chat.usernames.size(); i++) {
                TLRPC$TL_username tLRPC$TL_username = (TLRPC$TL_username) chat.usernames.get(i);
                if (tLRPC$TL_username != null && tLRPC$TL_username.editable) {
                    tLRPC$TL_username.username = str;
                    break;
                }
            }
        }
        ArrayList arrayList = chat.usernames;
        if (arrayList == null || arrayList.size() >= 1) {
            if (chat.usernames == null) {
                chat.usernames = new ArrayList();
            }
            TLRPC$TL_username tLRPC$TL_username2 = new TLRPC$TL_username();
            tLRPC$TL_username2.username = str;
            tLRPC$TL_username2.active = true;
            tLRPC$TL_username2.editable = true;
            chat.usernames.add(0, tLRPC$TL_username2);
        } else {
            chat.username = str;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(chat);
        getMessagesStorage().putUsersAndChats(null, arrayList2, true, true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_CHAT));
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$updateChannelUserName$271(final long j, final String str, final Runnable runnable, BaseFragment baseFragment, TLRPC$TL_channels_updateUsername tLRPC$TL_channels_updateUsername, Runnable runnable2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if ((tLObject instanceof TLRPC$TL_boolTrue) || (tLRPC$TL_error != null && "USERNAME_NOT_MODIFIED".equals(tLRPC$TL_error.text))) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$updateChannelUserName$270(j, str, runnable);
                }
            });
            return;
        }
        AlertsCreator.processError(UserConfig.selectedAccount, tLRPC$TL_error, baseFragment, tLRPC$TL_channels_updateUsername, new Object[0]);
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public void lambda$updateChatAbout$268(TLRPC$ChatFull tLRPC$ChatFull, String str) {
        tLRPC$ChatFull.about = str;
        getMessagesStorage().updateChatInfo(tLRPC$ChatFull, false);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, tLRPC$ChatFull, 0, bool, bool);
    }

    public void lambda$updateChatAbout$269(final TLRPC$ChatFull tLRPC$ChatFull, final String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (!(tLObject instanceof TLRPC$TL_boolTrue) || tLRPC$ChatFull == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$updateChatAbout$268(tLRPC$ChatFull, str);
            }
        });
    }

    public void lambda$updateConfig$36(org.telegram.tgnet.TLRPC$TL_config r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$updateConfig$36(org.telegram.tgnet.TLRPC$TL_config):void");
    }

    public static void lambda$updateEmojiStatus$29(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        boolean z = tLObject instanceof TLRPC$TL_boolTrue;
    }

    public void lambda$updateEmojiStatusUntil$428() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_EMOJI_STATUS));
        updateEmojiStatusUntil();
    }

    public void lambda$updateInterfaceWithMessages$399(TLRPC$Dialog tLRPC$Dialog, int i, long j, int i2) {
        if (i2 == -1) {
            if (i <= 0 || DialogObject.isEncryptedDialog(j)) {
                return;
            }
            loadUnknownDialog(getInputPeer(j), 0L);
            return;
        }
        if (i2 != 0) {
            tLRPC$Dialog.folder_id = i2;
            sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
        }
    }

    public void lambda$updatePrintingStrings$161(LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        this.printingStrings = longSparseArray;
        this.printingStringsTypes = longSparseArray2;
    }

    public int lambda$updateSavedReactionTags$437(TLRPC$TL_savedReactionTag tLRPC$TL_savedReactionTag, TLRPC$TL_savedReactionTag tLRPC$TL_savedReactionTag2) {
        int compare;
        int i = tLRPC$TL_savedReactionTag.count;
        int i2 = tLRPC$TL_savedReactionTag2.count;
        if (i != i2) {
            return i2 - i;
        }
        compare = Long.compare(getTagLongId(tLRPC$TL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, getTagLongId(tLRPC$TL_savedReactionTag.reaction) ^ Long.MIN_VALUE);
        return compare;
    }

    public void lambda$updateTimerProc$143(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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

    public void lambda$updateTimerProc$144(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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

    public void lambda$updateTimerProc$145(TLRPC$TL_messages_messageViews tLRPC$TL_messages_messageViews, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, LongSparseArray longSparseArray3) {
        putUsers(tLRPC$TL_messages_messageViews.users, false);
        putChats(tLRPC$TL_messages_messageViews.chats, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateMessagesViews, longSparseArray, longSparseArray2, longSparseArray3, Boolean.FALSE);
    }

    public void lambda$updateTimerProc$146(long j, TLRPC$TL_messages_getMessagesViews tLRPC$TL_messages_getMessagesViews, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$TL_messages_messageViews tLRPC$TL_messages_messageViews = (TLRPC$TL_messages_messageViews) tLObject;
            final LongSparseArray longSparseArray = new LongSparseArray();
            final LongSparseArray longSparseArray2 = new LongSparseArray();
            final LongSparseArray longSparseArray3 = new LongSparseArray();
            SparseIntArray sparseIntArray = (SparseIntArray) longSparseArray.get(j);
            SparseIntArray sparseIntArray2 = (SparseIntArray) longSparseArray2.get(j);
            SparseArray sparseArray = (SparseArray) longSparseArray3.get(j);
            for (int i = 0; i < tLRPC$TL_messages_getMessagesViews.id.size() && i < tLRPC$TL_messages_messageViews.views.size(); i++) {
                TLRPC$TL_messageViews tLRPC$TL_messageViews = (TLRPC$TL_messageViews) tLRPC$TL_messages_messageViews.views.get(i);
                if ((1 & tLRPC$TL_messageViews.flags) != 0) {
                    if (sparseIntArray == null) {
                        sparseIntArray = new SparseIntArray();
                        longSparseArray.put(j, sparseIntArray);
                    }
                    sparseIntArray.put(((Integer) tLRPC$TL_messages_getMessagesViews.id.get(i)).intValue(), tLRPC$TL_messageViews.views);
                }
                if ((tLRPC$TL_messageViews.flags & 2) != 0) {
                    if (sparseIntArray2 == null) {
                        sparseIntArray2 = new SparseIntArray();
                        longSparseArray2.put(j, sparseIntArray2);
                    }
                    sparseIntArray2.put(((Integer) tLRPC$TL_messages_getMessagesViews.id.get(i)).intValue(), tLRPC$TL_messageViews.forwards);
                }
                if ((tLRPC$TL_messageViews.flags & 4) != 0) {
                    if (sparseArray == null) {
                        sparseArray = new SparseArray();
                        longSparseArray3.put(j, sparseArray);
                    }
                    sparseArray.put(((Integer) tLRPC$TL_messages_getMessagesViews.id.get(i)).intValue(), tLRPC$TL_messageViews.replies);
                }
            }
            getMessagesStorage().putUsersAndChats(tLRPC$TL_messages_messageViews.users, tLRPC$TL_messages_messageViews.chats, true, true);
            getMessagesStorage().putChannelViews(longSparseArray, longSparseArray2, longSparseArray3, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$updateTimerProc$145(tLRPC$TL_messages_messageViews, longSparseArray, longSparseArray2, longSparseArray3);
                }
            });
        }
    }

    public void lambda$updateTimerProc$147(boolean z, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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

    public void lambda$updateTimerProc$148(int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.lambda$updateTimerProc$148(int):void");
    }

    public void lambda$updateTimerProc$149() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_STATUS));
    }

    public void lambda$updateTimerProc$150(long j, TLRPC$TL_chatOnlines tLRPC$TL_chatOnlines) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatOnlineCountDidLoad, Long.valueOf(j), Integer.valueOf(tLRPC$TL_chatOnlines.onlines));
    }

    public void lambda$updateTimerProc$151(final long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$TL_chatOnlines tLRPC$TL_chatOnlines = (TLRPC$TL_chatOnlines) tLObject;
            getMessagesStorage().updateChatOnlineCount(j, tLRPC$TL_chatOnlines.onlines);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$updateTimerProc$150(j, tLRPC$TL_chatOnlines);
                }
            });
        }
    }

    public void lambda$updateTimerProc$152() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_USER_PRINT));
    }

    public void loadMessagesInternal(final long j, final long j2, final boolean z, final int i, final int i2, final int i3, boolean z2, final int i4, final int i5, final int i6, final int i7, final int i8, final long j3, final int i9, final int i10, final int i11, final int i12, final boolean z3, final int i13, boolean z4, final boolean z5, final boolean z6, Timer timer, long j4) {
        Timer timer2;
        int i14;
        final int i15;
        int sendRequest;
        ConnectionsManager connectionsManager;
        int i16;
        TLRPC$TL_forumTopic findTopic;
        int i17;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("load messages in chat " + j + " topic_id " + j3 + " count " + i + " max_id " + i2 + " cache " + z2 + " mindate = " + i4 + " guid " + i5 + " load_type " + i6 + " last_message_id " + i7 + " mode " + i8 + " index " + i9 + " firstUnread " + i10 + " unread_count " + i11 + " last_date " + i12 + " queryFromServer " + z3 + " isTopic " + z6);
        }
        if (BuildVars.LOGS_ENABLED && timer == null && i8 == 0) {
            timer2 = new Timer("MessageLoaderLogger dialogId=" + j + " index=" + i9 + " count=" + i);
        } else {
            timer2 = timer;
        }
        if ((j3 == 0 || z6 || i8 == 3 || i8 == 5) && i8 != 2 && (z2 || DialogObject.isEncryptedDialog(j))) {
            getMessagesStorage().getMessages(j, j2, z, i, i2, i3, i4, i5, i6, i8, j3, i9, z5, z6, timer2);
            return;
        }
        if (i8 == 5) {
            TLRPC$TL_messages_getQuickReplyMessages tLRPC$TL_messages_getQuickReplyMessages = new TLRPC$TL_messages_getQuickReplyMessages();
            tLRPC$TL_messages_getQuickReplyMessages.shortcut_id = (int) j3;
            tLRPC$TL_messages_getQuickReplyMessages.hash = j4;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getQuickReplyMessages, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadMessagesInternal$166(j, j2, i, i2, i3, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLObject, tLRPC$TL_error);
                }
            }), i5);
            return;
        }
        if (j3 != 0) {
            if (i8 == 3) {
                final TLRPC$TL_messages_getSavedHistory tLRPC$TL_messages_getSavedHistory = new TLRPC$TL_messages_getSavedHistory();
                tLRPC$TL_messages_getSavedHistory.peer = getInputPeer(j3);
                if (i6 == 4) {
                    i17 = (-i) + 5;
                } else {
                    if (i6 != 3) {
                        if (i6 == 1) {
                            tLRPC$TL_messages_getSavedHistory.add_offset = (-i) - 1;
                        } else if (i6 == 2 && i2 != 0) {
                            i17 = (-i) + 6;
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
                                MessagesController.this.lambda$loadMessagesInternal$168(j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getSavedHistory, tLObject, tLRPC$TL_error);
                            }
                        }), i5);
                        return;
                    }
                    i17 = (-i) / 2;
                }
                tLRPC$TL_messages_getSavedHistory.add_offset = i17;
                tLRPC$TL_messages_getSavedHistory.limit = i;
                tLRPC$TL_messages_getSavedHistory.offset_id = i2;
                tLRPC$TL_messages_getSavedHistory.offset_date = i3;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getSavedHistory, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadMessagesInternal$168(j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getSavedHistory, tLObject, tLRPC$TL_error);
                    }
                }), i5);
                return;
            }
            if (z4 && z6 && i6 == 2 && i7 == 0 && (findTopic = this.topicsController.findTopic(-j, j3)) != null) {
                loadMessagesInternal(j, j2, z, i, i2, i3, false, i4, i5, i6, findTopic.top_message, i8, j3, i9, i10, findTopic.unread_count, i12, z3, findTopic.unread_mentions_count, false, z5, z6, timer2, 0L);
                return;
            }
            if (i8 != 0) {
                return;
            }
            final TLRPC$TL_messages_getReplies tLRPC$TL_messages_getReplies = new TLRPC$TL_messages_getReplies();
            tLRPC$TL_messages_getReplies.peer = getInputPeer(j);
            tLRPC$TL_messages_getReplies.msg_id = (int) j3;
            tLRPC$TL_messages_getReplies.offset_date = i3;
            if (i6 == 4) {
                i16 = (-i) + 5;
            } else if (i6 == 3) {
                i16 = (-i) / 2;
            } else {
                if (i6 == 1) {
                    tLRPC$TL_messages_getReplies.add_offset = (-i) - 1;
                } else if (i6 == 2 && i2 != 0) {
                    i16 = (-i) + 10;
                } else if (j < 0 && i2 != 0) {
                    if (ChatObject.isChannel(getChat(Long.valueOf(-j)))) {
                        tLRPC$TL_messages_getReplies.add_offset = -1;
                        tLRPC$TL_messages_getReplies.limit++;
                    }
                    tLRPC$TL_messages_getReplies.limit = i;
                    tLRPC$TL_messages_getReplies.offset_id = i2;
                    tLRPC$TL_messages_getReplies.hash = j4;
                    System.currentTimeMillis();
                    sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_getReplies, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$loadMessagesInternal$170(i, i2, i3, i10, i6, j, j2, i5, i7, i11, i12, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getReplies, tLObject, tLRPC$TL_error);
                        }
                    });
                    connectionsManager = getConnectionsManager();
                    i15 = i5;
                }
                tLRPC$TL_messages_getReplies.limit = i;
                tLRPC$TL_messages_getReplies.offset_id = i2;
                tLRPC$TL_messages_getReplies.hash = j4;
                System.currentTimeMillis();
                sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_getReplies, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadMessagesInternal$170(i, i2, i3, i10, i6, j, j2, i5, i7, i11, i12, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getReplies, tLObject, tLRPC$TL_error);
                    }
                });
                connectionsManager = getConnectionsManager();
                i15 = i5;
            }
            tLRPC$TL_messages_getReplies.add_offset = i16;
            tLRPC$TL_messages_getReplies.limit = i;
            tLRPC$TL_messages_getReplies.offset_id = i2;
            tLRPC$TL_messages_getReplies.hash = j4;
            System.currentTimeMillis();
            sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_getReplies, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadMessagesInternal$170(i, i2, i3, i10, i6, j, j2, i5, i7, i11, i12, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getReplies, tLObject, tLRPC$TL_error);
                }
            });
            connectionsManager = getConnectionsManager();
            i15 = i5;
        } else {
            if (i8 == 2) {
                return;
            }
            if (i8 != 1) {
                if (z4 && ((i6 == 3 || i6 == 2) && i7 == 0)) {
                    final TLRPC$TL_messages_getPeerDialogs tLRPC$TL_messages_getPeerDialogs = new TLRPC$TL_messages_getPeerDialogs();
                    TLRPC$InputPeer inputPeer = getInputPeer(j);
                    TLRPC$TL_inputDialogPeer tLRPC$TL_inputDialogPeer = new TLRPC$TL_inputDialogPeer();
                    tLRPC$TL_inputDialogPeer.peer = inputPeer;
                    tLRPC$TL_messages_getPeerDialogs.peers.add(tLRPC$TL_inputDialogPeer);
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$loadMessagesInternal$173(j, j2, z, i, i2, i3, i4, i5, i6, j3, i9, i10, i12, z3, z5, z6, tLRPC$TL_messages_getPeerDialogs, tLObject, tLRPC$TL_error);
                        }
                    });
                    return;
                }
                final TLRPC$TL_messages_getHistory tLRPC$TL_messages_getHistory = new TLRPC$TL_messages_getHistory();
                tLRPC$TL_messages_getHistory.peer = getInputPeer(j);
                if (i6 == 4) {
                    i14 = (-i) + 5;
                } else {
                    if (i6 != 3) {
                        if (i6 == 1) {
                            tLRPC$TL_messages_getHistory.add_offset = (-i) - 1;
                        } else if (i6 == 2 && i2 != 0) {
                            i14 = (-i) + 6;
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
                                    MessagesController.this.lambda$loadMessagesInternal$175(j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getHistory, tLObject, tLRPC$TL_error);
                                }
                            }), i5);
                            return;
                        }
                        tLRPC$TL_messages_getHistory.limit = i;
                        tLRPC$TL_messages_getHistory.offset_id = i2;
                        tLRPC$TL_messages_getHistory.offset_date = i3;
                        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getHistory, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                MessagesController.this.lambda$loadMessagesInternal$175(j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getHistory, tLObject, tLRPC$TL_error);
                            }
                        }), i5);
                        return;
                    }
                    i14 = (-i) / 2;
                }
                tLRPC$TL_messages_getHistory.add_offset = i14;
                tLRPC$TL_messages_getHistory.limit = i;
                tLRPC$TL_messages_getHistory.offset_id = i2;
                tLRPC$TL_messages_getHistory.offset_date = i3;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_messages_getHistory, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadMessagesInternal$175(j, i, i2, i3, j2, i5, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLRPC$TL_messages_getHistory, tLObject, tLRPC$TL_error);
                    }
                }), i5);
                return;
            }
            TLRPC$TL_messages_getScheduledHistory tLRPC$TL_messages_getScheduledHistory = new TLRPC$TL_messages_getScheduledHistory();
            tLRPC$TL_messages_getScheduledHistory.peer = getInputPeer(j);
            tLRPC$TL_messages_getScheduledHistory.hash = j4;
            i15 = i5;
            sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_getScheduledHistory, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadMessagesInternal$171(i2, i3, j, j2, i, i15, i10, i7, i11, i12, i6, i8, j3, i9, z3, i13, z5, z6, tLObject, tLRPC$TL_error);
                }
            });
            connectionsManager = getConnectionsManager();
        }
        connectionsManager.bindRequestToGuid(sendRequest, i15);
    }

    private void loadPremiumFeaturesPreviewOrder(SparseIntArray sparseIntArray, String str) {
        sparseIntArray.clear();
        if (str != null) {
            String[] split = str.split("_");
            for (int i = 0; i < split.length; i++) {
                sparseIntArray.put(Integer.parseInt(split[i]), i);
            }
        }
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
            FileLog.d("start migrate with id " + i + " date " + LocaleController.getInstance().getFormatterStats().format(i2 * 1000));
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
                MessagesController.this.lambda$migrateDialogs$205(i, tLObject, tLRPC$TL_error);
            }
        });
    }

    private void processChannelsUpdatesQueue(long j, int i) {
        ArrayList arrayList = (ArrayList) this.updatesQueueChannels.get(j);
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
                int lambda$processChannelsUpdatesQueue$304;
                lambda$processChannelsUpdatesQueue$304 = MessagesController.lambda$processChannelsUpdatesQueue$304((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
                return lambda$processChannelsUpdatesQueue$304;
            }
        });
        if (i == 2) {
            this.channelsPts.put(j, ((TLRPC$Updates) arrayList.get(0)).pts);
        }
        boolean z = false;
        while (arrayList.size() > 0) {
            TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) arrayList.get(0);
            int i3 = tLRPC$Updates.pts;
            char c = i3 <= i2 ? (char) 2 : tLRPC$Updates.pts_count + i2 == i3 ? (char) 0 : (char) 1;
            if (c == 0) {
                processUpdates(tLRPC$Updates, true);
                if (arrayList.size() <= 0) {
                    break;
                }
                z = true;
                arrayList.remove(0);
            } else {
                if (c == 1) {
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
                }
                if (arrayList.size() <= 0) {
                    break;
                } else {
                    arrayList.remove(0);
                }
            }
        }
        this.updatesQueueChannels.remove(j);
        this.updatesStartWaitTimeChannels.delete(j);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("UPDATES CHANNEL " + j + " QUEUE PROCEED - OK");
        }
    }

    private void processUpdatesQueue(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processUpdatesQueue(int, int):void");
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
                    Long l = (Long) this.peerDialogsRequested.get(peerDialogId);
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
            Long l2 = (Long) this.peerDialogsRequested.get(peerDialogId2);
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
                MessagesController.this.lambda$reloadDialogsReadValue$58(tLObject, tLRPC$TL_error);
            }
        });
    }

    private void reloadMessages(ArrayList<Integer> arrayList, final long j, final int i) {
        TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages;
        if (arrayList.isEmpty()) {
            return;
        }
        final boolean z = i == 1;
        final ArrayList arrayList2 = new ArrayList();
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
        ArrayList arrayList3 = (ArrayList) this.reloadingMessages.get(j);
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
            arrayList3 = new ArrayList();
            this.reloadingMessages.put(j, arrayList3);
        }
        arrayList3.addAll(arrayList2);
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$reloadMessages$68(j, z, i, arrayList2, tLObject, tLRPC$TL_error);
            }
        });
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
                    MessagesController.this.lambda$removeDialog$125(j);
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
            DialogFilter dialogFilter = dialogFilterArr[i];
            if (dialogFilter != null) {
                dialogFilter.dialogs.remove(tLRPC$Dialog);
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

    private void removeFolder(int i) {
        long makeFolderDialogId = DialogObject.makeFolderDialogId(i);
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(makeFolderDialogId);
        if (tLRPC$Dialog == null) {
            return;
        }
        this.dialogs_dict.remove(makeFolderDialogId);
        this.allDialogs.remove(tLRPC$Dialog);
        sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.folderBecomeEmpty, Integer.valueOf(i));
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
                tLRPC$Dialog = this.promoDialog;
            }
            this.promoDialog = null;
            sortDialogs(null);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
        removeDialog(tLRPC$Dialog);
        this.promoDialog = null;
        sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void requestIsUserPremiumBlocked() {
        if (this.loadingIsUserPremiumBlocked.isEmpty()) {
            return;
        }
        TLRPC$TL_users_getIsPremiumRequiredToContact tLRPC$TL_users_getIsPremiumRequiredToContact = new TLRPC$TL_users_getIsPremiumRequiredToContact();
        final ArrayList arrayList = new ArrayList();
        Iterator<Long> it = this.loadingIsUserPremiumBlocked.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            TLRPC$InputUser inputUser = getInputUser(next.longValue());
            if (inputUser != null) {
                tLRPC$TL_users_getIsPremiumRequiredToContact.id.add(inputUser);
                arrayList.add(next);
            }
        }
        this.loadingIsUserPremiumBlocked.clear();
        if (tLRPC$TL_users_getIsPremiumRequiredToContact.id.isEmpty()) {
            return;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_users_getIsPremiumRequiredToContact, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$requestIsUserPremiumBlocked$449(arrayList, tLObject, tLRPC$TL_error);
            }
        });
    }

    private void resetAppConfig() {
        this.getfileExperimentalParams = false;
        this.channelRevenueWithdrawalEnabled = false;
        this.collectDeviceStats = false;
        this.smsjobsStickyNotificationEnabled = false;
        this.showAnnualPerMonth = false;
        this.canEditFactcheck = false;
        this.starsLocked = true;
        this.factcheckLengthLimit = 1024;
        this.mainPreferences.edit().remove("starsLocked").remove("getfileExperimentalParams").remove("smsjobsStickyNotificationEnabled").remove("channelRevenueWithdrawalEnabled").remove("showAnnualPerMonth").remove("canEditFactcheck").remove("factcheckLengthLimit").apply();
    }

    private void resetDialogs(boolean r27, final int r28, final int r29, final int r30, final int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.resetDialogs(boolean, int, int, int, int):void");
    }

    private void savePeerSettings(long j, TLRPC$PeerSettings tLRPC$PeerSettings, boolean z) {
        if (tLRPC$PeerSettings == null) {
            return;
        }
        SharedPreferences.Editor edit = this.notificationsPreferences.edit();
        if (tLRPC$PeerSettings.business_bot_id != 0) {
            edit.putLong("dialog_botid" + j, tLRPC$PeerSettings.business_bot_id);
            edit.putString("dialog_boturl" + j, tLRPC$PeerSettings.business_bot_manage_url);
            edit.putInt("dialog_botflags" + j, (tLRPC$PeerSettings.business_bot_paused ? 1 : 0) + (tLRPC$PeerSettings.business_bot_can_reply ? 2 : 0));
        } else {
            edit.remove("dialog_botid" + j).remove("dialog_boturl" + j).remove("dialog_botflags" + j);
        }
        if (this.notificationsPreferences.getInt("dialog_bar_vis3" + j, 0) == 3) {
            edit.apply();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(j));
            return;
        }
        boolean z2 = tLRPC$PeerSettings.flags == 0;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("peer settings loaded for " + j + " add = " + tLRPC$PeerSettings.add_contact + " block = " + tLRPC$PeerSettings.block_contact + " spam = " + tLRPC$PeerSettings.report_spam + " share = " + tLRPC$PeerSettings.share_contact + " geo = " + tLRPC$PeerSettings.report_geo + " hide = " + z2 + " distance = " + tLRPC$PeerSettings.geo_distance + " invite = " + tLRPC$PeerSettings.invite_members);
        }
        edit.putInt("dialog_bar_vis3" + j, z2 ? 1 : 2);
        edit.putBoolean("dialog_bar_share" + j, tLRPC$PeerSettings.share_contact);
        edit.putBoolean("dialog_bar_report" + j, tLRPC$PeerSettings.report_spam);
        edit.putBoolean("dialog_bar_add" + j, tLRPC$PeerSettings.add_contact);
        edit.putBoolean("dialog_bar_block" + j, tLRPC$PeerSettings.block_contact);
        edit.putBoolean("dialog_bar_exception" + j, tLRPC$PeerSettings.need_contacts_exception);
        edit.putBoolean("dialog_bar_location" + j, tLRPC$PeerSettings.report_geo);
        edit.putBoolean("dialog_bar_archived" + j, tLRPC$PeerSettings.autoarchived);
        edit.putBoolean("dialog_bar_invite" + j, tLRPC$PeerSettings.invite_members);
        edit.putString("dialog_bar_chat_with_admin_title" + j, tLRPC$PeerSettings.request_chat_title);
        edit.putBoolean("dialog_bar_chat_with_channel" + j, tLRPC$PeerSettings.request_chat_broadcast);
        edit.putInt("dialog_bar_chat_with_date" + j, tLRPC$PeerSettings.request_chat_date);
        if (this.notificationsPreferences.getInt("dialog_bar_distance" + j, -1) != -2) {
            if ((tLRPC$PeerSettings.flags & 64) != 0) {
                edit.putInt("dialog_bar_distance" + j, tLRPC$PeerSettings.geo_distance);
            } else {
                edit.remove("dialog_bar_distance" + j);
            }
        }
        if (j == getUserConfig().getClientUserId()) {
            tLRPC$PeerSettings.business_bot_id = 1271266957L;
            tLRPC$PeerSettings.business_bot_manage_url = "https://telegram.org/";
        }
        edit.apply();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(j));
    }

    private boolean savePremiumFeaturesPreviewOrder(String str, SparseIntArray sparseIntArray, SharedPreferences.Editor editor, ArrayList<TLRPC$JSONValue> arrayList) {
        int serverStringToFeatureType;
        StringBuilder sb = new StringBuilder();
        sparseIntArray.clear();
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            String str2 = arrayList.get(i) instanceof TLRPC$TL_jsonString ? ((TLRPC$TL_jsonString) arrayList.get(i)).value : null;
            if (str2 != null && (serverStringToFeatureType = PremiumPreviewFragment.serverStringToFeatureType(str2)) >= 0) {
                sparseIntArray.put(serverStringToFeatureType, i);
                if (sb.length() > 0) {
                    sb.append('_');
                }
                sb.append(serverStringToFeatureType);
            }
            i++;
        }
        if (sb.length() <= 0) {
            editor.remove(str);
            return this.mainPreferences.getString(str, null) != null;
        }
        String sb2 = sb.toString();
        boolean z = !sb2.equals(this.mainPreferences.getString(str, null));
        editor.putString(str, sb2);
        return z;
    }

    private void saveSavedReactionsTags(final long j, final TLRPC$TL_messages_savedReactionsTags tLRPC$TL_messages_savedReactionsTags) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$saveSavedReactionsTags$443(j, tLRPC$TL_messages_savedReactionsTags);
            }
        });
    }

    private void scheduleTranscriptionUpdate() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$scheduleTranscriptionUpdate$33();
            }
        });
    }

    private void sendLoadPeersRequest(final TLObject tLObject, final ArrayList<TLObject> arrayList, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, final ArrayList<TLRPC$User> arrayList2, final ArrayList<TLRPC$Chat> arrayList3, final ArrayList<DialogFilter> arrayList4, final SparseArray<DialogFilter> sparseArray, final ArrayList<Integer> arrayList5, final HashMap<Integer, HashSet<Long>> hashMap, final HashSet<Integer> hashSet, final Runnable runnable) {
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$sendLoadPeersRequest$16(arrayList3, arrayList2, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, tLObject, arrayList4, sparseArray, arrayList5, hashMap, hashSet, runnable, tLObject2, tLRPC$TL_error);
            }
        });
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

    public static TLRPC$InputDocument toInputDocument(TLRPC$Document tLRPC$Document) {
        TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
        tLRPC$TL_inputDocument.id = tLRPC$Document.id;
        tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
        tLRPC$TL_inputDocument.file_reference = tLRPC$Document.file_reference;
        return tLRPC$TL_inputDocument;
    }

    public static TLRPC$InputMedia toInputMedia(TLRPC$MessageMedia tLRPC$MessageMedia) {
        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument) {
            TLRPC$TL_inputMediaDocument tLRPC$TL_inputMediaDocument = new TLRPC$TL_inputMediaDocument();
            TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
            tLRPC$TL_inputMediaDocument.id = tLRPC$TL_inputDocument;
            TLRPC$Document tLRPC$Document = tLRPC$MessageMedia.document;
            tLRPC$TL_inputDocument.id = tLRPC$Document.id;
            tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
            tLRPC$TL_inputDocument.file_reference = tLRPC$Document.file_reference;
            return tLRPC$TL_inputMediaDocument;
        }
        if (!(tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto)) {
            return null;
        }
        TLRPC$TL_inputMediaPhoto tLRPC$TL_inputMediaPhoto = new TLRPC$TL_inputMediaPhoto();
        TLRPC$TL_inputPhoto tLRPC$TL_inputPhoto = new TLRPC$TL_inputPhoto();
        tLRPC$TL_inputMediaPhoto.id = tLRPC$TL_inputPhoto;
        TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia.photo;
        tLRPC$TL_inputPhoto.id = tLRPC$Photo.id;
        tLRPC$TL_inputPhoto.access_hash = tLRPC$Photo.access_hash;
        tLRPC$TL_inputPhoto.file_reference = tLRPC$Photo.file_reference;
        return tLRPC$TL_inputMediaPhoto;
    }

    private void updatePrintingStrings() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.updatePrintingStrings():void");
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

    public void addDialogAction(long j, boolean z) {
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(j);
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

    public int addDialogToFolder(long j, int i, int i2, long j2) {
        ArrayList<Long> arrayList = new ArrayList<>(1);
        arrayList.add(Long.valueOf(j));
        return addDialogToFolder(arrayList, i, i2, null, j2);
    }

    public int addDialogToFolder(java.util.ArrayList<java.lang.Long> r22, int r23, int r24, java.util.ArrayList<org.telegram.tgnet.TLRPC$TL_inputFolderPeer> r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.addDialogToFolder(java.util.ArrayList, int, int, java.util.ArrayList, long):int");
    }

    public void addFilter(DialogFilter dialogFilter, boolean z) {
        if (z) {
            int size = this.dialogFilters.size();
            int i = 254;
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

    public void addToPollsQueue(long j, ArrayList<MessageObject> arrayList) {
        long min;
        int i;
        SparseArray sparseArray = (SparseArray) this.pollsToCheck.get(j);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            this.pollsToCheck.put(j, sparseArray);
            this.pollsToCheckSize++;
        }
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((MessageObject) sparseArray.valueAt(i2)).pollVisibleOnScreen = false;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int size2 = arrayList.size();
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
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
                MessageObject messageObject2 = (MessageObject) sparseArray.get(id);
                if (messageObject2 != null) {
                    messageObject2.pollVisibleOnScreen = true;
                } else {
                    sparseArray.put(id, messageObject);
                }
            }
        }
        if (z) {
            min = 0;
        } else if (i3 >= 5) {
            return;
        } else {
            min = Math.min(this.lastViewsCheckTime, System.currentTimeMillis() - ((5 - i3) * 1000));
        }
        this.lastViewsCheckTime = min;
    }

    public void addToViewsQueue(final MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$addToViewsQueue$219(messageObject);
            }
        });
    }

    public void addUserToChat(long j, TLRPC$User tLRPC$User, int i, String str, BaseFragment baseFragment, Runnable runnable) {
        addUserToChat(j, tLRPC$User, i, str, baseFragment, false, runnable, null);
    }

    public void addUserToChat(long j, TLRPC$User tLRPC$User, int i, String str, BaseFragment baseFragment, boolean z, Runnable runnable, ErrorDelegate errorDelegate) {
        addUserToChat(j, tLRPC$User, i, str, baseFragment, z, runnable, errorDelegate, null);
    }

    public void addUserToChat(final long j, final TLRPC$User tLRPC$User, int i, String str, final BaseFragment baseFragment, final boolean z, final Runnable runnable, final ErrorDelegate errorDelegate, final Utilities.Callback<TLRPC$TL_messages_invitedUsers> callback) {
        TLRPC$TL_messages_addChatUser tLRPC$TL_messages_addChatUser;
        if (tLRPC$User == null) {
            if (errorDelegate != null) {
                errorDelegate.run(null);
            }
            if (callback != null) {
                callback.run(null);
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
        } else if (this.joiningToChannels.contains(Long.valueOf(j))) {
            if (errorDelegate != null) {
                errorDelegate.run(null);
                return;
            }
            return;
        } else {
            TLRPC$TL_channels_joinChannel tLRPC$TL_channels_joinChannel = new TLRPC$TL_channels_joinChannel();
            tLRPC$TL_channels_joinChannel.channel = getInputChannel(j);
            this.joiningToChannels.add(Long.valueOf(j));
            tLRPC$TL_messages_addChatUser = tLRPC$TL_channels_joinChannel;
        }
        final TLRPC$TL_messages_addChatUser tLRPC$TL_messages_addChatUser3 = tLRPC$TL_messages_addChatUser;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_addChatUser3, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$addUserToChat$288(isChannel, inputUser, j, tLRPC$User, callback, z, runnable, errorDelegate, baseFragment, tLRPC$TL_messages_addChatUser3, z2, tLObject, tLRPC$TL_error);
            }
        });
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
                MessagesController.this.lambda$addUsersToChannel$254(baseFragment, tLRPC$TL_channels_inviteToChannel, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void addUsersToChat(final TLRPC$Chat tLRPC$Chat, BaseFragment baseFragment, ArrayList<TLRPC$User> arrayList, int i, final Consumer consumer, final Consumer consumer2, final Runnable runnable) {
        final int size = arrayList.size();
        final int[] iArr = {0};
        final TLRPC$TL_messages_invitedUsers tLRPC$TL_messages_invitedUsers = new TLRPC$TL_messages_invitedUsers();
        tLRPC$TL_messages_invitedUsers.updates = new TLRPC$TL_updates();
        long j = tLRPC$Chat.id;
        for (int i2 = 0; i2 < size; i2++) {
            final TLRPC$User tLRPC$User = arrayList.get(i2);
            addUserToChat(j, tLRPC$User, i, null, baseFragment, false, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$addUsersToChat$275(Consumer.this, tLRPC$User);
                }
            }, new ErrorDelegate() {
                @Override
                public final boolean run(TLRPC$TL_error tLRPC$TL_error) {
                    boolean lambda$addUsersToChat$276;
                    lambda$addUsersToChat$276 = MessagesController.lambda$addUsersToChat$276(Consumer.this, tLRPC$User, tLRPC$TL_error);
                    return lambda$addUsersToChat$276;
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    MessagesController.this.lambda$addUsersToChat$278(tLRPC$TL_messages_invitedUsers, iArr, size, tLRPC$Chat, runnable, (TLRPC$TL_messages_invitedUsers) obj);
                }
            });
            putUser(tLRPC$User, false);
        }
    }

    public Boolean arePaidReactionsAnonymous() {
        if (this.paidReactionsAnonymous == null && !this.loadingArePaidReactionsAnonymous) {
            this.loadingArePaidReactionsAnonymous = true;
            getConnectionsManager().sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                    return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(1193563562);
                }
            }, null);
        }
        return this.paidReactionsAnonymous;
    }

    public void blockPeer(long j) {
        TLRPC$Chat chat;
        TLRPC$User tLRPC$User = null;
        if (j > 0) {
            TLRPC$User user = getUser(Long.valueOf(j));
            if (user == null) {
                return;
            }
            tLRPC$User = user;
            chat = null;
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
        tLRPC$TL_contacts_block.id = tLRPC$User != null ? getInputPeer(tLRPC$User) : getInputPeer(chat);
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_block, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$blockPeer$83(tLObject, tLRPC$TL_error);
            }
        });
    }

    public boolean canAddToForward(TLRPC$Dialog tLRPC$Dialog) {
        if (tLRPC$Dialog == null) {
            return false;
        }
        if (!DialogObject.isEncryptedDialog(tLRPC$Dialog.id) && DialogObject.isChannel(tLRPC$Dialog)) {
            TLRPC$Chat chat = getChat(Long.valueOf(-tLRPC$Dialog.id));
            if (chat == null || !chat.megagroup) {
                if (!ChatObject.hasAdminRights(chat) || !ChatObject.canPost(chat)) {
                    return false;
                }
            } else if (chat.gigagroup && !ChatObject.hasAdminRights(chat)) {
                return false;
            }
        }
        return true;
    }

    public void cancelLoadFullChat(long j) {
        this.loadingFullChats.remove(Long.valueOf(j));
    }

    public void cancelLoadFullUser(long j) {
        this.loadingFullUsers.remove(Long.valueOf(j));
    }

    public void lambda$sendTyping$164(int i, long j, long j2) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2;
        if (i >= 0) {
            LongSparseArray[] longSparseArrayArr = this.sendingTypings;
            if (i >= longSparseArrayArr.length || (longSparseArray = longSparseArrayArr[i]) == null || (longSparseArray2 = (LongSparseArray) longSparseArray.get(j)) == null) {
                return;
            }
            longSparseArray2.remove(j2);
            if (longSparseArray2.size() == 0) {
                longSparseArray.remove(j);
            }
        }
    }

    public void cancelUploadWallpaper() {
        Theme.OverrideWallpaperInfo overrideWallpaperInfo = this.uploadingWallpaperInfo;
        if (overrideWallpaperInfo != null) {
            if (overrideWallpaperInfo.requestIds != null) {
                for (int i = 0; i < this.uploadingWallpaperInfo.requestIds.size(); i++) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) this.uploadingWallpaperInfo.requestIds.get(i)).intValue(), true);
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

    public void changeChatAvatar(final long j, final TLRPC$TL_inputChatPhoto tLRPC$TL_inputChatPhoto, TLRPC$InputFile tLRPC$InputFile, TLRPC$InputFile tLRPC$InputFile2, TLRPC$VideoSize tLRPC$VideoSize, double d, final String str, final TLRPC$FileLocation tLRPC$FileLocation, final TLRPC$FileLocation tLRPC$FileLocation2, final Runnable runnable) {
        MessagesController messagesController;
        TLRPC$InputChatPhoto tLRPC$InputChatPhoto;
        TLRPC$TL_messages_editChatPhoto tLRPC$TL_messages_editChatPhoto;
        if (tLRPC$TL_inputChatPhoto != null) {
            messagesController = this;
            tLRPC$InputChatPhoto = tLRPC$TL_inputChatPhoto;
        } else if (tLRPC$InputFile == null && tLRPC$InputFile2 == null && tLRPC$VideoSize == null) {
            tLRPC$InputChatPhoto = new TLRPC$InputChatPhoto() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(480546647);
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
                int i = tLRPC$TL_inputChatUploadedPhoto.flags;
                tLRPC$TL_inputChatUploadedPhoto.video_start_ts = d;
                tLRPC$TL_inputChatUploadedPhoto.flags = i | 6;
            }
            if (tLRPC$VideoSize != null) {
                tLRPC$TL_inputChatUploadedPhoto.video_emoji_markup = tLRPC$VideoSize;
                tLRPC$TL_inputChatUploadedPhoto.flags |= 8;
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
                MessagesController.this.lambda$changeChatAvatar$297(tLRPC$TL_inputChatPhoto, tLRPC$FileLocation, tLRPC$FileLocation2, str, j, runnable, tLObject, tLRPC$TL_error);
            }
        }, 64);
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
                MessagesController.this.lambda$changeChatTitle$295(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void checkArchiveFolder() {
        if (this.hasArchivedChats || getStoriesController().hasHiddenStories()) {
            boolean[] zArr = {false};
            ensureFolderDialogExists(1, zArr);
            if (zArr[0]) {
                sortDialogs(null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
        } else {
            removeFolder(1);
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
    }

    public boolean checkCanOpenChat(Bundle bundle, BaseFragment baseFragment) {
        return checkCanOpenChat(bundle, baseFragment, null);
    }

    public boolean checkCanOpenChat(Bundle bundle, BaseFragment baseFragment, MessageObject messageObject) {
        return checkCanOpenChat(bundle, baseFragment, messageObject, null);
    }

    public boolean checkCanOpenChat(final Bundle bundle, final BaseFragment baseFragment, MessageObject messageObject, final Browser.Progress progress) {
        TLRPC$User tLRPC$User;
        TLRPC$Chat tLRPC$Chat;
        ArrayList arrayList;
        TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages;
        if (bundle != null && baseFragment != null) {
            long j = bundle.getLong("user_id", 0L);
            long j2 = bundle.getLong("chat_id", 0L);
            int i = bundle.getInt("message_id", 0);
            AlertDialog alertDialog = null;
            if (j != 0) {
                tLRPC$User = getUser(Long.valueOf(j));
                tLRPC$Chat = null;
            } else if (j2 != 0) {
                tLRPC$Chat = getChat(Long.valueOf(j2));
                tLRPC$User = null;
            } else {
                tLRPC$User = null;
                tLRPC$Chat = null;
            }
            if (tLRPC$User == null && tLRPC$Chat == null) {
                return true;
            }
            String restrictionReason = getRestrictionReason(tLRPC$Chat != null ? tLRPC$Chat.restriction_reason : tLRPC$User.restriction_reason);
            if (restrictionReason != null) {
                showCantOpenAlert(baseFragment, restrictionReason);
                return false;
            }
            if (i != 0 && messageObject != null && tLRPC$Chat != null && tLRPC$Chat.access_hash == 0) {
                long dialogId = messageObject.getDialogId();
                if (!DialogObject.isEncryptedDialog(dialogId)) {
                    if (progress != null) {
                        progress.init();
                    } else {
                        alertDialog = new AlertDialog(baseFragment.getParentActivity(), 3);
                    }
                    final AlertDialog alertDialog2 = alertDialog;
                    if (dialogId < 0) {
                        tLRPC$Chat = getChat(Long.valueOf(-dialogId));
                    }
                    if (dialogId > 0 || !ChatObject.isChannel(tLRPC$Chat)) {
                        TLRPC$TL_messages_getMessages tLRPC$TL_messages_getMessages2 = new TLRPC$TL_messages_getMessages();
                        arrayList = tLRPC$TL_messages_getMessages2.id;
                        tLRPC$TL_messages_getMessages = tLRPC$TL_messages_getMessages2;
                    } else {
                        TLRPC$Chat chat = getChat(Long.valueOf(-dialogId));
                        TLRPC$TL_channels_getMessages tLRPC$TL_channels_getMessages = new TLRPC$TL_channels_getMessages();
                        tLRPC$TL_channels_getMessages.channel = getInputChannel(chat);
                        arrayList = tLRPC$TL_channels_getMessages.id;
                        tLRPC$TL_messages_getMessages = tLRPC$TL_channels_getMessages;
                    }
                    arrayList.add(Integer.valueOf(messageObject.getId()));
                    final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_getMessages, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$checkCanOpenChat$406(alertDialog2, progress, baseFragment, bundle, tLObject, tLRPC$TL_error);
                        }
                    });
                    if (alertDialog2 != null) {
                        alertDialog2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                MessagesController.this.lambda$checkCanOpenChat$407(sendRequest, baseFragment, dialogInterface);
                            }
                        });
                        baseFragment.setVisibleDialog(alertDialog2);
                        alertDialog2.show();
                    } else {
                        progress.onCancel(new Runnable() {
                            @Override
                            public final void run() {
                                MessagesController.this.lambda$checkCanOpenChat$408(sendRequest, baseFragment);
                            }
                        });
                        progress.init();
                    }
                    return false;
                }
            } else if (i != 0 && messageObject != null && progress != null) {
                progress.init();
                progress.onCancel(ensureMessagesLoaded(-j2, i, new MessagesLoadedCallback() {
                    final Bundle val$bundle;
                    final BaseFragment val$fragment;
                    final Browser.Progress val$progress;

                    AnonymousClass2(final Browser.Progress progress2, final BaseFragment baseFragment2, final Bundle bundle2) {
                        r2 = progress2;
                        r3 = baseFragment2;
                        r4 = bundle2;
                    }

                    @Override
                    public void onError() {
                        r2.end();
                        r3.presentFragment(new ChatActivity(r4));
                    }

                    @Override
                    public void onMessagesLoaded(boolean z) {
                        r2.end();
                        r3.presentFragment(new ChatActivity(r4));
                    }
                }));
                return false;
            }
        }
        return true;
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
                MessagesController.this.lambda$checkChatInviter$353(chat, z, j, tLObject, tLRPC$TL_error);
            }
        });
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
                MessagesController.this.lambda$checkChatlistFolderUpdate$432(i, chatlistUpdatesStat, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void checkIfFolderEmpty(int i) {
        if (i == 0) {
            return;
        }
        getMessagesStorage().checkIfFolderEmpty(i);
    }

    public void checkIsInChat(boolean z, TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, final IsInChatCheckedCallback isInChatCheckedCallback) {
        TLRPC$ChatFull chatFull;
        TLRPC$ChatParticipant tLRPC$ChatParticipant;
        ArrayList arrayList;
        TLRPC$ChatParticipant tLRPC$ChatParticipant2;
        ArrayList arrayList2;
        if (tLRPC$Chat == null || tLRPC$User == null) {
            if (isInChatCheckedCallback != null) {
                isInChatCheckedCallback.run(false, null, null);
                return;
            }
            return;
        }
        if (tLRPC$Chat.megagroup || ChatObject.isChannel(tLRPC$Chat)) {
            if (z && (chatFull = getChatFull(tLRPC$Chat.id)) != null) {
                TLRPC$ChatParticipants tLRPC$ChatParticipants = chatFull.participants;
                if (tLRPC$ChatParticipants != null && (arrayList = tLRPC$ChatParticipants.participants) != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        tLRPC$ChatParticipant = (TLRPC$ChatParticipant) chatFull.participants.participants.get(i);
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
                    MessagesController.lambda$checkIsInChat$427(MessagesController.IsInChatCheckedCallback.this, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
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
                tLRPC$ChatParticipant2 = (TLRPC$ChatParticipant) chatFull2.participants.participants.get(i2);
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

    public void checkLastDialogMessage(final TLRPC$Dialog tLRPC$Dialog, TLRPC$InputPeer tLRPC$InputPeer, final long j) {
        Exception e;
        NativeByteBuffer nativeByteBuffer;
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
                e = e2;
                nativeByteBuffer = null;
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
                        MessagesController.this.lambda$checkLastDialogMessage$216(tLRPC$Dialog, j, tLObject, tLRPC$TL_error);
                    }
                });
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$checkLastDialogMessage$216(tLRPC$Dialog, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void checkPeerColors(boolean z) {
        PeerColors peerColors;
        if (getUserConfig().getCurrentUser() == null) {
            return;
        }
        if (!this.loadingPeerColors && ((peerColors = this.peerColors) == null || peerColors.needUpdate() || z)) {
            this.loadingPeerColors = true;
            TLRPC$TL_help_getPeerColors tLRPC$TL_help_getPeerColors = new TLRPC$TL_help_getPeerColors();
            PeerColors peerColors2 = this.peerColors;
            tLRPC$TL_help_getPeerColors.hash = peerColors2 != null ? peerColors2.hash : 0;
            if (peerColors2 != null && peerColors2.needUpdate()) {
                tLRPC$TL_help_getPeerColors.hash = 0;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_help_getPeerColors, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkPeerColors$445(tLObject, tLRPC$TL_error);
                }
            });
        }
        if (this.loadingProfilePeerColors) {
            return;
        }
        PeerColors peerColors3 = this.profilePeerColors;
        if (peerColors3 == null || peerColors3.needUpdate() || z) {
            this.loadingProfilePeerColors = true;
            TLRPC$TL_help_getPeerProfileColors tLRPC$TL_help_getPeerProfileColors = new TLRPC$TL_help_getPeerProfileColors();
            PeerColors peerColors4 = this.profilePeerColors;
            tLRPC$TL_help_getPeerProfileColors.hash = peerColors4 != null ? peerColors4.hash : 0;
            if (peerColors4 != null && peerColors4.needUpdate()) {
                tLRPC$TL_help_getPeerProfileColors.hash = 0;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_help_getPeerProfileColors, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$checkPeerColors$447(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void checkPromoInfo(final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkPromoInfo$155(z);
            }
        });
    }

    public void checkSensitive(final BaseFragment baseFragment, final long j, final Runnable runnable, final Runnable runnable2) {
        TLRPC$User user;
        ArrayList<TLRPC$RestrictionReason> arrayList = null;
        if (j < 0) {
            TLRPC$Chat chat = getChat(Long.valueOf(-j));
            if (chat != null) {
                arrayList = chat.restriction_reason;
            }
        } else if (j >= 0 && (user = getUser(Long.valueOf(j))) != null) {
            arrayList = user.restriction_reason;
        }
        if (!isSensitive(arrayList) || this.sensitiveAgreed.contains(Long.valueOf(j))) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            final AlertDialog alertDialog = new AlertDialog(baseFragment.getContext(), 3);
            alertDialog.showDelayed(200L);
            getContentSettings(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    MessagesController.this.lambda$checkSensitive$404(alertDialog, baseFragment, j, runnable, runnable2, (TL_account$contentSettings) obj);
                }
            });
        }
    }

    public void checkUnreadReactions(final long j, final long j2, final SparseBooleanArray sparseBooleanArray) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$checkUnreadReactions$391(sparseBooleanArray, j2, j);
            }
        });
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
                Integer parseInt = Utilities.parseInt((CharSequence) key);
                int intValue = parseInt.intValue();
                if (editor == null) {
                    editor = sharedPreferences.edit();
                    appWidgetManager = AppWidgetManager.getInstance(ApplicationLoader.applicationContext);
                }
                editor.putBoolean("deleted" + intValue, true);
                if (sharedPreferences.getInt("type" + intValue, 0) == 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parseInt);
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(parseInt);
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
        this.lastQuickReplyServerQueryTime.clear();
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
        this.dialogsLoadedTillDate = Integer.MAX_VALUE;
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
                MessagesController.this.lambda$cleanup$47();
            }
        });
        this.createdDialogMainThreadIds.clear();
        this.visibleDialogMainThreadIds.clear();
        this.visibleScheduledDialogMainThreadIds.clear();
        this.blockePeers.clear();
        int i3 = 0;
        while (true) {
            LongSparseArray[] longSparseArrayArr = this.sendingTypings;
            if (i3 >= longSparseArrayArr.length) {
                break;
            }
            LongSparseArray longSparseArray = longSparseArrayArr[i3];
            if (longSparseArray != null) {
                longSparseArray.clear();
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
                MessagesController.this.lambda$cleanup$48();
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
                MessagesController.this.lambda$cleanup$49();
            }
        });
    }

    public void clearFullUsers() {
        this.loadedFullUsers.clear();
        this.loadedFullChats.clear();
    }

    public void clearQueryTime() {
        this.lastServerQueryTime.clear();
        this.lastScheduledServerQueryTime.clear();
        this.lastQuickReplyServerQueryTime.clear();
        this.lastSavedServerQueryTime.clear();
    }

    public void clearSendAsPeers() {
        this.sendAsPeers.clear();
    }

    public void completeDialogsReset(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, int i, int i2, final int i3, final int i4, final int i5, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2, TLRPC$Message tLRPC$Message) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$completeDialogsReset$201(i3, i4, i5, tLRPC$messages_Dialogs, longSparseArray, longSparseArray2);
            }
        });
    }

    public void convertToGigaGroup(final Context context, TLRPC$Chat tLRPC$Chat, final BaseFragment baseFragment, final MessagesStorage.BooleanCallback booleanCallback) {
        final TLRPC$TL_channels_convertToGigagroup tLRPC$TL_channels_convertToGigagroup = new TLRPC$TL_channels_convertToGigagroup();
        tLRPC$TL_channels_convertToGigagroup.channel = getInputChannel(tLRPC$Chat);
        AlertDialog alertDialog = context != null ? new AlertDialog(context, 3) : null;
        final AlertDialog alertDialog2 = alertDialog;
        final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_channels_convertToGigagroup, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$convertToGigaGroup$250(context, alertDialog2, booleanCallback, baseFragment, tLRPC$TL_channels_convertToGigagroup, tLObject, tLRPC$TL_error);
            }
        });
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    MessagesController.this.lambda$convertToGigaGroup$251(sendRequest, dialogInterface);
                }
            });
            try {
                alertDialog.showDelayed(400L);
            } catch (Exception unused) {
            }
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
                MessagesController.this.lambda$convertToMegaGroup$245(context, alertDialog, longCallback, j, runnable, baseFragment, tLRPC$TL_messages_migrateChat, tLObject, tLRPC$TL_error);
            }
        });
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    MessagesController.this.lambda$convertToMegaGroup$246(sendRequest, dialogInterface);
                }
            });
            try {
                alertDialog.show();
            } catch (Exception unused) {
            }
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
                    MessagesController.this.lambda$createChat$238(baseFragment, tLRPC$TL_messages_createChat, tLObject, tLRPC$TL_error);
                }
            }, 2);
        }
        if (!z && i != 2 && i != 4 && i != 5) {
            return 0;
        }
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
                MessagesController.this.lambda$createChat$241(baseFragment, tLRPC$TL_channels_createChannel, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public long createDeleteShowOnceTask(long j, int i) {
        NativeByteBuffer nativeByteBuffer;
        try {
            nativeByteBuffer = new NativeByteBuffer(16);
        } catch (Exception e) {
            e = e;
            nativeByteBuffer = null;
        }
        try {
            nativeByteBuffer.writeInt32(102);
            nativeByteBuffer.writeInt64(j);
            nativeByteBuffer.writeInt32(i);
        } catch (Exception e2) {
            e = e2;
            FileLog.e(e);
            return getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        return getMessagesStorage().createPendingTask(nativeByteBuffer);
    }

    public void deleteDialog(long j, int i) {
        deleteDialog(j, i, false);
    }

    public void deleteDialog(final long r32, int r34, final int r35, int r36, final boolean r37, final org.telegram.tgnet.TLRPC$InputPeer r38, final long r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.deleteDialog(long, int, int, int, boolean, org.telegram.tgnet.TLRPC$InputPeer, long):void");
    }

    public void deleteDialog(long j, int i, boolean z) {
        deleteDialog(j, 1, i, 0, z, null, 0L);
    }

    public void deleteMessages(ArrayList<Integer> arrayList, ArrayList<Long> arrayList2, TLRPC$EncryptedChat tLRPC$EncryptedChat, long j, int i, boolean z, int i2) {
        deleteMessages(arrayList, arrayList2, tLRPC$EncryptedChat, j, z, i2, false, 0L, null, i);
    }

    public void deleteMessages(ArrayList<Integer> arrayList, ArrayList<Long> arrayList2, TLRPC$EncryptedChat tLRPC$EncryptedChat, long j, int i, boolean z, int i2, boolean z2) {
        deleteMessages(arrayList, arrayList2, tLRPC$EncryptedChat, j, z, i2, z2, 0L, null, i);
    }

    public void deleteMessages(java.util.ArrayList<java.lang.Integer> r27, java.util.ArrayList<java.lang.Long> r28, org.telegram.tgnet.TLRPC$EncryptedChat r29, long r30, boolean r32, int r33, boolean r34, long r35, org.telegram.tgnet.TLObject r37, int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.deleteMessages(java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$EncryptedChat, long, boolean, int, boolean, long, org.telegram.tgnet.TLObject, int):void");
    }

    public void deleteMessagesByPush(final long j, final ArrayList<Integer> arrayList, final long j2) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteMessagesByPush$348(arrayList, j2, j);
            }
        });
    }

    public void deleteMessagesRange(final long j, final long j2, final int i, final int i2, final boolean z, final Runnable runnable) {
        TLRPC$TL_messages_deleteHistory tLRPC$TL_messages_deleteHistory = new TLRPC$TL_messages_deleteHistory();
        tLRPC$TL_messages_deleteHistory.peer = getInputPeer(j);
        tLRPC$TL_messages_deleteHistory.flags = 12;
        tLRPC$TL_messages_deleteHistory.min_date = i;
        tLRPC$TL_messages_deleteHistory.max_date = i2;
        tLRPC$TL_messages_deleteHistory.revoke = z;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$deleteMessagesRange$420(j, i, i2, j2, z, runnable, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void deleteParticipantFromChat(long j, TLRPC$InputPeer tLRPC$InputPeer) {
        deleteParticipantFromChat(j, tLRPC$InputPeer, false, false);
    }

    public void deleteParticipantFromChat(long j, TLRPC$InputPeer tLRPC$InputPeer, boolean z, boolean z2) {
        deleteParticipantFromChat(j, tLRPC$InputPeer, z, z2, (Runnable) null);
    }

    public void deleteParticipantFromChat(final long j, TLRPC$InputPeer tLRPC$InputPeer, boolean z, boolean z2, final Runnable runnable) {
        TLRPC$TL_messages_deleteChatUser tLRPC$TL_messages_deleteChatUser;
        TLRPC$TL_messages_deleteChatUser tLRPC$TL_messages_deleteChatUser2;
        if (tLRPC$InputPeer == null) {
            return;
        }
        TLRPC$Chat chat = getChat(Long.valueOf(j));
        boolean z3 = (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerUser) && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(tLRPC$InputPeer.user_id)));
        final boolean isChannel = ChatObject.isChannel(chat);
        if (isChannel) {
            if (z3) {
                if (chat.creator && z) {
                    TLRPC$TL_channels_deleteChannel tLRPC$TL_channels_deleteChannel = new TLRPC$TL_channels_deleteChannel();
                    tLRPC$TL_channels_deleteChannel.channel = getInputChannel(chat);
                    tLRPC$TL_messages_deleteChatUser2 = tLRPC$TL_channels_deleteChannel;
                } else {
                    TLRPC$TL_channels_leaveChannel tLRPC$TL_channels_leaveChannel = new TLRPC$TL_channels_leaveChannel();
                    tLRPC$TL_channels_leaveChannel.channel = getInputChannel(chat);
                    tLRPC$TL_messages_deleteChatUser2 = tLRPC$TL_channels_leaveChannel;
                }
                tLRPC$TL_messages_deleteChatUser = tLRPC$TL_messages_deleteChatUser2;
            } else {
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
            }
        } else if (z) {
            TLRPC$TL_messages_deleteChat tLRPC$TL_messages_deleteChat = new TLRPC$TL_messages_deleteChat();
            tLRPC$TL_messages_deleteChat.chat_id = j;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteChat, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$deleteParticipantFromChat$289(tLObject, tLRPC$TL_error);
                }
            });
            return;
        } else {
            TLRPC$TL_messages_deleteChatUser tLRPC$TL_messages_deleteChatUser3 = new TLRPC$TL_messages_deleteChatUser();
            tLRPC$TL_messages_deleteChatUser3.chat_id = j;
            tLRPC$TL_messages_deleteChatUser3.user_id = getInputUser(tLRPC$InputPeer);
            tLRPC$TL_messages_deleteChatUser3.revoke_history = true;
            tLRPC$TL_messages_deleteChatUser = tLRPC$TL_messages_deleteChatUser3;
        }
        if (z3) {
            deleteDialog(-j, 0, z2);
        }
        final boolean z4 = z3;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteChatUser, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$deleteParticipantFromChat$291(isChannel, z4, j, runnable, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void deleteParticipantFromChat(long j, TLRPC$User tLRPC$User) {
        deleteParticipantFromChat(j, tLRPC$User, (TLRPC$Chat) null, false, false);
    }

    public void deleteParticipantFromChat(final long j, final TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, boolean z, boolean z2) {
        TLRPC$TL_messages_deleteChatUser tLRPC$TL_messages_deleteChatUser;
        if (tLRPC$User == null && tLRPC$Chat == null) {
            return;
        }
        TLRPC$InputPeer inputPeer = tLRPC$User != null ? getInputPeer(tLRPC$User) : getInputPeer(tLRPC$Chat);
        TLRPC$Chat chat = getChat(Long.valueOf(j));
        final boolean isChannel = ChatObject.isChannel(chat);
        if (isChannel) {
            if (!UserObject.isUserSelf(tLRPC$User)) {
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
            } else if (chat.creator && z) {
                TLRPC$TL_channels_deleteChannel tLRPC$TL_channels_deleteChannel = new TLRPC$TL_channels_deleteChannel();
                tLRPC$TL_channels_deleteChannel.channel = getInputChannel(chat);
                tLRPC$TL_messages_deleteChatUser = tLRPC$TL_channels_deleteChannel;
            } else {
                TLRPC$TL_channels_leaveChannel tLRPC$TL_channels_leaveChannel = new TLRPC$TL_channels_leaveChannel();
                tLRPC$TL_channels_leaveChannel.channel = getInputChannel(chat);
                tLRPC$TL_messages_deleteChatUser = tLRPC$TL_channels_leaveChannel;
            }
        } else if (z) {
            TLRPC$TL_messages_deleteChat tLRPC$TL_messages_deleteChat = new TLRPC$TL_messages_deleteChat();
            tLRPC$TL_messages_deleteChat.chat_id = j;
            getConnectionsManager().sendRequest(tLRPC$TL_messages_deleteChat, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$deleteParticipantFromChat$292(tLObject, tLRPC$TL_error);
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
                MessagesController.this.lambda$deleteParticipantFromChat$294(isChannel, tLRPC$User, j, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void deleteSavedDialog(long j) {
        deleteSavedDialog(j, 0);
    }

    protected void deleteSavedDialog(final long j, final int i) {
        final int[] iArr = {i};
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$deleteSavedDialog$135(j, i, iArr);
            }
        };
        if (iArr[0] <= 0) {
            getMessagesStorage().getSavedDialogMaxMessageId(j, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i2) {
                    MessagesController.lambda$deleteSavedDialog$136(iArr, runnable, i2);
                }
            });
        } else {
            runnable.run();
        }
    }

    public void deleteUserChannelHistory(final TLRPC$Chat tLRPC$Chat, final TLRPC$User tLRPC$User, final TLRPC$Chat tLRPC$Chat2, int i) {
        long j = tLRPC$User != null ? tLRPC$User.id : tLRPC$Chat2 != null ? tLRPC$Chat2.id : 0L;
        if (i == 0) {
            getMessagesStorage().deleteUserChatHistory(-tLRPC$Chat.id, j);
        }
        TLRPC$TL_channels_deleteParticipantHistory tLRPC$TL_channels_deleteParticipantHistory = new TLRPC$TL_channels_deleteParticipantHistory();
        tLRPC$TL_channels_deleteParticipantHistory.channel = getInputChannel(tLRPC$Chat);
        tLRPC$TL_channels_deleteParticipantHistory.participant = tLRPC$User != null ? getInputPeer(tLRPC$User) : getInputPeer(tLRPC$Chat2);
        getConnectionsManager().sendRequest(tLRPC$TL_channels_deleteParticipantHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$deleteUserChannelHistory$124(tLRPC$Chat, tLRPC$User, tLRPC$Chat2, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void deleteUserPhoto(TLRPC$InputPhoto tLRPC$InputPhoto) {
        TLRPC$Photo tLRPC$Photo;
        final long clientUserId = getUserConfig().getClientUserId();
        if (tLRPC$InputPhoto != null) {
            TLRPC$TL_photos_deletePhotos tLRPC$TL_photos_deletePhotos = new TLRPC$TL_photos_deletePhotos();
            tLRPC$TL_photos_deletePhotos.id.add(tLRPC$InputPhoto);
            getDialogPhotos(clientUserId).removePhoto(tLRPC$InputPhoto.id);
            getConnectionsManager().sendRequest(tLRPC$TL_photos_deletePhotos, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$deleteUserPhoto$111(tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
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
                MessagesController.this.lambda$deleteUserPhoto$110(clientUserId, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void didAddedNewTask(final int i, final long j, final SparseArray<ArrayList<Integer>> sparseArray) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$didAddedNewTask$75(i);
            }
        });
        if (sparseArray != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$didAddedNewTask$76(j, sparseArray);
                }
            });
        }
    }

    public boolean didPressTranscribeButtonEnough() {
        return this.transcribeButtonPressed >= 2;
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
            if (str2 == null || !str2.equals(str)) {
                String str3 = this.uploadingWallpaper;
                if (str3 == null || !str3.equals(str)) {
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
                            if (TextUtils.isEmpty(themeAccent.patternSlug)) {
                                TLRPC$TL_inputWallPaperNoFile tLRPC$TL_inputWallPaperNoFile = new TLRPC$TL_inputWallPaperNoFile();
                                tLRPC$TL_inputWallPaperNoFile.id = 0L;
                                tLRPC$TL_inputThemeSettings.wallpaper = tLRPC$TL_inputWallPaperNoFile;
                            } else {
                                TLRPC$TL_inputWallPaperSlug tLRPC$TL_inputWallPaperSlug = new TLRPC$TL_inputWallPaperSlug();
                                tLRPC$TL_inputWallPaperSlug.slug = themeAccent.patternSlug;
                                tLRPC$TL_inputThemeSettings.wallpaper = tLRPC$TL_inputWallPaperSlug;
                                TLRPC$WallPaperSettings tLRPC$WallPaperSettings = tLRPC$TL_inputThemeSettings.wallpaper_settings;
                                tLRPC$WallPaperSettings.intensity = (int) (themeAccent.patternIntensity * 100.0f);
                                tLRPC$WallPaperSettings.flags |= 8;
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
                                MessagesController.this.lambda$didReceivedNotification$46(tLRPC$TL_theme2, themeInfo, tLRPC$TL_inputThemeSettings2, themeAccent, tLObject, tLRPC$TL_error);
                            }
                        });
                    }
                } else {
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
                    overrideWallpaperInfo2.requestIds = new ArrayList();
                    this.uploadingWallpaperInfo.requestIds.add(Integer.valueOf(getConnectionsManager().sendRequest(tLRPC$TL_account_uploadWallPaper, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$didReceivedNotification$40(overrideWallpaperInfo, tLRPC$TL_wallPaperSettings, str4, tLObject, tLRPC$TL_error);
                        }
                    })));
                }
            } else {
                TLRPC$TL_photos_uploadProfilePhoto tLRPC$TL_photos_uploadProfilePhoto = new TLRPC$TL_photos_uploadProfilePhoto();
                tLRPC$TL_photos_uploadProfilePhoto.file = tLRPC$InputFile3;
                tLRPC$TL_photos_uploadProfilePhoto.flags |= 1;
                getConnectionsManager().sendRequest(tLRPC$TL_photos_uploadProfilePhoto, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$didReceivedNotification$38(tLObject, tLRPC$TL_error);
                    }
                });
            }
        } else if (i == NotificationCenter.fileUploadFailed) {
            String str5 = (String) objArr[0];
            String str6 = this.uploadingAvatar;
            if (str6 == null || !str6.equals(str5)) {
                String str7 = this.uploadingWallpaper;
                if (str7 == null || !str7.equals(str5)) {
                    Object remove = this.uploadingThemes.remove(str5);
                    if (remove instanceof Theme.ThemeInfo) {
                        Theme.ThemeInfo themeInfo3 = (Theme.ThemeInfo) remove;
                        themeInfo3.uploadedFile = null;
                        themeInfo3.uploadedThumb = null;
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeInfo3, null);
                    } else if (remove instanceof Theme.ThemeAccent) {
                        Theme.ThemeAccent themeAccent3 = (Theme.ThemeAccent) remove;
                        themeAccent3.uploadingThumb = null;
                        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeUploadError, themeAccent3.parentTheme, themeAccent3);
                    }
                } else {
                    this.uploadingWallpaper = null;
                    this.uploadingWallpaperInfo = null;
                }
            } else {
                this.uploadingAvatar = null;
            }
        }
        if (i == NotificationCenter.fileUploadProgressChanged) {
            String str8 = (String) objArr[0];
            String str9 = this.uploadingWallpaper;
            if (str9 == null || !str9.equals(str8)) {
                return;
            }
            this.uploadingWallpaperInfo.uploadingProgress = ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue());
            return;
        }
        if (i != NotificationCenter.messageReceivedByServer) {
            if (i != NotificationCenter.updateMessageMedia) {
                if (i == NotificationCenter.currentUserPremiumStatusChanged) {
                    loadAppConfig(false);
                    getContactsController().reloadContactsStatusesMaybe(true);
                    if ((!this.storyQualityFull || getUserConfig().isPremium()) && !getUserConfig().isPremium()) {
                        return;
                    }
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyQualityUpdate, new Object[0]);
                    return;
                }
                return;
            }
            TLRPC$Message tLRPC$Message = (TLRPC$Message) objArr[0];
            if (tLRPC$Message.peer_id.channel_id != 0 || (messageObject = this.dialogMessagesByIds.get(tLRPC$Message.id)) == null) {
                return;
            }
            messageObject.messageOwner.media = MessageObject.getMedia(tLRPC$Message);
            if (MessageObject.getMedia(tLRPC$Message).ttl_seconds != 0) {
                if ((MessageObject.getMedia(tLRPC$Message).photo instanceof TLRPC$TL_photoEmpty) || (MessageObject.getMedia(tLRPC$Message).document instanceof TLRPC$TL_documentEmpty)) {
                    messageObject.setType();
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
                    return;
                }
                return;
            }
            return;
        }
        if (((Boolean) objArr[6]).booleanValue()) {
            return;
        }
        Integer num = (Integer) objArr[0];
        Integer num2 = (Integer) objArr[1];
        Long l = (Long) objArr[3];
        ArrayList arrayList = (ArrayList) this.dialogMessage.get(l.longValue());
        for (int i8 = 0; arrayList != null && i8 < arrayList.size(); i8++) {
            MessageObject messageObject2 = (MessageObject) arrayList.get(i8);
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
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(l.longValue());
        if (tLRPC$Dialog != null && tLRPC$Dialog.top_message == num.intValue()) {
            tLRPC$Dialog.top_message = num2.intValue();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
        if (DialogObject.isChatDialog(l.longValue())) {
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) this.fullChats.get(-l.longValue());
            TLRPC$Chat chat = getChat(Long.valueOf(-l.longValue()));
            if (chat == null || ChatObject.hasAdminRights(chat) || tLRPC$ChatFull == null || tLRPC$ChatFull.slowmode_seconds == 0) {
                return;
            }
            tLRPC$ChatFull.slowmode_next_send_date = getConnectionsManager().getCurrentTime() + tLRPC$ChatFull.slowmode_seconds;
            tLRPC$ChatFull.flags |= 262144;
            getMessagesStorage().updateChatInfo(tLRPC$ChatFull, false);
        }
    }

    public void disableAds(boolean z) {
        TLRPC$UserFull userFull = getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            return;
        }
        userFull.sponsored_enabled = false;
        getMessagesStorage().updateUserInfo(userFull, false);
        if (z) {
            TLRPC$TL_account_toggleSponsoredMessages tLRPC$TL_account_toggleSponsoredMessages = new TLRPC$TL_account_toggleSponsoredMessages();
            tLRPC$TL_account_toggleSponsoredMessages.enabled = false;
            getConnectionsManager().sendRequest(tLRPC$TL_account_toggleSponsoredMessages, null);
        }
    }

    public void lambda$checkDeletingTask$78(long j, long j2, int i) {
        getMessagesStorage().removePendingTask(j);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(i));
        getMessagesStorage().emptyMessagesMedia(j2, arrayList);
    }

    public TLRPC$TL_dialogFolder ensureFolderDialogExists(int i, boolean[] zArr) {
        if (i == 0) {
            return null;
        }
        long makeFolderDialogId = DialogObject.makeFolderDialogId(i);
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(makeFolderDialogId);
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
        tLRPC$TL_folder.title = LocaleController.getString(R.string.ArchivedChats);
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

    public Runnable ensureMessagesLoaded(final long j, int i, final MessagesLoadedCallback messagesLoadedCallback) {
        int i2;
        int i3;
        Timer timer;
        long j2;
        long j3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        long j4;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        int i13;
        boolean z4;
        boolean z5;
        boolean z6;
        MessagesController messagesController;
        long j5;
        int i14;
        SharedPreferences notificationsSettings = getNotificationsSettings(this.currentAccount);
        if (i == 0) {
            i2 = notificationsSettings.getInt("diditem" + j, 0);
        } else {
            i2 = i;
        }
        int generateClassGuid = ConnectionsManager.generateClassGuid();
        final long j6 = DialogObject.isChatDialog(j) ? -j : 0L;
        if (j6 != 0 && getMessagesController().getChat(Long.valueOf(j6)) == null) {
            final boolean[] zArr = new boolean[1];
            final Runnable[] runnableArr = new Runnable[1];
            final MessagesStorage messagesStorage = getMessagesStorage();
            final int i15 = i2;
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$ensureMessagesLoaded$414(zArr, messagesStorage, j6, runnableArr, j, i15, messagesLoadedCallback);
                }
            });
            return new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$ensureMessagesLoaded$415(zArr, runnableArr);
                }
            };
        }
        int i16 = AndroidUtilities.isTablet() ? 30 : 20;
        AnonymousClass3 anonymousClass3 = new NotificationCenter.NotificationCenterDelegate() {
            final MessagesLoadedCallback val$callback;
            final int val$classGuid;
            final int val$count;
            final long val$dialogId;
            final int val$finalMessageId;

            AnonymousClass3(int generateClassGuid2, int i162, int i22, final long j7, final MessagesLoadedCallback messagesLoadedCallback2) {
                r2 = generateClassGuid2;
                r3 = i162;
                r4 = i22;
                r5 = j7;
                r7 = messagesLoadedCallback2;
            }

            @Override
            public void didReceivedNotification(int i17, int i22, Object... objArr) {
                int i32 = NotificationCenter.messagesDidLoadWithoutProcess;
                if (i17 != i32 || ((Integer) objArr[0]).intValue() != r2) {
                    int i42 = NotificationCenter.loadingMessagesFailed;
                    if (i17 == i42 && ((Integer) objArr[0]).intValue() == r2) {
                        MessagesController.this.getNotificationCenter().removeObserver(this, i32);
                        MessagesController.this.getNotificationCenter().removeObserver(this, i42);
                        MessagesLoadedCallback messagesLoadedCallback2 = r7;
                        if (messagesLoadedCallback2 != null) {
                            messagesLoadedCallback2.onError();
                            return;
                        }
                        return;
                    }
                    return;
                }
                int intValue = ((Integer) objArr[1]).intValue();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
                int intValue2 = ((Integer) objArr[4]).intValue();
                int i52 = r3;
                if (intValue < i52 / 2 && !booleanValue2 && booleanValue) {
                    int i62 = r4;
                    MessagesController.this.loadMessagesInternal(r5, 0L, false, i52, i62, 0, false, 0, r2, i62 != 0 ? 3 : 2, intValue2, 0, 0L, -1, 0, 0, 0, false, 0, true, false, false, null, 0L);
                    return;
                }
                MessagesController.this.getNotificationCenter().removeObserver(this, i32);
                MessagesController.this.getNotificationCenter().removeObserver(this, NotificationCenter.loadingMessagesFailed);
                MessagesLoadedCallback messagesLoadedCallback22 = r7;
                if (messagesLoadedCallback22 != null) {
                    messagesLoadedCallback22.onMessagesLoaded(booleanValue);
                }
            }
        };
        getNotificationCenter().addObserver(anonymousClass3, NotificationCenter.messagesDidLoadWithoutProcess);
        getNotificationCenter().addObserver(anonymousClass3, NotificationCenter.loadingMessagesFailed);
        if (i22 != 0) {
            timer = null;
            j2 = 0;
            j3 = 0;
            z = true;
            i4 = 0;
            z2 = true;
            i5 = 0;
            i6 = 3;
            i7 = 0;
            i8 = 0;
            j4 = 0;
            i9 = -1;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z3 = false;
            i13 = 0;
            z4 = true;
            z5 = false;
            z6 = false;
            messagesController = this;
            j5 = j7;
            i14 = i162;
            i3 = generateClassGuid2;
        } else {
            i3 = generateClassGuid2;
            timer = null;
            j2 = 0;
            j3 = 0;
            z = true;
            i4 = 0;
            z2 = true;
            i5 = 0;
            i6 = 2;
            i7 = 0;
            i8 = 0;
            j4 = 0;
            i9 = -1;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z3 = false;
            i13 = 0;
            z4 = true;
            z5 = false;
            z6 = false;
            messagesController = this;
            j5 = j7;
            i14 = i162;
        }
        messagesController.loadMessagesInternal(j5, j3, z, i14, i22, i4, z2, i5, i3, i6, i7, i8, j4, i9, i10, i11, i12, z3, i13, z4, z5, z6, timer, j2);
        final int i17 = i3;
        return new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$ensureMessagesLoaded$416(i17);
            }
        };
    }

    public ArrayList<TLRPC$TL_messages_stickerSet> filterPremiumStickers(ArrayList<TLRPC$TL_messages_stickerSet> arrayList) {
        if (!premiumFeaturesBlocked()) {
            return arrayList;
        }
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

    public TLRPC$TL_messages_stickerSet filterPremiumStickers(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2;
        Exception e;
        if (!premiumFeaturesBlocked() || tLRPC$TL_messages_stickerSet == null) {
            return tLRPC$TL_messages_stickerSet;
        }
        int i = 0;
        for (int i2 = 0; i2 < tLRPC$TL_messages_stickerSet.documents.size(); i2++) {
            try {
            } catch (Exception e2) {
                tLRPC$TL_messages_stickerSet2 = tLRPC$TL_messages_stickerSet;
                e = e2;
            }
            if (MessageObject.isPremiumSticker((TLRPC$Document) tLRPC$TL_messages_stickerSet.documents.get(i2))) {
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLRPC$TL_messages_stickerSet.getObjectSize());
                tLRPC$TL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                nativeByteBuffer.position(0);
                tLRPC$TL_messages_stickerSet2 = new TLRPC$TL_messages_stickerSet();
                nativeByteBuffer.readInt32(true);
                tLRPC$TL_messages_stickerSet2.readParams(nativeByteBuffer, true);
                nativeByteBuffer.reuse();
                while (i < tLRPC$TL_messages_stickerSet2.documents.size()) {
                    try {
                        if (MessageObject.isPremiumSticker((TLRPC$Document) tLRPC$TL_messages_stickerSet2.documents.get(i))) {
                            tLRPC$TL_messages_stickerSet2.documents.remove(i);
                            tLRPC$TL_messages_stickerSet2.packs.remove(i);
                            i--;
                            if (tLRPC$TL_messages_stickerSet2.documents.isEmpty()) {
                                return null;
                            }
                        }
                        i++;
                    } catch (Exception e3) {
                        e = e3;
                        e.printStackTrace();
                        return tLRPC$TL_messages_stickerSet2;
                    }
                }
                return tLRPC$TL_messages_stickerSet2;
            }
        }
        return tLRPC$TL_messages_stickerSet;
    }

    public void forceResetDialogs() {
        resetDialogs(true, getMessagesStorage().getLastSeqValue(), getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue());
        getNotificationsController().deleteAllNotificationChannels();
    }

    public void generateJoinMessage(final long j, boolean z) {
        TLRPC$Chat chat = getChat(Long.valueOf(j));
        if (chat == null || !ChatObject.isChannel(j, this.currentAccount)) {
            return;
        }
        if ((!ChatObject.isNotInChat(chat) || z) && !chat.creator) {
            TLRPC$TL_messageService tLRPC$TL_messageService = new TLRPC$TL_messageService();
            tLRPC$TL_messageService.flags = 256;
            int newMessageId = getUserConfig().getNewMessageId();
            tLRPC$TL_messageService.id = newMessageId;
            tLRPC$TL_messageService.local_id = newMessageId;
            tLRPC$TL_messageService.date = (!(chat instanceof TLRPC$TL_channel) || z) ? getConnectionsManager().getCurrentTime() : chat.date;
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
            getMessagesStorage().putMessages(arrayList2, true, true, false, 0, 0, 0L);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$generateJoinMessage$346(j, arrayList);
                }
            });
        }
    }

    public int getAboutLimit() {
        return getUserConfig().isPremium() ? this.aboutLengthLimitPremium : this.aboutLengthLimitDefault;
    }

    public ArrayList<Long> getActiveGroupCalls() {
        return new ArrayList<>(this.activeVoiceChatsMap.keySet());
    }

    public TLRPC$ChannelParticipant getAdminInChannel(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) this.channelAdmins.get(j2);
        if (longSparseArray == null) {
            return null;
        }
        return (TLRPC$ChannelParticipant) longSparseArray.get(j);
    }

    public String getAdminRank(long j, long j2) {
        TLRPC$ChannelParticipant tLRPC$ChannelParticipant;
        if (j == j2) {
            return "";
        }
        LongSparseArray longSparseArray = (LongSparseArray) this.channelAdmins.get(j);
        if (longSparseArray == null || (tLRPC$ChannelParticipant = (TLRPC$ChannelParticipant) longSparseArray.get(j2)) == null) {
            return null;
        }
        String str = tLRPC$ChannelParticipant.rank;
        return str != null ? str : "";
    }

    public ArrayList<TLRPC$Dialog> getAllDialogs() {
        return this.allDialogs;
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

    public TLRPC$messages_AvailableEffects getAvailableEffects() {
        if (!this.loadingAvailableEffects) {
            this.loadingAvailableEffects = true;
            this.effectsFetcher.fetch(this.currentAccount, 0, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    MessagesController.this.lambda$getAvailableEffects$450((TLRPC$messages_AvailableEffects) obj);
                }
            });
        }
        return this.availableEffects;
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
                MessagesController.this.lambda$getBlockedPeers$108(z, tLRPC$TL_contacts_getBlocked, tLObject, tLRPC$TL_error);
            }
        });
    }

    public ChannelBoostsController getBoostsController() {
        ChannelBoostsController channelBoostsController = this.channelBoostsControler;
        if (channelBoostsController != null) {
            return channelBoostsController;
        }
        synchronized (lockObjects[this.currentAccount]) {
            try {
                ChannelBoostsController channelBoostsController2 = this.channelBoostsControler;
                if (channelBoostsController2 != null) {
                    return channelBoostsController2;
                }
                ChannelBoostsController channelBoostsController3 = new ChannelBoostsController(this.currentAccount);
                this.channelBoostsControler = channelBoostsController3;
                return channelBoostsController3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CacheByChatsController getCacheByChatsController() {
        return this.cacheByChatsController;
    }

    public ChannelRecommendations getCachedChannelRecommendations(long j) {
        HashMap<Long, ChannelRecommendations> hashMap = this.cachedChannelRecommendations;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(Long.valueOf(j));
    }

    public TLRPC$TL_exportedContactToken getCachedContactToken() {
        if (this.cachedContactToken == null || r0.expires <= System.currentTimeMillis() / 1000) {
            return null;
        }
        return this.cachedContactToken;
    }

    public int getCaptionMaxLengthLimit() {
        return getUserConfig().isPremium() ? this.captionLengthLimitPremium : this.captionLengthLimitDefault;
    }

    public void getChannelDifference(final long r17, final int r19, long r20, org.telegram.tgnet.TLRPC$InputChannel r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.getChannelDifference(long, int, long, org.telegram.tgnet.TLRPC$InputChannel):void");
    }

    public void getChannelParticipant(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User, final Utilities.Callback<TLRPC$ChannelParticipant> callback) {
        if (tLRPC$Chat == null || tLRPC$User == null) {
            if (callback != null) {
                callback.run(null);
            }
        } else {
            TLRPC$TL_channels_getParticipant tLRPC$TL_channels_getParticipant = new TLRPC$TL_channels_getParticipant();
            tLRPC$TL_channels_getParticipant.channel = getInputChannel(tLRPC$Chat.id);
            tLRPC$TL_channels_getParticipant.participant = getInputPeer(tLRPC$User);
            getConnectionsManager().sendRequest(tLRPC$TL_channels_getParticipant, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$getChannelParticipant$426(Utilities.Callback.this, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public ChannelRecommendations getChannelRecommendations(final long j) {
        ChannelRecommendations channelRecommendations;
        TLRPC$InputChannel inputChannel = getInputChannel(j);
        if (inputChannel == null && j != 0) {
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
        if (j != 0) {
            tLRPC$TL_channels_getChannelRecommendations.flags |= 1;
            tLRPC$TL_channels_getChannelRecommendations.channel = inputChannel;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_channels_getChannelRecommendations, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$getChannelRecommendations$436(isPremium, j, tLObject, tLRPC$TL_error);
            }
        });
        return channelRecommendations;
    }

    public TLRPC$Chat getChat(Long l) {
        return this.chats.get(l);
    }

    public TLRPC$TL_chatAdminRights getChatAdminRightsCached(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User) {
        TLRPC$ChatParticipants tLRPC$ChatParticipants;
        ArrayList arrayList;
        TLRPC$ChannelParticipant tLRPC$ChannelParticipant;
        if (tLRPC$Chat != null && tLRPC$User != null) {
            if (UserObject.isUserSelf(tLRPC$User)) {
                return tLRPC$Chat.admin_rights;
            }
            TLRPC$ChatFull chatFull = getChatFull(tLRPC$Chat.id);
            if (chatFull != null && (tLRPC$ChatParticipants = chatFull.participants) != null && (arrayList = tLRPC$ChatParticipants.participants) != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC$ChatParticipant tLRPC$ChatParticipant = (TLRPC$ChatParticipant) arrayList.get(i);
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

    public TLRPC$ChatFull getChatFull(long j) {
        return (TLRPC$ChatFull) this.fullChats.get(j);
    }

    public int getChatMaxUniqReactions(long j) {
        TLRPC$ChatFull chatFull = getInstance(this.currentAccount).getChatFull(-j);
        return (chatFull == null || (!(chatFull instanceof TLRPC$TL_chatFull) ? (chatFull.flags2 & 8192) != 0 : (chatFull.flags & 1048576) != 0)) ? this.reactionsUniqMax : chatFull.reactions_limit;
    }

    public int getChatPendingRequestsOnClosed(long j) {
        return this.mainPreferences.getInt("chatPendingRequests" + j, 0);
    }

    public int getChatReactionsCount() {
        if (getUserConfig().isPremium()) {
            return this.reactionsInChatMax;
        }
        return 1;
    }

    public TL_chatlists$TL_chatlists_chatlistUpdates getChatlistFolderUpdates(int i) {
        ChatlistUpdatesStat chatlistUpdatesStat = this.chatlistFoldersUpdates.get(i);
        if (chatlistUpdatesStat == null) {
            return null;
        }
        return chatlistUpdatesStat.lastValue;
    }

    public ConcurrentHashMap<Long, TLRPC$Chat> getChats() {
        return this.chats;
    }

    public TL_account$contentSettings getContentSettings() {
        return this.contentSettings;
    }

    public void getContentSettings(Utilities.Callback<TL_account$contentSettings> callback) {
        if (this.contentSettings != null && System.currentTimeMillis() - this.contentSettingsLoadedTime < 3600000) {
            if (callback != null) {
                callback.run(this.contentSettings);
                return;
            }
            return;
        }
        if (this.contentSettingsCallbacks == null) {
            this.contentSettingsCallbacks = new ArrayList<>();
        }
        if (callback != null) {
            this.contentSettingsCallbacks.add(callback);
        }
        if (this.contentSettingsLoading) {
            return;
        }
        this.contentSettingsLoading = true;
        getConnectionsManager().sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                return TL_account$contentSettings.TLdeserialize(abstractSerializedData, i, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-1952756306);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$getContentSettings$456(tLObject, tLRPC$TL_error);
            }
        });
    }

    public TLRPC$Dialog getDialog(long j) {
        return (TLRPC$Dialog) this.dialogs_dict.get(j);
    }

    public ArrayList<DialogFilter> getDialogFilters() {
        ArrayList<DialogFilter> arrayList = this.frozenDialogFilters;
        return arrayList != null ? arrayList : this.dialogFilters;
    }

    public DialogPhotos getDialogPhotos(long j) {
        DialogPhotos dialogPhotos = (DialogPhotos) this.dialogPhotos.get(j);
        if (dialogPhotos != null) {
            return dialogPhotos;
        }
        LongSparseArray longSparseArray = this.dialogPhotos;
        DialogPhotos dialogPhotos2 = new DialogPhotos(j);
        longSparseArray.put(j, dialogPhotos2);
        return dialogPhotos2;
    }

    public int getDialogUnreadCount(TLRPC$Dialog tLRPC$Dialog) {
        if (tLRPC$Dialog == null) {
            return 0;
        }
        int i = tLRPC$Dialog.unread_count;
        TLRPC$Chat chat = getChat(Long.valueOf(-tLRPC$Dialog.id));
        return (chat == null || !chat.forum) ? i : this.topicsController.getForumUnreadCount(-tLRPC$Dialog.id)[0];
    }

    public ArrayList<TLRPC$Dialog> getDialogs(int i) {
        ArrayList<TLRPC$Dialog> arrayList = this.dialogsByFolder.get(i);
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public void getDifference() {
        getDifference(getMessagesStorage().getLastPtsValue(), getMessagesStorage().getLastDateValue(), getMessagesStorage().getLastQtsValue(), false);
    }

    public void getDifference(int i, final int i2, final int i3, boolean z) {
        registerForPush(SharedConfig.pushType, SharedConfig.pushString);
        if (getMessagesStorage().getLastPtsValue() == 0) {
            loadCurrentState();
            return;
        }
        if (z || !this.gettingDifference) {
            this.gettingDifference = true;
            TLRPC$TL_updates_getDifference tLRPC$TL_updates_getDifference = new TLRPC$TL_updates_getDifference();
            tLRPC$TL_updates_getDifference.pts = i;
            tLRPC$TL_updates_getDifference.date = i2;
            tLRPC$TL_updates_getDifference.qts = i3;
            if (this.getDifferenceFirstSync) {
                tLRPC$TL_updates_getDifference.flags |= 1;
                tLRPC$TL_updates_getDifference.pts_total_limit = ApplicationLoader.isConnectedOrConnectingToWiFi() ? 5000 : 1000;
                this.getDifferenceFirstSync = false;
            }
            if (tLRPC$TL_updates_getDifference.date == 0) {
                tLRPC$TL_updates_getDifference.date = getConnectionsManager().getCurrentTime();
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("start getDifference with date = " + i2 + " pts = " + i + " qts = " + i3);
                FileLog.d("getDifference: isUpdating = true");
            }
            getConnectionsManager().setIsUpdating(true);
            getConnectionsManager().sendRequest(tLRPC$TL_updates_getDifference, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$getDifference$337(i2, i3, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public TLRPC$TL_availableEffect getEffect(long j) {
        getAvailableEffects();
        if (this.availableEffects == null) {
            return null;
        }
        for (int i = 0; i < this.availableEffects.effects.size(); i++) {
            if (((TLRPC$TL_availableEffect) this.availableEffects.effects.get(i)).id == j) {
                return (TLRPC$TL_availableEffect) this.availableEffects.effects.get(i);
            }
        }
        return null;
    }

    public TLRPC$Document getEffectDocument(long j) {
        if (this.availableEffects == null) {
            return null;
        }
        for (int i = 0; i < this.availableEffects.documents.size(); i++) {
            if (((TLRPC$Document) this.availableEffects.documents.get(i)).id == j) {
                return (TLRPC$Document) this.availableEffects.documents.get(i);
            }
        }
        return null;
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
        TLRPC$User tLRPC$User = (TLRPC$User) arrayList.get(1);
        putEncryptedChat(tLRPC$EncryptedChat2, false);
        putUser(tLRPC$User, true);
        return tLRPC$EncryptedChat2;
    }

    public TLRPC$TL_chatInviteExported getExportedInvite(long j) {
        return (TLRPC$TL_chatInviteExported) this.exportedChats.get(j);
    }

    public int getFilterIdByDialogsType(int i) {
        if (i != 7 && i != 8) {
            return 0;
        }
        DialogFilter dialogFilter = this.selectedDialogFilter[i - 7];
        if (dialogFilter == null) {
            return -1;
        }
        return dialogFilter.id;
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

    public ChatObject.Call getGroupCall(long j, boolean z) {
        return getGroupCall(j, z, null);
    }

    public ChatObject.Call getGroupCall(final long j, boolean z, final Runnable runnable) {
        TLRPC$TL_inputGroupCall tLRPC$TL_inputGroupCall;
        TLRPC$ChatFull chatFull = getChatFull(j);
        if (chatFull == null || (tLRPC$TL_inputGroupCall = chatFull.call) == null) {
            return null;
        }
        ChatObject.Call call = (ChatObject.Call) this.groupCalls.get(tLRPC$TL_inputGroupCall.id);
        if (call == null && z && !this.loadingGroupCalls.contains(Long.valueOf(j))) {
            this.loadingGroupCalls.add(Long.valueOf(j));
            if (chatFull.call != null) {
                TLRPC$TL_phone_getGroupCall tLRPC$TL_phone_getGroupCall = new TLRPC$TL_phone_getGroupCall();
                tLRPC$TL_phone_getGroupCall.call = chatFull.call;
                tLRPC$TL_phone_getGroupCall.limit = 20;
                getConnectionsManager().sendRequest(tLRPC$TL_phone_getGroupCall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$getGroupCall$57(j, runnable, tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
        if (call == null || !(call.call instanceof TLRPC$TL_groupCallDiscarded)) {
            return call;
        }
        return null;
    }

    public TLRPC$InputChannel getInputChannel(long j) {
        return getInputChannel(getChat(Long.valueOf(j)));
    }

    public TLRPC$InputDocument getInputDocument(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return null;
        }
        TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
        tLRPC$TL_inputDocument.id = tLRPC$Document.id;
        tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
        byte[] bArr = tLRPC$Document.file_reference;
        tLRPC$TL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tLRPC$TL_inputDocument.file_reference = new byte[0];
        }
        return tLRPC$TL_inputDocument;
    }

    public TLRPC$InputPeer getInputPeer(long j) {
        TLRPC$InputPeer tLRPC$TL_inputPeerUser;
        long j2;
        if (j == getUserConfig().getClientUserId()) {
            return new TLRPC$TL_inputPeerSelf();
        }
        if (j >= 0) {
            TLRPC$User user = getUser(Long.valueOf(j));
            tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
            tLRPC$TL_inputPeerUser.user_id = j;
            if (user != null) {
                j2 = user.access_hash;
            }
            return tLRPC$TL_inputPeerUser;
        }
        long j3 = -j;
        TLRPC$Chat chat = getChat(Long.valueOf(j3));
        if (!ChatObject.isChannel(chat)) {
            TLRPC$TL_inputPeerChat tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChat();
            tLRPC$TL_inputPeerChat.chat_id = j3;
            return tLRPC$TL_inputPeerChat;
        }
        tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerChannel();
        tLRPC$TL_inputPeerUser.channel_id = j3;
        j2 = chat.access_hash;
        tLRPC$TL_inputPeerUser.access_hash = j2;
        return tLRPC$TL_inputPeerUser;
    }

    public TLRPC$InputPeer getInputPeer(TLRPC$Peer tLRPC$Peer) {
        TLRPC$InputPeer tLRPC$TL_inputPeerUser;
        long j;
        if (tLRPC$Peer instanceof TLRPC$TL_peerChat) {
            TLRPC$TL_inputPeerChat tLRPC$TL_inputPeerChat = new TLRPC$TL_inputPeerChat();
            tLRPC$TL_inputPeerChat.chat_id = tLRPC$Peer.chat_id;
            return tLRPC$TL_inputPeerChat;
        }
        if (tLRPC$Peer instanceof TLRPC$TL_peerChannel) {
            tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerChannel();
            long j2 = tLRPC$Peer.channel_id;
            tLRPC$TL_inputPeerUser.channel_id = j2;
            TLRPC$Chat chat = getChat(Long.valueOf(j2));
            if (chat == null) {
                return tLRPC$TL_inputPeerUser;
            }
            j = chat.access_hash;
        } else {
            tLRPC$TL_inputPeerUser = new TLRPC$TL_inputPeerUser();
            long j3 = tLRPC$Peer.user_id;
            tLRPC$TL_inputPeerUser.user_id = j3;
            TLRPC$User user = getUser(Long.valueOf(j3));
            if (user == null) {
                return tLRPC$TL_inputPeerUser;
            }
            j = user.access_hash;
        }
        tLRPC$TL_inputPeerUser.access_hash = j;
        return tLRPC$TL_inputPeerUser;
    }

    public TLRPC$InputUser getInputUser(long j) {
        return getInputUser(getUser(Long.valueOf(j)));
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

    public SharedPreferences getMainSettings() {
        return this.mainPreferences;
    }

    public int getMaxUserReactionsCount() {
        return getUserConfig().isPremium() ? this.reactionsUserMaxPremium : this.reactionsUserMaxDefault;
    }

    public String getMutedString(long j, long j2) {
        if (!getMessagesController().isDialogMuted(j, j2)) {
            return LocaleController.getString(R.string.NotificationsUnmuted);
        }
        int i = this.notificationsPreferences.getInt("notifyuntil_" + NotificationsController.getSharedPrefKey(j, j2), 0);
        return i >= getConnectionsManager().getCurrentTime() ? LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i)) : LocaleController.getString(R.string.NotificationsMuted);
    }

    public void getNewDeleteTask(final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getNewDeleteTask$77(longSparseArray, longSparseArray2);
            }
        });
    }

    public void getNextReactionMention(final long j, final long j2, final int i, final Consumer consumer) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getNextReactionMention$5(j2, j, consumer, i);
            }
        });
    }

    public TLRPC$Peer getPeer(long j) {
        if (j >= 0) {
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            tLRPC$TL_peerUser.user_id = j;
            return tLRPC$TL_peerUser;
        }
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

    public String getPeerName(long j) {
        return getPeerName(j, false);
    }

    public String getPeerName(long j, boolean z) {
        if (j >= 0) {
            TLRPC$User user = getUser(Long.valueOf(j));
            return AndroidUtilities.removeDiacritics(z ? UserObject.getFirstName(user, true) : UserObject.getUserName(user));
        }
        TLRPC$Chat chat = getChat(Long.valueOf(-j));
        return AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title);
    }

    public CharSequence getPrintingString(long j, long j2, boolean z) {
        LongSparseArray longSparseArray;
        TLRPC$User user;
        TLRPC$UserStatus tLRPC$UserStatus;
        if ((!z || !DialogObject.isUserDialog(j) || (user = getUser(Long.valueOf(j))) == null || (tLRPC$UserStatus = user.status) == null || tLRPC$UserStatus.expires >= 0) && (longSparseArray = (LongSparseArray) this.printingStrings.get(j)) != null) {
            return (CharSequence) longSparseArray.get(j2);
        }
        return null;
    }

    public Integer getPrintingStringType(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) this.printingStringsTypes.get(j);
        if (longSparseArray == null) {
            return null;
        }
        return (Integer) longSparseArray.get(j2);
    }

    public String getRestrictionReason(ArrayList<TLRPC$RestrictionReason> arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$RestrictionReason tLRPC$RestrictionReason = arrayList.get(i);
            Set<String> set = this.ignoreRestrictionReasons;
            if ((set == null || !set.contains(tLRPC$RestrictionReason.reason)) && !"sensitive".equals(tLRPC$RestrictionReason.reason) && ("all".equals(tLRPC$RestrictionReason.platform) || !(ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || !"android".equals(tLRPC$RestrictionReason.platform)))) {
                return tLRPC$RestrictionReason.text;
            }
        }
        return null;
    }

    public SavedMessagesController getSavedMessagesController() {
        SavedMessagesController savedMessagesController = this.savedMessagesController;
        if (savedMessagesController != null) {
            return savedMessagesController;
        }
        synchronized (lockObjects[this.currentAccount]) {
            try {
                SavedMessagesController savedMessagesController2 = this.savedMessagesController;
                if (savedMessagesController2 != null) {
                    return savedMessagesController2;
                }
                SavedMessagesController savedMessagesController3 = new SavedMessagesController(this.currentAccount);
                this.savedMessagesController = savedMessagesController3;
                return savedMessagesController3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public TLRPC$TL_messages_savedReactionsTags getSavedReactionTags(long j) {
        return getSavedReactionTags(j, false);
    }

    public TLRPC$TL_messages_savedReactionsTags getSavedReactionTags(final long j, boolean z) {
        HashSet<Long> hashSet = this.loadingReactionTags;
        if (hashSet != null && hashSet.contains(Long.valueOf(j)) && !z) {
            LongSparseArray longSparseArray = this.reactionTags;
            if (longSparseArray == null) {
                return null;
            }
            return (TLRPC$TL_messages_savedReactionsTags) longSparseArray.get(j);
        }
        if (this.loadingReactionTags == null) {
            this.loadingReactionTags = new HashSet<>();
        }
        this.loadingReactionTags.add(Long.valueOf(j));
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$getSavedReactionTags$442(j);
            }
        });
        return null;
    }

    public int getSavedTagCount(long j, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        TLRPC$TL_messages_savedReactionsTags tLRPC$TL_messages_savedReactionsTags;
        LongSparseArray longSparseArray = this.reactionTags;
        if (longSparseArray == null || (tLRPC$TL_messages_savedReactionsTags = (TLRPC$TL_messages_savedReactionsTags) longSparseArray.get(j)) == null) {
            return 0;
        }
        for (int i = 0; i < tLRPC$TL_messages_savedReactionsTags.tags.size(); i++) {
            if (visibleReaction.isSame(((TLRPC$TL_savedReactionTag) tLRPC$TL_messages_savedReactionsTags.tags.get(i)).reaction)) {
                return ((TLRPC$TL_savedReactionTag) tLRPC$TL_messages_savedReactionsTags.tags.get(i)).count;
            }
        }
        return 0;
    }

    public String getSavedTagName(TLRPC$Reaction tLRPC$Reaction) {
        TLRPC$TL_messages_savedReactionsTags tLRPC$TL_messages_savedReactionsTags;
        LongSparseArray longSparseArray = this.reactionTags;
        if (longSparseArray == null || (tLRPC$TL_messages_savedReactionsTags = (TLRPC$TL_messages_savedReactionsTags) longSparseArray.get(0L)) == null) {
            return null;
        }
        for (int i = 0; i < tLRPC$TL_messages_savedReactionsTags.tags.size(); i++) {
            if (ReactionsLayoutInBubble.reactionsEqual(tLRPC$Reaction, ((TLRPC$TL_savedReactionTag) tLRPC$TL_messages_savedReactionsTags.tags.get(i)).reaction)) {
                return ((TLRPC$TL_savedReactionTag) tLRPC$TL_messages_savedReactionsTags.tags.get(i)).title;
            }
        }
        return null;
    }

    public String getSavedTagName(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        TLRPC$TL_messages_savedReactionsTags tLRPC$TL_messages_savedReactionsTags;
        LongSparseArray longSparseArray = this.reactionTags;
        if (longSparseArray == null || (tLRPC$TL_messages_savedReactionsTags = (TLRPC$TL_messages_savedReactionsTags) longSparseArray.get(0L)) == null) {
            return null;
        }
        for (int i = 0; i < tLRPC$TL_messages_savedReactionsTags.tags.size(); i++) {
            if (visibleReaction.isSame(((TLRPC$TL_savedReactionTag) tLRPC$TL_messages_savedReactionsTags.tags.get(i)).reaction)) {
                return ((TLRPC$TL_savedReactionTag) tLRPC$TL_messages_savedReactionsTags.tags.get(i)).title;
            }
        }
        return null;
    }

    public TLRPC$TL_channels_sendAsPeers getSendAsPeers(final long j) {
        SendAsPeersInfo sendAsPeersInfo = (SendAsPeersInfo) this.sendAsPeers.get(j);
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
                    MessagesController.this.lambda$getSendAsPeers$398(j, sendAsPeersInfo2, tLObject, tLRPC$TL_error);
                }
            });
        }
        return null;
    }

    public TLRPC$Peer getSendAsSelectedPeer(long j) {
        TLRPC$Peer tLRPC$Peer;
        TLRPC$ChatFull chatFull = getChatFull(-j);
        if (chatFull != null && (tLRPC$Peer = chatFull.default_send_as) != null) {
            return tLRPC$Peer;
        }
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        tLRPC$TL_peerUser.user_id = getAccountInstance().getUserConfig().clientUserId;
        return tLRPC$TL_peerUser;
    }

    public SponsoredMessagesInfo getSponsoredMessages(final long j) {
        SponsoredMessagesInfo sponsoredMessagesInfo = (SponsoredMessagesInfo) this.sponsoredMessages.get(j);
        if (sponsoredMessagesInfo != null && (sponsoredMessagesInfo.loading || Math.abs(SystemClock.elapsedRealtime() - sponsoredMessagesInfo.loadTime) <= 300000)) {
            return sponsoredMessagesInfo;
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
                MessagesController.this.lambda$getSponsoredMessages$395(j, sponsoredMessagesInfo2, tLObject, tLRPC$TL_error);
            }
        });
        return null;
    }

    public StoriesController getStoriesController() {
        StoriesController storiesController = this.storiesController;
        if (storiesController != null) {
            return storiesController;
        }
        synchronized (lockObjects[this.currentAccount]) {
            try {
                StoriesController storiesController2 = this.storiesController;
                if (storiesController2 != null) {
                    return storiesController2;
                }
                StoriesController storiesController3 = new StoriesController(this.currentAccount);
                this.storiesController = storiesController3;
                return storiesController3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public TopicsController getTopicsController() {
        return this.topicsController;
    }

    public int getTotalDialogsCount() {
        ArrayList<TLRPC$Dialog> arrayList = this.dialogsByFolder.get(0);
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public TranslateController getTranslateController() {
        return this.translateController;
    }

    public UnconfirmedAuthController getUnconfirmedAuthController() {
        UnconfirmedAuthController unconfirmedAuthController = this.unconfirmedAuthController;
        if (unconfirmedAuthController != null) {
            return unconfirmedAuthController;
        }
        synchronized (lockObjects[this.currentAccount]) {
            try {
                UnconfirmedAuthController unconfirmedAuthController2 = this.unconfirmedAuthController;
                if (unconfirmedAuthController2 != null) {
                    return unconfirmedAuthController2;
                }
                UnconfirmedAuthController unconfirmedAuthController3 = new UnconfirmedAuthController(this.currentAccount);
                this.unconfirmedAuthController = unconfirmedAuthController3;
                return unconfirmedAuthController3;
            } catch (Throwable th) {
                throw th;
            }
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

    public TLRPC$User getUser(Long l) {
        return l.longValue() == 0 ? UserConfig.getInstance(this.currentAccount).getCurrentUser() : this.users.get(l);
    }

    public TLRPC$User getUser(String str) {
        TLObject userOrChat = getUserOrChat(str);
        if (userOrChat instanceof TLRPC$User) {
            return (TLRPC$User) userOrChat;
        }
        return null;
    }

    public TLRPC$UserFull getUserFull(long j) {
        return (TLRPC$UserFull) this.fullUsers.get(j);
    }

    public UserNameResolver getUserNameResolver() {
        if (this.userNameResolver == null) {
            this.userNameResolver = new UserNameResolver(this.currentAccount);
        }
        return this.userNameResolver;
    }

    public TLObject getUserOrChat(long j) {
        Map map;
        if (this.users.containsKey(Long.valueOf(j))) {
            map = this.users;
        } else {
            j = -j;
            if (!this.chats.containsKey(Long.valueOf(j))) {
                return null;
            }
            map = this.chats;
        }
        return (TLObject) map.get(Long.valueOf(j));
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

    public boolean hasAvailableEffects() {
        TLRPC$messages_AvailableEffects tLRPC$messages_AvailableEffects = this.availableEffects;
        return (tLRPC$messages_AvailableEffects == null || tLRPC$messages_AvailableEffects.effects.isEmpty()) ? false : true;
    }

    public boolean hasHiddenArchive() {
        return SharedConfig.archiveHidden && this.dialogs_dict.get(DialogObject.makeFolderDialogId(1)) != null;
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
        tLRPC$TL_messages_hidePeerSettingsBar.peer = getInputPeer(tLRPC$User != null ? tLRPC$User.id : -tLRPC$Chat.id);
        getConnectionsManager().sendRequest(tLRPC$TL_messages_hidePeerSettingsBar, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$hidePeerSettingsBar$69(tLObject, tLRPC$TL_error);
            }
        });
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
                MessagesController.lambda$hidePromoDialog$126(tLObject, tLRPC$TL_error);
            }
        });
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$hidePromoDialog$127();
            }
        });
        removePromoDialog();
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
                MessagesController.lambda$installTheme$113(tLObject, tLRPC$TL_error);
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
                MessagesController.lambda$installTheme$114(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void invalidateChatlistFolderUpdate(int i) {
        this.chatlistFoldersUpdates.remove(i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatlistFolderUpdate, Integer.valueOf(i));
    }

    public void invalidateContentSettings() {
        this.contentSettings = null;
        this.contentSettingsLoadedTime = 0L;
    }

    public void invalidateUserPremiumBlocked(long j, int i) {
        if (this.loadingFullUsers.contains(Long.valueOf(j))) {
            return;
        }
        int indexOfKey = this.loadedFullUsers.indexOfKey(j);
        if (indexOfKey >= 0) {
            this.loadedFullUsers.removeAt(indexOfKey);
        }
        loadFullUser(getUser(Long.valueOf(j)), i, true);
    }

    public boolean isChannelAdminsLoaded(long j) {
        return this.channelAdmins.get(j) != null;
    }

    public boolean isChatNoForwards(long j) {
        return isChatNoForwards(getChat(Long.valueOf(j)));
    }

    public boolean isChatNoForwards(TLRPC$Chat tLRPC$Chat) {
        TLRPC$Chat chat;
        if (tLRPC$Chat == null) {
            return false;
        }
        TLRPC$InputChannel tLRPC$InputChannel = tLRPC$Chat.migrated_to;
        return (tLRPC$InputChannel == null || (chat = getChat(Long.valueOf(tLRPC$InputChannel.channel_id))) == null) ? tLRPC$Chat.noforwards : chat.noforwards;
    }

    public boolean isClearingDialog(long j) {
        return this.clearingHistoryDialogs.get(j) != null;
    }

    public boolean isDialogMuted(long j, long j2) {
        return isDialogMuted(j, j2, null);
    }

    public boolean isDialogMuted(long j, long j2, TLRPC$Chat tLRPC$Chat) {
        Boolean bool;
        int i = this.notificationsPreferences.getInt("notify2_" + NotificationsController.getSharedPrefKey(j, j2), -1);
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
            return j2 != 0 ? isDialogMuted(j, 0L, tLRPC$Chat) : !getNotificationsController().isGlobalNotificationsEnabled(j, bool, false, false);
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            if (this.notificationsPreferences.getInt("notifyuntil_" + NotificationsController.getSharedPrefKey(j, j2), 0) >= getConnectionsManager().getCurrentTime()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDialogNotificationsSoundEnabled(long j, long j2) {
        return this.notificationsPreferences.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(j, j2), true);
    }

    public boolean isDialogVisible(long j, boolean z) {
        return (z ? this.visibleScheduledDialogMainThreadIds : this.visibleDialogMainThreadIds).contains(Long.valueOf(j));
    }

    public boolean isDialogsEndReached(int i) {
        return this.dialogsEndReached.get(i);
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

    public boolean isHiddenByUndo(long j) {
        return !this.hiddenUndoChats.isEmpty() && this.hiddenUndoChats.contains(Long.valueOf(j));
    }

    public boolean isInChatCached(TLRPC$Chat tLRPC$Chat, TLRPC$User tLRPC$User) {
        TLRPC$ChatParticipants tLRPC$ChatParticipants;
        ArrayList arrayList;
        if (tLRPC$Chat != null && tLRPC$User != null) {
            if (UserObject.isUserSelf(tLRPC$User)) {
                return !ChatObject.isNotInChat(tLRPC$Chat);
            }
            TLRPC$ChatFull chatFull = getChatFull(tLRPC$Chat.id);
            if (chatFull != null && (tLRPC$ChatParticipants = chatFull.participants) != null && (arrayList = tLRPC$ChatParticipants.participants) != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC$ChatParticipant tLRPC$ChatParticipant = (TLRPC$ChatParticipant) arrayList.get(i);
                    if (tLRPC$ChatParticipant != null && tLRPC$ChatParticipant.user_id == tLRPC$User.id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isJoiningChannel(long j) {
        return this.joiningToChannels.contains(Long.valueOf(j));
    }

    public boolean isLoadingDialogs(int i) {
        return this.loadingDialogs.get(i);
    }

    public boolean isPremiumUser(TLRPC$User tLRPC$User) {
        return (premiumFeaturesBlocked() || !tLRPC$User.premium || isSupportUser(tLRPC$User)) ? false : true;
    }

    public boolean isPromoDialog(long j, boolean z) {
        TLRPC$Dialog tLRPC$Dialog = this.promoDialog;
        return tLRPC$Dialog != null && tLRPC$Dialog.id == j && (!z || this.isLeftPromoChannel);
    }

    public boolean isSensitive(ArrayList<TLRPC$RestrictionReason> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TLRPC$RestrictionReason tLRPC$RestrictionReason = arrayList.get(i);
                Set<String> set = this.ignoreRestrictionReasons;
                if ((set == null || !set.contains(tLRPC$RestrictionReason.reason)) && (("all".equals(tLRPC$RestrictionReason.platform) || !(ApplicationLoader.isStandaloneBuild() || BuildVars.isBetaApp() || !"android".equals(tLRPC$RestrictionReason.platform))) && "sensitive".equals(tLRPC$RestrictionReason.reason))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isServerDialogsEndReached(int i) {
        return this.serverDialogsEndReached.get(i);
    }

    public boolean isSponsoredDisabled() {
        if (getUserFull(getUserConfig().getClientUserId()) == null) {
            return false;
        }
        return !r0.sponsored_enabled;
    }

    public boolean isStoryQualityFullOnAccount() {
        return getUserConfig().isPremium() && this.storyQualityFull;
    }

    public boolean isUserPremiumBlocked(long j) {
        return isUserPremiumBlocked(j, false);
    }

    public boolean isUserPremiumBlocked(long j, boolean z) {
        if (!getUserConfig().isPremium() && getUserConfig().getClientUserId() != j) {
            Boolean bool = (Boolean) this.cachedIsUserPremiumBlocked.get(j);
            if (bool != null) {
                return bool.booleanValue();
            }
            TLRPC$User user = getUser(Long.valueOf(j));
            if (user != null && !user.contact_require_premium) {
                return false;
            }
            TLRPC$UserFull userFull = getUserFull(j);
            if (userFull != null) {
                return userFull.contact_require_premium;
            }
            if (getInputUser(j) == null || z) {
                return false;
            }
            this.loadingIsUserPremiumBlocked.add(Long.valueOf(j));
            AndroidUtilities.cancelRunOnUIThread(this.requestIsUserPremiumBlockedRunnable);
            AndroidUtilities.runOnUIThread(this.requestIsUserPremiumBlockedRunnable, 60L);
        }
        return false;
    }

    public void loadAppConfig() {
        loadAppConfig(false);
    }

    public void loadAppConfig(boolean z) {
        AndroidUtilities.cancelRunOnUIThread(this.loadAppConfigRunnable);
        if (z) {
            this.appConfigFetcher.forceRequest(this.currentAccount, 0);
        }
        this.appConfigFetcher.fetch(this.currentAccount, 0, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                MessagesController.this.lambda$loadAppConfig$31((TLRPC$TL_help_appConfig) obj);
            }
        });
    }

    public void loadChannelAdmins(final long j, boolean z) {
        if ((SystemClock.elapsedRealtime() / 1000) - this.loadingChannelAdmins.get(j) < 60) {
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
                MessagesController.this.lambda$loadChannelAdmins$59(j, tLObject, tLRPC$TL_error);
            }
        });
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
                MessagesController.this.lambda$loadChannelParticipants$140(l, callback, tLObject, tLRPC$TL_error);
            }
        });
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
                MessagesController.this.lambda$loadCurrentState$303(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void loadDialogs(int i, int i2, int i3, boolean z) {
        loadDialogs(i, i2, i3, z, null);
    }

    public void loadDialogs(final int i, int i2, final int i3, boolean z, final Runnable runnable) {
        TLRPC$InputPeer tLRPC$TL_inputPeerEmpty;
        long j;
        if (this.loadingDialogs.get(i) || this.resetingDialogs) {
            return;
        }
        this.loadingDialogs.put(i, true);
        NotificationCenter notificationCenter = getNotificationCenter();
        int i4 = NotificationCenter.dialogsNeedReload;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i4, new Object[0]);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("folderId = " + i + " load cacheOffset = " + i2 + " count = " + i3 + " cache = " + z);
        }
        if (z) {
            getMessagesStorage().getDialogs(i, i2 == 0 ? 0 : this.nextDialogsCacheOffset.get(i, 0), i3, i == 0 && i2 == 0);
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
        long j2 = dialogLoadOffsets[0];
        if (j2 == -1) {
            ArrayList<TLRPC$Dialog> dialogs = getDialogs(i);
            int size = dialogs.size() - 1;
            while (true) {
                if (size < 0) {
                    tLRPC$TL_inputPeerEmpty = new TLRPC$TL_inputPeerEmpty();
                    break;
                }
                TLRPC$Dialog tLRPC$Dialog = dialogs.get(size);
                if (!tLRPC$Dialog.pinned && !DialogObject.isEncryptedDialog(tLRPC$Dialog.id) && tLRPC$Dialog.top_message > 0) {
                    ArrayList arrayList = (ArrayList) this.dialogMessage.get(tLRPC$Dialog.id);
                    MessageObject messageObject = null;
                    if (arrayList != null) {
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            MessageObject messageObject2 = (MessageObject) arrayList.get(i5);
                            if (messageObject2 != null && (messageObject == null || messageObject2.getId() > messageObject.getId())) {
                                messageObject = (MessageObject) arrayList.get(i5);
                            }
                        }
                    }
                    if (messageObject != null && messageObject.getId() > 0) {
                        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
                        tLRPC$TL_messages_getDialogs.offset_date = tLRPC$Message.date;
                        tLRPC$TL_messages_getDialogs.offset_id = tLRPC$Message.id;
                        TLRPC$Peer tLRPC$Peer = tLRPC$Message.peer_id;
                        long j3 = tLRPC$Peer.channel_id;
                        if (j3 == 0) {
                            j3 = tLRPC$Peer.chat_id;
                            if (j3 == 0) {
                                j = tLRPC$Peer.user_id;
                                tLRPC$TL_inputPeerEmpty = getInputPeer(j);
                            }
                        }
                        j = -j3;
                        tLRPC$TL_inputPeerEmpty = getInputPeer(j);
                    }
                }
                size--;
            }
        } else {
            if (j2 == 2147483647L) {
                this.dialogsEndReached.put(i, true);
                this.serverDialogsEndReached.put(i, true);
                this.loadingDialogs.put(i, false);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i4, new Object[0]);
                return;
            }
            int i6 = (int) j2;
            tLRPC$TL_messages_getDialogs.offset_id = i6;
            tLRPC$TL_messages_getDialogs.offset_date = (int) dialogLoadOffsets[1];
            if (i6 != 0) {
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
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadDialogs$188(i, i3, runnable, tLObject, tLRPC$TL_error);
                    }
                });
            }
            tLRPC$TL_inputPeerEmpty = new TLRPC$TL_inputPeerEmpty();
        }
        tLRPC$TL_messages_getDialogs.offset_peer = tLRPC$TL_inputPeerEmpty;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadDialogs$188(i, i3, runnable, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void loadFilterPeers(final HashMap<Long, TLRPC$InputPeer> hashMap, final HashMap<Long, TLRPC$InputPeer> hashMap2, final HashMap<Long, TLRPC$InputPeer> hashMap3, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, final ArrayList<TLRPC$User> arrayList, final ArrayList<TLRPC$Chat> arrayList2, final ArrayList<DialogFilter> arrayList3, final SparseArray<DialogFilter> sparseArray, final ArrayList<Integer> arrayList4, final HashMap<Integer, HashSet<Long>> hashMap4, final HashSet<Integer> hashSet, final Runnable runnable) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$loadFilterPeers$17(hashMap2, tLRPC$messages_Dialogs, tLRPC$messages_Dialogs2, arrayList, arrayList2, arrayList3, sparseArray, arrayList4, hashMap4, hashSet, runnable, hashMap3, hashMap);
            }
        });
    }

    public void loadFullChat(final long r12, final int r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.loadFullChat(long, int, boolean):void");
    }

    public void loadFullUser(TLRPC$User tLRPC$User, int i, boolean z) {
        loadFullUser(tLRPC$User, i, z, null);
    }

    public void loadFullUser(final TLRPC$User tLRPC$User, final int i, boolean z, final Utilities.Callback<TLRPC$UserFull> callback) {
        if (tLRPC$User != null) {
            if (callback == null) {
                if (this.loadingFullUsers.contains(Long.valueOf(tLRPC$User.id))) {
                    return;
                }
                if (!z && this.loadedFullUsers.get(tLRPC$User.id) > 0) {
                    return;
                }
            }
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
                    MessagesController.this.lambda$loadFullUser$66(j, callback, tLRPC$User, i, tLObject, tLRPC$TL_error);
                }
            }), i);
        }
    }

    public void loadGlobalNotificationsSettings() {
        SharedPreferences.Editor editor;
        if (this.loadingNotificationSettings == 0 && !getUserConfig().notificationsSettingsLoaded) {
            SharedPreferences notificationsSettings = getNotificationsSettings(this.currentAccount);
            if (notificationsSettings.contains("EnableGroup")) {
                boolean z = notificationsSettings.getBoolean("EnableGroup", true);
                editor = notificationsSettings.edit();
                if (!z) {
                    editor.putInt("EnableGroup2", Integer.MAX_VALUE);
                    editor.putInt("EnableChannel2", Integer.MAX_VALUE);
                }
                editor.remove("EnableGroup").commit();
            } else {
                editor = null;
            }
            if (notificationsSettings.contains("EnableAll")) {
                boolean z2 = notificationsSettings.getBoolean("EnableAll", true);
                if (editor == null) {
                    editor = notificationsSettings.edit();
                }
                if (!z2) {
                    editor.putInt("EnableAll2", Integer.MAX_VALUE);
                }
                editor.remove("EnableAll").commit();
            }
            if (editor != null) {
                editor.commit();
            }
            this.loadingNotificationSettings = 4;
            final int i = 0;
            while (i < 3) {
                TLRPC$TL_account_getNotifySettings tLRPC$TL_account_getNotifySettings = new TLRPC$TL_account_getNotifySettings();
                tLRPC$TL_account_getNotifySettings.peer = i == 0 ? new TLRPC$TL_inputNotifyChats() : i == 1 ? new TLRPC$TL_inputNotifyUsers() : new TLRPC$TL_inputNotifyBroadcasts();
                getConnectionsManager().sendRequest(tLRPC$TL_account_getNotifySettings, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadGlobalNotificationsSettings$190(i, tLObject, tLRPC$TL_error);
                    }
                });
                i++;
            }
            getConnectionsManager().sendRequest(new TLRPC$TL_account_getReactionsNotifySettings(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadGlobalNotificationsSettings$192(tLObject, tLRPC$TL_error);
                }
            });
        }
        if (getUserConfig().notificationsSignUpSettingsLoaded) {
            return;
        }
        loadSignUpNotificationsSettings();
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
                MessagesController.this.lambda$loadHintDialogs$185(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void loadMessages(long j, long j2, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7, int i8, long j3, int i9, int i10, int i11, int i12, boolean z3, int i13, boolean z4) {
        loadMessagesInternal(j, j2, z, i, i2, i3, z2, i4, i5, i6, i7, i8, j3, i9, i10, i11, i12, z3, i13, true, true, z4, null, 0L);
    }

    public void loadMessages(long j, long j2, boolean z, int i, int i2, int i3, boolean z2, int i4, int i5, int i6, int i7, int i8, long j3, int i9, int i10, boolean z3) {
        loadMessages(j, j2, z, i, i2, i3, z2, i4, i5, i6, i7, i8, j3, i10, j3 != 0 ? i9 : 0, 0, 0, false, 0, z3);
    }

    public void loadPeerSettings(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat) {
        if (tLRPC$User == null && tLRPC$Chat == null) {
            return;
        }
        final long j = tLRPC$User != null ? tLRPC$User.id : -tLRPC$Chat.id;
        if (this.loadingPeerSettings.indexOfKey(j) >= 0) {
            return;
        }
        this.loadingPeerSettings.put(j, Boolean.TRUE);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("request spam button for " + j);
        }
        int i = this.notificationsPreferences.getInt("dialog_bar_vis3" + j, 0);
        if (i != 1 && i != 3) {
            TLRPC$TL_messages_getPeerSettings tLRPC$TL_messages_getPeerSettings = new TLRPC$TL_messages_getPeerSettings();
            tLRPC$TL_messages_getPeerSettings.peer = getInputPeer(tLRPC$User != null ? tLRPC$User.id : -tLRPC$Chat.id);
            getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerSettings, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadPeerSettings$74(j, tLObject, tLRPC$TL_error);
                }
            });
        } else if (BuildVars.LOGS_ENABLED) {
            FileLog.d("dialog bar already hidden for " + j);
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
                MessagesController.this.lambda$loadPinnedDialogs$345(i, tLObject, tLRPC$TL_error);
            }
        });
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
                    if (i != 481674261) {
                        return TLRPC$TL_messages_dialogFilters.TLdeserialize(abstractSerializedData, i, z2);
                    }
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
                    abstractSerializedData.writeInt32(-271283063);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$loadRemoteFilters$27(tLObject, tLRPC$TL_error);
                }
            });
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
                MessagesController.this.lambda$loadSignUpNotificationsSettings$196(tLObject, tLRPC$TL_error);
            }
        });
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

    public void loadUnknownChannel(final TLRPC$Chat tLRPC$Chat, final long j) {
        Exception e;
        NativeByteBuffer nativeByteBuffer;
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
                            MessagesController.this.lambda$loadUnknownChannel$308(j, tLRPC$Chat, tLObject, tLRPC$TL_error);
                        }
                    });
                }
            } catch (Exception e3) {
                e = e3;
                nativeByteBuffer = null;
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadUnknownChannel$308(j, tLRPC$Chat, tLObject, tLRPC$TL_error);
            }
        });
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
            try {
                nativeByteBuffer = new NativeByteBuffer(tLRPC$InputPeer.getObjectSize() + 4);
            } catch (Exception e) {
                e = e;
                nativeByteBuffer = null;
            }
            try {
                nativeByteBuffer.writeInt32(15);
                tLRPC$InputPeer.serializeToStream(nativeByteBuffer);
            } catch (Exception e2) {
                e = e2;
                FileLog.e(e);
                j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                final long j2 = j;
                getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$loadUnknownDialog$197(j2, peerDialogId, tLObject, tLRPC$TL_error);
                    }
                });
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        final long j22 = j;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getPeerDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$loadUnknownDialog$197(j22, peerDialogId, tLObject, tLRPC$TL_error);
            }
        });
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
                MessagesController.this.lambda$loadUnreadDialogs$340(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void loadUserInfo(TLRPC$User tLRPC$User, boolean z, int i) {
        loadUserInfo(tLRPC$User, z, i, 0);
    }

    public void loadUserInfo(TLRPC$User tLRPC$User, boolean z, int i, int i2) {
        getMessagesStorage().loadUserInfo(tLRPC$User, z, i, i2);
    }

    public void loadUsersPremiumLocked(final ArrayList<TLRPC$User> arrayList, final Utilities.Callback<ArrayList<Long>> callback) {
        if (callback == null) {
            return;
        }
        if (getUserConfig().isPremium()) {
            callback.run(null);
            return;
        }
        TLRPC$TL_users_getIsPremiumRequiredToContact tLRPC$TL_users_getIsPremiumRequiredToContact = new TLRPC$TL_users_getIsPremiumRequiredToContact();
        MessagesController messagesController = getInstance(this.currentAccount);
        Iterator<TLRPC$User> it = arrayList.iterator();
        while (it.hasNext()) {
            tLRPC$TL_users_getIsPremiumRequiredToContact.id.add(messagesController.getInputUser(it.next()));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_users_getIsPremiumRequiredToContact, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$loadUsersPremiumLocked$274(arrayList, callback, tLObject, tLRPC$TL_error);
            }
        });
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
                boolean z2 = ((DialogFilter) arrayList.get(i)).locked;
                if (i < size) {
                    if (!z2) {
                        z = true;
                    }
                    ((DialogFilter) arrayList.get(i)).locked = true;
                } else {
                    if (z2) {
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
                    MessagesController.lambda$logDeviceStats$28(tLObject, tLRPC$TL_error);
                }
            });
        }
        this.loggedDeviceStats = true;
    }

    public void markAllTopicsAsRead(final long j) {
        getMessagesStorage().loadTopics(j, new j$.util.function.Consumer() {
            @Override
            public final void r(Object obj) {
                MessagesController.this.lambda$markAllTopicsAsRead$9(j, (ArrayList) obj);
            }

            @Override
            public j$.util.function.Consumer andThen(j$.util.function.Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    public void markDialogAsRead(final long j, final int i, final int i2, final int i3, final boolean z, final long j2, final int i4, final boolean z2, int i5) {
        if (j2 == 0) {
            boolean z3 = getNotificationsController().showBadgeMessages;
            if (DialogObject.isEncryptedDialog(j)) {
                if (i3 == 0) {
                    return;
                }
                TLRPC$EncryptedChat encryptedChat = getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)));
                getMessagesStorage().processPendingRead(j, i, i2, i5);
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$markDialogAsRead$234(j, i3, z, i4, i2);
                    }
                });
                if (encryptedChat != null && encryptedChat.ttl > 0) {
                    getMessagesStorage().createTaskForSecretChat(encryptedChat.id, i3, Math.max(getConnectionsManager().getCurrentTime(), i3), 0, null);
                }
            } else {
                if (i == 0) {
                    return;
                }
                Integer num = this.dialogs_read_inbox_max.get(Long.valueOf(j));
                if (num == null) {
                    num = 0;
                }
                this.dialogs_read_inbox_max.put(Long.valueOf(j), Integer.valueOf(Math.max(num.intValue(), i)));
                getMessagesStorage().processPendingRead(j, i, i2, i5);
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.this.lambda$markDialogAsRead$232(j, i4, i, z);
                    }
                });
                if (i == Integer.MAX_VALUE) {
                    return;
                }
            }
        } else if (i == Integer.MAX_VALUE) {
            return;
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markDialogAsRead$235(j2, j, z2, i3, i);
            }
        });
    }

    public void markDialogAsReadNow(final long j, final long j2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$markDialogAsReadNow$229(j2, j);
            }
        });
    }

    public void markDialogAsUnread(long j, TLRPC$InputPeer tLRPC$InputPeer, final long j2) {
        NativeByteBuffer nativeByteBuffer;
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(j);
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
                    DialogFilter dialogFilter = dialogFilterArr[i];
                    if (dialogFilter != null && (dialogFilter.flags & DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
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
                        MessagesController.this.lambda$markDialogAsUnread$338(j2, tLObject, tLRPC$TL_error);
                    }
                });
            }
            j2 = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_markDialogUnread, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$markDialogAsUnread$338(j2, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void markDialogMessageAsDeleted(long j, ArrayList<Integer> arrayList) {
        ArrayList arrayList2 = (ArrayList) this.dialogMessage.get(j);
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                MessageObject messageObject = (MessageObject) arrayList2.get(i);
                if (messageObject != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < arrayList.size()) {
                            if (messageObject.getId() == arrayList.get(i2).intValue()) {
                                messageObject.deleted = true;
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    public void markMentionMessageAsRead(int i, long j, long j2) {
        getMessagesStorage().markMentionMessageAsRead(-j, i, j2);
        if (j == 0) {
            TLRPC$TL_messages_readMessageContents tLRPC$TL_messages_readMessageContents = new TLRPC$TL_messages_readMessageContents();
            tLRPC$TL_messages_readMessageContents.id.add(Integer.valueOf(i));
            getConnectionsManager().sendRequest(tLRPC$TL_messages_readMessageContents, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$markMentionMessageAsRead$223(tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
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
                MessagesController.lambda$markMentionMessageAsRead$222(tLObject, tLRPC$TL_error);
            }
        });
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
                MessagesController.lambda$markMentionsAsRead$230(tLObject, tLRPC$TL_error);
            }
        });
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

    public void markMessageAsRead2(long j, int i, TLRPC$InputChannel tLRPC$InputChannel, int i2, long j2) {
        markMessageAsRead2(j, i, tLRPC$InputChannel, i2, j2, true);
    }

    public void markMessageAsRead2(long r15, int r17, org.telegram.tgnet.TLRPC$InputChannel r18, int r19, long r20, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.markMessageAsRead2(long, int, org.telegram.tgnet.TLRPC$InputChannel, int, long, boolean):void");
    }

    public void markMessageContentAsRead(MessageObject messageObject) {
        RequestDelegate requestDelegate;
        ConnectionsManager connectionsManager;
        TLRPC$TL_messages_readMessageContents tLRPC$TL_messages_readMessageContents;
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
            return;
        }
        if (messageObject.messageOwner.peer_id.channel_id != 0) {
            TLRPC$TL_channels_readMessageContents tLRPC$TL_channels_readMessageContents = new TLRPC$TL_channels_readMessageContents();
            TLRPC$InputChannel inputChannel = getInputChannel(messageObject.messageOwner.peer_id.channel_id);
            tLRPC$TL_channels_readMessageContents.channel = inputChannel;
            if (inputChannel == null) {
                return;
            }
            tLRPC$TL_channels_readMessageContents.id.add(Integer.valueOf(messageObject.getId()));
            ConnectionsManager connectionsManager2 = getConnectionsManager();
            requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$markMessageContentAsRead$220(tLObject, tLRPC$TL_error);
                }
            };
            tLRPC$TL_messages_readMessageContents = tLRPC$TL_channels_readMessageContents;
            connectionsManager = connectionsManager2;
        } else {
            TLRPC$TL_messages_readMessageContents tLRPC$TL_messages_readMessageContents2 = new TLRPC$TL_messages_readMessageContents();
            tLRPC$TL_messages_readMessageContents2.id.add(Integer.valueOf(messageObject.getId()));
            ConnectionsManager connectionsManager3 = getConnectionsManager();
            requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$markMessageContentAsRead$221(tLObject, tLRPC$TL_error);
                }
            };
            tLRPC$TL_messages_readMessageContents = tLRPC$TL_messages_readMessageContents2;
            connectionsManager = connectionsManager3;
        }
        connectionsManager.sendRequest(tLRPC$TL_messages_readMessageContents, requestDelegate);
    }

    public void markReactionsAsRead(long j, long j2) {
        if (j2 == 0) {
            TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(j);
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
                MessagesController.lambda$markReactionsAsRead$392(tLObject, tLRPC$TL_error);
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(UPDATE_MASK_REACTIONS_READ));
    }

    public void markSponsoredAsRead(long j, MessageObject messageObject) {
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

    public void onFilterUpdate(DialogFilter dialogFilter) {
        for (int i = 0; i < 2; i++) {
            if (this.selectedDialogFilter[i] == dialogFilter) {
                sortDialogs(null);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
                return;
            }
        }
    }

    public void onFolderEmpty(final int i) {
        if (getUserConfig().getDialogLoadOffsets(i)[0] != 2147483647L) {
            loadDialogs(i, 0, 10, false, new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$onFolderEmpty$186(i);
                }
            });
        } else if (i != 1) {
            removeFolder(i);
        } else {
            this.hasArchivedChats = false;
            checkArchiveFolder();
        }
    }

    public void openApp(TLRPC$User tLRPC$User, int i) {
        openApp(null, tLRPC$User, null, i, null);
    }

    public void openApp(final BaseFragment baseFragment, final TLRPC$User tLRPC$User, final String str, final int i, final Browser.Progress progress) {
        if (tLRPC$User == null) {
            return;
        }
        final boolean[] zArr = {false};
        if (progress != null) {
            progress.onCancel(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.lambda$openApp$451(zArr);
                }
            });
            progress.init();
        }
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$openApp$452(baseFragment, progress, zArr, tLRPC$User, str, r7);
            }
        };
        MediaDataController mediaDataController = getMediaDataController();
        long j = tLRPC$User.id;
        TL_bots$BotInfo botInfoCached = mediaDataController.getBotInfoCached(j, j);
        final TL_bots$BotInfo[] tL_bots$BotInfoArr = {botInfoCached};
        if (tLRPC$User.bot_has_main_app || botInfoCached != null) {
            runnable.run();
            return;
        }
        MediaDataController mediaDataController2 = getMediaDataController();
        long j2 = tLRPC$User.id;
        mediaDataController2.loadBotInfo(j2, j2, false, i, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                MessagesController.this.lambda$openApp$454(zArr, tL_bots$BotInfoArr, tLRPC$User, i, runnable, (TL_bots$BotInfo) obj);
            }
        });
    }

    public void openByUserName(String str, BaseFragment baseFragment, int i) {
        openByUserName(str, baseFragment, i, null);
    }

    public void openByUserName(java.lang.String r16, final org.telegram.ui.ActionBar.BaseFragment r17, final int r18, final org.telegram.messenger.browser.Browser.Progress r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.openByUserName(java.lang.String, org.telegram.ui.ActionBar.BaseFragment, int, org.telegram.messenger.browser.Browser$Progress):void");
    }

    public void openChatOrProfileWith(org.telegram.tgnet.TLRPC$User r6, org.telegram.tgnet.TLRPC$Chat r7, org.telegram.ui.ActionBar.BaseFragment r8, int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.openChatOrProfileWith(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.ui.ActionBar.BaseFragment, int, boolean):void");
    }

    public void performLogout(int i) {
        if (i == 1) {
            unregistedPush();
            getConnectionsManager().sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i2, boolean z) {
                    return TLRPC$TL_auth_loggedOut.TLdeserialize(abstractSerializedData, i2, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(1047706137);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$performLogout$300(tLObject, tLRPC$TL_error);
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
            for (int i2 = 0; i2 < size; i2++) {
                if (observers.get(i2) instanceof LaunchActivity) {
                    break;
                }
            }
        }
        if (UserConfig.selectedAccount == this.currentAccount) {
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

    public boolean pinDialog(long j, boolean z, TLRPC$InputPeer tLRPC$InputPeer, long j2) {
        NativeByteBuffer nativeByteBuffer;
        final long createPendingTask;
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(j);
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
                            MessagesController.this.lambda$pinDialog$342(createPendingTask, tLObject, tLRPC$TL_error);
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
                    MessagesController.this.lambda$pinDialog$342(createPendingTask, tLObject, tLRPC$TL_error);
                }
            });
        }
        getMessagesStorage().setDialogPinned(j, tLRPC$Dialog.pinnedNum);
        return true;
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
                MessagesController.this.lambda$pinMessage$123(i, tLRPC$Chat, tLRPC$User, z, tLObject, tLRPC$TL_error);
            }
        });
    }

    public boolean premiumFeaturesBlocked() {
        return this.premiumLocked && !getUserConfig().isPremium();
    }

    public boolean premiumPurchaseBlocked() {
        return this.premiumLocked;
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

    public void processChatInfo(final long j, final TLRPC$ChatFull tLRPC$ChatFull, final ArrayList<TLRPC$User> arrayList, final boolean z, final boolean z2, final boolean z3, final ArrayList<Integer> arrayList2, final HashMap<Integer, MessageObject> hashMap, final int i, final boolean z4) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processChatInfo$141(z, j, z3, z2, tLRPC$ChatFull, arrayList, arrayList2, hashMap, i, z4);
            }
        });
    }

    public boolean processDeletedReactionTags(TLRPC$Message tLRPC$Message) {
        TLRPC$TL_messageReactions tLRPC$TL_messageReactions;
        if (tLRPC$Message == null || DialogObject.getPeerDialogId(tLRPC$Message.peer_id) != getUserConfig().getClientUserId() || (tLRPC$TL_messageReactions = tLRPC$Message.reactions) == null || !tLRPC$TL_messageReactions.reactions_as_tags || tLRPC$TL_messageReactions.results == null) {
            return false;
        }
        long savedDialogId = MessageObject.getSavedDialogId(getUserConfig().getClientUserId(), tLRPC$Message);
        boolean z = false;
        for (int i = 0; i < tLRPC$Message.reactions.results.size(); i++) {
            if (updateSavedReactionTags(savedDialogId, ReactionsLayoutInBubble.VisibleReaction.fromTL(((TLRPC$ReactionCount) tLRPC$Message.reactions.results.get(i)).reaction), false, false)) {
                z = true;
            }
        }
        return z;
    }

    public void processDialogsUpdate(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, ArrayList<TLRPC$EncryptedChat> arrayList, final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processDialogsUpdate$218(tLRPC$messages_Dialogs, z);
            }
        });
    }

    public void processDialogsUpdateRead(final LongSparseIntArray longSparseIntArray, final LongSparseIntArray longSparseIntArray2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processDialogsUpdateRead$212(longSparseIntArray, longSparseIntArray2);
            }
        });
    }

    public void processLoadedAdminsResponse(long j, TLRPC$TL_channels_channelParticipants tLRPC$TL_channels_channelParticipants) {
        LongSparseArray longSparseArray = new LongSparseArray(tLRPC$TL_channels_channelParticipants.participants.size());
        for (int i = 0; i < tLRPC$TL_channels_channelParticipants.participants.size(); i++) {
            TLRPC$ChannelParticipant tLRPC$ChannelParticipant = (TLRPC$ChannelParticipant) tLRPC$TL_channels_channelParticipants.participants.get(i);
            longSparseArray.put(MessageObject.getPeerId(tLRPC$ChannelParticipant.peer), tLRPC$ChannelParticipant);
        }
        processLoadedChannelAdmins(longSparseArray, j, false);
    }

    public void processLoadedChannelAdmins(final LongSparseArray longSparseArray, final long j, final boolean z) {
        if (!z) {
            getMessagesStorage().putChannelAdmins(j, longSparseArray);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedChannelAdmins$60(j, longSparseArray, z);
            }
        });
    }

    public void processLoadedDeleteTask(final int i, final LongSparseArray longSparseArray, final LongSparseArray longSparseArray2) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedDeleteTask$82(longSparseArray, longSparseArray2, i);
            }
        });
    }

    public void processLoadedDialogFilters(final ArrayList<DialogFilter> arrayList, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final TLRPC$messages_Dialogs tLRPC$messages_Dialogs2, final ArrayList<TLRPC$User> arrayList2, final ArrayList<TLRPC$Chat> arrayList3, final ArrayList<TLRPC$EncryptedChat> arrayList4, final int i, final Runnable runnable) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedDialogFilters$20(tLRPC$messages_Dialogs, arrayList4, tLRPC$messages_Dialogs2, i, arrayList, arrayList2, arrayList3, runnable);
            }
        });
    }

    public void processLoadedDialogs(final TLRPC$messages_Dialogs tLRPC$messages_Dialogs, final ArrayList<TLRPC$EncryptedChat> arrayList, final ArrayList<TLRPC$UserFull> arrayList2, final int i, final int i2, final int i3, final int i4, final boolean z, final boolean z2, final boolean z3) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processLoadedDialogs$209(i, i4, tLRPC$messages_Dialogs, arrayList2, z, i3, arrayList, i2, z3, z2);
            }
        });
    }

    public void processLoadedMessages(final org.telegram.tgnet.TLRPC$messages_Messages r36, final int r37, final long r38, final long r40, final int r42, final int r43, final int r44, final boolean r45, final int r46, final int r47, final int r48, final int r49, final int r50, final int r51, final boolean r52, final int r53, final long r54, final int r56, final boolean r57, final int r58, final boolean r59, final boolean r60, final org.telegram.messenger.Timer r61) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processLoadedMessages(org.telegram.tgnet.TLRPC$messages_Messages, int, long, long, int, int, int, boolean, int, int, int, int, int, int, boolean, int, long, int, boolean, int, boolean, boolean, org.telegram.messenger.Timer):void");
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
            return;
        }
        if (i3 != i) {
            long j2 = this.updatesStartWaitTimeChannels.get(j);
            if (!((Boolean) this.gettingDifferenceChannels.get(j, Boolean.FALSE)).booleanValue() && j2 != 0 && Math.abs(System.currentTimeMillis() - j2) > 1500) {
                getChannelDifference(j);
                return;
            }
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
            ArrayList arrayList = (ArrayList) this.updatesQueueChannels.get(j);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.updatesQueueChannels.put(j, arrayList);
            }
            arrayList.add(userActionUpdatesPts);
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
                return;
            }
            if (getMessagesStorage().getLastSeqValue() != i) {
                if (!this.gettingDifference && this.updatesStartWaitTimeSeq != 0 && Math.abs(System.currentTimeMillis() - this.updatesStartWaitTimeSeq) > 1500) {
                    getDifference();
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("ADD UPDATE TO QUEUE seq = " + i);
                }
                if (this.updatesStartWaitTimeSeq == 0) {
                    this.updatesStartWaitTimeSeq = System.currentTimeMillis();
                }
                UserActionUpdatesSeq userActionUpdatesSeq = new UserActionUpdatesSeq(null);
                userActionUpdatesSeq.seq = i;
                this.updatesQueueSeq.add(userActionUpdatesSeq);
            }
        }
    }

    public boolean processUpdateArray(java.util.ArrayList<org.telegram.tgnet.TLRPC$Update> r75, java.util.ArrayList<org.telegram.tgnet.TLRPC$User> r76, java.util.ArrayList<org.telegram.tgnet.TLRPC$Chat> r77, boolean r78, int r79) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processUpdateArray(java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, boolean, int):boolean");
    }

    public void processUpdates(org.telegram.tgnet.TLRPC$Updates r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.processUpdates(org.telegram.tgnet.TLRPC$Updates, boolean):void");
    }

    public void processUserInfo(final TLRPC$User tLRPC$User, final TLRPC$UserFull tLRPC$UserFull, final boolean z, final boolean z2, final int i, final ArrayList<Integer> arrayList, final HashMap<Integer, MessageObject> hashMap, final int i2, final boolean z3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$processUserInfo$142(z, tLRPC$User, i, z2, tLRPC$UserFull, arrayList, hashMap, i2, z3);
            }
        });
    }

    public void putAllNeededDraftDialogs() {
        LongSparseArray drafts = getMediaDataController().getDrafts();
        int size = drafts.size();
        for (int i = 0; i < size; i++) {
            TLRPC$DraftMessage tLRPC$DraftMessage = (TLRPC$DraftMessage) ((LongSparseArray) drafts.valueAt(i)).get(0L);
            if (tLRPC$DraftMessage != null) {
                putDraftDialogIfNeed(drafts.keyAt(i), tLRPC$DraftMessage);
            }
        }
    }

    public void putChat(final org.telegram.tgnet.TLRPC$Chat r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.putChat(org.telegram.tgnet.TLRPC$Chat, boolean):void");
    }

    public void putChatFull(TLRPC$ChatFull tLRPC$ChatFull) {
        this.fullChats.put(tLRPC$ChatFull.id, tLRPC$ChatFull);
        getTranslateController().updateDialogFull(-tLRPC$ChatFull.id);
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

    public void putDialogsEndReachedAfterRegistration() {
        this.dialogsEndReached.put(0, true);
        this.serverDialogsEndReached.put(0, true);
    }

    public void putDraftDialogIfNeed(long j, TLRPC$DraftMessage tLRPC$DraftMessage) {
        if (this.dialogs_dict.indexOfKey(j) < 0) {
            MediaDataController mediaDataController = getMediaDataController();
            int size = this.allDialogs.size();
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
            tLRPC$TL_dialog.flags = (j >= 0 || !ChatObject.isChannel(getChat(Long.valueOf(-j)))) ? 0 : 1;
            this.dialogs_dict.put(j, tLRPC$TL_dialog);
            this.allDialogs.add(tLRPC$TL_dialog);
            sortDialogs(null);
        }
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
                    MessagesController.this.lambda$putUsers$52();
                }
            });
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
            SharedConfig.pushAuthKey = new byte[256];
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
                MessagesController.this.lambda$registerForPush$302(i, str, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void reloadMentionsCountForChannel(final TLRPC$InputPeer tLRPC$InputPeer, final long j) {
        Exception e;
        NativeByteBuffer nativeByteBuffer;
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(tLRPC$InputPeer.getObjectSize() + 4);
            } catch (Exception e2) {
                e = e2;
                nativeByteBuffer = null;
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
                        MessagesController.this.lambda$reloadMentionsCountForChannel$210(tLRPC$InputPeer, j, tLObject, tLRPC$TL_error);
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
                MessagesController.this.lambda$reloadMentionsCountForChannel$210(tLRPC$InputPeer, j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void reloadMentionsCountForChannels(final ArrayList<Long> arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$reloadMentionsCountForChannels$211(arrayList);
            }
        });
    }

    public void reloadReactionsNotifySettings() {
        getConnectionsManager().sendRequest(new TLRPC$TL_account_getReactionsNotifySettings(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$reloadReactionsNotifySettings$194(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void reloadUser(long j) {
        TLRPC$TL_users_getUsers tLRPC$TL_users_getUsers = new TLRPC$TL_users_getUsers();
        TLRPC$InputUser inputUser = getInputUser(j);
        if (inputUser == null) {
            return;
        }
        tLRPC$TL_users_getUsers.id.add(inputUser);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_users_getUsers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$reloadUser$51(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void reloadWebPages(final long j, HashMap<String, ArrayList<MessageObject>> hashMap, final int i) {
        HashMap<String, ArrayList<MessageObject>> hashMap2;
        LongSparseArray longSparseArray;
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
        final LongSparseArray longSparseArray2 = longSparseArray;
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
                    MessagesController.this.lambda$reloadWebPages$177(hashMap3, key, longSparseArray2, j, i, tLObject, tLRPC$TL_error);
                }
            });
        }
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

    public void removeDialogAction(long j, boolean z, boolean z2) {
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(j);
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

    public void removeDraftDialogIfNeed(long j) {
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) this.dialogs_dict.get(j);
        if (tLRPC$Dialog == null || tLRPC$Dialog.top_message != 0) {
            return;
        }
        this.dialogs_dict.remove(tLRPC$Dialog.id);
        this.allDialogs.remove(tLRPC$Dialog);
    }

    public void removeFilter(DialogFilter dialogFilter) {
        this.dialogFilters.remove(dialogFilter);
        this.dialogFiltersById.remove(dialogFilter.id);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
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
                MessagesController.this.lambda$removeFolderTemporarily$433(i, z);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$removeFolderTemporarily$434(z);
            }
        });
    }

    public void removeSuggestion(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (j == 0) {
            if (!this.pendingSuggestions.remove(str) && this.dismissedSuggestions.contains(str)) {
                return;
            }
            this.dismissedSuggestions.add(str);
            SharedPreferences.Editor edit = this.mainPreferences.edit();
            edit.putStringSet("pendingSuggestions", this.pendingSuggestions);
            edit.putStringSet("dismissedSuggestions", this.dismissedSuggestions);
            edit.commit();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        }
        TLRPC$TL_help_dismissSuggestion tLRPC$TL_help_dismissSuggestion = new TLRPC$TL_help_dismissSuggestion();
        tLRPC$TL_help_dismissSuggestion.suggestion = str;
        tLRPC$TL_help_dismissSuggestion.peer = j == 0 ? new TLRPC$TL_inputPeerEmpty() : getInputPeer(j);
        getConnectionsManager().sendRequest(tLRPC$TL_help_dismissSuggestion, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$removeSuggestion$35(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void renameSavedReactionTag(ReactionsLayoutInBubble.VisibleReaction visibleReaction, String str) {
        boolean z;
        boolean z2;
        long j;
        String str2;
        long m;
        LongSparseArray longSparseArray = this.reactionTags;
        if (longSparseArray == null) {
            return;
        }
        TLRPC$TL_messages_savedReactionsTags tLRPC$TL_messages_savedReactionsTags = (TLRPC$TL_messages_savedReactionsTags) longSparseArray.get(0L);
        if (tLRPC$TL_messages_savedReactionsTags == null) {
            LongSparseArray longSparseArray2 = this.reactionTags;
            TLRPC$TL_messages_savedReactionsTags tLRPC$TL_messages_savedReactionsTags2 = new TLRPC$TL_messages_savedReactionsTags();
            longSparseArray2.put(0L, tLRPC$TL_messages_savedReactionsTags2);
            tLRPC$TL_messages_savedReactionsTags = tLRPC$TL_messages_savedReactionsTags2;
        }
        int i = 0;
        while (true) {
            if (i >= tLRPC$TL_messages_savedReactionsTags.tags.size()) {
                z = false;
                z2 = false;
                break;
            }
            TLRPC$TL_savedReactionTag tLRPC$TL_savedReactionTag = (TLRPC$TL_savedReactionTag) tLRPC$TL_messages_savedReactionsTags.tags.get(i);
            if (visibleReaction.isSame(tLRPC$TL_savedReactionTag.reaction)) {
                if (TextUtils.isEmpty(str)) {
                    z = tLRPC$TL_savedReactionTag.title != null;
                    tLRPC$TL_savedReactionTag.flags &= -2;
                    tLRPC$TL_savedReactionTag.title = null;
                } else {
                    z = !TextUtils.equals(tLRPC$TL_savedReactionTag.title, str);
                    tLRPC$TL_savedReactionTag.flags |= 1;
                    tLRPC$TL_savedReactionTag.title = str;
                }
                z2 = true;
            } else {
                i++;
            }
        }
        if (!z2) {
            TLRPC$TL_savedReactionTag tLRPC$TL_savedReactionTag2 = new TLRPC$TL_savedReactionTag();
            tLRPC$TL_savedReactionTag2.reaction = visibleReaction.toTLReaction();
            if (!TextUtils.isEmpty(str)) {
                tLRPC$TL_savedReactionTag2.title = str;
            }
            tLRPC$TL_savedReactionTag2.count = 1;
            tLRPC$TL_messages_savedReactionsTags.tags.add(tLRPC$TL_savedReactionTag2);
            z = true;
        }
        if (z) {
            TLRPC$TL_messages_updateSavedReactionTag tLRPC$TL_messages_updateSavedReactionTag = new TLRPC$TL_messages_updateSavedReactionTag();
            tLRPC$TL_messages_updateSavedReactionTag.reaction = visibleReaction.toTLReaction();
            if (!TextUtils.isEmpty(str)) {
                tLRPC$TL_messages_updateSavedReactionTag.flags |= 1;
                tLRPC$TL_messages_updateSavedReactionTag.title = str;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_updateSavedReactionTag, null);
            Collections.sort(tLRPC$TL_messages_savedReactionsTags.tags, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$renameSavedReactionTag$438;
                    lambda$renameSavedReactionTag$438 = MessagesController.this.lambda$renameSavedReactionTag$438((TLRPC$TL_savedReactionTag) obj, (TLRPC$TL_savedReactionTag) obj2);
                    return lambda$renameSavedReactionTag$438;
                }
            });
            long j2 = 0;
            for (int i2 = 0; i2 < tLRPC$TL_messages_savedReactionsTags.tags.size(); i2++) {
                TLRPC$TL_savedReactionTag tLRPC$TL_savedReactionTag3 = (TLRPC$TL_savedReactionTag) tLRPC$TL_messages_savedReactionsTags.tags.get(i2);
                if (tLRPC$TL_savedReactionTag3.count > 0) {
                    TLRPC$Reaction tLRPC$Reaction = tLRPC$TL_savedReactionTag3.reaction;
                    if (tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) {
                        j = MessagesController$$ExternalSyntheticBackport9.m(r7, 0, Utilities.MD5(((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon).substring(0, 16).length(), 16);
                    } else {
                        if (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) {
                            j = ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id;
                        }
                        if ((tLRPC$TL_savedReactionTag3.flags & 1) != 0 && (str2 = tLRPC$TL_savedReactionTag3.title) != null) {
                            m = MessagesController$$ExternalSyntheticBackport11.m(r7, 0, Utilities.MD5(str2).substring(0, 16).length(), 16);
                            j2 = MediaDataController.calcHash(j2, m);
                        }
                        j2 = MediaDataController.calcHash(j2, tLRPC$TL_savedReactionTag3.count);
                    }
                    j2 = MediaDataController.calcHash(j2, j);
                    if ((tLRPC$TL_savedReactionTag3.flags & 1) != 0) {
                        m = MessagesController$$ExternalSyntheticBackport11.m(r7, 0, Utilities.MD5(str2).substring(0, 16).length(), 16);
                        j2 = MediaDataController.calcHash(j2, m);
                    }
                    j2 = MediaDataController.calcHash(j2, tLRPC$TL_savedReactionTag3.count);
                }
            }
            tLRPC$TL_messages_savedReactionsTags.hash = j2;
            saveSavedReactionsTags(0L, tLRPC$TL_messages_savedReactionsTags);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, 0L);
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
            try {
                nativeByteBuffer = new NativeByteBuffer(i2 + 12);
                try {
                    nativeByteBuffer.writeInt32(16);
                    nativeByteBuffer.writeInt32(i);
                    nativeByteBuffer.writeInt32(tLRPC$TL_messages_reorderPinnedDialogs.order.size());
                    int size2 = tLRPC$TL_messages_reorderPinnedDialogs.order.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((TLRPC$InputDialogPeer) tLRPC$TL_messages_reorderPinnedDialogs.order.get(i4)).serializeToStream(nativeByteBuffer);
                    }
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_reorderPinnedDialogs, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            MessagesController.this.lambda$reorderPinnedDialogs$341(j, tLObject, tLRPC$TL_error);
                        }
                    });
                }
            } catch (Exception e2) {
                e = e2;
                nativeByteBuffer = null;
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        } else {
            tLRPC$TL_messages_reorderPinnedDialogs.order = arrayList;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_messages_reorderPinnedDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$reorderPinnedDialogs$341(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void reportSpam(long j, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, TLRPC$EncryptedChat tLRPC$EncryptedChat, boolean z) {
        long j2;
        RequestDelegate requestDelegate;
        long j3;
        ConnectionsManager connectionsManager;
        TLRPC$TL_messages_reportSpam tLRPC$TL_messages_reportSpam;
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
            ConnectionsManager connectionsManager2 = getConnectionsManager();
            requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$reportSpam$70(tLObject, tLRPC$TL_error);
                }
            };
            tLRPC$TL_messages_reportSpam = tLRPC$TL_messages_reportEncryptedSpam;
            connectionsManager = connectionsManager2;
        } else if (z) {
            TLRPC$TL_account_reportPeer tLRPC$TL_account_reportPeer = new TLRPC$TL_account_reportPeer();
            if (tLRPC$Chat != null) {
                j3 = -tLRPC$Chat.id;
            } else {
                if (tLRPC$User != null) {
                    j3 = tLRPC$User.id;
                }
                tLRPC$TL_account_reportPeer.message = "";
                tLRPC$TL_account_reportPeer.reason = new TLRPC$ReportReason() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                        abstractSerializedData.writeInt32(-606798099);
                    }
                };
                ConnectionsManager connectionsManager3 = getConnectionsManager();
                requestDelegate = new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.lambda$reportSpam$71(tLObject, tLRPC$TL_error);
                    }
                };
                tLRPC$TL_messages_reportSpam = tLRPC$TL_account_reportPeer;
                connectionsManager = connectionsManager3;
            }
            tLRPC$TL_account_reportPeer.peer = getInputPeer(j3);
            tLRPC$TL_account_reportPeer.message = "";
            tLRPC$TL_account_reportPeer.reason = new TLRPC$ReportReason() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(-606798099);
                }
            };
            ConnectionsManager connectionsManager32 = getConnectionsManager();
            requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$reportSpam$71(tLObject, tLRPC$TL_error);
                }
            };
            tLRPC$TL_messages_reportSpam = tLRPC$TL_account_reportPeer;
            connectionsManager = connectionsManager32;
        } else {
            TLRPC$TL_messages_reportSpam tLRPC$TL_messages_reportSpam2 = new TLRPC$TL_messages_reportSpam();
            if (tLRPC$Chat != null) {
                j2 = -tLRPC$Chat.id;
            } else {
                if (tLRPC$User != null) {
                    j2 = tLRPC$User.id;
                }
                ConnectionsManager connectionsManager4 = getConnectionsManager();
                requestDelegate = new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.lambda$reportSpam$72(tLObject, tLRPC$TL_error);
                    }
                };
                tLRPC$TL_messages_reportSpam = tLRPC$TL_messages_reportSpam2;
                connectionsManager = connectionsManager4;
            }
            tLRPC$TL_messages_reportSpam2.peer = getInputPeer(j2);
            ConnectionsManager connectionsManager42 = getConnectionsManager();
            requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.lambda$reportSpam$72(tLObject, tLRPC$TL_error);
                }
            };
            tLRPC$TL_messages_reportSpam = tLRPC$TL_messages_reportSpam2;
            connectionsManager = connectionsManager42;
        }
        connectionsManager.sendRequest(tLRPC$TL_messages_reportSpam, requestDelegate, 2);
    }

    public void requestContactToken(final long j, final Utilities.Callback<TLRPC$TL_exportedContactToken> callback) {
        if (callback == null || this.requestingContactToken) {
            return;
        }
        if (this.cachedContactToken != null && r0.expires > System.currentTimeMillis() / 1000) {
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
                MessagesController.this.lambda$requestContactToken$430(callback, j, currentTimeMillis, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void requestContactToken(Utilities.Callback<TLRPC$TL_exportedContactToken> callback) {
        requestContactToken(0L, callback);
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
                MessagesController.this.lambda$saveGif$137(obj, tLRPC$TL_messages_saveGif, tLObject, tLRPC$TL_error);
            }
        });
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
                MessagesController.this.lambda$saveRecentSticker$138(obj, tLRPC$TL_messages_saveRecentSticker, tLObject, tLRPC$TL_error);
            }
        });
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
                    MessagesController.lambda$saveTheme$112(tLObject, tLRPC$TL_error);
                }
            });
            getConnectionsManager().resumeNetworkMaybe();
        }
        if (z2) {
            return;
        }
        installTheme(themeInfo, themeAccent, z);
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
                MessagesController.this.lambda$saveThemeToServer$116(str2, file2, themeAccent, themeInfo);
            }
        });
    }

    public void saveWallpaperToServer(java.io.File r8, org.telegram.ui.ActionBar.Theme.OverrideWallpaperInfo r9, boolean r10, final long r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.saveWallpaperToServer(java.io.File, org.telegram.ui.ActionBar.Theme$OverrideWallpaperInfo, boolean, long):void");
    }

    public void selectDialogFilter(DialogFilter dialogFilter, int i) {
        DialogFilter[] dialogFilterArr = this.selectedDialogFilter;
        DialogFilter dialogFilter2 = dialogFilterArr[i];
        if (dialogFilter2 == dialogFilter) {
            return;
        }
        dialogFilterArr[i] = dialogFilter;
        if (dialogFilterArr[i == 0 ? (char) 1 : (char) 0] == dialogFilter) {
            dialogFilterArr[i == 0 ? (char) 1 : (char) 0] = null;
        }
        if (dialogFilterArr[i] != null) {
            sortDialogs(null);
        } else if (dialogFilter2 != null) {
            dialogFilter2.dialogs.clear();
            dialogFilter2.dialogsForward.clear();
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
                MessagesController.this.lambda$sendBotStart$272(tLObject, tLRPC$TL_error);
            }
        });
    }

    public boolean sendTyping(long j, long j2, int i, int i2) {
        return sendTyping(j, j2, i, null, i2);
    }

    public boolean sendTyping(final long r17, final long r19, final int r21, java.lang.String r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.sendTyping(long, long, int, java.lang.String, int):boolean");
    }

    public void setBoostsToUnblockRestrictions(final long j, int i) {
        TLRPC$TL_channels_setBoostsToUnblockRestrictions tLRPC$TL_channels_setBoostsToUnblockRestrictions = new TLRPC$TL_channels_setBoostsToUnblockRestrictions();
        tLRPC$TL_channels_setBoostsToUnblockRestrictions.boosts = i;
        tLRPC$TL_channels_setBoostsToUnblockRestrictions.channel = getInputChannel(j);
        getConnectionsManager().sendRequest(tLRPC$TL_channels_setBoostsToUnblockRestrictions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setBoostsToUnblockRestrictions$90(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void setChannelSlowMode(final long j, int i) {
        TLRPC$TL_channels_toggleSlowMode tLRPC$TL_channels_toggleSlowMode = new TLRPC$TL_channels_toggleSlowMode();
        tLRPC$TL_channels_toggleSlowMode.seconds = i;
        tLRPC$TL_channels_toggleSlowMode.channel = getInputChannel(j);
        getConnectionsManager().sendRequest(tLRPC$TL_channels_toggleSlowMode, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setChannelSlowMode$88(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void setChatPendingRequestsOnClose(long j, int i) {
        this.mainPreferences.edit().putInt("chatPendingRequests" + j, i).apply();
    }

    public void setChatReactions(final long j, int i, List<String> list) {
        TLRPC$ChatReactions tLRPC$TL_chatReactionsAll;
        final TLRPC$TL_messages_setChatAvailableReactions tLRPC$TL_messages_setChatAvailableReactions = new TLRPC$TL_messages_setChatAvailableReactions();
        tLRPC$TL_messages_setChatAvailableReactions.peer = getInputPeer(-j);
        if (i == 2) {
            tLRPC$TL_chatReactionsAll = new TLRPC$TL_chatReactionsNone();
        } else {
            if (i != 0) {
                TLRPC$TL_chatReactionsSome tLRPC$TL_chatReactionsSome = new TLRPC$TL_chatReactionsSome();
                tLRPC$TL_messages_setChatAvailableReactions.available_reactions = tLRPC$TL_chatReactionsSome;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    TLRPC$TL_reactionEmoji tLRPC$TL_reactionEmoji = new TLRPC$TL_reactionEmoji();
                    tLRPC$TL_reactionEmoji.emoticon = list.get(i2);
                    tLRPC$TL_chatReactionsSome.reactions.add(tLRPC$TL_reactionEmoji);
                }
                getConnectionsManager().sendRequest(tLRPC$TL_messages_setChatAvailableReactions, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        MessagesController.this.lambda$setChatReactions$425(j, tLRPC$TL_messages_setChatAvailableReactions, tLObject, tLRPC$TL_error);
                    }
                });
            }
            tLRPC$TL_chatReactionsAll = new TLRPC$TL_chatReactionsAll();
        }
        tLRPC$TL_messages_setChatAvailableReactions.available_reactions = tLRPC$TL_chatReactionsAll;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_setChatAvailableReactions, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setChatReactions$425(j, tLRPC$TL_messages_setChatAvailableReactions, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void setContentSettings(boolean z) {
        TL_account$contentSettings tL_account$contentSettings = this.contentSettings;
        if (tL_account$contentSettings != null) {
            if (!tL_account$contentSettings.sensitive_can_change) {
                return;
            } else {
                tL_account$contentSettings.sensitive_enabled = z;
            }
        }
        if (this.ignoreRestrictionReasons == null) {
            this.ignoreRestrictionReasons = new HashSet();
        }
        Set<String> set = this.ignoreRestrictionReasons;
        if (z) {
            set.add("sensitive");
        } else {
            set.remove("sensitive");
        }
        TL_account$setContentSettings tL_account$setContentSettings = new TL_account$setContentSettings();
        tL_account$setContentSettings.sensitive_enabled = z;
        getConnectionsManager().sendRequest(tL_account$setContentSettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$setContentSettings$458(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void setCustomChatReactions(final long r15, int r17, java.util.List<org.telegram.tgnet.TLRPC$Reaction> r18, int r19, java.lang.Boolean r20, final org.telegram.messenger.Utilities.Callback<org.telegram.tgnet.TLRPC$TL_error> r21, final java.lang.Runnable r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.setCustomChatReactions(long, int, java.util.List, int, java.lang.Boolean, org.telegram.messenger.Utilities$Callback, java.lang.Runnable):void");
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
                MessagesController.this.lambda$setDefaultBannedRole$93(j, baseFragment, tLRPC$TL_messages_editChatDefaultBannedRights, z, tLObject, tLRPC$TL_error);
            }
        });
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
                MessagesController.this.lambda$setDefaultSendAs$255(j, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void setDialogHistoryTTL(long j, int i) {
        TLRPC$UserFull tLRPC$UserFull;
        TLRPC$TL_messages_setHistoryTTL tLRPC$TL_messages_setHistoryTTL = new TLRPC$TL_messages_setHistoryTTL();
        tLRPC$TL_messages_setHistoryTTL.peer = getInputPeer(j);
        tLRPC$TL_messages_setHistoryTTL.period = i;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_setHistoryTTL, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setDialogHistoryTTL$128(tLObject, tLRPC$TL_error);
            }
        });
        TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) getMessagesController().dialogs_dict.get(j);
        if (tLRPC$Dialog != null) {
            tLRPC$Dialog.ttl_period = i;
        }
        getMessagesStorage().setDialogTtl(j, i);
        TLRPC$ChatFull tLRPC$ChatFull = null;
        if (j > 0) {
            tLRPC$UserFull = getUserFull(j);
            if (tLRPC$UserFull != null) {
                tLRPC$UserFull.ttl_period = i;
                tLRPC$UserFull.flags |= 16384;
            }
        } else {
            TLRPC$ChatFull chatFull = getChatFull(-j);
            if (chatFull != null) {
                chatFull.ttl_period = i;
                chatFull.flags = chatFull instanceof TLRPC$TL_channelFull ? chatFull.flags | 16777216 : chatFull.flags | 16384;
            }
            tLRPC$ChatFull = chatFull;
            tLRPC$UserFull = null;
        }
        if (tLRPC$ChatFull == null) {
            if (tLRPC$UserFull != null) {
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), tLRPC$UserFull);
            }
        } else {
            NotificationCenter notificationCenter = getNotificationCenter();
            int i2 = NotificationCenter.chatInfoDidLoad;
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, tLRPC$ChatFull, 0, bool, bool);
        }
    }

    public void setDialogsInTransaction(boolean z) {
        this.dialogsInTransaction = z;
        if (z) {
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public void setFolderTags(boolean z) {
        SharedPreferences.Editor edit = this.mainPreferences.edit();
        this.folderTags = z;
        edit.putBoolean("folderTags", z).apply();
    }

    public void setLastCreatedDialogId(final long j, final boolean z, final boolean z2) {
        if (!z) {
            ArrayList<Long> arrayList = this.createdDialogMainThreadIds;
            Long valueOf = Long.valueOf(j);
            if (!z2) {
                arrayList.remove(valueOf);
                SparseArray sparseArray = (SparseArray) this.pollsToCheck.get(j);
                if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        ((MessageObject) sparseArray.valueAt(i)).pollVisibleOnScreen = false;
                    }
                }
            } else if (arrayList.contains(valueOf)) {
                return;
            } else {
                arrayList.add(Long.valueOf(j));
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$setLastCreatedDialogId$50(z, z2, j);
            }
        });
    }

    public void setLastVisibleDialogId(long j, boolean z, boolean z2) {
        ArrayList<Long> arrayList = z ? this.visibleScheduledDialogMainThreadIds : this.visibleDialogMainThreadIds;
        if (!z2) {
            arrayList.remove(Long.valueOf(j));
        } else {
            if (arrayList.contains(Long.valueOf(j))) {
                return;
            }
            arrayList.add(Long.valueOf(j));
        }
    }

    public void setParticipantBannedRole(long j, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, boolean z, BaseFragment baseFragment) {
        setParticipantBannedRole(j, tLRPC$User, tLRPC$Chat, tLRPC$TL_chatBannedRights, z, baseFragment, null);
    }

    public void setParticipantBannedRole(final long j, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, final boolean z, final BaseFragment baseFragment, final Runnable runnable) {
        if ((tLRPC$User == null && tLRPC$Chat == null) || tLRPC$TL_chatBannedRights == null) {
            return;
        }
        final TLRPC$TL_channels_editBanned tLRPC$TL_channels_editBanned = new TLRPC$TL_channels_editBanned();
        tLRPC$TL_channels_editBanned.channel = getInputChannel(j);
        tLRPC$TL_channels_editBanned.participant = tLRPC$User != null ? getInputPeer(tLRPC$User) : getInputPeer(tLRPC$Chat);
        tLRPC$TL_channels_editBanned.banned_rights = tLRPC$TL_chatBannedRights;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_editBanned, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$setParticipantBannedRole$86(j, runnable, baseFragment, tLRPC$TL_channels_editBanned, z, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void setReferer(String str) {
        if (str == null) {
            return;
        }
        this.installReferer = str;
        this.mainPreferences.edit().putString("installReferer", str).commit();
    }

    public void setSavedViewAs(boolean z) {
        if (this.savedViewAsChats != z) {
            SharedPreferences.Editor edit = this.mainPreferences.edit();
            this.savedViewAsChats = z;
            edit.putBoolean("savedViewAsChats", z).apply();
        }
    }

    public void setStoryQuality(boolean z) {
        if (this.storyQualityFull != z) {
            SharedPreferences.Editor edit = this.mainPreferences.edit();
            this.storyQualityFull = z;
            edit.putBoolean("storyQualityFull", z).apply();
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyQualityUpdate, new Object[0]);
        }
    }

    public void setUserAdminRole(long j, TLRPC$User tLRPC$User, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, String str, boolean z, BaseFragment baseFragment, boolean z2, boolean z3, String str2, Runnable runnable) {
        setUserAdminRole(j, tLRPC$User, tLRPC$TL_chatAdminRights, str, z, baseFragment, z2, z3, str2, runnable, null);
    }

    public void setUserAdminRole(final long j, final TLRPC$User tLRPC$User, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, String str, final boolean z, final BaseFragment baseFragment, boolean z2, boolean z3, String str2, final Runnable runnable, final ErrorDelegate errorDelegate) {
        int i;
        boolean z4;
        MessagesController messagesController;
        long j2;
        TLRPC$User tLRPC$User2;
        String str3;
        BaseFragment baseFragment2;
        Runnable runnable2;
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
                    MessagesController.this.lambda$setUserAdminRole$98(j, runnable, chat, tLRPC$User, errorDelegate, baseFragment, tLRPC$TL_channels_editAdmin, z, tLObject, tLRPC$TL_error);
                }
            };
            if (tLRPC$User.bot || !z2) {
                getConnectionsManager().sendRequest(tLRPC$TL_channels_editAdmin, requestDelegate);
                return;
            }
            runnable2 = new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setUserAdminRole$99(tLRPC$TL_channels_editAdmin, requestDelegate);
                }
            };
            i = 0;
            z4 = true;
            messagesController = this;
            j2 = j;
            tLRPC$User2 = tLRPC$User;
            str3 = str2;
            baseFragment2 = baseFragment;
        } else {
            final TLRPC$TL_messages_editChatAdmin tLRPC$TL_messages_editChatAdmin = new TLRPC$TL_messages_editChatAdmin();
            tLRPC$TL_messages_editChatAdmin.chat_id = j;
            tLRPC$TL_messages_editChatAdmin.user_id = getInputUser(tLRPC$User);
            tLRPC$TL_messages_editChatAdmin.is_admin = z3 || tLRPC$TL_chatAdminRights.change_info || tLRPC$TL_chatAdminRights.delete_messages || tLRPC$TL_chatAdminRights.ban_users || tLRPC$TL_chatAdminRights.invite_users || tLRPC$TL_chatAdminRights.pin_messages || tLRPC$TL_chatAdminRights.add_admins || tLRPC$TL_chatAdminRights.manage_call;
            final RequestDelegate requestDelegate2 = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessagesController.this.lambda$setUserAdminRole$103(j, runnable, baseFragment, tLRPC$TL_messages_editChatAdmin, errorDelegate, tLObject, tLRPC$TL_error);
                }
            };
            if (!tLRPC$TL_messages_editChatAdmin.is_admin && !z2 && TextUtils.isEmpty(str2)) {
                getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatAdmin, requestDelegate2);
                return;
            }
            i = 0;
            z4 = true;
            messagesController = this;
            j2 = j;
            tLRPC$User2 = tLRPC$User;
            str3 = str2;
            baseFragment2 = baseFragment;
            runnable2 = new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$setUserAdminRole$104(tLRPC$TL_messages_editChatAdmin, requestDelegate2);
                }
            };
        }
        messagesController.addUserToChat(j2, tLRPC$User2, i, str3, baseFragment2, z4, runnable2, errorDelegate);
    }

    public boolean showSensitiveContent() {
        if (this.contentSettings != null && System.currentTimeMillis() - this.contentSettingsLoadedTime < 3600000) {
            return this.contentSettings.sensitive_enabled;
        }
        Set<String> set = this.ignoreRestrictionReasons;
        return set == null || set.contains("sensitive");
    }

    public void sortDialogs(androidx.collection.LongSparseArray r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.sortDialogs(androidx.collection.LongSparseArray):void");
    }

    public void sortDialogsList(ArrayList<TLRPC$Dialog> arrayList) {
        if (arrayList == null) {
            return;
        }
        Collections.sort(arrayList, this.dialogComparator);
    }

    public boolean starsPurchaseAvailable() {
        return !this.starsLocked;
    }

    public void startShortPoll(TLRPC$Chat tLRPC$Chat, int i, boolean z) {
        startShortPoll(tLRPC$Chat, i, z, null);
    }

    public void startShortPoll(final TLRPC$Chat tLRPC$Chat, final int i, final boolean z, final androidx.core.util.Consumer consumer) {
        if (tLRPC$Chat == null) {
            return;
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$startShortPoll$311(tLRPC$Chat, z, i, consumer);
            }
        });
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
        return c != 0 ? c == 1 : getUserConfig().isPremium();
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
        return c != 0 ? c == 1 : getUserConfig().isPremium();
    }

    public boolean storyEntitiesAllowed(TLRPC$User tLRPC$User) {
        char c;
        if (tLRPC$User != null && tLRPC$User.id == this.storiesChangelogUserId) {
            return true;
        }
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
        return c != 0 ? c == 1 : tLRPC$User != null && tLRPC$User.premium;
    }

    public void toggleChannelForum(long j, boolean z) {
        TLRPC$TL_channels_toggleForum tLRPC$TL_channels_toggleForum = new TLRPC$TL_channels_toggleForum();
        tLRPC$TL_channels_toggleForum.channel = getInputChannel(j);
        tLRPC$TL_channels_toggleForum.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_toggleForum, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toggleChannelForum$265(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void toggleChannelInvitesHistory(long j, boolean z) {
        TLRPC$TL_channels_togglePreHistoryHidden tLRPC$TL_channels_togglePreHistoryHidden = new TLRPC$TL_channels_togglePreHistoryHidden();
        tLRPC$TL_channels_togglePreHistoryHidden.channel = getInputChannel(j);
        tLRPC$TL_channels_togglePreHistoryHidden.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_togglePreHistoryHidden, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toggleChannelInvitesHistory$267(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void toggleChannelSignatures(long j, boolean z, boolean z2) {
        TLRPC$Chat chat = getChat(Long.valueOf(j));
        if (chat != null) {
            chat.signatures = z;
            chat.signature_profiles = z2;
            putChat(chat, true);
        }
        TLRPC$TL_channels_toggleSignatures tLRPC$TL_channels_toggleSignatures = new TLRPC$TL_channels_toggleSignatures();
        tLRPC$TL_channels_toggleSignatures.channel = getInputChannel(j);
        tLRPC$TL_channels_toggleSignatures.signatures_enabled = z;
        tLRPC$TL_channels_toggleSignatures.profiles_enabled = z2;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_toggleSignatures, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toggleChannelSignatures$263(tLObject, tLRPC$TL_error);
            }
        }, 64);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateAllMessages, Long.valueOf(-j));
    }

    public void toggleChatJoinRequest(long j, boolean z, final Runnable runnable, final Runnable runnable2) {
        TLRPC$TL_channels_toggleJoinRequest tLRPC$TL_channels_toggleJoinRequest = new TLRPC$TL_channels_toggleJoinRequest();
        tLRPC$TL_channels_toggleJoinRequest.channel = getInputChannel(j);
        tLRPC$TL_channels_toggleJoinRequest.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_toggleJoinRequest, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toggleChatJoinRequest$261(runnable, runnable2, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void toggleChatJoinToSend(long j, boolean z, final Runnable runnable, final Runnable runnable2) {
        TLRPC$TL_channels_toggleJoinToSend tLRPC$TL_channels_toggleJoinToSend = new TLRPC$TL_channels_toggleJoinToSend();
        tLRPC$TL_channels_toggleJoinToSend.channel = getInputChannel(j);
        tLRPC$TL_channels_toggleJoinToSend.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_toggleJoinToSend, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toggleChatJoinToSend$259(runnable, runnable2, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void toggleChatNoForwards(long j, boolean z) {
        TLRPC$TL_messages_toggleNoForwards tLRPC$TL_messages_toggleNoForwards = new TLRPC$TL_messages_toggleNoForwards();
        tLRPC$TL_messages_toggleNoForwards.peer = getInputPeer(-j);
        tLRPC$TL_messages_toggleNoForwards.enabled = z;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_toggleNoForwards, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$toggleChatNoForwards$257(tLObject, tLRPC$TL_error);
            }
        }, 64);
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
            tLRPC$User = user;
            chat = null;
        } else {
            chat = getChat(Long.valueOf(-j));
            if (chat == null) {
                return;
            }
        }
        this.totalBlockedCount--;
        this.blockePeers.delete(j);
        tLRPC$TL_contacts_unblock.id = tLRPC$User != null ? getInputPeer(tLRPC$User) : getInputPeer(chat);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.blockedUsersDidLoad, new Object[0]);
        getConnectionsManager().sendRequest(tLRPC$TL_contacts_unblock, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.lambda$unblockPeer$106(runnable, tLObject, tLRPC$TL_error);
            }
        });
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
                MessagesController.this.lambda$unpinAllMessages$122(tLRPC$Chat, tLRPC$User, tLObject, tLRPC$TL_error);
            }
        });
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
                    MessagesController.lambda$unregistedPush$298(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void updateChannelUserName(final BaseFragment baseFragment, final long j, final String str, final Runnable runnable, final Runnable runnable2) {
        final TLRPC$TL_channels_updateUsername tLRPC$TL_channels_updateUsername = new TLRPC$TL_channels_updateUsername();
        tLRPC$TL_channels_updateUsername.channel = getInputChannel(j);
        tLRPC$TL_channels_updateUsername.username = str;
        getConnectionsManager().sendRequest(tLRPC$TL_channels_updateUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$updateChannelUserName$271(j, str, runnable, baseFragment, tLRPC$TL_channels_updateUsername, runnable2, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void updateChatAbout(long j, final String str, final TLRPC$ChatFull tLRPC$ChatFull) {
        TLRPC$TL_messages_editChatAbout tLRPC$TL_messages_editChatAbout = new TLRPC$TL_messages_editChatAbout();
        tLRPC$TL_messages_editChatAbout.peer = getInputPeer(-j);
        tLRPC$TL_messages_editChatAbout.about = str;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_editChatAbout, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessagesController.this.lambda$updateChatAbout$269(tLRPC$ChatFull, str, tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void updateConfig(final TLRPC$TL_config tLRPC$TL_config) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessagesController.this.lambda$updateConfig$36(tLRPC$TL_config);
            }
        });
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
                MessagesController.lambda$updateEmojiStatus$29(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void updateEmojiStatusUntil() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        Long l = null;
        int i = 0;
        while (i < this.emojiStatusUntilValues.size()) {
            if (((Integer) this.emojiStatusUntilValues.valueAt(i)).intValue() > currentTimeMillis) {
                l = Long.valueOf(Math.min(l == null ? Long.MAX_VALUE : l.longValue(), r5 - currentTimeMillis));
            } else {
                this.emojiStatusUntilValues.removeAt(i);
                i--;
            }
            i++;
        }
        if (l == null) {
            Runnable runnable = this.recentEmojiStatusUpdateRunnable;
            if (runnable != null) {
                this.recentEmojiStatusUpdateRunnableTime = -1L;
                this.recentEmojiStatusUpdateRunnableTimeout = -1L;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                return;
            }
            return;
        }
        long longValue = l.longValue() + 2;
        long j = currentTimeMillis;
        if (j + longValue != this.recentEmojiStatusUpdateRunnableTime + this.recentEmojiStatusUpdateRunnableTimeout) {
            AndroidUtilities.cancelRunOnUIThread(this.recentEmojiStatusUpdateRunnable);
            this.recentEmojiStatusUpdateRunnableTime = j;
            this.recentEmojiStatusUpdateRunnableTimeout = longValue;
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    MessagesController.this.lambda$updateEmojiStatusUntil$428();
                }
            };
            this.recentEmojiStatusUpdateRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, longValue * 1000);
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

    public boolean updateInterfaceWithMessages(final long r27, java.util.ArrayList<org.telegram.messenger.MessageObject> r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.updateInterfaceWithMessages(long, java.util.ArrayList, int):boolean");
    }

    public void updatePremium(boolean z) {
        if (this.dialogFilters.isEmpty()) {
            return;
        }
        if (z) {
            for (int i = 0; i < this.dialogFilters.size(); i++) {
                this.dialogFilters.get(i).locked = false;
            }
        } else {
            if (!this.dialogFilters.get(0).isDefault()) {
                int i2 = 1;
                while (true) {
                    if (i2 >= this.dialogFilters.size()) {
                        break;
                    }
                    if (this.dialogFilters.get(i2).isDefault()) {
                        this.dialogFilters.add(0, this.dialogFilters.remove(i2));
                        break;
                    }
                    i2++;
                }
            }
            lockFiltersInternal();
        }
        getMessagesStorage().saveDialogFiltersOrder();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        getStoriesController().onPremiumChanged();
    }

    public void updateSavedReactionTags(long j) {
        long j2;
        String str;
        long m;
        LongSparseArray longSparseArray = this.reactionTags;
        if (longSparseArray == null) {
            return;
        }
        TLRPC$TL_messages_savedReactionsTags tLRPC$TL_messages_savedReactionsTags = (TLRPC$TL_messages_savedReactionsTags) longSparseArray.get(j);
        if (tLRPC$TL_messages_savedReactionsTags == null) {
            if (j == 0) {
                return;
            }
            LongSparseArray longSparseArray2 = this.reactionTags;
            TLRPC$TL_messages_savedReactionsTags tLRPC$TL_messages_savedReactionsTags2 = new TLRPC$TL_messages_savedReactionsTags();
            longSparseArray2.put(j, tLRPC$TL_messages_savedReactionsTags2);
            tLRPC$TL_messages_savedReactionsTags = tLRPC$TL_messages_savedReactionsTags2;
        }
        Collections.sort(tLRPC$TL_messages_savedReactionsTags.tags, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$updateSavedReactionTags$437;
                lambda$updateSavedReactionTags$437 = MessagesController.this.lambda$updateSavedReactionTags$437((TLRPC$TL_savedReactionTag) obj, (TLRPC$TL_savedReactionTag) obj2);
                return lambda$updateSavedReactionTags$437;
            }
        });
        long j3 = 0;
        for (int i = 0; i < tLRPC$TL_messages_savedReactionsTags.tags.size(); i++) {
            TLRPC$TL_savedReactionTag tLRPC$TL_savedReactionTag = (TLRPC$TL_savedReactionTag) tLRPC$TL_messages_savedReactionsTags.tags.get(i);
            if (tLRPC$TL_savedReactionTag.count > 0) {
                TLRPC$Reaction tLRPC$Reaction = tLRPC$TL_savedReactionTag.reaction;
                if (tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji) {
                    j2 = MessagesController$$ExternalSyntheticBackport12.m(r9, 0, Utilities.MD5(((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon).substring(0, 16).length(), 16);
                } else {
                    if (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) {
                        j2 = ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id;
                    }
                    if (j == 0 && (tLRPC$TL_savedReactionTag.flags & 1) != 0 && (str = tLRPC$TL_savedReactionTag.title) != null) {
                        m = MessagesController$$ExternalSyntheticBackport10.m(r9, 0, Utilities.MD5(str).substring(0, 16).length(), 16);
                        j3 = MediaDataController.calcHash(j3, m);
                    }
                    j3 = MediaDataController.calcHash(j3, tLRPC$TL_savedReactionTag.count);
                }
                j3 = MediaDataController.calcHash(j3, j2);
                if (j == 0) {
                    m = MessagesController$$ExternalSyntheticBackport10.m(r9, 0, Utilities.MD5(str).substring(0, 16).length(), 16);
                    j3 = MediaDataController.calcHash(j3, m);
                }
                j3 = MediaDataController.calcHash(j3, tLRPC$TL_savedReactionTag.count);
            }
        }
        tLRPC$TL_messages_savedReactionsTags.hash = j3;
        saveSavedReactionsTags(j, tLRPC$TL_messages_savedReactionsTags);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedReactionTagsUpdate, Long.valueOf(j));
    }

    public void updateSavedReactionTags(HashSet<Long> hashSet) {
        updateSavedReactionTags(0L);
        Iterator<Long> it = hashSet.iterator();
        while (it.hasNext()) {
            updateSavedReactionTags(it.next().longValue());
        }
    }

    public boolean updateSavedReactionTags(long j, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
        if (this.reactionTags == null) {
            return false;
        }
        int i = 0;
        boolean z3 = false;
        while (i < 2) {
            long j2 = i == 0 ? 0L : j;
            boolean z4 = true;
            if (i != 1 || j2 != 0) {
                TLRPC$TL_messages_savedReactionsTags tLRPC$TL_messages_savedReactionsTags = (TLRPC$TL_messages_savedReactionsTags) this.reactionTags.get(j2);
                if (tLRPC$TL_messages_savedReactionsTags == null) {
                    if (j2 != 0) {
                        LongSparseArray longSparseArray = this.reactionTags;
                        tLRPC$TL_messages_savedReactionsTags = new TLRPC$TL_messages_savedReactionsTags();
                        longSparseArray.put(j2, tLRPC$TL_messages_savedReactionsTags);
                    }
                }
                int i2 = 0;
                boolean z5 = false;
                boolean z6 = false;
                while (i2 < tLRPC$TL_messages_savedReactionsTags.tags.size()) {
                    TLRPC$TL_savedReactionTag tLRPC$TL_savedReactionTag = (TLRPC$TL_savedReactionTag) tLRPC$TL_messages_savedReactionsTags.tags.get(i2);
                    if (visibleReaction.isSame(tLRPC$TL_savedReactionTag.reaction)) {
                        int i3 = tLRPC$TL_savedReactionTag.count;
                        int max = Math.max(0, (z ? 1 : -1) + i3);
                        tLRPC$TL_savedReactionTag.count = max;
                        if (max <= 0) {
                            tLRPC$TL_messages_savedReactionsTags.tags.remove(i2);
                            i2--;
                        } else if (max == i3) {
                            z5 = true;
                        }
                        z3 = true;
                        z5 = true;
                        z6 = true;
                    }
                    i2++;
                }
                if (z5 || !z) {
                    z4 = z6;
                } else {
                    TLRPC$TL_savedReactionTag tLRPC$TL_savedReactionTag2 = new TLRPC$TL_savedReactionTag();
                    tLRPC$TL_savedReactionTag2.reaction = visibleReaction.toTLReaction();
                    tLRPC$TL_savedReactionTag2.count = 1;
                    tLRPC$TL_messages_savedReactionsTags.tags.add(tLRPC$TL_savedReactionTag2);
                    z3 = true;
                }
                if (z2 && z4) {
                    updateSavedReactionTags(j2);
                }
                i++;
            }
            i++;
        }
        return z3;
    }

    public void updateTimerProc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.MessagesController.updateTimerProc():void");
    }

    public void updateTranscribeAudioTrialCooldownUntil(int i) {
        if (i != this.transcribeAudioTrialCooldownUntil) {
            this.transcribeAudioTrialCooldownUntil = i;
            this.mainPreferences.edit().putInt("transcribeAudioTrialCooldownUntil", this.transcribeAudioTrialCooldownUntil).apply();
            scheduleTranscriptionUpdate();
        }
    }

    public void updateTranscribeAudioTrialCurrentNumber(int i) {
        if (i != this.transcribeAudioTrialCurrentNumber) {
            this.transcribeAudioTrialCurrentNumber = i;
            this.mainPreferences.edit().putInt("transcribeAudioTrialCurrentNumber", this.transcribeAudioTrialCurrentNumber).apply();
        }
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

    public void uploadAndApplyUserAvatar(TLRPC$FileLocation tLRPC$FileLocation) {
        if (tLRPC$FileLocation == null) {
            return;
        }
        this.uploadingAvatar = FileLoader.getDirectory(4) + "/" + tLRPC$FileLocation.volume_id + "_" + tLRPC$FileLocation.local_id + ".jpg";
        getFileLoader().uploadFile(this.uploadingAvatar, false, true, 16777216);
    }
}
