package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class usc extends TLObject {
    public static final int i = 0;
    public String a;
    public TLRPC.InputWebFileLocation b;
    public ArrayList c;
    public int d;
    public String e;
    public boolean f;

    public static usc a(double d, double d2, long j, int i2, int i3, int i4, int i5) {
        ?? tLObject = new TLObject();
        TLRPC.TL_inputWebFileGeoPointLocation tL_inputWebFileGeoPointLocation = new TLRPC.TL_inputWebFileGeoPointLocation();
        tLObject.b = tL_inputWebFileGeoPointLocation;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_inputWebFileGeoPointLocation.geo_point = tL_inputGeoPoint;
        tL_inputWebFileGeoPointLocation.access_hash = j;
        tL_inputGeoPoint.lat = d;
        tL_inputGeoPoint._long = d2;
        tL_inputWebFileGeoPointLocation.w = i2;
        tL_inputWebFileGeoPointLocation.h = i3;
        tL_inputWebFileGeoPointLocation.zoom = i4;
        tL_inputWebFileGeoPointLocation.scale = i5;
        tLObject.e = "image/png";
        tLObject.a = String.format(Locale.US, "maps_%.6f_%.6f_%d_%d_%d_%d.png", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        tLObject.c = new ArrayList();
        return tLObject;
    }

    public static usc b(TLRPC.GeoPoint geoPoint, int i2, int i3, int i4, int i5) {
        return a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, i2, i3, i4, i5);
    }

    public static usc c(TLRPC.WebDocument webDocument) {
        if (webDocument instanceof TLRPC.TL_webDocument) {
            ?? tLObject = new TLObject();
            TLRPC.TL_webDocument tL_webDocument = (TLRPC.TL_webDocument) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation = new TLRPC.TL_inputWebFileLocation();
            tLObject.b = tL_inputWebFileLocation;
            String str = webDocument.url;
            tLObject.a = str;
            tL_inputWebFileLocation.url = str;
            tL_inputWebFileLocation.access_hash = tL_webDocument.access_hash;
            tLObject.d = tL_webDocument.size;
            tLObject.e = tL_webDocument.mime_type;
            tLObject.c = tL_webDocument.attributes;
            return tLObject;
        } else if (webDocument instanceof TLRPC.TL_webDocumentNoProxy) {
            ?? tLObject2 = new TLObject();
            TLRPC.TL_webDocumentNoProxy tL_webDocumentNoProxy = (TLRPC.TL_webDocumentNoProxy) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation2 = new TLRPC.TL_inputWebFileLocation();
            tLObject2.b = tL_inputWebFileLocation2;
            String str2 = webDocument.url;
            tLObject2.a = str2;
            tL_inputWebFileLocation2.url = str2;
            tL_inputWebFileLocation2.access_hash = tL_webDocumentNoProxy.access_hash;
            tLObject2.d = tL_webDocumentNoProxy.size;
            tLObject2.e = tL_webDocumentNoProxy.mime_type;
            tLObject2.c = tL_webDocumentNoProxy.attributes;
            tLObject2.f = true;
            return tLObject2;
        } else {
            return null;
        }
    }
}
