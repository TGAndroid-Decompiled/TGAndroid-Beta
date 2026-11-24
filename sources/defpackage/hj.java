package defpackage;

import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public class hj extends EditTextBoldCursor implements tjb {
    public boolean M1;
    public int N1;
    public wjb O1;
    public int P1;

    public final void A(int i, wjb wjbVar) {
        this.M1 = true;
        this.N1 = i;
        this.O1 = wjbVar;
        int v0 = bkb.v0(i, wjbVar);
        this.P1 = v0;
        setCursorColor(v0);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        if (this.M1) {
            hashSet.add(Integer.valueOf(this.N1));
        }
    }

    @Override
    public final void updateColors() {
        int v0;
        try {
            if (this.M1 && (v0 = bkb.v0(this.N1, this.O1)) != this.P1) {
                this.P1 = v0;
                setCursorColor(v0);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
