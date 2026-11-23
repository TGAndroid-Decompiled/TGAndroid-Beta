package fi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b31;
public final class x3 {
    public TL_stories.StoryItem f12715a = null;
    public o6 f12716b = null;
    public TL_stories.StoryItem f12717c;
    public boolean d;
    public boolean f12718e;
    public boolean f12719f;
    public boolean f12720g;
    public CharSequence h;
    public s7 f12721i;
    public s7 f12722j;
    public final z3 f12723k;

    public x3(z3 z3Var) {
        this.f12723k = z3Var;
    }

    public static String c(x3 x3Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = x3Var.f12715a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(x3Var.f12715a.media.photo.f28422id);
                sb2.append("at");
                return a8.p0.n(x3Var.f12715a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(x3Var.f12715a.media.document.f28404id);
                sb3.append("at");
                return a8.p0.n(x3Var.f12715a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (x3Var.f12716b != null) {
            return "uploading from " + x3Var.f12716b.f12326e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        o6 o6Var = this.f12716b;
        if (o6Var != null) {
            return o6Var.f12325c.H0;
        }
        TL_stories.StoryItem storyItem = this.f12715a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat O0 = np.u1(this.f12723k.f12842m2).O0(Long.valueOf(-storyItem.dialogId));
                if (O0 != null && O0.noforwards) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final String e() {
        z3 z3Var = this.f12723k;
        if (z3Var.f12888y1.f12715a == null) {
            return null;
        }
        if (z3Var.l1 > 0) {
            TLRPC.User c22 = np.u1(z3Var.f12842m2).c2(Long.valueOf(z3Var.l1));
            if (p10.o(c22) == null) {
                return null;
            }
            if (z3Var.f12888y1.f12719f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", p10.o(c22));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", p10.o(c22), Integer.valueOf(z3Var.f12888y1.f12715a.f28637id));
        }
        TLRPC.Chat O0 = np.u1(z3Var.f12842m2).O0(Long.valueOf(-z3Var.l1));
        if (org.telegram.messenger.v3.K(O0, false) == null) {
            return null;
        }
        if (z3Var.f12888y1.f12719f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", org.telegram.messenger.v3.K(O0, false));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", org.telegram.messenger.v3.K(O0, false), Integer.valueOf(z3Var.f12888y1.f12715a.f28637id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f12715a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final s7 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f12721i == null && (storyItem = this.f12715a) != null) {
            TLRPC.Document document = storyItem.music;
            s7 s7Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    s7Var = new s7();
                    s7Var.f12530f = true;
                    s7Var.f12531g = document;
                    if (TextUtils.isEmpty(str)) {
                        s7Var.f12534k = new SpannableStringBuilder(s7.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        s7Var.f12534k = new SpannableStringBuilder(s7.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(s7.d()).append((CharSequence) " ").append((CharSequence) str2);
                        s7Var.f12534k = append;
                        int length = append.length();
                        s7Var.f12534k.append((CharSequence) " ・ ");
                        s7Var.f12534k.setSpan(new CharacterStyle(), length, s7Var.f12534k.length(), 33);
                        s7Var.f12534k.append((CharSequence) str);
                    }
                }
            }
            this.f12721i = s7Var;
        }
        return this.f12721i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f12715a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            int i7 = 0;
            z3 z3Var = this.f12723k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                org.telegram.messenger.w7.G(z3Var.f12842m2);
                File I = org.telegram.messenger.w7.I(p6.C(z3Var.f12842m2, this.f12715a));
                if (I.exists()) {
                    return I;
                }
                TLRPC.Document document = this.f12715a.media.document;
                if (document != null) {
                    File I2 = org.telegram.messenger.w7.I(document);
                    if (I2.exists()) {
                        return I2;
                    }
                }
                ArrayList<TLRPC.Document> arrayList = this.f12715a.media.alt_documents;
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
                return org.telegram.messenger.w7.I(this.f12715a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f12715a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, Integer.MAX_VALUE, false, null, false);
                org.telegram.messenger.w7.G(z3Var.f12842m2);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                if (!J.exists()) {
                    org.telegram.messenger.w7.G(z3Var.f12842m2);
                    return org.telegram.messenger.w7.J(w10, null, false, true);
                }
                return J;
            }
        }
        return null;
    }

    public final s7 i() {
        ArrayList arrayList;
        TLRPC.Chat O0;
        CharSequence m22;
        TLRPC.Chat O02;
        CharSequence m23;
        CharSequence m24;
        String str;
        if (this.f12722j == null) {
            TL_stories.StoryItem storyItem = this.f12715a;
            int i7 = 0;
            s7 s7Var = null;
            if (storyItem != null) {
                int i10 = this.f12723k.f12842m2;
                if (storyItem.fwd_from != null) {
                    s7Var = new s7();
                    s7Var.f12526a = i10;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long o4 = org.telegram.messenger.n5.o(peer);
                        s7Var.f12527b = Long.valueOf(o4);
                        if (o4 >= 0) {
                            s7Var.f12534k = new SpannableStringBuilder(gj.h6()).append((CharSequence) " ").append((CharSequence) p10.q(np.u1(i10).c2(Long.valueOf(o4))));
                        } else {
                            TLRPC.Chat O03 = np.u1(i10).O0(Long.valueOf(-o4));
                            if (org.telegram.messenger.v3.V(O03)) {
                                m24 = gj.F();
                            } else {
                                m24 = gj.m2();
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(m24).append((CharSequence) " ");
                            if (O03 != null) {
                                str = O03.title;
                            } else {
                                str = "";
                            }
                            s7Var.f12534k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        s7Var.f12534k = new SpannableStringBuilder(gj.h6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    s7Var.f12530f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        s7Var.f12528c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    s7Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i7 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i7);
                        }
                        i7++;
                    }
                    if (tL_mediaAreaChannelPost != null && (O02 = np.u1(i10).O0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        s7Var = new s7();
                        s7Var.f12527b = Long.valueOf(-O02.f28398id);
                        s7Var.f12529e = true;
                        s7Var.f12526a = i10;
                        s7Var.f12530f = true;
                        s7Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (org.telegram.messenger.v3.V(O02)) {
                            m23 = gj.F();
                        } else {
                            m23 = gj.m2();
                        }
                        s7Var.f12534k = new SpannableStringBuilder(m23).append((CharSequence) " ").append((CharSequence) O02.title);
                    }
                }
                this.f12722j = s7Var;
            } else {
                o6 o6Var = this.f12716b;
                if (o6Var != null) {
                    hi.d7 d7Var = o6Var.f12325c;
                    if (d7Var != null) {
                        if (d7Var.f14390n) {
                            s7Var = new s7();
                            s7Var.f12534k = d7Var.f14394p;
                            String str2 = d7Var.f14400s;
                            s7Var.f12535l = str2;
                            s7Var.f12530f = TextUtils.isEmpty(str2);
                        } else if (d7Var.f14404u && (arrayList = d7Var.v) != null && arrayList.size() > 0) {
                            gj gjVar = (gj) d7Var.v.get(0);
                            long p10 = hi.d7.p(gjVar);
                            if (p10 < 0 && (O0 = np.u1(gjVar.K1).O0(Long.valueOf(-p10))) != null) {
                                s7Var = new s7();
                                s7Var.f12527b = Long.valueOf(p10);
                                s7Var.f12529e = true;
                                s7Var.f12526a = gjVar.K1;
                                s7Var.f12530f = true;
                                Boolean D = hi.d7.D(gjVar);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i7 = gjVar.f24177k.fwd_from.channel_post;
                                    } else {
                                        i7 = gjVar.e1();
                                    }
                                }
                                s7Var.d = Integer.valueOf(i7);
                                if (org.telegram.messenger.v3.V(O0)) {
                                    m22 = gj.F();
                                } else {
                                    m22 = gj.m2();
                                }
                                s7Var.f12534k = new SpannableStringBuilder(m22).append((CharSequence) " ").append((CharSequence) O0.title);
                            }
                        }
                    }
                    this.f12722j = s7Var;
                }
            }
        }
        return this.f12722j;
    }

    public final boolean j() {
        o6 o6Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.f12718e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f12715a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        if (this.f12716b == null) {
            return true;
        }
        return !o6Var.f12325c.Y;
    }

    public final boolean k(long j3) {
        TL_stories.StoryItem storyItem = this.f12715a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j3 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f28415id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        return this.f12718e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        o6 o6Var = this.f12716b;
        if (o6Var != null) {
            return o6Var.f12330s;
        }
        TL_stories.StoryItem storyItem = this.f12715a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f12715a.media.getDocument();
            if (!gj.K4(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f12715a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f12715a = storyItem;
        this.f12722j = null;
        this.f12721i = null;
        this.f12716b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.f12718e = m();
        TL_stories.StoryItem storyItem2 = this.f12715a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12719f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i7 = 0;
        this.f12720g = false;
        z3 z3Var = this.f12723k;
        g3 g3Var = z3Var.f12871u0;
        x3 x3Var = z3Var.f12888y1;
        o6 o6Var = x3Var.f12716b;
        if (o6Var != null) {
            CharSequence charSequence = o6Var.f12325c.C0;
            this.h = charSequence;
            CharSequence m10 = org.telegram.messenger.j6.m(charSequence, g3Var.f12732c0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m10;
            if (m10 == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(m10);
            }
            TLRPC.User c22 = np.u1(z3Var.f12842m2).c2(Long.valueOf(z3Var.l1));
            if (z3Var.l1 < 0 || np.u1(z3Var.f12842m2).k5(c22)) {
                gj.d(valueOf, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = x3Var.f12715a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, b31.N0())) {
                this.f12720g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = x3Var.f12715a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence m11 = org.telegram.messenger.j6.m(str, g3Var.f12732c0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m11;
                if (m11 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(gj.B5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, g3Var.f12732c0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(org.telegram.messenger.j6.m(valueOf2, g3Var.f12732c0.getPaint().getFontMetricsInt(), false, null, 0));
                    TLRPC.User c23 = np.u1(z3Var.f12842m2).c2(Long.valueOf(z3Var.l1));
                    if (z3Var.l1 < 0 || np.u1(z3Var.f12842m2).k5(c23)) {
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
            String str2 = x3Var.f12715a.caption;
            this.h = str2;
            CharSequence m12 = org.telegram.messenger.j6.m(str2, g3Var.f12732c0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m12;
            if (m12 != null && x3Var.f12715a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(gj.B5(new SpannableStringBuilder(x3Var.f12715a.caption), x3Var.f12715a.entities, g3Var.f12732c0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(org.telegram.messenger.j6.m(valueOf3, g3Var.f12732c0.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.User c24 = np.u1(z3Var.f12842m2).c2(Long.valueOf(z3Var.l1));
                if (z3Var.l1 < 0 || np.u1(z3Var.f12842m2).k5(c24)) {
                    i7 = 1;
                }
                if (i7 != 0) {
                    gj.d(valueOf3, true);
                }
                gj.b(valueOf3, x3Var.f12715a.entities, false, true, true, false, i7 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
