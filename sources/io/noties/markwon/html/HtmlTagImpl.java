package io.noties.markwon.html;

import java.util.ArrayList;
import java.util.Map;

public abstract class HtmlTagImpl implements HtmlTag {
    public final Map attributes;
    public int end = -1;
    public final String name;
    public final int start;

    public final class BlockImpl extends HtmlTagImpl implements HtmlTag.Block {
        public ArrayList children;
        public final BlockImpl parent;

        public BlockImpl(String str, int i, Map map, BlockImpl blockImpl) {
            super(i, str, map);
            this.parent = blockImpl;
        }

        @Override
        public final Map attributes() {
            return this.attributes;
        }

        public final void closeAt(int i) {
            if (this.end > -1) {
                return;
            }
            this.end = i;
            ArrayList arrayList = this.children;
            if (arrayList != null) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((BlockImpl) obj).closeAt(i);
                }
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BlockImpl{name='");
            sb.append(this.name);
            sb.append("', start=");
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

    public final class InlineImpl extends HtmlTagImpl {
        public final String toString() {
            return "InlineImpl{name='" + this.name + "', start=" + this.start + ", end=" + this.end + ", attributes=" + this.attributes + '}';
        }
    }

    public HtmlTagImpl(int i, String str, Map map) {
        this.name = str;
        this.start = i;
        this.attributes = map;
    }

    @Override
    public Map attributes() {
        return this.attributes;
    }
}
