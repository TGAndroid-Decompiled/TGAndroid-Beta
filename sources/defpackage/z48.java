package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class z48 {
    public TL_stories.StoryItem a = null;
    public g4b b = null;
    public TL_stories.StoryItem c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public CharSequence h;
    public g5b i;
    public g5b j;
    public final a58 k;

    public z48(a58 a58Var) {
        this.k = a58Var;
    }

    public final boolean a() {
        g4b g4bVar = this.b;
        if (g4bVar != null) {
            return g4bVar.c.H0;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            if (!storyItem.noforwards) {
                if (storyItem.pinned) {
                    TLRPC.Chat L0 = oc7.r1(this.k.s2).L0(Long.valueOf(-storyItem.dialogId));
                    if (L0 != null && L0.noforwards) {
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
        a58 a58Var = this.k;
        z48 z48Var = a58Var.E1;
        if (z48Var.a != null) {
            int i = (a58Var.r1 > 0L ? 1 : (a58Var.r1 == 0L ? 0 : -1));
            int i2 = a58Var.s2;
            if (i > 0) {
                TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(a58Var.r1));
                if (m9c.p(W1) != null) {
                    if (z48Var.f) {
                        return String.format(Locale.US, "https://t.me/%1$s/s/live", m9c.p(W1));
                    }
                    return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", m9c.p(W1), Integer.valueOf(z48Var.a.id));
                }
                return null;
            }
            TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-a58Var.r1));
            if (sd2.K(L0, false) == null) {
                return null;
            }
            if (z48Var.f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", sd2.K(L0, false));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", sd2.K(L0, false), Integer.valueOf(z48Var.a.id));
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
                return hg9.k(sb, this.a.media.photo.dc_id, "dc");
            } else if (messageMedia.document != null) {
                StringBuilder sb2 = new StringBuilder("doc#");
                sb2.append(this.a.media.document.id);
                sb2.append("at");
                return hg9.k(sb2, this.a.media.document.dc_id, "dc");
            } else {
                return "unknown";
            }
        } else if (this.b != null) {
            return "uploading from " + this.b.e;
        } else {
            return "unknown";
        }
    }

    public final g5b e() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        g5b g5bVar = this.i;
        if (g5bVar == null && (storyItem = this.a) != null) {
            TLRPC.Document document = storyItem.music;
            g5b g5bVar2 = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) gm.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    g5bVar2 = new g5b();
                    g5bVar2.f = true;
                    g5bVar2.g = document;
                    if (TextUtils.isEmpty(str)) {
                        g5bVar2.k = new SpannableStringBuilder(g5b.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        g5bVar2.k = new SpannableStringBuilder(g5b.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(g5b.d()).append((CharSequence) " ").append((CharSequence) str2);
                        g5bVar2.k = append;
                        int length = append.length();
                        g5bVar2.k.append((CharSequence) " ・ ");
                        g5bVar2.k.setSpan(new CharacterStyle(), length, g5bVar2.k.length(), 33);
                        g5bVar2.k.append((CharSequence) str);
                    }
                }
            }
            this.i = g5bVar2;
            return g5bVar2;
        }
        return g5bVar;
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
            a58 a58Var = this.k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                bc4.G(a58Var.s2);
                File I = bc4.I(h4b.B(a58Var.s2, this.a));
                if (I.exists()) {
                    return I;
                }
                TLRPC.Document document = this.a.media.document;
                if (document != null) {
                    File I2 = bc4.I(document);
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
                        File I3 = bc4.I(document3);
                        if (I3.exists()) {
                            return I3;
                        }
                    }
                }
                return bc4.I(this.a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w = bc4.w(photo.sizes, Integer.MAX_VALUE, false, null, false);
                bc4.G(a58Var.s2);
                File J = bc4.J(w, null, true, true);
                if (!J.exists()) {
                    bc4.G(a58Var.s2);
                    return bc4.J(w, null, false, true);
                }
                return J;
            }
        }
        return null;
    }

    public final g5b g() {
        ArrayList arrayList;
        TLRPC.Chat L0;
        CharSequence m2;
        TLRPC.Chat L02;
        CharSequence m22;
        CharSequence m23;
        String str;
        g5b g5bVar = this.j;
        if (g5bVar == null) {
            TL_stories.StoryItem storyItem = this.a;
            int i = 0;
            g5b g5bVar2 = null;
            if (storyItem != null) {
                int i2 = this.k.s2;
                if (storyItem.fwd_from != null) {
                    g5bVar2 = new g5b();
                    g5bVar2.a = i2;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long n = pg3.n(peer);
                        g5bVar2.b = Long.valueOf(n);
                        if (n >= 0) {
                            g5bVar2.k = new SpannableStringBuilder(k47.g6()).append((CharSequence) " ").append((CharSequence) m9c.r(oc7.r1(i2).W1(Long.valueOf(n))));
                        } else {
                            TLRPC.Chat L03 = oc7.r1(i2).L0(Long.valueOf(-n));
                            if (sd2.V(L03)) {
                                m23 = k47.F();
                            } else {
                                m23 = k47.m2();
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(m23).append((CharSequence) " ");
                            if (L03 != null) {
                                str = L03.title;
                            } else {
                                str = "";
                            }
                            g5bVar2.k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        g5bVar2.k = new SpannableStringBuilder(k47.g6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    g5bVar2.f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        g5bVar2.c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    g5bVar2.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i);
                        }
                        i++;
                    }
                    if (tL_mediaAreaChannelPost != null && (L02 = oc7.r1(i2).L0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        g5bVar2 = new g5b();
                        g5bVar2.b = Long.valueOf(-L02.id);
                        g5bVar2.e = true;
                        g5bVar2.a = i2;
                        g5bVar2.f = true;
                        g5bVar2.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (sd2.V(L02)) {
                            m22 = k47.F();
                        } else {
                            m22 = k47.m2();
                        }
                        g5bVar2.k = new SpannableStringBuilder(m22).append((CharSequence) " ").append((CharSequence) L02.title);
                    }
                }
                this.j = g5bVar2;
                return g5bVar2;
            }
            g4b g4bVar = this.b;
            if (g4bVar != null) {
                g6b g6bVar = g4bVar.c;
                if (g6bVar != null) {
                    if (g6bVar.n) {
                        g5bVar2 = new g5b();
                        g5bVar2.k = g6bVar.p;
                        String str2 = g6bVar.s;
                        g5bVar2.l = str2;
                        g5bVar2.f = TextUtils.isEmpty(str2);
                    } else if (g6bVar.u && (arrayList = g6bVar.v) != null && arrayList.size() > 0) {
                        k47 k47Var = (k47) g6bVar.v.get(0);
                        long p = g6b.p(k47Var);
                        if (p < 0 && (L0 = oc7.r1(k47Var.K1).L0(Long.valueOf(-p))) != null) {
                            g5bVar2 = new g5b();
                            g5bVar2.b = Long.valueOf(p);
                            g5bVar2.e = true;
                            g5bVar2.a = k47Var.K1;
                            g5bVar2.f = true;
                            Boolean C = g6b.C(k47Var);
                            if (C != null) {
                                if (C.booleanValue()) {
                                    i = k47Var.k.fwd_from.channel_post;
                                } else {
                                    i = k47Var.e1();
                                }
                            }
                            g5bVar2.d = Integer.valueOf(i);
                            if (sd2.V(L0)) {
                                m2 = k47.F();
                            } else {
                                m2 = k47.m2();
                            }
                            g5bVar2.k = new SpannableStringBuilder(m2).append((CharSequence) " ").append((CharSequence) L0.title);
                        }
                    }
                }
                this.j = g5bVar2;
                return g5bVar2;
            }
        }
        return g5bVar;
    }

    public final boolean h() {
        g4b g4bVar;
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
        return !g4bVar.c.Y;
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
        g4b g4bVar = this.b;
        if (g4bVar != null) {
            return g4bVar.s;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.a.media.getDocument();
            if (!k47.J4(document) && !"video/mp4".equals(document.mime_type)) {
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
        a58 a58Var = this.k;
        l48 l48Var = a58Var.A0;
        z48 z48Var = a58Var.E1;
        g4b g4bVar = z48Var.b;
        if (g4bVar != null) {
            CharSequence charSequence = g4bVar.c.C0;
            this.h = charSequence;
            CharSequence m = gw3.m(charSequence, l48Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m;
            if (m == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(m);
            }
            TLRPC.User W1 = oc7.r1(a58Var.s2).W1(Long.valueOf(a58Var.r1));
            if (a58Var.r1 < 0 || oc7.r1(a58Var.s2).g5(W1)) {
                k47.d(valueOf, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = z48Var.a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, s1c.G0())) {
                this.g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = z48Var.a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence m2 = gw3.m(str, l48Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m2;
                if (m2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(k47.A5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, l48Var.b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(gw3.m(valueOf2, l48Var.b0.getPaint().getFontMetricsInt(), false, null, 0));
                    TLRPC.User W12 = oc7.r1(a58Var.s2).W1(Long.valueOf(a58Var.r1));
                    if (a58Var.r1 < 0 || oc7.r1(a58Var.s2).g5(W12)) {
                        i = 1;
                    }
                    if (i != 0) {
                        k47.d(valueOf2, true);
                    }
                    k47.b(valueOf2, tL_textWithEntities.entities, false, true, true, false, i ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = z48Var.a.caption;
            this.h = str2;
            CharSequence m3 = gw3.m(str2, l48Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m3;
            if (m3 != null && z48Var.a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(k47.A5(new SpannableStringBuilder(z48Var.a.caption), z48Var.a.entities, l48Var.b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(gw3.m(valueOf3, l48Var.b0.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.User W13 = oc7.r1(a58Var.s2).W1(Long.valueOf(a58Var.r1));
                if (a58Var.r1 < 0 || oc7.r1(a58Var.s2).g5(W13)) {
                    i = 1;
                }
                if (i != 0) {
                    k47.d(valueOf3, true);
                }
                k47.b(valueOf3, z48Var.a.entities, false, true, true, false, i ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
