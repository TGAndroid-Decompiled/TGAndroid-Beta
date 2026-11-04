package mi;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class g2 {
    public final gi.w5 f19622a;
    public boolean f19625e;
    public boolean f19626f;
    public final ArrayDeque f19623b = new ArrayDeque();
    public final ArrayDeque f19624c = new ArrayDeque();
    public final lg.n f19627g = new lg.n(this, 15);
    public f2 d = b();

    public g2(gi.w5 w5Var) {
        this.f19622a = w5Var;
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
            int i3 = 0;
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
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.PageBlock pageBlock2 = arrayList.get(i10);
                    i10++;
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
                int i11 = 0;
                while (i11 < size2) {
                    TL_iv.pageTableRow pagetablerow = arrayList2.get(i11);
                    i11++;
                    TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                    if (pagetablerow2 != null) {
                        if (pagetablerow2.cells == null) {
                            pagetablerow2.cells = new ArrayList<>();
                        }
                        ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow2.cells;
                        int size3 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            TL_iv.pageTableCell pagetablecell = arrayList3.get(i12);
                            i12++;
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
                while (i3 < size4) {
                    TL_keyboard.PageButton pageButton = arrayList4.get(i3);
                    i3++;
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
                while (i3 < size5) {
                    TL_iv.PageBlock pageBlock3 = arrayList5.get(i3);
                    i3++;
                    e(pageBlock3);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                if (pageblockslideshow.items == null) {
                    pageblockslideshow.items = new ArrayList<>();
                }
                ArrayList<TL_iv.PageBlock> arrayList6 = pageblockslideshow.items;
                int size6 = arrayList6.size();
                while (i3 < size6) {
                    TL_iv.PageBlock pageBlock4 = arrayList6.get(i3);
                    i3++;
                    e(pageBlock4);
                }
            }
        }
    }

    public final void a(mi.f2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: mi.g2.a(mi.f2):void");
    }

    public final f2 b() {
        d2 d2Var;
        l0 l0Var;
        int i3;
        ArrayList arrayList;
        e2[] e2VarArr;
        gi.w5 w5Var = this.f19622a;
        ArrayList arrayList2 = ((t3) w5Var.f13798b).f19924t3;
        HashMap hashMap = new HashMap();
        f2 f2Var = this.d;
        if (f2Var != null) {
            for (e2 e2Var : f2Var.f19596a) {
                hashMap.put(Long.valueOf(e2Var.f19571a), e2Var);
            }
        }
        e2[] e2VarArr2 = new e2[arrayList2.size()];
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            a aVar = (a) arrayList2.get(i10);
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            ArrayList arrayList3 = aVar.f19438k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            e2 e2Var2 = (e2) hashMap.get(Long.valueOf(aVar.f19430a));
            if (e2Var2 != null && e2Var2.f19573c == aVar.f19432c && e2Var2.d == aVar.d && e2Var2.f19574e == aVar.f19433e && e2Var2.f19575f == aVar.f19434f && e2Var2.f19576g == aVar.f19436i && e2Var2.h == aVar.f19435g) {
                ArrayList arrayList4 = e2Var2.f19577i;
                ArrayList arrayList5 = aVar.h;
                if (arrayList4 != arrayList5) {
                    if (arrayList4 != null && arrayList5 != null && arrayList4.size() == arrayList5.size()) {
                        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                            if (arrayList4.get(i11) != arrayList5.get(i11)) {
                                break;
                            }
                        }
                    }
                }
                if (e2Var2.f19578j.equals(arrayList3) && Arrays.equals(e2Var2.f19572b, byteArray)) {
                    e2VarArr2[i10] = e2Var2;
                }
            }
            long j10 = aVar.f19430a;
            int i12 = aVar.f19432c;
            int i13 = aVar.d;
            boolean z10 = aVar.f19433e;
            boolean z11 = aVar.f19434f;
            boolean z12 = aVar.f19436i;
            s sVar = aVar.f19435g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            e2VarArr2[i10] = new e2(j10, byteArray, i12, i13, z10, z11, z12, sVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((t3) w5Var.f13798b).findFocus();
        if (findFocus instanceof h1) {
            h1 h1Var = (h1) findFocus;
            int selectionStart = h1Var.getSelectionStart();
            int selectionEnd = h1Var.getSelectionEnd();
            n5 X2 = t3.X2(h1Var);
            if (X2 != null && X2.getRow() != null) {
                if (h1Var == X2.getTitleEditText()) {
                    d2Var = new d2(0, selectionStart, selectionEnd, X2.getRow().f19430a);
                } else {
                    q5 q10 = X2.q(h1Var);
                    if (q10 != null) {
                        i3 = X2.l(q10.f19843b);
                    } else {
                        i3 = -1;
                    }
                    d2Var = new d2(i3, selectionStart, selectionEnd, X2.getRow().f19430a);
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
                    d2Var = new d2(-1, selectionStart, selectionEnd, l0Var.getRow().f19430a);
                } else {
                    while (h1Var != 0 && !(h1Var instanceof b6)) {
                        ViewParent parent2 = h1Var.getParent();
                        if (parent2 instanceof View) {
                            h1Var = (View) parent2;
                        } else {
                            h1Var = 0;
                        }
                    }
                    if (h1Var instanceof b6) {
                        b6 b6Var = (b6) h1Var;
                        if (b6Var.getRow() != null) {
                            d2Var = new d2(-1, selectionStart, selectionEnd, b6Var.getRow().f19430a);
                        }
                    }
                }
            }
            return new f2(e2VarArr2, d2Var);
        }
        d2Var = d2.f19557e;
        return new f2(e2VarArr2, d2Var);
    }

    public final void c() {
        org.telegram.messenger.g0.r(this.f19627g);
        if (this.f19625e && !this.f19626f) {
            f2 b10 = b();
            this.f19625e = false;
            f2 f2Var = this.d;
            if (f2Var != null) {
                e2[] e2VarArr = f2Var.f19596a;
                e2[] e2VarArr2 = b10.f19596a;
                if (e2VarArr.length == e2VarArr2.length) {
                    for (int i3 = 0; i3 < e2VarArr.length; i3++) {
                        if (e2VarArr[i3] == e2VarArr2[i3]) {
                        }
                    }
                    return;
                }
            }
            f2 f2Var2 = this.d;
            ArrayDeque arrayDeque = this.f19623b;
            arrayDeque.addLast(f2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f19624c.clear();
            this.d = b10;
            ((t3) this.f19622a.f13798b).f19916p3.O1();
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(this.f19627g);
        c();
    }

    public final void f(int i3, int i10) {
        if (!this.f19626f) {
            if (i3 <= 16 && i10 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f19626f) {
            return;
        }
        this.f19625e = true;
        lg.n nVar = this.f19627g;
        org.telegram.messenger.g0.r(nVar);
        org.telegram.messenger.g0.i3(nVar, 800L);
        ((t3) this.f19622a.f13798b).f19916p3.O1();
    }

    public final void h() {
        if (this.f19626f) {
            return;
        }
        org.telegram.messenger.g0.r(this.f19627g);
        this.f19625e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f19624c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f19623b.addLast(this.d);
        f2 f2Var = (f2) arrayDeque.removeLast();
        this.d = f2Var;
        a(f2Var);
    }

    public final void j() {
        org.telegram.messenger.g0.r(this.f19627g);
        this.f19623b.clear();
        this.f19624c.clear();
        this.d = b();
        this.f19625e = false;
        ((t3) this.f19622a.f13798b).f19916p3.O1();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f19623b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f19624c.addLast(this.d);
        f2 f2Var = (f2) arrayDeque.removeLast();
        this.d = f2Var;
        a(f2Var);
    }
}
