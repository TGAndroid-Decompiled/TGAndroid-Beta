package org.scilab.forge.jlatexmath;

public class XMLResourceParseException extends ResourceParseException {
    private static final long serialVersionUID = 2091302779298293946L;

    public XMLResourceParseException(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": invalid <");
        sb.append(str2);
        sb.append(">-element found: attribute '");
        sb.append(str3);
        sb.append("' ");
        sb.append(str4 == null ? "is required!" : str4);
        super(sb.toString());
    }

    public XMLResourceParseException(String str, String str2, String str3, String str4, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": invalid <");
        sb.append(str2);
        sb.append(">-element found: attribute '");
        sb.append(str3);
        sb.append("' ");
        sb.append(str4 == null ? "is required!" : str4);
        super(sb.toString(), th);
    }

    public XMLResourceParseException(String str, String str2) {
        super(str + ": the required <" + str2 + ">-element is not found!");
    }

    public XMLResourceParseException(String str, Throwable th) {
        super(str, th);
    }

    public XMLResourceParseException(String str) {
        super(str);
    }
}
