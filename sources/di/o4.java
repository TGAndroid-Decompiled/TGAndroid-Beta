package di;

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
import org.telegram.ui.Components.g51;
public final class o4 {
    public TL_stories.StoryItem f8870a = null;
    public g7 f8871b = null;
    public TL_stories.StoryItem f8872c;
    public boolean d;
    public boolean e;
    public boolean f8873f;
    public boolean f8874g;
    public CharSequence h;
    public k8 f8875i;
    public k8 f8876j;
    public final q4 f8877k;

    public o4(q4 q4Var) {
        this.f8877k = q4Var;
    }

    public static String c(o4 o4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = o4Var.f8870a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(o4Var.f8870a.media.photo.f22052id);
                sb2.append("at");
                return a1.g.n(o4Var.f8870a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(o4Var.f8870a.media.document.f22034id);
                sb3.append("at");
                return a1.g.n(o4Var.f8870a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (o4Var.f8871b != null) {
            return "uploading from " + o4Var.f8871b.e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        g7 g7Var = this.f8871b;
        if (g7Var != null) {
            return g7Var.f8584c.H0;
        }
        TL_stories.StoryItem storyItem = this.f8870a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat chat = MessagesController.getInstance(this.f8877k.f9020r2).getChat(Long.valueOf(-storyItem.dialogId));
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
        q4 q4Var = this.f8877k;
        if (q4Var.D1.f8870a == null) {
            return null;
        }
        if (q4Var.f9015q1 > 0) {
            TLRPC.User user = MessagesController.getInstance(q4Var.f9020r2).getUser(Long.valueOf(q4Var.f9015q1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            if (q4Var.D1.f8873f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(q4Var.D1.f8870a.f22267id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(q4Var.f9020r2).getChat(Long.valueOf(-q4Var.f9015q1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        if (q4Var.D1.f8873f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(q4Var.D1.f8870a.f22267id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f8870a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final k8 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f8875i == null && (storyItem = this.f8870a) != null) {
            TLRPC.Document document = storyItem.music;
            k8 k8Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    k8Var = new k8();
                    k8Var.f8730f = true;
                    k8Var.f8731g = document;
                    if (TextUtils.isEmpty(str)) {
                        k8Var.f8734k = new SpannableStringBuilder(k8.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        k8Var.f8734k = new SpannableStringBuilder(k8.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(k8.d()).append((CharSequence) " ").append((CharSequence) str2);
                        k8Var.f8734k = append;
                        int length = append.length();
                        k8Var.f8734k.append((CharSequence) " ・ ");
                        k8Var.f8734k.setSpan(new CharacterStyle(), length, k8Var.f8734k.length(), 33);
                        k8Var.f8734k.append((CharSequence) str);
                    }
                }
            }
            this.f8875i = k8Var;
        }
        return this.f8875i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f8870a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            q4 q4Var = this.f8877k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(q4Var.f9020r2).getPathToAttach(this.f8870a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f8870a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
                File pathToAttach = FileLoader.getInstance(q4Var.f9020r2).getPathToAttach(closestPhotoSizeWithSize, true);
                if (!pathToAttach.exists()) {
                    return FileLoader.getInstance(q4Var.f9020r2).getPathToAttach(closestPhotoSizeWithSize, false);
                }
                return pathToAttach;
            }
            return null;
        }
        return null;
    }

    public final k8 i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        CharSequence groupSpan;
        TLRPC.Chat chat2;
        CharSequence groupSpan2;
        CharSequence groupSpan3;
        String str;
        if (this.f8876j == null) {
            TL_stories.StoryItem storyItem = this.f8870a;
            int i10 = 0;
            k8 k8Var = null;
            if (storyItem != null) {
                int i11 = this.f8877k.f9020r2;
                if (storyItem.fwd_from != null) {
                    k8Var = new k8();
                    k8Var.f8727a = i11;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        k8Var.f8728b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            k8Var.f8734k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId))));
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
                            k8Var.f8734k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        k8Var.f8734k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    k8Var.f8730f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        k8Var.f8729c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    k8Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i10 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i10);
                        }
                        i10++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        k8Var = new k8();
                        k8Var.f8728b = Long.valueOf(-chat2.f22028id);
                        k8Var.e = true;
                        k8Var.f8727a = i11;
                        k8Var.f8730f = true;
                        k8Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            groupSpan2 = MessageObject.channelSpan();
                        } else {
                            groupSpan2 = MessageObject.groupSpan();
                        }
                        k8Var.f8734k = new SpannableStringBuilder(groupSpan2).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f8876j = k8Var;
            } else {
                g7 g7Var = this.f8871b;
                if (g7Var != null) {
                    fi.w7 w7Var = g7Var.f8584c;
                    if (w7Var != null) {
                        if (w7Var.f11914n) {
                            k8Var = new k8();
                            k8Var.f8734k = w7Var.f11918p;
                            String str2 = w7Var.f11924s;
                            k8Var.f8735l = str2;
                            k8Var.f8730f = TextUtils.isEmpty(str2);
                        } else if (w7Var.f11928u && (arrayList = w7Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) w7Var.v.get(0);
                            long p10 = fi.w7.p(messageObject);
                            if (p10 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p10))) != null) {
                                k8Var = new k8();
                                k8Var.f8728b = Long.valueOf(p10);
                                k8Var.e = true;
                                k8Var.f8727a = messageObject.currentAccount;
                                k8Var.f8730f = true;
                                Boolean D = fi.w7.D(messageObject);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i10 = messageObject.messageOwner.fwd_from.channel_post;
                                    } else {
                                        i10 = messageObject.getId();
                                    }
                                }
                                k8Var.d = Integer.valueOf(i10);
                                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                    groupSpan = MessageObject.channelSpan();
                                } else {
                                    groupSpan = MessageObject.groupSpan();
                                }
                                k8Var.f8734k = new SpannableStringBuilder(groupSpan).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f8876j = k8Var;
                }
            }
        }
        return this.f8876j;
    }

    public final boolean j() {
        g7 g7Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f8870a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        if (this.f8871b == null) {
            return true;
        }
        return !g7Var.f8584c.Y;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.f8870a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f22045id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        return this.e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        g7 g7Var = this.f8871b;
        if (g7Var != null) {
            return g7Var.f8588s;
        }
        TL_stories.StoryItem storyItem = this.f8870a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f8870a.media.getDocument();
            if (!MessageObject.isVideoDocument(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f8870a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f8870a = storyItem;
        this.f8876j = null;
        this.f8875i = null;
        this.f8871b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.e = m();
        TL_stories.StoryItem storyItem2 = this.f8870a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8873f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i10 = 0;
        this.f8874g = false;
        q4 q4Var = this.f8877k;
        u3 u3Var = q4Var.f9049z0;
        o4 o4Var = q4Var.D1;
        g7 g7Var = o4Var.f8871b;
        if (g7Var != null) {
            CharSequence charSequence = g7Var.f8584c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, u3Var.f8910b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            if (replaceEmoji == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(replaceEmoji);
            }
            TLRPC.User user = MessagesController.getInstance(q4Var.f9020r2).getUser(Long.valueOf(q4Var.f9015q1));
            if (q4Var.f9015q1 < 0 || MessagesController.getInstance(q4Var.f9020r2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, valueOf);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = o4Var.f8870a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, g51.L())) {
                this.f8874g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = o4Var.f8870a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, u3Var.f8910b0.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, u3Var.f8910b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, u3Var.f8910b0.getPaint().getFontMetricsInt(), false));
                    TLRPC.User user2 = MessagesController.getInstance(q4Var.f9020r2).getUser(Long.valueOf(q4Var.f9015q1));
                    if (q4Var.f9015q1 < 0 || MessagesController.getInstance(q4Var.f9020r2).storyEntitiesAllowed(user2)) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        MessageObject.addLinks(true, valueOf2);
                    }
                    MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = o4Var.f8870a.caption;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, u3Var.f8910b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 != null && o4Var.f8870a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(o4Var.f8870a.caption), o4Var.f8870a.entities, u3Var.f8910b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf3, u3Var.f8910b0.getPaint().getFontMetricsInt(), false));
                TLRPC.User user3 = MessagesController.getInstance(q4Var.f9020r2).getUser(Long.valueOf(q4Var.f9015q1));
                if (q4Var.f9015q1 < 0 || MessagesController.getInstance(q4Var.f9020r2).storyEntitiesAllowed(user3)) {
                    i10 = 1;
                }
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf3);
                }
                MessageObject.addEntitiesToText(valueOf3, o4Var.f8870a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
