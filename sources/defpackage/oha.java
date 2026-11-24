package defpackage;
public final class oha implements Runnable {
    public final byte a;
    public final jia b;

    public oha(jia jiaVar, byte b) {
        this.a = b;
        this.b = jiaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jia jiaVar = this.b;
        switch (b) {
            case 0:
                jiaVar.setVisibility(8);
                return;
            default:
                jiaVar.setVisibility(8);
                return;
        }
    }
}
