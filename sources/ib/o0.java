package ib;

import java.net.URI;
import java.net.URISyntaxException;
public class o0 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            String v = aVar.v();
            if (v.equals("null")) {
                return null;
            }
            return new URI(v);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        String aSCIIString;
        URI uri = (URI) obj;
        if (uri == null) {
            aSCIIString = null;
        } else {
            aSCIIString = uri.toASCIIString();
        }
        bVar.r(aSCIIString);
    }
}
