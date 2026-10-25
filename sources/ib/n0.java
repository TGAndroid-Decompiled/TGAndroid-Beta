package ib;

import java.net.URL;
public class n0 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        if (v.equals("null")) {
            return null;
        }
        return new URL(v);
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        String externalForm;
        URL url = (URL) obj;
        if (url == null) {
            externalForm = null;
        } else {
            externalForm = url.toExternalForm();
        }
        bVar.r(externalForm);
    }
}
