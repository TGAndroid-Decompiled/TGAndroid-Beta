package org.commonmark.parser;

import com.google.zxing.BinaryBitmap;

public interface InlineParserFactory {
    InlineParser create(BinaryBitmap binaryBitmap);
}
