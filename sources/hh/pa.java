package hh;

import org.telegram.messenger.AndroidUtilities;

public final class pa implements Runnable {

    public final int f9884a;

    public final jb f9885b;

    public pa(jb jbVar, int i10) {
        this.f9884a = i10;
        this.f9885b = jbVar;
    }

    @Override
    public final void run() {
        switch (this.f9884a) {
            case 0:
                jb jbVar = this.f9885b;
                jbVar.N = true;
                jbVar.p(null);
                AndroidUtilities.runOnUIThread(new pa(jbVar, 1), 240L);
                break;
            case 1:
                this.f9885b.dismiss();
                break;
            default:
                va vaVar = this.f9885b.f9561r;
                vaVar.B = false;
                vaVar.invalidate();
                break;
        }
    }
}
