package defpackage;

import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public class hk extends EditTextBoldCursor implements vlb {
    public boolean M1;
    public int N1;
    public ylb O1;
    public int P1;

    public final void A(int i, ylb ylbVar) {
        this.M1 = true;
        this.N1 = i;
        this.O1 = ylbVar;
        int v0 = cmb.v0(i, ylbVar);
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
            if (this.M1 && (v0 = cmb.v0(this.N1, this.O1)) != this.P1) {
                this.P1 = v0;
                setCursorColor(v0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
