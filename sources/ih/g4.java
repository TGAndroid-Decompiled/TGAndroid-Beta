package ih;

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
import org.telegram.ui.Components.z21;
public final class g4 {
    public TL_stories.StoryItem f11466a = null;
    public u6 f11467b = null;
    public TL_stories.StoryItem f11468c;
    public boolean d;
    public boolean f11469e;
    public boolean f11470f;
    public boolean f11471g;
    public CharSequence h;
    public z7 f11472i;
    public z7 f11473j;
    public final i4 f11474k;

    public g4(i4 i4Var) {
        this.f11474k = i4Var;
    }

    public static String c(g4 g4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = g4Var.f11466a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(g4Var.f11466a.media.photo.f22404id);
                sb2.append("at");
                return aa.d.l(g4Var.f11466a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(g4Var.f11466a.media.document.f22386id);
                sb3.append("at");
                return aa.d.l(g4Var.f11466a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (g4Var.f11467b != null) {
            return "uploading from " + g4Var.f11467b.f12194e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        u6 u6Var = this.f11467b;
        if (u6Var != null) {
            return u6Var.f12193c.H0;
        }
        TL_stories.StoryItem storyItem = this.f11466a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat chat = MessagesController.getInstance(this.f11474k.f11609y2).getChat(Long.valueOf(-storyItem.dialogId));
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
        i4 i4Var = this.f11474k;
        if (i4Var.K1.f11466a == null) {
            return null;
        }
        if (i4Var.f11604x1 > 0) {
            TLRPC.User user = MessagesController.getInstance(i4Var.f11609y2).getUser(Long.valueOf(i4Var.f11604x1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            if (i4Var.K1.f11470f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(i4Var.K1.f11466a.f22617id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(i4Var.f11609y2).getChat(Long.valueOf(-i4Var.f11604x1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        if (i4Var.K1.f11470f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(i4Var.K1.f11466a.f22617id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f11466a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final z7 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f11472i == null && (storyItem = this.f11466a) != null) {
            TLRPC.Document document = storyItem.music;
            z7 z7Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    z7Var = new z7();
                    z7Var.f12385f = true;
                    z7Var.f12386g = document;
                    if (TextUtils.isEmpty(str)) {
                        z7Var.f12389k = new SpannableStringBuilder(z7.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        z7Var.f12389k = new SpannableStringBuilder(z7.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(z7.d()).append((CharSequence) " ").append((CharSequence) str2);
                        z7Var.f12389k = append;
                        int length = append.length();
                        z7Var.f12389k.append((CharSequence) " ・ ");
                        z7Var.f12389k.setSpan(new CharacterStyle(), length, z7Var.f12389k.length(), 33);
                        z7Var.f12389k.append((CharSequence) str);
                    }
                }
            }
            this.f11472i = z7Var;
        }
        return this.f11472i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f11466a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            i4 i4Var = this.f11474k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(i4Var.f11609y2).getPathToAttach(this.f11466a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f11466a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
                File pathToAttach = FileLoader.getInstance(i4Var.f11609y2).getPathToAttach(closestPhotoSizeWithSize, true);
                if (!pathToAttach.exists()) {
                    return FileLoader.getInstance(i4Var.f11609y2).getPathToAttach(closestPhotoSizeWithSize, false);
                }
                return pathToAttach;
            }
            return null;
        }
        return null;
    }

    public final z7 i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        CharSequence groupSpan;
        TLRPC.Chat chat2;
        CharSequence groupSpan2;
        CharSequence groupSpan3;
        String str;
        if (this.f11473j == null) {
            TL_stories.StoryItem storyItem = this.f11466a;
            int i9 = 0;
            z7 z7Var = null;
            if (storyItem != null) {
                int i10 = this.f11474k.f11609y2;
                if (storyItem.fwd_from != null) {
                    z7Var = new z7();
                    z7Var.f12381a = i10;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        z7Var.f12382b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            z7Var.f12389k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId))));
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
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
                            z7Var.f12389k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        z7Var.f12389k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    z7Var.f12385f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        z7Var.f12383c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    z7Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i9 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i9) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i9);
                        }
                        i9++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        z7Var = new z7();
                        z7Var.f12382b = Long.valueOf(-chat2.f22380id);
                        z7Var.f12384e = true;
                        z7Var.f12381a = i10;
                        z7Var.f12385f = true;
                        z7Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            groupSpan2 = MessageObject.channelSpan();
                        } else {
                            groupSpan2 = MessageObject.groupSpan();
                        }
                        z7Var.f12389k = new SpannableStringBuilder(groupSpan2).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f11473j = z7Var;
            } else {
                u6 u6Var = this.f11467b;
                if (u6Var != null) {
                    kh.a8 a8Var = u6Var.f12193c;
                    if (a8Var != null) {
                        if (a8Var.f14929n) {
                            z7Var = new z7();
                            z7Var.f12389k = a8Var.f14933p;
                            String str2 = a8Var.f14939s;
                            z7Var.f12390l = str2;
                            z7Var.f12385f = TextUtils.isEmpty(str2);
                        } else if (a8Var.f14943u && (arrayList = a8Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) a8Var.v.get(0);
                            long p6 = kh.a8.p(messageObject);
                            if (p6 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p6))) != null) {
                                z7Var = new z7();
                                z7Var.f12382b = Long.valueOf(p6);
                                z7Var.f12384e = true;
                                z7Var.f12381a = messageObject.currentAccount;
                                z7Var.f12385f = true;
                                Boolean D = kh.a8.D(messageObject);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i9 = messageObject.messageOwner.fwd_from.channel_post;
                                    } else {
                                        i9 = messageObject.getId();
                                    }
                                }
                                z7Var.d = Integer.valueOf(i9);
                                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                    groupSpan = MessageObject.channelSpan();
                                } else {
                                    groupSpan = MessageObject.groupSpan();
                                }
                                z7Var.f12389k = new SpannableStringBuilder(groupSpan).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f11473j = z7Var;
                }
            }
        }
        return this.f11473j;
    }

    public final boolean j() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.f11469e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f11466a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i9 = 0; i9 < document.attributes.size(); i9++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        u6 u6Var = this.f11467b;
        if (u6Var == null) {
            return true;
        }
        return !u6Var.f12193c.Y;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.f11466a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f22397id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        return this.f11469e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        u6 u6Var = this.f11467b;
        if (u6Var != null) {
            return u6Var.f12198s;
        }
        TL_stories.StoryItem storyItem = this.f11466a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f11466a.media.getDocument();
            if (!MessageObject.isVideoDocument(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f11466a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f11466a = storyItem;
        this.f11473j = null;
        this.f11472i = null;
        this.f11467b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.f11469e = m();
        TL_stories.StoryItem storyItem2 = this.f11466a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11470f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i9 = 0;
        this.f11471g = false;
        i4 i4Var = this.f11474k;
        p3 p3Var = i4Var.G0;
        g4 g4Var = i4Var.K1;
        u6 u6Var = g4Var.f11467b;
        if (u6Var != null) {
            CharSequence charSequence = u6Var.f12193c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, p3Var.U.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            if (replaceEmoji == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(replaceEmoji);
            }
            TLRPC.User user = MessagesController.getInstance(i4Var.f11609y2).getUser(Long.valueOf(i4Var.f11604x1));
            if (i4Var.f11604x1 < 0 || MessagesController.getInstance(i4Var.f11609y2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, valueOf);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = g4Var.f11466a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, z21.A())) {
                this.f11471g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = g4Var.f11466a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, p3Var.U.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, p3Var.U.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, p3Var.U.getPaint().getFontMetricsInt(), false));
                    i9 = (i4Var.f11604x1 < 0 || MessagesController.getInstance(i4Var.f11609y2).storyEntitiesAllowed(MessagesController.getInstance(i4Var.f11609y2).getUser(Long.valueOf(i4Var.f11604x1)))) ? 1 : 1;
                    if (i9 != 0) {
                        MessageObject.addLinks(true, valueOf2);
                    }
                    MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i9 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = g4Var.f11466a.caption;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, p3Var.U.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 != null && g4Var.f11466a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(g4Var.f11466a.caption), g4Var.f11466a.entities, p3Var.U.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf3, p3Var.U.getPaint().getFontMetricsInt(), false));
                i9 = (i4Var.f11604x1 < 0 || MessagesController.getInstance(i4Var.f11609y2).storyEntitiesAllowed(MessagesController.getInstance(i4Var.f11609y2).getUser(Long.valueOf(i4Var.f11604x1)))) ? 1 : 1;
                if (i9 != 0) {
                    MessageObject.addLinks(true, valueOf3);
                }
                MessageObject.addEntitiesToText(valueOf3, g4Var.f11466a.entities, false, true, true, false, i9 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
