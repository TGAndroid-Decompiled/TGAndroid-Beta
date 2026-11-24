package org.scilab.forge.jlatexmath;
public class XMLResourceParseException extends ResourceParseException {
    private static final long serialVersionUID = 2091302779298293946L;

    public XMLResourceParseException(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.XMLResourceParseException.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public XMLResourceParseException(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Throwable r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.XMLResourceParseException.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void");
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
