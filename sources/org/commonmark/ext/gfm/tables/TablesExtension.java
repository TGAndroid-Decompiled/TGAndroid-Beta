package org.commonmark.ext.gfm.tables;

import org.commonmark.Extension;
import org.commonmark.ext.gfm.tables.internal.TableBlockParser;
import org.commonmark.parser.Parser;

public class TablesExtension implements Parser.ParserExtension, Extension {
    private TablesExtension() {
    }

    public static Extension create() {
        return new TablesExtension();
    }

    @Override
    public void extend(Parser.Builder builder) {
        builder.customBlockParserFactory(new TableBlockParser.Factory());
    }
}
