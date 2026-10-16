package bi;

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
import org.telegram.ui.Components.x41;
public final class o5 {
    public TL_stories.StoryItem f3417a = null;
    public w8 f3418b = null;
    public TL_stories.StoryItem f3419c;
    public boolean d;
    public boolean e;
    public boolean f3420f;
    public boolean f3421g;
    public CharSequence h;
    public ca f3422i;
    public ca f3423j;
    public final q5 f3424k;

    public o5(q5 q5Var) {
        this.f3424k = q5Var;
    }

    public static String c(o5 o5Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = o5Var.f3417a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(o5Var.f3417a.media.photo.f18940id);
                sb2.append("at");
                return a1.g.n(o5Var.f3417a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(o5Var.f3417a.media.document.f18922id);
                sb3.append("at");
                return a1.g.n(o5Var.f3417a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (o5Var.f3418b != null) {
            return "uploading from " + o5Var.f3418b.e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        w8 w8Var = this.f3418b;
        if (w8Var != null) {
            return w8Var.f3919c.H0;
        }
        TL_stories.StoryItem storyItem = this.f3417a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat chat = MessagesController.getInstance(this.f3424k.C2).getChat(Long.valueOf(-storyItem.dialogId));
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
        q5 q5Var = this.f3424k;
        if (q5Var.O1.f3417a == null) {
            return null;
        }
        if (q5Var.B1 > 0) {
            TLRPC.User user = MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            if (q5Var.O1.f3420f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(q5Var.O1.f3417a.f19151id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(q5Var.C2).getChat(Long.valueOf(-q5Var.B1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        if (q5Var.O1.f3420f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(q5Var.O1.f3417a.f19151id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f3417a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final ca g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f3422i == null && (storyItem = this.f3417a) != null) {
            TLRPC.Document document = storyItem.music;
            ca caVar = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    caVar = new ca();
                    caVar.f2922f = true;
                    caVar.f2923g = document;
                    if (TextUtils.isEmpty(str)) {
                        caVar.f2926k = new SpannableStringBuilder(ca.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        caVar.f2926k = new SpannableStringBuilder(ca.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(ca.d()).append((CharSequence) " ").append((CharSequence) str2);
                        caVar.f2926k = append;
                        int length = append.length();
                        caVar.f2926k.append((CharSequence) " ・ ");
                        caVar.f2926k.setSpan(new CharacterStyle(), length, caVar.f2926k.length(), 33);
                        caVar.f2926k.append((CharSequence) str);
                    }
                }
            }
            this.f3422i = caVar;
        }
        return this.f3422i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f3417a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            q5 q5Var = this.f3424k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(q5Var.C2).getPathToAttach(this.f3417a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f3417a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
                File pathToAttach = FileLoader.getInstance(q5Var.C2).getPathToAttach(closestPhotoSizeWithSize, true);
                if (!pathToAttach.exists()) {
                    return FileLoader.getInstance(q5Var.C2).getPathToAttach(closestPhotoSizeWithSize, false);
                }
                return pathToAttach;
            }
            return null;
        }
        return null;
    }

    public final ca i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        CharSequence groupSpan;
        TLRPC.Chat chat2;
        CharSequence groupSpan2;
        CharSequence groupSpan3;
        String str;
        if (this.f3423j == null) {
            TL_stories.StoryItem storyItem = this.f3417a;
            int i10 = 0;
            ca caVar = null;
            if (storyItem != null) {
                int i11 = this.f3424k.C2;
                if (storyItem.fwd_from != null) {
                    caVar = new ca();
                    caVar.f2919a = i11;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        caVar.f2920b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            caVar.f2926k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId))));
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
                            caVar.f2926k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        caVar.f2926k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    caVar.f2922f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        caVar.f2921c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    caVar.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i10 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i10);
                        }
                        i10++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        caVar = new ca();
                        caVar.f2920b = Long.valueOf(-chat2.f18916id);
                        caVar.e = true;
                        caVar.f2919a = i11;
                        caVar.f2922f = true;
                        caVar.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            groupSpan2 = MessageObject.channelSpan();
                        } else {
                            groupSpan2 = MessageObject.groupSpan();
                        }
                        caVar.f2926k = new SpannableStringBuilder(groupSpan2).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f3423j = caVar;
            } else {
                w8 w8Var = this.f3418b;
                if (w8Var != null) {
                    di.k8 k8Var = w8Var.f3919c;
                    if (k8Var != null) {
                        if (k8Var.f7202n) {
                            caVar = new ca();
                            caVar.f2926k = k8Var.f7206p;
                            String str2 = k8Var.f7212s;
                            caVar.f2927l = str2;
                            caVar.f2922f = TextUtils.isEmpty(str2);
                        } else if (k8Var.f7216u && (arrayList = k8Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) k8Var.v.get(0);
                            long p5 = di.k8.p(messageObject);
                            if (p5 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p5))) != null) {
                                caVar = new ca();
                                caVar.f2920b = Long.valueOf(p5);
                                caVar.e = true;
                                caVar.f2919a = messageObject.currentAccount;
                                caVar.f2922f = true;
                                Boolean D = di.k8.D(messageObject);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i10 = messageObject.messageOwner.fwd_from.channel_post;
                                    } else {
                                        i10 = messageObject.getId();
                                    }
                                }
                                caVar.d = Integer.valueOf(i10);
                                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                    groupSpan = MessageObject.channelSpan();
                                } else {
                                    groupSpan = MessageObject.groupSpan();
                                }
                                caVar.f2926k = new SpannableStringBuilder(groupSpan).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f3423j = caVar;
                }
            }
        }
        return this.f3423j;
    }

    public final boolean j() {
        w8 w8Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f3417a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        if (this.f3418b == null) {
            return true;
        }
        return !w8Var.f3919c.Y;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.f3417a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f18933id) {
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
        w8 w8Var = this.f3418b;
        if (w8Var != null) {
            return w8Var.f3923s;
        }
        TL_stories.StoryItem storyItem = this.f3417a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f3417a.media.getDocument();
            if (!MessageObject.isVideoDocument(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f3417a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f3417a = storyItem;
        this.f3423j = null;
        this.f3422i = null;
        this.f3418b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.e = m();
        TL_stories.StoryItem storyItem2 = this.f3417a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3420f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i10 = 0;
        this.f3421g = false;
        q5 q5Var = this.f3424k;
        u4 u4Var = q5Var.K0;
        o5 o5Var = q5Var.O1;
        w8 w8Var = o5Var.f3418b;
        if (w8Var != null) {
            CharSequence charSequence = w8Var.f3919c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, u4Var.f3136b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            if (replaceEmoji == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(replaceEmoji);
            }
            TLRPC.User user = MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1));
            if (q5Var.B1 < 0 || MessagesController.getInstance(q5Var.C2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, valueOf);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = o5Var.f3417a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, x41.D())) {
                this.f3421g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = o5Var.f3417a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, u4Var.f3136b0.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, u4Var.f3136b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, u4Var.f3136b0.getPaint().getFontMetricsInt(), false));
                    TLRPC.User user2 = MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1));
                    if (q5Var.B1 < 0 || MessagesController.getInstance(q5Var.C2).storyEntitiesAllowed(user2)) {
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
            String str2 = o5Var.f3417a.caption;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, u4Var.f3136b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 != null && o5Var.f3417a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(o5Var.f3417a.caption), o5Var.f3417a.entities, u4Var.f3136b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf3, u4Var.f3136b0.getPaint().getFontMetricsInt(), false));
                TLRPC.User user3 = MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1));
                if (q5Var.B1 < 0 || MessagesController.getInstance(q5Var.C2).storyEntitiesAllowed(user3)) {
                    i10 = 1;
                }
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf3);
                }
                MessageObject.addEntitiesToText(valueOf3, o5Var.f3417a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
