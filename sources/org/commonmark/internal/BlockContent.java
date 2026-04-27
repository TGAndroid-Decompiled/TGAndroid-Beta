package org.commonmark.internal;

class BlockContent {
    private int lineCount = 0;
    private final StringBuilder sb = new StringBuilder();

    public void add(CharSequence charSequence) {
        if (this.lineCount != 0) {
            this.sb.append('\n');
        }
        this.sb.append(charSequence);
        this.lineCount++;
    }

    public String getString() {
        return this.sb.toString();
    }
}
