package jh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import org.telegram.ui.Components.b31;

public final class c4 {

    public TL_stories.StoryItem f13141a = null;

    public r6 f13142b = null;

    public TL_stories.StoryItem f13143c;
    public boolean d;

    public boolean f13144e;

    public boolean f13145f;

    public boolean f13146g;
    public CharSequence h;

    public v7 f13147i;

    public v7 f13148j;

    public final e4 f13149k;

    public c4(e4 e4Var) {
        this.f13149k = e4Var;
    }

    public static String c(c4 c4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = c4Var.f13141a;
        if (storyItem == null || (messageMedia = storyItem.media) == null) {
            if (c4Var.f13142b == null) {
                return "unknown";
            }
            return "uploading from " + c4Var.f13142b.f13908e;
        }
        if (messageMedia.photo != null) {
            StringBuilder sb2 = new StringBuilder("photo#");
            sb2.append(c4Var.f13141a.media.photo.f22404id);
            sb2.append("at");
            return a9.p.k(c4Var.f13141a.media.photo.dc_id, "dc", sb2);
        }
        if (messageMedia.document == null) {
            return "unknown";
        }
        StringBuilder sb3 = new StringBuilder("doc#");
        sb3.append(c4Var.f13141a.media.document.f22386id);
        sb3.append("at");
        return a9.p.k(c4Var.f13141a.media.document.dc_id, "dc", sb3);
    }

    public final boolean d() {
        r6 r6Var = this.f13142b;
        if (r6Var != null) {
            return r6Var.f13907c.H0;
        }
        TL_stories.StoryItem storyItem = this.f13141a;
        if (storyItem == null) {
            return true;
        }
        if (storyItem.noforwards) {
            return false;
        }
        if (!storyItem.pinned) {
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.f13149k.f13296y2).getChat(Long.valueOf(-storyItem.dialogId));
        return chat == null || !chat.noforwards;
    }

    public final String e() {
        e4 e4Var = this.f13149k;
        if (e4Var.K1.f13141a == null) {
            return null;
        }
        if (e4Var.f13291x1 > 0) {
            TLRPC.User user = MessagesController.getInstance(e4Var.f13296y2).getUser(Long.valueOf(e4Var.f13291x1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            return e4Var.K1.f13145f ? String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(e4Var.K1.f13141a.f22617id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(e4Var.f13296y2).getChat(Long.valueOf(-e4Var.f13291x1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        return e4Var.K1.f13145f ? String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(e4Var.K1.f13141a.f22617id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f13141a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final v7 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f13147i == null && (storyItem = this.f13141a) != null) {
            TLRPC.Document document = storyItem.music;
            v7 v7Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    v7Var = new v7();
                    v7Var.f14062f = true;
                    v7Var.f14063g = document;
                    if (TextUtils.isEmpty(str)) {
                        v7Var.f14066k = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        v7Var.f14066k = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str2);
                        v7Var.f14066k = spannableStringBuilderAppend;
                        int length = spannableStringBuilderAppend.length();
                        v7Var.f14066k.append((CharSequence) " ・ ");
                        v7Var.f14066k.setSpan(new u7(), length, v7Var.f14066k.length(), 33);
                        v7Var.f14066k.append((CharSequence) str);
                    }
                }
            }
            this.f13147i = v7Var;
        }
        return this.f13147i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f13141a;
        if (storyItem == null) {
            return null;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        e4 e4Var = this.f13149k;
        if (messageMedia != null && messageMedia.getDocument() != null) {
            return FileLoader.getInstance(e4Var.f13296y2).getPathToAttach(this.f13141a.media.getDocument());
        }
        TLRPC.MessageMedia messageMedia2 = this.f13141a.media;
        if (messageMedia2 == null || (photo = messageMedia2.photo) == null) {
            return null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
        File pathToAttach = FileLoader.getInstance(e4Var.f13296y2).getPathToAttach(closestPhotoSizeWithSize, true);
        return !pathToAttach.exists() ? FileLoader.getInstance(e4Var.f13296y2).getPathToAttach(closestPhotoSizeWithSize, false) : pathToAttach;
    }

    public final v7 i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        if (this.f13148j == null) {
            TL_stories.StoryItem storyItem = this.f13141a;
            int id2 = 0;
            v7 v7Var = null;
            if (storyItem != null) {
                int i10 = this.f13149k.f13296y2;
                if (storyItem.fwd_from != null) {
                    v7Var = new v7();
                    v7Var.f14058a = i10;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        v7Var.f14059b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            v7Var.f14066k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId))));
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                            v7Var.f14066k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat3) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) (chat3 != null ? chat3.title : ""));
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        v7Var.f14066k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    v7Var.f14062f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        v7Var.f14060c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    v7Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (id2 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(id2) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(id2);
                        }
                        id2++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        v7Var = new v7();
                        v7Var.f14059b = Long.valueOf(-chat2.f22380id);
                        v7Var.f14061e = true;
                        v7Var.f14058a = i10;
                        v7Var.f14062f = true;
                        v7Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        v7Var.f14066k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat2) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.f13148j = v7Var;
            } else {
                r6 r6Var = this.f13142b;
                if (r6Var != null) {
                    lh.z7 z7Var = r6Var.f13907c;
                    if (z7Var != null) {
                        if (z7Var.f17221n) {
                            v7Var = new v7();
                            v7Var.f14066k = z7Var.f17225p;
                            String str = z7Var.f17231s;
                            v7Var.f14067l = str;
                            v7Var.f14062f = TextUtils.isEmpty(str);
                        } else if (z7Var.f17235u && (arrayList = z7Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) z7Var.v.get(0);
                            long jP = lh.z7.p(messageObject);
                            if (jP < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-jP))) != null) {
                                v7Var = new v7();
                                v7Var.f14059b = Long.valueOf(jP);
                                v7Var.f14061e = true;
                                v7Var.f14058a = messageObject.currentAccount;
                                v7Var.f14062f = true;
                                Boolean boolD = lh.z7.D(messageObject);
                                if (boolD != null) {
                                    id2 = boolD.booleanValue() ? messageObject.messageOwner.fwd_from.channel_post : messageObject.getId();
                                }
                                v7Var.d = Integer.valueOf(id2);
                                v7Var.f14066k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.f13148j = v7Var;
                }
            }
        }
        return this.f13148j;
    }

    public final boolean j() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.f13144e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f13141a;
        if (storyItem == null || (messageMedia = storyItem.media) == null || (document = messageMedia.getDocument()) == null) {
            r6 r6Var = this.f13142b;
            if (r6Var != null) {
                return !r6Var.f13907c.Y;
            }
            return true;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.f13141a;
        if (storyItem == null) {
            return false;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        return (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f22397id;
    }

    public final boolean l() {
        return this.f13144e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        r6 r6Var = this.f13142b;
        if (r6Var != null) {
            return r6Var.f13912s;
        }
        TL_stories.StoryItem storyItem = this.f13141a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f13141a.media.getDocument();
            return MessageObject.isVideoDocument(document) || "video/mp4".equals(document.mime_type);
        }
        TL_stories.StoryItem storyItem2 = this.f13141a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        TLRPC.MessageMedia messageMedia;
        this.f13141a = storyItem;
        this.f13148j = null;
        this.f13147i = null;
        this.f13142b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.f13144e = m();
        TL_stories.StoryItem storyItem2 = this.f13141a;
        this.f13145f = (storyItem2 == null || (messageMedia = storyItem2.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
    }

    public final void o() {
        int i10;
        this.f13146g = false;
        e4 e4Var = this.f13149k;
        n3 n3Var = e4Var.G0;
        c4 c4Var = e4Var.K1;
        r6 r6Var = c4Var.f13142b;
        if (r6Var != null) {
            CharSequence charSequence = r6Var.f13907c.C0;
            this.h = charSequence;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, n3Var.U.getPaint().getFontMetricsInt(), false);
            this.h = charSequenceReplaceEmoji;
            SpannableStringBuilder spannableStringBuilder = charSequenceReplaceEmoji == null ? new SpannableStringBuilder() : SpannableStringBuilder.valueOf(charSequenceReplaceEmoji);
            TLRPC.User user = MessagesController.getInstance(e4Var.f13296y2).getUser(Long.valueOf(e4Var.f13291x1));
            if (e4Var.f13291x1 < 0 || MessagesController.getInstance(e4Var.f13296y2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, spannableStringBuilder);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = c4Var.f13141a;
        if (storyItem != null) {
            if (!storyItem.translated || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, b31.C())) {
                String str = c4Var.f13141a.caption;
                this.h = str;
                CharSequence charSequenceReplaceEmoji2 = Emoji.replaceEmoji(str, n3Var.U.getPaint().getFontMetricsInt(), false);
                this.h = charSequenceReplaceEmoji2;
                if (charSequenceReplaceEmoji2 == null || c4Var.f13141a.entities == null) {
                    return;
                }
                SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(c4Var.f13141a.caption), c4Var.f13141a.entities, n3Var.U.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(spannableStringBuilderValueOf, n3Var.U.getPaint().getFontMetricsInt(), false));
                i10 = (e4Var.f13291x1 < 0 || MessagesController.getInstance(e4Var.f13296y2).storyEntitiesAllowed(MessagesController.getInstance(e4Var.f13296y2).getUser(Long.valueOf(e4Var.f13291x1)))) ? 1 : 0;
                if (i10 != 0) {
                    MessageObject.addLinks(true, spannableStringBuilderValueOf);
                }
                MessageObject.addEntitiesToText(spannableStringBuilderValueOf, c4Var.f13141a.entities, false, true, true, false, i10 ^ 1);
                this.h = spannableStringBuilderValueOf;
                return;
            }
            this.f13146g = true;
            TLRPC.TL_textWithEntities tL_textWithEntities = c4Var.f13141a.translatedText;
            String str2 = tL_textWithEntities.text;
            this.h = str2;
            CharSequence charSequenceReplaceEmoji3 = Emoji.replaceEmoji(str2, n3Var.U.getPaint().getFontMetricsInt(), false);
            this.h = charSequenceReplaceEmoji3;
            if (charSequenceReplaceEmoji3 == null || tL_textWithEntities.entities == null) {
                return;
            }
            SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, n3Var.U.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder.valueOf(Emoji.replaceEmoji(spannableStringBuilderValueOf2, n3Var.U.getPaint().getFontMetricsInt(), false));
            i10 = (e4Var.f13291x1 < 0 || MessagesController.getInstance(e4Var.f13296y2).storyEntitiesAllowed(MessagesController.getInstance(e4Var.f13296y2).getUser(Long.valueOf(e4Var.f13291x1)))) ? 1 : 0;
            if (i10 != 0) {
                MessageObject.addLinks(true, spannableStringBuilderValueOf2);
            }
            MessageObject.addEntitiesToText(spannableStringBuilderValueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
            this.h = spannableStringBuilderValueOf2;
        }
    }
}
