package io.noties.markwon.html;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

abstract class HtmlTagImpl implements HtmlTag {
    final Map attributes;
    int end = -1;
    final String name;
    final int start;

    protected HtmlTagImpl(String str, int i, Map map) {
        this.name = str;
        this.start = i;
        this.attributes = map;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int start() {
        return this.start;
    }

    @Override
    public int end() {
        return this.end;
    }

    public boolean isEmpty() {
        return this.start == this.end;
    }

    @Override
    public Map attributes() {
        return this.attributes;
    }

    @Override
    public boolean isClosed() {
        return this.end > -1;
    }

    static class InlineImpl extends HtmlTagImpl implements HtmlTag {
        InlineImpl(String str, int i, Map map) {
            super(str, i, map);
        }

        void closeAt(int i) {
            if (isClosed()) {
                return;
            }
            this.end = i;
        }

        public String toString() {
            return "InlineImpl{name='" + this.name + "', start=" + this.start + ", end=" + this.end + ", attributes=" + this.attributes + '}';
        }
    }

    static class BlockImpl extends HtmlTagImpl implements HtmlTag.Block {
        List children;
        final BlockImpl parent;

        static BlockImpl root() {
            return new BlockImpl("", 0, Collections.emptyMap(), null);
        }

        static BlockImpl create(String str, int i, Map map, BlockImpl blockImpl) {
            return new BlockImpl(str, i, map, blockImpl);
        }

        BlockImpl(String str, int i, Map map, BlockImpl blockImpl) {
            super(str, i, map);
            this.parent = blockImpl;
        }

        void closeAt(int i) {
            if (isClosed()) {
                return;
            }
            this.end = i;
            List list = this.children;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((BlockImpl) it.next()).closeAt(i);
                }
            }
        }

        @Override
        public List children() {
            List list = this.children;
            if (list == null) {
                return Collections.emptyList();
            }
            return DesugarCollections.unmodifiableList(list);
        }

        @Override
        public Map attributes() {
            return this.attributes;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BlockImpl{name='");
            sb.append(this.name);
            sb.append('\'');
            sb.append(", start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", attributes=");
            sb.append(this.attributes);
            sb.append(", parent=");
            BlockImpl blockImpl = this.parent;
            sb.append(blockImpl != null ? blockImpl.name : null);
            sb.append(", children=");
            sb.append(this.children);
            sb.append('}');
            return sb.toString();
        }
    }
}
