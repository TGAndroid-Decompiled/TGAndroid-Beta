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
import org.telegram.ui.Components.k21;
public final class g4 {
    public TL_stories.StoryItem f9038a = null;
    public x6 f9039b = null;
    public TL_stories.StoryItem f9040c;
    public boolean d;
    public boolean f9041e;
    public boolean f9042f;
    public boolean f9043g;
    public CharSequence h;
    public c8 f9044i;
    public c8 f9045j;
    public final i4 f9046k;

    public g4(i4 i4Var) {
        this.f9046k = i4Var;
    }

    public static String c(g4 g4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = g4Var.f9038a;
        if (storyItem != null && (messageMedia = storyItem.media) != null) {
            if (messageMedia.photo != null) {
                StringBuilder sb2 = new StringBuilder("photo#");
                sb2.append(g4Var.f9038a.media.photo.f26977id);
                sb2.append("at");
                return a8.p0.n(g4Var.f9038a.media.photo.dc_id, "dc", sb2);
            } else if (messageMedia.document != null) {
                StringBuilder sb3 = new StringBuilder("doc#");
                sb3.append(g4Var.f9038a.media.document.f26959id);
                sb3.append("at");
                return a8.p0.n(g4Var.f9038a.media.document.dc_id, "dc", sb3);
            } else {
                return "unknown";
            }
        } else if (g4Var.f9039b != null) {
            return "uploading from " + g4Var.f9039b.f9931e;
        } else {
            return "unknown";
        }
    }

    public final boolean d() {
        x6 x6Var = this.f9039b;
        if (x6Var != null) {
            return x6Var.f9930c.H0;
        }
        TL_stories.StoryItem storyItem = this.f9038a;
        if (storyItem != null) {
            if (storyItem.noforwards) {
                return false;
            }
            if (storyItem.pinned) {
                TLRPC.Chat M0 = qp.s1(this.f9046k.f9168l2).M0(Long.valueOf(-storyItem.dialogId));
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
        i4 i4Var = this.f9046k;
        if (i4Var.f9213x1.f9038a == null) {
            return null;
        }
        if (i4Var.f9164k1 > 0) {
            TLRPC.User a22 = qp.s1(i4Var.f9168l2).a2(Long.valueOf(i4Var.f9164k1));
            if (t10.n(a22) == null) {
                return null;
            }
            if (i4Var.f9213x1.f9042f) {
                return String.format(Locale.US, "https://t.me/%1$s/s/live", t10.n(a22));
            }
            return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", t10.n(a22), Integer.valueOf(i4Var.f9213x1.f9038a.f27192id));
        }
        TLRPC.Chat M0 = qp.s1(i4Var.f9168l2).M0(Long.valueOf(-i4Var.f9164k1));
        if (org.telegram.messenger.t3.K(M0, false) == null) {
            return null;
        }
        if (i4Var.f9213x1.f9042f) {
            return String.format(Locale.US, "https://t.me/%1$s/s/live", org.telegram.messenger.t3.K(M0, false));
        }
        return String.format(Locale.US, "https://t.me/%1$s/s/%2$s", org.telegram.messenger.t3.K(M0, false), Integer.valueOf(i4Var.f9213x1.f9038a.f27192id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.f9038a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final c8 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.f9044i == null && (storyItem = this.f9038a) != null) {
            TLRPC.Document document = storyItem.music;
            c8 c8Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    c8Var = new c8();
                    c8Var.f8883f = true;
                    c8Var.f8884g = document;
                    if (TextUtils.isEmpty(str)) {
                        c8Var.f8887k = new SpannableStringBuilder(c8.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        c8Var.f8887k = new SpannableStringBuilder(c8.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(c8.d()).append((CharSequence) " ").append((CharSequence) str2);
                        c8Var.f8887k = append;
                        int length = append.length();
                        c8Var.f8887k.append((CharSequence) " ・ ");
                        c8Var.f8887k.setSpan(new CharacterStyle(), length, c8Var.f8887k.length(), 33);
                        c8Var.f8887k.append((CharSequence) str);
                    }
                }
            }
            this.f9044i = c8Var;
        }
        return this.f9044i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.f9038a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            i4 i4Var = this.f9046k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                org.telegram.messenger.w7.G(i4Var.f9168l2);
                return org.telegram.messenger.w7.I(this.f9038a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.f9038a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, Integer.MAX_VALUE, false, null, false);
                org.telegram.messenger.w7.G(i4Var.f9168l2);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                if (!J.exists()) {
                    org.telegram.messenger.w7.G(i4Var.f9168l2);
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
        CharSequence n22;
        TLRPC.Chat M02;
        CharSequence n23;
        CharSequence n24;
        String str;
        if (this.f9045j == null) {
            TL_stories.StoryItem storyItem = this.f9038a;
            int i7 = 0;
            c8 c8Var = null;
            if (storyItem != null) {
                int i10 = this.f9046k.f9168l2;
                if (storyItem.fwd_from != null) {
                    c8Var = new c8();
                    c8Var.f8879a = i10;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long o4 = org.telegram.messenger.m5.o(peer);
                        c8Var.f8880b = Long.valueOf(o4);
                        if (o4 >= 0) {
                            c8Var.f8887k = new SpannableStringBuilder(ij.i6()).append((CharSequence) " ").append((CharSequence) t10.p(qp.s1(i10).a2(Long.valueOf(o4))));
                        } else {
                            TLRPC.Chat M03 = qp.s1(i10).M0(Long.valueOf(-o4));
                            if (org.telegram.messenger.t3.V(M03)) {
                                n24 = ij.F();
                            } else {
                                n24 = ij.n2();
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(n24).append((CharSequence) " ");
                            if (M03 != null) {
                                str = M03.title;
                            } else {
                                str = "";
                            }
                            c8Var.f8887k = append.append((CharSequence) str);
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        c8Var.f8887k = new SpannableStringBuilder(ij.i6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    c8Var.f8883f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        c8Var.f8881c = Integer.valueOf(storyFwdHeader2.story_id);
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
                        c8Var.f8880b = Long.valueOf(-M02.f26953id);
                        c8Var.f8882e = true;
                        c8Var.f8879a = i10;
                        c8Var.f8883f = true;
                        c8Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        if (org.telegram.messenger.t3.V(M02)) {
                            n23 = ij.F();
                        } else {
                            n23 = ij.n2();
                        }
                        c8Var.f8887k = new SpannableStringBuilder(n23).append((CharSequence) " ").append((CharSequence) M02.title);
                    }
                }
                this.f9045j = c8Var;
            } else {
                x6 x6Var = this.f9039b;
                if (x6Var != null) {
                    fi.e7 e7Var = x6Var.f9930c;
                    if (e7Var != null) {
                        if (e7Var.f11904n) {
                            c8Var = new c8();
                            c8Var.f8887k = e7Var.f11908p;
                            String str2 = e7Var.f11914s;
                            c8Var.f8888l = str2;
                            c8Var.f8883f = TextUtils.isEmpty(str2);
                        } else if (e7Var.f11918u && (arrayList = e7Var.v) != null && arrayList.size() > 0) {
                            ij ijVar = (ij) e7Var.v.get(0);
                            long p10 = fi.e7.p(ijVar);
                            if (p10 < 0 && (M0 = qp.s1(ijVar.I1).M0(Long.valueOf(-p10))) != null) {
                                c8Var = new c8();
                                c8Var.f8880b = Long.valueOf(p10);
                                c8Var.f8882e = true;
                                c8Var.f8879a = ijVar.I1;
                                c8Var.f8883f = true;
                                Boolean D = fi.e7.D(ijVar);
                                if (D != null) {
                                    if (D.booleanValue()) {
                                        i7 = ijVar.f23244k.fwd_from.channel_post;
                                    } else {
                                        i7 = ijVar.f1();
                                    }
                                }
                                c8Var.d = Integer.valueOf(i7);
                                if (org.telegram.messenger.t3.V(M0)) {
                                    n22 = ij.F();
                                } else {
                                    n22 = ij.n2();
                                }
                                c8Var.f8887k = new SpannableStringBuilder(n22).append((CharSequence) " ").append((CharSequence) M0.title);
                            }
                        }
                    }
                    this.f9045j = c8Var;
                }
            }
        }
        return this.f9045j;
    }

    public final boolean j() {
        x6 x6Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.f9041e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.f9038a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }
        if (this.f9039b == null) {
            return true;
        }
        return !x6Var.f9930c.Y;
    }

    public final boolean k(long j3) {
        TL_stories.StoryItem storyItem = this.f9038a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j3 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.f26970id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean l() {
        return this.f9041e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        x6 x6Var = this.f9039b;
        if (x6Var != null) {
            return x6Var.f9935s;
        }
        TL_stories.StoryItem storyItem = this.f9038a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.f9038a.media.getDocument();
            if (!ij.L4(document) && !"video/mp4".equals(document.mime_type)) {
                return false;
            }
            return true;
        }
        TL_stories.StoryItem storyItem2 = this.f9038a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        boolean z9;
        TLRPC.MessageMedia messageMedia;
        this.f9038a = storyItem;
        this.f9045j = null;
        this.f9044i = null;
        this.f9039b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.f9041e = m();
        TL_stories.StoryItem storyItem2 = this.f9038a;
        if (storyItem2 != null && (messageMedia = storyItem2.media) != null && (messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f9042f = z9;
    }

    public final void o() {
        SpannableStringBuilder valueOf;
        int i7 = 0;
        this.f9043g = false;
        i4 i4Var = this.f9046k;
        n3 n3Var = i4Var.f9196t0;
        g4 g4Var = i4Var.f9213x1;
        x6 x6Var = g4Var.f9039b;
        if (x6Var != null) {
            CharSequence charSequence = x6Var.f9930c.C0;
            this.h = charSequence;
            CharSequence m10 = org.telegram.messenger.i6.m(charSequence, n3Var.f9095b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m10;
            if (m10 == null) {
                valueOf = new SpannableStringBuilder();
            } else {
                valueOf = SpannableStringBuilder.valueOf(m10);
            }
            TLRPC.User a22 = qp.s1(i4Var.f9168l2).a2(Long.valueOf(i4Var.f9164k1));
            if (i4Var.f9164k1 < 0 || qp.s1(i4Var.f9168l2).Y4(a22)) {
                ij.d(valueOf, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = g4Var.f9038a;
        if (storyItem != null) {
            if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, k21.M0())) {
                this.f9043g = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = g4Var.f9038a.translatedText;
                String str = tL_textWithEntities.text;
                this.h = str;
                CharSequence m11 = org.telegram.messenger.i6.m(str, n3Var.f9095b0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m11;
                if (m11 != null && tL_textWithEntities.entities != null) {
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(ij.C5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, n3Var.f9095b0.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(org.telegram.messenger.i6.m(valueOf2, n3Var.f9095b0.getPaint().getFontMetricsInt(), false, null, 0));
                    TLRPC.User a23 = qp.s1(i4Var.f9168l2).a2(Long.valueOf(i4Var.f9164k1));
                    if (i4Var.f9164k1 < 0 || qp.s1(i4Var.f9168l2).Y4(a23)) {
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
            String str2 = g4Var.f9038a.caption;
            this.h = str2;
            CharSequence m12 = org.telegram.messenger.i6.m(str2, n3Var.f9095b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m12;
            if (m12 != null && g4Var.f9038a.entities != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(ij.C5(new SpannableStringBuilder(g4Var.f9038a.caption), g4Var.f9038a.entities, n3Var.f9095b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(org.telegram.messenger.i6.m(valueOf3, n3Var.f9095b0.getPaint().getFontMetricsInt(), false, null, 0));
                TLRPC.User a24 = qp.s1(i4Var.f9168l2).a2(Long.valueOf(i4Var.f9164k1));
                if (i4Var.f9164k1 < 0 || qp.s1(i4Var.f9168l2).Y4(a24)) {
                    i7 = 1;
                }
                if (i7 != 0) {
                    ij.d(valueOf3, true);
                }
                ij.b(valueOf3, g4Var.f9038a.entities, false, true, true, false, i7 ^ 1);
                this.h = valueOf3;
            }
        }
    }
}
