package di;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.l21;
public final class h4 {
    public TL_stories.StoryItem f9064a = null;
    public y6 f9065b = null;
    public TL_stories.StoryItem f9066c;
    public boolean d;
    public boolean f9067e;
    public boolean f9068f;
    public boolean f9069g;
    public CharSequence h;
    public c8 f9070i;
    public c8 f9071j;
    public final j4 f9072k;

    public h4(j4 j4Var) {
        this.f9072k = j4Var;
    }

    public static String c(h4 h4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = h4Var.f9064a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(h4Var.f9064a.media.photo.f26980id);
                sb2.append("at");
                return a8.p0.n(h4Var.f9064a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(h4Var.f9064a.media.document.f26962id);
                sb3.append("at");
                return a8.p0.n(h4Var.f9064a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (h4Var.f9065b != null) {
            return "uploading from " + h4Var.f9065b.f9961e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        y6 y6Var = this.f9065b;
        if (y6Var != null) {
            return y6Var.f9960c.H0;
        }
        TL_stories.StoryItem storyItem = this.f9064a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat M0 = qp.s1(this.f9072k.f9200l2).M0(Long.valueOf(-storyItem.dialogId));
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
        j4 j4Var = this.f9072k;
        if (j4Var.f9245x1.f9064a == null) {
            return null;
        }
        if (j4Var.f9196k1 > 0) {
            TLRPC.User a22 = qp.s1(j4Var.f9200l2).a2(Long.valueOf(j4Var.f9196k1));
            if (t10.n(a22) == null) {
                return null;
            }
            if (j4Var.f9245x1.f9068f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", t10.n(a22));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", t10.n(a22), Integer.valueOf(j4Var.f9245x1.f9064a.f27195id));
        }
        TLRPC.Chat M0 = qp.s1(j4Var.f9200l2).M0(Long.valueOf(-j4Var.f9196k1));
        if (org.telegram.messenger.t3.K(M0, false) == null) {
            return null;
        }
        if (j4Var.f9245x1.f9068f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", org.telegram.messenger.t3.K(M0, false));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", org.telegram.messenger.t3.K(M0, false), Integer.valueOf(j4Var.f9245x1.f9064a.f27195id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f9064a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final c8 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f9070i == null && (storyItem = this.f9064a) != null) {
            TLRPC.Document document = storyItem.music;
            c8 c8Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    c8Var = new c8();
                    c8Var.f8887f = true;
                    c8Var.f8888g = document;
                    if (TextUtils.isEmpty(str)) {
                        c8Var.f8891k = new SpannableStringBuilder(c8.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        c8Var.f8891k = new SpannableStringBuilder(c8.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(c8.d()).append((CharSequence) " ").append((CharSequence) str2);
                        c8Var.f8891k = append;
                        int length = append.length();
                        c8Var.f8891k.append((CharSequence) " ・ ");
                        c8Var.f8891k.setSpan(new CharacterStyle(), length, c8Var.f8891k.length(), 33);
                        c8Var.f8891k.append((CharSequence) str);
                    }
                }
            }
            this.f9070i = c8Var;
        }
        return this.f9070i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f9064a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            j4 j4Var = this.f9072k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                org.telegram.messenger.w7.G(j4Var.f9200l2);
                return org.telegram.messenger.w7.I(this.f9064a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f9064a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, Integer.MAX_VALUE, false, null, false);
                org.telegram.messenger.w7.G(j4Var.f9200l2);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                if (!J.exists()) {
                    org.telegram.messenger.w7.G(j4Var.f9200l2);
                    return org.telegram.messenger.w7.J(w10, null, false, true);
                }
                return J;
            }
        }
        return null;
    }

    public final c8 i() {
        ArrayList arrayList;
        TLRPC.Chat M0;
        CharSequence m22;
        TLRPC.Chat M02;
        CharSequence m23;
        CharSequence m24;
        String str;
        if (this.f9071j == null) {
            TL_stories.StoryItem storyItem = this.f9064a;
            int i7 = 0;
            c8 c8Var = null;
            if (storyItem != null) {
                int i10 = this.f9072k.f9200l2;
                if (storyItem.fwd_from != null) {
                    c8Var = new c8();
                    c8Var.f8883a = i10;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long o4 = org.telegram.messenger.m5.o(peer);
                        c8Var.f8884b = Long.valueOf(o4);
                        if (o4 >= 0) {
                            c8Var.f8891k = new SpannableStringBuilder(ij.h6()).append((CharSequence) " ").append((CharSequence) t10.p(qp.s1(i10).a2(Long.valueOf(o4))));
                        } else {
                            TLRPC.Chat M03 = qp.s1(i10).M0(Long.valueOf(-o4));
                            if (org.telegram.messenger.t3.V(M03)) {
                                m24 = ij.F();
                            } else {
                                m24 = ij.m2();
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(m24).append((CharSequence) " ");
                            if (M03 != null) {
                                str = M03.title;
                            } else {
                                str = "";
                            }
                            c8Var.f8891k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        c8Var.f8891k = new SpannableStringBuilder(ij.h6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    c8Var.f8887f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        c8Var.f8885c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    c8Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (i7 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i7);
                        }
                        i7++;
                    }
                    if (tL_mediaAreaChannelPost != null && (M02 = qp.s1(i10).M0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        c8Var = new c8();
                        c8Var.f8884b = Long.valueOf(-M02.f26956id);
                        c8Var.f8886e = true;
                        c8Var.f8883a = i10;
                        c8Var.f8887f = true;
                        c8Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (org.telegram.messenger.t3.V(M02)) {
                            m23 = ij.F();
                        } else {
                            m23 = ij.m2();
                        }
                        c8Var.f8891k = new SpannableStringBuilder(m23).append((CharSequence) " ").append((CharSequence) M02.title);
                    }
                }
                this.f9071j = c8Var;
            } else {
                y6 y6Var = this.f9065b;
                if (y6Var != null) {
                    fi.e7 e7Var = y6Var.f9960c;
                    if (e7Var != null) {
                        if (e7Var.f11904n) {
                            c8Var = new c8();
                            c8Var.f8891k = e7Var.f11908p;
                            String str2 = e7Var.f11914s;
                            c8Var.f8892l = str2;
                            c8Var.f8887f = TextUtils.isEmpty(str2);
                        } else if (e7Var.f11918u && (arrayList = e7Var.v) != null && arrayList.size() > 0) {
                            ij ijVar = (ij) e7Var.v.get(0);
                            long p10 = fi.e7.p(ijVar);
                            if (p10 < 0 && (M0 = qp.s1(ijVar.I1).M0(Long.valueOf(-p10))) != null) {
                                c8Var = new c8();
                                c8Var.f8884b = Long.valueOf(p10);
                                c8Var.f8886e = true;
                                c8Var.f8883a = ijVar.I1;
                                c8Var.f8887f = true;
                                Boolean D = fi.e7.D(ijVar);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i7 = ijVar.f23262k.fwd_from.channel_post;
                                    } else {
                                        i7 = ijVar.e1();
                                    }
                                }
                                c8Var.d = Integer.valueOf(i7);
                                if (org.telegram.messenger.t3.V(M0)) {
                                    m22 = ij.F();
                                } else {
                                    m22 = ij.m2();
                                }
                                c8Var.f8891k = new SpannableStringBuilder(m22).append((CharSequence) " ").append((CharSequence) M0.title);
                            }
                        }
                    }
                    this.f9071j = c8Var;
                }
            }
        }
        return this.f9071j;
    }

    public final boolean j() {
        y6 y6Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.f9067e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f9064a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        if (this.f9065b == null) {
            return true;
        }
        return !y6Var.f9960c.Y;
    }

    public final boolean k(long j3) {
        TL_stories.StoryItem storyItem = this.f9064a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j3 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f26973id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        return this.f9067e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        y6 y6Var = this.f9065b;
        if (y6Var != null) {
            return y6Var.f9965s;
        }
        TL_stories.StoryItem storyItem = this.f9064a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f9064a.media.getDocument();
            if (!ij.K4(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f9064a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z9;
        TLRPC.MessageMedia messageMedia;
        this.f9064a = storyItem;
        this.f9071j = null;
        this.f9070i = null;
        this.f9065b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.f9067e = m();
        TL_stories.StoryItem storyItem2 = this.f9064a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f9068f = z9;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i7 = 0;
        this.f9069g = false;
        j4 j4Var = this.f9072k;
        n3 n3Var = j4Var.f9228t0;
        h4 h4Var = j4Var.f9245x1;
        y6 y6Var = h4Var.f9065b;
        if (y6Var != null) {
            CharSequence charSequence = y6Var.f9960c.C0;
            this.h = charSequence;
            CharSequence m10 = org.telegram.messenger.i6.m(charSequence, n3Var.f9125b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m10;
            if (m10 == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(m10);
            }
            TLRPC.User a22 = qp.s1(j4Var.f9200l2).a2(Long.valueOf(j4Var.f9196k1));
            if (j4Var.f9196k1 < 0 || qp.s1(j4Var.f9200l2).Y4(a22)) {
                ij.d(valueOf, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = h4Var.f9064a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, l21.M0())) {
                this.f9069g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = h4Var.f9064a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence m11 = org.telegram.messenger.i6.m(str, n3Var.f9125b0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m11;
                if (m11 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(ij.B5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, n3Var.f9125b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(org.telegram.messenger.i6.m(valueOf2, n3Var.f9125b0.getPaint().getFontMetricsInt(), false, null, 0));
                    TLRPC.User a23 = qp.s1(j4Var.f9200l2).a2(Long.valueOf(j4Var.f9196k1));
                    if (j4Var.f9196k1 < 0 || qp.s1(j4Var.f9200l2).Y4(a23)) {
                        i7 = 1;
                    }
                    if (i7 != 0) {
                        ij.d(valueOf2, true);
                    }
                    ij.b(valueOf2, tL_textWithEntities.entities, false, true, true, false, i7 ^ 1);
                    this.h = valueOf2;
                    return;
                }
                return;
            }
            String str2 = h4Var.f9064a.caption;
            this.h = str2;
            CharSequence m12 = org.telegram.messenger.i6.m(str2, n3Var.f9125b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m12;
            if (m12 != null && h4Var.f9064a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(ij.B5(new SpannableStringBuilder(h4Var.f9064a.caption), h4Var.f9064a.entities, n3Var.f9125b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(org.telegram.messenger.i6.m(valueOf3, n3Var.f9125b0.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.User a24 = qp.s1(j4Var.f9200l2).a2(Long.valueOf(j4Var.f9196k1));
                if (j4Var.f9196k1 < 0 || qp.s1(j4Var.f9200l2).Y4(a24)) {
                    i7 = 1;
                }
                if (i7 != 0) {
                    ij.d(valueOf3, true);
                }
                ij.b(valueOf3, h4Var.f9064a.entities, false, true, true, false, i7 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
