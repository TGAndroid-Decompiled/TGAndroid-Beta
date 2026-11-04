package ei;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f21;
public final class h4 {
    public TL_stories.StoryItem f10358a = null;
    public y6 f10359b = null;
    public TL_stories.StoryItem f10360c;
    public boolean d;
    public boolean f10361e;
    public boolean f10362f;
    public boolean f10363g;
    public CharSequence h;
    public c8 f10364i;
    public c8 f10365j;
    public final j4 f10366k;

    public h4(j4 j4Var) {
        this.f10366k = j4Var;
    }

    public static String c(h4 h4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = h4Var.f10358a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(h4Var.f10358a.media.photo.f27025id);
                sb2.append("at");
                return a1.g.o(h4Var.f10358a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(h4Var.f10358a.media.document.f27007id);
                sb3.append("at");
                return a1.g.o(h4Var.f10358a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (h4Var.f10359b != null) {
            return "uploading from " + h4Var.f10359b.f11237e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        y6 y6Var = this.f10359b;
        if (y6Var != null) {
            return y6Var.f11236c.H0;
        }
        TL_stories.StoryItem storyItem = this.f10358a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat M0 = hp.s1(this.f10366k.f10480m2).M0(Long.valueOf(-storyItem.dialogId));
                if (M0 != null && M0.noforwards) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final String e() {
        j4 j4Var = this.f10366k;
        if (j4Var.f10527y1.f10358a == null) {
            return null;
        }
        if (j4Var.f10477l1 > 0) {
            TLRPC.User a22 = hp.s1(j4Var.f10480m2).a2(Long.valueOf(j4Var.f10477l1));
            if (l10.n(a22) == null) {
                return null;
            }
            if (j4Var.f10527y1.f10362f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", l10.n(a22));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", l10.n(a22), Integer.valueOf(j4Var.f10527y1.f10358a.f27240id));
        }
        TLRPC.Chat M0 = hp.s1(j4Var.f10480m2).M0(Long.valueOf(-j4Var.f10477l1));
        if (org.telegram.messenger.t3.K(M0, false) == null) {
            return null;
        }
        if (j4Var.f10527y1.f10362f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", org.telegram.messenger.t3.K(M0, false));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", org.telegram.messenger.t3.K(M0, false), Integer.valueOf(j4Var.f10527y1.f10358a.f27240id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f10358a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final c8 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f10364i == null && (storyItem = this.f10358a) != null) {
            TLRPC.Document document = storyItem.music;
            c8 c8Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    c8Var = new c8();
                    c8Var.f10165f = true;
                    c8Var.f10166g = document;
                    if (TextUtils.isEmpty(str)) {
                        c8Var.f10169k = new SpannableStringBuilder(c8.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        c8Var.f10169k = new SpannableStringBuilder(c8.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(c8.d()).append((CharSequence) " ").append((CharSequence) str2);
                        c8Var.f10169k = append;
                        int length = append.length();
                        c8Var.f10169k.append((CharSequence) " ・ ");
                        c8Var.f10169k.setSpan(new CharacterStyle(), length, c8Var.f10169k.length(), 33);
                        c8Var.f10169k.append((CharSequence) str);
                    }
                }
            }
            this.f10364i = c8Var;
        }
        return this.f10364i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f10358a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            j4 j4Var = this.f10366k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                org.telegram.messenger.w7.G(j4Var.f10480m2);
                return org.telegram.messenger.w7.I(this.f10358a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f10358a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, Integer.MAX_VALUE, false, null, false);
                org.telegram.messenger.w7.G(j4Var.f10480m2);
                File K = org.telegram.messenger.w7.K(w10, null, true, true);
                if (!K.exists()) {
                    org.telegram.messenger.w7.G(j4Var.f10480m2);
                    return org.telegram.messenger.w7.K(w10, null, false, true);
                }
                return K;
            }
        }
        return null;
    }

    public final c8 i() {
        ArrayList arrayList;
        TLRPC.Chat M0;
        CharSequence n22;
        TLRPC.Chat M02;
        CharSequence n23;
        CharSequence n24;
        String str;
        if (this.f10365j == null) {
            TL_stories.StoryItem storyItem = this.f10358a;
            int i3 = 0;
            c8 c8Var = null;
            if (storyItem != null) {
                int i10 = this.f10366k.f10480m2;
                if (storyItem.fwd_from != null) {
                    c8Var = new c8();
                    c8Var.f10161a = i10;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long o10 = org.telegram.messenger.m5.o(peer);
                        c8Var.f10162b = Long.valueOf(o10);
                        if (o10 >= 0) {
                            c8Var.f10169k = new SpannableStringBuilder(zi.i6()).append((CharSequence) " ").append((CharSequence) l10.p(hp.s1(i10).a2(Long.valueOf(o10))));
                        } else {
                            TLRPC.Chat M03 = hp.s1(i10).M0(Long.valueOf(-o10));
                            if (org.telegram.messenger.t3.V(M03)) {
                                n24 = zi.F();
                            } else {
                                n24 = zi.n2();
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(n24).append((CharSequence) " ");
                            if (M03 != null) {
                                str = M03.title;
                            } else {
                                str = "";
                            }
                            c8Var.f10169k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        c8Var.f10169k = new SpannableStringBuilder(zi.i6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    c8Var.f10165f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        c8Var.f10163c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    c8Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i3 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i3) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i3);
                        }
                        i3++;
                    }
                    if (tL_mediaAreaChannelPost != null && (M02 = hp.s1(i10).M0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        c8Var = new c8();
                        c8Var.f10162b = Long.valueOf(-M02.f27001id);
                        c8Var.f10164e = true;
                        c8Var.f10161a = i10;
                        c8Var.f10165f = true;
                        c8Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (org.telegram.messenger.t3.V(M02)) {
                            n23 = zi.F();
                        } else {
                            n23 = zi.n2();
                        }
                        c8Var.f10169k = new SpannableStringBuilder(n23).append((CharSequence) " ").append((CharSequence) M02.title);
                    }
                }
                this.f10365j = c8Var;
            } else {
                y6 y6Var = this.f10359b;
                if (y6Var != null) {
                    gi.f7 f7Var = y6Var.f11236c;
                    if (f7Var != null) {
                        if (f7Var.f12730n) {
                            c8Var = new c8();
                            c8Var.f10169k = f7Var.f12734p;
                            String str2 = f7Var.f12740s;
                            c8Var.f10170l = str2;
                            c8Var.f10165f = TextUtils.isEmpty(str2);
                        } else if (f7Var.f12744u && (arrayList = f7Var.v) != null && arrayList.size() > 0) {
                            zi ziVar = (zi) f7Var.v.get(0);
                            long p10 = gi.f7.p(ziVar);
                            if (p10 < 0 && (M0 = hp.s1(ziVar.I1).M0(Long.valueOf(-p10))) != null) {
                                c8Var = new c8();
                                c8Var.f10162b = Long.valueOf(p10);
                                c8Var.f10164e = true;
                                c8Var.f10161a = ziVar.I1;
                                c8Var.f10165f = true;
                                Boolean D = gi.f7.D(ziVar);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i3 = ziVar.f26868k.fwd_from.channel_post;
                                    } else {
                                        i3 = ziVar.f1();
                                    }
                                }
                                c8Var.d = Integer.valueOf(i3);
                                if (org.telegram.messenger.t3.V(M0)) {
                                    n22 = zi.F();
                                } else {
                                    n22 = zi.n2();
                                }
                                c8Var.f10169k = new SpannableStringBuilder(n22).append((CharSequence) " ").append((CharSequence) M0.title);
                            }
                        }
                    }
                    this.f10365j = c8Var;
                }
            }
        }
        return this.f10365j;
    }

    public final boolean j() {
        y6 y6Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.f10361e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f10358a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        if (this.f10359b == null) {
            return true;
        }
        return !y6Var.f11236c.Y;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.f10358a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f27018id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        return this.f10361e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        y6 y6Var = this.f10359b;
        if (y6Var != null) {
            return y6Var.f11241s;
        }
        TL_stories.StoryItem storyItem = this.f10358a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f10358a.media.getDocument();
            if (!zi.L4(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f10358a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f10358a = storyItem;
        this.f10365j = null;
        this.f10364i = null;
        this.f10359b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.f10361e = m();
        TL_stories.StoryItem storyItem2 = this.f10358a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10362f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i3 = 0;
        this.f10363g = false;
        j4 j4Var = this.f10366k;
        q3 q3Var = j4Var.f10510u0;
        h4 h4Var = j4Var.f10527y1;
        y6 y6Var = h4Var.f10359b;
        if (y6Var != null) {
            CharSequence charSequence = y6Var.f11236c.C0;
            this.h = charSequence;
            CharSequence m10 = org.telegram.messenger.i6.m(charSequence, q3Var.f10375c0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m10;
            if (m10 == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(m10);
            }
            TLRPC.User a22 = hp.s1(j4Var.f10480m2).a2(Long.valueOf(j4Var.f10477l1));
            if (j4Var.f10477l1 < 0 || hp.s1(j4Var.f10480m2).Y4(a22)) {
                zi.d(valueOf, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = h4Var.f10358a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, f21.M0())) {
                this.f10363g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = h4Var.f10358a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence m11 = org.telegram.messenger.i6.m(str, q3Var.f10375c0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m11;
                if (m11 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(zi.C5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, q3Var.f10375c0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(org.telegram.messenger.i6.m(valueOf2, q3Var.f10375c0.getPaint().getFontMetricsInt(), false, null, 0));
                    TLRPC.User a23 = hp.s1(j4Var.f10480m2).a2(Long.valueOf(j4Var.f10477l1));
                    if (j4Var.f10477l1 < 0 || hp.s1(j4Var.f10480m2).Y4(a23)) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        zi.d(valueOf2, true);
                    }
                    zi.b(valueOf2, tL_textWithEntities.entities, false, true, true, false, i3 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = h4Var.f10358a.caption;
            this.h = str2;
            CharSequence m12 = org.telegram.messenger.i6.m(str2, q3Var.f10375c0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m12;
            if (m12 != null && h4Var.f10358a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(zi.C5(new SpannableStringBuilder(h4Var.f10358a.caption), h4Var.f10358a.entities, q3Var.f10375c0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(org.telegram.messenger.i6.m(valueOf3, q3Var.f10375c0.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.User a24 = hp.s1(j4Var.f10480m2).a2(Long.valueOf(j4Var.f10477l1));
                if (j4Var.f10477l1 < 0 || hp.s1(j4Var.f10480m2).Y4(a24)) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    zi.d(valueOf3, true);
                }
                zi.b(valueOf3, h4Var.f10358a.entities, false, true, true, false, i3 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
