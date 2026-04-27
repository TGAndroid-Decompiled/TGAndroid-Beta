package org.commonmark.node;

public class LinkReferenceDefinition extends Node {
    private String destination;
    private String label;
    private String title;

    public LinkReferenceDefinition(String str, String str2, String str3) {
        this.label = str;
        this.destination = str2;
        this.title = str3;
    }

    public String getLabel() {
        return this.label;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
