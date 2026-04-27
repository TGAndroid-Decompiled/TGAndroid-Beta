package org.commonmark.node;

public class FencedCodeBlock extends Block {
    private char fenceChar;
    private int fenceIndent;
    private int fenceLength;
    private String info;
    private String literal;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public char getFenceChar() {
        return this.fenceChar;
    }

    public void setFenceChar(char c) {
        this.fenceChar = c;
    }

    public int getFenceLength() {
        return this.fenceLength;
    }

    public void setFenceLength(int i) {
        this.fenceLength = i;
    }

    public int getFenceIndent() {
        return this.fenceIndent;
    }

    public void setFenceIndent(int i) {
        this.fenceIndent = i;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public String getLiteral() {
        return this.literal;
    }

    public void setLiteral(String str) {
        this.literal = str;
    }
}
