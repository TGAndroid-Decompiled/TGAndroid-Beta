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
import org.telegram.ui.Components.u31;
public final class m5 {
    public TL_stories.StoryItem f3310a = null;
    public t8 f3311b = null;
    public TL_stories.StoryItem f3312c;
    public boolean d;
    public boolean f3313e;
    public boolean f3314f;
    public boolean f3315g;
    public CharSequence h;
    public z9 f3316i;
    public z9 f3317j;
    public final o5 f3318k;

    public m5(o5 o5Var) {
        this.f3318k = o5Var;
    }

    public static String c(m5 m5Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = m5Var.f3310a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(m5Var.f3310a.media.photo.f19893id);
                sb2.append("at");
                return a4.a.n(m5Var.f3310a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(m5Var.f3310a.media.document.f19875id);
                sb3.append("at");
                return a4.a.n(m5Var.f3310a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (m5Var.f3311b != null) {
            return "uploading from " + m5Var.f3311b.f3741e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        t8 t8Var = this.f3311b;
        if (t8Var != null) {
            return t8Var.f3740c.H0;
        }
        TL_stories.StoryItem storyItem = this.f3310a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat chat = MessagesController.getInstance(this.f3318k.C2).getChat(Long.valueOf(-storyItem.dialogId));
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
        o5 o5Var = this.f3318k;
        if (o5Var.O1.f3310a == null) {
            return null;
        }
        if (o5Var.B1 > 0) {
            TLRPC.User user = MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            if (o5Var.O1.f3314f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(o5Var.O1.f3310a.f20107id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(o5Var.C2).getChat(Long.valueOf(-o5Var.B1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        if (o5Var.O1.f3314f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(o5Var.O1.f3310a.f20107id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f3310a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final z9 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f3316i == null && (storyItem = this.f3310a) != null) {
            TLRPC.Document document = storyItem.music;
            z9 z9Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    z9Var = new z9();
                    z9Var.f4078f = true;
                    z9Var.f4079g = document;
                    if (TextUtils.isEmpty(str)) {
                        z9Var.f4082k = new SpannableStringBuilder(z9.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        z9Var.f4082k = new SpannableStringBuilder(z9.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(z9.d()).append((CharSequence) " ").append((CharSequence) str2);
                        z9Var.f4082k = append;
                        int length = append.length();
                        z9Var.f4082k.append((CharSequence) " ・ ");
                        z9Var.f4082k.setSpan(new CharacterStyle(), length, z9Var.f4082k.length(), 33);
                        z9Var.f4082k.append((CharSequence) str);
                    }
                }
            }
            this.f3316i = z9Var;
        }
        return this.f3316i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f3310a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            o5 o5Var = this.f3318k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(o5Var.C2).getPathToAttach(this.f3310a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f3310a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
                File pathToAttach = FileLoader.getInstance(o5Var.C2).getPathToAttach(closestPhotoSizeWithSize, true);
                if (!pathToAttach.exists()) {
                    return FileLoader.getInstance(o5Var.C2).getPathToAttach(closestPhotoSizeWithSize, false);
                }
                return pathToAttach;
            }
            return null;
        }
        return null;
    }

    public final z9 i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        CharSequence groupSpan;
        TLRPC.Chat chat2;
        CharSequence groupSpan2;
        CharSequence groupSpan3;
        String str;
        if (this.f3317j == null) {
            TL_stories.StoryItem storyItem = this.f3310a;
            int i10 = 0;
            z9 z9Var = null;
            if (storyItem != null) {
                int i11 = this.f3318k.C2;
                if (storyItem.fwd_from != null) {
                    z9Var = new z9();
                    z9Var.f4074a = i11;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        z9Var.f4075b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            z9Var.f4082k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId))));
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
                            z9Var.f4082k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        z9Var.f4082k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    z9Var.f4078f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        z9Var.f4076c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    z9Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i10 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i10);
                        }
                        i10++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        z9Var = new z9();
                        z9Var.f4075b = Long.valueOf(-chat2.f19869id);
                        z9Var.f4077e = true;
                        z9Var.f4074a = i11;
                        z9Var.f4078f = true;
                        z9Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            groupSpan2 = MessageObject.channelSpan();
                        } else {
                            groupSpan2 = MessageObject.groupSpan();
                        }
                        z9Var.f4082k = new SpannableStringBuilder(groupSpan2).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f3317j = z9Var;
            } else {
                t8 t8Var = this.f3311b;
                if (t8Var != null) {
                    di.o8 o8Var = t8Var.f3740c;
                    if (o8Var != null) {
                        if (o8Var.f7768n) {
                            z9Var = new z9();
                            z9Var.f4082k = o8Var.f7772p;
                            String str2 = o8Var.f7778s;
                            z9Var.f4083l = str2;
                            z9Var.f4078f = TextUtils.isEmpty(str2);
                        } else if (o8Var.f7782u && (arrayList = o8Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) o8Var.v.get(0);
                            long p5 = di.o8.p(messageObject);
                            if (p5 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p5))) != null) {
                                z9Var = new z9();
                                z9Var.f4075b = Long.valueOf(p5);
                                z9Var.f4077e = true;
                                z9Var.f4074a = messageObject.currentAccount;
                                z9Var.f4078f = true;
                                Boolean D = di.o8.D(messageObject);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i10 = messageObject.messageOwner.fwd_from.channel_post;
                                    } else {
                                        i10 = messageObject.getId();
                                    }
                                }
                                z9Var.d = Integer.valueOf(i10);
                                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                    groupSpan = MessageObject.channelSpan();
                                } else {
                                    groupSpan = MessageObject.groupSpan();
                                }
                                z9Var.f4082k = new SpannableStringBuilder(groupSpan).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f3317j = z9Var;
                }
            }
        }
        return this.f3317j;
    }

    public final boolean j() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.f3313e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f3310a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        t8 t8Var = this.f3311b;
        if (t8Var == null) {
            return true;
        }
        return !t8Var.f3740c.Y;
    }

    public final boolean k(long j3) {
        TL_stories.StoryItem storyItem = this.f3310a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j3 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f19886id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        return this.f3313e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        t8 t8Var = this.f3311b;
        if (t8Var != null) {
            return t8Var.f3745s;
        }
        TL_stories.StoryItem storyItem = this.f3310a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f3310a.media.getDocument();
            if (!MessageObject.isVideoDocument(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f3310a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f3310a = storyItem;
        this.f3317j = null;
        this.f3316i = null;
        this.f3311b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.f3313e = m();
        TL_stories.StoryItem storyItem2 = this.f3310a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3314f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i10 = 0;
        this.f3315g = false;
        o5 o5Var = this.f3318k;
        s4 s4Var = o5Var.K0;
        m5 m5Var = o5Var.O1;
        t8 t8Var = m5Var.f3311b;
        if (t8Var != null) {
            CharSequence charSequence = t8Var.f3740c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, s4Var.f2922b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            if (replaceEmoji == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(replaceEmoji);
            }
            TLRPC.User user = MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1));
            if (o5Var.B1 < 0 || MessagesController.getInstance(o5Var.C2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, valueOf);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = m5Var.f3310a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, u31.B())) {
                this.f3315g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = m5Var.f3310a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, s4Var.f2922b0.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, s4Var.f2922b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, s4Var.f2922b0.getPaint().getFontMetricsInt(), false));
                    i10 = (o5Var.B1 < 0 || MessagesController.getInstance(o5Var.C2).storyEntitiesAllowed(MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1)))) ? 1 : 1;
                    if (i10 != 0) {
                        MessageObject.addLinks(true, valueOf2);
                    }
                    MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = m5Var.f3310a.caption;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, s4Var.f2922b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 != null && m5Var.f3310a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(m5Var.f3310a.caption), m5Var.f3310a.entities, s4Var.f2922b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf3, s4Var.f2922b0.getPaint().getFontMetricsInt(), false));
                i10 = (o5Var.B1 < 0 || MessagesController.getInstance(o5Var.C2).storyEntitiesAllowed(MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1)))) ? 1 : 1;
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf3);
                }
                MessageObject.addEntitiesToText(valueOf3, m5Var.f3310a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
