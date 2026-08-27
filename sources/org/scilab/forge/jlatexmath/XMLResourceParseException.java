package org.scilab.forge.jlatexmath;

public class XMLResourceParseException extends ResourceParseException {
    private static final long serialVersionUID = 2091302779298293946L;

    public XMLResourceParseException(String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(": invalid <");
        sb2.append(str2);
        sb2.append(">-element found: attribute '");
        sb2.append(str3);
        sb2.append("' ");
        sb2.append(str4 == null ? "is required!" : str4);
        super(sb2.toString());
    }

    public XMLResourceParseException(String str, String str2, String str3, String str4, Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(": invalid <");
        sb2.append(str2);
        sb2.append(">-element found: attribute '");
        sb2.append(str3);
        sb2.append("' ");
        sb2.append(str4 == null ? "is required!" : str4);
        super(sb2.toString(), th);
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
