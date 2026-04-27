package org.commonmark.parser;

import java.util.List;
import org.commonmark.node.LinkReferenceDefinition;

public interface InlineParserContext {
    List getCustomDelimiterProcessors();

    LinkReferenceDefinition getLinkReferenceDefinition(String str);
}
