package ci;

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
import org.telegram.ui.Components.t41;
public final class o4 {
    public TL_stories.StoryItem f5688a = null;
    public h7 f5689b = null;
    public TL_stories.StoryItem f5690c;
    public boolean d;
    public boolean e;
    public boolean f5691f;
    public boolean f5692g;
    public CharSequence h;
    public n8 f5693i;
    public n8 f5694j;
    public final q4 f5695k;

    public o4(q4 q4Var) {
        this.f5695k = q4Var;
    }

    public static String c(o4 o4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = o4Var.f5688a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(o4Var.f5688a.media.photo.f20303id);
                sb2.append("at");
                return a1.g.n(o4Var.f5688a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(o4Var.f5688a.media.document.f20285id);
                sb3.append("at");
                return a1.g.n(o4Var.f5688a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (o4Var.f5689b != null) {
            return "uploading from " + o4Var.f5689b.e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        h7 h7Var = this.f5689b;
        if (h7Var != null) {
            return h7Var.f5468c.H0;
        }
        TL_stories.StoryItem storyItem = this.f5688a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat chat = MessagesController.getInstance(this.f5695k.C2).getChat(Long.valueOf(-storyItem.dialogId));
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
        q4 q4Var = this.f5695k;
        if (q4Var.O1.f5688a == null) {
            return null;
        }
        if (q4Var.B1 > 0) {
            TLRPC.User user = MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            if (q4Var.O1.f5691f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(q4Var.O1.f5688a.f20513id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(q4Var.C2).getChat(Long.valueOf(-q4Var.B1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        if (q4Var.O1.f5691f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(q4Var.O1.f5688a.f20513id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f5688a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final n8 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f5693i == null && (storyItem = this.f5688a) != null) {
            TLRPC.Document document = storyItem.music;
            n8 n8Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    n8Var = new n8();
                    n8Var.f5661f = true;
                    n8Var.f5662g = document;
                    if (TextUtils.isEmpty(str)) {
                        n8Var.f5665k = new SpannableStringBuilder(n8.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        n8Var.f5665k = new SpannableStringBuilder(n8.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(n8.d()).append((CharSequence) " ").append((CharSequence) str2);
                        n8Var.f5665k = append;
                        int length = append.length();
                        n8Var.f5665k.append((CharSequence) " ・ ");
                        n8Var.f5665k.setSpan(new CharacterStyle(), length, n8Var.f5665k.length(), 33);
                        n8Var.f5665k.append((CharSequence) str);
                    }
                }
            }
            this.f5693i = n8Var;
        }
        return this.f5693i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f5688a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            q4 q4Var = this.f5695k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(q4Var.C2).getPathToAttach(this.f5688a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f5688a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
                File pathToAttach = FileLoader.getInstance(q4Var.C2).getPathToAttach(closestPhotoSizeWithSize, true);
                if (!pathToAttach.exists()) {
                    return FileLoader.getInstance(q4Var.C2).getPathToAttach(closestPhotoSizeWithSize, false);
                }
                return pathToAttach;
            }
            return null;
        }
        return null;
    }

    public final n8 i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        CharSequence groupSpan;
        TLRPC.Chat chat2;
        CharSequence groupSpan2;
        CharSequence groupSpan3;
        String str;
        if (this.f5694j == null) {
            TL_stories.StoryItem storyItem = this.f5688a;
            int i10 = 0;
            n8 n8Var = null;
            if (storyItem != null) {
                int i11 = this.f5695k.C2;
                if (storyItem.fwd_from != null) {
                    n8Var = new n8();
                    n8Var.f5658a = i11;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        n8Var.f5659b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            n8Var.f5665k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId))));
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
                            n8Var.f5665k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        n8Var.f5665k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    n8Var.f5661f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        n8Var.f5660c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    n8Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i10 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i10);
                        }
                        i10++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        n8Var = new n8();
                        n8Var.f5659b = Long.valueOf(-chat2.f20279id);
                        n8Var.e = true;
                        n8Var.f5658a = i11;
                        n8Var.f5661f = true;
                        n8Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            groupSpan2 = MessageObject.channelSpan();
                        } else {
                            groupSpan2 = MessageObject.groupSpan();
                        }
                        n8Var.f5665k = new SpannableStringBuilder(groupSpan2).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f5694j = n8Var;
            } else {
                h7 h7Var = this.f5689b;
                if (h7Var != null) {
                    ei.a8 a8Var = h7Var.f5468c;
                    if (a8Var != null) {
                        if (a8Var.f8721n) {
                            n8Var = new n8();
                            n8Var.f5665k = a8Var.f8725p;
                            String str2 = a8Var.f8731s;
                            n8Var.f5666l = str2;
                            n8Var.f5661f = TextUtils.isEmpty(str2);
                        } else if (a8Var.f8735u && (arrayList = a8Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) a8Var.v.get(0);
                            long p5 = ei.a8.p(messageObject);
                            if (p5 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p5))) != null) {
                                n8Var = new n8();
                                n8Var.f5659b = Long.valueOf(p5);
                                n8Var.e = true;
                                n8Var.f5658a = messageObject.currentAccount;
                                n8Var.f5661f = true;
                                Boolean D = ei.a8.D(messageObject);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i10 = messageObject.messageOwner.fwd_from.channel_post;
                                    } else {
                                        i10 = messageObject.getId();
                                    }
                                }
                                n8Var.d = Integer.valueOf(i10);
                                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                    groupSpan = MessageObject.channelSpan();
                                } else {
                                    groupSpan = MessageObject.groupSpan();
                                }
                                n8Var.f5665k = new SpannableStringBuilder(groupSpan).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f5694j = n8Var;
                }
            }
        }
        return this.f5694j;
    }

    public final boolean j() {
        h7 h7Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f5688a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        if (this.f5689b == null) {
            return true;
        }
        return !h7Var.f5468c.Y;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.f5688a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f20296id) {
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
        h7 h7Var = this.f5689b;
        if (h7Var != null) {
            return h7Var.f5472s;
        }
        TL_stories.StoryItem storyItem = this.f5688a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f5688a.media.getDocument();
            if (!MessageObject.isVideoDocument(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f5688a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f5688a = storyItem;
        this.f5694j = null;
        this.f5693i = null;
        this.f5689b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.e = m();
        TL_stories.StoryItem storyItem2 = this.f5688a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5691f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i10 = 0;
        this.f5692g = false;
        q4 q4Var = this.f5695k;
        v3 v3Var = q4Var.K0;
        o4 o4Var = q4Var.O1;
        h7 h7Var = o4Var.f5689b;
        if (h7Var != null) {
            CharSequence charSequence = h7Var.f5468c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, v3Var.f5977b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            if (replaceEmoji == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(replaceEmoji);
            }
            TLRPC.User user = MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1));
            if (q4Var.B1 < 0 || MessagesController.getInstance(q4Var.C2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, valueOf);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = o4Var.f5688a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, t41.C())) {
                this.f5692g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = o4Var.f5688a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, v3Var.f5977b0.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, v3Var.f5977b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, v3Var.f5977b0.getPaint().getFontMetricsInt(), false));
                    TLRPC.User user2 = MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1));
                    if (q4Var.B1 < 0 || MessagesController.getInstance(q4Var.C2).storyEntitiesAllowed(user2)) {
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
            String str2 = o4Var.f5688a.caption;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, v3Var.f5977b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 != null && o4Var.f5688a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(o4Var.f5688a.caption), o4Var.f5688a.entities, v3Var.f5977b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf3, v3Var.f5977b0.getPaint().getFontMetricsInt(), false));
                TLRPC.User user3 = MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1));
                if (q4Var.B1 < 0 || MessagesController.getInstance(q4Var.C2).storyEntitiesAllowed(user3)) {
                    i10 = 1;
                }
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf3);
                }
                MessageObject.addEntitiesToText(valueOf3, o4Var.f5688a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
