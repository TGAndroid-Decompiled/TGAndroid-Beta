package hi;

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
public final class k2 {
    public final a6.i f9697a;
    public boolean e;
    public boolean f9700f;
    public final ArrayDeque f9698b = new ArrayDeque();
    public final ArrayDeque f9699c = new ArrayDeque();
    public final gg.v1 f9701g = new gg.v1(this, 8);
    public j2 d = b();

    public k2(a6.i iVar) {
        this.f9697a = iVar;
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

    public final void a(hi.j2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: hi.k2.a(hi.j2):void");
    }

    public final j2 b() {
        h2 h2Var;
        n0 n0Var;
        int i10;
        ArrayList arrayList;
        i2[] i2VarArr;
        a6.i iVar = this.f9697a;
        ArrayList arrayList2 = ((z3) iVar.f301b).f10008l3;
        HashMap hashMap = new HashMap();
        j2 j2Var = this.d;
        if (j2Var != null) {
            for (i2 i2Var : j2Var.f9672a) {
                hashMap.put(Long.valueOf(i2Var.f9651a), i2Var);
            }
        }
        i2[] i2VarArr2 = new i2[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            a aVar = (a) arrayList2.get(i11);
            TL_iv.PageBlock pageBlock = aVar.f9421b;
            ArrayList arrayList3 = aVar.f9427k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            i2 i2Var2 = (i2) hashMap.get(Long.valueOf(aVar.f9420a));
            if (i2Var2 != null && i2Var2.f9653c == aVar.f9422c && i2Var2.d == aVar.d && i2Var2.e == aVar.e && i2Var2.f9654f == aVar.f9423f && i2Var2.f9655g == aVar.f9425i && i2Var2.h == aVar.f9424g) {
                ArrayList arrayList4 = i2Var2.f9656i;
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
                if (i2Var2.f9657j.equals(arrayList3) && Arrays.equals(i2Var2.f9652b, byteArray)) {
                    i2VarArr2[i11] = i2Var2;
                }
            }
            long j3 = aVar.f9420a;
            int i13 = aVar.f9422c;
            int i14 = aVar.d;
            boolean z10 = aVar.e;
            boolean z11 = aVar.f9423f;
            boolean z12 = aVar.f9425i;
            v vVar = aVar.f9424g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            i2VarArr2[i11] = new i2(j3, byteArray, i13, i14, z10, z11, z12, vVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((z3) iVar.f301b).findFocus();
        if (findFocus instanceof k1) {
            k1 k1Var = (k1) findFocus;
            int selectionStart = k1Var.getSelectionStart();
            int selectionEnd = k1Var.getSelectionEnd();
            r5 T2 = z3.T2(k1Var);
            if (T2 != null && T2.getRow() != null) {
                if (k1Var == T2.getTitleEditText()) {
                    h2Var = new h2(T2.getRow().f9420a, 0, selectionStart, selectionEnd);
                } else {
                    u5 o9 = T2.o(k1Var);
                    if (o9 != null) {
                        i10 = T2.k(o9.f9893b);
                    } else {
                        i10 = -1;
                    }
                    h2Var = new h2(T2.getRow().f9420a, i10, selectionStart, selectionEnd);
                }
            } else {
                if (k1Var instanceof n0) {
                    n0Var = (n0) k1Var;
                } else {
                    ViewParent parent = k1Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof n0) {
                                n0Var = (n0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            n0Var = null;
                            break;
                        }
                    }
                }
                if (n0Var != null && n0Var.getRow() != null) {
                    h2Var = new h2(n0Var.getRow().f9420a, -1, selectionStart, selectionEnd);
                } else {
                    while (k1Var != 0 && !(k1Var instanceof g6)) {
                        ViewParent parent2 = k1Var.getParent();
                        if (parent2 instanceof View) {
                            k1Var = (View) parent2;
                        } else {
                            k1Var = 0;
                        }
                    }
                    if (k1Var instanceof g6) {
                        g6 g6Var = (g6) k1Var;
                        if (g6Var.getRow() != null) {
                            h2Var = new h2(g6Var.getRow().f9420a, -1, selectionStart, selectionEnd);
                        }
                    }
                }
            }
            return new j2(i2VarArr2, h2Var);
        }
        h2Var = h2.e;
        return new j2(i2VarArr2, h2Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.f9701g);
        if (this.e && !this.f9700f) {
            j2 b10 = b();
            this.e = false;
            j2 j2Var = this.d;
            if (j2Var != null) {
                i2[] i2VarArr = j2Var.f9672a;
                i2[] i2VarArr2 = b10.f9672a;
                if (i2VarArr.length == i2VarArr2.length) {
                    for (int i10 = 0; i10 < i2VarArr.length; i10++) {
                        if (i2VarArr[i10] == i2VarArr2[i10]) {
                        }
                    }
                    return;
                }
            }
            j2 j2Var2 = this.d;
            ArrayDeque arrayDeque = this.f9698b;
            arrayDeque.addLast(j2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f9699c.clear();
            this.d = b10;
            ((z3) this.f9697a.f301b).f10001h3.e0();
        }
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.f9701g);
        c();
    }

    public final void f(int i10, int i11) {
        if (!this.f9700f) {
            if (i10 <= 16 && i11 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f9700f) {
            return;
        }
        this.e = true;
        gg.v1 v1Var = this.f9701g;
        AndroidUtilities.cancelRunOnUIThread(v1Var);
        AndroidUtilities.runOnUIThread(v1Var, 800L);
        ((z3) this.f9697a.f301b).f10001h3.e0();
    }

    public final void h() {
        if (this.f9700f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f9701g);
        this.e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f9699c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f9698b.addLast(this.d);
        j2 j2Var = (j2) arrayDeque.removeLast();
        this.d = j2Var;
        a(j2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.f9701g);
        this.f9698b.clear();
        this.f9699c.clear();
        this.d = b();
        this.e = false;
        ((z3) this.f9697a.f301b).f10001h3.e0();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f9698b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f9699c.addLast(this.d);
        j2 j2Var = (j2) arrayDeque.removeLast();
        this.d = j2Var;
        a(j2Var);
    }
}
