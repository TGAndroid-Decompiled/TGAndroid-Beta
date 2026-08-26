package org.commonmark.node;

public abstract class AbstractVisitor {
    public abstract void visit(BlockQuote blockQuote);

    public abstract void visit(BulletList bulletList);

    public void visit(Code code) {
        visitChildren(code);
    }

    public abstract void visit(CustomBlock customBlock);

    public abstract void visit(OrderedList orderedList);

    public abstract void visit(Paragraph paragraph);

    public void visit$1(Emphasis emphasis) {
        visitChildren(emphasis);
    }

    public void visit$2(Emphasis emphasis) {
        visitChildren(emphasis);
    }

    public void visit$3(Emphasis emphasis) {
        visitChildren(emphasis);
    }

    public void visitChildren(Node node) {
        Node node2 = (Node) node.firstChild;
        while (node2 != null) {
            Node node3 = (Node) node2.next;
            node2.accept(this);
            node2 = node3;
        }
    }

    public void visit(Emphasis emphasis) {
        visitChildren(emphasis);
    }

    public void visit$1(Code code) {
        visitChildren(code);
    }

    public void visit(FencedCodeBlock fencedCodeBlock) {
        visitChildren(fencedCodeBlock);
    }

    public void visit$1(Link link) {
        visitChildren(link);
    }

    public void visit(Heading heading) {
        visitChildren(heading);
    }

    public void visit(ThematicBreak thematicBreak) {
        visitChildren(thematicBreak);
    }

    public void visit(HtmlBlock htmlBlock) {
        visitChildren(htmlBlock);
    }

    public void visit(IndentedCodeBlock indentedCodeBlock) {
        visitChildren(indentedCodeBlock);
    }

    public void visit(Link link) {
        visitChildren(link);
    }

    public void visit(ListItem listItem) {
        visitChildren(listItem);
    }

    public void visit(Text text) {
        visitChildren(text);
    }

    public void visit(CustomNode customNode) {
        visitChildren(customNode);
    }
}
