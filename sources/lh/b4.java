package lh;

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
import org.telegram.ui.Components.k31;
public final class b4 {
    public TL_stories.StoryItem f15374a = null;
    public r6 f15375b = null;
    public TL_stories.StoryItem f15376c;
    public boolean d;
    public boolean f15377e;
    public boolean f15378f;
    public boolean f15379g;
    public CharSequence h;
    public v7 f15380i;
    public v7 f15381j;
    public final d4 f15382k;

    public b4(d4 d4Var) {
        this.f15382k = d4Var;
    }

    public static String c(b4 b4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = b4Var.f15374a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(b4Var.f15374a.media.photo.f22416id);
                sb2.append("at");
                return a4.w.l(b4Var.f15374a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(b4Var.f15374a.media.document.f22398id);
                sb3.append("at");
                return a4.w.l(b4Var.f15374a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (b4Var.f15375b != null) {
            return "uploading from " + b4Var.f15375b.f16170e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        r6 r6Var = this.f15375b;
        if (r6Var != null) {
            return r6Var.f16169c.H0;
        }
        TL_stories.StoryItem storyItem = this.f15374a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat chat = MessagesController.getInstance(this.f15382k.f15545y2).getChat(Long.valueOf(-storyItem.dialogId));
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
        d4 d4Var = this.f15382k;
        if (d4Var.K1.f15374a == null) {
            return null;
        }
        if (d4Var.f15540x1 > 0) {
            TLRPC.User user = MessagesController.getInstance(d4Var.f15545y2).getUser(Long.valueOf(d4Var.f15540x1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            if (d4Var.K1.f15378f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(d4Var.K1.f15374a.f22629id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(d4Var.f15545y2).getChat(Long.valueOf(-d4Var.f15540x1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        if (d4Var.K1.f15378f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(d4Var.K1.f15374a.f22629id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f15374a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final v7 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f15380i == null && (storyItem = this.f15374a) != null) {
            TLRPC.Document document = storyItem.music;
            v7 v7Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    v7Var = new v7();
                    v7Var.f16327f = true;
                    v7Var.f16328g = document;
                    if (TextUtils.isEmpty(str)) {
                        v7Var.f16331k = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        v7Var.f16331k = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str2);
                        v7Var.f16331k = append;
                        int length = append.length();
                        v7Var.f16331k.append((CharSequence) " ・ ");
                        v7Var.f16331k.setSpan(new CharacterStyle(), length, v7Var.f16331k.length(), 33);
                        v7Var.f16331k.append((CharSequence) str);
                    }
                }
            }
            this.f15380i = v7Var;
        }
        return this.f15380i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f15374a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            d4 d4Var = this.f15382k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(d4Var.f15545y2).getPathToAttach(this.f15374a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f15374a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
                File pathToAttach = FileLoader.getInstance(d4Var.f15545y2).getPathToAttach(closestPhotoSizeWithSize, true);
                if (!pathToAttach.exists()) {
                    return FileLoader.getInstance(d4Var.f15545y2).getPathToAttach(closestPhotoSizeWithSize, false);
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
        if (this.f15381j == null) {
            TL_stories.StoryItem storyItem = this.f15374a;
            int i10 = 0;
            v7 v7Var = null;
            if (storyItem != null) {
                int i11 = this.f15382k.f15545y2;
                if (storyItem.fwd_from != null) {
                    v7Var = new v7();
                    v7Var.f16323a = i11;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        v7Var.f16324b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            v7Var.f16331k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId))));
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
                            v7Var.f16331k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        v7Var.f16331k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    v7Var.f16327f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        v7Var.f16325c = Integer.valueOf(storyFwdHeader2.story_id);
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
                        v7Var.f16324b = Long.valueOf(-chat2.f22392id);
                        v7Var.f16326e = true;
                        v7Var.f16323a = i11;
                        v7Var.f16327f = true;
                        v7Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            groupSpan2 = MessageObject.channelSpan();
                        } else {
                            groupSpan2 = MessageObject.groupSpan();
                        }
                        v7Var.f16331k = new SpannableStringBuilder(groupSpan2).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f15381j = v7Var;
            } else {
                r6 r6Var = this.f15375b;
                if (r6Var != null) {
                    nh.o7 o7Var = r6Var.f16169c;
                    if (o7Var != null) {
                        if (o7Var.f18282n) {
                            v7Var = new v7();
                            v7Var.f16331k = o7Var.f18286p;
                            String str2 = o7Var.f18292s;
                            v7Var.f16332l = str2;
                            v7Var.f16327f = TextUtils.isEmpty(str2);
                        } else if (o7Var.f18296u && (arrayList = o7Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) o7Var.v.get(0);
                            long p10 = nh.o7.p(messageObject);
                            if (p10 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p10))) != null) {
                                v7Var = new v7();
                                v7Var.f16324b = Long.valueOf(p10);
                                v7Var.f16326e = true;
                                v7Var.f16323a = messageObject.currentAccount;
                                v7Var.f16327f = true;
                                Boolean D = nh.o7.D(messageObject);
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
                                v7Var.f16331k = new SpannableStringBuilder(groupSpan).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f15381j = v7Var;
                }
            }
        }
        return this.f15381j;
    }

    public final boolean j() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.f15377e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f15374a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        r6 r6Var = this.f15375b;
        if (r6Var == null) {
            return true;
        }
        return !r6Var.f16169c.Y;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.f15374a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f22409id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        return this.f15377e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        r6 r6Var = this.f15375b;
        if (r6Var != null) {
            return r6Var.f16174s;
        }
        TL_stories.StoryItem storyItem = this.f15374a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f15374a.media.getDocument();
            if (!MessageObject.isVideoDocument(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f15374a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f15374a = storyItem;
        this.f15381j = null;
        this.f15380i = null;
        this.f15375b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.f15377e = m();
        TL_stories.StoryItem storyItem2 = this.f15374a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15378f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i10 = 0;
        this.f15379g = false;
        d4 d4Var = this.f15382k;
        l3 l3Var = d4Var.G0;
        b4 b4Var = d4Var.K1;
        r6 r6Var = b4Var.f15375b;
        if (r6Var != null) {
            CharSequence charSequence = r6Var.f16169c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, l3Var.U.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            if (replaceEmoji == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(replaceEmoji);
            }
            TLRPC.User user = MessagesController.getInstance(d4Var.f15545y2).getUser(Long.valueOf(d4Var.f15540x1));
            if (d4Var.f15540x1 < 0 || MessagesController.getInstance(d4Var.f15545y2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, valueOf);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = b4Var.f15374a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, k31.B())) {
                this.f15379g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = b4Var.f15374a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, l3Var.U.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, l3Var.U.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, l3Var.U.getPaint().getFontMetricsInt(), false));
                    i10 = (d4Var.f15540x1 < 0 || MessagesController.getInstance(d4Var.f15545y2).storyEntitiesAllowed(MessagesController.getInstance(d4Var.f15545y2).getUser(Long.valueOf(d4Var.f15540x1)))) ? 1 : 1;
                    if (i10 != 0) {
                        MessageObject.addLinks(true, valueOf2);
                    }
                    MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = b4Var.f15374a.caption;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, l3Var.U.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 != null && b4Var.f15374a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(b4Var.f15374a.caption), b4Var.f15374a.entities, l3Var.U.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf3, l3Var.U.getPaint().getFontMetricsInt(), false));
                i10 = (d4Var.f15540x1 < 0 || MessagesController.getInstance(d4Var.f15545y2).storyEntitiesAllowed(MessagesController.getInstance(d4Var.f15545y2).getUser(Long.valueOf(d4Var.f15540x1)))) ? 1 : 1;
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf3);
                }
                MessageObject.addEntitiesToText(valueOf3, b4Var.f15374a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
