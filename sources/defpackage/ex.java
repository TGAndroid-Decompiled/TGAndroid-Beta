package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.j;
import org.telegram.ui.o;
public final class ex extends c79 {
    public TLRPC.WebPage F;
    public TL_iv.pageBlockChannel G;
    public boolean H;
    public int I;
    public final boolean J;
    public int[] K;
    public int L;
    public final o N;
    public final Activity c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final HashMap h = new HashMap();
    public final HashMap n = new HashMap();
    public final HashMap r = new HashMap();
    public final HashMap s = new HashMap();
    public final ArrayList w = new ArrayList();
    public final HashMap x = new HashMap();
    public final ArrayList y = new ArrayList();
    public final HashMap E = new HashMap();
    public final c1 M = new c1(this, (byte) 25);

    public ex(o oVar, Activity activity, boolean z) {
        this.N = oVar;
        this.c = activity;
        this.J = z;
    }

    public static int I(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return 0;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockHeader) && !o.H(pageBlock)) {
            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                return 2;
            }
            if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                return 3;
            }
            if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                return 4;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return 5;
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return 6;
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return 7;
            }
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                return 8;
            }
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return 9;
            }
            if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                return 10;
            }
            if (pageBlock instanceof TL_iv.pageBlockTitle) {
                return 11;
            }
            if (pageBlock instanceof ww) {
                return 12;
            }
            if (pageBlock instanceof TL_iv.pageBlockFooter) {
                return 13;
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return 14;
            }
            if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                return 15;
            }
            if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                return 16;
            }
            if (pageBlock instanceof TL_iv.pageBlockCollage) {
                return 17;
            }
            if (pageBlock instanceof TL_iv.pageBlockChannel) {
                return 18;
            }
            if (pageBlock instanceof TL_iv.pageBlockAudio) {
                return 19;
            }
            if (pageBlock instanceof TL_iv.pageBlockKicker) {
                return 20;
            }
            if (pageBlock instanceof yw) {
                return 21;
            }
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return 22;
            }
            if (pageBlock instanceof ax) {
                return 23;
            }
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return 24;
            }
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                return 25;
            }
            if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                return 26;
            }
            if (pageBlock instanceof bx) {
                return 28;
            }
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return 92;
            }
            if (pageBlock instanceof uw) {
                return I(((uw) pageBlock).b);
            }
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                return I(((TL_iv.pageBlockCover) pageBlock).cover);
            }
            return 100;
        }
        return 1;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 23 && i != 24) {
            return false;
        }
        return true;
    }

    public final void E(ex exVar, TL_iv.PageBlock pageBlock) {
        boolean z = pageBlock instanceof TL_iv.pageBlockPhoto;
        ArrayList arrayList = this.f;
        int i = 0;
        if (z) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            TLRPC.Photo e = dx.e(this.F, pageblockphoto.photo_id);
            if (e != null) {
                pageblockphoto.thumb = xb4.w(e.sizes, 56, true, null, false);
                pageblockphoto.thumbObject = e;
                arrayList.add(pageBlock);
            }
        } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && dx.g(exVar.F, pageBlock)) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document a = dx.a(this.F, pageblockvideo.video_id);
            if (a != null) {
                pageblockvideo.thumb = xb4.w(a.thumbs, 56, true, null, false);
                pageblockvideo.thumbObject = a;
                arrayList.add(pageBlock);
            }
        } else {
            boolean z2 = pageBlock instanceof TL_iv.pageBlockSlideshow;
            o oVar = this.N;
            if (z2) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                int size = pageblockslideshow.items.size();
                while (i < size) {
                    TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i);
                    pageBlock2.groupId = oVar.Z;
                    E(exVar, pageBlock2);
                    i++;
                }
                oVar.Z++;
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                int size2 = pageblockcollage.items.size();
                while (i < size2) {
                    TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i);
                    pageBlock3.groupId = oVar.Z;
                    E(exVar, pageBlock3);
                    i++;
                }
                oVar.Z++;
            } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                E(exVar, ((TL_iv.pageBlockCover) pageBlock).cover);
            }
        }
    }

    public final void F(defpackage.ex r24, org.telegram.tgnet.tl.TL_iv.PageBlock r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex.F(ex, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, int):void");
    }

    public final void G(Object obj, TL_iv.PageBlock pageBlock) {
        if (!(obj instanceof TL_iv.textEmpty)) {
            HashMap hashMap = this.x;
            if (hashMap.containsKey(obj)) {
                return;
            }
            hashMap.put(obj, pageBlock);
            this.y.add(obj);
        }
    }

    public final void H(int r28, defpackage.f89 r29, org.telegram.tgnet.tl.TL_iv.PageBlock r30, int r31, int r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex.H(int, f89, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean):void");
    }

    public final boolean J(uw uwVar) {
        TL_iv.PageBlock w = o.w(uwVar.a);
        if (w instanceof TL_iv.pageBlockDetails) {
            return ((TL_iv.pageBlockDetails) w).open;
        }
        if (w instanceof uw) {
            uw uwVar2 = (uw) w;
            TL_iv.PageBlock w2 = o.w(uwVar2.b);
            if (!(w2 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) w2).open) {
                return J(uwVar2);
            }
            return false;
        }
        return false;
    }

    public final void K(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.PageBlock pageBlock2 = (TL_iv.pageBlockEmbedPost) pageBlock;
            L(null, pageBlock2.caption.text);
            L(null, pageBlock2.caption.credit);
            G(pageBlock2.caption.text, pageBlock2);
            G(pageBlock2.caption.credit, pageBlock2);
        } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            TL_iv.PageBlock pageBlock3 = (TL_iv.pageBlockParagraph) pageBlock;
            L(null, pageBlock3.text);
            G(pageBlock3.text, pageBlock3);
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            TL_iv.PageBlock pageBlock4 = (TL_iv.pageBlockKicker) pageBlock;
            L(null, pageBlock4.text);
            G(pageBlock4.text, pageBlock4);
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            TL_iv.PageBlock pageBlock5 = (TL_iv.pageBlockFooter) pageBlock;
            L(null, pageBlock5.text);
            G(pageBlock5.text, pageBlock5);
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            TL_iv.PageBlock pageBlock6 = (TL_iv.pageBlockHeader) pageBlock;
            L(null, pageBlock6.text);
            G(pageBlock6.text, pageBlock6);
        } else if (o.H(pageBlock)) {
            TL_iv.RichText richText = pageBlock.text;
            L(null, richText);
            G(richText, pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.PageBlock pageBlock7 = (TL_iv.pageBlockPreformatted) pageBlock;
            L(null, pageBlock7.text);
            G(pageBlock7.text, pageBlock7);
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            TL_iv.PageBlock pageBlock8 = (TL_iv.pageBlockSubheader) pageBlock;
            L(null, pageBlock8.text);
            G(pageBlock8.text, pageBlock8);
        } else {
            int i = 0;
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                L(null, pageblockslideshow.caption.text);
                L(null, pageblockslideshow.caption.credit);
                G(pageblockslideshow.caption.text, pageblockslideshow);
                G(pageblockslideshow.caption.credit, pageblockslideshow);
                int size = pageblockslideshow.items.size();
                while (i < size) {
                    K(pageblockslideshow.items.get(i));
                    i++;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.PageBlock pageBlock9 = (TL_iv.pageBlockPhoto) pageBlock;
                L(null, pageBlock9.caption.text);
                L(null, pageBlock9.caption.credit);
                G(pageBlock9.caption.text, pageBlock9);
                G(pageBlock9.caption.credit, pageBlock9);
            } else if (pageBlock instanceof ww) {
                ww wwVar = (ww) pageBlock;
                TL_iv.RichText richText2 = wwVar.e;
                if (richText2 != null) {
                    L(null, richText2);
                    G(wwVar.e, wwVar);
                    return;
                }
                TL_iv.PageBlock pageBlock10 = wwVar.d;
                if (pageBlock10 != null) {
                    K(pageBlock10);
                }
            } else if (pageBlock instanceof yw) {
                yw ywVar = (yw) pageBlock;
                TL_iv.RichText richText3 = ywVar.e;
                if (richText3 != null) {
                    L(null, richText3);
                    G(ywVar.e, ywVar);
                    return;
                }
                TL_iv.PageBlock pageBlock11 = ywVar.d;
                if (pageBlock11 != null) {
                    K(pageBlock11);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                L(null, pageblockcollage.caption.text);
                L(null, pageblockcollage.caption.credit);
                G(pageblockcollage.caption.text, pageblockcollage);
                G(pageblockcollage.caption.credit, pageblockcollage);
                int size2 = pageblockcollage.items.size();
                while (i < size2) {
                    K(pageblockcollage.items.get(i));
                    i++;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                TL_iv.PageBlock pageBlock12 = (TL_iv.pageBlockEmbed) pageBlock;
                L(null, pageBlock12.caption.text);
                L(null, pageBlock12.caption.credit);
                G(pageBlock12.caption.text, pageBlock12);
                G(pageBlock12.caption.credit, pageBlock12);
            } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                TL_iv.PageBlock pageBlock13 = (TL_iv.pageBlockSubtitle) pageBlock;
                L(null, pageBlock13.text);
                G(pageBlock13.text, pageBlock13);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                L(null, pageblockblockquote.text);
                L(null, pageblockblockquote.caption);
                G(pageblockblockquote.text, pageblockblockquote);
                G(pageblockblockquote.caption, pageblockblockquote);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                L(null, pageblockdetails.title);
                G(pageblockdetails.title, pageblockdetails);
                int size3 = pageblockdetails.blocks.size();
                while (i < size3) {
                    K(pageblockdetails.blocks.get(i));
                    i++;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.PageBlock pageBlock14 = (TL_iv.pageBlockVideo) pageBlock;
                L(null, pageBlock14.caption.text);
                L(null, pageBlock14.caption.credit);
                G(pageBlock14.caption.text, pageBlock14);
                G(pageBlock14.caption.credit, pageBlock14);
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                L(null, pageblockpullquote.text);
                L(null, pageblockpullquote.caption);
                G(pageblockpullquote.text, pageblockpullquote);
                G(pageblockpullquote.caption, pageblockpullquote);
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                TL_iv.PageBlock pageBlock15 = (TL_iv.pageBlockAudio) pageBlock;
                L(null, pageBlock15.caption.text);
                L(null, pageBlock15.caption.credit);
                G(pageBlock15.caption.text, pageBlock15);
                G(pageBlock15.caption.credit, pageBlock15);
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                L(null, pageblocktable.title);
                G(pageblocktable.title, pageblocktable);
                int size4 = pageblocktable.rows.size();
                for (int i2 = 0; i2 < size4; i2++) {
                    TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i2);
                    int size5 = pagetablerow.cells.size();
                    for (int i3 = 0; i3 < size5; i3++) {
                        TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i3);
                        L(null, pagetablecell.text);
                        G(pagetablecell.text, pageblocktable);
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
                TL_iv.PageBlock pageBlock16 = (TL_iv.pageBlockTitle) pageBlock;
                L(null, pageBlock16.text);
                G(pageBlock16.text, pageBlock16);
            } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                K(((TL_iv.pageBlockCover) pageBlock).cover);
            } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                TL_iv.pageBlockAuthorDate pageblockauthordate = (TL_iv.pageBlockAuthorDate) pageBlock;
                L(null, pageblockauthordate.author);
                G(pageblockauthordate.author, pageblockauthordate);
            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                TL_iv.PageBlock pageBlock17 = (TL_iv.pageBlockMap) pageBlock;
                L(null, pageBlock17.caption.text);
                L(null, pageBlock17.caption.credit);
                G(pageBlock17.caption.text, pageBlock17);
                G(pageBlock17.caption.credit, pageBlock17);
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = (TL_iv.pageBlockRelatedArticles) pageBlock;
                L(null, pageblockrelatedarticles.title);
                G(pageblockrelatedarticles.title, pageblockrelatedarticles);
            }
        }
    }

    public final void L(TL_iv.RichText richText, TL_iv.RichText richText2) {
        if (richText2 != null) {
            richText2.parentRichText = richText;
            if (richText2 instanceof TL_iv.textFixed) {
                L(richText2, ((TL_iv.textFixed) richText2).text);
            } else if (richText2 instanceof TL_iv.textItalic) {
                L(richText2, ((TL_iv.textItalic) richText2).text);
            } else if (richText2 instanceof TL_iv.textBold) {
                L(richText2, ((TL_iv.textBold) richText2).text);
            } else if (richText2 instanceof TL_iv.textUnderline) {
                L(richText2, ((TL_iv.textUnderline) richText2).text);
            } else if (richText2 instanceof TL_iv.textStrike) {
                L(richText2, ((TL_iv.textStrike) richText2).text);
            } else if (richText2 instanceof TL_iv.textEmail) {
                L(richText2, ((TL_iv.textEmail) richText2).text);
            } else if (richText2 instanceof TL_iv.textPhone) {
                L(richText2, ((TL_iv.textPhone) richText2).text);
            } else if (richText2 instanceof TL_iv.textUrl) {
                L(richText2, ((TL_iv.textUrl) richText2).text);
            } else if (richText2 instanceof TL_iv.textConcat) {
                int size = richText2.texts.size();
                for (int i = 0; i < size; i++) {
                    L(richText2, richText2.texts.get(i));
                }
            } else if (richText2 instanceof TL_iv.textSubscript) {
                L(richText2, ((TL_iv.textSubscript) richText2).text);
            } else if (richText2 instanceof TL_iv.textSuperscript) {
                L(richText2, ((TL_iv.textSuperscript) richText2).text);
            } else if (richText2 instanceof TL_iv.textMarked) {
                L(richText2, ((TL_iv.textMarked) richText2).text);
            } else if (richText2 instanceof TL_iv.textSpoiler) {
                L(richText2, ((TL_iv.textSpoiler) richText2).text);
            } else if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                L(richText2, textanchor.text);
                String lowerCase = textanchor.name.toLowerCase();
                this.h.put(lowerCase, Integer.valueOf(this.e.size()));
                TL_iv.RichText richText3 = textanchor.text;
                boolean z = richText3 instanceof TL_iv.textPlain;
                HashMap hashMap = this.r;
                if (z) {
                    if (!TextUtils.isEmpty(((TL_iv.textPlain) richText3).text)) {
                        hashMap.put(lowerCase, textanchor);
                    }
                } else if (!(richText3 instanceof TL_iv.textEmpty)) {
                    hashMap.put(lowerCase, textanchor);
                }
                this.n.put(lowerCase, -1);
            }
        }
    }

    public final void M() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i);
            TL_iv.PageBlock w = o.w(pageBlock);
            if (!(w instanceof uw) || J((uw) w)) {
                arrayList.add(pageBlock);
            }
        }
        if (arrayList.size() < 100) {
            Utilities.e.a(this.M);
            Utilities.e.d(this.M, 100L);
        }
    }

    @Override
    public final int b() {
        int i;
        TLRPC.WebPage webPage = this.F;
        if (webPage != null && webPage.cached_page != null) {
            i = this.d.size();
            if (this.F.cached_page.local == null) {
                i++;
            }
        } else {
            i = 0;
        }
        if (this.J) {
            return i + 1;
        }
        return i;
    }

    @Override
    public final int d(int i) {
        TL_iv.Page page;
        if (this.J) {
            if (i == 0) {
                return 2147483646;
            }
            i--;
        }
        ArrayList arrayList = this.d;
        if (i == arrayList.size()) {
            TLRPC.WebPage webPage = this.F;
            if (webPage != null && (page = webPage.cached_page) != null && page.web) {
                return 91;
            }
            return 90;
        }
        return I((TL_iv.PageBlock) arrayList.get(i));
    }

    @Override
    public final void f() {
        M();
        super.f();
    }

    @Override
    public final void g(int i) {
        M();
        super.g(i);
    }

    @Override
    public final void j(int i, int i2) {
        M();
        super.j(i, i2);
    }

    @Override
    public final void l(int i, int i2) {
        M();
        super.l(i, i2);
    }

    @Override
    public final void n(int i, int i2, Object obj) {
        M();
        super.n(i, i2, obj);
    }

    @Override
    public final void p(int i, int i2) {
        M();
        super.p(i, i2);
    }

    @Override
    public final void q(int i, int i2) {
        M();
        super.q(i, i2);
    }

    @Override
    public final void t(f89 f89Var, int i) {
        if (this.J) {
            i--;
        }
        int i2 = i;
        if (i2 >= 0) {
            ArrayList arrayList = this.d;
            if (i2 < arrayList.size()) {
                H(f89Var.f, f89Var, (TL_iv.PageBlock) arrayList.get(i2), i2, arrayList.size(), false);
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        TextView textView;
        View cvVar;
        View yvVar;
        Activity activity = this.c;
        if (i != 2147483646) {
            o oVar = this.N;
            switch (i) {
                case 0:
                    cvVar = new cv(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 1:
                    cvVar = new wu(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 2:
                    textView = new qu(activity);
                    break;
                case 3:
                    cvVar = new j(oVar, activity, this);
                    textView = cvVar;
                    break;
                case 4:
                    cvVar = new sv(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 5:
                    yvVar = new yv(activity, oVar, this, 0);
                    textView = yvVar;
                    break;
                case 6:
                    cvVar = new iv(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 7:
                    cvVar = new eu(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 8:
                    cvVar = new qv(oVar, activity, this);
                    textView = cvVar;
                    break;
                case 9:
                    yvVar = new dv(activity, oVar, this, 0);
                    textView = yvVar;
                    break;
                case 10:
                    cvVar = new du(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 11:
                    cvVar = new wv(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 12:
                    cvVar = new yu(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 13:
                    cvVar = new vu(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 14:
                    cvVar = new hv(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 15:
                    cvVar = new rv(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 16:
                    cvVar = new uu(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 17:
                    cvVar = new nu(oVar, activity, this);
                    textView = cvVar;
                    break;
                case 18:
                    yvVar = new fu(activity, oVar, this, 0);
                    textView = yvVar;
                    break;
                case 19:
                    cvVar = new cu(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 20:
                    cvVar = new xu(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 21:
                    cvVar = new bv(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 22:
                    cvVar = new zu(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 23:
                    cvVar = new jv(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 24:
                    cvVar = new pu(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 25:
                    cvVar = new vv(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 26:
                    cvVar = new kv(activity, oVar, this);
                    textView = cvVar;
                    break;
                case 27:
                    View view = new View(activity);
                    view.setImportantForAccessibility(2);
                    textView = view;
                    break;
                case 28:
                    textView = new lv(activity, oVar);
                    break;
                default:
                    switch (i) {
                        case 90:
                            textView = new nw(oVar, activity, false);
                            break;
                        case 91:
                            textView = new nw(oVar, activity, true);
                            break;
                        case 92:
                            textView = new av(activity, oVar);
                            break;
                        default:
                            TextView textView2 = new TextView(activity);
                            textView2.setBackgroundColor(-65536);
                            textView2.setTextColor(-16777216);
                            textView2.setTextSize(1, 20.0f);
                            textView = textView2;
                            break;
                    }
            }
        } else {
            View t62Var = new t62(activity, (byte) 2);
            t62Var.setImportantForAccessibility(2);
            textView = t62Var;
        }
        textView.setLayoutParams(new r79(-1, -2));
        textView.setFocusable(true);
        return new f89(textView);
    }

    @Override
    public final void y(f89 f89Var) {
        int i;
        int i2 = f89Var.f;
        if (i2 != 90 && i2 != 91) {
            return;
        }
        nw nwVar = (nw) f89Var.a;
        TL_iv.Page page = this.F.cached_page;
        if (page != null) {
            i = page.views;
        } else {
            i = 0;
        }
        TextView textView = nwVar.b;
        TextView textView2 = nwVar.a;
        if (i == 0) {
            nwVar.c = false;
            textView.setVisibility(8);
            textView2.setGravity(17);
        } else {
            nwVar.c = true;
            textView.setVisibility(0);
            textView2.setGravity(21);
            textView.setText(ob6.H(',', "Views", i));
        }
        int i3 = aob.M6;
        int w0 = aob.w0(null, i3, false);
        int i4 = aob.y6;
        textView2.setTextColor(aob.w0(null, i4, false));
        textView.setTextColor(aob.w0(null, i4, false));
        textView2.setBackgroundColor(Color.argb(34, Color.red(w0), Color.green(w0), Color.blue(w0)));
        yob.X(textView2, i4, null);
        yob.X(textView, i4, null);
        yob.i(textView2, yob.g(i3, 34), null);
    }
}
