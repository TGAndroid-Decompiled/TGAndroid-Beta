package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class dh9 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public static void a(TL_iv.RichText richText, int i, dh9 dh9Var) {
        if (richText != null) {
            dh9Var.a = mm9.l(richText).length() + dh9Var.a;
            int c = c(richText) + i;
            if (c > dh9Var.c) {
                dh9Var.c = c;
            }
        }
    }

    public static void b(TL_iv.PageBlock pageBlock, int i, dh9 dh9Var) {
        int i2;
        if (pageBlock != null) {
            if (i > dh9Var.c) {
                dh9Var.c = i;
            }
            a(pageBlock.text, i, dh9Var);
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                a(((TL_iv.pageBlockBlockquote) pageBlock).caption, i, dh9Var);
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                a(((TL_iv.pageBlockPullquote) pageBlock).caption, i, dh9Var);
            } else {
                int i3 = 0;
                if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                    TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                    a(pageblockblockquoteblocks.caption, i, dh9Var);
                    dh9Var.b = pageblockblockquoteblocks.blocks.size() + dh9Var.b;
                    while (i3 < pageblockblockquoteblocks.blocks.size()) {
                        b(pageblockblockquoteblocks.blocks.get(i3), i + 1, dh9Var);
                        i3++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                    a(pageblockdetails.title, i, dh9Var);
                    dh9Var.b = pageblockdetails.blocks.size() + dh9Var.b;
                    while (i3 < pageblockdetails.blocks.size()) {
                        b(pageblockdetails.blocks.get(i3), i + 1, dh9Var);
                        i3++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    dh9Var.b = pageblocklist.items.size() + dh9Var.b;
                    for (int i4 = 0; i4 < pageblocklist.items.size(); i4++) {
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i4);
                        int i5 = i + 1;
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            a(((TL_iv.TL_pageListItemText) pageListItem).text, i5, dh9Var);
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                b(arrayList.get(i6), i5, dh9Var);
                            }
                        }
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    dh9Var.b = pageblockorderedlist.items.size() + dh9Var.b;
                    for (int i7 = 0; i7 < pageblockorderedlist.items.size(); i7++) {
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i7);
                        int i8 = i + 1;
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            a(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, i8, dh9Var);
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                                b(arrayList2.get(i9), i8, dh9Var);
                            }
                        }
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                    a(pageblocktable.title, i, dh9Var);
                    ArrayList<TL_iv.pageTableRow> arrayList3 = pageblocktable.rows;
                    if (arrayList3 != null) {
                        dh9Var.b = arrayList3.size() + dh9Var.b;
                        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
                            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
                            if (pagetablerow.cells != null) {
                                i2 = 0;
                                for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                                    TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i11);
                                    i2 += ajb.n(pagetablecell);
                                    a(pagetablecell.text, i + 1, dh9Var);
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i2 > dh9Var.e) {
                                dh9Var.e = i2;
                            }
                        }
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    ArrayList<TL_keyboard.PageButton> arrayList4 = ((TL_iv.pageBlockButtonRow) pageBlock).buttons;
                    if (arrayList4 != null) {
                        int size = arrayList4.size();
                        while (i3 < size) {
                            TL_keyboard.PageButton pageButton = arrayList4.get(i3);
                            i3++;
                            TL_keyboard.PageButton pageButton2 = pageButton;
                            if (pageButton2 != null) {
                                a(pageButton2.text, i + 1, dh9Var);
                            }
                        }
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    TL_iv.PageCaption pageCaption = pageBlock.caption;
                    if (pageCaption != null) {
                        a(pageCaption.text, i, dh9Var);
                        a(pageCaption.credit, i, dh9Var);
                    }
                    ArrayList<TL_iv.PageBlock> arrayList5 = ((TL_iv.pageBlockCollage) pageBlock).items;
                    while (i3 < arrayList5.size()) {
                        b(arrayList5.get(i3), i + 1, dh9Var);
                        i3++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.PageCaption pageCaption2 = pageBlock.caption;
                    if (pageCaption2 != null) {
                        a(pageCaption2.text, i, dh9Var);
                        a(pageCaption2.credit, i, dh9Var);
                    }
                    ArrayList<TL_iv.PageBlock> arrayList6 = ((TL_iv.pageBlockSlideshow) pageBlock).items;
                    while (i3 < arrayList6.size()) {
                        b(arrayList6.get(i3), i + 1, dh9Var);
                        i3++;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                    String str = ((TL_iv.pageBlockMath) pageBlock).source;
                    if (str != null) {
                        dh9Var.a = str.length() + dh9Var.a;
                    }
                } else {
                    TL_iv.PageCaption pageCaption3 = pageBlock.caption;
                    if (pageCaption3 == null) {
                        return;
                    }
                    a(pageCaption3.text, i, dh9Var);
                    a(pageCaption3.credit, i, dh9Var);
                }
            }
        }
    }

    public static int c(TL_iv.RichText richText) {
        int i = 0;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return 0;
        }
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_iv.RichText richText2 = arrayList.get(i2);
                i2++;
                i = Math.max(i, c(richText2));
            }
            return i;
        }
        return c(richText.text) + 1;
    }
}
