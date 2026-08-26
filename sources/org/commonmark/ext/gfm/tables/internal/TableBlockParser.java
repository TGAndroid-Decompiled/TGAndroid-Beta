package org.commonmark.ext.gfm.tables.internal;

import java.util.ArrayList;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.internal.BlockContinueImpl;
import org.commonmark.internal.DocumentParser;
import org.commonmark.node.Block;
import org.commonmark.node.Node;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.block.AbstractBlockParser;

public final class TableBlockParser extends AbstractBlockParser {
    public final ArrayList columns;
    public final ArrayList headerCells;
    public final TableBlock block = new TableBlock();
    public final ArrayList bodyLines = new ArrayList();
    public boolean nextIsSeparatorLine = true;

    public TableBlockParser(ArrayList arrayList, ArrayList arrayList2) {
        this.columns = arrayList;
        this.headerCells = arrayList2;
    }

    public static ArrayList split(CharSequence charSequence) {
        String strTrim = charSequence.toString().trim();
        if (strTrim.startsWith("|")) {
            strTrim = strTrim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < strTrim.length()) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (i2 >= strTrim.length() || strTrim.charAt(i2) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    i = i2;
                }
            } else if (cCharAt != '|') {
                sb.append(cCharAt);
            } else {
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
            i++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override
    public final void addLine(CharSequence charSequence) {
        if (this.nextIsSeparatorLine) {
            this.nextIsSeparatorLine = false;
        } else {
            this.bodyLines.add(charSequence);
        }
    }

    @Override
    public final Block getBlock() {
        return this.block;
    }

    @Override
    public final void parseInlines(InlineParser inlineParser) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.headerCells;
        int size = arrayList2.size();
        TableHead tableHead = new TableHead();
        TableBlock tableBlock = this.block;
        tableBlock.appendChild(tableHead);
        Node tableRow = new TableRow();
        tableHead.appendChild(tableRow);
        int i = 0;
        while (true) {
            arrayList = this.columns;
            if (i >= size) {
                break;
            }
            String str = (String) arrayList2.get(i);
            TableCell tableCell = new TableCell();
            if (i < arrayList.size()) {
                tableCell.alignment = (TableCell.Alignment) arrayList.get(i);
            }
            inlineParser.parse(str.trim(), tableCell);
            tableCell.header = true;
            tableRow.appendChild(tableCell);
            i++;
        }
        ArrayList arrayList3 = this.bodyLines;
        int size2 = arrayList3.size();
        Node tableBody = null;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList3.get(i2);
            i2++;
            ArrayList arrayListSplit = split((CharSequence) obj);
            Node tableRow2 = new TableRow();
            int i3 = 0;
            while (i3 < size) {
                String str2 = i3 < arrayListSplit.size() ? (String) arrayListSplit.get(i3) : "";
                TableCell tableCell2 = new TableCell();
                if (i3 < arrayList.size()) {
                    tableCell2.alignment = (TableCell.Alignment) arrayList.get(i3);
                }
                inlineParser.parse(str2.trim(), tableCell2);
                tableRow2.appendChild(tableCell2);
                i3++;
            }
            if (tableBody == null) {
                tableBody = new TableBody();
                tableBlock.appendChild(tableBody);
            }
            tableBody.appendChild(tableRow2);
        }
    }

    @Override
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        if (documentParser.line.toString().contains("|")) {
            return BlockContinueImpl.atIndex(documentParser.index);
        }
        return null;
    }
}
