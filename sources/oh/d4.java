package oh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.v31;
public final class d4 {
    public TL_stories.StoryItem f16963a = null;
    public s6 f16964b = null;
    public TL_stories.StoryItem f16965c;
    public boolean d;
    public boolean f16966e;
    public boolean f16967f;
    public boolean f16968g;
    public CharSequence h;
    public v7 f16969i;
    public v7 f16970j;
    public final f4 f16971k;

    public d4(f4 f4Var) {
        this.f16971k = f4Var;
    }

    public static String c(d4 d4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = d4Var.f16963a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb = new StringBuilder("photo#");
                sb.append(d4Var.f16963a.media.photo.f20869id);
                sb.append("at");
                return android.support.v4.media.a.m(d4Var.f16963a.media.photo.dc_id, "dc", sb);
            } else if (messageMedia.document != null) {
                StringBuilder sb2 = new StringBuilder("doc#");
                sb2.append(d4Var.f16963a.media.document.f20851id);
                sb2.append("at");
                return android.support.v4.media.a.m(d4Var.f16963a.media.document.dc_id, "dc", sb2);
            } else {
                return "unknown";
            }
        } else if (d4Var.f16964b != null) {
            return "uploading from " + d4Var.f16964b.f17740e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        s6 s6Var = this.f16964b;
        if (s6Var != null) {
            return s6Var.f17739c.H0;
        }
        TL_stories.StoryItem storyItem = this.f16963a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat chat = MessagesController.getInstance(this.f16971k.f17135z2).getChat(Long.valueOf(-storyItem.dialogId));
                if (chat != null && chat.noforwards) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final String e() {
        f4 f4Var = this.f16971k;
        if (f4Var.L1.f16963a == null) {
            return null;
        }
        if (f4Var.f17130y1 > 0) {
            TLRPC.User user = MessagesController.getInstance(f4Var.f17135z2).getUser(Long.valueOf(f4Var.f17130y1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            if (f4Var.L1.f16967f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(f4Var.L1.f16963a.f21082id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(f4Var.f17135z2).getChat(Long.valueOf(-f4Var.f17130y1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        if (f4Var.L1.f16967f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(f4Var.L1.f16963a.f21082id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f16963a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final v7 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f16969i == null && (storyItem = this.f16963a) != null) {
            TLRPC.Document document = storyItem.music;
            v7 v7Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    v7Var = new v7();
                    v7Var.f17863f = true;
                    v7Var.f17864g = document;
                    if (TextUtils.isEmpty(str)) {
                        v7Var.f17867k = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        v7Var.f17867k = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str2);
                        v7Var.f17867k = append;
                        int length = append.length();
                        v7Var.f17867k.append((CharSequence) " ・ ");
                        v7Var.f17867k.setSpan(new CharacterStyle(), length, v7Var.f17867k.length(), 33);
                        v7Var.f17867k.append((CharSequence) str);
                    }
                }
            }
            this.f16969i = v7Var;
        }
        return this.f16969i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f16963a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            f4 f4Var = this.f16971k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(f4Var.f17135z2).getPathToAttach(this.f16963a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f16963a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
                File pathToAttach = FileLoader.getInstance(f4Var.f17135z2).getPathToAttach(closestPhotoSizeWithSize, true);
                if (!pathToAttach.exists()) {
                    return FileLoader.getInstance(f4Var.f17135z2).getPathToAttach(closestPhotoSizeWithSize, false);
                }
                return pathToAttach;
            }
            return null;
        }
        return null;
    }

    public final v7 i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        CharSequence groupSpan;
        TLRPC.Chat chat2;
        CharSequence groupSpan2;
        CharSequence groupSpan3;
        String str;
        if (this.f16970j == null) {
            TL_stories.StoryItem storyItem = this.f16963a;
            int i10 = 0;
            v7 v7Var = null;
            if (storyItem != null) {
                int i11 = this.f16971k.f17135z2;
                if (storyItem.fwd_from != null) {
                    v7Var = new v7();
                    v7Var.f17859a = i11;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        v7Var.f17860b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            v7Var.f17867k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId))));
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
                            if (ChatObject.isChannelAndNotMegaGroup(chat3)) {
                                groupSpan3 = MessageObject.channelSpan();
                            } else {
                                groupSpan3 = MessageObject.groupSpan();
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(groupSpan3).append((CharSequence) " ");
                            if (chat3 != null) {
                                str = chat3.title;
                            } else {
                                str = "";
                            }
                            v7Var.f17867k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        v7Var.f17867k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    v7Var.f17863f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        v7Var.f17861c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    v7Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i10 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i10);
                        }
                        i10++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        v7Var = new v7();
                        v7Var.f17860b = Long.valueOf(-chat2.f20845id);
                        v7Var.f17862e = true;
                        v7Var.f17859a = i11;
                        v7Var.f17863f = true;
                        v7Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            groupSpan2 = MessageObject.channelSpan();
                        } else {
                            groupSpan2 = MessageObject.groupSpan();
                        }
                        v7Var.f17867k = new SpannableStringBuilder(groupSpan2).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f16970j = v7Var;
            } else {
                s6 s6Var = this.f16964b;
                if (s6Var != null) {
                    qh.r6 r6Var = s6Var.f17739c;
                    if (r6Var != null) {
                        if (r6Var.f46020n) {
                            v7Var = new v7();
                            v7Var.f17867k = r6Var.f46024p;
                            String str2 = r6Var.f46030s;
                            v7Var.f17868l = str2;
                            v7Var.f17863f = TextUtils.isEmpty(str2);
                        } else if (r6Var.f46034u && (arrayList = r6Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) r6Var.v.get(0);
                            long p10 = qh.r6.p(messageObject);
                            if (p10 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p10))) != null) {
                                v7Var = new v7();
                                v7Var.f17860b = Long.valueOf(p10);
                                v7Var.f17862e = true;
                                v7Var.f17859a = messageObject.currentAccount;
                                v7Var.f17863f = true;
                                Boolean D = qh.r6.D(messageObject);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i10 = messageObject.messageOwner.fwd_from.channel_post;
                                    } else {
                                        i10 = messageObject.getId();
                                    }
                                }
                                v7Var.d = Integer.valueOf(i10);
                                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                    groupSpan = MessageObject.channelSpan();
                                } else {
                                    groupSpan = MessageObject.groupSpan();
                                }
                                v7Var.f17867k = new SpannableStringBuilder(groupSpan).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f16970j = v7Var;
                }
            }
        }
        return this.f16970j;
    }

    public final boolean j() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.f16966e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f16963a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        s6 s6Var = this.f16964b;
        if (s6Var == null) {
            return true;
        }
        return !s6Var.f17739c.Y;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.f16963a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f20862id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        return this.f16966e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        s6 s6Var = this.f16964b;
        if (s6Var != null) {
            return s6Var.f17744s;
        }
        TL_stories.StoryItem storyItem = this.f16963a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f16963a.media.getDocument();
            if (!MessageObject.isVideoDocument(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f16963a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z4;
        TLRPC.MessageMedia messageMedia;
        this.f16963a = storyItem;
        this.f16970j = null;
        this.f16969i = null;
        this.f16964b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.f16966e = m();
        TL_stories.StoryItem storyItem2 = this.f16963a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f16967f = z4;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i10 = 0;
        this.f16968g = false;
        f4 f4Var = this.f16971k;
        n3 n3Var = f4Var.H0;
        d4 d4Var = f4Var.L1;
        s6 s6Var = d4Var.f16964b;
        if (s6Var != null) {
            CharSequence charSequence = s6Var.f17739c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, n3Var.V.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            if (replaceEmoji == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(replaceEmoji);
            }
            TLRPC.User user = MessagesController.getInstance(f4Var.f17135z2).getUser(Long.valueOf(f4Var.f17130y1));
            if (f4Var.f17130y1 < 0 || MessagesController.getInstance(f4Var.f17135z2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, valueOf);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = d4Var.f16963a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, v31.B())) {
                this.f16968g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = d4Var.f16963a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, n3Var.V.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, n3Var.V.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, n3Var.V.getPaint().getFontMetricsInt(), false));
                    i10 = (f4Var.f17130y1 < 0 || MessagesController.getInstance(f4Var.f17135z2).storyEntitiesAllowed(MessagesController.getInstance(f4Var.f17135z2).getUser(Long.valueOf(f4Var.f17130y1)))) ? 1 : 1;
                    if (i10 != 0) {
                        MessageObject.addLinks(true, valueOf2);
                    }
                    MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = d4Var.f16963a.caption;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, n3Var.V.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 != null && d4Var.f16963a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(d4Var.f16963a.caption), d4Var.f16963a.entities, n3Var.V.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf3, n3Var.V.getPaint().getFontMetricsInt(), false));
                i10 = (f4Var.f17130y1 < 0 || MessagesController.getInstance(f4Var.f17135z2).storyEntitiesAllowed(MessagesController.getInstance(f4Var.f17135z2).getUser(Long.valueOf(f4Var.f17130y1)))) ? 1 : 1;
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf3);
                }
                MessageObject.addEntitiesToText(valueOf3, d4Var.f16963a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
