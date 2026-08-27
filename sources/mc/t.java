package mc;

public final enum t extends b2 {
    public t() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char cD = aVar.d();
        if (cD == '!') {
            lVar.g("<!");
            lVar.f18007c = b2.E;
        } else if (cD == '/') {
            lVar.e();
            lVar.f18007c = b2.C;
        } else {
            lVar.g("<");
            aVar.q();
            lVar.f18007c = b2.f17963f;
        }
    }
}
