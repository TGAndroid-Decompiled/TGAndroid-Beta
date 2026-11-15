package fi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p21;
public final class z3 {
    public TL_stories.StoryItem f12579a = null;
    public r6 f12580b = null;
    public TL_stories.StoryItem f12581c;
    public boolean d;
    public boolean f12582e;
    public boolean f12583f;
    public boolean f12584g;
    public CharSequence h;
    public v7 f12585i;
    public v7 f12586j;
    public final b4 f12587k;

    public z3(b4 b4Var) {
        this.f12587k = b4Var;
    }

    public static String c(z3 z3Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = z3Var.f12579a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(z3Var.f12579a.media.photo.f28075id);
                sb2.append("at");
                return a8.p0.n(z3Var.f12579a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(z3Var.f12579a.media.document.f28057id);
                sb3.append("at");
                return a8.p0.n(z3Var.f12579a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (z3Var.f12580b != null) {
            return "uploading from " + z3Var.f12580b.f12275e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        r6 r6Var = this.f12580b;
        if (r6Var != null) {
            return r6Var.f12274c.H0;
        }
        TL_stories.StoryItem storyItem = this.f12579a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat M0 = np.s1(this.f12587k.f11497m2).M0(Long.valueOf(-storyItem.dialogId));
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
        b4 b4Var = this.f12587k;
        if (b4Var.f11543y1.f12579a == null) {
            return null;
        }
        if (b4Var.l1 > 0) {
            TLRPC.User a22 = np.s1(b4Var.f11497m2).a2(Long.valueOf(b4Var.l1));
            if (q10.n(a22) == null) {
                return null;
            }
            if (b4Var.f11543y1.f12583f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", q10.n(a22));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", q10.n(a22), Integer.valueOf(b4Var.f11543y1.f12579a.f28290id));
        }
        TLRPC.Chat M0 = np.s1(b4Var.f11497m2).M0(Long.valueOf(-b4Var.l1));
        if (org.telegram.messenger.t3.K(M0, false) == null) {
            return null;
        }
        if (b4Var.f11543y1.f12583f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", org.telegram.messenger.t3.K(M0, false));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", org.telegram.messenger.t3.K(M0, false), Integer.valueOf(b4Var.f11543y1.f12579a.f28290id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f12579a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final v7 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f12585i == null && (storyItem = this.f12579a) != null) {
            TLRPC.Document document = storyItem.music;
            v7 v7Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    v7Var = new v7();
                    v7Var.f12432f = true;
                    v7Var.f12433g = document;
                    if (TextUtils.isEmpty(str)) {
                        v7Var.f12436k = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        v7Var.f12436k = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str2);
                        v7Var.f12436k = append;
                        int length = append.length();
                        v7Var.f12436k.append((CharSequence) " ・ ");
                        v7Var.f12436k.setSpan(new CharacterStyle(), length, v7Var.f12436k.length(), 33);
                        v7Var.f12436k.append((CharSequence) str);
                    }
                }
            }
            this.f12585i = v7Var;
        }
        return this.f12585i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f12579a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            int i7 = 0;
            b4 b4Var = this.f12587k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                org.telegram.messenger.w7.G(b4Var.f11497m2);
                File I = org.telegram.messenger.w7.I(s6.C(b4Var.f11497m2, this.f12579a));
                if (I.exists()) {
                    return I;
                }
                TLRPC.Document document = this.f12579a.media.document;
                if (document != null) {
                    File I2 = org.telegram.messenger.w7.I(document);
                    if (I2.exists()) {
                        return I2;
                    }
                }
                ArrayList<TLRPC.Document> arrayList = this.f12579a.media.alt_documents;
                int size = arrayList.size();
                while (i7 < size) {
                    TLRPC.Document document2 = arrayList.get(i7);
                    i7++;
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        File I3 = org.telegram.messenger.w7.I(document3);
                        if (I3.exists()) {
                            return I3;
                        }
                    }
                }
                return org.telegram.messenger.w7.I(this.f12579a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f12579a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, Integer.MAX_VALUE, false, null, false);
                org.telegram.messenger.w7.G(b4Var.f11497m2);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                if (!J.exists()) {
                    org.telegram.messenger.w7.G(b4Var.f11497m2);
                    return org.telegram.messenger.w7.J(w10, null, false, true);
                }
                return J;
            }
        }
        return null;
    }

    public final v7 i() {
        ArrayList arrayList;
        TLRPC.Chat M0;
        CharSequence m22;
        TLRPC.Chat M02;
        CharSequence m23;
        CharSequence m24;
        String str;
        if (this.f12586j == null) {
            TL_stories.StoryItem storyItem = this.f12579a;
            int i7 = 0;
            v7 v7Var = null;
            if (storyItem != null) {
                int i10 = this.f12587k.f11497m2;
                if (storyItem.fwd_from != null) {
                    v7Var = new v7();
                    v7Var.f12428a = i10;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long o4 = org.telegram.messenger.m5.o(peer);
                        v7Var.f12429b = Long.valueOf(o4);
                        if (o4 >= 0) {
                            v7Var.f12436k = new SpannableStringBuilder(gj.h6()).append((CharSequence) " ").append((CharSequence) q10.p(np.s1(i10).a2(Long.valueOf(o4))));
                        } else {
                            TLRPC.Chat M03 = np.s1(i10).M0(Long.valueOf(-o4));
                            if (org.telegram.messenger.t3.V(M03)) {
                                m24 = gj.F();
                            } else {
                                m24 = gj.m2();
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(m24).append((CharSequence) " ");
                            if (M03 != null) {
                                str = M03.title;
                            } else {
                                str = "";
                            }
                            v7Var.f12436k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        v7Var.f12436k = new SpannableStringBuilder(gj.h6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    v7Var.f12432f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        v7Var.f12430c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    v7Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i7 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i7);
                        }
                        i7++;
                    }
                    if (tL_mediaAreaChannelPost != null && (M02 = np.s1(i10).M0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        v7Var = new v7();
                        v7Var.f12429b = Long.valueOf(-M02.f28051id);
                        v7Var.f12431e = true;
                        v7Var.f12428a = i10;
                        v7Var.f12432f = true;
                        v7Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (org.telegram.messenger.t3.V(M02)) {
                            m23 = gj.F();
                        } else {
                            m23 = gj.m2();
                        }
                        v7Var.f12436k = new SpannableStringBuilder(m23).append((CharSequence) " ").append((CharSequence) M02.title);
                    }
                }
                this.f12586j = v7Var;
            } else {
                r6 r6Var = this.f12580b;
                if (r6Var != null) {
                    hi.d7 d7Var = r6Var.f12274c;
                    if (d7Var != null) {
                        if (d7Var.f14151n) {
                            v7Var = new v7();
                            v7Var.f12436k = d7Var.f14155p;
                            String str2 = d7Var.f14161s;
                            v7Var.f12437l = str2;
                            v7Var.f12432f = TextUtils.isEmpty(str2);
                        } else if (d7Var.f14165u && (arrayList = d7Var.v) != null && arrayList.size() > 0) {
                            gj gjVar = (gj) d7Var.v.get(0);
                            long p10 = hi.d7.p(gjVar);
                            if (p10 < 0 && (M0 = np.s1(gjVar.K1).M0(Long.valueOf(-p10))) != null) {
                                v7Var = new v7();
                                v7Var.f12429b = Long.valueOf(p10);
                                v7Var.f12431e = true;
                                v7Var.f12428a = gjVar.K1;
                                v7Var.f12432f = true;
                                Boolean D = hi.d7.D(gjVar);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i7 = gjVar.f23817k.fwd_from.channel_post;
                                    } else {
                                        i7 = gjVar.e1();
                                    }
                                }
                                v7Var.d = Integer.valueOf(i7);
                                if (org.telegram.messenger.t3.V(M0)) {
                                    m22 = gj.F();
                                } else {
                                    m22 = gj.m2();
                                }
                                v7Var.f12436k = new SpannableStringBuilder(m22).append((CharSequence) " ").append((CharSequence) M0.title);
                            }
                        }
                    }
                    this.f12586j = v7Var;
                }
            }
        }
        return this.f12586j;
    }

    public final boolean j() {
        r6 r6Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.f12582e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f12579a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        if (this.f12580b == null) {
            return true;
        }
        return !r6Var.f12274c.Y;
    }

    public final boolean k(long j3) {
        TL_stories.StoryItem storyItem = this.f12579a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j3 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f28068id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        return this.f12582e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        r6 r6Var = this.f12580b;
        if (r6Var != null) {
            return r6Var.f12279s;
        }
        TL_stories.StoryItem storyItem = this.f12579a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f12579a.media.getDocument();
            if (!gj.K4(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f12579a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f12579a = storyItem;
        this.f12586j = null;
        this.f12585i = null;
        this.f12580b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.f12582e = m();
        TL_stories.StoryItem storyItem2 = this.f12579a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12583f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i7 = 0;
        this.f12584g = false;
        b4 b4Var = this.f12587k;
        i3 i3Var = b4Var.f11526u0;
        z3 z3Var = b4Var.f11543y1;
        r6 r6Var = z3Var.f12580b;
        if (r6Var != null) {
            CharSequence charSequence = r6Var.f12274c.C0;
            this.h = charSequence;
            CharSequence m10 = org.telegram.messenger.j6.m(charSequence, i3Var.f11420c0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m10;
            if (m10 == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(m10);
            }
            TLRPC.User a22 = np.s1(b4Var.f11497m2).a2(Long.valueOf(b4Var.l1));
            if (b4Var.l1 < 0 || np.s1(b4Var.f11497m2).Z4(a22)) {
                gj.d(valueOf, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = z3Var.f12579a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, p21.M0())) {
                this.f12584g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = z3Var.f12579a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence m11 = org.telegram.messenger.j6.m(str, i3Var.f11420c0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m11;
                if (m11 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(gj.B5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, i3Var.f11420c0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(org.telegram.messenger.j6.m(valueOf2, i3Var.f11420c0.getPaint().getFontMetricsInt(), false, null, 0));
                    TLRPC.User a23 = np.s1(b4Var.f11497m2).a2(Long.valueOf(b4Var.l1));
                    if (b4Var.l1 < 0 || np.s1(b4Var.f11497m2).Z4(a23)) {
                        i7 = 1;
                    }
                    if (i7 != 0) {
                        gj.d(valueOf2, true);
                    }
                    gj.b(valueOf2, tL_textWithEntities.entities, false, true, true, false, i7 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = z3Var.f12579a.caption;
            this.h = str2;
            CharSequence m12 = org.telegram.messenger.j6.m(str2, i3Var.f11420c0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m12;
            if (m12 != null && z3Var.f12579a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(gj.B5(new SpannableStringBuilder(z3Var.f12579a.caption), z3Var.f12579a.entities, i3Var.f11420c0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(org.telegram.messenger.j6.m(valueOf3, i3Var.f11420c0.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.User a24 = np.s1(b4Var.f11497m2).a2(Long.valueOf(b4Var.l1));
                if (b4Var.l1 < 0 || np.s1(b4Var.f11497m2).Z4(a24)) {
                    i7 = 1;
                }
                if (i7 != 0) {
                    gj.d(valueOf3, true);
                }
                gj.b(valueOf3, z3Var.f12579a.entities, false, true, true, false, i7 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
