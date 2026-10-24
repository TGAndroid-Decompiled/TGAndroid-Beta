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
import org.telegram.ui.Components.x41;
public final class n4 {
    public TL_stories.StoryItem f5595a = null;
    public g7 f5596b = null;
    public TL_stories.StoryItem f5597c;
    public boolean d;
    public boolean e;
    public boolean f5598f;
    public boolean f5599g;
    public CharSequence h;
    public m8 f5600i;
    public m8 f5601j;
    public final p4 f5602k;

    public n4(p4 p4Var) {
        this.f5602k = p4Var;
    }

    public static String c(n4 n4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = n4Var.f5595a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(n4Var.f5595a.media.photo.f20368id);
                sb2.append("at");
                return a1.g.n(n4Var.f5595a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(n4Var.f5595a.media.document.f20350id);
                sb3.append("at");
                return a1.g.n(n4Var.f5595a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (n4Var.f5596b != null) {
            return "uploading from " + n4Var.f5596b.e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        g7 g7Var = this.f5596b;
        if (g7Var != null) {
            return g7Var.f5366c.H0;
        }
        TL_stories.StoryItem storyItem = this.f5595a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat chat = MessagesController.getInstance(this.f5602k.C2).getChat(Long.valueOf(-storyItem.dialogId));
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
        p4 p4Var = this.f5602k;
        if (p4Var.O1.f5595a == null) {
            return null;
        }
        if (p4Var.B1 > 0) {
            TLRPC.User user = MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            if (p4Var.O1.f5598f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(p4Var.O1.f5595a.f20578id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(p4Var.C2).getChat(Long.valueOf(-p4Var.B1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        if (p4Var.O1.f5598f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(p4Var.O1.f5595a.f20578id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f5595a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final m8 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f5600i == null && (storyItem = this.f5595a) != null) {
            TLRPC.Document document = storyItem.music;
            m8 m8Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    m8Var = new m8();
                    m8Var.f5567f = true;
                    m8Var.f5568g = document;
                    if (TextUtils.isEmpty(str)) {
                        m8Var.f5571k = new SpannableStringBuilder(m8.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        m8Var.f5571k = new SpannableStringBuilder(m8.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(m8.d()).append((CharSequence) " ").append((CharSequence) str2);
                        m8Var.f5571k = append;
                        int length = append.length();
                        m8Var.f5571k.append((CharSequence) " ・ ");
                        m8Var.f5571k.setSpan(new CharacterStyle(), length, m8Var.f5571k.length(), 33);
                        m8Var.f5571k.append((CharSequence) str);
                    }
                }
            }
            this.f5600i = m8Var;
        }
        return this.f5600i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f5595a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            p4 p4Var = this.f5602k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(p4Var.C2).getPathToAttach(this.f5595a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f5595a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
                File pathToAttach = FileLoader.getInstance(p4Var.C2).getPathToAttach(closestPhotoSizeWithSize, true);
                if (!pathToAttach.exists()) {
                    return FileLoader.getInstance(p4Var.C2).getPathToAttach(closestPhotoSizeWithSize, false);
                }
                return pathToAttach;
            }
            return null;
        }
        return null;
    }

    public final m8 i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        CharSequence groupSpan;
        TLRPC.Chat chat2;
        CharSequence groupSpan2;
        CharSequence groupSpan3;
        String str;
        if (this.f5601j == null) {
            TL_stories.StoryItem storyItem = this.f5595a;
            int i10 = 0;
            m8 m8Var = null;
            if (storyItem != null) {
                int i11 = this.f5602k.C2;
                if (storyItem.fwd_from != null) {
                    m8Var = new m8();
                    m8Var.f5564a = i11;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        m8Var.f5565b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            m8Var.f5571k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId))));
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
                            m8Var.f5571k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        m8Var.f5571k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    m8Var.f5567f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        m8Var.f5566c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    m8Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i10 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i10);
                        }
                        i10++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        m8Var = new m8();
                        m8Var.f5565b = Long.valueOf(-chat2.f20344id);
                        m8Var.e = true;
                        m8Var.f5564a = i11;
                        m8Var.f5567f = true;
                        m8Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            groupSpan2 = MessageObject.channelSpan();
                        } else {
                            groupSpan2 = MessageObject.groupSpan();
                        }
                        m8Var.f5571k = new SpannableStringBuilder(groupSpan2).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f5601j = m8Var;
            } else {
                g7 g7Var = this.f5596b;
                if (g7Var != null) {
                    ei.a8 a8Var = g7Var.f5366c;
                    if (a8Var != null) {
                        if (a8Var.f8730n) {
                            m8Var = new m8();
                            m8Var.f5571k = a8Var.f8734p;
                            String str2 = a8Var.f8740s;
                            m8Var.f5572l = str2;
                            m8Var.f5567f = TextUtils.isEmpty(str2);
                        } else if (a8Var.f8744u && (arrayList = a8Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) a8Var.v.get(0);
                            long p5 = ei.a8.p(messageObject);
                            if (p5 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p5))) != null) {
                                m8Var = new m8();
                                m8Var.f5565b = Long.valueOf(p5);
                                m8Var.e = true;
                                m8Var.f5564a = messageObject.currentAccount;
                                m8Var.f5567f = true;
                                Boolean D = ei.a8.D(messageObject);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i10 = messageObject.messageOwner.fwd_from.channel_post;
                                    } else {
                                        i10 = messageObject.getId();
                                    }
                                }
                                m8Var.d = Integer.valueOf(i10);
                                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                    groupSpan = MessageObject.channelSpan();
                                } else {
                                    groupSpan = MessageObject.groupSpan();
                                }
                                m8Var.f5571k = new SpannableStringBuilder(groupSpan).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f5601j = m8Var;
                }
            }
        }
        return this.f5601j;
    }

    public final boolean j() {
        g7 g7Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f5595a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        if (this.f5596b == null) {
            return true;
        }
        return !g7Var.f5366c.Y;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.f5595a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f20361id) {
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
        g7 g7Var = this.f5596b;
        if (g7Var != null) {
            return g7Var.f5370s;
        }
        TL_stories.StoryItem storyItem = this.f5595a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f5595a.media.getDocument();
            if (!MessageObject.isVideoDocument(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f5595a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f5595a = storyItem;
        this.f5601j = null;
        this.f5600i = null;
        this.f5596b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.e = m();
        TL_stories.StoryItem storyItem2 = this.f5595a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5598f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i10 = 0;
        this.f5599g = false;
        p4 p4Var = this.f5602k;
        u3 u3Var = p4Var.K0;
        n4 n4Var = p4Var.O1;
        g7 g7Var = n4Var.f5596b;
        if (g7Var != null) {
            CharSequence charSequence = g7Var.f5366c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, u3Var.f5876b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            if (replaceEmoji == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(replaceEmoji);
            }
            TLRPC.User user = MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1));
            if (p4Var.B1 < 0 || MessagesController.getInstance(p4Var.C2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, valueOf);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = n4Var.f5595a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, x41.L())) {
                this.f5599g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = n4Var.f5595a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, u3Var.f5876b0.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, u3Var.f5876b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, u3Var.f5876b0.getPaint().getFontMetricsInt(), false));
                    TLRPC.User user2 = MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1));
                    if (p4Var.B1 < 0 || MessagesController.getInstance(p4Var.C2).storyEntitiesAllowed(user2)) {
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
            String str2 = n4Var.f5595a.caption;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, u3Var.f5876b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 != null && n4Var.f5595a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(n4Var.f5595a.caption), n4Var.f5595a.entities, u3Var.f5876b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf3, u3Var.f5876b0.getPaint().getFontMetricsInt(), false));
                TLRPC.User user3 = MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1));
                if (p4Var.B1 < 0 || MessagesController.getInstance(p4Var.C2).storyEntitiesAllowed(user3)) {
                    i10 = 1;
                }
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf3);
                }
                MessageObject.addEntitiesToText(valueOf3, n4Var.f5595a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
