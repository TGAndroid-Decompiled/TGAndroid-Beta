package nh;

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
public final class b4 {
    public TL_stories.StoryItem f15091a = null;
    public s6 f15092b = null;
    public TL_stories.StoryItem f15093c;
    public boolean d;
    public boolean e;
    public boolean f15094f;
    public boolean f15095g;
    public CharSequence h;
    public v7 f15096i;
    public v7 f15097j;
    public final d4 f15098k;

    public b4(d4 d4Var) {
        this.f15098k = d4Var;
    }

    public static String c(b4 b4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = b4Var.f15091a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb = new StringBuilder("photo#");
                sb.append(b4Var.f15091a.media.photo.f19183id);
                sb.append("at");
                return android.support.v4.media.a.m(b4Var.f15091a.media.photo.dc_id, "dc", sb);
            } else if (messageMedia.document != null) {
                StringBuilder sb2 = new StringBuilder("doc#");
                sb2.append(b4Var.f15091a.media.document.f19165id);
                sb2.append("at");
                return android.support.v4.media.a.m(b4Var.f15091a.media.document.dc_id, "dc", sb2);
            } else {
                return "unknown";
            }
        } else if (b4Var.f15092b != null) {
            return "uploading from " + b4Var.f15092b.e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        s6 s6Var = this.f15092b;
        if (s6Var != null) {
            return s6Var.f15863c.H0;
        }
        TL_stories.StoryItem storyItem = this.f15091a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat chat = MessagesController.getInstance(this.f15098k.f15243z2).getChat(Long.valueOf(-storyItem.dialogId));
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
        d4 d4Var = this.f15098k;
        if (d4Var.L1.f15091a == null) {
            return null;
        }
        if (d4Var.f15238y1 > 0) {
            TLRPC.User user = MessagesController.getInstance(d4Var.f15243z2).getUser(Long.valueOf(d4Var.f15238y1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            if (d4Var.L1.f15094f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(d4Var.L1.f15091a.f19394id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(d4Var.f15243z2).getChat(Long.valueOf(-d4Var.f15238y1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        if (d4Var.L1.f15094f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(d4Var.L1.f15091a.f19394id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f15091a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final v7 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f15096i == null && (storyItem = this.f15091a) != null) {
            TLRPC.Document document = storyItem.music;
            v7 v7Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    v7Var = new v7();
                    v7Var.f15978f = true;
                    v7Var.f15979g = document;
                    if (TextUtils.isEmpty(str)) {
                        v7Var.f15982k = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        v7Var.f15982k = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str2);
                        v7Var.f15982k = append;
                        int length = append.length();
                        v7Var.f15982k.append((CharSequence) " ・ ");
                        v7Var.f15982k.setSpan(new CharacterStyle(), length, v7Var.f15982k.length(), 33);
                        v7Var.f15982k.append((CharSequence) str);
                    }
                }
            }
            this.f15096i = v7Var;
        }
        return this.f15096i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f15091a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            d4 d4Var = this.f15098k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(d4Var.f15243z2).getPathToAttach(this.f15091a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f15091a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
                File pathToAttach = FileLoader.getInstance(d4Var.f15243z2).getPathToAttach(closestPhotoSizeWithSize, true);
                if (!pathToAttach.exists()) {
                    return FileLoader.getInstance(d4Var.f15243z2).getPathToAttach(closestPhotoSizeWithSize, false);
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
        if (this.f15097j == null) {
            TL_stories.StoryItem storyItem = this.f15091a;
            int i10 = 0;
            v7 v7Var = null;
            if (storyItem != null) {
                int i11 = this.f15098k.f15243z2;
                if (storyItem.fwd_from != null) {
                    v7Var = new v7();
                    v7Var.f15975a = i11;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        v7Var.f15976b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            v7Var.f15982k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId))));
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
                            v7Var.f15982k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        v7Var.f15982k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    v7Var.f15978f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        v7Var.f15977c = Integer.valueOf(storyFwdHeader2.story_id);
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
                        v7Var.f15976b = Long.valueOf(-chat2.f19159id);
                        v7Var.e = true;
                        v7Var.f15975a = i11;
                        v7Var.f15978f = true;
                        v7Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            groupSpan2 = MessageObject.channelSpan();
                        } else {
                            groupSpan2 = MessageObject.groupSpan();
                        }
                        v7Var.f15982k = new SpannableStringBuilder(groupSpan2).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f15097j = v7Var;
            } else {
                s6 s6Var = this.f15092b;
                if (s6Var != null) {
                    ph.t6 t6Var = s6Var.f15863c;
                    if (t6Var != null) {
                        if (t6Var.f42426n) {
                            v7Var = new v7();
                            v7Var.f15982k = t6Var.f42430p;
                            String str2 = t6Var.f42436s;
                            v7Var.f15983l = str2;
                            v7Var.f15978f = TextUtils.isEmpty(str2);
                        } else if (t6Var.f42440u && (arrayList = t6Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) t6Var.v.get(0);
                            long p10 = ph.t6.p(messageObject);
                            if (p10 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p10))) != null) {
                                v7Var = new v7();
                                v7Var.f15976b = Long.valueOf(p10);
                                v7Var.e = true;
                                v7Var.f15975a = messageObject.currentAccount;
                                v7Var.f15978f = true;
                                Boolean D = ph.t6.D(messageObject);
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
                                v7Var.f15982k = new SpannableStringBuilder(groupSpan).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f15097j = v7Var;
                }
            }
        }
        return this.f15097j;
    }

    public final boolean j() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f15091a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        s6 s6Var = this.f15092b;
        if (s6Var == null) {
            return true;
        }
        return !s6Var.f15863c.Y;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.f15091a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f19176id) {
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
        s6 s6Var = this.f15092b;
        if (s6Var != null) {
            return s6Var.f15867s;
        }
        TL_stories.StoryItem storyItem = this.f15091a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f15091a.media.getDocument();
            if (!MessageObject.isVideoDocument(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f15091a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z4;
        TLRPC.MessageMedia messageMedia;
        this.f15091a = storyItem;
        this.f15097j = null;
        this.f15096i = null;
        this.f15092b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.e = m();
        TL_stories.StoryItem storyItem2 = this.f15091a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f15094f = z4;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i10 = 0;
        this.f15095g = false;
        d4 d4Var = this.f15098k;
        m3 m3Var = d4Var.H0;
        b4 b4Var = d4Var.L1;
        s6 s6Var = b4Var.f15092b;
        if (s6Var != null) {
            CharSequence charSequence = s6Var.f15863c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, m3Var.V.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            if (replaceEmoji == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(replaceEmoji);
            }
            TLRPC.User user = MessagesController.getInstance(d4Var.f15243z2).getUser(Long.valueOf(d4Var.f15238y1));
            if (d4Var.f15238y1 < 0 || MessagesController.getInstance(d4Var.f15243z2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, valueOf);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = b4Var.f15091a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, v31.B())) {
                this.f15095g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = b4Var.f15091a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, m3Var.V.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, m3Var.V.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, m3Var.V.getPaint().getFontMetricsInt(), false));
                    i10 = (d4Var.f15238y1 < 0 || MessagesController.getInstance(d4Var.f15243z2).storyEntitiesAllowed(MessagesController.getInstance(d4Var.f15243z2).getUser(Long.valueOf(d4Var.f15238y1)))) ? 1 : 1;
                    if (i10 != 0) {
                        MessageObject.addLinks(true, valueOf2);
                    }
                    MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = b4Var.f15091a.caption;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, m3Var.V.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 != null && b4Var.f15091a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(b4Var.f15091a.caption), b4Var.f15091a.entities, m3Var.V.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf3, m3Var.V.getPaint().getFontMetricsInt(), false));
                i10 = (d4Var.f15238y1 < 0 || MessagesController.getInstance(d4Var.f15243z2).storyEntitiesAllowed(MessagesController.getInstance(d4Var.f15243z2).getUser(Long.valueOf(d4Var.f15238y1)))) ? 1 : 1;
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf3);
                }
                MessageObject.addEntitiesToText(valueOf3, b4Var.f15091a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
