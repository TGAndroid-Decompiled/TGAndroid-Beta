package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class x28 {
    public TL_stories.StoryItem a = null;
    public f2b b = null;
    public TL_stories.StoryItem c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public CharSequence h;
    public f3b i;
    public f3b j;
    public final y28 k;

    public x28(y28 y28Var) {
        this.k = y28Var;
    }

    public final boolean a() {
        f2b f2bVar = this.b;
        if (f2bVar != null) {
            return f2bVar.c.H0;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            if (!storyItem.noforwards) {
                if (storyItem.pinned) {
                    TLRPC.Chat K0 = na7.q1(this.k.s2).K0(Long.valueOf(-storyItem.dialogId));
                    if (K0 != null && K0.noforwards) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final String b() {
        y28 y28Var = this.k;
        x28 x28Var = y28Var.E1;
        if (x28Var.a != null) {
            int i = (y28Var.r1 > 0L ? 1 : (y28Var.r1 == 0L ? 0 : -1));
            int i2 = y28Var.s2;
            if (i > 0) {
                TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(y28Var.r1));
                if (l7c.p(V1) != null) {
                    if (x28Var.f) {
                        return String.format(Locale.US, "https://t.me/%1$s/s/live", l7c.p(V1));
                    }
                    return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", l7c.p(V1), Integer.valueOf(x28Var.a.id));
                }
                return null;
            }
            TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-y28Var.r1));
            if (hc2.K(K0, false) == null) {
                return null;
            }
            if (x28Var.f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", hc2.K(K0, false));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", hc2.K(K0, false), Integer.valueOf(x28Var.a.id));
        }
        return null;
    }

    public final String c() {
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final String d() {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb = new StringBuilder("photo#");
                sb.append(this.a.media.photo.id);
                sb.append("at");
                return de9.l(sb, this.a.media.photo.dc_id, "dc");
            } else if (messageMedia.document != null) {
                StringBuilder sb2 = new StringBuilder("doc#");
                sb2.append(this.a.media.document.id);
                sb2.append("at");
                return de9.l(sb2, this.a.media.document.dc_id, "dc");
            } else {
                return "unknown";
            }
        } else if (this.b != null) {
            return "uploading from " + this.b.e;
        } else {
            return "unknown";
        }
    }

    public final f3b e() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        f3b f3bVar = this.i;
        if (f3bVar == null && (storyItem = this.a) != null) {
            TLRPC.Document document = storyItem.music;
            f3b f3bVar2 = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) gl.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    f3bVar2 = new f3b();
                    f3bVar2.f = true;
                    f3bVar2.g = document;
                    if (TextUtils.isEmpty(str)) {
                        f3bVar2.k = new SpannableStringBuilder(f3b.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        f3bVar2.k = new SpannableStringBuilder(f3b.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(f3b.d()).append((CharSequence) " ").append((CharSequence) str2);
                        f3bVar2.k = append;
                        int length = append.length();
                        f3bVar2.k.append((CharSequence) " ・ ");
                        f3bVar2.k.setSpan(new CharacterStyle(), length, f3bVar2.k.length(), 33);
                        f3bVar2.k.append((CharSequence) str);
                    }
                }
            }
            this.i = f3bVar2;
            return f3bVar2;
        }
        return f3bVar;
    }

    public final File f() {
        TLRPC.Photo photo;
        if (c() != null) {
            return new File(c());
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            int i = 0;
            y28 y28Var = this.k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                ba4.G(y28Var.s2);
                File I = ba4.I(g2b.B(y28Var.s2, this.a));
                if (I.exists()) {
                    return I;
                }
                TLRPC.Document document = this.a.media.document;
                if (document != null) {
                    File I2 = ba4.I(document);
                    if (I2.exists()) {
                        return I2;
                    }
                }
                ArrayList<TLRPC.Document> arrayList = this.a.media.alt_documents;
                int size = arrayList.size();
                while (i < size) {
                    TLRPC.Document document2 = arrayList.get(i);
                    i++;
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        File I3 = ba4.I(document3);
                        if (I3.exists()) {
                            return I3;
                        }
                    }
                }
                return ba4.I(this.a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w = ba4.w(photo.sizes, Integer.MAX_VALUE, false, null, false);
                ba4.G(y28Var.s2);
                File J = ba4.J(w, null, true, true);
                if (!J.exists()) {
                    ba4.G(y28Var.s2);
                    return ba4.J(w, null, false, true);
                }
                return J;
            }
        }
        return null;
    }

    public final f3b g() {
        ArrayList arrayList;
        TLRPC.Chat K0;
        CharSequence m2;
        TLRPC.Chat K02;
        CharSequence m22;
        CharSequence m23;
        String str;
        f3b f3bVar = this.j;
        if (f3bVar == null) {
            TL_stories.StoryItem storyItem = this.a;
            int i = 0;
            f3b f3bVar2 = null;
            if (storyItem != null) {
                int i2 = this.k.s2;
                if (storyItem.fwd_from != null) {
                    f3bVar2 = new f3b();
                    f3bVar2.a = i2;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long n = cf3.n(peer);
                        f3bVar2.b = Long.valueOf(n);
                        if (n >= 0) {
                            f3bVar2.k = new SpannableStringBuilder(k27.g6()).append((CharSequence) " ").append((CharSequence) l7c.r(na7.q1(i2).V1(Long.valueOf(n))));
                        } else {
                            TLRPC.Chat K03 = na7.q1(i2).K0(Long.valueOf(-n));
                            if (hc2.V(K03)) {
                                m23 = k27.F();
                            } else {
                                m23 = k27.m2();
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(m23).append((CharSequence) " ");
                            if (K03 != null) {
                                str = K03.title;
                            } else {
                                str = "";
                            }
                            f3bVar2.k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        f3bVar2.k = new SpannableStringBuilder(k27.g6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    f3bVar2.f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        f3bVar2.c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    f3bVar2.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i);
                        }
                        i++;
                    }
                    if (tL_mediaAreaChannelPost != null && (K02 = na7.q1(i2).K0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        f3bVar2 = new f3b();
                        f3bVar2.b = Long.valueOf(-K02.id);
                        f3bVar2.e = true;
                        f3bVar2.a = i2;
                        f3bVar2.f = true;
                        f3bVar2.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (hc2.V(K02)) {
                            m22 = k27.F();
                        } else {
                            m22 = k27.m2();
                        }
                        f3bVar2.k = new SpannableStringBuilder(m22).append((CharSequence) " ").append((CharSequence) K02.title);
                    }
                }
                this.j = f3bVar2;
                return f3bVar2;
            }
            f2b f2bVar = this.b;
            if (f2bVar != null) {
                f4b f4bVar = f2bVar.c;
                if (f4bVar != null) {
                    if (f4bVar.n) {
                        f3bVar2 = new f3b();
                        f3bVar2.k = f4bVar.p;
                        String str2 = f4bVar.s;
                        f3bVar2.l = str2;
                        f3bVar2.f = TextUtils.isEmpty(str2);
                    } else if (f4bVar.u && (arrayList = f4bVar.v) != null && arrayList.size() > 0) {
                        k27 k27Var = (k27) f4bVar.v.get(0);
                        long p = f4b.p(k27Var);
                        if (p < 0 && (K0 = na7.q1(k27Var.K1).K0(Long.valueOf(-p))) != null) {
                            f3bVar2 = new f3b();
                            f3bVar2.b = Long.valueOf(p);
                            f3bVar2.e = true;
                            f3bVar2.a = k27Var.K1;
                            f3bVar2.f = true;
                            Boolean C = f4b.C(k27Var);
                            if (C != null) {
                                if (C.booleanValue()) {
                                    i = k27Var.k.fwd_from.channel_post;
                                } else {
                                    i = k27Var.e1();
                                }
                            }
                            f3bVar2.d = Integer.valueOf(i);
                            if (hc2.V(K0)) {
                                m2 = k27.F();
                            } else {
                                m2 = k27.m2();
                            }
                            f3bVar2.k = new SpannableStringBuilder(m2).append((CharSequence) " ").append((CharSequence) K0.title);
                        }
                    }
                }
                this.j = f3bVar2;
                return f3bVar2;
            }
        }
        return f3bVar;
    }

    public final boolean h() {
        f2b f2bVar;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        if (this.b == null) {
            return true;
        }
        return !f2bVar.c.Y;
    }

    public final boolean i(long j) {
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        String str;
        TLRPC.MessageMedia messageMedia;
        f2b f2bVar = this.b;
        if (f2bVar != null) {
            return f2bVar.s;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.a.media.getDocument();
            if (!k27.J4(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void k(TL_stories.StoryItem storyItem) {
        boolean z;
        TLRPC.MessageMedia messageMedia;
        this.a = storyItem;
        this.j = null;
        this.i = null;
        this.b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.e = j();
        TL_stories.StoryItem storyItem2 = this.a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
    }

    public final void l() {
        SpannableStringBuilder valueOf;
        int i = 0;
        this.g = false;
        y28 y28Var = this.k;
        i28 i28Var = y28Var.A0;
        x28 x28Var = y28Var.E1;
        f2b f2bVar = x28Var.b;
        if (f2bVar != null) {
            CharSequence charSequence = f2bVar.c.C0;
            this.h = charSequence;
            CharSequence m = vu3.m(charSequence, i28Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m;
            if (m == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(m);
            }
            TLRPC.User V1 = na7.q1(y28Var.s2).V1(Long.valueOf(y28Var.r1));
            if (y28Var.r1 < 0 || na7.q1(y28Var.s2).e5(V1)) {
                k27.d(valueOf, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = x28Var.a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, rzb.G0())) {
                this.g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = x28Var.a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence m2 = vu3.m(str, i28Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m2;
                if (m2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(k27.A5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, i28Var.b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(vu3.m(valueOf2, i28Var.b0.getPaint().getFontMetricsInt(), false, null, 0));
                    TLRPC.User V12 = na7.q1(y28Var.s2).V1(Long.valueOf(y28Var.r1));
                    if (y28Var.r1 < 0 || na7.q1(y28Var.s2).e5(V12)) {
                        i = 1;
                    }
                    if (i != 0) {
                        k27.d(valueOf2, true);
                    }
                    k27.b(valueOf2, tL_textWithEntities.entities, false, true, true, false, i ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = x28Var.a.caption;
            this.h = str2;
            CharSequence m3 = vu3.m(str2, i28Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m3;
            if (m3 != null && x28Var.a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(k27.A5(new SpannableStringBuilder(x28Var.a.caption), x28Var.a.entities, i28Var.b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(vu3.m(valueOf3, i28Var.b0.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.User V13 = na7.q1(y28Var.s2).V1(Long.valueOf(y28Var.r1));
                if (y28Var.r1 < 0 || na7.q1(y28Var.s2).e5(V13)) {
                    i = 1;
                }
                if (i != 0) {
                    k27.d(valueOf3, true);
                }
                k27.b(valueOf3, x28Var.a.entities, false, true, true, false, i ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
