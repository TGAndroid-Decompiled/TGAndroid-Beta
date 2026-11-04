package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e20 extends TLObject {
    public static final int f22293i = 0;
    public String f22294a;
    public TLRPC.InputWebFileLocation f22295b;
    public ArrayList f22296c;
    public int d;
    public String f22297e;
    public boolean f22298f;

    public static e20 a(double d, double d10, long j10, int i3, int i10, int i11, int i12) {
        ?? tLObject = new TLObject();
        TLRPC.TL_inputWebFileGeoPointLocation tL_inputWebFileGeoPointLocation = new TLRPC.TL_inputWebFileGeoPointLocation();
        tLObject.f22295b = tL_inputWebFileGeoPointLocation;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_inputWebFileGeoPointLocation.geo_point = tL_inputGeoPoint;
        tL_inputWebFileGeoPointLocation.access_hash = j10;
        tL_inputGeoPoint.lat = d;
        tL_inputGeoPoint._long = d10;
        tL_inputWebFileGeoPointLocation.f27075w = i3;
        tL_inputWebFileGeoPointLocation.h = i10;
        tL_inputWebFileGeoPointLocation.zoom = i11;
        tL_inputWebFileGeoPointLocation.scale = i12;
        tLObject.f22297e = "image/png";
        tLObject.f22294a = String.format(Locale.US, "maps_%.6f_%.6f_%d_%d_%d_%d.png", Double.valueOf(d), Double.valueOf(d10), Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        tLObject.f22296c = new ArrayList();
        return tLObject;
    }

    public static e20 b(TLRPC.GeoPoint geoPoint, int i3, int i10, int i11, int i12) {
        return a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, i3, i10, i11, i12);
    }

    public static e20 c(TLRPC.WebDocument webDocument) {
        if (webDocument instanceof TLRPC.TL_webDocument) {
            ?? tLObject = new TLObject();
            TLRPC.TL_webDocument tL_webDocument = (TLRPC.TL_webDocument) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation = new TLRPC.TL_inputWebFileLocation();
            tLObject.f22295b = tL_inputWebFileLocation;
            String str = webDocument.url;
            tLObject.f22294a = str;
            tL_inputWebFileLocation.url = str;
            tL_inputWebFileLocation.access_hash = tL_webDocument.access_hash;
            tLObject.d = tL_webDocument.size;
            tLObject.f22297e = tL_webDocument.mime_type;
            tLObject.f22296c = tL_webDocument.attributes;
            return tLObject;
        } else if (webDocument instanceof TLRPC.TL_webDocumentNoProxy) {
            ?? tLObject2 = new TLObject();
            TLRPC.TL_webDocumentNoProxy tL_webDocumentNoProxy = (TLRPC.TL_webDocumentNoProxy) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation2 = new TLRPC.TL_inputWebFileLocation();
            tLObject2.f22295b = tL_inputWebFileLocation2;
            String str2 = webDocument.url;
            tLObject2.f22294a = str2;
            tL_inputWebFileLocation2.url = str2;
            tL_inputWebFileLocation2.access_hash = tL_webDocumentNoProxy.access_hash;
            tLObject2.d = tL_webDocumentNoProxy.size;
            tLObject2.f22297e = tL_webDocumentNoProxy.mime_type;
            tLObject2.f22296c = tL_webDocumentNoProxy.attributes;
            tLObject2.f22298f = true;
            return tLObject2;
        } else {
            return null;
        }
    }
}
