package oa;

import java.net.URI;
import java.net.URISyntaxException;
public class o0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
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
        } catch (URISyntaxException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        String aSCIIString;
        URI uri = (URI) obj;
        if (uri == null) {
            aSCIIString = null;
        } else {
            aSCIIString = uri.toASCIIString();
        }
        cVar.r(aSCIIString);
    }
}
