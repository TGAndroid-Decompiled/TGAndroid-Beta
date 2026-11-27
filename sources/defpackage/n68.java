package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class n68 {
    public TL_stories.StoryItem a = null;
    public b6b b = null;
    public TL_stories.StoryItem c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public CharSequence h;
    public b7b i;
    public b7b j;
    public final o68 k;

    public n68(o68 o68Var) {
        this.k = o68Var;
    }

    public final boolean a() {
        b6b b6bVar = this.b;
        if (b6bVar != null) {
            return b6bVar.c.H0;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            if (!storyItem.noforwards) {
                if (storyItem.pinned) {
                    TLRPC.Chat M0 = uc7.s1(this.k.m2).M0(Long.valueOf(-storyItem.dialogId));
                    if (M0 != null && M0.noforwards) {
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
        o68 o68Var = this.k;
        n68 n68Var = o68Var.y1;
        if (n68Var.a != null) {
            int i = (o68Var.l1 > 0L ? 1 : (o68Var.l1 == 0L ? 0 : -1));
            int i2 = o68Var.m2;
            if (i > 0) {
                TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(o68Var.l1));
                if (lbc.p(X1) != null) {
                    if (n68Var.f) {
                        return String.format(Locale.US, "https://t.me/%1$s/s/live", lbc.p(X1));
                    }
                    return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", lbc.p(X1), Integer.valueOf(n68Var.a.id));
                }
                return null;
            }
            TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-o68Var.l1));
            if (xc2.K(M0, false) == null) {
                return null;
            }
            if (n68Var.f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", xc2.K(M0, false));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", xc2.K(M0, false), Integer.valueOf(n68Var.a.id));
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
                return uh9.l(sb, this.a.media.photo.dc_id, "dc");
            } else if (messageMedia.document != null) {
                StringBuilder sb2 = new StringBuilder("doc#");
                sb2.append(this.a.media.document.id);
                sb2.append("at");
                return uh9.l(sb2, this.a.media.document.dc_id, "dc");
            } else {
                return "unknown";
            }
        } else if (this.b != null) {
            return "uploading from " + this.b.e;
        } else {
            return "unknown";
        }
    }

    public final b7b e() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        b7b b7bVar = this.i;
        if (b7bVar == null && (storyItem = this.a) != null) {
            TLRPC.Document document = storyItem.music;
            b7b b7bVar2 = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) hl.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    b7bVar2 = new b7b();
                    b7bVar2.f = true;
                    b7bVar2.g = document;
                    if (TextUtils.isEmpty(str)) {
                        b7bVar2.k = new SpannableStringBuilder(b7b.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        b7bVar2.k = new SpannableStringBuilder(b7b.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(b7b.d()).append((CharSequence) " ").append((CharSequence) str2);
                        b7bVar2.k = append;
                        int length = append.length();
                        b7bVar2.k.append((CharSequence) " ・ ");
                        b7bVar2.k.setSpan(new CharacterStyle(), length, b7bVar2.k.length(), 33);
                        b7bVar2.k.append((CharSequence) str);
                    }
                }
            }
            this.i = b7bVar2;
            return b7bVar2;
        }
        return b7bVar;
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
            o68 o68Var = this.k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                xb4.G(o68Var.m2);
                File I = xb4.I(c6b.B(o68Var.m2, this.a));
                if (I.exists()) {
                    return I;
                }
                TLRPC.Document document = this.a.media.document;
                if (document != null) {
                    File I2 = xb4.I(document);
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
                        File I3 = xb4.I(document3);
                        if (I3.exists()) {
                            return I3;
                        }
                    }
                }
                return xb4.I(this.a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w = xb4.w(photo.sizes, Integer.MAX_VALUE, false, null, false);
                xb4.G(o68Var.m2);
                File J = xb4.J(w, null, true, true);
                if (!J.exists()) {
                    xb4.G(o68Var.m2);
                    return xb4.J(w, null, false, true);
                }
                return J;
            }
        }
        return null;
    }

    public final b7b g() {
        ArrayList arrayList;
        TLRPC.Chat M0;
        CharSequence m2;
        TLRPC.Chat M02;
        CharSequence m22;
        CharSequence m23;
        String str;
        b7b b7bVar = this.j;
        if (b7bVar == null) {
            TL_stories.StoryItem storyItem = this.a;
            int i = 0;
            b7b b7bVar2 = null;
            if (storyItem != null) {
                int i2 = this.k.m2;
                if (storyItem.fwd_from != null) {
                    b7bVar2 = new b7b();
                    b7bVar2.a = i2;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long n = wf3.n(peer);
                        b7bVar2.b = Long.valueOf(n);
                        if (n >= 0) {
                            b7bVar2.k = new SpannableStringBuilder(r47.g6()).append((CharSequence) " ").append((CharSequence) lbc.r(uc7.s1(i2).X1(Long.valueOf(n))));
                        } else {
                            TLRPC.Chat M03 = uc7.s1(i2).M0(Long.valueOf(-n));
                            if (xc2.V(M03)) {
                                m23 = r47.F();
                            } else {
                                m23 = r47.m2();
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(m23).append((CharSequence) " ");
                            if (M03 != null) {
                                str = M03.title;
                            } else {
                                str = "";
                            }
                            b7bVar2.k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        b7bVar2.k = new SpannableStringBuilder(r47.g6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    b7bVar2.f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        b7bVar2.c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    b7bVar2.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i);
                        }
                        i++;
                    }
                    if (tL_mediaAreaChannelPost != null && (M02 = uc7.s1(i2).M0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        b7bVar2 = new b7b();
                        b7bVar2.b = Long.valueOf(-M02.id);
                        b7bVar2.e = true;
                        b7bVar2.a = i2;
                        b7bVar2.f = true;
                        b7bVar2.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (xc2.V(M02)) {
                            m22 = r47.F();
                        } else {
                            m22 = r47.m2();
                        }
                        b7bVar2.k = new SpannableStringBuilder(m22).append((CharSequence) " ").append((CharSequence) M02.title);
                    }
                }
                this.j = b7bVar2;
                return b7bVar2;
            }
            b6b b6bVar = this.b;
            if (b6bVar != null) {
                c8b c8bVar = b6bVar.c;
                if (c8bVar != null) {
                    if (c8bVar.n) {
                        b7bVar2 = new b7b();
                        b7bVar2.k = c8bVar.p;
                        String str2 = c8bVar.s;
                        b7bVar2.l = str2;
                        b7bVar2.f = TextUtils.isEmpty(str2);
                    } else if (c8bVar.u && (arrayList = c8bVar.v) != null && arrayList.size() > 0) {
                        r47 r47Var = (r47) c8bVar.v.get(0);
                        long p = c8b.p(r47Var);
                        if (p < 0 && (M0 = uc7.s1(r47Var.K1).M0(Long.valueOf(-p))) != null) {
                            b7bVar2 = new b7b();
                            b7bVar2.b = Long.valueOf(p);
                            b7bVar2.e = true;
                            b7bVar2.a = r47Var.K1;
                            b7bVar2.f = true;
                            Boolean C = c8b.C(r47Var);
                            if (C != null) {
                                if (C.booleanValue()) {
                                    i = r47Var.k.fwd_from.channel_post;
                                } else {
                                    i = r47Var.e1();
                                }
                            }
                            b7bVar2.d = Integer.valueOf(i);
                            if (xc2.V(M0)) {
                                m2 = r47.F();
                            } else {
                                m2 = r47.m2();
                            }
                            b7bVar2.k = new SpannableStringBuilder(m2).append((CharSequence) " ").append((CharSequence) M0.title);
                        }
                    }
                }
                this.j = b7bVar2;
                return b7bVar2;
            }
        }
        return b7bVar;
    }

    public final boolean h() {
        b6b b6bVar;
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
        return !b6bVar.c.Y;
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
        b6b b6bVar = this.b;
        if (b6bVar != null) {
            return b6bVar.s;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.a.media.getDocument();
            if (!r47.J4(document) && !"video/mp4".equals(document.mime_type)) {
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
        o68 o68Var = this.k;
        z58 z58Var = o68Var.u0;
        n68 n68Var = o68Var.y1;
        b6b b6bVar = n68Var.b;
        if (b6bVar != null) {
            CharSequence charSequence = b6bVar.c.C0;
            this.h = charSequence;
            CharSequence m = pv3.m(charSequence, z58Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m;
            if (m == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(m);
            }
            TLRPC.User X1 = uc7.s1(o68Var.m2).X1(Long.valueOf(o68Var.l1));
            if (o68Var.l1 < 0 || uc7.s1(o68Var.m2).m5(X1)) {
                r47.d(valueOf, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = n68Var.a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, r3c.H0())) {
                this.g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = n68Var.a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence m2 = pv3.m(str, z58Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m2;
                if (m2 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(r47.A5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, z58Var.b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(pv3.m(valueOf2, z58Var.b0.getPaint().getFontMetricsInt(), false, null, 0));
                    TLRPC.User X12 = uc7.s1(o68Var.m2).X1(Long.valueOf(o68Var.l1));
                    if (o68Var.l1 < 0 || uc7.s1(o68Var.m2).m5(X12)) {
                        i = 1;
                    }
                    if (i != 0) {
                        r47.d(valueOf2, true);
                    }
                    r47.b(valueOf2, tL_textWithEntities.entities, false, true, true, false, i ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = n68Var.a.caption;
            this.h = str2;
            CharSequence m3 = pv3.m(str2, z58Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m3;
            if (m3 != null && n68Var.a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(r47.A5(new SpannableStringBuilder(n68Var.a.caption), n68Var.a.entities, z58Var.b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(pv3.m(valueOf3, z58Var.b0.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.User X13 = uc7.s1(o68Var.m2).X1(Long.valueOf(o68Var.l1));
                if (o68Var.l1 < 0 || uc7.s1(o68Var.m2).m5(X13)) {
                    i = 1;
                }
                if (i != 0) {
                    r47.d(valueOf3, true);
                }
                r47.b(valueOf3, n68Var.a.entities, false, true, true, false, i ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
