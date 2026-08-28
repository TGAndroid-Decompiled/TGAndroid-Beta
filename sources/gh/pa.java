package gh;

import org.telegram.messenger.AndroidUtilities;
public final class pa implements Runnable {
    public final int f8732a;
    public final jb f8733b;

    public pa(jb jbVar, int i9) {
        this.f8732a = i9;
        this.f8733b = jbVar;
    }

    @Override
    public final void run() {
        switch (this.f8732a) {
            case 0:
                jb jbVar = this.f8733b;
                jbVar.N = true;
                jbVar.o(null);
                AndroidUtilities.runOnUIThread(new pa(jbVar, 1), 240L);
                return;
            case 1:
                this.f8733b.dismiss();
                return;
            default:
                va vaVar = this.f8733b.f8373r;
                vaVar.B = false;
                vaVar.invalidate();
                return;
        }
    }
}
