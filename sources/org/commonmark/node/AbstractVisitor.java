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

    public void visitChildren(Node node) {
        Node node2 = node.firstChild;
        while (node2 != null) {
            Node node3 = node2.next;
            node2.accept(this);
            node2 = node3;
        }
    }

    public void visit(Document document) {
        visitChildren(document);
    }

    public void visit(Emphasis emphasis) {
        visitChildren(emphasis);
    }

    public void visit(FencedCodeBlock fencedCodeBlock) {
        visitChildren(fencedCodeBlock);
    }

    public void visit(HardLineBreak hardLineBreak) {
        visitChildren(hardLineBreak);
    }

    public void visit(Heading heading) {
        visitChildren(heading);
    }

    public void visit(ThematicBreak thematicBreak) {
        visitChildren(thematicBreak);
    }

    public void visit(HtmlInline htmlInline) {
        visitChildren(htmlInline);
    }

    public void visit(HtmlBlock htmlBlock) {
        visitChildren(htmlBlock);
    }

    public void visit(Image image) {
        visitChildren(image);
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

    public void visit(SoftLineBreak softLineBreak) {
        visitChildren(softLineBreak);
    }

    public void visit(StrongEmphasis strongEmphasis) {
        visitChildren(strongEmphasis);
    }

    public void visit(Text text) {
        visitChildren(text);
    }

    public void visit(LinkReferenceDefinition linkReferenceDefinition) {
        visitChildren(linkReferenceDefinition);
    }

    public void visit(CustomNode customNode) {
        visitChildren(customNode);
    }
}
