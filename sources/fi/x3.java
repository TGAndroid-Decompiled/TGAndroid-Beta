package fi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.y21;
public final class x3 {
    public TL_stories.StoryItem f12723a = null;
    public o6 f12724b = null;
    public TL_stories.StoryItem f12725c;
    public boolean d;
    public boolean f12726e;
    public boolean f12727f;
    public boolean f12728g;
    public CharSequence h;
    public s7 f12729i;
    public s7 f12730j;
    public final z3 f12731k;

    public x3(z3 z3Var) {
        this.f12731k = z3Var;
    }

    public static String c(x3 x3Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = x3Var.f12723a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(x3Var.f12723a.media.photo.f28429id);
                sb2.append("at");
                return a8.p0.n(x3Var.f12723a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(x3Var.f12723a.media.document.f28411id);
                sb3.append("at");
                return a8.p0.n(x3Var.f12723a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (x3Var.f12724b != null) {
            return "uploading from " + x3Var.f12724b.f12334e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        o6 o6Var = this.f12724b;
        if (o6Var != null) {
            return o6Var.f12333c.H0;
        }
        TL_stories.StoryItem storyItem = this.f12723a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat O0 = mp.u1(this.f12731k.f12850m2).O0(Long.valueOf(-storyItem.dialogId));
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
        z3 z3Var = this.f12731k;
        if (z3Var.f12896y1.f12723a == null) {
            return null;
        }
        if (z3Var.l1 > 0) {
            TLRPC.User c22 = mp.u1(z3Var.f12850m2).c2(Long.valueOf(z3Var.l1));
            if (o10.o(c22) == null) {
                return null;
            }
            if (z3Var.f12896y1.f12727f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", o10.o(c22));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", o10.o(c22), Integer.valueOf(z3Var.f12896y1.f12723a.f28644id));
        }
        TLRPC.Chat O0 = mp.u1(z3Var.f12850m2).O0(Long.valueOf(-z3Var.l1));
        if (org.telegram.messenger.v3.K(O0, false) == null) {
            return null;
        }
        if (z3Var.f12896y1.f12727f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", org.telegram.messenger.v3.K(O0, false));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", org.telegram.messenger.v3.K(O0, false), Integer.valueOf(z3Var.f12896y1.f12723a.f28644id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f12723a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final s7 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f12729i == null && (storyItem = this.f12723a) != null) {
            TLRPC.Document document = storyItem.music;
            s7 s7Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    s7Var = new s7();
                    s7Var.f12538f = true;
                    s7Var.f12539g = document;
                    if (TextUtils.isEmpty(str)) {
                        s7Var.f12542k = new SpannableStringBuilder(s7.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        s7Var.f12542k = new SpannableStringBuilder(s7.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(s7.d()).append((CharSequence) " ").append((CharSequence) str2);
                        s7Var.f12542k = append;
                        int length = append.length();
                        s7Var.f12542k.append((CharSequence) " ・ ");
                        s7Var.f12542k.setSpan(new CharacterStyle(), length, s7Var.f12542k.length(), 33);
                        s7Var.f12542k.append((CharSequence) str);
                    }
                }
            }
            this.f12729i = s7Var;
        }
        return this.f12729i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f12723a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            int i7 = 0;
            z3 z3Var = this.f12731k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                org.telegram.messenger.w7.G(z3Var.f12850m2);
                File I = org.telegram.messenger.w7.I(p6.C(z3Var.f12850m2, this.f12723a));
                if (I.exists()) {
                    return I;
                }
                TLRPC.Document document = this.f12723a.media.document;
                if (document != null) {
                    File I2 = org.telegram.messenger.w7.I(document);
                    if (I2.exists()) {
                        return I2;
                    }
                }
                ArrayList<TLRPC.Document> arrayList = this.f12723a.media.alt_documents;
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
                return org.telegram.messenger.w7.I(this.f12723a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f12723a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, Integer.MAX_VALUE, false, null, false);
                org.telegram.messenger.w7.G(z3Var.f12850m2);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                if (!J.exists()) {
                    org.telegram.messenger.w7.G(z3Var.f12850m2);
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
        if (this.f12730j == null) {
            TL_stories.StoryItem storyItem = this.f12723a;
            int i7 = 0;
            s7 s7Var = null;
            if (storyItem != null) {
                int i10 = this.f12731k.f12850m2;
                if (storyItem.fwd_from != null) {
                    s7Var = new s7();
                    s7Var.f12534a = i10;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long o4 = org.telegram.messenger.n5.o(peer);
                        s7Var.f12535b = Long.valueOf(o4);
                        if (o4 >= 0) {
                            s7Var.f12542k = new SpannableStringBuilder(fj.h6()).append((CharSequence) " ").append((CharSequence) o10.q(mp.u1(i10).c2(Long.valueOf(o4))));
                        } else {
                            TLRPC.Chat O03 = mp.u1(i10).O0(Long.valueOf(-o4));
                            if (org.telegram.messenger.v3.V(O03)) {
                                m24 = fj.F();
                            } else {
                                m24 = fj.m2();
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(m24).append((CharSequence) " ");
                            if (O03 != null) {
                                str = O03.title;
                            } else {
                                str = "";
                            }
                            s7Var.f12542k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        s7Var.f12542k = new SpannableStringBuilder(fj.h6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    s7Var.f12538f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        s7Var.f12536c = Integer.valueOf(storyFwdHeader2.story_id);
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
                    if (tL_mediaAreaChannelPost != null && (O02 = mp.u1(i10).O0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        s7Var = new s7();
                        s7Var.f12535b = Long.valueOf(-O02.f28405id);
                        s7Var.f12537e = true;
                        s7Var.f12534a = i10;
                        s7Var.f12538f = true;
                        s7Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (org.telegram.messenger.v3.V(O02)) {
                            m23 = fj.F();
                        } else {
                            m23 = fj.m2();
                        }
                        s7Var.f12542k = new SpannableStringBuilder(m23).append((CharSequence) " ").append((CharSequence) O02.title);
                    }
                }
                this.f12730j = s7Var;
            } else {
                o6 o6Var = this.f12724b;
                if (o6Var != null) {
                    hi.d7 d7Var = o6Var.f12333c;
                    if (d7Var != null) {
                        if (d7Var.f14416n) {
                            s7Var = new s7();
                            s7Var.f12542k = d7Var.f14420p;
                            String str2 = d7Var.f14426s;
                            s7Var.f12543l = str2;
                            s7Var.f12538f = TextUtils.isEmpty(str2);
                        } else if (d7Var.f14430u && (arrayList = d7Var.v) != null && arrayList.size() > 0) {
                            fj fjVar = (fj) d7Var.v.get(0);
                            long p10 = hi.d7.p(fjVar);
                            if (p10 < 0 && (O0 = mp.u1(fjVar.K1).O0(Long.valueOf(-p10))) != null) {
                                s7Var = new s7();
                                s7Var.f12535b = Long.valueOf(p10);
                                s7Var.f12537e = true;
                                s7Var.f12534a = fjVar.K1;
                                s7Var.f12538f = true;
                                Boolean D = hi.d7.D(fjVar);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i7 = fjVar.f23968k.fwd_from.channel_post;
                                    } else {
                                        i7 = fjVar.e1();
                                    }
                                }
                                s7Var.d = Integer.valueOf(i7);
                                if (org.telegram.messenger.v3.V(O0)) {
                                    m22 = fj.F();
                                } else {
                                    m22 = fj.m2();
                                }
                                s7Var.f12542k = new SpannableStringBuilder(m22).append((CharSequence) " ").append((CharSequence) O0.title);
                            }
                        }
                    }
                    this.f12730j = s7Var;
                }
            }
        }
        return this.f12730j;
    }

    public final boolean j() {
        o6 o6Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.f12726e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f12723a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        if (this.f12724b == null) {
            return true;
        }
        return !o6Var.f12333c.Y;
    }

    public final boolean k(long j3) {
        TL_stories.StoryItem storyItem = this.f12723a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j3 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f28422id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        return this.f12726e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        o6 o6Var = this.f12724b;
        if (o6Var != null) {
            return o6Var.f12338s;
        }
        TL_stories.StoryItem storyItem = this.f12723a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f12723a.media.getDocument();
            if (!fj.K4(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f12723a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z10;
        TLRPC.MessageMedia messageMedia;
        this.f12723a = storyItem;
        this.f12730j = null;
        this.f12729i = null;
        this.f12724b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.f12726e = m();
        TL_stories.StoryItem storyItem2 = this.f12723a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12727f = z10;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i7 = 0;
        this.f12728g = false;
        z3 z3Var = this.f12731k;
        g3 g3Var = z3Var.f12879u0;
        x3 x3Var = z3Var.f12896y1;
        o6 o6Var = x3Var.f12724b;
        if (o6Var != null) {
            CharSequence charSequence = o6Var.f12333c.C0;
            this.h = charSequence;
            CharSequence m10 = org.telegram.messenger.j6.m(charSequence, g3Var.f12740c0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m10;
            if (m10 == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(m10);
            }
            TLRPC.User c22 = mp.u1(z3Var.f12850m2).c2(Long.valueOf(z3Var.l1));
            if (z3Var.l1 < 0 || mp.u1(z3Var.f12850m2).k5(c22)) {
                fj.d(valueOf, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = x3Var.f12723a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, y21.N0())) {
                this.f12728g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = x3Var.f12723a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence m11 = org.telegram.messenger.j6.m(str, g3Var.f12740c0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m11;
                if (m11 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(fj.B5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, g3Var.f12740c0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(org.telegram.messenger.j6.m(valueOf2, g3Var.f12740c0.getPaint().getFontMetricsInt(), false, null, 0));
                    TLRPC.User c23 = mp.u1(z3Var.f12850m2).c2(Long.valueOf(z3Var.l1));
                    if (z3Var.l1 < 0 || mp.u1(z3Var.f12850m2).k5(c23)) {
                        i7 = 1;
                    }
                    if (i7 != 0) {
                        fj.d(valueOf2, true);
                    }
                    fj.b(valueOf2, tL_textWithEntities.entities, false, true, true, false, i7 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = x3Var.f12723a.caption;
            this.h = str2;
            CharSequence m12 = org.telegram.messenger.j6.m(str2, g3Var.f12740c0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m12;
            if (m12 != null && x3Var.f12723a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(fj.B5(new SpannableStringBuilder(x3Var.f12723a.caption), x3Var.f12723a.entities, g3Var.f12740c0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(org.telegram.messenger.j6.m(valueOf3, g3Var.f12740c0.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.User c24 = mp.u1(z3Var.f12850m2).c2(Long.valueOf(z3Var.l1));
                if (z3Var.l1 < 0 || mp.u1(z3Var.f12850m2).k5(c24)) {
                    i7 = 1;
                }
                if (i7 != 0) {
                    fj.d(valueOf3, true);
                }
                fj.b(valueOf3, x3Var.f12723a.entities, false, true, true, false, i7 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
