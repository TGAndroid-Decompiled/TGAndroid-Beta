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
import org.telegram.ui.Components.w31;
public final class d6 {
    public TL_stories.StoryItem f706a = null;
    public k9 f707b = null;
    public TL_stories.StoryItem f708c;
    public boolean d;
    public boolean e;
    public boolean f709f;
    public boolean f710g;
    public CharSequence h;
    public sa f711i;
    public sa f712j;
    public final f6 f713k;

    public d6(f6 f6Var) {
        this.f713k = f6Var;
    }

    public static String c(d6 d6Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = d6Var.f706a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(d6Var.f706a.media.photo.f18145id);
                sb2.append("at");
                return a4.a.n(d6Var.f706a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(d6Var.f706a.media.document.f18127id);
                sb3.append("at");
                return a4.a.n(d6Var.f706a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (d6Var.f707b != null) {
            return "uploading from " + d6Var.f707b.e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        k9 k9Var = this.f707b;
        if (k9Var != null) {
            return k9Var.f1143c.H0;
        }
        TL_stories.StoryItem storyItem = this.f706a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat chat = MessagesController.getInstance(this.f713k.C2).getChat(Long.valueOf(-storyItem.dialogId));
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
        f6 f6Var = this.f713k;
        if (f6Var.O1.f706a == null) {
            return null;
        }
        if (f6Var.B1 > 0) {
            TLRPC.User user = MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            if (f6Var.O1.f709f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(f6Var.O1.f706a.f18357id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(f6Var.C2).getChat(Long.valueOf(-f6Var.B1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        if (f6Var.O1.f709f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(f6Var.O1.f706a.f18357id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f706a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final sa g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f711i == null && (storyItem = this.f706a) != null) {
            TLRPC.Document document = storyItem.music;
            sa saVar = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    saVar = new sa();
                    saVar.f1516f = true;
                    saVar.f1517g = document;
                    if (TextUtils.isEmpty(str)) {
                        saVar.f1520k = new SpannableStringBuilder(sa.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        saVar.f1520k = new SpannableStringBuilder(sa.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(sa.d()).append((CharSequence) " ").append((CharSequence) str2);
                        saVar.f1520k = append;
                        int length = append.length();
                        saVar.f1520k.append((CharSequence) " ・ ");
                        saVar.f1520k.setSpan(new CharacterStyle(), length, saVar.f1520k.length(), 33);
                        saVar.f1520k.append((CharSequence) str);
                    }
                }
            }
            this.f711i = saVar;
        }
        return this.f711i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f706a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            f6 f6Var = this.f713k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(f6Var.C2).getPathToAttach(this.f706a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f706a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
                File pathToAttach = FileLoader.getInstance(f6Var.C2).getPathToAttach(closestPhotoSizeWithSize, true);
                if (!pathToAttach.exists()) {
                    return FileLoader.getInstance(f6Var.C2).getPathToAttach(closestPhotoSizeWithSize, false);
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
        if (this.f712j == null) {
            TL_stories.StoryItem storyItem = this.f706a;
            int i10 = 0;
            sa saVar = null;
            if (storyItem != null) {
                int i11 = this.f713k.C2;
                if (storyItem.fwd_from != null) {
                    saVar = new sa();
                    saVar.f1513a = i11;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        saVar.f1514b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            saVar.f1520k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId))));
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
                            saVar.f1520k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        saVar.f1520k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    saVar.f1516f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        saVar.f1515c = Integer.valueOf(storyFwdHeader2.story_id);
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
                        saVar.f1514b = Long.valueOf(-chat2.f18121id);
                        saVar.e = true;
                        saVar.f1513a = i11;
                        saVar.f1516f = true;
                        saVar.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            groupSpan2 = MessageObject.channelSpan();
                        } else {
                            groupSpan2 = MessageObject.groupSpan();
                        }
                        saVar.f1520k = new SpannableStringBuilder(groupSpan2).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f712j = saVar;
            } else {
                k9 k9Var = this.f707b;
                if (k9Var != null) {
                    ci.o8 o8Var = k9Var.f1143c;
                    if (o8Var != null) {
                        if (o8Var.f5169n) {
                            saVar = new sa();
                            saVar.f1520k = o8Var.f5173p;
                            String str2 = o8Var.f5179s;
                            saVar.f1521l = str2;
                            saVar.f1516f = TextUtils.isEmpty(str2);
                        } else if (o8Var.f5183u && (arrayList = o8Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) o8Var.v.get(0);
                            long p5 = ci.o8.p(messageObject);
                            if (p5 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p5))) != null) {
                                saVar = new sa();
                                saVar.f1514b = Long.valueOf(p5);
                                saVar.e = true;
                                saVar.f1513a = messageObject.currentAccount;
                                saVar.f1516f = true;
                                Boolean D = ci.o8.D(messageObject);
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
                                saVar.f1520k = new SpannableStringBuilder(groupSpan).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f712j = saVar;
                }
            }
        }
        return this.f712j;
    }

    public final boolean j() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f706a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        k9 k9Var = this.f707b;
        if (k9Var == null) {
            return true;
        }
        return !k9Var.f1143c.Y;
    }

    public final boolean k(long j3) {
        TL_stories.StoryItem storyItem = this.f706a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j3 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f18138id) {
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
        k9 k9Var = this.f707b;
        if (k9Var != null) {
            return k9Var.f1147s;
        }
        TL_stories.StoryItem storyItem = this.f706a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f706a.media.getDocument();
            if (!MessageObject.isVideoDocument(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f706a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f706a = storyItem;
        this.f712j = null;
        this.f711i = null;
        this.f707b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.e = m();
        TL_stories.StoryItem storyItem2 = this.f706a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f709f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i10 = 0;
        this.f710g = false;
        f6 f6Var = this.f713k;
        h5 h5Var = f6Var.K0;
        d6 d6Var = f6Var.O1;
        k9 k9Var = d6Var.f707b;
        if (k9Var != null) {
            CharSequence charSequence = k9Var.f1143c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, h5Var.f1717b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            if (replaceEmoji == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(replaceEmoji);
            }
            TLRPC.User user = MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1));
            if (f6Var.B1 < 0 || MessagesController.getInstance(f6Var.C2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, valueOf);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = d6Var.f706a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, w31.A())) {
                this.f710g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = d6Var.f706a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, h5Var.f1717b0.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, h5Var.f1717b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, h5Var.f1717b0.getPaint().getFontMetricsInt(), false));
                    i10 = (f6Var.B1 < 0 || MessagesController.getInstance(f6Var.C2).storyEntitiesAllowed(MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1)))) ? 1 : 1;
                    if (i10 != 0) {
                        MessageObject.addLinks(true, valueOf2);
                    }
                    MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = d6Var.f706a.caption;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, h5Var.f1717b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 != null && d6Var.f706a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(d6Var.f706a.caption), d6Var.f706a.entities, h5Var.f1717b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf3, h5Var.f1717b0.getPaint().getFontMetricsInt(), false));
                i10 = (f6Var.B1 < 0 || MessagesController.getInstance(f6Var.C2).storyEntitiesAllowed(MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1)))) ? 1 : 1;
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf3);
                }
                MessageObject.addEntitiesToText(valueOf3, d6Var.f706a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
