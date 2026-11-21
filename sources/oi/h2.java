package oi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class h2 {
    public int f22156a;
    public int f22157b;
    public int f22158c;
    public int d;
    public int f22159e;

    public static void a(TL_iv.RichText richText, int i7, h2 h2Var) {
        if (richText != null) {
            h2Var.f22156a = c6.l(richText).length() + h2Var.f22156a;
            int c10 = c(richText) + i7;
            if (c10 > h2Var.f22158c) {
                h2Var.f22158c = c10;
            }
        }
    }

    public static void b(TL_iv.PageBlock pageBlock, int i7, h2 h2Var) {
        int i10;
        if (pageBlock != null) {
            if (i7 > h2Var.f22158c) {
                h2Var.f22158c = i7;
            }
            a(pageBlock.text, i7, h2Var);
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                a(((TL_iv.pageBlockBlockquote) pageBlock).caption, i7, h2Var);
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                a(((TL_iv.pageBlockPullquote) pageBlock).caption, i7, h2Var);
            } else {
                int i11 = 0;
                if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                    TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                    a(pageblockblockquoteblocks.caption, i7, h2Var);
                    h2Var.f22157b = pageblockblockquoteblocks.blocks.size() + h2Var.f22157b;
                    while (i11 < pageblockblockquoteblocks.blocks.size()) {
                        b(pageblockblockquoteblocks.blocks.get(i11), i7 + 1, h2Var);
                        i11++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                    a(pageblockdetails.title, i7, h2Var);
                    h2Var.f22157b = pageblockdetails.blocks.size() + h2Var.f22157b;
                    while (i11 < pageblockdetails.blocks.size()) {
                        b(pageblockdetails.blocks.get(i11), i7 + 1, h2Var);
                        i11++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    h2Var.f22157b = pageblocklist.items.size() + h2Var.f22157b;
                    for (int i12 = 0; i12 < pageblocklist.items.size(); i12++) {
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i12);
                        int i13 = i7 + 1;
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            a(((TL_iv.TL_pageListItemText) pageListItem).text, i13, h2Var);
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                b(arrayList.get(i14), i13, h2Var);
                            }
                        }
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    h2Var.f22157b = pageblockorderedlist.items.size() + h2Var.f22157b;
                    for (int i15 = 0; i15 < pageblockorderedlist.items.size(); i15++) {
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i15);
                        int i16 = i7 + 1;
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            a(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, i16, h2Var);
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                                b(arrayList2.get(i17), i16, h2Var);
                            }
                        }
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                    a(pageblocktable.title, i7, h2Var);
                    ArrayList<TL_iv.pageTableRow> arrayList3 = pageblocktable.rows;
                    if (arrayList3 != null) {
                        h2Var.f22157b = arrayList3.size() + h2Var.f22157b;
                        for (int i18 = 0; i18 < pageblocktable.rows.size(); i18++) {
                            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i18);
                            if (pagetablerow.cells != null) {
                                i10 = 0;
                                for (int i19 = 0; i19 < pagetablerow.cells.size(); i19++) {
                                    TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i19);
                                    i10 += e6.n(pagetablecell);
                                    a(pagetablecell.text, i7 + 1, h2Var);
                                }
                            } else {
                                i10 = 0;
                            }
                            if (i10 > h2Var.f22159e) {
                                h2Var.f22159e = i10;
                            }
                        }
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    ArrayList<TL_keyboard.PageButton> arrayList4 = ((TL_iv.pageBlockButtonRow) pageBlock).buttons;
                    if (arrayList4 != null) {
                        int size = arrayList4.size();
                        while (i11 < size) {
                            TL_keyboard.PageButton pageButton = arrayList4.get(i11);
                            i11++;
                            TL_keyboard.PageButton pageButton2 = pageButton;
                            if (pageButton2 != null) {
                                a(pageButton2.text, i7 + 1, h2Var);
                            }
                        }
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    TL_iv.PageCaption pageCaption = pageBlock.caption;
                    if (pageCaption != null) {
                        a(pageCaption.text, i7, h2Var);
                        a(pageCaption.credit, i7, h2Var);
                    }
                    ArrayList<TL_iv.PageBlock> arrayList5 = ((TL_iv.pageBlockCollage) pageBlock).items;
                    while (i11 < arrayList5.size()) {
                        b(arrayList5.get(i11), i7 + 1, h2Var);
                        i11++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.PageCaption pageCaption2 = pageBlock.caption;
                    if (pageCaption2 != null) {
                        a(pageCaption2.text, i7, h2Var);
                        a(pageCaption2.credit, i7, h2Var);
                    }
                    ArrayList<TL_iv.PageBlock> arrayList6 = ((TL_iv.pageBlockSlideshow) pageBlock).items;
                    while (i11 < arrayList6.size()) {
                        b(arrayList6.get(i11), i7 + 1, h2Var);
                        i11++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                    String str = ((TL_iv.pageBlockMath) pageBlock).source;
                    if (str != null) {
                        h2Var.f22156a = str.length() + h2Var.f22156a;
                    }
                } else {
                    TL_iv.PageCaption pageCaption3 = pageBlock.caption;
                    if (pageCaption3 == null) {
                        return;
                    }
                    a(pageCaption3.text, i7, h2Var);
                    a(pageCaption3.credit, i7, h2Var);
                }
            }
        }
    }

    public static int c(TL_iv.RichText richText) {
        int i7 = 0;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return 0;
        }
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.RichText richText2 = arrayList.get(i10);
                i10++;
                i7 = Math.max(i7, c(richText2));
            }
            return i7;
        }
        return c(richText.text) + 1;
    }
}
