package ji;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class g2 {
    public final a6.m f13941a;
    public boolean f13944e;
    public boolean f13945f;
    public final ArrayDeque f13942b = new ArrayDeque();
    public final ArrayDeque f13943c = new ArrayDeque();
    public final ig.t0 f13946g = new ig.t0(this, 11);
    public f2 d = b();

    public g2(a6.m mVar) {
        this.f13941a = mVar;
    }

    public static void e(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            if (pageBlock.text == null) {
                pageBlock.text = new TL_iv.textEmpty();
            }
            if (pageBlock.caption == null) {
                TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                pageCaption.text = new TL_iv.textEmpty();
                pageCaption.credit = new TL_iv.textEmpty();
                pageBlock.caption = pageCaption;
            }
            int i10 = 0;
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                if (pageblockblockquote.caption == null) {
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                }
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                if (pageblockblockquoteblocks.blocks == null) {
                    pageblockblockquoteblocks.blocks = new ArrayList<>();
                }
                ArrayList<TL_iv.PageBlock> arrayList = pageblockblockquoteblocks.blocks;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    TL_iv.PageBlock pageBlock2 = arrayList.get(i11);
                    i11++;
                    e(pageBlock2);
                }
                if (pageblockblockquoteblocks.caption == null) {
                    pageblockblockquoteblocks.caption = new TL_iv.textEmpty();
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                if (pageblockpullquote.caption == null) {
                    pageblockpullquote.caption = new TL_iv.textEmpty();
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (pageblockpreformatted.language == null) {
                    pageblockpreformatted.language = "";
                }
            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                if (pageblockmath.source == null) {
                    pageblockmath.source = "";
                }
            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                if (pageblockmap.geo == null) {
                    pageblockmap.geo = new TLRPC.TL_geoPointEmpty();
                }
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                if (pageblocktable.rows == null) {
                    pageblocktable.rows = new ArrayList<>();
                }
                ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    TL_iv.pageTableRow pagetablerow = arrayList2.get(i12);
                    i12++;
                    TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                    if (pagetablerow2 != null) {
                        if (pagetablerow2.cells == null) {
                            pagetablerow2.cells = new ArrayList<>();
                        }
                        ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow2.cells;
                        int size3 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            TL_iv.pageTableCell pagetablecell = arrayList3.get(i13);
                            i13++;
                            TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                            if (pagetablecell2 != null && pagetablecell2.text == null) {
                                pagetablecell2.text = new TL_iv.textEmpty();
                            }
                        }
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                if (pageblockbuttonrow.buttons == null) {
                    pageblockbuttonrow.buttons = new ArrayList<>();
                }
                ArrayList<TL_keyboard.PageButton> arrayList4 = pageblockbuttonrow.buttons;
                int size4 = arrayList4.size();
                while (i10 < size4) {
                    TL_keyboard.PageButton pageButton = arrayList4.get(i10);
                    i10++;
                    TL_keyboard.PageButton pageButton2 = pageButton;
                    if (pageButton2 != null && pageButton2.text == null) {
                        pageButton2.text = new TL_iv.textEmpty();
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                if (pageblockcollage.items == null) {
                    pageblockcollage.items = new ArrayList<>();
                }
                ArrayList<TL_iv.PageBlock> arrayList5 = pageblockcollage.items;
                int size5 = arrayList5.size();
                while (i10 < size5) {
                    TL_iv.PageBlock pageBlock3 = arrayList5.get(i10);
                    i10++;
                    e(pageBlock3);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                if (pageblockslideshow.items == null) {
                    pageblockslideshow.items = new ArrayList<>();
                }
                ArrayList<TL_iv.PageBlock> arrayList6 = pageblockslideshow.items;
                int size6 = arrayList6.size();
                while (i10 < size6) {
                    TL_iv.PageBlock pageBlock4 = arrayList6.get(i10);
                    i10++;
                    e(pageBlock4);
                }
            }
        }
    }

    public final void a(ji.f2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: ji.g2.a(ji.f2):void");
    }

    public final f2 b() {
        d2 d2Var;
        l0 l0Var;
        int i10;
        ArrayList arrayList;
        e2[] e2VarArr;
        a6.m mVar = this.f13941a;
        ArrayList arrayList2 = ((v3) mVar.f328b).f14282l3;
        HashMap hashMap = new HashMap();
        f2 f2Var = this.d;
        if (f2Var != null) {
            for (e2 e2Var : f2Var.f13920a) {
                hashMap.put(Long.valueOf(e2Var.f13902a), e2Var);
            }
        }
        e2[] e2VarArr2 = new e2[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            a aVar = (a) arrayList2.get(i11);
            TL_iv.PageBlock pageBlock = aVar.f13758b;
            ArrayList arrayList3 = aVar.f13765k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            e2 e2Var2 = (e2) hashMap.get(Long.valueOf(aVar.f13757a));
            if (e2Var2 != null && e2Var2.f13904c == aVar.f13759c && e2Var2.d == aVar.d && e2Var2.f13905e == aVar.f13760e && e2Var2.f13906f == aVar.f13761f && e2Var2.f13907g == aVar.f13763i && e2Var2.h == aVar.f13762g) {
                ArrayList arrayList4 = e2Var2.f13908i;
                ArrayList arrayList5 = aVar.h;
                if (arrayList4 != arrayList5) {
                    if (arrayList4 != null && arrayList5 != null && arrayList4.size() == arrayList5.size()) {
                        for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                            if (arrayList4.get(i12) != arrayList5.get(i12)) {
                                break;
                            }
                        }
                    }
                }
                if (e2Var2.f13909j.equals(arrayList3) && Arrays.equals(e2Var2.f13903b, byteArray)) {
                    e2VarArr2[i11] = e2Var2;
                }
            }
            long j3 = aVar.f13757a;
            int i13 = aVar.f13759c;
            int i14 = aVar.d;
            boolean z10 = aVar.f13760e;
            boolean z11 = aVar.f13761f;
            boolean z12 = aVar.f13763i;
            u uVar = aVar.f13762g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            e2VarArr2[i11] = new e2(j3, byteArray, i13, i14, z10, z11, z12, uVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((v3) mVar.f328b).findFocus();
        if (findFocus instanceof h1) {
            h1 h1Var = (h1) findFocus;
            int selectionStart = h1Var.getSelectionStart();
            int selectionEnd = h1Var.getSelectionEnd();
            s5 T2 = v3.T2(h1Var);
            if (T2 != null && T2.getRow() != null) {
                if (h1Var == T2.getTitleEditText()) {
                    d2Var = new d2(T2.getRow().f13757a, 0, selectionStart, selectionEnd);
                } else {
                    v5 o9 = T2.o(h1Var);
                    if (o9 != null) {
                        i10 = T2.k(o9.f14304b);
                    } else {
                        i10 = -1;
                    }
                    d2Var = new d2(T2.getRow().f13757a, i10, selectionStart, selectionEnd);
                }
            } else {
                if (h1Var instanceof l0) {
                    l0Var = (l0) h1Var;
                } else {
                    ViewParent parent = h1Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof l0) {
                                l0Var = (l0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            l0Var = null;
                            break;
                        }
                    }
                }
                if (l0Var != null && l0Var.getRow() != null) {
                    d2Var = new d2(l0Var.getRow().f13757a, -1, selectionStart, selectionEnd);
                } else {
                    while (h1Var != 0 && !(h1Var instanceof g6)) {
                        ViewParent parent2 = h1Var.getParent();
                        if (parent2 instanceof View) {
                            h1Var = (View) parent2;
                        } else {
                            h1Var = 0;
                        }
                    }
                    if (h1Var instanceof g6) {
                        g6 g6Var = (g6) h1Var;
                        if (g6Var.getRow() != null) {
                            d2Var = new d2(g6Var.getRow().f13757a, -1, selectionStart, selectionEnd);
                        }
                    }
                }
            }
            return new f2(e2VarArr2, d2Var);
        }
        d2Var = d2.f13883e;
        return new f2(e2VarArr2, d2Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.f13946g);
        if (this.f13944e && !this.f13945f) {
            f2 b10 = b();
            this.f13944e = false;
            f2 f2Var = this.d;
            if (f2Var != null) {
                e2[] e2VarArr = f2Var.f13920a;
                e2[] e2VarArr2 = b10.f13920a;
                if (e2VarArr.length == e2VarArr2.length) {
                    for (int i10 = 0; i10 < e2VarArr.length; i10++) {
                        if (e2VarArr[i10] == e2VarArr2[i10]) {
                        }
                    }
                    return;
                }
            }
            f2 f2Var2 = this.d;
            ArrayDeque arrayDeque = this.f13942b;
            arrayDeque.addLast(f2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f13943c.clear();
            this.d = b10;
            ((v3) this.f13941a.f328b).f14275h3.u();
        }
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.f13946g);
        c();
    }

    public final void f(int i10, int i11) {
        if (!this.f13945f) {
            if (i10 <= 16 && i11 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f13945f) {
            return;
        }
        this.f13944e = true;
        ig.t0 t0Var = this.f13946g;
        AndroidUtilities.cancelRunOnUIThread(t0Var);
        AndroidUtilities.runOnUIThread(t0Var, 800L);
        ((v3) this.f13941a.f328b).f14275h3.u();
    }

    public final void h() {
        if (this.f13945f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f13946g);
        this.f13944e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f13943c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f13942b.addLast(this.d);
        f2 f2Var = (f2) arrayDeque.removeLast();
        this.d = f2Var;
        a(f2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.f13946g);
        this.f13942b.clear();
        this.f13943c.clear();
        this.d = b();
        this.f13944e = false;
        ((v3) this.f13941a.f328b).f14275h3.u();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f13942b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f13943c.addLast(this.d);
        f2 f2Var = (f2) arrayDeque.removeLast();
        this.d = f2Var;
        a(f2Var);
    }
}
