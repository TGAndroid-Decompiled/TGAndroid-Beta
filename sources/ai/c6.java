package ai;

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
import org.telegram.ui.Components.j41;
public final class c6 {
    public TL_stories.StoryItem f642a = null;
    public k9 f643b = null;
    public TL_stories.StoryItem f644c;
    public boolean d;
    public boolean e;
    public boolean f645f;
    public boolean f646g;
    public CharSequence h;
    public sa f647i;
    public sa f648j;
    public final e6 f649k;

    public c6(e6 e6Var) {
        this.f649k = e6Var;
    }

    public static String c(c6 c6Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = c6Var.f642a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(c6Var.f642a.media.photo.f18359id);
                sb2.append("at");
                return a4.a.o(c6Var.f642a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(c6Var.f642a.media.document.f18341id);
                sb3.append("at");
                return a4.a.o(c6Var.f642a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (c6Var.f643b != null) {
            return "uploading from " + c6Var.f643b.e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        k9 k9Var = this.f643b;
        if (k9Var != null) {
            return k9Var.f1143c.H0;
        }
        TL_stories.StoryItem storyItem = this.f642a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat chat = MessagesController.getInstance(this.f649k.C2).getChat(Long.valueOf(-storyItem.dialogId));
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
        e6 e6Var = this.f649k;
        if (e6Var.O1.f642a == null) {
            return null;
        }
        if (e6Var.B1 > 0) {
            TLRPC.User user = MessagesController.getInstance(e6Var.C2).getUser(Long.valueOf(e6Var.B1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            if (e6Var.O1.f645f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(e6Var.O1.f642a.f18570id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(e6Var.C2).getChat(Long.valueOf(-e6Var.B1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        if (e6Var.O1.f645f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(e6Var.O1.f642a.f18570id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f642a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final sa g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f647i == null && (storyItem = this.f642a) != null) {
            TLRPC.Document document = storyItem.music;
            sa saVar = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    saVar = new sa();
                    saVar.f1515f = true;
                    saVar.f1516g = document;
                    if (TextUtils.isEmpty(str)) {
                        saVar.f1519k = new SpannableStringBuilder(sa.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        saVar.f1519k = new SpannableStringBuilder(sa.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(sa.d()).append((CharSequence) " ").append((CharSequence) str2);
                        saVar.f1519k = append;
                        int length = append.length();
                        saVar.f1519k.append((CharSequence) " ・ ");
                        saVar.f1519k.setSpan(new CharacterStyle(), length, saVar.f1519k.length(), 33);
                        saVar.f1519k.append((CharSequence) str);
                    }
                }
            }
            this.f647i = saVar;
        }
        return this.f647i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f642a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            e6 e6Var = this.f649k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(e6Var.C2).getPathToAttach(this.f642a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f642a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
                File pathToAttach = FileLoader.getInstance(e6Var.C2).getPathToAttach(closestPhotoSizeWithSize, true);
                if (!pathToAttach.exists()) {
                    return FileLoader.getInstance(e6Var.C2).getPathToAttach(closestPhotoSizeWithSize, false);
                }
                return pathToAttach;
            }
            return null;
        }
        return null;
    }

    public final sa i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        CharSequence groupSpan;
        TLRPC.Chat chat2;
        CharSequence groupSpan2;
        CharSequence groupSpan3;
        String str;
        if (this.f648j == null) {
            TL_stories.StoryItem storyItem = this.f642a;
            int i10 = 0;
            sa saVar = null;
            if (storyItem != null) {
                int i11 = this.f649k.C2;
                if (storyItem.fwd_from != null) {
                    saVar = new sa();
                    saVar.f1512a = i11;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        saVar.f1513b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            saVar.f1519k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId))));
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
                            saVar.f1519k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        saVar.f1519k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    saVar.f1515f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        saVar.f1514c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    saVar.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i10 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i10);
                        }
                        i10++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        saVar = new sa();
                        saVar.f1513b = Long.valueOf(-chat2.f18335id);
                        saVar.e = true;
                        saVar.f1512a = i11;
                        saVar.f1515f = true;
                        saVar.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            groupSpan2 = MessageObject.channelSpan();
                        } else {
                            groupSpan2 = MessageObject.groupSpan();
                        }
                        saVar.f1519k = new SpannableStringBuilder(groupSpan2).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f648j = saVar;
            } else {
                k9 k9Var = this.f643b;
                if (k9Var != null) {
                    ci.l8 l8Var = k9Var.f1143c;
                    if (l8Var != null) {
                        if (l8Var.f4991n) {
                            saVar = new sa();
                            saVar.f1519k = l8Var.f4995p;
                            String str2 = l8Var.f5001s;
                            saVar.f1520l = str2;
                            saVar.f1515f = TextUtils.isEmpty(str2);
                        } else if (l8Var.f5005u && (arrayList = l8Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) l8Var.v.get(0);
                            long p5 = ci.l8.p(messageObject);
                            if (p5 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p5))) != null) {
                                saVar = new sa();
                                saVar.f1513b = Long.valueOf(p5);
                                saVar.e = true;
                                saVar.f1512a = messageObject.currentAccount;
                                saVar.f1515f = true;
                                Boolean D = ci.l8.D(messageObject);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i10 = messageObject.messageOwner.fwd_from.channel_post;
                                    } else {
                                        i10 = messageObject.getId();
                                    }
                                }
                                saVar.d = Integer.valueOf(i10);
                                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                    groupSpan = MessageObject.channelSpan();
                                } else {
                                    groupSpan = MessageObject.groupSpan();
                                }
                                saVar.f1519k = new SpannableStringBuilder(groupSpan).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f648j = saVar;
                }
            }
        }
        return this.f648j;
    }

    public final boolean j() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f642a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        k9 k9Var = this.f643b;
        if (k9Var == null) {
            return true;
        }
        return !k9Var.f1143c.Y;
    }

    public final boolean k(long j3) {
        TL_stories.StoryItem storyItem = this.f642a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j3 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f18352id) {
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
        k9 k9Var = this.f643b;
        if (k9Var != null) {
            return k9Var.f1147s;
        }
        TL_stories.StoryItem storyItem = this.f642a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f642a.media.getDocument();
            if (!MessageObject.isVideoDocument(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f642a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f642a = storyItem;
        this.f648j = null;
        this.f647i = null;
        this.f643b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.e = m();
        TL_stories.StoryItem storyItem2 = this.f642a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f645f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i10 = 0;
        this.f646g = false;
        e6 e6Var = this.f649k;
        g5 g5Var = e6Var.K0;
        c6 c6Var = e6Var.O1;
        k9 k9Var = c6Var.f643b;
        if (k9Var != null) {
            CharSequence charSequence = k9Var.f1143c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, g5Var.f1712b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            if (replaceEmoji == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(replaceEmoji);
            }
            TLRPC.User user = MessagesController.getInstance(e6Var.C2).getUser(Long.valueOf(e6Var.B1));
            if (e6Var.B1 < 0 || MessagesController.getInstance(e6Var.C2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, valueOf);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = c6Var.f642a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, j41.A())) {
                this.f646g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = c6Var.f642a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, g5Var.f1712b0.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, g5Var.f1712b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, g5Var.f1712b0.getPaint().getFontMetricsInt(), false));
                    i10 = (e6Var.B1 < 0 || MessagesController.getInstance(e6Var.C2).storyEntitiesAllowed(MessagesController.getInstance(e6Var.C2).getUser(Long.valueOf(e6Var.B1)))) ? 1 : 1;
                    if (i10 != 0) {
                        MessageObject.addLinks(true, valueOf2);
                    }
                    MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = c6Var.f642a.caption;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, g5Var.f1712b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 != null && c6Var.f642a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(c6Var.f642a.caption), c6Var.f642a.entities, g5Var.f1712b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf3, g5Var.f1712b0.getPaint().getFontMetricsInt(), false));
                i10 = (e6Var.B1 < 0 || MessagesController.getInstance(e6Var.C2).storyEntitiesAllowed(MessagesController.getInstance(e6Var.C2).getUser(Long.valueOf(e6Var.B1)))) ? 1 : 1;
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf3);
                }
                MessageObject.addEntitiesToText(valueOf3, c6Var.f642a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
