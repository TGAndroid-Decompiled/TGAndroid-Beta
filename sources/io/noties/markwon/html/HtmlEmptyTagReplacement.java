package io.noties.markwon.html;

public class HtmlEmptyTagReplacement {
    public static HtmlEmptyTagReplacement create() {
        return new HtmlEmptyTagReplacement();
    }

    public String replace(HtmlTag htmlTag) {
        String strName = htmlTag.name();
        if ("br".equals(strName)) {
            return "\n";
        }
        if ("img".equals(strName)) {
            String str = (String) htmlTag.attributes().get("alt");
            return (str == null || str.length() == 0) ? "￼" : str;
        }
        if ("iframe".equals(strName)) {
            return " ";
        }
        return null;
    }
}
